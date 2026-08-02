package k;

import android.widget.AbsListView;

/* renamed from: k.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1183G implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1185I f13919a;

    public C1183G(AbstractC1185I abstractC1185I) {
        this.f13919a = abstractC1185I;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i4) {
        AbstractC1185I abstractC1185I = this.f13919a;
        RunnableC1182F runnableC1182F = abstractC1185I.n;
        if (i4 != 1 || abstractC1185I.v.getInputMethodMode() == 2 || abstractC1185I.v.getContentView() == null) {
            return;
        }
        abstractC1185I.f13938r.removeCallbacks(runnableC1182F);
        runnableC1182F.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i4, int i5, int i6) {
    }
}
