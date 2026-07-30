package defpackage;

import android.widget.AbsListView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class we1 implements AbsListView.OnScrollListener {
    public final /* synthetic */ ye1 a;

    public we1(ye1 ye1Var) {
        this.a = ye1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        ye1 ye1Var = this.a;
        ue1 ue1Var = ye1Var.C;
        ag agVar = ye1Var.K;
        if (i != 1 || agVar.getInputMethodMode() == 2 || agVar.getContentView() == null) {
            return;
        }
        ye1Var.G.removeCallbacks(ue1Var);
        ue1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
