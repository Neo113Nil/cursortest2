package com.pichillilorenzo.flutter_inappwebview_android.types;

import C4.p;

/* loaded from: classes.dex */
public enum NavigationActionPolicy {
    CANCEL(0),
    ALLOW(1);

    private final int value;

    NavigationActionPolicy(int i2) {
        this.value = i2;
    }

    public static NavigationActionPolicy fromValue(int i2) {
        for (NavigationActionPolicy navigationActionPolicy : values()) {
            if (i2 == navigationActionPolicy.value) {
                return navigationActionPolicy;
            }
        }
        throw new IllegalArgumentException(p.g(i2, "No enum constant: "));
    }

    public boolean equalsValue(int i2) {
        return this.value == i2;
    }

    public int rawValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.value);
    }
}
