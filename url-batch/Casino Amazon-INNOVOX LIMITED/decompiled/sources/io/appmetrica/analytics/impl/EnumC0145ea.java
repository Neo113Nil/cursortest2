package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ea, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC0145ea {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f1235a;

    EnumC0145ea(int i) {
        this.f1235a = i;
    }

    public static EnumC0145ea a(Integer num) {
        if (num != null) {
            for (EnumC0145ea enumC0145ea : values()) {
                if (enumC0145ea.f1235a == num.intValue()) {
                    return enumC0145ea;
                }
            }
        }
        return UNKNOWN;
    }
}
