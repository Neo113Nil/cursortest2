package com.facebook.yoga;

/* loaded from: classes2.dex */
public enum YogaGridTrackType {
    AUTO(0),
    POINTS(1),
    PERCENT(2),
    FR(3),
    MINMAX(4);

    private final int mIntValue;

    YogaGridTrackType(int i) {
        this.mIntValue = i;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaGridTrackType fromInt(int i) {
        if (i == 0) {
            return AUTO;
        }
        if (i == 1) {
            return POINTS;
        }
        if (i == 2) {
            return PERCENT;
        }
        if (i == 3) {
            return FR;
        }
        if (i == 4) {
            return MINMAX;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }
}
