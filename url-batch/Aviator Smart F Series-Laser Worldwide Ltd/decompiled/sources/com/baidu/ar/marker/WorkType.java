package com.baidu.ar.marker;

/* loaded from: classes.dex */
public enum WorkType {
    WORK_LOCALIZATION(2),
    WORK_NAVIGATION(3);

    private int value;

    WorkType(int i8) {
        this.value = i8;
    }

    public int getValue() {
        return this.value;
    }
}
