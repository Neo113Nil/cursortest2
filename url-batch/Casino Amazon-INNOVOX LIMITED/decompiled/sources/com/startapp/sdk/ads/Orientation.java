package com.startapp.sdk.ads;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public enum Orientation {
    PORTRAIT(1),
    LANDSCAPE(2),
    AUTO(3);

    private final int index;

    Orientation(int i) {
        this.index = i;
    }

    public static Orientation getByName(String str) {
        if (str != null) {
            try {
                return valueOf(str);
            } catch (RuntimeException unused) {
            }
        }
        return AUTO;
    }

    public int getIndex() {
        return this.index;
    }
}
