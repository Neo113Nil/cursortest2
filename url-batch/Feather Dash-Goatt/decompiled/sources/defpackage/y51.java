package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class y51 implements sg0, AutoCloseable {
    public final String d;
    public final x51 e;
    public boolean g;

    public y51(String str, x51 x51Var) {
        this.d = str;
        this.e = x51Var;
    }

    public final void d(xg0 xg0Var, c51 c51Var) {
        c51Var.getClass();
        xg0Var.getClass();
        if (this.g) {
            dd0.j("Already attached to lifecycleOwner");
            return;
        }
        this.g = true;
        xg0Var.a(this);
        c51Var.k(this.d, (oj) this.e.a.i);
    }

    @Override // defpackage.sg0
    public final void e(vg0 vg0Var, ng0 ng0Var) {
        if (ng0Var == ng0.ON_DESTROY) {
            this.g = false;
            vg0Var.f().f(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
