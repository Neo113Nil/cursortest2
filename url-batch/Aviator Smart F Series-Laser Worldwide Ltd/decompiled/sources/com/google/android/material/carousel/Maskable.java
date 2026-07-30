package com.google.android.material.carousel;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes4.dex */
interface Maskable {
    @NonNull
    RectF getMaskRectF();

    @FloatRange(from = i.DOUBLE_EPSILON, to = 1.0d)
    @Deprecated
    float getMaskXPercentage();

    void setMaskRectF(@NonNull RectF rectF);

    @Deprecated
    void setMaskXPercentage(@FloatRange(from = 0.0d, to = 1.0d) float f8);

    void setOnMaskChangedListener(@Nullable OnMaskChangedListener onMaskChangedListener);
}
