package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0179c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2968b;

    public /* synthetic */ RunnableC0179c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f2967a = i;
        this.f2968b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2967a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2968b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1387w = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1388x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2968b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1387w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1388x);
                break;
        }
    }
}
