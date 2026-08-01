package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class m0 extends o0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f640c;

    public m0() {
        this.f640c = C.b.g();
    }

    @Override // K.o0
    public w0 b() {
        WindowInsets build;
        a();
        build = this.f640c.build();
        w0 g2 = w0.g(null, build);
        g2.f668a.o(this.f644b);
        return g2;
    }

    @Override // K.o0
    public void d(C.d dVar) {
        this.f640c.setMandatorySystemGestureInsets(dVar.d());
    }

    @Override // K.o0
    public void e(C.d dVar) {
        this.f640c.setStableInsets(dVar.d());
    }

    @Override // K.o0
    public void f(C.d dVar) {
        this.f640c.setSystemGestureInsets(dVar.d());
    }

    @Override // K.o0
    public void g(C.d dVar) {
        this.f640c.setSystemWindowInsets(dVar.d());
    }

    @Override // K.o0
    public void h(C.d dVar) {
        this.f640c.setTappableElementInsets(dVar.d());
    }

    public m0(w0 w0Var) {
        super(w0Var);
        WindowInsets.Builder g2;
        WindowInsets f2 = w0Var.f();
        if (f2 != null) {
            g2 = C.b.h(f2);
        } else {
            g2 = C.b.g();
        }
        this.f640c = g2;
    }
}
