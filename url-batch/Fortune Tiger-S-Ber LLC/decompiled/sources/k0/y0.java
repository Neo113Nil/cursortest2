package k0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class y0 extends b1 {
    public final WindowInsets.Builder c;

    public y0() {
        this.c = androidx.activity.v.f();
    }

    @Override // k0.b1
    public m1 b() {
        WindowInsets build;
        a();
        build = this.c.build();
        m1 g = m1.g(null, build);
        g.f2760a.p(this.f2717b);
        return g;
    }

    @Override // k0.b1
    public void d(c0.c cVar) {
        this.c.setMandatorySystemGestureInsets(cVar.e());
    }

    @Override // k0.b1
    public void e(c0.c cVar) {
        this.c.setStableInsets(cVar.e());
    }

    @Override // k0.b1
    public void f(c0.c cVar) {
        this.c.setSystemGestureInsets(cVar.e());
    }

    @Override // k0.b1
    public void g(c0.c cVar) {
        this.c.setSystemWindowInsets(cVar.e());
    }

    @Override // k0.b1
    public void h(c0.c cVar) {
        this.c.setTappableElementInsets(cVar.e());
    }

    public y0(m1 m1Var) {
        super(m1Var);
        WindowInsets.Builder f4;
        WindowInsets f5 = m1Var.f();
        if (f5 != null) {
            f4 = androidx.activity.v.g(f5);
        } else {
            f4 = androidx.activity.v.f();
        }
        this.c = f4;
    }
}
