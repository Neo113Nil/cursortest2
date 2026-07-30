package com.crrepa.band.my.health.widgets.segmentedview;

/* loaded from: classes2.dex */
public enum SleepState {
    AWAKE(0),
    LIGHT(1),
    RESTFUL(2),
    REM(3);

    private int value;

    SleepState(int i8) {
        this.value = i8;
    }

    public int getValue() {
        return this.value;
    }
}
