package n0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class l1 extends k1 {

    /* renamed from: r, reason: collision with root package name */
    public f0.c f2804r;

    public l1(v1 v1Var, WindowInsets windowInsets) {
        super(v1Var, windowInsets);
        this.f2804r = null;
    }

    @Override // n0.s1
    public v1 b() {
        return v1.g(null, this.f2797c.consumeStableInsets());
    }

    @Override // n0.s1
    public v1 c() {
        return v1.g(null, this.f2797c.consumeSystemWindowInsets());
    }

    @Override // n0.s1
    public final f0.c k() {
        if (this.f2804r == null) {
            WindowInsets windowInsets = this.f2797c;
            this.f2804r = f0.c.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f2804r;
    }

    @Override // n0.s1
    public boolean r() {
        return this.f2797c.isConsumed();
    }

    @Override // n0.s1
    public void w(f0.c cVar) {
        this.f2804r = cVar;
    }
}
