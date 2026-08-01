package m;

import android.widget.AbsListView;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a1 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f6024a;

    public a1(c1 c1Var) {
        this.f6024a = c1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i3) {
        c1 c1Var = this.f6024a;
        y0 y0Var = c1Var.B;
        s sVar = c1Var.J;
        if (i3 != 1 || sVar.getInputMethodMode() == 2 || sVar.getContentView() == null) {
            return;
        }
        c1Var.F.removeCallbacks(y0Var);
        y0Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i3, int i10, int i11) {
    }
}
