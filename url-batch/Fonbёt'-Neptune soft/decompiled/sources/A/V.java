package A;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class V extends U {
    @Override // a.AbstractC0132a
    public final void E(boolean z2) {
        Window window = this.f25j;
        if (!z2) {
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
