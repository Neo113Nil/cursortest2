package E;

import android.view.WindowInsets;
import x.C1528c;

/* loaded from: classes.dex */
public class V extends U {

    /* renamed from: m, reason: collision with root package name */
    public C1528c f590m;

    public V(b0 b0Var, WindowInsets windowInsets) {
        super(b0Var, windowInsets);
        this.f590m = null;
    }

    @Override // E.Z
    public b0 b() {
        return b0.a(this.f585c.consumeStableInsets(), null);
    }

    @Override // E.Z
    public b0 c() {
        return b0.a(this.f585c.consumeSystemWindowInsets(), null);
    }

    @Override // E.Z
    public final C1528c g() {
        if (this.f590m == null) {
            WindowInsets windowInsets = this.f585c;
            this.f590m = C1528c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f590m;
    }

    @Override // E.Z
    public boolean k() {
        return this.f585c.isConsumed();
    }

    @Override // E.Z
    public void p(C1528c c1528c) {
        this.f590m = c1528c;
    }
}
