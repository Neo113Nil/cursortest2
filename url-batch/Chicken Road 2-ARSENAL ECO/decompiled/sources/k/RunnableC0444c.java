package k;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: k.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0444c implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4987f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f4988g;

    public /* synthetic */ RunnableC0444c(ActionBarOverlayLayout actionBarOverlayLayout, int i7) {
        this.f4987f = i7;
        this.f4988g = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4987f) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4988g;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.y = actionBarOverlayLayout.f3277h.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f3294z);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4988g;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.y = actionBarOverlayLayout2.f3277h.animate().translationY(-actionBarOverlayLayout2.f3277h.getHeight()).setListener(actionBarOverlayLayout2.f3294z);
                break;
        }
    }
}
