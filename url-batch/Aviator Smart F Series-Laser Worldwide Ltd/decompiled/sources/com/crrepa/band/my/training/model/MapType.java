package com.crrepa.band.my.training.model;

/* loaded from: classes3.dex */
public enum MapType {
    AMAP(0),
    GOOGLE(1);

    private int value;

    MapType(int i8) {
        this.value = i8;
    }

    public static MapType getInstance(int i8) {
        if (i8 == 0) {
            return AMAP;
        }
        if (i8 != 1) {
            return null;
        }
        return GOOGLE;
    }

    public int getValue() {
        return this.value;
    }
}
