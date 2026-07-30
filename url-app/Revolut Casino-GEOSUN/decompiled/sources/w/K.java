package w;

import android.view.WindowInsets;
import p.C0217c;

/* loaded from: classes.dex */
public class K extends J {

    /* renamed from: m, reason: collision with root package name */
    public C0217c f3038m;

    public K(S s2, WindowInsets windowInsets) {
        super(s2, windowInsets);
        this.f3038m = null;
    }

    @Override // w.P
    public S b() {
        return S.a(this.f3033c.consumeStableInsets(), null);
    }

    @Override // w.P
    public S c() {
        return S.a(this.f3033c.consumeSystemWindowInsets(), null);
    }

    @Override // w.P
    public final C0217c g() {
        if (this.f3038m == null) {
            WindowInsets windowInsets = this.f3033c;
            this.f3038m = C0217c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f3038m;
    }

    @Override // w.P
    public boolean k() {
        return this.f3033c.isConsumed();
    }

    @Override // w.P
    public void p(C0217c c0217c) {
        this.f3038m = c0217c;
    }
}
