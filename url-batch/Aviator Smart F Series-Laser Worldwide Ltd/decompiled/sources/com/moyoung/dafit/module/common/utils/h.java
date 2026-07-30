package com.moyoung.dafit.module.common.utils;

import com.baidu.ar.base.MsgField;

/* loaded from: classes4.dex */
public class h {
    public static final int MAX_HEART_RATE_VALUE = 210;
    private static final float STEP_2_TIME = 0.008f;

    public static float getActiveTime(int i8, Integer num) {
        return (num == null || num.intValue() == 0) ? i8 * STEP_2_TIME : (int) Math.ceil(num.intValue() / 60.0d);
    }

    public static float getBmi(float f8, float f9) {
        if (f8 <= 0.0f || f9 <= 0.0f) {
            return 0.0f;
        }
        return f9 / (f8 * f8);
    }

    public static int getGoalSteps(float f8) {
        double d8 = f8;
        if (d8 < 18.5d) {
            return 8000;
        }
        if (d8 < 23.9d) {
            return MsgField.MSG_STAT_FIRST_LOAD_START_FILE_MANAGE;
        }
        if (d8 < 26.9d) {
            return 10000;
        }
        return d8 < 29.9d ? 11000 : 12000;
    }

    public static float[] getHeartRateDegree(int i8, float f8, boolean z7) {
        int round = (int) (210 - Math.round((Math.min(i8, 99) / 2.0d) - (f8 * 0.11d)));
        if (!z7) {
            round -= 4;
        }
        double d8 = round;
        float f9 = round;
        return new float[]{(int) Math.round(0.6d * d8), (int) Math.round(d8 * 0.7d), Math.round(0.8f * f9), Math.round(f9 * 0.9f), 210.0f};
    }
}
