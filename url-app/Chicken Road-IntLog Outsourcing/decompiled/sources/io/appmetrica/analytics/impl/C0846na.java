package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.na, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0846na extends H4 {
    public C0846na(E4 e42) {
        super(e42);
    }

    @Override // io.appmetrica.analytics.impl.H4
    public final boolean a(W5 w5, B4 b42) {
        Bundle bundle = w5.f7660m;
        C0614eb c0614eb = bundle != null ? (C0614eb) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (c0614eb != null) {
            if (c0614eb.f8129d) {
                C1047v4 c1047v4 = b42.f6583b.f6725d.f6753a;
                Boolean bool = c1047v4.f9439n;
                Boolean bool2 = c1047v4.f9434i;
                C1027ua.f9366H.c().c(bool != null ? bool.booleanValue() : true);
                C1027ua.f9366H.h().b(bool2);
            }
        }
        this.f6854a.a(c0614eb);
        return false;
    }
}
