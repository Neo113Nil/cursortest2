package K;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class A0 extends w1.l {

    /* renamed from: e, reason: collision with root package name */
    public final Window f407e;

    /* renamed from: f, reason: collision with root package name */
    public final C.g f408f;

    public A0(Window window, C.g gVar) {
        this.f407e = window;
        this.f408f = gVar;
    }

    @Override // w1.l
    public final void E() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                if (i == 1) {
                    b0(4);
                } else if (i == 2) {
                    b0(2);
                } else if (i == 8) {
                    ((C.g) this.f408f.f115b).A();
                }
            }
        }
    }

    @Override // w1.l
    public final void T(boolean z2) {
        if (!z2) {
            c0(16);
            return;
        }
        Window window = this.f407e;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        b0(16);
    }

    @Override // w1.l
    public final void U(boolean z2) {
        if (!z2) {
            c0(8192);
            return;
        }
        Window window = this.f407e;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        b0(8192);
    }

    @Override // w1.l
    public final void X() {
        c0(2048);
        b0(4096);
    }

    public final void b0(int i) {
        View decorView = this.f407e.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void c0(int i) {
        View decorView = this.f407e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
