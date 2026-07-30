package w;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class W extends o.g {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsetsController f3047a;

    /* renamed from: b, reason: collision with root package name */
    public final Window f3048b;

    public W(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f3047a = insetsController;
        this.f3048b = window;
    }

    @Override // o.g
    public final void w(boolean z2) {
        Window window = this.f3048b;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f3047a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f3047a.setSystemBarsAppearance(0, 16);
    }

    @Override // o.g
    public final void x(boolean z2) {
        Window window = this.f3048b;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f3047a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f3047a.setSystemBarsAppearance(0, 8);
    }
}
