package M;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class p0 extends o0 {

    /* renamed from: m, reason: collision with root package name */
    public E.c f584m;

    public p0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
        this.f584m = null;
    }

    @Override // M.t0
    public v0 b() {
        return v0.g(null, this.f578c.consumeStableInsets());
    }

    @Override // M.t0
    public v0 c() {
        return v0.g(null, this.f578c.consumeSystemWindowInsets());
    }

    @Override // M.t0
    public final E.c h() {
        if (this.f584m == null) {
            WindowInsets windowInsets = this.f578c;
            this.f584m = E.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f584m;
    }

    @Override // M.t0
    public boolean m() {
        return this.f578c.isConsumed();
    }

    @Override // M.t0
    public void q(E.c cVar) {
        this.f584m = cVar;
    }
}
