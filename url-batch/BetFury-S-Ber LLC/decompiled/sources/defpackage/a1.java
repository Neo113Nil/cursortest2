package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class a1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ActionBarOverlayLayout g;

    public /* synthetic */ a1(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f = i;
        this.g = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        ActionBarOverlayLayout actionBarOverlayLayout = this.g;
        switch (i) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.B = actionBarOverlayLayout.i.animate().translationY(0.0f).setListener(actionBarOverlayLayout.C);
                break;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.B = actionBarOverlayLayout.i.animate().translationY(-actionBarOverlayLayout.i.getHeight()).setListener(actionBarOverlayLayout.C);
                break;
        }
    }
}
