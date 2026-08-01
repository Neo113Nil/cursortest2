package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class v0 extends u0 {

    /* renamed from: m, reason: collision with root package name */
    public C.d f510m;

    public v0(B0 b02, WindowInsets windowInsets) {
        super(b02, windowInsets);
        this.f510m = null;
    }

    @Override // K.z0
    public B0 b() {
        return B0.g(null, this.f505c.consumeStableInsets());
    }

    @Override // K.z0
    public B0 c() {
        return B0.g(null, this.f505c.consumeSystemWindowInsets());
    }

    @Override // K.z0
    public final C.d h() {
        if (this.f510m == null) {
            WindowInsets windowInsets = this.f505c;
            this.f510m = C.d.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f510m;
    }

    @Override // K.z0
    public boolean m() {
        return this.f505c.isConsumed();
    }

    @Override // K.z0
    public void q(C.d dVar) {
        this.f510m = dVar;
    }
}
