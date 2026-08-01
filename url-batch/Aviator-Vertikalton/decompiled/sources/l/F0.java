package l;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class F0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H0 f3224a;

    public F0(H0 h02) {
        this.f3224a = h02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            H0 h02 = this.f3224a;
            if (h02.f3252z.getInputMethodMode() == 2 || h02.f3252z.getContentView() == null) {
                return;
            }
            Handler handler = h02.f3248v;
            D0 d02 = h02.f3244r;
            handler.removeCallbacks(d02);
            d02.run();
        }
    }
}
