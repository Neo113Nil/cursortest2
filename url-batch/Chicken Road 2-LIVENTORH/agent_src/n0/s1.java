package n0;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class s1 extends r1 {
    @Override // h.a
    public final void d0(boolean z3) {
        if (!z3) {
            t0(16);
            return;
        }
        Window window = this.f2776k;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
