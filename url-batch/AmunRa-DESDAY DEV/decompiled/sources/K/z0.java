package K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class z0 extends s1.l {
    public final WindowInsetsController h;
    public Window i;

    public z0(WindowInsetsController windowInsetsController, C.g gVar) {
        this.h = windowInsetsController;
    }

    @Override // s1.l
    public final void F() {
        this.h.hide(7);
    }

    @Override // s1.l
    public final void Y(boolean z2) {
        Window window = this.i;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.h.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.h.setSystemBarsAppearance(0, 16);
    }

    @Override // s1.l
    public final void Z(boolean z2) {
        Window window = this.i;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.h.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.h.setSystemBarsAppearance(0, 8);
    }

    @Override // s1.l
    public final void f0() {
        this.h.setSystemBarsBehavior(2);
    }
}
