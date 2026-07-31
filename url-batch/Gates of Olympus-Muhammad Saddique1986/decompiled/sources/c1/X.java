package c1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class X extends l0.c {

    /* renamed from: g, reason: collision with root package name */
    public final WindowInsetsController f5591g;

    /* renamed from: h, reason: collision with root package name */
    public final Window f5592h;

    public X(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f5591g = insetsController;
        this.f5592h = window;
    }

    @Override // l0.c
    public final void L(boolean z3) {
        Window window = this.f5592h;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f5591g.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f5591g.setSystemBarsAppearance(0, 16);
    }

    @Override // l0.c
    public final void M(boolean z3) {
        Window window = this.f5592h;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f5591g.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f5591g.setSystemBarsAppearance(0, 8);
    }
}
