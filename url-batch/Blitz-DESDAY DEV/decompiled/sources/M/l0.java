package M;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class l0 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f568c;

    public l0() {
        this.f568c = A1.a.g();
    }

    @Override // M.n0
    public v0 b() {
        WindowInsets build;
        a();
        build = this.f568c.build();
        v0 g2 = v0.g(null, build);
        g2.f596a.o(this.f574b);
        return g2;
    }

    @Override // M.n0
    public void d(E.c cVar) {
        this.f568c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // M.n0
    public void e(E.c cVar) {
        this.f568c.setStableInsets(cVar.d());
    }

    @Override // M.n0
    public void f(E.c cVar) {
        this.f568c.setSystemGestureInsets(cVar.d());
    }

    @Override // M.n0
    public void g(E.c cVar) {
        this.f568c.setSystemWindowInsets(cVar.d());
    }

    @Override // M.n0
    public void h(E.c cVar) {
        this.f568c.setTappableElementInsets(cVar.d());
    }

    public l0(v0 v0Var) {
        super(v0Var);
        WindowInsets.Builder g2;
        WindowInsets f2 = v0Var.f();
        if (f2 != null) {
            g2 = A1.a.h(f2);
        } else {
            g2 = A1.a.g();
        }
        this.f568c = g2;
    }
}
