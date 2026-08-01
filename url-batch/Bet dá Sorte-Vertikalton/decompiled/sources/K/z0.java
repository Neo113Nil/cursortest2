package K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class z0 extends u1.l {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f446e;

    /* renamed from: f, reason: collision with root package name */
    public Window f447f;

    public z0(WindowInsetsController windowInsetsController, C.h hVar) {
        this.f446e = windowInsetsController;
    }

    @Override // u1.l
    public final void J() {
        this.f446e.hide(7);
    }

    @Override // u1.l
    public final void j0(boolean z2) {
        Window window = this.f447f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f446e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f446e.setSystemBarsAppearance(0, 16);
    }

    @Override // u1.l
    public final void k0(boolean z2) {
        Window window = this.f447f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f446e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f446e.setSystemBarsAppearance(0, 8);
    }

    @Override // u1.l
    public final void m0() {
        this.f446e.setSystemBarsBehavior(2);
    }
}
