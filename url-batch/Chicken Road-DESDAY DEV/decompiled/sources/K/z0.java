package K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class z0 extends u1.l {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f464e;

    /* renamed from: f, reason: collision with root package name */
    public Window f465f;

    public z0(WindowInsetsController windowInsetsController, C.g gVar) {
        this.f464e = windowInsetsController;
    }

    @Override // u1.l
    public final void D() {
        this.f464e.hide(7);
    }

    @Override // u1.l
    public final void Y(boolean z2) {
        Window window = this.f465f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f464e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f464e.setSystemBarsAppearance(0, 16);
    }

    @Override // u1.l
    public final void Z(boolean z2) {
        Window window = this.f465f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f464e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f464e.setSystemBarsAppearance(0, 8);
    }

    @Override // u1.l
    public final void f0() {
        this.f464e.setSystemBarsBehavior(2);
    }
}
