package E;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class M extends L {

    /* renamed from: n, reason: collision with root package name */
    public x.b f263n;

    public M(W w3, WindowInsets windowInsets) {
        super(w3, windowInsets);
        this.f263n = null;
    }

    @Override // E.T
    public W b() {
        return W.b(this.f258c.consumeStableInsets(), null);
    }

    @Override // E.T
    public W c() {
        return W.b(this.f258c.consumeSystemWindowInsets(), null);
    }

    @Override // E.T
    public final x.b h() {
        if (this.f263n == null) {
            WindowInsets windowInsets = this.f258c;
            this.f263n = x.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f263n;
    }

    @Override // E.T
    public boolean l() {
        return this.f258c.isConsumed();
    }

    @Override // E.T
    public void q(x.b bVar) {
        this.f263n = bVar;
    }
}
