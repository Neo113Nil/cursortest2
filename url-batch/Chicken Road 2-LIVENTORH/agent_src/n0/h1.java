package n0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class h1 extends g1 {

    /* renamed from: n, reason: collision with root package name */
    public f0.c f2745n;

    public h1(q1 q1Var, WindowInsets windowInsets) {
        super(q1Var, windowInsets);
        this.f2745n = null;
    }

    @Override // n0.n1
    public q1 b() {
        return q1.g(null, this.f2739c.consumeStableInsets());
    }

    @Override // n0.n1
    public q1 c() {
        return q1.g(null, this.f2739c.consumeSystemWindowInsets());
    }

    @Override // n0.n1
    public final f0.c i() {
        if (this.f2745n == null) {
            WindowInsets windowInsets = this.f2739c;
            this.f2745n = f0.c.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f2745n;
    }

    @Override // n0.n1
    public boolean n() {
        return this.f2739c.isConsumed();
    }

    @Override // n0.n1
    public void r(f0.c cVar) {
        this.f2745n = cVar;
    }
}
