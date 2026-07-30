package com.google.firebase;

import a0.s;
import a5.f;
import a8.m;
import android.content.Context;
import android.os.Build;
import b6.a;
import b6.b;
import com.google.firebase.components.ComponentRegistrar;
import e5.c;
import e5.l;
import e5.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import y5.d;
import y5.e;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
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
        hashSet.add(t.a(b.class));
        for (Class cls : new Class[0]) {
            m.n(cls, "Null interface");
            hashSet.add(t.a(cls));
        }
        l lVar = new l(2, 0, a.class);
        if (hashSet.contains(lVar.f2785a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(lVar);
        arrayList.add(new c(null, new HashSet(hashSet), new HashSet(hashSet2), 0, new s(13), hashSet3));
        t tVar = new t(b5.a.class, Executor.class);
        e5.b bVar = new e5.b(y5.b.class, new Class[]{d.class, e.class});
        bVar.a(new l(1, 0, Context.class));
        bVar.a(new l(1, 0, f.class));
        bVar.a(new l(2, 0, y5.c.class));
        bVar.a(new l(1, 1, b.class));
        bVar.a(new l(tVar, 1, 0));
        bVar.f2759f = new e5.a(5, tVar);
        arrayList.add(bVar.b());
        arrayList.add(j1.c.Q("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(j1.c.Q("fire-core", "21.0.0"));
        arrayList.add(j1.c.Q("device-name", a(Build.PRODUCT)));
        arrayList.add(j1.c.Q("device-model", a(Build.DEVICE)));
        arrayList.add(j1.c.Q("device-brand", a(Build.BRAND)));
        arrayList.add(j1.c.V("android-target-sdk", new s(9)));
        arrayList.add(j1.c.V("android-min-sdk", new s(10)));
        arrayList.add(j1.c.V("android-platform", new s(11)));
        arrayList.add(j1.c.V("android-installer", new s(12)));
        try {
            d6.f.f2613g.getClass();
            str = "2.0.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(j1.c.Q("kotlin", str));
        }
        return arrayList;
    }
}
