package E;

import a.AbstractC0129a;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class X extends AbstractC0129a {

    /* renamed from: e, reason: collision with root package name */
    public final Window f271e;

    public X(Window window) {
        this.f271e = window;
    }

    @Override // a.AbstractC0129a
    public final void y(boolean z) {
        Window window = this.f271e;
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
