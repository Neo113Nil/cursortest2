package com.google.firebase.datatransport;

import O6.g;
import S1.b;
import S1.c;
import S1.j;
import S1.r;
import X0.e;
import Y0.a;
import a1.p;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$0(c cVar) {
        p.b((Context) cVar.a(Context.class));
        return p.a().c(a.f2898f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$1(c cVar) {
        p.b((Context) cVar.a(Context.class));
        return p.a().c(a.f2898f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$2(c cVar) {
        p.b((Context) cVar.a(Context.class));
        return p.a().c(a.f2897e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(e.class));
        for (Class cls : new Class[0]) {
            g.A(cls, "Null interface");
            hashSet.add(r.a(cls));
        }
        j a7 = j.a(Context.class);
        if (hashSet.contains(a7.f2488a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(a7);
        b bVar = new b(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new A4.c(19), hashSet3);
        S1.a a8 = b.a(new r(V1.a.class, e.class));
        a8.a(j.a(Context.class));
        a8.f2464g = new A4.c(20);
        b b7 = a8.b();
        S1.a a9 = b.a(new r(V1.b.class, e.class));
        a9.a(j.a(Context.class));
        a9.f2464g = new A4.c(21);
        return Arrays.asList(bVar, b7, a9.b(), g.B(LIBRARY_NAME, "18.2.0"));
    }
}
