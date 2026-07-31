package a1;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class T extends S {
    @Override // I2.d
    public final void I(boolean z3) {
        Window window = this.f3543d;
        if (!z3) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
