package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ka, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0617ka {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f7718a;

    EnumC0617ka(int i3) {
        this.f7718a = i3;
    }

    public static EnumC0617ka a(Integer num) {
        if (num != null) {
            for (EnumC0617ka enumC0617ka : values()) {
                if (enumC0617ka.f7718a == num.intValue()) {
                    return enumC0617ka;
                }
            }
        }
        return UNKNOWN;
    }
}
