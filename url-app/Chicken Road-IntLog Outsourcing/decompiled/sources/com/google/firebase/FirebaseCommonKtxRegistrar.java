package com.google.firebase;

import D4.AbstractC0020u;
import G2.d;
import K1.h;
import M1.b;
import M1.c;
import N1.a;
import N1.i;
import N1.q;
import com.google.firebase.components.ComponentRegistrar;
import g4.AbstractC0466k;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        d a6 = a.a(new q(M1.a.class, AbstractC0020u.class));
        a6.a(new i(new q(M1.a.class, Executor.class), 1, 0));
        a6.f939f = h.f1396b;
        a b6 = a6.b();
        d a7 = a.a(new q(c.class, AbstractC0020u.class));
        a7.a(new i(new q(c.class, Executor.class), 1, 0));
        a7.f939f = h.f1397c;
        a b7 = a7.b();
        d a8 = a.a(new q(b.class, AbstractC0020u.class));
        a8.a(new i(new q(b.class, Executor.class), 1, 0));
        a8.f939f = h.f1398d;
        a b8 = a8.b();
        d a9 = a.a(new q(M1.d.class, AbstractC0020u.class));
        a9.a(new i(new q(M1.d.class, Executor.class), 1, 0));
        a9.f939f = h.f1399e;
        return AbstractC0466k.A0(b6, b7, b8, a9.b());
    }
}
