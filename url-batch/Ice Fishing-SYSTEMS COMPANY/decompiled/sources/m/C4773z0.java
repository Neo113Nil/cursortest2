package m;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: m.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4773z0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B0 f39541a;

    public C4773z0(B0 b02) {
        this.f39541a = b02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            B0 b02 = this.f39541a;
            if (b02.f39252S.getInputMethodMode() == 2 || b02.f39252S.getContentView() == null) {
                return;
            }
            Handler handler = b02.f39248O;
            RunnableC4771y0 runnableC4771y0 = b02.f39244K;
            handler.removeCallbacks(runnableC4771y0);
            runnableC4771y0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i4, int i9) {
    }
}
