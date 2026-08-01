package K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class z0 extends H1.d {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f676e;

    /* renamed from: f, reason: collision with root package name */
    public Window f677f;

    public z0(WindowInsetsController windowInsetsController, A0.c cVar) {
        this.f676e = windowInsetsController;
    }

    @Override // H1.d
    public final void L() {
        this.f676e.hide(7);
    }

    @Override // H1.d
    public final void h0(boolean z2) {
        Window window = this.f677f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f676e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f676e.setSystemBarsAppearance(0, 16);
    }

    @Override // H1.d
    public final void i0(boolean z2) {
        Window window = this.f677f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f676e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f676e.setSystemBarsAppearance(0, 8);
    }

    @Override // H1.d
    public final void p0() {
        this.f676e.setSystemBarsBehavior(2);
    }
}
