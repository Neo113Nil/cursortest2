package com.facebook.yoga;

/* loaded from: classes2.dex */
public enum YogaExperimentalFeature {
    WEB_FLEX_BASIS(0),
    FIX_FLEX_BASIS_FIT_CONTENT(1);

    private final int mIntValue;

    YogaExperimentalFeature(int i) {
        this.mIntValue = i;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaExperimentalFeature fromInt(int i) {
        if (i == 0) {
            return WEB_FLEX_BASIS;
        }
        if (i == 1) {
            return FIX_FLEX_BASIS_FIT_CONTENT;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }
}
