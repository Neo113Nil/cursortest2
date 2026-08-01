package com.google.firebase;

import a2.r;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.p;
import g8.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import l8.a;
import l8.b;
import l8.j;
import u8.c;
import u8.d;
import u8.e;
import u8.f;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        a a9 = b.a(d9.b.class);
        a9.a(new j(2, 0, d9.a.class));
        a9.f5897f = new r(16);
        arrayList.add(a9.b());
        l8.r rVar = new l8.r(k8.a.class, Executor.class);
        a aVar = new a(c.class, new Class[]{e.class, f.class});
        aVar.a(j.a(Context.class));
        aVar.a(j.a(g.class));
        aVar.a(new j(2, 0, d.class));
        aVar.a(new j(1, 1, d9.b.class));
        aVar.a(new j(rVar, 1, 0));
        aVar.f5897f = new p(rVar, 1);
        arrayList.add(aVar.b());
        arrayList.add(i7.a.I("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(i7.a.I("fire-core", "22.1.0"));
        arrayList.add(i7.a.I("device-name", a(Build.PRODUCT)));
        arrayList.add(i7.a.I("device-model", a(Build.DEVICE)));
        arrayList.add(i7.a.I("device-brand", a(Build.BRAND)));
        arrayList.add(i7.a.K("android-target-sdk", new r(19)));
        arrayList.add(i7.a.K("android-min-sdk", new r(20)));
        arrayList.add(i7.a.K("android-platform", new r(21)));
        arrayList.add(i7.a.K("android-installer", new r(22)));
        try {
            hd.f.f4502i.getClass();
            str = "2.4.0";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(i7.a.I("kotlin", str));
        }
        return arrayList;
    }
}
