package com.google.firebase;

import A4.c;
import O6.g;
import R1.a;
import R5.C0167g;
import S1.j;
import S1.r;
import android.content.Context;
import android.os.Build;
import c2.C0292b;
import c2.d;
import c2.e;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import l2.C0660a;
import l2.b;
import p5.f;

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
        hashSet.add(r.a(b.class));
        for (Class cls : new Class[0]) {
            g.A(cls, "Null interface");
            hashSet.add(r.a(cls));
        }
        j jVar = new j(2, 0, C0660a.class);
        if (hashSet.contains(jVar.f2488a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(jVar);
        arrayList.add(new S1.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new f(), hashSet3));
        r rVar = new r(a.class, Executor.class);
        S1.a aVar = new S1.a(d.class, new Class[]{c2.f.class, c2.g.class});
        aVar.a(j.a(Context.class));
        aVar.a(j.a(P1.g.class));
        aVar.a(new j(2, 0, e.class));
        aVar.a(new j(1, 1, b.class));
        aVar.a(new j(rVar, 1, 0));
        aVar.f2464g = new C0292b(rVar, 0);
        arrayList.add(aVar.b());
        arrayList.add(g.B("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(g.B("fire-core", "22.1.0"));
        arrayList.add(g.B("device-name", a(Build.PRODUCT)));
        arrayList.add(g.B("device-model", a(Build.DEVICE)));
        arrayList.add(g.B("device-brand", a(Build.BRAND)));
        arrayList.add(g.G("android-target-sdk", new c(10)));
        arrayList.add(g.G("android-min-sdk", new c(11)));
        arrayList.add(g.G("android-platform", new c(12)));
        arrayList.add(g.G("android-installer", new c(13)));
        try {
            C0167g.f2415i.getClass();
            str = "2.3.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(g.B("kotlin", str));
        }
        return arrayList;
    }
}
