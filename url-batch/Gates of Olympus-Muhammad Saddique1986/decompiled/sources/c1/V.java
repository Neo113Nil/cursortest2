package c1;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class V extends l0.c {

    /* renamed from: g, reason: collision with root package name */
    public final Window f5590g;

    public V(Window window) {
        this.f5590g = window;
    }

    @Override // l0.c
    public final void M(boolean z3) {
        Window window = this.f5590g;
        if (!z3) {
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
