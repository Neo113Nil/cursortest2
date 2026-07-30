package com.baidu.ar.bean;

import com.crrepa.band.my.device.customkey.util.c;

/* loaded from: classes.dex */
public enum RotationType {
    ROTATE_0(0),
    ROTATE_90(90),
    ROTATE_180(c.MAX_GOAL_TIME),
    ROTATE_270(270);

    private final int mDegree;

    RotationType(int i8) {
        this.mDegree = i8;
    }

    public int getDegree() {
        return this.mDegree;
    }
}
