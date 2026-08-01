package n0;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class w1 extends b4.l {

    /* renamed from: b, reason: collision with root package name */
    public final Window f2845b;

    public w1(Window window, o2.f fVar) {
        this.f2845b = window;
    }

    @Override // b4.l
    public final void Y(boolean z4) {
        if (!z4) {
            m0(16);
            return;
        }
        Window window = this.f2845b;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        l0(16);
    }

    @Override // b4.l
    public final void Z(boolean z4) {
        if (!z4) {
            m0(8192);
            return;
        }
        Window window = this.f2845b;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        l0(8192);
    }

    public final void l0(int i) {
        View decorView = this.f2845b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void m0(int i) {
        View decorView = this.f2845b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
