package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.na, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0695na extends H4 {
    public C0695na(E4 e4) {
        super(e4);
    }

    @Override // io.appmetrica.analytics.impl.H4
    public final boolean a(W5 w5, B4 b4) {
        Bundle bundle = w5.f6826m;
        C0463eb c0463eb = bundle != null ? (C0463eb) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (c0463eb != null) {
            if (c0463eb.f7264d) {
                C0896v4 c0896v4 = b4.f5803b.f5937d.f5964a;
                Boolean bool = c0896v4.f8489n;
                Boolean bool2 = c0896v4.f8484i;
                C0876ua.f8420H.c().c(bool != null ? bool.booleanValue() : true);
                C0876ua.f8420H.h().b(bool2);
            }
        }
        this.f6061a.a(c0463eb);
        return false;
    }
}
