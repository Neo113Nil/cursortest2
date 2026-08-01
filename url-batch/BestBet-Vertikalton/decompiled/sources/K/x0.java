package K;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class x0 extends H1.d {

    /* renamed from: e, reason: collision with root package name */
    public final Window f670e;

    /* renamed from: f, reason: collision with root package name */
    public final A0.c f671f;

    public x0(Window window, A0.c cVar) {
        this.f670e = window;
        this.f671f = cVar;
    }

    @Override // H1.d
    public final void L() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                if (i == 1) {
                    y0(4);
                } else if (i == 2) {
                    y0(2);
                } else if (i == 8) {
                    ((A0.c) this.f671f.f6b).s();
                }
            }
        }
    }

    @Override // H1.d
    public final void h0(boolean z2) {
        if (!z2) {
            z0(16);
            return;
        }
        Window window = this.f670e;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        y0(16);
    }

    @Override // H1.d
    public final void i0(boolean z2) {
        if (!z2) {
            z0(8192);
            return;
        }
        Window window = this.f670e;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        y0(8192);
    }

    @Override // H1.d
    public final void p0() {
        z0(2048);
        y0(4096);
    }

    public final void y0(int i) {
        View decorView = this.f670e.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void z0(int i) {
        View decorView = this.f670e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
