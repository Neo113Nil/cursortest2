package com.google.firebase.installations;

import B0.b;
import B1.d;
import B1.e;
import a1.AbstractC0223a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m1.g;
import o1.InterfaceC0555a;
import o1.InterfaceC0556b;
import p1.C0576a;
import p1.InterfaceC0577b;
import p1.o;
import q1.h;
import y1.C0760d;

/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static e lambda$getComponents$0(InterfaceC0577b interfaceC0577b) {
        return new d((g) interfaceC0577b.a(g.class), interfaceC0577b.c(y1.e.class), (ExecutorService) interfaceC0577b.e(new o(InterfaceC0555a.class, ExecutorService.class)), new h((Executor) interfaceC0577b.e(new o(InterfaceC0556b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0576a> getComponents() {
        N3.e eVar = new N3.e(e.class, new Class[0]);
        eVar.f1689c = LIBRARY_NAME;
        eVar.a(p1.g.a(g.class));
        eVar.a(new p1.g(y1.e.class, 0, 1));
        eVar.a(new p1.g(new o(InterfaceC0555a.class, ExecutorService.class), 1, 0));
        eVar.a(new p1.g(new o(InterfaceC0556b.class, Executor.class), 1, 0));
        eVar.f1692f = new B1.g(0);
        C0576a b7 = eVar.b();
        C0760d c0760d = new C0760d();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(o.a(C0760d.class));
        return Arrays.asList(b7, new C0576a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new b(12, c0760d), hashSet3), AbstractC0223a.r(LIBRARY_NAME, "17.2.0"));
    }
}
