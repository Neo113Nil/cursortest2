package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aad extends ym {
    final WindowInsetsController a;
    protected final Window b;

    public aad(Window window) {
        WindowInsetsController windowInsetsController;
        windowInsetsController = window.getDecorView().getWindowInsetsController();
        new qy(0);
        this.a = windowInsetsController;
        this.b = window;
    }

    private final void s(boolean z, int i, int i2) {
        Window window = this.b;
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i);
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (~i));
        }
    }

    @Override // defpackage.ym
    public void g(boolean z) {
        s(z, 16, 16);
    }

    @Override // defpackage.ym
    public void h(boolean z) {
        s(z, 8192, 8);
    }
}
