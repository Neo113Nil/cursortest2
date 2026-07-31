package a1;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class K extends J {

    /* renamed from: m, reason: collision with root package name */
    public V0.c f3535m;

    public K(Q q2, WindowInsets windowInsets) {
        super(q2, windowInsets);
        this.f3535m = null;
    }

    @Override // a1.O
    public Q b() {
        return Q.b(null, this.f3530c.consumeStableInsets());
    }

    @Override // a1.O
    public Q c() {
        return Q.b(null, this.f3530c.consumeSystemWindowInsets());
    }

    @Override // a1.O
    public final V0.c i() {
        if (this.f3535m == null) {
            WindowInsets windowInsets = this.f3530c;
            this.f3535m = V0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f3535m;
    }

    @Override // a1.O
    public boolean m() {
        return this.f3530c.isConsumed();
    }

    @Override // a1.O
    public void r(V0.c cVar) {
        this.f3535m = cVar;
    }
}
