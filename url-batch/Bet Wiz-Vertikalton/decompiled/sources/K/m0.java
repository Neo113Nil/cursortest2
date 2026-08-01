package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class m0 extends o0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f481c;

    public m0() {
        this.f481c = A0.a.g();
    }

    @Override // K.o0
    public w0 b() {
        WindowInsets build;
        a();
        build = this.f481c.build();
        w0 g2 = w0.g(null, build);
        g2.f509a.o(this.f487b);
        return g2;
    }

    @Override // K.o0
    public void d(C.c cVar) {
        this.f481c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // K.o0
    public void e(C.c cVar) {
        this.f481c.setStableInsets(cVar.d());
    }

    @Override // K.o0
    public void f(C.c cVar) {
        this.f481c.setSystemGestureInsets(cVar.d());
    }

    @Override // K.o0
    public void g(C.c cVar) {
        this.f481c.setSystemWindowInsets(cVar.d());
    }

    @Override // K.o0
    public void h(C.c cVar) {
        this.f481c.setTappableElementInsets(cVar.d());
    }

    public m0(w0 w0Var) {
        super(w0Var);
        WindowInsets.Builder g2;
        WindowInsets f2 = w0Var.f();
        if (f2 != null) {
            g2 = A0.a.h(f2);
        } else {
            g2 = A0.a.g();
        }
        this.f481c = g2;
    }
}
