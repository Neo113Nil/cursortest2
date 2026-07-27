package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ka, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0768ka {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f8618a;

    EnumC0768ka(int i2) {
        this.f8618a = i2;
    }

    public static EnumC0768ka a(Integer num) {
        if (num != null) {
            for (EnumC0768ka enumC0768ka : values()) {
                if (enumC0768ka.f8618a == num.intValue()) {
                    return enumC0768ka;
                }
            }
        }
        return UNKNOWN;
    }
}
