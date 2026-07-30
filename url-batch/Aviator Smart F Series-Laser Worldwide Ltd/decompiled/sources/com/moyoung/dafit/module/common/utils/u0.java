package com.moyoung.dafit.module.common.utils;

import com.realsil.sdk.dfu.utils.DfuAdapter;

/* loaded from: classes4.dex */
public class u0 {
    public static final int INCH_SYSTEM = 1;
    public static final int METRIC_SYSTEM = 0;
    public static final double M_2_KM_UNIT = 1000.0d;
    public static final double M_2_MILE_UNIT = 1609.0d;

    public static int cm2Inches(int i8) {
        return (int) (i8 / 2.54d);
    }

    public static int inch2Cms(int i8) {
        return (int) Math.ceil(i8 / 0.3937008d);
    }

    public static int kg2Lbs(int i8) {
        return (int) Math.ceil(i8 / 0.4535924d);
    }

    public static float kg2LbsFloat(float f8) {
        return n.getDecimalFormat(f8 * 2.2046f, 1);
    }

    public static int lb2Kgs(int i8) {
        return (int) Math.ceil(i8 / 2.2046226d);
    }

    public static float lb2KgsFloat(float f8) {
        return n.getDecimalFormat(f8 * 0.4536f, 1);
    }

    public static double m2Kms(int i8) {
        return i8 / 1000.0d;
    }

    public static double m2Miles(int i8) {
        int m2Yds = (int) m2Yds(i8);
        if (m2Yds < 1760) {
            return ((m2Yds / DfuAdapter.ConnectState.REQUEST_MTU) / 10.0d) + com.github.mikephil.charting.utils.i.DOUBLE_EPSILON + (((m2Yds % DfuAdapter.ConnectState.REQUEST_MTU) / 18) / 100.0d);
        }
        int i9 = (int) ((m2Yds / 1760.0d) * 10.0d);
        return (i9 / 10) + com.github.mikephil.charting.utils.i.DOUBLE_EPSILON + ((i9 % 10) / 10.0d);
    }

    public static double m2Yds(int i8) {
        return (i8 * 109) / 100.0d;
    }

    public static int ml2Ozs(int i8) {
        return (int) Math.round((i8 * 1.0f) / 28.4d);
    }

    public static int ml2OzsAdd(int i8) {
        return Math.round((i8 * 1.0f) / 25.0f);
    }

    public static int oz2Mls(int i8) {
        return (int) Math.round(i8 * 28.4d);
    }

    public static int oz2MlsAdd(int i8) {
        return Math.round(i8 * 25);
    }
}
