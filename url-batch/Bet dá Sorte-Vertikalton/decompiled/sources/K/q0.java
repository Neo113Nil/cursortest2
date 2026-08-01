package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class q0 extends p0 {

    /* renamed from: m, reason: collision with root package name */
    public C.d f426m;

    public q0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
        this.f426m = null;
    }

    @Override // K.u0
    public w0 b() {
        return w0.g(null, this.f420c.consumeStableInsets());
    }

    @Override // K.u0
    public w0 c() {
        return w0.g(null, this.f420c.consumeSystemWindowInsets());
    }

    @Override // K.u0
    public final C.d h() {
        if (this.f426m == null) {
            WindowInsets windowInsets = this.f420c;
            this.f426m = C.d.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f426m;
    }

    @Override // K.u0
    public boolean m() {
        return this.f420c.isConsumed();
    }

    @Override // K.u0
    public void q(C.d dVar) {
        this.f426m = dVar;
    }
}
