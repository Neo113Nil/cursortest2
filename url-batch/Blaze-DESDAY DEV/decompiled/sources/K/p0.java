package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class p0 extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f509c;

    public p0() {
        this.f509c = A1.a.g();
    }

    @Override // K.r0
    public z0 b() {
        WindowInsets build;
        a();
        build = this.f509c.build();
        z0 g2 = z0.g(null, build);
        g2.f536a.o(this.f513b);
        return g2;
    }

    @Override // K.r0
    public void d(C.c cVar) {
        this.f509c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // K.r0
    public void e(C.c cVar) {
        this.f509c.setStableInsets(cVar.d());
    }

    @Override // K.r0
    public void f(C.c cVar) {
        this.f509c.setSystemGestureInsets(cVar.d());
    }

    @Override // K.r0
    public void g(C.c cVar) {
        this.f509c.setSystemWindowInsets(cVar.d());
    }

    @Override // K.r0
    public void h(C.c cVar) {
        this.f509c.setTappableElementInsets(cVar.d());
    }

    public p0(z0 z0Var) {
        super(z0Var);
        WindowInsets.Builder g2;
        WindowInsets f2 = z0Var.f();
        if (f2 != null) {
            g2 = A1.a.h(f2);
        } else {
            g2 = A1.a.g();
        }
        this.f509c = g2;
    }
}
