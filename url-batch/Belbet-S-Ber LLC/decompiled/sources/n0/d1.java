package n0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class d1 extends j1 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsets.Builder f2770e;

    public d1() {
        this.f2770e = k1.z.d();
    }

    @Override // n0.j1
    public v1 b() {
        WindowInsets build;
        a();
        build = this.f2770e.build();
        v1 g3 = v1.g(null, build);
        f0.c[] cVarArr = this.f2789b;
        s1 s1Var = g3.f2842a;
        s1Var.u(cVarArr);
        s1Var.t(null);
        s1Var.y(this.f2790c);
        s1Var.z(this.d);
        return g3;
    }

    @Override // n0.j1
    public void e(f0.c cVar) {
        this.f2770e.setMandatorySystemGestureInsets(cVar.e());
    }

    @Override // n0.j1
    public void f(f0.c cVar) {
        this.f2770e.setStableInsets(cVar.e());
    }

    @Override // n0.j1
    public void g(f0.c cVar) {
        this.f2770e.setSystemGestureInsets(cVar.e());
    }

    @Override // n0.j1
    public void h(f0.c cVar) {
        this.f2770e.setSystemWindowInsets(cVar.e());
    }

    @Override // n0.j1
    public void i(f0.c cVar) {
        this.f2770e.setTappableElementInsets(cVar.e());
    }

    public d1(v1 v1Var) {
        super(v1Var);
        WindowInsets.Builder d;
        WindowInsets f5 = v1Var.f();
        if (f5 != null) {
            d = k1.z.e(f5);
        } else {
            d = k1.z.d();
        }
        this.f2770e = d;
    }
}
