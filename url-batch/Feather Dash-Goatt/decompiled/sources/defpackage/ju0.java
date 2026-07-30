package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ju0 extends zl0 implements ad0 {
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;

    @Override // defpackage.ad0
    public final wk0 P(ej0 ej0Var, qk0 qk0Var, long j) {
        int H = ej0Var.H(this.u) + ej0Var.H(this.s);
        int H2 = ej0Var.H(this.v) + ej0Var.H(this.t);
        zw0 c = qk0Var.c(nm.h(j, -H, -H2));
        return xk0.q(ej0Var, nm.f(c.d + H, j), nm.e(c.e + H2, j), new c(this, 14, c));
    }
}
