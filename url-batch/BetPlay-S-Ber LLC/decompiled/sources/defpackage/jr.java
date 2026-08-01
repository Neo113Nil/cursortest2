package defpackage;

import android.widget.AbsListView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class jr implements AbsListView.OnScrollListener {
    public final /* synthetic */ lr a;

    public jr(lr lrVar) {
        this.a = lrVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        lr lrVar = this.a;
        hr hrVar = lrVar.w;
        g5 g5Var = lrVar.E;
        if (i != 1 || g5Var.getInputMethodMode() == 2 || g5Var.getContentView() == null) {
            return;
        }
        lrVar.A.removeCallbacks(hrVar);
        hrVar.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
