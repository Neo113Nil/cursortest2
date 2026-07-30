package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class he extends zl0 implements be, sc0 {
    public wm s;
    public boolean t;

    public static final s11 z0(he heVar, qp0 qp0Var, w3 w3Var) {
        s11 s11Var;
        if (heVar.r && heVar.t) {
            qp0 H = op.H(heVar);
            if (!qp0Var.J0().r) {
                qp0Var = null;
            }
            if (qp0Var != null && (s11Var = (s11) w3Var.invoke()) != null) {
                float f = H.J(qp0Var, false).a;
                return s11Var.e((Float.floatToRawIntBits(r4.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            }
        }
        return null;
    }

    @Override // defpackage.be
    public final Object c0(qp0 qp0Var, w3 w3Var, sf1 sf1Var) {
        Object A = la0.A(new ge(this, qp0Var, w3Var, new kc(this, qp0Var, w3Var, 1), null), sf1Var);
        return A == tn.d ? A : Unit.a;
    }

    @Override // defpackage.sc0
    public final void g(uc0 uc0Var) {
        this.t = true;
    }

    @Override // defpackage.zl0
    public final boolean o0() {
        return false;
    }
}
