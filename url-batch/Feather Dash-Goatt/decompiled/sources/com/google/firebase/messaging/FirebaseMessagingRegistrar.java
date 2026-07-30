package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.af;
import defpackage.bq;
import defpackage.c60;
import defpackage.dd0;
import defpackage.ej1;
import defpackage.ez;
import defpackage.gb0;
import defpackage.gf1;
import defpackage.gj1;
import defpackage.iz;
import defpackage.kz;
import defpackage.lj;
import defpackage.mj;
import defpackage.qr;
import defpackage.sq;
import defpackage.v01;
import defpackage.yj;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(v01 v01Var, yj yjVar) {
        ez ezVar = (ez) yjVar.a(ez.class);
        if (yjVar.a(kz.class) == null) {
            return new FirebaseMessaging(ezVar, yjVar.d(sq.class), yjVar.d(c60.class), (iz) yjVar.a(iz.class), yjVar.e(v01Var), (gf1) yjVar.a(gf1.class));
        }
        af.c();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<mj> getComponents() {
        v01 v01Var = new v01(ej1.class, gj1.class);
        lj ljVar = new lj(FirebaseMessaging.class, new Class[0]);
        ljVar.a = LIBRARY_NAME;
        ljVar.a(qr.a(ez.class));
        ljVar.a(new qr(0, 0, kz.class));
        ljVar.a(new qr(0, 1, sq.class));
        ljVar.a(new qr(0, 1, c60.class));
        ljVar.a(qr.a(iz.class));
        ljVar.a(new qr(v01Var, 0, 1));
        ljVar.a(qr.a(gf1.class));
        ljVar.f = new bq(v01Var, 1);
        if (ljVar.d == 0) {
            ljVar.d = 1;
            return Arrays.asList(ljVar.b(), gb0.l(LIBRARY_NAME, "25.0.1"));
        }
        dd0.j("Instantiation type has already been set.");
        return null;
    }
}
