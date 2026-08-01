package K;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class x0 extends u1.l {

    /* renamed from: e, reason: collision with root package name */
    public final Window f457e;

    /* renamed from: f, reason: collision with root package name */
    public final C.g f458f;

    public x0(Window window, C.g gVar) {
        this.f457e = window;
        this.f458f = gVar;
    }

    @Override // u1.l
    public final void D() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                if (i == 1) {
                    j0(4);
                } else if (i == 2) {
                    j0(2);
                } else if (i == 8) {
                    ((C.g) this.f458f.f66b).A();
                }
            }
        }
    }

    @Override // u1.l
    public final void Y(boolean z2) {
        if (!z2) {
            k0(16);
            return;
        }
        Window window = this.f457e;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        j0(16);
    }

    @Override // u1.l
    public final void Z(boolean z2) {
        if (!z2) {
            k0(8192);
            return;
        }
        Window window = this.f457e;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        j0(8192);
    }

    @Override // u1.l
    public final void f0() {
        k0(2048);
        j0(4096);
    }

    public final void j0(int i) {
        View decorView = this.f457e.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void k0(int i) {
        View decorView = this.f457e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
