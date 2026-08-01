package L;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class t0 extends s0 {

    /* renamed from: m, reason: collision with root package name */
    public D.c f574m;

    public t0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var, windowInsets);
        this.f574m = null;
    }

    @Override // L.x0
    public z0 b() {
        return z0.g(null, this.f570c.consumeStableInsets());
    }

    @Override // L.x0
    public z0 c() {
        return z0.g(null, this.f570c.consumeSystemWindowInsets());
    }

    @Override // L.x0
    public final D.c h() {
        if (this.f574m == null) {
            WindowInsets windowInsets = this.f570c;
            this.f574m = D.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f574m;
    }

    @Override // L.x0
    public boolean m() {
        return this.f570c.isConsumed();
    }

    @Override // L.x0
    public void q(D.c cVar) {
        this.f574m = cVar;
    }
}
