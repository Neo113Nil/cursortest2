package b3;

import android.view.WindowInsets;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class i0 extends k0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f1338c;

    public i0() {
        this.f1338c = z0.b.f();
    }

    @Override // b3.k0
    public t0 b() {
        WindowInsets build;
        a();
        build = this.f1338c.build();
        t0 b9 = t0.b(null, build);
        b9.f1367a.p(this.f1343b);
        return b9;
    }

    @Override // b3.k0
    public void d(v2.c cVar) {
        this.f1338c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // b3.k0
    public void e(v2.c cVar) {
        this.f1338c.setStableInsets(cVar.d());
    }

    @Override // b3.k0
    public void f(v2.c cVar) {
        this.f1338c.setSystemGestureInsets(cVar.d());
    }

    @Override // b3.k0
    public void g(v2.c cVar) {
        this.f1338c.setSystemWindowInsets(cVar.d());
    }

    @Override // b3.k0
    public void h(v2.c cVar) {
        this.f1338c.setTappableElementInsets(cVar.d());
    }

    public i0(t0 t0Var) {
        super(t0Var);
        WindowInsets.Builder f9;
        WindowInsets a3 = t0Var.a();
        if (a3 != null) {
            f9 = a8.k.b(a3);
        } else {
            f9 = z0.b.f();
        }
        this.f1338c = f9;
    }
}
