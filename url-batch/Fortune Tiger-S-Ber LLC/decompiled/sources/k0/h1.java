package k0;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h1 extends g1 {

    /* renamed from: s, reason: collision with root package name */
    public static final m1 f2742s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f2742s = m1.g(null, windowInsets);
    }

    public h1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override // k0.g1, k0.c1, k0.i1
    public c0.c f(int i4) {
        Insets insets;
        insets = this.c.getInsets(l1.a(i4));
        return c0.c.d(insets);
    }

    @Override // k0.g1, k0.c1, k0.i1
    public c0.c g(int i4) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(l1.a(i4));
        return c0.c.d(insetsIgnoringVisibility);
    }
}
