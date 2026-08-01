package n;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class G0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I0 f3452a;

    public G0(I0 i02) {
        this.f3452a = i02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            I0 i02 = this.f3452a;
            if (i02.f3482z.getInputMethodMode() == 2 || i02.f3482z.getContentView() == null) {
                return;
            }
            Handler handler = i02.f3478v;
            E0 e02 = i02.f3474r;
            handler.removeCallbacks(e02);
            e02.run();
        }
    }
}
