package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0205c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f3074b;

    public /* synthetic */ RunnableC0205c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f3073a = i;
        this.f3074b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3073a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3074b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1384w = actionBarOverlayLayout.d.animate().translationY(RecyclerView.A0).setListener(actionBarOverlayLayout.f1385x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3074b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1384w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.f1385x);
                break;
        }
    }
}
