package I;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class j0 extends i0 {

    /* renamed from: r, reason: collision with root package name */
    public B.c f1212r;

    public j0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
        this.f1212r = null;
    }

    @Override // I.r0
    public v0 b() {
        return v0.c(this.f1202c.consumeStableInsets(), null);
    }

    @Override // I.r0
    public v0 c() {
        return v0.c(this.f1202c.consumeSystemWindowInsets(), null);
    }

    @Override // I.r0
    public final B.c i() {
        if (this.f1212r == null) {
            WindowInsets windowInsets = this.f1202c;
            this.f1212r = B.c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f1212r;
    }

    @Override // I.r0
    public boolean p() {
        return this.f1202c.isConsumed();
    }

    @Override // I.r0
    public void v(B.c cVar) {
        this.f1212r = cVar;
    }
}
