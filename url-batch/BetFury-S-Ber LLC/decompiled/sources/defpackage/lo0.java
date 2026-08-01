package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class lo0 extends ro0 {
    public final WindowInsets.Builder e;

    public lo0(dp0 dp0Var) {
        super(dp0Var);
        WindowInsets f = dp0Var.f();
        this.e = f != null ? hk0.h(f) : hk0.g();
    }

    @Override // defpackage.ro0
    public dp0 b() {
        WindowInsets build;
        a();
        build = this.e.build();
        dp0 g = dp0.g(null, build);
        fv[] fvVarArr = this.b;
        ap0 ap0Var = g.a;
        ap0Var.u(fvVarArr);
        ap0Var.t(null);
        ap0Var.y(this.c);
        ap0Var.z(this.d);
        return g;
    }

    @Override // defpackage.ro0
    public void e(fv fvVar) {
        this.e.setMandatorySystemGestureInsets(fvVar.e());
    }

    @Override // defpackage.ro0
    public void f(fv fvVar) {
        this.e.setStableInsets(fvVar.e());
    }

    @Override // defpackage.ro0
    public void g(fv fvVar) {
        this.e.setSystemGestureInsets(fvVar.e());
    }

    @Override // defpackage.ro0
    public void h(fv fvVar) {
        this.e.setSystemWindowInsets(fvVar.e());
    }

    @Override // defpackage.ro0
    public void i(fv fvVar) {
        this.e.setTappableElementInsets(fvVar.e());
    }

    public lo0() {
        this.e = hk0.g();
    }
}
