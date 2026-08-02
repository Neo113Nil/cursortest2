package E;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class f0 extends O3.d {

    /* renamed from: a, reason: collision with root package name */
    public final Window f417a;

    public f0(Window window) {
        this.f417a = window;
    }

    @Override // O3.d
    public final void B(boolean z) {
        Window window = this.f417a;
        if (!z) {
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
