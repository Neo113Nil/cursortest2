package k0;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class n1 extends k3.d {

    /* renamed from: f, reason: collision with root package name */
    public final Window f2761f;

    public n1(Window window, g2.f fVar) {
        this.f2761f = window;
    }

    @Override // k3.d
    public final void b0(boolean z3) {
        if (!z3) {
            l0(16);
            return;
        }
        Window window = this.f2761f;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }

    @Override // k3.d
    public final void c0(boolean z3) {
        if (!z3) {
            l0(8192);
            return;
        }
        Window window = this.f2761f;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    public final void l0(int i4) {
        View decorView = this.f2761f.getDecorView();
        decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
    }
}
