package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0254c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f3341b;

    public /* synthetic */ RunnableC0254c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f3340a = i;
        this.f3341b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3340a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3341b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1032w = actionBarOverlayLayout.f1015d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1033x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3341b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1032w = actionBarOverlayLayout2.f1015d.animate().translationY(-actionBarOverlayLayout2.f1015d.getHeight()).setListener(actionBarOverlayLayout2.f1033x);
                break;
        }
    }
}
