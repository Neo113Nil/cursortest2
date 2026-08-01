package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class m0 extends o0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f421c;

    public m0() {
        this.f421c = A0.a.g();
    }

    @Override // K.o0
    public w0 b() {
        WindowInsets build;
        a();
        build = this.f421c.build();
        w0 g2 = w0.g(null, build);
        g2.f449a.o(this.f427b);
        return g2;
    }

    @Override // K.o0
    public void d(C.c cVar) {
        this.f421c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // K.o0
    public void e(C.c cVar) {
        this.f421c.setStableInsets(cVar.d());
    }

    @Override // K.o0
    public void f(C.c cVar) {
        this.f421c.setSystemGestureInsets(cVar.d());
    }

    @Override // K.o0
    public void g(C.c cVar) {
        this.f421c.setSystemWindowInsets(cVar.d());
    }

    @Override // K.o0
    public void h(C.c cVar) {
        this.f421c.setTappableElementInsets(cVar.d());
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
        this.f421c = g2;
    }
}
