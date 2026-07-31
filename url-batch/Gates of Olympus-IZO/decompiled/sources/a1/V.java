package a1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class V extends I2.d {

    /* renamed from: d, reason: collision with root package name */
    public final WindowInsetsController f3544d;

    /* renamed from: e, reason: collision with root package name */
    public final Window f3545e;

    public V(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f3544d = insetsController;
        this.f3545e = window;
    }

    @Override // I2.d
    public final void I(boolean z3) {
        Window window = this.f3545e;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f3544d.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f3544d.setSystemBarsAppearance(0, 16);
    }

    @Override // I2.d
    public final void J(boolean z3) {
        Window window = this.f3545e;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f3544d.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f3544d.setSystemBarsAppearance(0, 8);
    }
}
