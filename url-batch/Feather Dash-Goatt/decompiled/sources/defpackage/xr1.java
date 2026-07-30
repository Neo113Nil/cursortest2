package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xr1 extends vr1 {
    public final /* synthetic */ ng1 e;
    public final /* synthetic */ dr1 g;
    public final /* synthetic */ br1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr1(br1 br1Var, ng1 ng1Var, ng1 ng1Var2, dr1 dr1Var) {
        super(ng1Var);
        this.h = br1Var;
        this.e = ng1Var2;
        this.g = dr1Var;
    }

    @Override // defpackage.vr1
    public final void b() {
        synchronized (this.h.f) {
            try {
                br1 br1Var = this.h;
                ng1 ng1Var = this.e;
                br1Var.e.add(ng1Var);
                ng1Var.a.addOnCompleteListener(new c51(br1Var, 13, ng1Var));
                if (this.h.l.getAndIncrement() > 0) {
                    this.h.b.a("Already connected to the service.", new Object[0]);
                }
                br1.b(this.h, this.g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
