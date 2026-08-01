package l;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class C0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E0 f2818a;

    public C0(E0 e02) {
        this.f2818a = e02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            E0 e02 = this.f2818a;
            if (e02.f2845z.getInputMethodMode() == 2 || e02.f2845z.getContentView() == null) {
                return;
            }
            Handler handler = e02.f2841v;
            A0 a02 = e02.f2837r;
            handler.removeCallbacks(a02);
            a02.run();
        }
    }
}
