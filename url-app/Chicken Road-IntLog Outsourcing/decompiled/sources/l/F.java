package l;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class F implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f10766a;

    public F(H h3) {
        this.f10766a = h3;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            H h3 = this.f10766a;
            if (h3.f10791v.getInputMethodMode() == 2 || h3.f10791v.getContentView() == null) {
                return;
            }
            Handler handler = h3.f10787r;
            E e3 = h3.f10783n;
            handler.removeCallbacks(e3);
            e3.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i6) {
    }
}
