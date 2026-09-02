package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2252g;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f2251f = i;
        this.f2252g = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2251f) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2252g;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.B = actionBarOverlayLayout.i.animate().translationY(0.0f).setListener(actionBarOverlayLayout.C);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2252g;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.B = actionBarOverlayLayout2.i.animate().translationY(-actionBarOverlayLayout2.i.getHeight()).setListener(actionBarOverlayLayout2.C);
                break;
        }
    }
}
