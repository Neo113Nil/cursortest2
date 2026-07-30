package n;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class G0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I0 f6639a;

    public G0(I0 i02) {
        this.f6639a = i02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        I0 i02 = this.f6639a;
        F0 f02 = i02.f6666y;
        if (i2 != 1 || i02.f6649G.getInputMethodMode() == 2 || i02.f6649G.getContentView() == null) {
            return;
        }
        i02.f6645C.removeCallbacks(f02);
        f02.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i5, int i7) {
    }
}
