package K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class C0 extends w1.l {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f410e;

    /* renamed from: f, reason: collision with root package name */
    public Window f411f;

    public C0(WindowInsetsController windowInsetsController, C.g gVar) {
        this.f410e = windowInsetsController;
    }

    @Override // w1.l
    public final void E() {
        this.f410e.hide(7);
    }

    @Override // w1.l
    public final void T(boolean z2) {
        Window window = this.f411f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f410e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f410e.setSystemBarsAppearance(0, 16);
    }

    @Override // w1.l
    public final void U(boolean z2) {
        Window window = this.f411f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f410e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f410e.setSystemBarsAppearance(0, 8);
    }

    @Override // w1.l
    public final void X() {
        this.f410e.setSystemBarsBehavior(2);
    }
}
