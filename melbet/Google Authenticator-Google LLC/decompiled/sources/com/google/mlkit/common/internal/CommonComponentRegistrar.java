package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.hel;
import defpackage.iag;
import defpackage.iah;
import defpackage.ian;
import defpackage.ikf;
import defpackage.ikg;
import defpackage.ikj;
import defpackage.ikk;
import defpackage.ikm;
import defpackage.ikn;
import defpackage.ikp;
import defpackage.iks;
import defpackage.ikt;
import defpackage.ikx;
import defpackage.ikz;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List a() {
        iag a = iah.a(ikz.class);
        a.b(new ian(iks.class, 1, 0));
        a.b = new ikf(1);
        iah a2 = a.a();
        iag a3 = iah.a(ikt.class);
        a3.b = new ikf(0);
        iah a4 = a3.a();
        iag a5 = iah.a(ikk.class);
        a5.b(new ian(ikj.class, 2, 0));
        a5.b = new ikf(2);
        iah a6 = a5.a();
        iag a7 = iah.a(ikp.class);
        a7.b(new ian(ikt.class, 1, 1));
        a7.b = new ikf(3);
        iah a8 = a7.a();
        iag a9 = iah.a(ikm.class);
        a9.b = new ikf(4);
        iah a10 = a9.a();
        iag a11 = iah.a(ikn.class);
        a11.b(new ian(ikm.class, 1, 0));
        a11.b = new ikf(5);
        iah a12 = a11.a();
        iag a13 = iah.a(ikg.class);
        a13.b(new ian(iks.class, 1, 0));
        a13.b = new ikf(6);
        iah a14 = a13.a();
        iag a15 = iah.a(ikj.class);
        a15.a = 1;
        a15.b(new ian(ikg.class, 1, 1));
        a15.b = new ikf(7);
        iah a16 = a15.a();
        int i = hel.d;
        return hel.j(ikx.a, a2, a4, a6, a8, a10, a12, a14, a16);
    }
}
