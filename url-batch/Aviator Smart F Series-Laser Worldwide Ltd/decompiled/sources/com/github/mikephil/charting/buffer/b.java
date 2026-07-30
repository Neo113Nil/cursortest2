package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;

/* loaded from: classes3.dex */
public class b extends a {
    protected float mBarWidth;
    protected boolean mContainsStacks;
    protected int mDataSetCount;
    protected int mDataSetIndex;
    protected boolean mInverted;

    public b(int i8, int i9, boolean z7) {
        super(i8);
        this.mDataSetIndex = 0;
        this.mInverted = false;
        this.mBarWidth = 1.0f;
        this.mDataSetCount = i9;
        this.mContainsStacks = z7;
    }

    protected void addBar(float f8, float f9, float f10, float f11) {
        float[] fArr = this.buffer;
        int i8 = this.index;
        fArr[i8] = f8;
        fArr[i8 + 1] = f9;
        fArr[i8 + 2] = f10;
        this.index = i8 + 4;
        fArr[i8 + 3] = f11;
    }

    public void setBarWidth(float f8) {
        this.mBarWidth = f8;
    }

    public void setDataSet(int i8) {
        this.mDataSetIndex = i8;
    }

    public void setInverted(boolean z7) {
        this.mInverted = z7;
    }

    @Override // com.github.mikephil.charting.buffer.a
    public void feed(v4.a aVar) {
        float f8;
        float abs;
        float abs2;
        float f9;
        float entryCount = aVar.getEntryCount() * this.phaseX;
        float f10 = this.mBarWidth / 2.0f;
        for (int i8 = 0; i8 < entryCount; i8++) {
            BarEntry barEntry = (BarEntry) aVar.getEntryForIndex(i8);
            if (barEntry != null) {
                float x7 = barEntry.getX();
                float y7 = barEntry.getY();
                float[] yVals = barEntry.getYVals();
                if (!this.mContainsStacks || yVals == null) {
                    float f11 = x7 - f10;
                    float f12 = x7 + f10;
                    if (this.mInverted) {
                        f8 = y7 >= 0.0f ? y7 : 0.0f;
                        if (y7 > 0.0f) {
                            y7 = 0.0f;
                        }
                    } else {
                        float f13 = y7 >= 0.0f ? y7 : 0.0f;
                        if (y7 > 0.0f) {
                            y7 = 0.0f;
                        }
                        float f14 = y7;
                        y7 = f13;
                        f8 = f14;
                    }
                    if (y7 > 0.0f) {
                        y7 *= this.phaseY;
                    } else {
                        f8 *= this.phaseY;
                    }
                    addBar(f11, y7, f12, f8);
                } else {
                    float f15 = -barEntry.getNegativeSum();
                    int i9 = 0;
                    float f16 = 0.0f;
                    while (i9 < yVals.length) {
                        float f17 = yVals[i9];
                        if (f17 == 0.0f && (f16 == 0.0f || f15 == 0.0f)) {
                            abs = f17;
                            abs2 = f15;
                            f15 = abs;
                        } else if (f17 >= 0.0f) {
                            abs = f17 + f16;
                            abs2 = f15;
                            f15 = f16;
                            f16 = abs;
                        } else {
                            abs = Math.abs(f17) + f15;
                            abs2 = Math.abs(f17) + f15;
                        }
                        float f18 = x7 - f10;
                        float f19 = x7 + f10;
                        if (this.mInverted) {
                            f9 = f15 >= abs ? f15 : abs;
                            if (f15 > abs) {
                                f15 = abs;
                            }
                        } else {
                            float f20 = f15 >= abs ? f15 : abs;
                            if (f15 > abs) {
                                f15 = abs;
                            }
                            float f21 = f15;
                            f15 = f20;
                            f9 = f21;
                        }
                        float f22 = this.phaseY;
                        addBar(f18, f15 * f22, f19, f9 * f22);
                        i9++;
                        f15 = abs2;
                    }
                }
            }
        }
        reset();
    }
}
