package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class n0 extends p0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f444c;

    public n0() {
        this.f444c = C.b.e();
    }

    @Override // K.p0
    public x0 b() {
        WindowInsets build;
        a();
        build = this.f444c.build();
        x0 g2 = x0.g(null, build);
        g2.f468a.o(this.f446b);
        return g2;
    }

    @Override // K.p0
    public void d(C.d dVar) {
        this.f444c.setMandatorySystemGestureInsets(dVar.d());
    }

    @Override // K.p0
    public void e(C.d dVar) {
        this.f444c.setStableInsets(dVar.d());
    }

    @Override // K.p0
    public void f(C.d dVar) {
        this.f444c.setSystemGestureInsets(dVar.d());
    }

    @Override // K.p0
    public void g(C.d dVar) {
        this.f444c.setSystemWindowInsets(dVar.d());
    }

    @Override // K.p0
    public void h(C.d dVar) {
        this.f444c.setTappableElementInsets(dVar.d());
    }

    public n0(x0 x0Var) {
        super(x0Var);
        WindowInsets.Builder e2;
        WindowInsets f2 = x0Var.f();
        if (f2 != null) {
            e2 = C.b.f(f2);
        } else {
            e2 = C.b.e();
        }
        this.f444c = e2;
    }
}
