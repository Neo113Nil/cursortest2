package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ca0;
import defpackage.dd0;
import defpackage.ej1;
import defpackage.gb0;
import defpackage.gf;
import defpackage.gj1;
import defpackage.hg0;
import defpackage.ij1;
import defpackage.lj;
import defpackage.mj;
import defpackage.qr;
import defpackage.v01;
import defpackage.yj;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ gj1 lambda$getComponents$0(yj yjVar) {
        ij1.b((Context) yjVar.a(Context.class));
        return ij1.a().c(gf.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ gj1 lambda$getComponents$1(yj yjVar) {
        ij1.b((Context) yjVar.a(Context.class));
        return ij1.a().c(gf.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ gj1 lambda$getComponents$2(yj yjVar) {
        ij1.b((Context) yjVar.a(Context.class));
        return ij1.a().c(gf.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<mj> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(v01.a(gj1.class));
        for (Class cls : new Class[0]) {
            ca0.f(cls, "Null interface");
            hashSet.add(v01.a(cls));
        }
        qr a = qr.a(Context.class);
        if (hashSet.contains(a.a)) {
            dd0.e("Components are not allowed to depend on interfaces they themselves provide.");
            return null;
        }
        hashSet2.add(a);
        mj mjVar = new mj(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new dd0(14), hashSet3);
        lj a2 = mj.a(new v01(hg0.class, gj1.class));
        a2.a(qr.a(Context.class));
        a2.f = new dd0(15);
        mj b = a2.b();
        lj a3 = mj.a(new v01(ej1.class, gj1.class));
        a3.a(qr.a(Context.class));
        a3.f = new dd0(16);
        return Arrays.asList(mjVar, b, a3.b(), gb0.l(LIBRARY_NAME, "18.2.0"));
    }
}
