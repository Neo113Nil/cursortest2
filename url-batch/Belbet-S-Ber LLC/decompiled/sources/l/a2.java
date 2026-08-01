package l;

import android.widget.AbsListView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a2 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f2390a;

    public a2(c2 c2Var) {
        this.f2390a = c2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        c2 c2Var = this.f2390a;
        y1 y1Var = c2Var.f2422w;
        y yVar = c2Var.E;
        if (i != 1 || yVar.getInputMethodMode() == 2 || yVar.getContentView() == null) {
            return;
        }
        c2Var.A.removeCallbacks(y1Var);
        y1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i4, int i5) {
    }
}
