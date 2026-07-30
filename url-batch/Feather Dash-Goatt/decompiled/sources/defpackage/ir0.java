package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ir0 implements sg0, rf {
    public final xg0 d;
    public final qc e;
    public jr0 g;
    public final /* synthetic */ kr0 h;

    public ir0(kr0 kr0Var, xg0 xg0Var, qc qcVar) {
        qcVar.getClass();
        this.h = kr0Var;
        this.d = xg0Var;
        this.e = qcVar;
        xg0Var.a(this);
    }

    @Override // defpackage.rf
    public final void cancel() {
        this.d.f(this);
        qc qcVar = this.e;
        qcVar.getClass();
        qcVar.b.remove(this);
        jr0 jr0Var = this.g;
        if (jr0Var != null) {
            jr0Var.cancel();
        }
        this.g = null;
    }

    @Override // defpackage.sg0
    public final void e(vg0 vg0Var, ng0 ng0Var) {
        if (ng0Var != ng0.ON_START) {
            if (ng0Var != ng0.ON_STOP) {
                if (ng0Var == ng0.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                jr0 jr0Var = this.g;
                if (jr0Var != null) {
                    jr0Var.cancel();
                    return;
                }
                return;
            }
        }
        kr0 kr0Var = this.h;
        kr0Var.getClass();
        qc qcVar = this.e;
        qcVar.getClass();
        kr0Var.b.addLast(qcVar);
        jr0 jr0Var2 = new jr0(kr0Var, qcVar);
        qcVar.b.add(jr0Var2);
        kr0Var.c();
        qcVar.c = new v3(0, kr0Var, kr0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 10);
        this.g = jr0Var2;
    }
}
