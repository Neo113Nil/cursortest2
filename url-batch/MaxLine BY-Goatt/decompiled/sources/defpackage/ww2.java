package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ww2 {
    public static final gw a;
    public static final gw b;

    static {
        long d = ap.d(4281998338L);
        long j = cw.m;
        long j2 = aw.c;
        long j3 = cw.n;
        long j4 = cw.o;
        long j5 = cw.a;
        long j6 = cw.c;
        long j7 = cw.w;
        long j8 = cw.r;
        long j9 = cw.u;
        long j10 = cw.s;
        long d2 = ap.d(4294371286L);
        long j11 = cw.v;
        long j12 = cw.t;
        long j13 = cw.y;
        a = hw.e(j, j2, j3, j4, j5, j2, j6, d, j7, d, j8, j9, j10, j9, d2, j11, j13, j2, cw.z, j13, j12, j12, -264759280);
        long j14 = cw.d;
        long j15 = cw.e;
        long j16 = cw.h;
        long j17 = cw.A;
        long j18 = cw.E;
        long j19 = cw.B;
        long j20 = cw.C;
        long j21 = cw.F;
        long j22 = cw.D;
        long d3 = ap.d(4294929259L);
        long d4 = ap.d(4280945162L);
        long d5 = ap.d(4284096544L);
        long d6 = ap.d(4294957529L);
        b = new gw(j3, j4, j4, j3, bw.b, j14, d, j15, j16, j7, d, bw.m, bw.d, j17, j18, j19, j18, j20, j21, j3, bw.c, bw.a, d3, d4, d5, d6, j22, j22, bw.e, bw.f, bw.l, bw.g, bw.h, bw.i, bw.j, bw.k);
    }

    public static final void a(boolean z, my myVar, a00 a00Var, int i) {
        my myVar2;
        a00 a00Var2;
        a00Var.Z(-957568423);
        int i2 = i | 2;
        if (a00Var.P(i2 & 1, (i2 & 131) != 130)) {
            a00Var.U();
            if ((i & 1) == 0 || a00Var.z()) {
                z = (((Configuration) a00Var.j(AndroidCompositionLocals_androidKt.a)).uiMode & 48) == 32;
            } else {
                a00Var.S();
            }
            a00Var.r();
            myVar2 = myVar;
            a00Var2 = a00Var;
            pi1.a(z ? b : a, null, t03.a, myVar2, a00Var2, 3456);
        } else {
            myVar2 = myVar;
            a00Var2 = a00Var;
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new ju0(z, myVar2, i, 3);
        }
    }
}
