package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes9.dex */
public enum mw {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    private final int fb;

    mw(int i) {
        this.fb = i;
    }

    public int zmn() {
        return this.fb;
    }

    public static mw zmn(int i) {
        if (i == 0) {
            return STATIC;
        }
        if (i == 1) {
            return RELATIVE;
        }
        if (i == 2) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }

    public static mw zmn(String str) {
        str.hashCode();
        switch (str) {
            case "static":
                return STATIC;
            case "relative":
                return RELATIVE;
            case "absolute":
                return ABSOLUTE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
