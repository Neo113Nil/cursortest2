package k;

import android.widget.AbsListView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a2 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f2500a;

    public a2(c2 c2Var) {
        this.f2500a = c2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i4) {
        c2 c2Var = this.f2500a;
        y1 y1Var = c2Var.f2523w;
        z zVar = c2Var.E;
        if (i4 != 1 || zVar.getInputMethodMode() == 2 || zVar.getContentView() == null) {
            return;
        }
        c2Var.A.removeCallbacks(y1Var);
        y1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i4, int i5, int i6) {
    }
}
