package a1;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class G extends I {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f3522c;

    public G() {
        this.f3522c = C0.g.d();
    }

    @Override // a1.I
    public Q b() {
        WindowInsets build;
        a();
        build = this.f3522c.build();
        Q b2 = Q.b(null, build);
        b2.f3542a.p(this.f3524b);
        return b2;
    }

    @Override // a1.I
    public void d(V0.c cVar) {
        this.f3522c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // a1.I
    public void e(V0.c cVar) {
        this.f3522c.setStableInsets(cVar.d());
    }

    @Override // a1.I
    public void f(V0.c cVar) {
        this.f3522c.setSystemGestureInsets(cVar.d());
    }

    @Override // a1.I
    public void g(V0.c cVar) {
        this.f3522c.setSystemWindowInsets(cVar.d());
    }

    @Override // a1.I
    public void h(V0.c cVar) {
        this.f3522c.setTappableElementInsets(cVar.d());
    }

    public G(Q q2) {
        super(q2);
        WindowInsets.Builder d3;
        WindowInsets a3 = q2.a();
        if (a3 != null) {
            d3 = C0.g.e(a3);
        } else {
            d3 = C0.g.d();
        }
        this.f3522c = d3;
    }
}
