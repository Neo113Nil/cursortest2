package j;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0227c implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2932f;

    public /* synthetic */ RunnableC0227c(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f2931e = i2;
        this.f2932f = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2931e) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2932f;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1406x = actionBarOverlayLayout.f1390g.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1407y);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2932f;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1406x = actionBarOverlayLayout2.f1390g.animate().translationY(-actionBarOverlayLayout2.f1390g.getHeight()).setListener(actionBarOverlayLayout2.f1407y);
                break;
        }
    }
}
