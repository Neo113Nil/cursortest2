package com.realsil.sdk.core.utility;

import com.github.mikephil.charting.utils.i;

/* loaded from: classes4.dex */
public final class DoubleConverter {
    public static int double2FixPoint(double d8, int i8) {
        double pow = d8 * Math.pow(2.0d, i8);
        return (int) (d8 >= i.DOUBLE_EPSILON ? pow + 0.5d : pow - 0.5d);
    }

    public static double fixPoint2Double(double d8, int i8) {
        return Math.pow(2.0d, -i8) * d8;
    }
}
