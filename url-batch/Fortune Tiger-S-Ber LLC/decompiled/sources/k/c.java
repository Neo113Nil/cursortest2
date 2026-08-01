package k;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2506f;
    public final /* synthetic */ ActionBarOverlayLayout g;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i4) {
        this.f2506f = i4;
        this.g = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2506f) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.g;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.B = actionBarOverlayLayout.f201i.animate().translationY(0.0f).setListener(actionBarOverlayLayout.C);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.g;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.B = actionBarOverlayLayout2.f201i.animate().translationY(-actionBarOverlayLayout2.f201i.getHeight()).setListener(actionBarOverlayLayout2.C);
                break;
        }
    }
}
