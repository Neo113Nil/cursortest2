package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ya, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3114ya {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f40274a;

    EnumC3114ya(int i4) {
        this.f40274a = i4;
    }

    public static EnumC3114ya a(Integer num) {
        if (num != null) {
            for (EnumC3114ya enumC3114ya : values()) {
                if (enumC3114ya.f40274a == num.intValue()) {
                    return enumC3114ya;
                }
            }
        }
        return UNKNOWN;
    }
}
