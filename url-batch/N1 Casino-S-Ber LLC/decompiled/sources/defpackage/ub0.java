package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class ub0 extends u90 {
    public final WindowInsetsController a;
    public final Window b;

    public ub0(Window window, vw vwVar) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.a = insetsController;
        this.b = window;
    }

    @Override // defpackage.u90
    public boolean a() {
        int systemBarsAppearance;
        Window window = this.b;
        if (window != null) {
            return (window.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }
        this.a.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.a.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }

    @Override // defpackage.u90
    public void c(boolean z) {
        e(16, 16, z);
    }

    @Override // defpackage.u90
    public void d(boolean z) {
        e(8192, 8, z);
    }

    public final void e(int i, int i2, boolean z) {
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
