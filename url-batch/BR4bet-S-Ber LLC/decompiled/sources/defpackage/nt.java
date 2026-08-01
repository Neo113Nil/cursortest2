package defpackage;

import android.widget.AbsListView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class nt implements AbsListView.OnScrollListener {
    public final /* synthetic */ pt a;

    public nt(pt ptVar) {
        this.a = ptVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        pt ptVar = this.a;
        lt ltVar = ptVar.w;
        z4 z4Var = ptVar.E;
        if (i != 1 || z4Var.getInputMethodMode() == 2 || z4Var.getContentView() == null) {
            return;
        }
        ptVar.A.removeCallbacks(ltVar);
        ltVar.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
