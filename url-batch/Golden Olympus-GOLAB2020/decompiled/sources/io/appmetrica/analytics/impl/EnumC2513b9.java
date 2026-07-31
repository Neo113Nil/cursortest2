package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC2513b9 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f38715a;

    EnumC2513b9(int i4) {
        this.f38715a = i4;
    }

    public static EnumC2513b9 a(Integer num) {
        if (num != null) {
            for (EnumC2513b9 enumC2513b9 : values()) {
                if (enumC2513b9.f38715a == num.intValue()) {
                    return enumC2513b9;
                }
            }
        }
        return NONE;
    }
}
