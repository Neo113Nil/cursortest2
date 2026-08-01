package k0;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class g1 extends f1 {

    /* renamed from: r, reason: collision with root package name */
    public static final m1 f2740r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f2740r = m1.g(null, windowInsets);
    }

    public g1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override // k0.c1, k0.i1
    public c0.c f(int i4) {
        Insets insets;
        insets = this.c.getInsets(j1.a(i4));
        return c0.c.d(insets);
    }

    @Override // k0.c1, k0.i1
    public c0.c g(int i4) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(j1.a(i4));
        return c0.c.d(insetsIgnoringVisibility);
    }

    @Override // k0.c1, k0.i1
    public final void d(View view) {
    }
}
