package E;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class Z extends Y {

    /* renamed from: s, reason: collision with root package name */
    public static final e0 f399s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f399s = e0.a(null, windowInsets);
    }

    public Z(e0 e0Var, WindowInsets windowInsets) {
        super(e0Var, windowInsets);
    }

    @Override // E.X, E.T, E.a0
    public boolean m(int i4) {
        boolean isVisible;
        isVisible = this.f390c.isVisible(d0.a(i4));
        return isVisible;
    }
}
