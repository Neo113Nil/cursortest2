package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a60;
import defpackage.af;
import defpackage.b60;
import defpackage.bq;
import defpackage.c60;
import defpackage.ca0;
import defpackage.dd0;
import defpackage.dq;
import defpackage.ez;
import defpackage.gb0;
import defpackage.lj;
import defpackage.mj;
import defpackage.nc0;
import defpackage.pb;
import defpackage.qr;
import defpackage.rc;
import defpackage.sq;
import defpackage.v01;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(v01.a(sq.class));
        for (Class cls : new Class[0]) {
            ca0.f(cls, "Null interface");
            hashSet.add(v01.a(cls));
        }
        qr qrVar = new qr(2, 0, pb.class);
        String str = null;
        if (hashSet.contains(qrVar.a)) {
            dd0.e("Components are not allowed to depend on interfaces they themselves provide.");
            return null;
        }
        hashSet2.add(qrVar);
        arrayList.add(new mj(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new af(10), hashSet3));
        v01 v01Var = new v01(rc.class, Executor.class);
        lj ljVar = new lj(dq.class, new Class[]{b60.class, c60.class});
        ljVar.a(qr.a(Context.class));
        ljVar.a(qr.a(ez.class));
        ljVar.a(new qr(2, 0, a60.class));
        ljVar.a(new qr(1, 1, sq.class));
        ljVar.a(new qr(v01Var, 1, 0));
        ljVar.f = new bq(v01Var, i);
        arrayList.add(ljVar.b());
        arrayList.add(gb0.l("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(gb0.l("fire-core", "22.0.1"));
        arrayList.add(gb0.l("device-name", a(Build.PRODUCT)));
        arrayList.add(gb0.l("device-model", a(Build.DEVICE)));
        arrayList.add(gb0.l("device-brand", a(Build.BRAND)));
        arrayList.add(gb0.t("android-target-sdk", new af(21)));
        arrayList.add(gb0.t("android-min-sdk", new af(22)));
        arrayList.add(gb0.t("android-platform", new af(23)));
        arrayList.add(gb0.t("android-installer", new af(24)));
        try {
            nc0.g.getClass();
            str = "2.2.10";
        } catch (NoClassDefFoundError unused) {
        }
        if (str != null) {
            arrayList.add(gb0.l("kotlin", str));
        }
        return arrayList;
    }
}
