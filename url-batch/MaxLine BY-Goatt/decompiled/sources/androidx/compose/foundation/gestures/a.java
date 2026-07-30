package androidx.compose.foundation.gestures;

import defpackage.au1;
import defpackage.b50;
import defpackage.bn1;
import defpackage.ca2;
import defpackage.cg2;
import defpackage.ho1;
import defpackage.lf2;
import defpackage.lh;
import defpackage.mf2;
import defpackage.nf2;
import defpackage.om0;
import defpackage.px1;
import defpackage.r30;
import defpackage.sy1;
import defpackage.uf2;
import defpackage.vl1;
import defpackage.w;
import defpackage.wp;
import defpackage.ww1;
import defpackage.z72;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class a {
    public static final mf2 a = new mf2();
    public static final lf2 b = new lf2();
    public static final sy1 c = new sy1(1);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(cg2 cg2Var, long j, r30 r30Var) {
        nf2 nf2Var;
        int i;
        z72 z72Var;
        cg2 cg2Var2;
        if (r30Var instanceof nf2) {
            nf2Var = (nf2) r30Var;
            int i2 = nf2Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nf2Var.p = i2 - Integer.MIN_VALUE;
                Object obj = nf2Var.o;
                b50 b50Var = b50.m;
                i = nf2Var.p;
                if (i != 0) {
                    ca2.b(obj);
                    z72Var = new z72();
                    w wVar = new w(cg2Var, j, z72Var, null, 1);
                    nf2Var.m = cg2Var;
                    nf2Var.n = z72Var;
                    nf2Var.p = 1;
                    if (cg2Var.e(ho1.m, wVar, nf2Var) == b50Var) {
                        return b50Var;
                    }
                    cg2Var2 = cg2Var;
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z72 z72Var2 = nf2Var.n;
                    cg2 cg2Var3 = nf2Var.m;
                    ca2.b(obj);
                    z72Var = z72Var2;
                    cg2Var2 = cg2Var3;
                }
                return new au1(cg2Var2.g(z72Var.m));
            }
        }
        nf2Var = new nf2(r30Var);
        Object obj2 = nf2Var.o;
        b50 b50Var2 = b50.m;
        i = nf2Var.p;
        if (i != 0) {
        }
        return new au1(cg2Var2.g(z72Var.m));
    }

    public static final vl1 b(vl1 vl1Var, uf2 uf2Var, ww1 ww1Var, px1 px1Var, boolean z, boolean z2, om0 om0Var, bn1 bn1Var, wp wpVar) {
        return vl1Var.k(new ScrollableElement(wpVar, om0Var, bn1Var, ww1Var, px1Var, uf2Var, z, z2));
    }
}
