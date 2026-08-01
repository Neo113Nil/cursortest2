package o3;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class f1 extends e1 {

    /* renamed from: x, reason: collision with root package name */
    public static final k1 f7393x;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f7393x = k1.c(windowInsets, null);
    }

    public f1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override // o3.d1, o3.z0, o3.h1
    public h3.b i(int i3) {
        Insets insets;
        insets = this.f7460c.getInsets(j1.a(i3));
        return h3.b.c(insets);
    }

    @Override // o3.d1, o3.z0, o3.h1
    public h3.b j(int i3) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f7460c.getInsetsIgnoringVisibility(j1.a(i3));
        return h3.b.c(insetsIgnoringVisibility);
    }

    @Override // o3.d1, o3.z0, o3.h1
    public boolean u(int i3) {
        boolean isVisible;
        isVisible = this.f7460c.isVisible(j1.a(i3));
        return isVisible;
    }

    public f1(k1 k1Var, f1 f1Var) {
        super(k1Var, f1Var);
    }

    @Override // o3.z0, o3.h1
    public void p(View view) {
    }
}
