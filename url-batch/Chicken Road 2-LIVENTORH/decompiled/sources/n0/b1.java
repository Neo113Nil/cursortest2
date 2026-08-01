package n0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class b1 extends f1 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f2716c;

    public b1() {
        this.f2716c = a1.c();
    }

    @Override // n0.f1
    public q1 b() {
        WindowInsets build;
        a();
        build = this.f2716c.build();
        q1 g4 = q1.g(null, build);
        g4.f2775a.p(this.f2727b);
        return g4;
    }

    @Override // n0.f1
    public void d(f0.c cVar) {
        this.f2716c.setMandatorySystemGestureInsets(cVar.e());
    }

    @Override // n0.f1
    public void e(f0.c cVar) {
        this.f2716c.setStableInsets(cVar.e());
    }

    @Override // n0.f1
    public void f(f0.c cVar) {
        this.f2716c.setSystemGestureInsets(cVar.e());
    }

    @Override // n0.f1
    public void g(f0.c cVar) {
        this.f2716c.setSystemWindowInsets(cVar.e());
    }

    @Override // n0.f1
    public void h(f0.c cVar) {
        this.f2716c.setTappableElementInsets(cVar.e());
    }

    public b1(q1 q1Var) {
        super(q1Var);
        WindowInsets.Builder c4;
        WindowInsets f2 = q1Var.f();
        if (f2 != null) {
            c4 = a1.d(f2);
        } else {
            c4 = a1.c();
        }
        this.f2716c = c4;
    }
}
