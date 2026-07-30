package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes4.dex */
public abstract class CarouselStrategy {
    private float smallSizeMax;
    private float smallSizeMin;

    enum StrategyType {
        CONTAINED,
        UNCONTAINED
    }

    static int[] doubleCounts(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr2[i8] = iArr[i8] * 2;
        }
        return iArr2;
    }

    @FloatRange(from = i.DOUBLE_EPSILON, to = 1.0d)
    public static float getChildMaskPercentage(float f8, float f9, float f10) {
        return 1.0f - ((f8 - f10) / (f9 - f10));
    }

    public float getSmallItemSizeMax() {
        return this.smallSizeMax;
    }

    public float getSmallItemSizeMin() {
        return this.smallSizeMin;
    }

    StrategyType getStrategyType() {
        return StrategyType.CONTAINED;
    }

    void initialize(Context context) {
        float f8 = this.smallSizeMin;
        if (f8 <= 0.0f) {
            f8 = CarouselStrategyHelper.getSmallSizeMin(context);
        }
        this.smallSizeMin = f8;
        float f9 = this.smallSizeMax;
        if (f9 <= 0.0f) {
            f9 = CarouselStrategyHelper.getSmallSizeMax(context);
        }
        this.smallSizeMax = f9;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view);

    public void setSmallItemSizeMax(float f8) {
        this.smallSizeMax = f8;
    }

    public void setSmallItemSizeMin(float f8) {
        this.smallSizeMin = f8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i8) {
        return false;
    }
}
