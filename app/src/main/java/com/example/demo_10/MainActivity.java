package com.example.demo_10;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText display;
    String opernd = "";
    double number = 0.0;
    String txt;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.buttonEquals);
    }

    private void calculate() {
        txt = display.getText().toString();

        if (txt.isEmpty())
        {
            return;
        }

        if (opernd.equals("plus"))
        {
            number = number + Double.parseDouble(txt);
        }
        else if (opernd.equals("minus"))
        {
            number = number - Double.parseDouble(txt);
        }
        else if (opernd.equals("mult"))
        {
            number = number * Double.parseDouble(txt);
        }
        else if (opernd.equals("div"))
        {
            if (Double.parseDouble(txt) != 0.0)
            {
                number = number / Double.parseDouble(txt);
            }
        }

        else
        {
            number = Double.parseDouble(txt);
        }



    }


}

