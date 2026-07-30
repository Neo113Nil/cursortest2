package L;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class I implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public int f479e;

    /* renamed from: f, reason: collision with root package name */
    public int f480f;

    /* renamed from: g, reason: collision with root package name */
    public OverScroller f481g;

    /* renamed from: h, reason: collision with root package name */
    public Interpolator f482h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f483i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f484j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f485k;

    public I(RecyclerView recyclerView) {
        this.f485k = recyclerView;
        r rVar = RecyclerView.f1567o0;
        this.f482h = rVar;
        this.f483i = false;
        this.f484j = false;
        this.f481g = new OverScroller(recyclerView.getContext(), rVar);
    }

    public final void a() {
        if (this.f483i) {
            this.f484j = true;
            return;
        }
        RecyclerView recyclerView = this.f485k;
        recyclerView.removeCallbacks(this);
        Field field = w.x.f3075a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f485k;
        if (recyclerView.f1608m == null) {
            recyclerView.removeCallbacks(this);
            this.f481g.abortAnimation();
            return;
        }
        this.f484j = false;
        this.f483i = true;
        recyclerView.d();
        OverScroller overScroller = this.f481g;
        recyclerView.f1608m.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i2 = currX - this.f479e;
            int i3 = currY - this.f480f;
            this.f479e = currX;
            this.f480f = currY;
            RecyclerView recyclerView2 = this.f485k;
            int[] iArr = recyclerView.f1601h0;
            if (recyclerView2.f(i2, i3, iArr, null, 1)) {
                i2 -= iArr[0];
                i3 -= iArr[1];
            }
            if (!recyclerView.f1609n.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i2, i3);
            }
            recyclerView.g(null, 1);
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z2 = (i2 == 0 && i3 == 0) || (i2 != 0 && recyclerView.f1608m.b() && i2 == 0) || (i3 != 0 && recyclerView.f1608m.c() && i3 == 0);
            if (overScroller.isFinished() || !(z2 || recyclerView.k())) {
                recyclerView.setScrollState(0);
                C0034j c0034j = recyclerView.f1590a0;
                c0034j.getClass();
                c0034j.f565c = 0;
                recyclerView.s(1);
            } else {
                a();
                RunnableC0036l runnableC0036l = recyclerView.f1589W;
                if (runnableC0036l != null) {
                    runnableC0036l.a(recyclerView, i2, i3);
                }
            }
        }
        this.f483i = false;
        if (this.f484j) {
            a();
        }
    }
}
