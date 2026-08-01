package defpackage;

import android.widget.AbsListView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class wq implements AbsListView.OnScrollListener {
    public final /* synthetic */ yq a;

    public wq(yq yqVar) {
        this.a = yqVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        yq yqVar = this.a;
        vq vqVar = yqVar.w;
        p4 p4Var = yqVar.E;
        if (i != 1 || p4Var.getInputMethodMode() == 2 || p4Var.getContentView() == null) {
            return;
        }
        yqVar.A.removeCallbacks(vqVar);
        vqVar.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
