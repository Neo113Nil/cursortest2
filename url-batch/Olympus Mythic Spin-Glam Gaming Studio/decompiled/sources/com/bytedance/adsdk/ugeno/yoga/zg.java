package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes12.dex */
public enum zg {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int fb;

    zg(int i) {
        this.fb = i;
    }

    public static zg zmn(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }
}
