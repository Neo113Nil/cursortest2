package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ic extends zl0 {
    public hi1 s;
    public final /* synthetic */ jc t;

    public ic(jc jcVar) {
        this.t = jcVar;
    }

    @Override // defpackage.zl0
    public final void r0() {
        jc jcVar = this.t;
        jcVar.a = this;
        if (jcVar.b != null) {
            z0();
        }
    }

    @Override // defpackage.zl0
    public final void s0() {
        jc jcVar = this.t;
        if (jcVar.a == this) {
            jcVar.a = null;
        }
        hi1 hi1Var = this.s;
        if (hi1Var != null) {
            hi1Var.b();
        }
        this.s = null;
    }

    public final void z0() {
        c cVar = new c(this, 1, this.t);
        jd0 I = op.I(this);
        int i = I.e;
        u11 rectManager = ((d4) md0.a(I)).getRectManager();
        ii1 ii1Var = rectManager.b;
        ii1Var.getClass();
        en0 en0Var = ii1Var.a;
        hi1 hi1Var = new hi1(ii1Var, i, this, cVar);
        Object b = en0Var.b(i);
        if (b == null) {
            en0Var.h(i, hi1Var);
            b = hi1Var;
        }
        hi1 hi1Var2 = (hi1) b;
        if (hi1Var2 != hi1Var) {
            while (true) {
                hi1 hi1Var3 = hi1Var2.d;
                if (hi1Var3 == null) {
                    break;
                } else {
                    hi1Var2 = hi1Var3;
                }
            }
            hi1Var2.d = hi1Var;
        }
        if (op.I(this.d).l) {
            rectManager.a.e(i, true);
        }
        rectManager.d = true;
        rectManager.j();
        this.s = hi1Var;
    }
}
