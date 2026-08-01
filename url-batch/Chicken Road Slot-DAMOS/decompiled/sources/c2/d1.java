package c2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d1 implements e1 {
    public static final int g(int i3, long j) {
        int i10 = a2.f1489b;
        return ((int) (j >> (i3 * 15))) & 32767;
    }

    @Override // c2.e1
    public void a(g0 g0Var, long j, o oVar, int i3, boolean z10) {
        b1 b1Var = g0Var.S;
        i1 i1Var = (i1) b1Var.f1494e;
        k1.d0 d0Var = i1.Z;
        ((i1) b1Var.f1494e).I0(i1.f1589c0, i1Var.A0(j), oVar, 1, z10);
    }

    @Override // c2.e1
    public boolean b(d1.k kVar) {
        return false;
    }

    @Override // c2.e1
    public boolean c(o oVar, g0 g0Var) {
        return false;
    }

    @Override // c2.e1
    public int d() {
        return 8;
    }

    @Override // c2.e1
    public boolean e(g0 g0Var) {
        j2.j u2 = g0Var.u();
        boolean z10 = false;
        if (u2 != null && u2.f4978r) {
            z10 = true;
        }
        return !z10;
    }

    @Override // c2.e1
    public boolean f(d1.k kVar) {
        return j2.p.h(j2.p.a(k.u(kVar), false));
    }
}
