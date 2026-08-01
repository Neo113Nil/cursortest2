package L;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class p0 extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f561c;

    public p0() {
        this.f561c = A1.k.g();
    }

    @Override // L.r0
    public z0 b() {
        WindowInsets build;
        a();
        build = this.f561c.build();
        z0 g2 = z0.g(null, build);
        g2.f589a.o(this.f565b);
        return g2;
    }

    @Override // L.r0
    public void d(D.c cVar) {
        this.f561c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // L.r0
    public void e(D.c cVar) {
        this.f561c.setStableInsets(cVar.d());
    }

    @Override // L.r0
    public void f(D.c cVar) {
        this.f561c.setSystemGestureInsets(cVar.d());
    }

    @Override // L.r0
    public void g(D.c cVar) {
        this.f561c.setSystemWindowInsets(cVar.d());
    }

    @Override // L.r0
    public void h(D.c cVar) {
        this.f561c.setTappableElementInsets(cVar.d());
    }

    public p0(z0 z0Var) {
        super(z0Var);
        WindowInsets.Builder g2;
        WindowInsets f2 = z0Var.f();
        if (f2 != null) {
            g2 = A1.k.h(f2);
        } else {
            g2 = A1.k.g();
        }
        this.f561c = g2;
    }
}
