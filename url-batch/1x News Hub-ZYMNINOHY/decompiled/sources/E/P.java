package E;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class P extends O {

    /* renamed from: r, reason: collision with root package name */
    public static final W f266r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f266r = W.b(windowInsets, null);
    }

    public P(W w3, WindowInsets windowInsets) {
        super(w3, windowInsets);
    }

    @Override // E.L, E.T
    public x.b f(int i3) {
        Insets insets;
        insets = this.f258c.getInsets(U.a(i3));
        return x.b.c(insets);
    }

    @Override // E.L, E.T
    public boolean n(int i3) {
        boolean isVisible;
        isVisible = this.f258c.isVisible(U.a(i3));
        return isVisible;
    }

    @Override // E.L, E.T
    public final void d(View view) {
    }
}
