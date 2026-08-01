package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f6031e;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i3) {
        this.f6030d = i3;
        this.f6031e = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6030d) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6031e;
                actionBarOverlayLayout.g();
                actionBarOverlayLayout.H = actionBarOverlayLayout.f417i.animate().translationY(0.0f).setListener(actionBarOverlayLayout.I);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6031e;
                actionBarOverlayLayout2.g();
                actionBarOverlayLayout2.H = actionBarOverlayLayout2.f417i.animate().translationY(-actionBarOverlayLayout2.f417i.getHeight()).setListener(actionBarOverlayLayout2.I);
                break;
        }
    }
}
