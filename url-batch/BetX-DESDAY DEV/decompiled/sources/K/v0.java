package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class v0 extends u0 {

    /* renamed from: m, reason: collision with root package name */
    public C.d f511m;

    public v0(B0 b02, WindowInsets windowInsets) {
        super(b02, windowInsets);
        this.f511m = null;
    }

    @Override // K.z0
    public B0 b() {
        return B0.g(null, this.f506c.consumeStableInsets());
    }

    @Override // K.z0
    public B0 c() {
        return B0.g(null, this.f506c.consumeSystemWindowInsets());
    }

    @Override // K.z0
    public final C.d h() {
        if (this.f511m == null) {
            WindowInsets windowInsets = this.f506c;
            this.f511m = C.d.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f511m;
    }

    @Override // K.z0
    public boolean m() {
        return this.f506c.isConsumed();
    }

    @Override // K.z0
    public void q(C.d dVar) {
        this.f511m = dVar;
    }
}
