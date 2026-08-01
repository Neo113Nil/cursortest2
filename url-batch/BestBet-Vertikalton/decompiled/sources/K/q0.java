package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class q0 extends p0 {

    /* renamed from: m, reason: collision with root package name */
    public C.d f652m;

    public q0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
        this.f652m = null;
    }

    @Override // K.u0
    public w0 b() {
        return w0.g(null, this.f648c.consumeStableInsets());
    }

    @Override // K.u0
    public w0 c() {
        return w0.g(null, this.f648c.consumeSystemWindowInsets());
    }

    @Override // K.u0
    public final C.d h() {
        if (this.f652m == null) {
            WindowInsets windowInsets = this.f648c;
            this.f652m = C.d.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f652m;
    }

    @Override // K.u0
    public boolean m() {
        return this.f648c.isConsumed();
    }

    @Override // K.u0
    public void q(C.d dVar) {
        this.f652m = dVar;
    }
}
