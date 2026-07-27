package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public enum N8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f7176a;

    N8(int i2) {
        this.f7176a = i2;
    }

    public static N8 a(Integer num) {
        if (num != null) {
            for (N8 n8 : values()) {
                if (n8.f7176a == num.intValue()) {
                    return n8;
                }
            }
        }
        return NONE;
    }
}
