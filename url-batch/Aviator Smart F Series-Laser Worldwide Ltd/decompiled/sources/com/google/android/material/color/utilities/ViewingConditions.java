package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0d);
    private final double aw;

    /* renamed from: c, reason: collision with root package name */
    private final double f14809c;
    private final double fl;
    private final double flRoot;

    /* renamed from: n, reason: collision with root package name */
    private final double f14810n;
    private final double nbb;
    private final double nc;
    private final double ncb;
    private final double[] rgbD;

    /* renamed from: z, reason: collision with root package name */
    private final double f14811z;

    private ViewingConditions(double d8, double d9, double d10, double d11, double d12, double d13, double[] dArr, double d14, double d15, double d16) {
        this.f14810n = d8;
        this.aw = d9;
        this.nbb = d10;
        this.ncb = d11;
        this.f14809c = d12;
        this.nc = d13;
        this.rgbD = dArr;
        this.fl = d14;
        this.flRoot = d15;
        this.f14811z = d16;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double d8) {
        return make(ColorUtils.whitePointD65(), (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d8, 2.0d, false);
    }

    public static ViewingConditions make(double[] dArr, double d8, double d9, double d10, boolean z7) {
        double max = Math.max(0.1d, d9);
        double[][] dArr2 = Cam16.XYZ_TO_CAM16RGB;
        double d11 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d12 = dArr3[0] * d11;
        double d13 = dArr[1];
        double d14 = d12 + (dArr3[1] * d13);
        double d15 = dArr[2];
        double d16 = d14 + (dArr3[2] * d15);
        double[] dArr4 = dArr2[1];
        double d17 = (dArr4[0] * d11) + (dArr4[1] * d13) + (dArr4[2] * d15);
        double[] dArr5 = dArr2[2];
        double d18 = (d11 * dArr5[0]) + (d13 * dArr5[1]) + (d15 * dArr5[2]);
        double d19 = (d10 / 10.0d) + 0.8d;
        double lerp = d19 >= 0.9d ? MathUtils.lerp(0.59d, 0.69d, (d19 - 0.9d) * 10.0d) : MathUtils.lerp(0.525d, 0.59d, (d19 - 0.8d) * 10.0d);
        double clampDouble = MathUtils.clampDouble(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, 1.0d, z7 ? 1.0d : (1.0d - (Math.exp(((-d8) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d19);
        double[] dArr6 = {(((100.0d / d16) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d17) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d18) * clampDouble) + 1.0d) - clampDouble};
        double d20 = 5.0d * d8;
        double d21 = 1.0d / (d20 + 1.0d);
        double d22 = d21 * d21 * d21 * d21;
        double d23 = 1.0d - d22;
        double cbrt = (d22 * d8) + (0.1d * d23 * d23 * Math.cbrt(d20));
        double yFromLstar = ColorUtils.yFromLstar(max) / dArr[1];
        double sqrt = Math.sqrt(yFromLstar) + 1.48d;
        double pow = 0.725d / Math.pow(yFromLstar, 0.2d);
        double pow2 = Math.pow(((dArr6[2] * cbrt) * d18) / 100.0d, 0.42d);
        double[] dArr7 = {Math.pow(((dArr6[0] * cbrt) * d16) / 100.0d, 0.42d), Math.pow(((dArr6[1] * cbrt) * d17) / 100.0d, 0.42d), pow2};
        double d24 = dArr7[0];
        double d25 = (d24 * 400.0d) / (d24 + 27.13d);
        double d26 = dArr7[1];
        return new ViewingConditions(yFromLstar, ((d25 * 2.0d) + ((d26 * 400.0d) / (d26 + 27.13d)) + (((400.0d * pow2) / (pow2 + 27.13d)) * 0.05d)) * pow, pow, pow, lerp, d19, dArr6, cbrt, Math.pow(cbrt, 0.25d), sqrt);
    }

    public double getAw() {
        return this.aw;
    }

    double getC() {
        return this.f14809c;
    }

    double getFl() {
        return this.fl;
    }

    public double getFlRoot() {
        return this.flRoot;
    }

    public double getN() {
        return this.f14810n;
    }

    public double getNbb() {
        return this.nbb;
    }

    double getNc() {
        return this.nc;
    }

    double getNcb() {
        return this.ncb;
    }

    public double[] getRgbD() {
        return this.rgbD;
    }

    double getZ() {
        return this.f14811z;
    }
}
