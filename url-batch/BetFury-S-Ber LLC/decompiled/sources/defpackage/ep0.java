package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ep0 extends mc0 {
    public final Window a;

    public ep0(Window window, xy xyVar) {
        this.a = window;
    }

    @Override // defpackage.mc0
    public final boolean g() {
        return (this.a.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // defpackage.mc0
    public final void k(boolean z) {
        if (!z) {
            m(16);
            return;
        }
        Window window = this.a;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
    }

    @Override // defpackage.mc0
    public final void l(boolean z) {
        if (!z) {
            m(8192);
            return;
        }
        Window window = this.a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
    }

    public final void m(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
