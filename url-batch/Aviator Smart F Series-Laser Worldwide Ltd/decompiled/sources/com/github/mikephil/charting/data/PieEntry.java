package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.util.Log;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes3.dex */
public class PieEntry extends Entry {
    private String label;

    public PieEntry(float f8) {
        super(0.0f, f8);
    }

    public String getLabel() {
        return this.label;
    }

    public float getValue() {
        return getY();
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public float getX() {
        Log.i("DEPRECATED", "Pie entries do not have x values");
        return super.getX();
    }

    public void setLabel(String str) {
        this.label = str;
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public void setX(float f8) {
        super.setX(f8);
        Log.i("DEPRECATED", "Pie entries do not have x values");
    }

    public PieEntry(float f8, Object obj) {
        super(0.0f, f8, obj);
    }

    @Override // com.github.mikephil.charting.data.Entry
    public PieEntry copy() {
        return new PieEntry(getY(), this.label, getData());
    }

    public PieEntry(float f8, Drawable drawable) {
        super(0.0f, f8, drawable);
    }

    public PieEntry(float f8, Drawable drawable, Object obj) {
        super(0.0f, f8, drawable, obj);
    }

    public PieEntry(float f8, String str) {
        super(0.0f, f8);
        this.label = str;
    }

    public PieEntry(float f8, String str, Object obj) {
        super(0.0f, f8, obj);
        this.label = str;
    }

    public PieEntry(float f8, String str, Drawable drawable) {
        super(0.0f, f8, drawable);
        this.label = str;
    }

    public PieEntry(float f8, String str, Drawable drawable, Object obj) {
        super(0.0f, f8, drawable, obj);
        this.label = str;
    }
}
