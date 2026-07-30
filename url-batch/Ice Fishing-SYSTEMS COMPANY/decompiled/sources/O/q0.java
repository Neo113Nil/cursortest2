package O;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class q0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f2316c;

    public q0() {
        this.f2316c = B.a.e();
    }

    @Override // O.s0
    public A0 b() {
        WindowInsets build;
        a();
        build = this.f2316c.build();
        A0 h9 = A0.h(null, build);
        h9.f2213a.o(this.f2318b);
        return h9;
    }

    @Override // O.s0
    public void d(G.e eVar) {
        this.f2316c.setMandatorySystemGestureInsets(eVar.d());
    }

    @Override // O.s0
    public void e(G.e eVar) {
        this.f2316c.setStableInsets(eVar.d());
    }

    @Override // O.s0
    public void f(G.e eVar) {
        this.f2316c.setSystemGestureInsets(eVar.d());
    }

    @Override // O.s0
    public void g(G.e eVar) {
        this.f2316c.setSystemWindowInsets(eVar.d());
    }

    @Override // O.s0
    public void h(G.e eVar) {
        this.f2316c.setTappableElementInsets(eVar.d());
    }

    public q0(A0 a02) {
        super(a02);
        WindowInsets.Builder e6;
        WindowInsets g9 = a02.g();
        if (g9 != null) {
            e6 = B.a.f(g9);
        } else {
            e6 = B.a.e();
        }
        this.f2316c = e6;
    }
}
