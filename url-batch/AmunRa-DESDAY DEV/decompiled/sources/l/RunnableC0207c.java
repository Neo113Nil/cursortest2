package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0207c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f3042b;

    public /* synthetic */ RunnableC0207c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f3041a = i;
        this.f3042b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3041a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3042b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1215w = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1216x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3042b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1215w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1216x);
                break;
        }
    }
}
