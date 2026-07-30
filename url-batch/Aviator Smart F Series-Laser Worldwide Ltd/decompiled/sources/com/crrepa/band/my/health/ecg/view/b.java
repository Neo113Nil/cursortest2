package com.crrepa.band.my.health.ecg.view;

import com.crrepa.ble.conn.type.CRPEcgMeasureType;

/* loaded from: classes2.dex */
public class b {
    protected static final int DEFAULT_PER_GRID = 5;
    private static final int TI_PER_GRID = 15;
    private static final int TYHX_UV_PER_GRID = 1500;
    protected static final float VERTICAL_GIRD_COUNT = 30.0f;

    private b() {
    }

    public static int getDefaultPerGridUvValue() {
        return com.crrepa.band.my.ble.band.utils.a.getInstance().getEcgType() == CRPEcgMeasureType.TI ? 15 : 1500;
    }

    public static float getGirdWidth(int i8) {
        return i8 / 30.0f;
    }

    public static int getPerGridUvValue(Integer num) {
        if (num == null) {
            return 1500;
        }
        return num.intValue();
    }

    public static float getTimeOffset(int i8, int i9) {
        return getGirdWidth(i8) / i9;
    }

    public static float getVoltageOffset(int i8, int i9) {
        return getGirdWidth(i8) / i9;
    }
}
