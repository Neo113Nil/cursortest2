package y;

import android.view.WindowInsets;
import r.C0224c;

/* loaded from: classes.dex */
public class J extends I {

    /* renamed from: m, reason: collision with root package name */
    public C0224c f3123m;

    public J(Q q2, WindowInsets windowInsets) {
        super(q2, windowInsets);
        this.f3123m = null;
    }

    @Override // y.O
    public Q b() {
        return Q.a(this.f3118c.consumeStableInsets(), null);
    }

    @Override // y.O
    public Q c() {
        return Q.a(this.f3118c.consumeSystemWindowInsets(), null);
    }

    @Override // y.O
    public final C0224c g() {
        if (this.f3123m == null) {
            WindowInsets windowInsets = this.f3118c;
            this.f3123m = C0224c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f3123m;
    }

    @Override // y.O
    public boolean k() {
        return this.f3118c.isConsumed();
    }

    @Override // y.O
    public void p(C0224c c0224c) {
        this.f3123m = c0224c;
    }
}
