package c1;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class W extends V {
    @Override // l0.c
    public final void L(boolean z3) {
        Window window = this.f5590g;
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
