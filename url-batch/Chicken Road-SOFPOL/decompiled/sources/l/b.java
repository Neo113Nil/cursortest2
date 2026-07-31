package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f4203e;

    public /* synthetic */ b(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f4202d = i;
        this.f4203e = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4202d) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4203e;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f395w = actionBarOverlayLayout.f379f.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f396x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4203e;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f395w = actionBarOverlayLayout2.f379f.animate().translationY(-actionBarOverlayLayout2.f379f.getHeight()).setListener(actionBarOverlayLayout2.f396x);
                break;
        }
    }
}
