package A;

import a.AbstractC0132a;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class X extends AbstractC0132a {

    /* renamed from: j, reason: collision with root package name */
    public final WindowInsetsController f26j;

    /* renamed from: k, reason: collision with root package name */
    public final Window f27k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Window window) {
        super(1);
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f26j = insetsController;
        this.f27k = window;
    }

    @Override // a.AbstractC0132a
    public final void D(boolean z2) {
        Window window = this.f27k;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f26j.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f26j.setSystemBarsAppearance(0, 16);
    }

    @Override // a.AbstractC0132a
    public final void E(boolean z2) {
        Window window = this.f27k;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f26j.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f26j.setSystemBarsAppearance(0, 8);
    }
}
