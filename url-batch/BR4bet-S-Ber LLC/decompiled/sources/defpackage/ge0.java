package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class ge0 extends me0 {
    public final WindowInsets.Builder e;

    public ge0(ye0 ye0Var) {
        super(ye0Var);
        WindowInsets f = ye0Var.f();
        this.e = f != null ? ma0.h(f) : ma0.g();
    }

    @Override // defpackage.me0
    public ye0 b() {
        WindowInsets build;
        a();
        build = this.e.build();
        ye0 g = ye0.g(null, build);
        er[] erVarArr = this.b;
        ve0 ve0Var = g.a;
        ve0Var.u(erVarArr);
        ve0Var.t(null);
        ve0Var.y(this.c);
        ve0Var.z(this.d);
        return g;
    }

    @Override // defpackage.me0
    public void e(er erVar) {
        this.e.setMandatorySystemGestureInsets(erVar.e());
    }

    @Override // defpackage.me0
    public void f(er erVar) {
        this.e.setStableInsets(erVar.e());
    }

    @Override // defpackage.me0
    public void g(er erVar) {
        this.e.setSystemGestureInsets(erVar.e());
    }

    @Override // defpackage.me0
    public void h(er erVar) {
        this.e.setSystemWindowInsets(erVar.e());
    }

    @Override // defpackage.me0
    public void i(er erVar) {
        this.e.setTappableElementInsets(erVar.e());
    }

    public ge0() {
        this.e = ma0.g();
    }
}
