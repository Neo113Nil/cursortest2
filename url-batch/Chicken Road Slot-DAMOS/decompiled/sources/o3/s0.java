package o3;

import android.view.WindowInsets;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class s0 extends y0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsets.Builder f7446e;

    public s0(k1 k1Var) {
        super(k1Var);
        WindowInsets b10 = k1Var.b();
        this.f7446e = b10 != null ? n1.f.e(b10) : n1.f.d();
    }

    @Override // o3.y0
    public k1 b() {
        WindowInsets build;
        a();
        build = this.f7446e.build();
        k1 c10 = k1.c(build, null);
        h3.b[] bVarArr = this.f7452b;
        h1 h1Var = c10.f7415a;
        h1Var.w(bVarArr);
        h1Var.v(null);
        h1Var.B(this.f7453c);
        h1Var.C(this.f7454d);
        return c10;
    }

    @Override // o3.y0
    public void e(h3.b bVar) {
        this.f7446e.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override // o3.y0
    public void f(h3.b bVar) {
        this.f7446e.setStableInsets(bVar.d());
    }

    @Override // o3.y0
    public void g(h3.b bVar) {
        this.f7446e.setSystemGestureInsets(bVar.d());
    }

    @Override // o3.y0
    public void h(h3.b bVar) {
        this.f7446e.setSystemWindowInsets(bVar.d());
    }

    @Override // o3.y0
    public void i(h3.b bVar) {
        this.f7446e.setTappableElementInsets(bVar.d());
    }

    public s0() {
        this.f7446e = n1.f.d();
    }
}
