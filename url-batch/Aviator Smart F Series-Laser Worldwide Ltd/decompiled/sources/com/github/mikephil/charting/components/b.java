package com.github.mikephil.charting.components;

import android.graphics.Typeface;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes3.dex */
public abstract class b {
    protected boolean mEnabled = true;
    protected float mXOffset = 5.0f;
    protected float mYOffset = 5.0f;
    protected Typeface mTypeface = null;
    protected float mTextSize = i.convertDpToPixel(10.0f);
    protected int mTextColor = -16777216;

    public int getTextColor() {
        return this.mTextColor;
    }

    public float getTextSize() {
        return this.mTextSize;
    }

    public Typeface getTypeface() {
        return this.mTypeface;
    }

    public float getXOffset() {
        return this.mXOffset;
    }

    public float getYOffset() {
        return this.mYOffset;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void setEnabled(boolean z7) {
        this.mEnabled = z7;
    }

    public void setTextColor(int i8) {
        this.mTextColor = i8;
    }

    public void setTextSize(float f8) {
        if (f8 > 24.0f) {
            f8 = 24.0f;
        }
        if (f8 < 6.0f) {
            f8 = 6.0f;
        }
        this.mTextSize = i.convertDpToPixel(f8);
    }

    public void setTypeface(Typeface typeface) {
        this.mTypeface = typeface;
    }

    public void setXOffset(float f8) {
        this.mXOffset = i.convertDpToPixel(f8);
    }

    public void setYOffset(float f8) {
        this.mYOffset = i.convertDpToPixel(f8);
    }
}
