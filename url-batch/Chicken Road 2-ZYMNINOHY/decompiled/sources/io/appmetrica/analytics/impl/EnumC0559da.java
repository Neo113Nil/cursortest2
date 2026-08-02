package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.da, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0559da {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f11678a;

    EnumC0559da(int i4) {
        this.f11678a = i4;
    }

    public static EnumC0559da a(Integer num) {
        if (num != null) {
            for (EnumC0559da enumC0559da : values()) {
                if (enumC0559da.f11678a == num.intValue()) {
                    return enumC0559da;
                }
            }
        }
        return UNKNOWN;
    }
}
