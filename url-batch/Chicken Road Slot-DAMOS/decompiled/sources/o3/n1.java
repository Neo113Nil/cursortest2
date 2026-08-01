package o3;

import android.view.WindowInsetsController;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n1 extends l1 {
    @Override // o3.l1, k7.e
    public final void O(boolean z10) {
        ((WindowInsetsController) this.f7422s).setSystemBarsAppearance(z10 ? 16 : 0, 16);
    }

    @Override // o3.l1, k7.e
    public final void P(boolean z10) {
        ((WindowInsetsController) this.f7422s).setSystemBarsAppearance(z10 ? 8 : 0, 8);
    }

    @Override // o3.l1, k7.e
    public final void Q() {
        ((WindowInsetsController) this.f7422s).setSystemBarsBehavior(2);
    }
}
