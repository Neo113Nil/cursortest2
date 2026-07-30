package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vd0 implements bf1 {
    public final fn0 a;
    public final /* synthetic */ xd0 b;
    public final /* synthetic */ Object c;

    public vd0(xd0 xd0Var, Object obj) {
        this.b = xd0Var;
        this.c = obj;
        int[] iArr = aa0.a;
        this.a = new fn0();
    }

    @Override // defpackage.bf1
    public final void a() {
        xd0.b(this.b, this.c);
    }

    @Override // defpackage.bf1
    public final int b() {
        jd0 jd0Var = (jd0) this.b.n.g(this.c);
        if (jd0Var != null) {
            return ((bo0) jd0Var.m()).d.g;
        }
        return 0;
    }

    @Override // defpackage.bf1
    public final void c(int i, long j) {
        xd0 xd0Var = this.b;
        jd0 jd0Var = (jd0) xd0Var.n.g(this.c);
        if (jd0Var == null || !jd0Var.F()) {
            return;
        }
        int i2 = ((bo0) jd0Var.m()).d.g;
        if (i < 0 || i >= i2) {
            o80.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (jd0Var.G()) {
            o80.a("Pre-measure called on node that is not placed");
        }
        jd0 jd0Var2 = xd0Var.d;
        jd0Var2.v = true;
        ((d4) md0.a(jd0Var)).u((jd0) ((bo0) jd0Var.m()).get(i), j);
        jd0Var2.v = false;
        this.a.a(i);
    }

    @Override // defpackage.bf1
    public final void d(l lVar) {
        l7 l7Var;
        zl0 zl0Var;
        jd0 jd0Var = (jd0) this.b.n.g(this.c);
        if (jd0Var == null || (l7Var = jd0Var.J) == null || (zl0Var = (zl0) l7Var.g) == null) {
            return;
        }
        ka0.I(zl0Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", lVar);
    }
}
