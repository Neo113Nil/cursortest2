package M;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class y0 extends z1.d {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f604e;

    /* renamed from: f, reason: collision with root package name */
    public Window f605f;

    public y0(WindowInsetsController windowInsetsController, E.g gVar) {
        this.f604e = windowInsetsController;
    }

    @Override // z1.d
    public final void C() {
        this.f604e.hide(7);
    }

    @Override // z1.d
    public final void W(boolean z2) {
        Window window = this.f605f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f604e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f604e.setSystemBarsAppearance(0, 16);
    }

    @Override // z1.d
    public final void X(boolean z2) {
        Window window = this.f605f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f604e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f604e.setSystemBarsAppearance(0, 8);
    }

    @Override // z1.d
    public final void b0() {
        this.f604e.setSystemBarsBehavior(2);
    }
}
