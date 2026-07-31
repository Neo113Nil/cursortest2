package com.google.firebase.ktx;

import G1.a;
import H5.AbstractC0161v;
import N3.e;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import l5.AbstractC0507k;
import o1.InterfaceC0555a;
import o1.InterfaceC0556b;
import o1.InterfaceC0557c;
import o1.d;
import p1.C0576a;
import p1.g;
import p1.o;

/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0576a> getComponents() {
        e a7 = C0576a.a(new o(InterfaceC0555a.class, AbstractC0161v.class));
        a7.a(new g(new o(InterfaceC0555a.class, Executor.class), 1, 0));
        a7.f1692f = a.f833g;
        C0576a b7 = a7.b();
        e a8 = C0576a.a(new o(InterfaceC0557c.class, AbstractC0161v.class));
        a8.a(new g(new o(InterfaceC0557c.class, Executor.class), 1, 0));
        a8.f1692f = a.f834h;
        C0576a b8 = a8.b();
        e a9 = C0576a.a(new o(InterfaceC0556b.class, AbstractC0161v.class));
        a9.a(new g(new o(InterfaceC0556b.class, Executor.class), 1, 0));
        a9.f1692f = a.f835i;
        C0576a b9 = a9.b();
        e a10 = C0576a.a(new o(d.class, AbstractC0161v.class));
        a10.a(new g(new o(d.class, Executor.class), 1, 0));
        a10.f1692f = a.f836j;
        return AbstractC0507k.z(b7, b8, b9, a10.b());
    }
}
