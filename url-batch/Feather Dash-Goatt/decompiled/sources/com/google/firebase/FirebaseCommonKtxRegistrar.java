package com.google.firebase;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a60;
import defpackage.ch0;
import defpackage.j41;
import defpackage.j50;
import defpackage.lj;
import defpackage.ln;
import defpackage.mj;
import defpackage.nd;
import defpackage.qr;
import defpackage.rc;
import defpackage.v01;
import defpackage.vk1;
import defpackage.zh;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lmj;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<mj> getComponents() {
        lj a = mj.a(new v01(rc.class, ln.class));
        a.a(new qr(new v01(rc.class, Executor.class), 1, 0));
        a.f = a60.i;
        mj b = a.b();
        lj a2 = mj.a(new v01(ch0.class, ln.class));
        a2.a(new qr(new v01(ch0.class, Executor.class), 1, 0));
        a2.f = j41.k;
        mj b2 = a2.b();
        lj a3 = mj.a(new v01(nd.class, ln.class));
        a3.a(new qr(new v01(nd.class, Executor.class), 1, 0));
        a3.f = j50.x;
        mj b3 = a3.b();
        lj a4 = mj.a(new v01(vk1.class, ln.class));
        a4.a(new qr(new v01(vk1.class, Executor.class), 1, 0));
        a4.f = a60.j;
        return zh.e(b, b2, b3, a4.b());
    }
}
