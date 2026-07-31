package F;

import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0170q0;
import I.C0173s0;
import b0.C0352v;

/* renamed from: F.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0123u0 {
    static {
        new I.U(N.f1278k);
    }

    public static final void a(M m3, m1 m1Var, A1 a12, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        m1 m1Var2;
        c0167p.S(-2127166334);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(m3) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(a12) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.h(aVar) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0167p.x()) {
            c0167p.L();
            m1Var2 = m1Var;
        } else {
            c0167p.N();
            if ((i3 & 1) == 0 || c0167p.w()) {
                m1Var2 = (m1) c0167p.k(n1.f1696a);
            } else {
                c0167p.L();
                m1Var2 = m1Var;
            }
            c0167p.q();
            n.U a3 = e1.a(false, 0.0f, c0167p, 0, 7);
            long j3 = m3.f1238a;
            boolean e3 = c0167p.e(j3);
            Object G3 = c0167p.G();
            if (e3 || G3 == C0159l.f2829a) {
                G3 = new B.j0(j3, C0352v.b(j3, 0.4f));
                c0167p.a0(G3);
            }
            C0143d.b(new C0170q0[]{O.f1301a.a(m3), androidx.compose.foundation.d.f4788a.a(a3), E.B.f911a.a(P.f1309a), n1.f1696a.a(m1Var2), B.k0.f418a.a((B.j0) G3), B1.f1124a.a(a12)}, Q.f.b(-1066563262, new C0087c(a12, 3, aVar), c0167p), c0167p, 56);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0105l(m3, m1Var2, a12, aVar, i3, 1);
        }
    }
}
