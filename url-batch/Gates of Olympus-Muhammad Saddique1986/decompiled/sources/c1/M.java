package c1;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class M extends L {

    /* renamed from: m, reason: collision with root package name */
    public X0.c f5581m;

    public M(U u3, WindowInsets windowInsets) {
        super(u3, windowInsets);
        this.f5581m = null;
    }

    @Override // c1.Q
    public U b() {
        return U.b(null, this.f5576c.consumeStableInsets());
    }

    @Override // c1.Q
    public U c() {
        return U.b(null, this.f5576c.consumeSystemWindowInsets());
    }

    @Override // c1.Q
    public final X0.c i() {
        if (this.f5581m == null) {
            WindowInsets windowInsets = this.f5576c;
            this.f5581m = X0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f5581m;
    }

    @Override // c1.Q
    public boolean m() {
        return this.f5576c.isConsumed();
    }

    @Override // c1.Q
    public void r(X0.c cVar) {
        this.f5581m = cVar;
    }
}
