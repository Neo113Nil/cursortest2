package O;

import android.view.Window;

/* loaded from: classes.dex */
public final class C0 extends B0 {
    @Override // O.B0, p8.g
    public final void m(boolean z8) {
        if (!z8) {
            B(16);
            return;
        }
        Window window = this.f2217b;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        A(16);
    }
}
