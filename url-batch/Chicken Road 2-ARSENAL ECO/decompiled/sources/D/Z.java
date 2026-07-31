package D;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class Z extends A3.c {

    /* renamed from: b, reason: collision with root package name */
    public final Window f273b;

    public Z(Window window) {
        super(2);
        this.f273b = window;
    }

    @Override // A3.c
    public final void d0(boolean z5) {
        Window window = this.f273b;
        if (!z5) {
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
