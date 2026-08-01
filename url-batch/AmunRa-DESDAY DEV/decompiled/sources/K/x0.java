package K;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class x0 extends s1.l {
    public final Window h;
    public final C.g i;

    public x0(Window window, C.g gVar) {
        this.h = window;
        this.i = gVar;
    }

    @Override // s1.l
    public final void F() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                if (i == 1) {
                    k0(4);
                } else if (i == 2) {
                    k0(2);
                } else if (i == 8) {
                    ((C.g) this.i.f64b).x();
                }
            }
        }
    }

    @Override // s1.l
    public final void Y(boolean z2) {
        if (!z2) {
            l0(16);
            return;
        }
        Window window = this.h;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        k0(16);
    }

    @Override // s1.l
    public final void Z(boolean z2) {
        if (!z2) {
            l0(8192);
            return;
        }
        Window window = this.h;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        k0(8192);
    }

    @Override // s1.l
    public final void f0() {
        l0(2048);
        k0(4096);
    }

    public final void k0(int i) {
        View decorView = this.h.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void l0(int i) {
        View decorView = this.h.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
