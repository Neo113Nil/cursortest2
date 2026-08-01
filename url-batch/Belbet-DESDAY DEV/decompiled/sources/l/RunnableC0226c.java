package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0226c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2964b;

    public /* synthetic */ RunnableC0226c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f2963a = i;
        this.f2964b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2963a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2964b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1180w = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1181x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2964b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1180w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1181x);
                break;
        }
    }
}
