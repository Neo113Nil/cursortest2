package M;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class w0 extends z1.d {

    /* renamed from: e, reason: collision with root package name */
    public final Window f597e;

    /* renamed from: f, reason: collision with root package name */
    public final E.g f598f;

    public w0(Window window, E.g gVar) {
        this.f597e = window;
        this.f598f = gVar;
    }

    @Override // z1.d
    public final void C() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                if (i == 1) {
                    g0(4);
                } else if (i == 2) {
                    g0(2);
                } else if (i == 8) {
                    ((E.g) this.f598f.f170b).x();
                }
            }
        }
    }

    @Override // z1.d
    public final void W(boolean z2) {
        if (!z2) {
            h0(16);
            return;
        }
        Window window = this.f597e;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        g0(16);
    }

    @Override // z1.d
    public final void X(boolean z2) {
        if (!z2) {
            h0(8192);
            return;
        }
        Window window = this.f597e;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        g0(8192);
    }

    @Override // z1.d
    public final void b0() {
        h0(2048);
        g0(4096);
    }

    public final void g0(int i) {
        View decorView = this.f597e.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void h0(int i) {
        View decorView = this.f597e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
