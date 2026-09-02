package l;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class r extends a.a {

    /* renamed from: e, reason: collision with root package name */
    public final Window f925e;

    public r(Window window) {
        this.f925e = window;
    }

    @Override // a.a
    public final void z(boolean z2) {
        Window window = this.f925e;
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
