package F;

import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.C0116q0;
import I.C0119s0;
import b0.C0288u;

/* renamed from: F.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0035d0 {
    static {
        new I.V(K.f1035k);
    }

    public static final void a(J j3, O0 o02, a1 a1Var, Q.a aVar, C0113p c0113p, int i3) {
        int i4;
        O0 o03;
        c0113p.S(-2127166334);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(j3) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.f(a1Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0113p.h(aVar) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0113p.x()) {
            c0113p.L();
            o03 = o02;
        } else {
            c0113p.N();
            if ((i3 & 1) == 0 || c0113p.w()) {
                o03 = (O0) c0113p.k(P0.f1080a);
            } else {
                c0113p.L();
                o03 = o02;
            }
            c0113p.q();
            n.Q a3 = B0.a(0.0f, c0113p, 0, 7);
            long j4 = j3.f992a;
            boolean e3 = c0113p.e(j4);
            Object G3 = c0113p.G();
            if (e3 || G3 == C0105l.f2272a) {
                G3 = new A.c(j4, C0288u.b(j4, 0.4f));
                c0113p.a0(G3);
            }
            C0089d.b(new C0116q0[]{L.f1045a.a(j3), androidx.compose.foundation.c.f3610a.a(a3), E.C.f610a.a(M.f1053a), P0.f1080a.a(o03), A.d.f6a.a((A.c) G3), b1.f1200a.a(a1Var)}, Q.f.b(-1066563262, new C0060q(a1Var, 1, aVar), c0113p), c0113p, 56);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0033c0(j3, o03, a1Var, aVar, i3, 0);
        }
    }
}
