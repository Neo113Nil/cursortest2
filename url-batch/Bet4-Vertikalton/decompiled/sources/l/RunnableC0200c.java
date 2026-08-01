package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0200c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2889b;

    public /* synthetic */ RunnableC0200c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f2888a = i;
        this.f2889b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2888a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2889b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1299w = actionBarOverlayLayout.d.animate().translationY(RecyclerView.f1530C0).setListener(actionBarOverlayLayout.f1300x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2889b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1299w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1300x);
                break;
        }
    }
}
