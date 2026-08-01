package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class r0 extends t0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f497c;

    public r0() {
        this.f497c = C.b.e();
    }

    @Override // K.t0
    public B0 b() {
        WindowInsets build;
        a();
        build = this.f497c.build();
        B0 g2 = B0.g(null, build);
        g2.f395a.o(this.f499b);
        return g2;
    }

    @Override // K.t0
    public void d(C.d dVar) {
        this.f497c.setMandatorySystemGestureInsets(dVar.d());
    }

    @Override // K.t0
    public void e(C.d dVar) {
        this.f497c.setStableInsets(dVar.d());
    }

    @Override // K.t0
    public void f(C.d dVar) {
        this.f497c.setSystemGestureInsets(dVar.d());
    }

    @Override // K.t0
    public void g(C.d dVar) {
        this.f497c.setSystemWindowInsets(dVar.d());
    }

    @Override // K.t0
    public void h(C.d dVar) {
        this.f497c.setTappableElementInsets(dVar.d());
    }

    public r0(B0 b02) {
        super(b02);
        WindowInsets.Builder e2;
        WindowInsets f2 = b02.f();
        if (f2 != null) {
            e2 = C.b.f(f2);
        } else {
            e2 = C.b.e();
        }
        this.f497c = e2;
    }
}
