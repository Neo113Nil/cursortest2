package l;

import a.AbstractC0016a;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class r extends AbstractC0016a {

    /* renamed from: g, reason: collision with root package name */
    public final Window f978g;

    public r(Window window) {
        super(22);
        this.f978g = window;
    }

    @Override // a.AbstractC0016a
    public final void C(boolean z) {
        Window window = this.f978g;
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
