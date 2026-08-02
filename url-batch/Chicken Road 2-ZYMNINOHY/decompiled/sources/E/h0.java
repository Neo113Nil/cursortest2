package E;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class h0 extends O3.d {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsetsController f418a;

    /* renamed from: b, reason: collision with root package name */
    public final Window f419b;

    public h0(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f418a = insetsController;
        this.f419b = window;
    }

    @Override // O3.d
    public final void A(boolean z) {
        Window window = this.f419b;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f418a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f418a.setSystemBarsAppearance(0, 16);
    }

    @Override // O3.d
    public final void B(boolean z) {
        Window window = this.f419b;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f418a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f418a.setSystemBarsAppearance(0, 8);
    }
}
