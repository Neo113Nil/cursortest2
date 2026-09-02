package l;

import android.widget.AbsListView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d2 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f2 f2268a;

    public d2(f2 f2Var) {
        this.f2268a = f2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        f2 f2Var = this.f2268a;
        b2 b2Var = f2Var.f2300w;
        b0 b0Var = f2Var.E;
        if (i != 1 || b0Var.getInputMethodMode() == 2 || b0Var.getContentView() == null) {
            return;
        }
        f2Var.A.removeCallbacks(b2Var);
        b2Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i4, int i5) {
    }
}
