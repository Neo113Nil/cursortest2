package g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public int f3850a;

    /* renamed from: b, reason: collision with root package name */
    public u f3851b;

    /* renamed from: c, reason: collision with root package name */
    public c f3852c;

    /* renamed from: d, reason: collision with root package name */
    public q6.e f3853d;

    /* renamed from: e, reason: collision with root package name */
    public int f3854e;

    /* renamed from: f, reason: collision with root package name */
    public i.u f3855f;

    /* renamed from: g, reason: collision with root package name */
    public i.x f3856g;

    public p1(u uVar) {
        this.f3851b = uVar;
    }

    public static boolean a(e0 e0Var, i.x xVar) {
        r6.k.d(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        f2 f2Var = e0Var.f3717h;
        if (f2Var == null) {
            f2Var = t0.f3903k;
        }
        return !f2Var.a(e0Var.f().f3712f, xVar.e(e0Var));
    }

    public final boolean b() {
        if (this.f3851b != null) {
            c cVar = this.f3852c;
            if (cVar != null ? cVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final int c(Object obj) {
        int p6;
        u uVar = this.f3851b;
        if (uVar == null || (p6 = uVar.p(this, obj)) == 0) {
            return 1;
        }
        return p6;
    }

    public final void d() {
        u uVar = this.f3851b;
        if (uVar != null) {
            uVar.f3942t = true;
        }
        this.f3851b = null;
        this.f3855f = null;
        this.f3856g = null;
    }

    public final void e(boolean z8) {
        if (z8) {
            this.f3850a |= 32;
        } else {
            this.f3850a &= -33;
        }
    }
}
