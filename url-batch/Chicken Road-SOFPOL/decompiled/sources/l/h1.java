package l;

import android.widget.AbsListView;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h1 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1 f4252a;

    public h1(j1 j1Var) {
        this.f4252a = j1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        j1 j1Var = this.f4252a;
        f1 f1Var = j1Var.f4309q;
        y yVar = j1Var.f4317y;
        if (i != 1 || yVar.getInputMethodMode() == 2 || yVar.getContentView() == null) {
            return;
        }
        j1Var.f4313u.removeCallbacks(f1Var);
        f1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i8, int i9) {
    }
}
