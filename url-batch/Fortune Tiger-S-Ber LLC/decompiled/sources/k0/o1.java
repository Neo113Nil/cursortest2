package k0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class o1 extends k3.d {

    /* renamed from: f, reason: collision with root package name */
    public final WindowInsetsController f2764f;
    public final Window g;

    public o1(Window window, g2.f fVar) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f2764f = insetsController;
        this.g = window;
    }

    @Override // k3.d
    public final void b0(boolean z3) {
        Window window = this.g;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f2764f.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f2764f.setSystemBarsAppearance(0, 16);
    }

    @Override // k3.d
    public final void c0(boolean z3) {
        Window window = this.g;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f2764f.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f2764f.setSystemBarsAppearance(0, 8);
    }
}
