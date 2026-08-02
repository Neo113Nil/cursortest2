package k;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: k.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1206c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f13979b;

    public /* synthetic */ RunnableC1206c(ActionBarOverlayLayout actionBarOverlayLayout, int i4) {
        this.f13978a = i4;
        this.f13979b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13978a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13979b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f4360t = actionBarOverlayLayout.f4345c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f4361u);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13979b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f4360t = actionBarOverlayLayout2.f4345c.animate().translationY(-actionBarOverlayLayout2.f4345c.getHeight()).setListener(actionBarOverlayLayout2.f4361u);
                break;
        }
    }
}
