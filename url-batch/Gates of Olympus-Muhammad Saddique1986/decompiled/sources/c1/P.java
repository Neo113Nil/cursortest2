package c1;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class P extends O {

    /* renamed from: q, reason: collision with root package name */
    public static final U f5585q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f5585q = U.b(null, windowInsets);
    }

    public P(U u3, WindowInsets windowInsets) {
        super(u3, windowInsets);
    }

    @Override // c1.L, c1.Q
    public X0.c f(int i3) {
        Insets insets;
        insets = this.f5576c.getInsets(T.a(i3));
        return X0.c.c(insets);
    }

    @Override // c1.L, c1.Q
    public X0.c g(int i3) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f5576c.getInsetsIgnoringVisibility(T.a(i3));
        return X0.c.c(insetsIgnoringVisibility);
    }

    @Override // c1.L, c1.Q
    public boolean o(int i3) {
        boolean isVisible;
        isVisible = this.f5576c.isVisible(T.a(i3));
        return isVisible;
    }

    @Override // c1.L, c1.Q
    public final void d(View view) {
    }
}
