package E;

import a.AbstractC0129a;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class Z extends AbstractC0129a {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f272e;
    public final Window f;

    public Z(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f272e = insetsController;
        this.f = window;
    }

    @Override // a.AbstractC0129a
    public final void x(boolean z) {
        Window window = this.f;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f272e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f272e.setSystemBarsAppearance(0, 16);
    }

    @Override // a.AbstractC0129a
    public final void y(boolean z) {
        Window window = this.f;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f272e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f272e.setSystemBarsAppearance(0, 8);
    }
}
