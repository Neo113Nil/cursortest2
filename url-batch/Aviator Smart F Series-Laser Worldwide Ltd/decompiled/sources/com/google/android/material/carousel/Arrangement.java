package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class Arrangement {
    private static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    final float cost;
    final int largeCount;
    float largeSize;
    int mediumCount;
    float mediumSize;
    final int priority;
    int smallCount;
    float smallSize;

    public Arrangement(int i8, float f8, float f9, float f10, int i9, float f11, int i10, float f12, int i11, float f13) {
        this.priority = i8;
        this.smallSize = MathUtils.clamp(f8, f9, f10);
        this.smallCount = i9;
        this.mediumSize = f11;
        this.mediumCount = i10;
        this.largeSize = f12;
        this.largeCount = i11;
        fit(f13, f9, f10, f12);
        this.cost = cost(f12);
    }

    private float calculateLargeSize(float f8, int i8, float f9, int i9, int i10) {
        if (i8 <= 0) {
            f9 = 0.0f;
        }
        float f10 = i9 / 2.0f;
        return (f8 - ((i8 + f10) * f9)) / (i10 + f10);
    }

    private float cost(float f8) {
        if (isValid()) {
            return Math.abs(f8 - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    @Nullable
    public static Arrangement findLowestCostArrangement(float f8, float f9, float f10, float f11, @NonNull int[] iArr, float f12, @NonNull int[] iArr2, float f13, @NonNull int[] iArr3) {
        Arrangement arrangement = null;
        int i8 = 1;
        for (int i9 : iArr3) {
            int length = iArr2.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = iArr2[i10];
                int length2 = iArr.length;
                int i12 = 0;
                while (i12 < length2) {
                    int i13 = i12;
                    int i14 = length2;
                    int i15 = i10;
                    int i16 = length;
                    Arrangement arrangement2 = new Arrangement(i8, f9, f10, f11, iArr[i12], f12, i11, f13, i9, f8);
                    if (arrangement == null || arrangement2.cost < arrangement.cost) {
                        if (arrangement2.cost == 0.0f) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    i8++;
                    i12 = i13 + 1;
                    length2 = i14;
                    i10 = i15;
                    length = i16;
                }
                i10++;
            }
        }
        return arrangement;
    }

    private void fit(float f8, float f9, float f10, float f11) {
        float space = f8 - getSpace();
        int i8 = this.smallCount;
        if (i8 > 0 && space > 0.0f) {
            float f12 = this.smallSize;
            this.smallSize = f12 + Math.min(space / i8, f10 - f12);
        } else if (i8 > 0 && space < 0.0f) {
            float f13 = this.smallSize;
            this.smallSize = f13 + Math.max(space / i8, f9 - f13);
        }
        int i9 = this.smallCount;
        float f14 = i9 > 0 ? this.smallSize : 0.0f;
        this.smallSize = f14;
        float calculateLargeSize = calculateLargeSize(f8, i9, f14, this.mediumCount, this.largeCount);
        this.largeSize = calculateLargeSize;
        float f15 = (this.smallSize + calculateLargeSize) / 2.0f;
        this.mediumSize = f15;
        int i10 = this.mediumCount;
        if (i10 <= 0 || calculateLargeSize == f11) {
            return;
        }
        float f16 = (f11 - calculateLargeSize) * this.largeCount;
        float min = Math.min(Math.abs(f16), f15 * 0.1f * i10);
        if (f16 > 0.0f) {
            this.mediumSize -= min / this.mediumCount;
            this.largeSize += min / this.largeCount;
        } else {
            this.mediumSize += min / this.mediumCount;
            this.largeSize -= min / this.largeCount;
        }
    }

    private float getSpace() {
        return (this.largeSize * this.largeCount) + (this.mediumSize * this.mediumCount) + (this.smallSize * this.smallCount);
    }

    private boolean isValid() {
        int i8 = this.largeCount;
        if (i8 <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i8 <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f8 = this.largeSize;
        float f9 = this.mediumSize;
        return f8 > f9 && f9 > this.smallSize;
    }

    int getItemCount() {
        return this.smallCount + this.mediumCount + this.largeCount;
    }

    @NonNull
    public String toString() {
        return "Arrangement [priority=" + this.priority + ", smallCount=" + this.smallCount + ", smallSize=" + this.smallSize + ", mediumCount=" + this.mediumCount + ", mediumSize=" + this.mediumSize + ", largeCount=" + this.largeCount + ", largeSize=" + this.largeSize + ", cost=" + this.cost + "]";
    }
}
