package K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class z0 extends x1.d {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f517e;

    /* renamed from: f, reason: collision with root package name */
    public Window f518f;

    public z0(WindowInsetsController windowInsetsController, C.g gVar) {
        this.f517e = windowInsetsController;
    }

    @Override // x1.d
    public final void H() {
        this.f517e.hide(7);
    }

    @Override // x1.d
    public final void e0(boolean z2) {
        Window window = this.f518f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f517e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f517e.setSystemBarsAppearance(0, 16);
    }

    @Override // x1.d
    public final void f0(boolean z2) {
        Window window = this.f518f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f517e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f517e.setSystemBarsAppearance(0, 8);
    }

    @Override // x1.d
    public final void l0() {
        this.f517e.setSystemBarsBehavior(2);
    }
}
