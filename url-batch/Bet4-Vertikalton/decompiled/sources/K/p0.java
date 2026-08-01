package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class p0 extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f492c;

    public p0() {
        this.f492c = B0.a.h();
    }

    @Override // K.r0
    public z0 b() {
        WindowInsets build;
        a();
        build = this.f492c.build();
        z0 g2 = z0.g(null, build);
        g2.f519a.o(this.f496b);
        return g2;
    }

    @Override // K.r0
    public void d(C.c cVar) {
        this.f492c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // K.r0
    public void e(C.c cVar) {
        this.f492c.setStableInsets(cVar.d());
    }

    @Override // K.r0
    public void f(C.c cVar) {
        this.f492c.setSystemGestureInsets(cVar.d());
    }

    @Override // K.r0
    public void g(C.c cVar) {
        this.f492c.setSystemWindowInsets(cVar.d());
    }

    @Override // K.r0
    public void h(C.c cVar) {
        this.f492c.setTappableElementInsets(cVar.d());
    }

    public p0(z0 z0Var) {
        super(z0Var);
        WindowInsets.Builder h;
        WindowInsets f2 = z0Var.f();
        if (f2 != null) {
            h = B0.a.i(f2);
        } else {
            h = B0.a.h();
        }
        this.f492c = h;
    }
}
