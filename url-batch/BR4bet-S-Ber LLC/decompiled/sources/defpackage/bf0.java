package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class bf0 extends mz {
    public final WindowInsetsController j;
    public final Window k;

    public bf0(Window window, ky kyVar) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.j = insetsController;
        this.k = window;
    }

    @Override // defpackage.mz
    public void G(boolean z) {
        V(16, 16, z);
    }

    @Override // defpackage.mz
    public void H(boolean z) {
        V(8192, 8, z);
    }

    public final void V(int i, int i2, boolean z) {
        Window window = this.k;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.j;
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

    @Override // defpackage.mz
    public boolean w() {
        int systemBarsAppearance;
        Window window = this.k;
        if (window != null) {
            return (window.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }
        this.j.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.j.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }
}
