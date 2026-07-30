package b3;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class u0 extends a8.m {

    /* renamed from: g, reason: collision with root package name */
    public final Window f1369g;

    public u0(Window window) {
        super(5);
        this.f1369g = window;
    }

    @Override // a8.m
    public final void K(boolean z8) {
        Window window = this.f1369g;
        if (!z8) {
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
