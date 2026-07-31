package a1;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class S extends I2.d {

    /* renamed from: d, reason: collision with root package name */
    public final Window f3543d;

    public S(Window window) {
        this.f3543d = window;
    }

    @Override // I2.d
    public final void J(boolean z3) {
        Window window = this.f3543d;
        if (!z3) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
