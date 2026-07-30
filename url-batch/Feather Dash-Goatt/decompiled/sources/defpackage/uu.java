package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class uu {
    public void a(dg1 dg1Var, dg1 dg1Var2, Window window, View view, boolean z, boolean z2) {
        dg1Var.getClass();
        dg1Var2.getClass();
        window.getClass();
        view.getClass();
        if (Build.VERSION.SDK_INT >= 35) {
            window.setDecorFitsSystemWindows(false);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 256);
            window.setDecorFitsSystemWindows(false);
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        c51 jp1Var = Build.VERSION.SDK_INT >= 35 ? new jp1(window) : new c51(window);
        Window window2 = (Window) jp1Var.g;
        WindowInsetsController windowInsetsController = (WindowInsetsController) jp1Var.e;
        if (z) {
            if (window2 != null) {
                View decorView2 = window2.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            windowInsetsController.setSystemBarsAppearance(0, 8);
        } else {
            if (window2 != null) {
                View decorView3 = window2.getDecorView();
                decorView3.setSystemUiVisibility(decorView3.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
        }
        if (z2) {
            if (window2 != null) {
                View decorView4 = window2.getDecorView();
                decorView4.setSystemUiVisibility(decorView4.getSystemUiVisibility() & (-17));
            }
            windowInsetsController.setSystemBarsAppearance(0, 16);
            return;
        }
        if (window2 != null) {
            View decorView5 = window2.getDecorView();
            decorView5.setSystemUiVisibility(decorView5.getSystemUiVisibility() | 16);
        }
        windowInsetsController.setSystemBarsAppearance(16, 16);
    }
}
