package D;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class Q extends P {

    /* renamed from: m, reason: collision with root package name */
    public w.c f264m;

    public Q(Y y, WindowInsets windowInsets) {
        super(y, windowInsets);
        this.f264m = null;
    }

    @Override // D.W
    public Y b() {
        return Y.c(this.f259c.consumeStableInsets(), null);
    }

    @Override // D.W
    public Y c() {
        return Y.c(this.f259c.consumeSystemWindowInsets(), null);
    }

    @Override // D.W
    public final w.c g() {
        if (this.f264m == null) {
            WindowInsets windowInsets = this.f259c;
            this.f264m = w.c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f264m;
    }

    @Override // D.W
    public boolean l() {
        return this.f259c.isConsumed();
    }

    @Override // D.W
    public void q(w.c cVar) {
        this.f264m = cVar;
    }
}
