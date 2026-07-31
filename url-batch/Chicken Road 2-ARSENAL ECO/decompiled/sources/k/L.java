package k;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class L implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f4931a;

    public L(N n7) {
        this.f4931a = n7;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
        N n7 = this.f4931a;
        K k4 = n7.f4949s;
        if (i7 != 1 || n7.f4935A.getInputMethodMode() == 2 || n7.f4935A.getContentView() == null) {
            return;
        }
        n7.f4953w.removeCallbacks(k4);
        k4.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i7, int i8, int i9) {
    }
}
