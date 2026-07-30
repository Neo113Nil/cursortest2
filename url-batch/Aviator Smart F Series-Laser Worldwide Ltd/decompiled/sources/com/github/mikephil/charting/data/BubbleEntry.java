package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes3.dex */
public class BubbleEntry extends Entry {
    private float mSize;

    public BubbleEntry(float f8, float f9, float f10) {
        super(f8, f9);
        this.mSize = f10;
    }

    public float getSize() {
        return this.mSize;
    }

    public void setSize(float f8) {
        this.mSize = f8;
    }

    public BubbleEntry(float f8, float f9, float f10, Object obj) {
        super(f8, f9, obj);
        this.mSize = f10;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public BubbleEntry copy() {
        return new BubbleEntry(getX(), getY(), this.mSize, getData());
    }

    public BubbleEntry(float f8, float f9, float f10, Drawable drawable) {
        super(f8, f9, drawable);
        this.mSize = f10;
    }

    public BubbleEntry(float f8, float f9, float f10, Drawable drawable, Object obj) {
        super(f8, f9, drawable, obj);
        this.mSize = f10;
    }
}
