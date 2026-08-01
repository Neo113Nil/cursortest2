package M;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class w0 extends H1.d {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsetsController f799b;

    /* renamed from: c, reason: collision with root package name */
    public Window f800c;

    public w0(WindowInsetsController windowInsetsController, C1.d dVar) {
        this.f799b = windowInsetsController;
    }

    @Override // H1.d
    public final void L() {
        this.f799b.hide(7);
    }

    @Override // H1.d
    public final boolean N() {
        int systemBarsAppearance;
        this.f799b.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.f799b.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }

    @Override // H1.d
    public final void c0(boolean z2) {
        Window window = this.f800c;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f799b.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f799b.setSystemBarsAppearance(0, 16);
    }

    @Override // H1.d
    public final void d0(boolean z2) {
        Window window = this.f800c;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f799b.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f799b.setSystemBarsAppearance(0, 8);
    }

    @Override // H1.d
    public final void e0() {
        this.f799b.setSystemBarsBehavior(2);
    }
}
