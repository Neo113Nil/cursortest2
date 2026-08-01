package K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class A0 extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f367e;

    /* renamed from: f, reason: collision with root package name */
    public Window f368f;

    public A0(WindowInsetsController windowInsetsController, B0.d dVar) {
        this.f367e = windowInsetsController;
    }

    @Override // q1.d
    public final void Q() {
        this.f367e.hide(7);
    }

    @Override // q1.d
    public final void l0(boolean z2) {
        Window window = this.f368f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f367e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f367e.setSystemBarsAppearance(0, 16);
    }

    @Override // q1.d
    public final void m0(boolean z2) {
        Window window = this.f368f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f367e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f367e.setSystemBarsAppearance(0, 8);
    }

    @Override // q1.d
    public final void q0() {
        this.f367e.setSystemBarsBehavior(2);
    }
}
