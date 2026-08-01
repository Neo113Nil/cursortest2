package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0226c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f3373b;

    public /* synthetic */ RunnableC0226c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f3372a = i;
        this.f3373b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3372a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3373b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1703w = actionBarOverlayLayout.d.animate().translationY(RecyclerView.f1937A0).setListener(actionBarOverlayLayout.f1704x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3373b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1703w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1704x);
                break;
        }
    }
}
