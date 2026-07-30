package g4;

import d0.a4;
import d0.s1;
import g0.p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0.q0 f4306a;

    static {
        long d8 = z0.l0.d(4294965488L);
        long d9 = z0.l0.d(4281017890L);
        long d10 = z0.l0.d(4293219133L);
        long d11 = z0.l0.d(4283210346L);
        long d12 = z0.l0.d(4292448090L);
        long d13 = z0.l0.d(4294967295L);
        long d14 = z0.l0.d(4294043612L);
        long d15 = z0.l0.d(4285226836L);
        long j8 = z0.u.f10053c;
        f4306a = d0.s0.e(d10, j8, d11, j8, d12, d8, d9, d13, d9, d14, d15, -516708);
    }

    public static final void a(o0.a aVar, g0.p pVar, int i7) {
        o0.a aVar2;
        g0.p pVar2;
        pVar.S(1431843459);
        if ((i7 & 3) == 2 && pVar.x()) {
            pVar.L();
            aVar2 = aVar;
            pVar2 = pVar;
        } else {
            aVar2 = aVar;
            pVar2 = pVar;
            s1.a(f4306a, null, new a4(), aVar2, pVar2, 3462);
        }
        p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new g1(aVar2, i7);
        }
    }
}
