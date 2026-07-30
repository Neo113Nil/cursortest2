package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;

/* loaded from: classes3.dex */
public class c extends b {
    public c(int i8, int i9, boolean z7) {
        super(i8, i9, z7);
    }

    @Override // com.github.mikephil.charting.buffer.b, com.github.mikephil.charting.buffer.a
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
                    addBar(f8, f12, y7, f11);
                } else {
                    float f15 = -barEntry.getNegativeSum();
                    int i9 = 0;
                    float f16 = 0.0f;
                    while (i9 < yVals.length) {
                        float f17 = yVals[i9];
                        if (f17 >= 0.0f) {
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
                        addBar(f9 * f22, f19, f15 * f22, f18);
                        i9++;
                        f15 = abs2;
                    }
                }
            }
        }
        reset();
    }
}
