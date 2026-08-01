package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2403f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2404g;

    public /* synthetic */ b(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f2403f = i;
        this.f2404g = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2403f) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2404g;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.B = actionBarOverlayLayout.i.animate().translationY(0.0f).setListener(actionBarOverlayLayout.C);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2404g;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.B = actionBarOverlayLayout2.i.animate().translationY(-actionBarOverlayLayout2.i.getHeight()).setListener(actionBarOverlayLayout2.C);
                break;
        }
    }
}
