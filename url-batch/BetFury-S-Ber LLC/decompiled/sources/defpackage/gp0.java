package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class gp0 extends mc0 {
    public final WindowInsetsController a;
    public final Window b;

    public gp0(Window window, xy xyVar) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.a = insetsController;
        this.b = window;
    }

    @Override // defpackage.mc0
    public boolean g() {
        int systemBarsAppearance;
        Window window = this.b;
        if (window != null) {
            return (window.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }
        this.a.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.a.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }

    @Override // defpackage.mc0
    public void k(boolean z) {
        m(16, 16, z);
    }

    @Override // defpackage.mc0
    public void l(boolean z) {
        m(8192, 8, z);
    }

    public final void m(int i, int i2, boolean z) {
        Window window = this.b;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.a;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
