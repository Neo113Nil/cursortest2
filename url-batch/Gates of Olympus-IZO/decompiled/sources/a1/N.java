package a1;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class N extends M {

    /* renamed from: q, reason: collision with root package name */
    public static final Q f3538q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f3538q = Q.b(null, windowInsets);
    }

    public N(Q q2, WindowInsets windowInsets) {
        super(q2, windowInsets);
    }

    @Override // a1.J, a1.O
    public V0.c f(int i3) {
        Insets insets;
        insets = this.f3530c.getInsets(P.a(i3));
        return V0.c.c(insets);
    }

    @Override // a1.J, a1.O
    public V0.c g(int i3) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f3530c.getInsetsIgnoringVisibility(P.a(i3));
        return V0.c.c(insetsIgnoringVisibility);
    }

    @Override // a1.J, a1.O
    public boolean o(int i3) {
        boolean isVisible;
        isVisible = this.f3530c.isVisible(P.a(i3));
        return isVisible;
    }

    @Override // a1.J, a1.O
    public final void d(View view) {
    }
}
