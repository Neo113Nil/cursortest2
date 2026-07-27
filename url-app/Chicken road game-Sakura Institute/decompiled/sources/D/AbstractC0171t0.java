package D;

import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0219q0;
import G.C0222s0;
import Z.C0323u;

/* renamed from: D.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0171t0 {
    static {
        new G.U(L.f1467m);
    }

    public static final void a(K k4, C0143j1 c0143j1, T1 t12, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        C0143j1 c0143j12;
        c0216p.U(-2127166334);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(k4) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.f(t12) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.h(aVar) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0216p.z()) {
            c0216p.N();
            c0143j12 = c0143j1;
        } else {
            c0216p.P();
            if ((i2 & 1) == 0 || c0216p.y()) {
                c0143j12 = (C0143j1) c0216p.k(AbstractC0146k1.f1872a);
            } else {
                c0216p.N();
                c0143j12 = c0143j1;
            }
            c0216p.r();
            m.Q a4 = X0.a(false, 0.0f, 0L, c0216p, 0, 7);
            long j4 = k4.f1374a;
            boolean e4 = c0216p.e(j4);
            Object I3 = c0216p.I();
            if (e4 || I3 == C0208l.f2826a) {
                I3 = new A.k0(j4, C0323u.b(0.4f, j4));
                c0216p.c0(I3);
            }
            C0192d.b(new C0219q0[]{M.f1481a.a(k4), androidx.compose.foundation.d.f5041a.a(a4), C.B.f1040a.a(N.f1508a), AbstractC0146k1.f1872a.a(c0143j12), A.l0.f166a.a((A.k0) I3), U1.f1662a.a(t12)}, O.f.b(-1066563262, new C0120c(t12, 3, aVar), c0216p), c0216p, 56);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0147l(k4, c0143j12, t12, aVar, i2, 1);
        }
    }
}
