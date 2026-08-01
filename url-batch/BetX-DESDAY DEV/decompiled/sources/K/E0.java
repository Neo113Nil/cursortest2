package K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class E0 extends q1.l {

    /* renamed from: g, reason: collision with root package name */
    public final WindowInsetsController f404g;
    public Window h;

    public E0(WindowInsetsController windowInsetsController, B0.d dVar) {
        this.f404g = windowInsetsController;
    }

    @Override // q1.l
    public final void J() {
        this.f404g.hide(7);
    }

    @Override // q1.l
    public final void l0(boolean z2) {
        Window window = this.h;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f404g.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f404g.setSystemBarsAppearance(0, 16);
    }

    @Override // q1.l
    public final void m0(boolean z2) {
        Window window = this.h;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f404g.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f404g.setSystemBarsAppearance(0, 8);
    }

    @Override // q1.l
    public final void q0() {
        this.f404g.setSystemBarsBehavior(2);
    }
}
