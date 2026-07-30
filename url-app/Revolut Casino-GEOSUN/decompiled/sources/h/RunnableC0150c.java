package h;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: h.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0150c implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2159f;

    public /* synthetic */ RunnableC0150c(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f2158e = i2;
        this.f2159f = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2158e) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2159f;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1156x = actionBarOverlayLayout.f1140g.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1157y);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2159f;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1156x = actionBarOverlayLayout2.f1140g.animate().translationY(-actionBarOverlayLayout2.f1140g.getHeight()).setListener(actionBarOverlayLayout2.f1157y);
                break;
        }
    }
}
