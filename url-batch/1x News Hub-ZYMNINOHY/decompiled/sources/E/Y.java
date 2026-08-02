package E;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class Y extends X {
    @Override // a.AbstractC0129a
    public final void x(boolean z) {
        Window window = this.f271e;
        if (!z) {
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
