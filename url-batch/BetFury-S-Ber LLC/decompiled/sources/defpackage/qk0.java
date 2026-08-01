package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class qk0 extends vb0 {
    public final ThreadLocal j;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qk0(qg qgVar, eg egVar) {
        super(qgVar.w(r0) == null ? qgVar.r(r0) : qgVar, egVar);
        rk0 rk0Var = rk0.f;
        this.j = new ThreadLocal();
        qg qgVar2 = egVar.g;
        qgVar2.getClass();
        if (qgVar2.w(sl.g) instanceof tg) {
            return;
        }
        Object U = gk0.U(qgVar, null);
        gk0.J(qgVar, U);
        T(qgVar, U);
    }

    public final boolean S() {
        boolean z = this.threadLocalIsSet && this.j.get() == null;
        this.j.remove();
        return !z;
    }

    public final void T(qg qgVar, Object obj) {
        this.threadLocalIsSet = true;
        this.j.set(new k50(qgVar, obj));
    }

    @Override // defpackage.vb0, defpackage.mw
    public final void b(Object obj) {
        if (this.threadLocalIsSet) {
            k50 k50Var = (k50) this.j.get();
            if (k50Var != null) {
                gk0.J((qg) k50Var.f, k50Var.g);
            }
            this.j.remove();
        }
        Object P = d50.P(obj);
        eg egVar = this.i;
        qg qgVar = egVar.g;
        qgVar.getClass();
        Object U = gk0.U(qgVar, null);
        qk0 c0 = U != gk0.o ? d50.c0(egVar, qgVar, U) : null;
        try {
            this.i.e(P);
            if (c0 == null || c0.S()) {
                gk0.J(qgVar, U);
            }
        } catch (Throwable th) {
            if (c0 == null || c0.S()) {
                gk0.J(qgVar, U);
            }
            throw th;
        }
    }
}
