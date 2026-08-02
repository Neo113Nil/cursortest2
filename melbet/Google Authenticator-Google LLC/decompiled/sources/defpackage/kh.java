package defpackage;

import android.widget.AbsListView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kh implements AbsListView.OnScrollListener {
    final /* synthetic */ ki a;

    public kh(ki kiVar) {
        this.a = kiVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            ki kiVar = this.a;
            if (kiVar.u() || kiVar.p.getContentView() == null) {
                return;
            }
            bo boVar = kiVar.q;
            kiVar.n.removeCallbacks(boVar);
            boVar.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
