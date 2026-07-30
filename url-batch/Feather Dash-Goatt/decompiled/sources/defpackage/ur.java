package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ur extends e90 implements ad0 {
    public ro1 u;
    public j61 v;
    public ro1 w;

    @Override // defpackage.ad0
    public final wk0 P(ej0 ej0Var, qk0 qk0Var, long j) {
        int intValue = ((Number) this.v.b(this.w, ej0Var)).intValue();
        if (intValue == 0) {
            return xk0.q(ej0Var, 0, 0, new q1(6));
        }
        zw0 c = qk0Var.c(mm.a(j, 0, 0, intValue, intValue, 3));
        return xk0.q(ej0Var, c.d, intValue, new aa(c, 1));
    }

    @Override // defpackage.e90
    public final void z0() {
        ro1 ro1Var = this.u;
        ro1 ro1Var2 = this.s;
        this.w = new mw(ro1Var, ro1Var2);
        this.t = ro1Var2;
        ka0.I(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new d90(this, 0));
        y90.t(this);
    }
}
