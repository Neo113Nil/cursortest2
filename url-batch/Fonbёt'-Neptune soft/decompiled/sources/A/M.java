package A;

import android.view.WindowInsets;
import t.C0307c;

/* loaded from: classes.dex */
public class M extends L {

    /* renamed from: k, reason: collision with root package name */
    public C0307c f20k;

    public M(T t2, WindowInsets windowInsets) {
        super(t2, windowInsets);
        this.f20k = null;
    }

    @Override // A.S
    public T b() {
        return T.a(this.f17c.consumeStableInsets(), null);
    }

    @Override // A.S
    public T c() {
        return T.a(this.f17c.consumeSystemWindowInsets(), null);
    }

    @Override // A.S
    public final C0307c f() {
        if (this.f20k == null) {
            WindowInsets windowInsets = this.f17c;
            this.f20k = C0307c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f20k;
    }

    @Override // A.S
    public boolean h() {
        return this.f17c.isConsumed();
    }

    @Override // A.S
    public void l(C0307c c0307c) {
        this.f20k = c0307c;
    }
}
