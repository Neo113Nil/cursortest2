package com.google.firebase;

import H1.t;
import J1.a;
import J1.b;
import N3.e;
import a1.AbstractC0223a;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import k5.C0474d;
import m1.AbstractC0521b;
import o1.InterfaceC0555a;
import p1.C0576a;
import p1.g;
import p1.o;
import y1.C0759c;
import y1.C0760d;
import y1.f;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(o.a(b.class));
        for (Class cls : new Class[0]) {
            AbstractC0521b.f(cls, "Null interface");
            hashSet.add(o.a(cls));
        }
        g gVar = new g(a.class, 2, 0);
        if (hashSet.contains(gVar.f5680a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(gVar);
        arrayList.add(new C0576a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new B1.g(11), hashSet3));
        o oVar = new o(InterfaceC0555a.class, Executor.class);
        e eVar = new e(C0759c.class, new Class[]{y1.e.class, f.class});
        eVar.a(g.a(Context.class));
        eVar.a(g.a(m1.g.class));
        eVar.a(new g(C0760d.class, 2, 0));
        eVar.a(new g(b.class, 1, 1));
        eVar.a(new g(oVar, 1, 0));
        eVar.f1692f = new t(oVar, 1);
        arrayList.add(eVar.b());
        arrayList.add(AbstractC0223a.r("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC0223a.r("fire-core", "21.0.0"));
        arrayList.add(AbstractC0223a.r("device-name", a(Build.PRODUCT)));
        arrayList.add(AbstractC0223a.r("device-model", a(Build.DEVICE)));
        arrayList.add(AbstractC0223a.r("device-brand", a(Build.BRAND)));
        arrayList.add(AbstractC0223a.u("android-target-sdk", new B1.g(21)));
        arrayList.add(AbstractC0223a.u("android-min-sdk", new B1.g(22)));
        arrayList.add(AbstractC0223a.u("android-platform", new B1.g(23)));
        arrayList.add(AbstractC0223a.u("android-installer", new B1.g(24)));
        try {
            C0474d.f5193g.getClass();
            str = "2.2.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(AbstractC0223a.r("kotlin", str));
        }
        return arrayList;
    }
}
