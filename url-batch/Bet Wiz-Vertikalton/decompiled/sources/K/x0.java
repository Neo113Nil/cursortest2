package K;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class x0 extends x1.d {

    /* renamed from: e, reason: collision with root package name */
    public final Window f510e;

    /* renamed from: f, reason: collision with root package name */
    public final C.g f511f;

    public x0(Window window, C.g gVar) {
        this.f510e = window;
        this.f511f = gVar;
    }

    @Override // x1.d
    public final void H() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                if (i == 1) {
                    o0(4);
                } else if (i == 2) {
                    o0(2);
                } else if (i == 8) {
                    ((C.g) this.f511f.f67b).A();
                }
            }
        }
    }

    @Override // x1.d
    public final void e0(boolean z2) {
        if (!z2) {
            p0(16);
            return;
        }
        Window window = this.f510e;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        o0(16);
    }

    @Override // x1.d
    public final void f0(boolean z2) {
        if (!z2) {
            p0(8192);
            return;
        }
        Window window = this.f510e;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        o0(8192);
    }

    @Override // x1.d
    public final void l0() {
        p0(2048);
        o0(4096);
    }

    public final void o0(int i) {
        View decorView = this.f510e.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void p0(int i) {
        View decorView = this.f510e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
