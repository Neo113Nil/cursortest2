package E;

import android.view.WindowInsets;
import x.C1513b;

/* loaded from: classes.dex */
public class U extends T {
    public C1513b n;

    public U(e0 e0Var, WindowInsets windowInsets) {
        super(e0Var, windowInsets);
        this.n = null;
    }

    @Override // E.a0
    public e0 b() {
        return e0.a(null, this.f390c.consumeStableInsets());
    }

    @Override // E.a0
    public e0 c() {
        return e0.a(null, this.f390c.consumeSystemWindowInsets());
    }

    @Override // E.a0
    public final C1513b g() {
        if (this.n == null) {
            WindowInsets windowInsets = this.f390c;
            this.n = C1513b.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // E.a0
    public boolean k() {
        return this.f390c.isConsumed();
    }

    @Override // E.a0
    public void p(C1513b c1513b) {
        this.n = c1513b;
    }
}
