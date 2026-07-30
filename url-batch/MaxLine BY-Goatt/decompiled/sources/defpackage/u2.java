package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class u2 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ ActionBarOverlayLayout n;

    public /* synthetic */ u2(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.m = i;
        this.n = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        ActionBarOverlayLayout actionBarOverlayLayout = this.n;
        switch (i) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.I = actionBarOverlayLayout.p.animate().translationY(0.0f).setListener(actionBarOverlayLayout.J);
                break;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.I = actionBarOverlayLayout.p.animate().translationY(-actionBarOverlayLayout.p.getHeight()).setListener(actionBarOverlayLayout.J);
                break;
        }
    }
}
