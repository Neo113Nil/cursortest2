package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0227c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2947b;

    public /* synthetic */ RunnableC0227c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f2946a = i;
        this.f2947b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2946a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2947b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1182w = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1183x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2947b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1182w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1183x);
                break;
        }
    }
}
