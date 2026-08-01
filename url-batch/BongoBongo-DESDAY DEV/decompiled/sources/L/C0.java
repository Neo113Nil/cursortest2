package L;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class C0 extends A1.d {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f477e;

    /* renamed from: f, reason: collision with root package name */
    public Window f478f;

    public C0(WindowInsetsController windowInsetsController, D.g gVar) {
        this.f477e = windowInsetsController;
    }

    @Override // A1.d
    public final void L() {
        this.f477e.hide(7);
    }

    @Override // A1.d
    public final void d0(boolean z2) {
        Window window = this.f478f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f477e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f477e.setSystemBarsAppearance(0, 16);
    }

    @Override // A1.d
    public final void e0(boolean z2) {
        Window window = this.f478f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f477e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f477e.setSystemBarsAppearance(0, 8);
    }

    @Override // A1.d
    public final void i0() {
        this.f477e.setSystemBarsBehavior(2);
    }
}
