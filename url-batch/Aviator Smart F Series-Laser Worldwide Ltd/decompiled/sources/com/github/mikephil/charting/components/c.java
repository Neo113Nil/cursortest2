package com.github.mikephil.charting.components;

import android.graphics.Paint;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes3.dex */
public class c extends b {
    private com.github.mikephil.charting.utils.e mPosition;
    private String text = "Description Label";
    private Paint.Align mTextAlign = Paint.Align.RIGHT;

    public c() {
        this.mTextSize = i.convertDpToPixel(8.0f);
    }

    public com.github.mikephil.charting.utils.e getPosition() {
        return this.mPosition;
    }

    public String getText() {
        return this.text;
    }

    public Paint.Align getTextAlign() {
        return this.mTextAlign;
    }

    public void setPosition(float f8, float f9) {
        com.github.mikephil.charting.utils.e eVar = this.mPosition;
        if (eVar == null) {
            this.mPosition = com.github.mikephil.charting.utils.e.getInstance(f8, f9);
        } else {
            eVar.f14114x = f8;
            eVar.f14115y = f9;
        }
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTextAlign(Paint.Align align) {
        this.mTextAlign = align;
    }
}
