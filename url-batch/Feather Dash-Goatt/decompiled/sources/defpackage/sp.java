package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sp extends zl0 implements gu {
    public final gn0 s;
    public boolean t;
    public boolean u;
    public boolean v;

    public sp(gn0 gn0Var) {
        this.s = gn0Var;
    }

    @Override // defpackage.gu
    public final void F(ld0 ld0Var) {
        ld0Var.a();
        zf zfVar = ld0Var.d;
        if (this.t) {
            hu.V(ld0Var, hi.b(0.3f, hi.b), 0L, zfVar.x(), 122);
        } else if (this.u || this.v) {
            hu.V(ld0Var, hi.b(0.1f, hi.b), 0L, zfVar.x(), 122);
        }
    }

    @Override // defpackage.zl0
    public final void r0() {
        uq1.N(n0(), null, new rp(this, (dn) null, 0), 3);
    }
}
