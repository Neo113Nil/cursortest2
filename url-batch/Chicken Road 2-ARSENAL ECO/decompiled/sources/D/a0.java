package D;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class a0 extends Z {
    @Override // A3.c
    public final void c0(boolean z5) {
        Window window = this.f273b;
        if (!z5) {
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
