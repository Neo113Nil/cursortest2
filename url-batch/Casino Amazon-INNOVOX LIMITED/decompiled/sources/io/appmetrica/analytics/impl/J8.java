package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public enum J8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f903a;

    J8(int i) {
        this.f903a = i;
    }

    public static J8 a(Integer num) {
        if (num != null) {
            for (J8 j8 : values()) {
                if (j8.f903a == num.intValue()) {
                    return j8;
                }
            }
        }
        return NONE;
    }
}
