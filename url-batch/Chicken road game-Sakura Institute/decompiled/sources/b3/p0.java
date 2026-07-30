package b3;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p0 extends o0 {

    /* renamed from: q, reason: collision with root package name */
    public static final t0 f1358q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f1358q = t0.b(null, windowInsets);
    }

    public p0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var, windowInsets);
    }

    @Override // b3.l0, b3.q0
    public v2.c f(int i7) {
        Insets insets;
        insets = this.f1349c.getInsets(s0.a(i7));
        return v2.c.c(insets);
    }

    @Override // b3.l0, b3.q0
    public v2.c g(int i7) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f1349c.getInsetsIgnoringVisibility(s0.a(i7));
        return v2.c.c(insetsIgnoringVisibility);
    }

    @Override // b3.l0, b3.q0
    public boolean o(int i7) {
        boolean isVisible;
        isVisible = this.f1349c.isVisible(s0.a(i7));
        return isVisible;
    }

    @Override // b3.l0, b3.q0
    public final void d(View view) {
    }
}
