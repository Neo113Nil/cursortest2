package com.github.mikephil.charting.data;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class l extends m implements v4.g {
    private boolean mDrawFilled;
    private int mFillAlpha;
    private int mFillColor;
    protected Drawable mFillDrawable;
    private float mLineWidth;

    public l(List<Entry> list, String str) {
        super(list, str);
        this.mFillColor = Color.rgb(140, 234, 255);
        this.mFillAlpha = 85;
        this.mLineWidth = 2.5f;
        this.mDrawFilled = false;
    }

    protected void copy(l lVar) {
        super.copy((m) lVar);
        lVar.mDrawFilled = this.mDrawFilled;
        lVar.mFillAlpha = this.mFillAlpha;
        lVar.mFillColor = this.mFillColor;
        lVar.mFillDrawable = this.mFillDrawable;
        lVar.mLineWidth = this.mLineWidth;
    }

    @Override // v4.g
    public int getFillAlpha() {
        return this.mFillAlpha;
    }

    @Override // v4.g
    public int getFillColor() {
        return this.mFillColor;
    }

    @Override // v4.g
    public Drawable getFillDrawable() {
        return this.mFillDrawable;
    }

    @Override // v4.g
    public float getLineWidth() {
        return this.mLineWidth;
    }

    @Override // v4.g
    public boolean isDrawFilledEnabled() {
        return this.mDrawFilled;
    }

    @Override // v4.g
    public void setDrawFilled(boolean z7) {
        this.mDrawFilled = z7;
    }

    public void setFillAlpha(int i8) {
        this.mFillAlpha = i8;
    }

    public void setFillColor(int i8) {
        this.mFillColor = i8;
        this.mFillDrawable = null;
    }

    @TargetApi(18)
    public void setFillDrawable(Drawable drawable) {
        this.mFillDrawable = drawable;
    }

    public void setLineWidth(float f8) {
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 > 10.0f) {
            f8 = 10.0f;
        }
        this.mLineWidth = com.github.mikephil.charting.utils.i.convertDpToPixel(f8);
    }
}
