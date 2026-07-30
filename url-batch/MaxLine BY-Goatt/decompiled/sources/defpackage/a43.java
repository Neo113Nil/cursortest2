package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a43 extends xy1 {
    public final lz1 r = ij2.j(new ql2(0));
    public final lz1 s = ij2.j(Boolean.FALSE);
    public final u33 t;
    public final iz1 u;
    public float v;
    public mo w;
    public int x;

    public a43(ow0 ow0Var) {
        u33 u33Var = new u33(ow0Var);
        u33Var.f = new ng2(5, this);
        this.t = u33Var;
        this.u = new iz1(0);
        this.v = 1.0f;
        this.x = -1;
    }

    @Override // defpackage.xy1
    public final boolean b(float f) {
        this.v = f;
        return true;
    }

    @Override // defpackage.xy1
    public final boolean e(mo moVar) {
        this.w = moVar;
        return true;
    }

    @Override // defpackage.xy1
    public final long h() {
        return ((ql2) this.r.getValue()).a;
    }

    @Override // defpackage.xy1
    public final void i(yd0 yd0Var) {
        mo moVar = this.w;
        u33 u33Var = this.t;
        if (moVar == null) {
            moVar = (mo) u33Var.g.getValue();
        }
        if (((Boolean) this.s.getValue()).booleanValue() && yd0Var.getLayoutDirection() == u81.n) {
            long Z = yd0Var.Z();
            mh F = yd0Var.F();
            long v = F.v();
            F.o().m();
            try {
                ((ar0) F.n).y(-1.0f, 1.0f, Z);
                u33Var.e(yd0Var, this.v, moVar);
            } finally {
                F.o().j();
                F.J(v);
            }
        } else {
            u33Var.e(yd0Var, this.v, moVar);
        }
        this.x = this.u.h();
    }
}
