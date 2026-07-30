package I;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class o0 extends n0 {

    /* renamed from: w, reason: collision with root package name */
    public static final v0 f1228w;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f1228w = v0.c(windowInsets, null);
    }

    public o0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
    }

    @Override // I.m0, I.i0
    public B.c C(int i2) {
        Insets insets;
        insets = this.f1202c.getInsets(u0.a(i2));
        return B.c.b(insets);
    }

    @Override // I.m0, I.i0
    public B.c F(int i2) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f1202c.getInsetsIgnoringVisibility(u0.a(i2));
        return B.c.b(insetsIgnoringVisibility);
    }

    @Override // I.m0, I.i0, I.r0
    public boolean r(int i2) {
        boolean isVisible;
        isVisible = this.f1202c.isVisible(u0.a(i2));
        return isVisible;
    }

    @Override // I.i0, I.r0
    public void m(View view) {
    }
}
