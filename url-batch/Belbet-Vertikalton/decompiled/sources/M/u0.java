package M;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class u0 extends H1.d {

    /* renamed from: b, reason: collision with root package name */
    public final Window f796b;

    /* renamed from: c, reason: collision with root package name */
    public final C1.d f797c;

    public u0(Window window, C1.d dVar) {
        this.f796b = window;
        this.f797c = dVar;
    }

    @Override // H1.d
    public final void L() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                if (i == 1) {
                    l0(4);
                } else if (i == 2) {
                    l0(2);
                } else if (i == 8) {
                    ((C1.d) this.f797c.f145b).t();
                }
            }
        }
    }

    @Override // H1.d
    public final boolean N() {
        return (this.f796b.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // H1.d
    public final void c0(boolean z2) {
        if (!z2) {
            m0(16);
            return;
        }
        Window window = this.f796b;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        l0(16);
    }

    @Override // H1.d
    public final void d0(boolean z2) {
        if (!z2) {
            m0(8192);
            return;
        }
        Window window = this.f796b;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        l0(8192);
    }

    @Override // H1.d
    public final void e0() {
        m0(2048);
        l0(4096);
    }

    public final void l0(int i) {
        View decorView = this.f796b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void m0(int i) {
        View decorView = this.f796b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
