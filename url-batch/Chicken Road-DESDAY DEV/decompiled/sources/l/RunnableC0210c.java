package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0210c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2895b;

    public /* synthetic */ RunnableC0210c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f2894a = i;
        this.f2895b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2894a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2895b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1240w = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1241x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2895b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1240w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1241x);
                break;
        }
    }
}
