package I;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class w0 extends P0.f {

    /* renamed from: a, reason: collision with root package name */
    public final Window f1243a;

    public w0(Window window) {
        this.f1243a = window;
    }

    @Override // P0.f
    public final void I(boolean z7) {
        Window window = this.f1243a;
        if (!z7) {
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
