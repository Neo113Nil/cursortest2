package I;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class y0 extends P0.f {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsetsController f1248a;

    /* renamed from: b, reason: collision with root package name */
    public final Window f1249b;

    public y0(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f1248a = insetsController;
        this.f1249b = window;
    }

    @Override // P0.f
    public void H(boolean z7) {
        R(16, 16, z7);
    }

    @Override // P0.f
    public void I(boolean z7) {
        R(8192, 8, z7);
    }

    public final void R(int i2, int i5, boolean z7) {
        Window window = this.f1249b;
        if (window == null) {
            if (z7) {
                this.f1248a.setSystemBarsAppearance(i5, i5);
                return;
            } else {
                this.f1248a.setSystemBarsAppearance(0, i5);
                return;
            }
        }
        if (z7) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i2) & decorView2.getSystemUiVisibility());
        }
    }
}
