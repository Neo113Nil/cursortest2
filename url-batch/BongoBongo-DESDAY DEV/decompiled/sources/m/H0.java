package m;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class H0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f2926a;

    public H0(J0 j02) {
        this.f2926a = j02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            J0 j02 = this.f2926a;
            if (j02.f2955z.getInputMethodMode() == 2 || j02.f2955z.getContentView() == null) {
                return;
            }
            Handler handler = j02.f2951v;
            F0 f02 = j02.f2947r;
            handler.removeCallbacks(f02);
            f02.run();
        }
    }
}
