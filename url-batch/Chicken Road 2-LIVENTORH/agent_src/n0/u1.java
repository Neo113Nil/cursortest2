package n0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class u1 extends h.a {

    /* renamed from: k, reason: collision with root package name */
    public final WindowInsetsController f2788k;

    /* renamed from: l, reason: collision with root package name */
    public final Window f2789l;

    public u1(Window window, l2.f fVar) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f2788k = insetsController;
        this.f2789l = window;
    }

    @Override // h.a
    public final void d0(boolean z3) {
        Window window = this.f2789l;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f2788k.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f2788k.setSystemBarsAppearance(0, 16);
    }

    @Override // h.a
    public final void e0(boolean z3) {
        Window window = this.f2789l;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f2788k.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f2788k.setSystemBarsAppearance(0, 8);
    }
}
