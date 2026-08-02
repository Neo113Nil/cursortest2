package E;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class X extends W {

    /* renamed from: r, reason: collision with root package name */
    public static final e0 f398r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f398r = e0.a(null, windowInsets);
    }

    public X(e0 e0Var, WindowInsets windowInsets) {
        super(e0Var, windowInsets);
    }

    @Override // E.T, E.a0
    public boolean m(int i4) {
        boolean isVisible;
        isVisible = this.f390c.isVisible(b0.a(i4));
        return isVisible;
    }

    @Override // E.T, E.a0
    public final void d(View view) {
    }
}
