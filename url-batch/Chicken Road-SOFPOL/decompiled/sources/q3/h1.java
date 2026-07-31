package q3;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h1 extends g1 {

    /* renamed from: s, reason: collision with root package name */
    public static final l1 f6110s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f6110s = l1.d(null, windowInsets);
    }

    public h1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override // q3.f1, q3.b1, q3.i1
    public i3.c f(int i) {
        Insets insets;
        insets = this.f6085c.getInsets(k1.a(i));
        return i3.c.c(insets);
    }

    @Override // q3.f1, q3.b1, q3.i1
    public i3.c g(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f6085c.getInsetsIgnoringVisibility(k1.a(i));
        return i3.c.c(insetsIgnoringVisibility);
    }

    @Override // q3.f1, q3.b1, q3.i1
    public boolean p(int i) {
        boolean isVisible;
        isVisible = this.f6085c.isVisible(k1.a(i));
        return isVisible;
    }
}
