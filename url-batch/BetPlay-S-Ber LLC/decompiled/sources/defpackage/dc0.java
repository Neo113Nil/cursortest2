package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class dc0 extends l70 {
    public final WindowInsetsController o;
    public final Window p;

    public dc0(Window window, ix ixVar) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.o = insetsController;
        this.p = window;
    }

    @Override // defpackage.l70
    public void T(boolean z) {
        a0(16, z, 16);
    }

    @Override // defpackage.l70
    public void U(boolean z) {
        a0(8192, z, 8);
    }

    public final void a0(int i, boolean z, int i2) {
        Window window = this.p;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.o;
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

    @Override // defpackage.l70
    public boolean x() {
        int systemBarsAppearance;
        Window window = this.p;
        if (window != null) {
            return (window.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }
        this.o.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.o.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }
}
