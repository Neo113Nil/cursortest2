package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class za0 extends fb0 {
    public final WindowInsets.Builder e;

    public za0(rb0 rb0Var) {
        super(rb0Var);
        WindowInsets f = rb0Var.f();
        this.e = f != null ? f70.h(f) : f70.g();
    }

    @Override // defpackage.fb0
    public rb0 b() {
        WindowInsets build;
        a();
        build = this.e.build();
        rb0 g = rb0.g(null, build);
        to[] toVarArr = this.b;
        ob0 ob0Var = g.a;
        ob0Var.u(toVarArr);
        ob0Var.t(null);
        ob0Var.y(this.c);
        ob0Var.z(this.d);
        return g;
    }

    @Override // defpackage.fb0
    public void e(to toVar) {
        this.e.setMandatorySystemGestureInsets(toVar.e());
    }

    @Override // defpackage.fb0
    public void f(to toVar) {
        this.e.setStableInsets(toVar.e());
    }

    @Override // defpackage.fb0
    public void g(to toVar) {
        this.e.setSystemGestureInsets(toVar.e());
    }

    @Override // defpackage.fb0
    public void h(to toVar) {
        this.e.setSystemWindowInsets(toVar.e());
    }

    @Override // defpackage.fb0
    public void i(to toVar) {
        this.e.setTappableElementInsets(toVar.e());
    }

    public za0() {
        this.e = f70.g();
    }
}
