package N;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class H implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public int f662e;

    /* renamed from: f, reason: collision with root package name */
    public int f663f;

    /* renamed from: g, reason: collision with root package name */
    public OverScroller f664g;

    /* renamed from: h, reason: collision with root package name */
    public Interpolator f665h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f666i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f667j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f668k;

    public H(RecyclerView recyclerView) {
        this.f668k = recyclerView;
        InterpolatorC0060q interpolatorC0060q = RecyclerView.f1658o0;
        this.f665h = interpolatorC0060q;
        this.f666i = false;
        this.f667j = false;
        this.f664g = new OverScroller(recyclerView.getContext(), interpolatorC0060q);
    }

    public final void a() {
        if (this.f666i) {
            this.f667j = true;
            return;
        }
        RecyclerView recyclerView = this.f668k;
        recyclerView.removeCallbacks(this);
        Field field = y.x.f3160a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        int i3;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f668k;
        if (recyclerView.f1697m == null) {
            recyclerView.removeCallbacks(this);
            this.f664g.abortAnimation();
            return;
        }
        this.f667j = false;
        this.f666i = true;
        recyclerView.d();
        OverScroller overScroller = this.f664g;
        recyclerView.f1697m.getClass();
        if (overScroller.computeScrollOffset()) {
            int[] iArr = recyclerView.f1690h0;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i4 = currX - this.f662e;
            int i5 = currY - this.f663f;
            this.f662e = currX;
            this.f663f = currY;
            if (recyclerView.f(i4, i5, iArr, null, 1)) {
                i2 = i4 - iArr[0];
                i3 = i5 - iArr[1];
            } else {
                i2 = i4;
                i3 = i5;
            }
            if (!recyclerView.f1698n.isEmpty()) {
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
            boolean z2 = (i2 == 0 && i3 == 0) || (i2 != 0 && recyclerView.f1697m.b() && i2 == 0) || (i3 != 0 && recyclerView.f1697m.c() && i3 == 0);
            if (overScroller.isFinished() || !(z2 || recyclerView.k())) {
                recyclerView.setScrollState(0);
                C0052i c0052i = recyclerView.f1680a0;
                c0052i.getClass();
                c0052i.f743c = 0;
                recyclerView.s(1);
            } else {
                a();
                RunnableC0054k runnableC0054k = recyclerView.f1679W;
                if (runnableC0054k != null) {
                    runnableC0054k.a(recyclerView, i2, i3);
                }
            }
        }
        this.f666i = false;
        if (this.f667j) {
            a();
        }
    }
}
