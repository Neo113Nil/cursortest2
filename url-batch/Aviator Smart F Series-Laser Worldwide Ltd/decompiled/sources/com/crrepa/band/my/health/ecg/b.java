package com.crrepa.band.my.health.ecg;

/* loaded from: classes2.dex */
public class b {
    public static final int MEASURE_COMPLETE = 2;
    public static final int MEASURE_DATA = 1;
    public static final int MEASURE_FAIL = 3;
    private int[] ecgData;
    private int type;

    public b(int i8) {
        this.type = i8;
    }

    public int[] getEcgData() {
        return this.ecgData;
    }

    public int getType() {
        return this.type;
    }

    public b(int i8, int[] iArr) {
        this.type = i8;
        this.ecgData = iArr;
    }
}
