package K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class C0 extends z1.l {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f427e;

    /* renamed from: f, reason: collision with root package name */
    public Window f428f;

    public C0(WindowInsetsController windowInsetsController, C.g gVar) {
        this.f427e = windowInsetsController;
    }

    @Override // z1.l
    public final void D() {
        this.f427e.hide(7);
    }

    @Override // z1.l
    public final void T(boolean z2) {
        Window window = this.f428f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f427e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f427e.setSystemBarsAppearance(0, 16);
    }

    @Override // z1.l
    public final void U(boolean z2) {
        Window window = this.f428f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f427e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f427e.setSystemBarsAppearance(0, 8);
    }

    @Override // z1.l
    public final void X() {
        this.f427e.setSystemBarsBehavior(2);
    }
}
