package o3;

import android.view.WindowInsets;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class a1 extends z0 {

    /* renamed from: s, reason: collision with root package name */
    public h3.b f7363s;

    public a1(k1 k1Var, a1 a1Var) {
        super(k1Var, a1Var);
        this.f7363s = null;
        this.f7363s = a1Var.f7363s;
    }

    @Override // o3.h1
    public k1 b() {
        return k1.c(this.f7460c.consumeStableInsets(), null);
    }

    @Override // o3.h1
    public k1 c() {
        return k1.c(this.f7460c.consumeSystemWindowInsets(), null);
    }

    @Override // o3.h1
    public final h3.b l() {
        if (this.f7363s == null) {
            WindowInsets windowInsets = this.f7460c;
            this.f7363s = h3.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f7363s;
    }

    @Override // o3.h1
    public boolean s() {
        return this.f7460c.isConsumed();
    }

    @Override // o3.h1
    public void z(h3.b bVar) {
        this.f7363s = bVar;
    }

    public a1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f7363s = null;
    }
}
