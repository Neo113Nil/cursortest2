package M;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class n0 extends m0 {

    /* renamed from: m, reason: collision with root package name */
    public E.c f780m;

    public n0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var, windowInsets);
        this.f780m = null;
    }

    @Override // M.r0
    public t0 b() {
        return t0.g(null, this.f776c.consumeStableInsets());
    }

    @Override // M.r0
    public t0 c() {
        return t0.g(null, this.f776c.consumeSystemWindowInsets());
    }

    @Override // M.r0
    public final E.c h() {
        if (this.f780m == null) {
            WindowInsets windowInsets = this.f776c;
            this.f780m = E.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f780m;
    }

    @Override // M.r0
    public boolean m() {
        return this.f776c.isConsumed();
    }

    @Override // M.r0
    public void q(E.c cVar) {
        this.f780m = cVar;
    }
}
