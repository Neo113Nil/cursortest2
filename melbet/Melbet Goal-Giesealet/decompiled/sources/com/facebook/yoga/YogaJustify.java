package com.facebook.yoga;

/* loaded from: classes2.dex */
public enum YogaJustify {
    AUTO(0),
    FLEX_START(1),
    CENTER(2),
    FLEX_END(3),
    SPACE_BETWEEN(4),
    SPACE_AROUND(5),
    SPACE_EVENLY(6),
    STRETCH(7),
    START(8),
    END(9);

    private final int mIntValue;

    YogaJustify(int i) {
        this.mIntValue = i;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaJustify fromInt(int i) {
        switch (i) {
            case 0:
                return AUTO;
            case 1:
                return FLEX_START;
            case 2:
                return CENTER;
            case 3:
                return FLEX_END;
            case 4:
                return SPACE_BETWEEN;
            case 5:
                return SPACE_AROUND;
            case 6:
                return SPACE_EVENLY;
            case 7:
                return STRETCH;
            case 8:
                return START;
            case 9:
                return END;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }
}
