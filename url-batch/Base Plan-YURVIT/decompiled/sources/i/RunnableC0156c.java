package i;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: i.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0156c implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2187f;

    public /* synthetic */ RunnableC0156c(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f2186e = i2;
        this.f2187f = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2186e) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2187f;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1247x = actionBarOverlayLayout.f1231g.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1248y);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2187f;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1247x = actionBarOverlayLayout2.f1231g.animate().translationY(-actionBarOverlayLayout2.f1231g.getHeight()).setListener(actionBarOverlayLayout2.f1248y);
                break;
        }
    }
}
