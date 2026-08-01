package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0205c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2952b;

    public /* synthetic */ RunnableC0205c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f2951a = i;
        this.f2952b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2951a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2952b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1319w = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1320x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2952b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1319w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1320x);
                break;
        }
    }
}
