package q3;

import android.view.WindowInsets;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class c1 extends b1 {

    /* renamed from: n, reason: collision with root package name */
    public i3.c f6091n;

    public c1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f6091n = null;
    }

    @Override // q3.i1
    public l1 b() {
        return l1.d(null, this.f6085c.consumeStableInsets());
    }

    @Override // q3.i1
    public l1 c() {
        return l1.d(null, this.f6085c.consumeSystemWindowInsets());
    }

    @Override // q3.i1
    public final i3.c i() {
        if (this.f6091n == null) {
            WindowInsets windowInsets = this.f6085c;
            this.f6091n = i3.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f6091n;
    }

    @Override // q3.i1
    public boolean n() {
        return this.f6085c.isConsumed();
    }

    @Override // q3.i1
    public void s(i3.c cVar) {
        this.f6091n = cVar;
    }
}
