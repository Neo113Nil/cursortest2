package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class q0 extends p0 {

    /* renamed from: m, reason: collision with root package name */
    public C.c f444m;

    public q0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
        this.f444m = null;
    }

    @Override // K.u0
    public w0 b() {
        return w0.g(null, this.f438c.consumeStableInsets());
    }

    @Override // K.u0
    public w0 c() {
        return w0.g(null, this.f438c.consumeSystemWindowInsets());
    }

    @Override // K.u0
    public final C.c h() {
        if (this.f444m == null) {
            WindowInsets windowInsets = this.f438c;
            this.f444m = C.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f444m;
    }

    @Override // K.u0
    public boolean m() {
        return this.f438c.isConsumed();
    }

    @Override // K.u0
    public void q(C.c cVar) {
        this.f444m = cVar;
    }
}
