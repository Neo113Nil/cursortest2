package K;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class C0 extends q1.l {

    /* renamed from: g, reason: collision with root package name */
    public final Window f396g;
    public final B0.d h;

    public C0(Window window, B0.d dVar) {
        this.f396g = window;
        this.h = dVar;
    }

    @Override // q1.l
    public final void J() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                if (i == 1) {
                    u0(4);
                } else if (i == 2) {
                    u0(2);
                } else if (i == 8) {
                    ((B0.d) this.h.f67b).x();
                }
            }
        }
    }

    @Override // q1.l
    public final void l0(boolean z2) {
        if (!z2) {
            v0(16);
            return;
        }
        Window window = this.f396g;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        u0(16);
    }

    @Override // q1.l
    public final void m0(boolean z2) {
        if (!z2) {
            v0(8192);
            return;
        }
        Window window = this.f396g;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        u0(8192);
    }

    @Override // q1.l
    public final void q0() {
        v0(2048);
        u0(4096);
    }

    public final void u0(int i) {
        View decorView = this.f396g.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void v0(int i) {
        View decorView = this.f396g.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
