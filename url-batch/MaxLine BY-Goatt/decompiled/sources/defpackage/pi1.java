package defpackage;

import androidx.compose.foundation.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class pi1 {
    static {
        new lc1(o00.D);
    }

    public static final void a(gw gwVar, jk2 jk2Var, l13 l13Var, my myVar, a00 a00Var, int i) {
        int i2;
        jk2 jk2Var2;
        a00Var.Z(-2127166334);
        if ((i & 6) == 0) {
            i2 = (a00Var.f(gwVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= a00Var.f(l13Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= a00Var.h(myVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && a00Var.B()) {
            a00Var.S();
            jk2Var2 = jk2Var;
        } else {
            a00Var.U();
            if ((i & 1) == 0 || a00Var.z()) {
                jk2Var2 = (jk2) a00Var.j(kk2.a);
            } else {
                a00Var.S();
                jk2Var2 = jk2Var;
            }
            a00Var.r();
            z11 a = za2.a(a00Var, 0, 7);
            long j = gwVar.a;
            boolean e = a00Var.e(j);
            Object M = a00Var.M();
            if (e || M == sz.a) {
                M = new kw2(j, aw.b(j, 0.4f));
                a00Var.i0(M);
            }
            yk3.c(new ye[]{hw.a.a(gwVar), d.a.a(a), db2.a.a(cx.b), kk2.a.a(jk2Var2), lw2.a.a((kw2) M), n13.a.a(l13Var)}, yj1.H(-1066563262, new n8(15, l13Var, myVar), a00Var), a00Var, 56);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new d6(gwVar, jk2Var2, l13Var, myVar, i, 3);
        }
    }
}
