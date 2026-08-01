package defpackage;

import android.widget.AbsListView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ly implements AbsListView.OnScrollListener {
    public final /* synthetic */ ny a;

    public ly(ny nyVar) {
        this.a = nyVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        ny nyVar = this.a;
        ky kyVar = nyVar.w;
        h5 h5Var = nyVar.E;
        if (i != 1 || h5Var.getInputMethodMode() == 2 || h5Var.getContentView() == null) {
            return;
        }
        nyVar.A.removeCallbacks(kyVar);
        kyVar.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
