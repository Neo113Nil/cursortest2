package j;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class J implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f2871a;

    public J(L l2) {
        this.f2871a = l2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            L l2 = this.f2871a;
            if (l2.f2896z.getInputMethodMode() == 2 || l2.f2896z.getContentView() == null) {
                return;
            }
            Handler handler = l2.v;
            I i3 = l2.f2889r;
            handler.removeCallbacks(i3);
            i3.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }
}
