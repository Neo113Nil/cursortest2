package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class q0 extends p0 {

    /* renamed from: m, reason: collision with root package name */
    public C.c f437m;

    public q0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
        this.f437m = null;
    }

    @Override // K.u0
    public w0 b() {
        return w0.g(null, this.f431c.consumeStableInsets());
    }

    @Override // K.u0
    public w0 c() {
        return w0.g(null, this.f431c.consumeSystemWindowInsets());
    }

    @Override // K.u0
    public final C.c h() {
        if (this.f437m == null) {
            WindowInsets windowInsets = this.f431c;
            this.f437m = C.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f437m;
    }

    @Override // K.u0
    public boolean m() {
        return this.f431c.isConsumed();
    }

    @Override // K.u0
    public void q(C.c cVar) {
        this.f437m = cVar;
    }
}
