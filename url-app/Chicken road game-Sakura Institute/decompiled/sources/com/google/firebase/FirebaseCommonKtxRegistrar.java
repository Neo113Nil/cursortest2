package com.google.firebase;

import a5.g;
import b5.a;
import b5.d;
import com.google.firebase.components.ComponentRegistrar;
import e5.b;
import e5.c;
import e5.l;
import e5.t;
import e6.m;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        b a3 = c.a(new t(a.class, c7.t.class));
        a3.a(new l(new t(a.class, Executor.class), 1, 0));
        a3.f2759f = g.f507b;
        c b9 = a3.b();
        b a9 = c.a(new t(b5.c.class, c7.t.class));
        a9.a(new l(new t(b5.c.class, Executor.class), 1, 0));
        a9.f2759f = g.f508c;
        c b10 = a9.b();
        b a10 = c.a(new t(b5.b.class, c7.t.class));
        a10.a(new l(new t(b5.b.class, Executor.class), 1, 0));
        a10.f2759f = g.f509d;
        c b11 = a10.b();
        b a11 = c.a(new t(d.class, c7.t.class));
        a11.a(new l(new t(d.class, Executor.class), 1, 0));
        a11.f2759f = g.f510e;
        return m.X(b9, b10, b11, a11.b());
    }
}
