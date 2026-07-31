package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes10.dex */
public enum rt {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    private final int fb;

    rt(int i) {
        this.fb = i;
    }

    public int zmn() {
        return this.fb;
    }

    public static rt zmn(int i) {
        if (i == 0) {
            return NO_WRAP;
        }
        if (i == 1) {
            return WRAP;
        }
        if (i == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }

    public static rt zmn(String str) {
        str.hashCode();
        switch (str) {
            case "nowrap":
                return NO_WRAP;
            case "wrap":
                return WRAP;
            case "wrap_reverse":
                return WRAP_REVERSE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
