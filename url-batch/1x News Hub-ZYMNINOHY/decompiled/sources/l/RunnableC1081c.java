package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1081c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f9780b;

    public /* synthetic */ RunnableC1081c(ActionBarOverlayLayout actionBarOverlayLayout, int i3) {
        this.f9779a = i3;
        this.f9780b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9779a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f9780b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f2029t = actionBarOverlayLayout.f2014c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f2030u);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f9780b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f2029t = actionBarOverlayLayout2.f2014c.animate().translationY(-actionBarOverlayLayout2.f2014c.getHeight()).setListener(actionBarOverlayLayout2.f2030u);
                break;
        }
    }
}
