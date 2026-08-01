package M;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class j0 extends l0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f766c;

    public j0() {
        this.f766c = F0.a.g();
    }

    @Override // M.l0
    public t0 b() {
        WindowInsets build;
        a();
        build = this.f766c.build();
        t0 g2 = t0.g(null, build);
        g2.f794a.o(this.f772b);
        return g2;
    }

    @Override // M.l0
    public void d(E.c cVar) {
        this.f766c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // M.l0
    public void e(E.c cVar) {
        this.f766c.setStableInsets(cVar.d());
    }

    @Override // M.l0
    public void f(E.c cVar) {
        this.f766c.setSystemGestureInsets(cVar.d());
    }

    @Override // M.l0
    public void g(E.c cVar) {
        this.f766c.setSystemWindowInsets(cVar.d());
    }

    @Override // M.l0
    public void h(E.c cVar) {
        this.f766c.setTappableElementInsets(cVar.d());
    }

    public j0(t0 t0Var) {
        super(t0Var);
        WindowInsets.Builder g2;
        WindowInsets f2 = t0Var.f();
        if (f2 != null) {
            g2 = F0.a.h(f2);
        } else {
            g2 = F0.a.g();
        }
        this.f766c = g2;
    }
}
