package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes3.dex */
public class CandleEntry extends Entry {
    private float mClose;
    private float mOpen;
    private float mShadowHigh;
    private float mShadowLow;

    public CandleEntry(float f8, float f9, float f10, float f11, float f12) {
        super(f8, (f9 + f10) / 2.0f);
        this.mShadowHigh = f9;
        this.mShadowLow = f10;
        this.mOpen = f11;
        this.mClose = f12;
    }

    public float getBodyRange() {
        return Math.abs(this.mOpen - this.mClose);
    }

    public float getClose() {
        return this.mClose;
    }

    public float getHigh() {
        return this.mShadowHigh;
    }

    public float getLow() {
        return this.mShadowLow;
    }

    public float getOpen() {
        return this.mOpen;
    }

    public float getShadowRange() {
        return Math.abs(this.mShadowHigh - this.mShadowLow);
    }

    @Override // com.github.mikephil.charting.data.f
    public float getY() {
        return super.getY();
    }

    public void setClose(float f8) {
        this.mClose = f8;
    }

    public void setHigh(float f8) {
        this.mShadowHigh = f8;
    }

    public void setLow(float f8) {
        this.mShadowLow = f8;
    }

    public void setOpen(float f8) {
        this.mOpen = f8;
    }

    public CandleEntry(float f8, float f9, float f10, float f11, float f12, Object obj) {
        super(f8, (f9 + f10) / 2.0f, obj);
        this.mShadowHigh = f9;
        this.mShadowLow = f10;
        this.mOpen = f11;
        this.mClose = f12;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public CandleEntry copy() {
        return new CandleEntry(getX(), this.mShadowHigh, this.mShadowLow, this.mOpen, this.mClose, getData());
    }

    public CandleEntry(float f8, float f9, float f10, float f11, float f12, Drawable drawable) {
        super(f8, (f9 + f10) / 2.0f, drawable);
        this.mShadowHigh = f9;
        this.mShadowLow = f10;
        this.mOpen = f11;
        this.mClose = f12;
    }

    public CandleEntry(float f8, float f9, float f10, float f11, float f12, Drawable drawable, Object obj) {
        super(f8, (f9 + f10) / 2.0f, drawable, obj);
        this.mShadowHigh = f9;
        this.mShadowLow = f10;
        this.mOpen = f11;
        this.mClose = f12;
    }
}
