package com.google.firebase.installations;

import B1.w;
import F3.l;
import K3.g;
import M3.a;
import M3.b;
import N3.c;
import N3.r;
import O3.j;
import W3.e;
import W3.f;
import Z3.d;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(c cVar) {
        return new Z3.c((g) cVar.a(g.class), cVar.c(f.class), (ExecutorService) cVar.e(new r(a.class, ExecutorService.class)), new j((Executor) cVar.e(new r(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<N3.b> getComponents() {
        N3.a aVar = new N3.a(d.class, new Class[0]);
        aVar.f2147n = LIBRARY_NAME;
        aVar.b(N3.j.a(g.class));
        aVar.b(new N3.j(0, 1, f.class));
        aVar.b(new N3.j(new r(a.class, ExecutorService.class), 1, 0));
        aVar.b(new N3.j(new r(b.class, Executor.class), 1, 0));
        aVar.f2153z = new w(23);
        N3.b c4 = aVar.c();
        e eVar = new e(0);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(e.class));
        return Arrays.asList(c4, new N3.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new l(1, eVar), hashSet3), com.bumptech.glide.d.g(LIBRARY_NAME, "17.2.0"));
    }
}
