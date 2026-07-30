package h;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class H implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f2100a;

    public H(J j2) {
        this.f2100a = j2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            J j2 = this.f2100a;
            if (j2.f2124z.getInputMethodMode() == 2 || j2.f2124z.getContentView() == null) {
                return;
            }
            Handler handler = j2.f2120v;
            RunnableC0147G runnableC0147G = j2.r;
            handler.removeCallbacks(runnableC0147G);
            runnableC0147G.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }
}
