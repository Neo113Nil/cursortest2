package K;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class x0 extends u1.l {

    /* renamed from: e, reason: collision with root package name */
    public final Window f439e;

    /* renamed from: f, reason: collision with root package name */
    public final C.h f440f;

    public x0(Window window, C.h hVar) {
        this.f439e = window;
        this.f440f = hVar;
    }

    @Override // u1.l
    public final void J() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                if (i == 1) {
                    r0(4);
                } else if (i == 2) {
                    r0(2);
                } else if (i == 8) {
                    ((C.h) this.f440f.f150b).A();
                }
            }
        }
    }

    @Override // u1.l
    public final void j0(boolean z2) {
        if (!z2) {
            s0(16);
            return;
        }
        Window window = this.f439e;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        r0(16);
    }

    @Override // u1.l
    public final void k0(boolean z2) {
        if (!z2) {
            s0(8192);
            return;
        }
        Window window = this.f439e;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        r0(8192);
    }

    @Override // u1.l
    public final void m0() {
        s0(2048);
        r0(4096);
    }

    public final void r0(int i) {
        View decorView = this.f439e.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void s0(int i) {
        View decorView = this.f439e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
