package l;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class E0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0 f2856a;

    public E0(G0 g02) {
        this.f2856a = g02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            G0 g02 = this.f2856a;
            if (g02.f2883z.getInputMethodMode() == 2 || g02.f2883z.getContentView() == null) {
                return;
            }
            Handler handler = g02.f2879v;
            C0 c02 = g02.f2875r;
            handler.removeCallbacks(c02);
            c02.run();
        }
    }
}
