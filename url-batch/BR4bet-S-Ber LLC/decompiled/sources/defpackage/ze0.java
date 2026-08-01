package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ze0 extends mz {
    public final Window j;

    public ze0(Window window, ky kyVar) {
        this.j = window;
    }

    @Override // defpackage.mz
    public final void G(boolean z) {
        if (!z) {
            V(16);
            return;
        }
        Window window = this.j;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
    }

    @Override // defpackage.mz
    public final void H(boolean z) {
        if (!z) {
            V(8192);
            return;
        }
        Window window = this.j;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
    }

    public final void V(int i) {
        View decorView = this.j.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.mz
    public final boolean w() {
        return (this.j.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
