package com.google.firebase;

import A.C0022s;
import Q.C0273i;
import V1.f;
import W1.a;
import Z1.b;
import Z1.k;
import Z1.t;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import j0.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import m3.s;
import t2.C1205b;
import t2.InterfaceC1206c;
import t2.InterfaceC1207d;
import t2.InterfaceC1208e;
import w2.C1292a;
import w2.C1293b;
import y2.C1334i;

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
        hashSet.add(t.a(C1293b.class));
        for (Class cls : new Class[0]) {
            c.s(cls, "Null interface");
            hashSet.add(t.a(cls));
        }
        k kVar = new k(2, 0, C1292a.class);
        if (hashSet.contains(kVar.f4586a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(kVar);
        arrayList.add(new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, new C0022s(23), hashSet3));
        t tVar = new t(a.class, Executor.class);
        Z1.a aVar = new Z1.a(C1205b.class, new Class[]{InterfaceC1207d.class, InterfaceC1208e.class});
        aVar.a(new k(1, 0, Context.class));
        aVar.a(new k(1, 0, f.class));
        aVar.a(new k(2, 0, InterfaceC1206c.class));
        aVar.a(new k(1, 1, C1293b.class));
        aVar.a(new k(tVar, 1, 0));
        aVar.f4559e = new C0273i(5, tVar);
        arrayList.add(aVar.b());
        arrayList.add(s.j("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(s.j("fire-core", "21.0.0"));
        arrayList.add(s.j("device-name", a(Build.PRODUCT)));
        arrayList.add(s.j("device-model", a(Build.DEVICE)));
        arrayList.add(s.j("device-brand", a(Build.BRAND)));
        arrayList.add(s.k("android-target-sdk", new C0022s(7)));
        arrayList.add(s.k("android-min-sdk", new C0022s(8)));
        arrayList.add(s.k("android-platform", new C0022s(9)));
        arrayList.add(s.k("android-installer", new C0022s(10)));
        try {
            C1334i.f11668i.getClass();
            str = "2.0.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(s.j("kotlin", str));
        }
        return arrayList;
    }
}
