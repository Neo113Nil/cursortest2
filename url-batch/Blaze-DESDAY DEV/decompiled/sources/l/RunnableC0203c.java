package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0203c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2914b;

    public /* synthetic */ RunnableC0203c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f2913a = i;
        this.f2914b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2913a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2914b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1330w = actionBarOverlayLayout.d.animate().translationY(RecyclerView.f1559A0).setListener(actionBarOverlayLayout.f1331x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2914b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1330w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1331x);
                break;
        }
    }
}
