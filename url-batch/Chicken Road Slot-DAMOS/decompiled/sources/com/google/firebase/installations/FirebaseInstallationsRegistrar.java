package com.google.firebase.installations;

import b1.h;
import com.google.firebase.components.ComponentRegistrar;
import g8.g;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k8.a;
import k8.b;
import l8.c;
import l8.r;
import m8.j;
import te.a1;
import u8.e;
import x8.d;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(c cVar) {
        return new x8.c((g) cVar.a(g.class), cVar.f(e.class), (ExecutorService) cVar.d(new r(a.class, ExecutorService.class)), new j((Executor) cVar.d(new r(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<l8.b> getComponents() {
        l8.a a9 = l8.b.a(d.class);
        a9.f5892a = LIBRARY_NAME;
        a9.a(l8.j.a(g.class));
        a9.a(new l8.j(0, 1, e.class));
        a9.a(new l8.j(new r(a.class, ExecutorService.class), 1, 0));
        a9.a(new l8.j(new r(b.class, Executor.class), 1, 0));
        a9.f5897f = new a1();
        l8.b b10 = a9.b();
        u8.d dVar = new u8.d(0);
        l8.a a10 = l8.b.a(u8.d.class);
        a10.f5896e = 1;
        a10.f5897f = new h(8, dVar);
        return Arrays.asList(b10, a10.b(), i7.a.I(LIBRARY_NAME, "19.1.1"));
    }
}
