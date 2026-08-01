package K;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class A0 extends z1.l {

    /* renamed from: e, reason: collision with root package name */
    public final Window f424e;

    /* renamed from: f, reason: collision with root package name */
    public final C.g f425f;

    public A0(Window window, C.g gVar) {
        this.f424e = window;
        this.f425f = gVar;
    }

    @Override // z1.l
    public final void D() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                if (i == 1) {
                    d0(4);
                } else if (i == 2) {
                    d0(2);
                } else if (i == 8) {
                    ((C.g) this.f425f.f80b).A();
                }
            }
        }
    }

    @Override // z1.l
    public final void T(boolean z2) {
        if (!z2) {
            e0(16);
            return;
        }
        Window window = this.f424e;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        d0(16);
    }

    @Override // z1.l
    public final void U(boolean z2) {
        if (!z2) {
            e0(8192);
            return;
        }
        Window window = this.f424e;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        d0(8192);
    }

    @Override // z1.l
    public final void X() {
        e0(2048);
        d0(4096);
    }

    public final void d0(int i) {
        View decorView = this.f424e.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void e0(int i) {
        View decorView = this.f424e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
