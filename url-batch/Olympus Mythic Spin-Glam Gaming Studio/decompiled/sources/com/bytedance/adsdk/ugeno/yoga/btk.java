package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes5.dex */
public enum btk {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);

    private final int btk;

    btk(int i) {
        this.btk = i;
    }

    public int zmn() {
        return this.btk;
    }

    public static btk zmn(int i) {
        if (i == 0) {
            return COLUMN;
        }
        if (i == 1) {
            return COLUMN_REVERSE;
        }
        if (i == 2) {
            return ROW;
        }
        if (i == 3) {
            return ROW_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }

    public static btk zmn(String str) {
        str.hashCode();
        switch (str) {
            case "column_reverse":
                return COLUMN_REVERSE;
            case "column":
                return COLUMN;
            case "row_reverse":
                return ROW_REVERSE;
            case "row":
                return ROW;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
