package E;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class S extends Q {

    /* renamed from: s, reason: collision with root package name */
    public static final W f267s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f267s = W.b(windowInsets, null);
    }

    public S(W w3, WindowInsets windowInsets) {
        super(w3, windowInsets);
    }

    @Override // E.P, E.L, E.T
    public x.b f(int i3) {
        Insets insets;
        insets = this.f258c.getInsets(V.a(i3));
        return x.b.c(insets);
    }

    @Override // E.P, E.L, E.T
    public boolean n(int i3) {
        boolean isVisible;
        isVisible = this.f258c.isVisible(V.a(i3));
        return isVisible;
    }
}
