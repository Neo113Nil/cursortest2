package F;

import I.C0167p;

/* loaded from: classes.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1920a = H.t.f2495a;

    static {
        int i3 = H.r.f2490a;
        int i4 = H.q.f2489a;
    }

    public static y1 a(C0167p c0167p) {
        M m3 = (M) c0167p.k(O.f1301a);
        y1 y1Var = m3.f1233M;
        if (y1Var != null) {
            return y1Var;
        }
        int i3 = H.s.f2491a;
        y1 y1Var2 = new y1(O.c(m3, 35), O.c(m3, H.s.f2493c), O.c(m3, H.s.f2492b), O.c(m3, H.s.f2491a), O.c(m3, H.s.f2494d));
        m3.f1233M = y1Var2;
        return y1Var2;
    }
}
