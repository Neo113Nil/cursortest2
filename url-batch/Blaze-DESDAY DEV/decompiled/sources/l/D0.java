package l;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class D0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F0 f2803a;

    public D0(F0 f02) {
        this.f2803a = f02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            F0 f02 = this.f2803a;
            if (f02.f2830z.getInputMethodMode() == 2 || f02.f2830z.getContentView() == null) {
                return;
            }
            Handler handler = f02.f2826v;
            B0 b02 = f02.f2822r;
            handler.removeCallbacks(b02);
            b02.run();
        }
    }
}
