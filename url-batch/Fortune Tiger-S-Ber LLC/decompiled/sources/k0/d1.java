package k0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class d1 extends c1 {

    /* renamed from: n, reason: collision with root package name */
    public c0.c f2730n;

    public d1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.f2730n = null;
    }

    @Override // k0.i1
    public m1 b() {
        return m1.g(null, this.c.consumeStableInsets());
    }

    @Override // k0.i1
    public m1 c() {
        return m1.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // k0.i1
    public final c0.c i() {
        if (this.f2730n == null) {
            WindowInsets windowInsets = this.c;
            this.f2730n = c0.c.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f2730n;
    }

    @Override // k0.i1
    public boolean n() {
        return this.c.isConsumed();
    }

    @Override // k0.i1
    public void r(c0.c cVar) {
        this.f2730n = cVar;
    }
}
