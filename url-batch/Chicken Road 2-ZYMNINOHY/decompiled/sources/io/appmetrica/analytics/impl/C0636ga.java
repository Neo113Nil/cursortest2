package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0636ga extends A4 {
    public C0636ga(C1070x4 c1070x4) {
        super(c1070x4);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final boolean a(P5 p5, C0992u4 c0992u4) {
        Bundle bundle = p5.f10806m;
        Xa xa = bundle != null ? (Xa) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (xa != null) {
            if (xa.f11261d) {
                C0837o4 c0837o4 = c0992u4.f12801b.f13002d.f13106a;
                Boolean bool = c0837o4.n;
                Boolean bool2 = c0837o4.f12492i;
                C0817na.f12417I.c().c(bool != null ? bool.booleanValue() : true);
                C0817na.f12417I.h().b(bool2);
            }
        }
        this.f10020a.a(xa);
        return false;
    }
}
