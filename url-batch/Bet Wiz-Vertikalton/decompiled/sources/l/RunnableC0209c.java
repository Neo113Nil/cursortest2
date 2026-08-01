package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0209c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2950b;

    public /* synthetic */ RunnableC0209c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f2949a = i;
        this.f2950b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2949a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2950b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1285w = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1286x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2950b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1285w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1286x);
                break;
        }
    }
}
