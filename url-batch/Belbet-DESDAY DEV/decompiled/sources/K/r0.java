package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class r0 extends q0 {

    /* renamed from: m, reason: collision with root package name */
    public C.d f456m;

    public r0(x0 x0Var, WindowInsets windowInsets) {
        super(x0Var, windowInsets);
        this.f456m = null;
    }

    @Override // K.v0
    public x0 b() {
        return x0.g(null, this.f452c.consumeStableInsets());
    }

    @Override // K.v0
    public x0 c() {
        return x0.g(null, this.f452c.consumeSystemWindowInsets());
    }

    @Override // K.v0
    public final C.d h() {
        if (this.f456m == null) {
            WindowInsets windowInsets = this.f452c;
            this.f456m = C.d.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f456m;
    }

    @Override // K.v0
    public boolean m() {
        return this.f452c.isConsumed();
    }

    @Override // K.v0
    public void q(C.d dVar) {
        this.f456m = dVar;
    }
}
