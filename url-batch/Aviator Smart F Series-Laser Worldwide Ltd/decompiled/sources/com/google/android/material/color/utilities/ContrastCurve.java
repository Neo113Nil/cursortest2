package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class ContrastCurve {
    private final double high;
    private final double low;
    private final double medium;
    private final double normal;

    public ContrastCurve(double d8, double d9, double d10, double d11) {
        this.low = d8;
        this.normal = d9;
        this.medium = d10;
        this.high = d11;
    }

    public double get(double d8) {
        return d8 <= -1.0d ? this.low : d8 < com.github.mikephil.charting.utils.i.DOUBLE_EPSILON ? MathUtils.lerp(this.low, this.normal, (d8 - (-1.0d)) / 1.0d) : d8 < 0.5d ? MathUtils.lerp(this.normal, this.medium, (d8 - com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) / 0.5d) : d8 < 1.0d ? MathUtils.lerp(this.medium, this.high, (d8 - 0.5d) / 0.5d) : this.high;
    }
}
