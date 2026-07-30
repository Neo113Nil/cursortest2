package com.baidu.ar.marker;

/* loaded from: classes.dex */
public enum ReturnType {
    RETURN_LONGTITUDE_LATITUDE(0),
    RETURN_6DOF_POSE(1),
    RETURN_LONGTITUDE_LATITUDE_6DOF_POSE(2);

    private int value;

    ReturnType(int i8) {
        this.value = i8;
    }

    public int getValue() {
        return this.value;
    }
}
