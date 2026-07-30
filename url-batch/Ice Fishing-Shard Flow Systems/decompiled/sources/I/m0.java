package I;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class m0 extends l0 {

    /* renamed from: v, reason: collision with root package name */
    public static final v0 f1222v;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f1222v = v0.c(windowInsets, null);
    }

    public m0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
    }

    @Override // I.i0
    public B.c C(int i2) {
        Insets insets;
        insets = this.f1202c.getInsets(s0.a(i2));
        return B.c.b(insets);
    }

    @Override // I.i0
    public B.c F(int i2) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f1202c.getInsetsIgnoringVisibility(s0.a(i2));
        return B.c.b(insetsIgnoringVisibility);
    }

    @Override // I.i0, I.r0
    public boolean r(int i2) {
        boolean isVisible;
        isVisible = this.f1202c.isVisible(s0.a(i2));
        return isVisible;
    }

    @Override // I.i0, I.r0
    public final void d(View view) {
    }
}
