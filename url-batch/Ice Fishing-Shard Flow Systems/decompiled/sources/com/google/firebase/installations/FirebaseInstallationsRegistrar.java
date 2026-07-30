package com.google.firebase.installations;

import P1.g;
import R1.a;
import R1.b;
import S1.c;
import S1.r;
import T1.j;
import c2.e;
import c2.f;
import com.google.firebase.components.ComponentRegistrar;
import f2.C0396c;
import f2.InterfaceC0397d;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC0397d lambda$getComponents$0(c cVar) {
        return new C0396c((g) cVar.a(g.class), cVar.e(f.class), (ExecutorService) cVar.d(new r(a.class, ExecutorService.class)), new j((Executor) cVar.d(new r(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<S1.b> getComponents() {
        S1.a aVar = new S1.a(InterfaceC0397d.class, new Class[0]);
        aVar.f2460c = LIBRARY_NAME;
        aVar.a(S1.j.a(g.class));
        aVar.a(new S1.j(0, 1, f.class));
        aVar.a(new S1.j(new r(a.class, ExecutorService.class), 1, 0));
        aVar.a(new S1.j(new r(b.class, Executor.class), 1, 0));
        aVar.f2464g = new A4.c(26);
        S1.b b7 = aVar.b();
        e eVar = new e();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(e.class));
        return Arrays.asList(b7, new S1.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new A4.b(2, eVar), hashSet3), O6.g.B(LIBRARY_NAME, "19.1.1"));
    }
}
