package K;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class x0 extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final Window f452e;

    public x0(Window window, O0.e eVar) {
        this.f452e = window;
    }

    @Override // A.c
    public final void A0(boolean z2) {
        if (!z2) {
            M0(8192);
            return;
        }
        Window window = this.f452e;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    public final void M0(int i) {
        View decorView = this.f452e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // A.c
    public final void z0(boolean z2) {
        if (!z2) {
            M0(16);
            return;
        }
        Window window = this.f452e;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
