package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class s1 {
    static {
        new g0.r0(r0.f2349m);
    }

    public static final void a(q0 q0Var, n3 n3Var, a4 a4Var, o0.a aVar, g0.p pVar, int i7) {
        int i8;
        n3 n3Var2;
        pVar.S(-2127166334);
        if ((i7 & 6) == 0) {
            i8 = (pVar.f(q0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.f(a4Var) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= pVar.h(aVar) ? 2048 : 1024;
        }
        if ((i8 & 1171) == 1170 && pVar.x()) {
            pVar.L();
            n3Var2 = n3Var;
        } else {
            pVar.N();
            if ((i7 & 1) == 0 || pVar.w()) {
                n3Var2 = (n3) pVar.k(o3.f2267a);
            } else {
                pVar.L();
                n3Var2 = n3Var;
            }
            pVar.q();
            m.g0 a3 = e3.a(0.0f, pVar, 0, 7);
            long j8 = q0Var.f2300a;
            boolean e9 = pVar.e(j8);
            Object G = pVar.G();
            if (e9 || G == g0.l.f3784a) {
                G = new a0.g1(j8, z0.u.b(j8, 0.4f));
                pVar.a0(G);
            }
            g0.d.b(new g0.n1[]{s0.f2378a.a(q0Var), androidx.compose.foundation.d.f604a.a(a3), c0.t.f1504a.a(t0.f2397a), o3.f2267a.a(n3Var2), a0.h1.f83a.a((a0.g1) G), b4.f1865a.a(a4Var)}, o0.f.b(-1066563262, new b0(a4Var, 1, aVar), pVar), pVar, 56);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new l(q0Var, n3Var2, a4Var, aVar, i7, 1);
        }
    }
}
