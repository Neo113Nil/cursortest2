package com.pichillilorenzo.flutter_inappwebview_android.types;

import C4.p;

/* loaded from: classes.dex */
public enum PreferredContentModeOptionType {
    RECOMMENDED(0),
    MOBILE(1),
    DESKTOP(2);

    private final int value;

    PreferredContentModeOptionType(int i2) {
        this.value = i2;
    }

    public static PreferredContentModeOptionType fromValue(int i2) {
        for (PreferredContentModeOptionType preferredContentModeOptionType : values()) {
            if (i2 == preferredContentModeOptionType.toValue()) {
                return preferredContentModeOptionType;
            }
        }
        throw new IllegalArgumentException(p.g(i2, "No enum constant: "));
    }

    public boolean equalsValue(int i2) {
        return this.value == i2;
    }

    public int toValue() {
        return this.value;
    }
}
