package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.a60;
import defpackage.af;
import defpackage.b60;
import defpackage.ez;
import defpackage.gb0;
import defpackage.hz;
import defpackage.iz;
import defpackage.kj;
import defpackage.lj;
import defpackage.mj;
import defpackage.n91;
import defpackage.nd;
import defpackage.qr;
import defpackage.rc;
import defpackage.v01;
import defpackage.yj;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static iz lambda$getComponents$0(yj yjVar) {
        return new hz((ez) yjVar.a(ez.class), yjVar.d(b60.class), (ExecutorService) yjVar.f(new v01(rc.class, ExecutorService.class)), new n91((Executor) yjVar.f(new v01(nd.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<mj> getComponents() {
        int i = 0;
        lj ljVar = new lj(iz.class, new Class[0]);
        ljVar.a = LIBRARY_NAME;
        ljVar.a(qr.a(ez.class));
        ljVar.a(new qr(0, 1, b60.class));
        ljVar.a(new qr(new v01(rc.class, ExecutorService.class), 1, 0));
        ljVar.a(new qr(new v01(nd.class, Executor.class), 1, 0));
        ljVar.f = new af(25);
        mj b = ljVar.b();
        a60 a60Var = new a60(i);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(v01.a(a60.class));
        return Arrays.asList(b, new mj(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new kj(i, a60Var), hashSet3), gb0.l(LIBRARY_NAME, "19.0.1"));
    }
}
