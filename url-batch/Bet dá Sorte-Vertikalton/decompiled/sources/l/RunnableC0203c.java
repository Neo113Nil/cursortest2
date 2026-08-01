package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0203c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2937b;

    public /* synthetic */ RunnableC0203c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f2936a = i;
        this.f2937b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2936a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2937b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1254w = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1255x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2937b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1254w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1255x);
                break;
        }
    }
}
