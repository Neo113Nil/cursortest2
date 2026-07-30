package l;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class v extends a.a {

    /* renamed from: f, reason: collision with root package name */
    public final WindowInsetsController f761f;

    /* renamed from: g, reason: collision with root package name */
    public final Window f762g;

    public v(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f761f = insetsController;
        this.f762g = window;
    }

    @Override // a.a
    public final void y(boolean z2) {
        Window window = this.f762g;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f761f.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f761f.setSystemBarsAppearance(0, 16);
    }

    @Override // a.a
    public final void z(boolean z2) {
        Window window = this.f762g;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f761f.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f761f.setSystemBarsAppearance(0, 8);
    }
}
