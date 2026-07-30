package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes3.dex */
public class BarEntry extends Entry {
    private float mNegativeSum;
    private float mPositiveSum;
    private com.github.mikephil.charting.highlight.j[] mRanges;
    private float[] mYVals;

    public BarEntry(float f8, float f9) {
        super(f8, f9);
    }

    private void calcPosNegSum() {
        float[] fArr = this.mYVals;
        if (fArr == null) {
            this.mNegativeSum = 0.0f;
            this.mPositiveSum = 0.0f;
            return;
        }
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (float f10 : fArr) {
            if (f10 <= 0.0f) {
                f8 += Math.abs(f10);
            } else {
                f9 += f10;
            }
        }
        this.mNegativeSum = f8;
        this.mPositiveSum = f9;
    }

    private static float calcSum(float[] fArr) {
        float f8 = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (float f9 : fArr) {
            f8 += f9;
        }
        return f8;
    }

    protected void calcRanges() {
        float[] yVals = getYVals();
        if (yVals == null || yVals.length == 0) {
            return;
        }
        this.mRanges = new com.github.mikephil.charting.highlight.j[yVals.length];
        float f8 = -getNegativeSum();
        int i8 = 0;
        float f9 = 0.0f;
        while (true) {
            com.github.mikephil.charting.highlight.j[] jVarArr = this.mRanges;
            if (i8 >= jVarArr.length) {
                return;
            }
            float f10 = yVals[i8];
            if (f10 < 0.0f) {
                float f11 = f8 - f10;
                jVarArr[i8] = new com.github.mikephil.charting.highlight.j(f8, f11);
                f8 = f11;
            } else {
                float f12 = f10 + f9;
                jVarArr[i8] = new com.github.mikephil.charting.highlight.j(f9, f12);
                f9 = f12;
            }
            i8++;
        }
    }

    @Deprecated
    public float getBelowSum(int i8) {
        return getSumBelow(i8);
    }

    public float getNegativeSum() {
        return this.mNegativeSum;
    }

    public float getPositiveSum() {
        return this.mPositiveSum;
    }

    public com.github.mikephil.charting.highlight.j[] getRanges() {
        return this.mRanges;
    }

    public float getSumBelow(int i8) {
        float[] fArr = this.mYVals;
        float f8 = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (int length = fArr.length - 1; length > i8 && length >= 0; length--) {
            f8 += this.mYVals[length];
        }
        return f8;
    }

    @Override // com.github.mikephil.charting.data.f
    public float getY() {
        return super.getY();
    }

    public float[] getYVals() {
        return this.mYVals;
    }

    public boolean isStacked() {
        return this.mYVals != null;
    }

    public void setVals(float[] fArr) {
        setY(calcSum(fArr));
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f8, float f9, Object obj) {
        super(f8, f9, obj);
    }

    @Override // com.github.mikephil.charting.data.Entry
    public BarEntry copy() {
        BarEntry barEntry = new BarEntry(getX(), getY(), getData());
        barEntry.setVals(this.mYVals);
        return barEntry;
    }

    public BarEntry(float f8, float f9, Drawable drawable) {
        super(f8, f9, drawable);
    }

    public BarEntry(float f8, float f9, Drawable drawable, Object obj) {
        super(f8, f9, drawable, obj);
    }

    public BarEntry(float f8, float[] fArr) {
        super(f8, calcSum(fArr));
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f8, float[] fArr, Object obj) {
        super(f8, calcSum(fArr), obj);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f8, float[] fArr, Drawable drawable) {
        super(f8, calcSum(fArr), drawable);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f8, float[] fArr, Drawable drawable, Object obj) {
        super(f8, calcSum(fArr), drawable, obj);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }
}
