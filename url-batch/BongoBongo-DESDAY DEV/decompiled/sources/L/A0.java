package L;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class A0 extends A1.d {

    /* renamed from: e, reason: collision with root package name */
    public final Window f474e;

    /* renamed from: f, reason: collision with root package name */
    public final D.g f475f;

    public A0(Window window, D.g gVar) {
        this.f474e = window;
        this.f475f = gVar;
    }

    @Override // A1.d
    public final void L() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                if (i == 1) {
                    m0(4);
                } else if (i == 2) {
                    m0(2);
                } else if (i == 8) {
                    ((D.g) this.f475f.f122b).x();
                }
            }
        }
    }

    @Override // A1.d
    public final void d0(boolean z2) {
        if (!z2) {
            n0(16);
            return;
        }
        Window window = this.f474e;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        m0(16);
    }

    @Override // A1.d
    public final void e0(boolean z2) {
        if (!z2) {
            n0(8192);
            return;
        }
        Window window = this.f474e;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        m0(8192);
    }

    @Override // A1.d
    public final void i0() {
        n0(2048);
        m0(4096);
    }

    public final void m0(int i) {
        View decorView = this.f474e.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void n0(int i) {
        View decorView = this.f474e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
