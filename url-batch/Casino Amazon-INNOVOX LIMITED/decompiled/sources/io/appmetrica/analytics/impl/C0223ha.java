package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.ha, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0223ha extends B4 {
    public C0223ha(C0644y4 c0644y4) {
        super(c0644y4);
    }

    @Override // io.appmetrica.analytics.impl.B4
    public final boolean a(Q5 q5, C0569v4 c0569v4) {
        Bundle bundle = q5.m;
        Ya ya = bundle != null ? (Ya) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (ya != null) {
            if (ya.d) {
                C0420p4 c0420p4 = c0569v4.b.d.f764a;
                Boolean bool = c0420p4.n;
                Boolean bool2 = c0420p4.i;
                C0401oa.I.c().c(bool != null ? bool.booleanValue() : true);
                C0401oa.I.h().b(bool2);
            }
        }
        this.f771a.a(ya);
        return false;
    }
}
