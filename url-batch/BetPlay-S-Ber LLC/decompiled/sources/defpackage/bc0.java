package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class bc0 extends l70 {
    public final Window o;

    public bc0(Window window, ix ixVar) {
        this.o = window;
    }

    @Override // defpackage.l70
    public final void T(boolean z) {
        if (!z) {
            a0(16);
            return;
        }
        Window window = this.o;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
    }

    @Override // defpackage.l70
    public final void U(boolean z) {
        if (!z) {
            a0(8192);
            return;
        }
        Window window = this.o;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
    }

    public final void a0(int i) {
        View decorView = this.o.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.l70
    public final boolean x() {
        return (this.o.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
