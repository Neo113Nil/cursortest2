package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0252c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f3338b;

    public /* synthetic */ RunnableC0252c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f3337a = i;
        this.f3338b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3337a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3338b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1031w = actionBarOverlayLayout.f1014d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1032x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3338b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1031w = actionBarOverlayLayout2.f1014d.animate().translationY(-actionBarOverlayLayout2.f1014d.getHeight()).setListener(actionBarOverlayLayout2.f1032x);
                break;
        }
    }
}
