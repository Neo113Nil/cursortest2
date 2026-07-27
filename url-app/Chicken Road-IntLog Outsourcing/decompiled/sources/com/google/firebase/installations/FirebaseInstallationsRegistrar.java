package com.google.firebase.installations;

import E.C0028c;
import K1.g;
import M1.a;
import N1.b;
import N1.i;
import N1.q;
import O1.k;
import W1.e;
import W1.f;
import Z1.c;
import Z1.d;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((g) bVar.a(g.class), bVar.e(f.class), (ExecutorService) bVar.f(new q(a.class, ExecutorService.class)), new k((Executor) bVar.f(new q(M1.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<N1.a> getComponents() {
        G2.d dVar = new G2.d(d.class, new Class[0]);
        dVar.f936c = LIBRARY_NAME;
        dVar.a(i.a(g.class));
        dVar.a(new i(0, f.class, 1));
        dVar.a(new i(new q(a.class, ExecutorService.class), 1, 0));
        dVar.a(new i(new q(M1.b.class, Executor.class), 1, 0));
        dVar.f939f = new C0028c(19);
        N1.a b6 = dVar.b();
        e eVar = new e();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(e.class));
        return Arrays.asList(b6, new N1.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new D3.g(11, eVar), hashSet3), AbstractC1341c.e(LIBRARY_NAME, "17.2.0"));
    }
}
