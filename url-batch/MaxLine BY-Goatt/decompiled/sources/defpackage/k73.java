package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class k73 extends q73 {
    public final WindowInsets.Builder e;

    public k73(c83 c83Var) {
        super(c83Var);
        WindowInsets b = c83Var.b();
        this.e = b != null ? no.d(b) : no.c();
    }

    @Override // defpackage.q73
    public c83 b() {
        a();
        c83 c = c83.c(null, this.e.build());
        z21[] z21VarArr = this.b;
        z73 z73Var = c.a;
        z73Var.v(z21VarArr);
        z73Var.u(null);
        z73Var.z(this.c);
        z73Var.A(this.d);
        return c;
    }

    @Override // defpackage.q73
    public void e(z21 z21Var) {
        this.e.setMandatorySystemGestureInsets(z21Var.d());
    }

    @Override // defpackage.q73
    public void f(z21 z21Var) {
        this.e.setStableInsets(z21Var.d());
    }

    @Override // defpackage.q73
    public void g(z21 z21Var) {
        this.e.setSystemGestureInsets(z21Var.d());
    }

    @Override // defpackage.q73
    public void h(z21 z21Var) {
        this.e.setSystemWindowInsets(z21Var.d());
    }

    @Override // defpackage.q73
    public void i(z21 z21Var) {
        this.e.setTappableElementInsets(z21Var.d());
    }

    public k73() {
        this.e = no.c();
    }
}
