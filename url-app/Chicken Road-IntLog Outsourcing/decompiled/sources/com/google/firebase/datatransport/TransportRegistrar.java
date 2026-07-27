package com.google.firebase.datatransport;

import E.C0028c;
import G2.d;
import N1.b;
import N1.i;
import N1.q;
import S0.f;
import T0.a;
import V0.o;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        o.b((Context) bVar.a(Context.class));
        return o.a().c(a.f2766f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$1(b bVar) {
        o.b((Context) bVar.a(Context.class));
        return o.a().c(a.f2766f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$2(b bVar) {
        o.b((Context) bVar.a(Context.class));
        return o.a().c(a.f2765e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<N1.a> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(f.class));
        for (Class cls : new Class[0]) {
            B0.f.g(cls, "Null interface");
            hashSet.add(q.a(cls));
        }
        i a6 = i.a(Context.class);
        if (hashSet.contains(a6.f2019a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(a6);
        N1.a aVar = new N1.a(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C0028c(10), hashSet3);
        d a7 = N1.a.a(new q(P1.a.class, f.class));
        a7.a(i.a(Context.class));
        a7.f939f = new C0028c(11);
        N1.a b6 = a7.b();
        d a8 = N1.a.a(new q(P1.b.class, f.class));
        a8.a(i.a(Context.class));
        a8.f939f = new C0028c(12);
        return Arrays.asList(aVar, b6, a8.b(), AbstractC1341c.e(LIBRARY_NAME, "18.2.0"));
    }
}
