package b6;

import android.content.res.Configuration;
import j0.o2;
import j0.p2;
import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0.b0 f1299a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0.b0 f1300b;

    static {
        long c8 = f1.p.c(4280171103L);
        long c9 = f1.p.c(4294309882L);
        long c10 = f1.p.c(4290303203L);
        long c11 = f1.p.c(4292030255L);
        long c12 = f1.p.c(4294951175L);
        long c13 = f1.p.c(4283076772L);
        long c14 = f1.p.c(4293128957L);
        long c15 = f1.p.c(4280961647L);
        u2 u2Var = j0.c0.f3599a;
        f1299a = new j0.b0(c10, c8, l0.c.f4483t, l0.c.f4472h, l0.c.f4468d, c13, c9, l0.c.f4487x, l0.c.f4474k, c12, c8, l0.c.I, l0.c.f4478o, c8, c9, c15, c9, l0.c.H, l0.c.f4477n, c10, l0.c.f4469e, l0.c.f4467c, l0.c.f4465a, l0.c.f4470f, l0.c.f4466b, l0.c.f4471g, l0.c.f4481r, l0.c.f4482s, l0.c.f4486w, l0.c.A, l0.c.G, l0.c.B, l0.c.C, l0.c.D, l0.c.E, l0.c.F, l0.c.f4484u, l0.c.f4485v, l0.c.i, l0.c.f4473j, l0.c.f4488y, l0.c.f4489z, l0.c.f4475l, l0.c.f4476m, l0.c.J, l0.c.K, l0.c.f4479p, l0.c.f4480q);
        f1300b = j0.c0.e(c8, c9, c13, c9, c11, c9, c14, c8, c9, c8, -124516);
    }

    public static final void a(boolean z3, u0.c cVar, m0.s sVar, int i) {
        u0.c cVar2;
        m0.s sVar2;
        sVar.W(-1760205601);
        int i8 = i | 2;
        if (sVar.N(i8 & 1, (i8 & 19) != 18)) {
            sVar.S();
            if ((i & 1) == 0 || sVar.x()) {
                z3 = (((Configuration) sVar.j(x1.k0.f8487a)).uiMode & 48) == 32;
            } else {
                sVar.Q();
            }
            sVar.q();
            cVar2 = cVar;
            sVar2 = sVar;
            j0.z0.b(z3 ? f1299a : f1300b, null, (o2) sVar.j(p2.f3856a), cVar2, sVar2, 3072);
        } else {
            cVar2 = cVar;
            sVar2 = sVar;
            sVar2.Q();
        }
        m0.t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new c2(z3, cVar2, i, 0);
        }
    }
}
