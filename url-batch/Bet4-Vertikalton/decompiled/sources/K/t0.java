package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class t0 extends s0 {

    /* renamed from: m, reason: collision with root package name */
    public C.c f504m;

    public t0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var, windowInsets);
        this.f504m = null;
    }

    @Override // K.x0
    public z0 b() {
        return z0.g(null, this.f500c.consumeStableInsets());
    }

    @Override // K.x0
    public z0 c() {
        return z0.g(null, this.f500c.consumeSystemWindowInsets());
    }

    @Override // K.x0
    public final C.c h() {
        if (this.f504m == null) {
            WindowInsets windowInsets = this.f500c;
            this.f504m = C.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f504m;
    }

    @Override // K.x0
    public boolean m() {
        return this.f500c.isConsumed();
    }

    @Override // K.x0
    public void q(C.c cVar) {
        this.f504m = cVar;
    }
}
