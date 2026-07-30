package w;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class T extends o.g {

    /* renamed from: a, reason: collision with root package name */
    public final Window f3046a;

    public T(Window window) {
        this.f3046a = window;
    }

    @Override // o.g
    public final void x(boolean z2) {
        Window window = this.f3046a;
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
