package n;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0702c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f6743e;

    public /* synthetic */ RunnableC0702c(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f6742d = i2;
        this.f6743e = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6742d) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6743e;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.f3172E = actionBarOverlayLayout.f3180l.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f3173F);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6743e;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.f3172E = actionBarOverlayLayout2.f3180l.animate().translationY(-actionBarOverlayLayout2.f3180l.getHeight()).setListener(actionBarOverlayLayout2.f3173F);
                break;
        }
    }
}
