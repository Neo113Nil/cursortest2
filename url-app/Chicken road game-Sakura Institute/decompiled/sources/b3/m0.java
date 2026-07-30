package b3;

import android.view.WindowInsets;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class m0 extends l0 {

    /* renamed from: m, reason: collision with root package name */
    public v2.c f1354m;

    public m0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var, windowInsets);
        this.f1354m = null;
    }

    @Override // b3.q0
    public t0 b() {
        return t0.b(null, this.f1349c.consumeStableInsets());
    }

    @Override // b3.q0
    public t0 c() {
        return t0.b(null, this.f1349c.consumeSystemWindowInsets());
    }

    @Override // b3.q0
    public final v2.c i() {
        if (this.f1354m == null) {
            WindowInsets windowInsets = this.f1349c;
            this.f1354m = v2.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f1354m;
    }

    @Override // b3.q0
    public boolean m() {
        return this.f1349c.isConsumed();
    }

    @Override // b3.q0
    public void r(v2.c cVar) {
        this.f1354m = cVar;
    }
}
