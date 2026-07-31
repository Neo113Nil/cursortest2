package i;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class I implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f2131a;

    public I(K k2) {
        this.f2131a = k2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        K k2 = this.f2131a;
        RunnableC0153H runnableC0153H = k2.f2148r;
        if (i2 != 1 || k2.f2155z.getInputMethodMode() == 2 || k2.f2155z.getContentView() == null) {
            return;
        }
        k2.f2151v.removeCallbacks(runnableC0153H);
        runnableC0153H.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }
}
