package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class y0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ActionBarOverlayLayout g;

    public /* synthetic */ y0(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
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
