package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class ib0 extends ob0 {
    public final WindowInsets.Builder e;

    public ib0(ac0 ac0Var) {
        super(ac0Var);
        WindowInsets f = ac0Var.f();
        this.e = f != null ? m70.g(f) : m70.f();
    }

    @Override // defpackage.ob0
    public ac0 b() {
        WindowInsets build;
        a();
        build = this.e.build();
        ac0 g = ac0.g(null, build);
        ip[] ipVarArr = this.b;
        xb0 xb0Var = g.a;
        xb0Var.u(ipVarArr);
        xb0Var.t(null);
        xb0Var.y(this.c);
        xb0Var.z(this.d);
        return g;
    }

    @Override // defpackage.ob0
    public void e(ip ipVar) {
        this.e.setMandatorySystemGestureInsets(ipVar.e());
    }

    @Override // defpackage.ob0
    public void f(ip ipVar) {
        this.e.setStableInsets(ipVar.e());
    }

    @Override // defpackage.ob0
    public void g(ip ipVar) {
        this.e.setSystemGestureInsets(ipVar.e());
    }

    @Override // defpackage.ob0
    public void h(ip ipVar) {
        this.e.setSystemWindowInsets(ipVar.e());
    }

    @Override // defpackage.ob0
    public void i(ip ipVar) {
        this.e.setTappableElementInsets(ipVar.e());
    }

    public ib0() {
        this.e = m70.f();
    }
}
