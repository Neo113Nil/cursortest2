package n;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0266c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f3603b;

    public /* synthetic */ RunnableC0266c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f3602a = i;
        this.f3603b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3602a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3603b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1749w = actionBarOverlayLayout.f1733d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1750x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3603b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1749w = actionBarOverlayLayout2.f1733d.animate().translationY(-actionBarOverlayLayout2.f1733d.getHeight()).setListener(actionBarOverlayLayout2.f1750x);
                break;
        }
    }
}
