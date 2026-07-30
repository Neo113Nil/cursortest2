package com.baidu.ar.rotate;

import com.crrepa.band.my.device.customkey.util.c;

/* loaded from: classes.dex */
public enum Orientation {
    UNKNOWN(-1),
    PORTRAIT(0),
    PORTRAIT_REVERSE(c.MAX_GOAL_TIME),
    LANDSCAPE(90),
    LANDSCAPE_REVERSE(-90);

    private int mDegree;

    Orientation(int i8) {
        this.mDegree = i8;
    }

    public static Orientation valueOf(int i8) {
        Orientation orientation = PORTRAIT;
        if (i8 == orientation.getDegree()) {
            return orientation;
        }
        Orientation orientation2 = PORTRAIT_REVERSE;
        if (i8 == orientation2.getDegree()) {
            return orientation2;
        }
        Orientation orientation3 = LANDSCAPE;
        if (i8 == orientation3.getDegree()) {
            return orientation3;
        }
        Orientation orientation4 = LANDSCAPE_REVERSE;
        return i8 == orientation4.getDegree() ? orientation4 : UNKNOWN;
    }

    public int getDegree() {
        return this.mDegree;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.mDegree);
    }
}
