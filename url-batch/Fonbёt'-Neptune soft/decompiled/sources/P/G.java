package P;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class G implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public int f839e;

    /* renamed from: f, reason: collision with root package name */
    public int f840f;

    /* renamed from: g, reason: collision with root package name */
    public OverScroller f841g;

    /* renamed from: h, reason: collision with root package name */
    public Interpolator f842h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f843i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f844j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f845k;

    public G(RecyclerView recyclerView) {
        this.f845k = recyclerView;
        InterpolatorC0106p interpolatorC0106p = RecyclerView.f1825p0;
        this.f842h = interpolatorC0106p;
        this.f843i = false;
        this.f844j = false;
        this.f841g = new OverScroller(recyclerView.getContext(), interpolatorC0106p);
    }

    public final void a() {
        if (this.f843i) {
            this.f844j = true;
            return;
        }
        RecyclerView recyclerView = this.f845k;
        recyclerView.removeCallbacks(this);
        Field field = A.z.f58a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f845k;
        if (recyclerView.f1866m == null) {
            recyclerView.removeCallbacks(this);
            this.f841g.abortAnimation();
            return;
        }
        this.f844j = false;
        this.f843i = true;
        recyclerView.d();
        OverScroller overScroller = this.f841g;
        recyclerView.f1866m.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i2 = currX - this.f839e;
            int i3 = currY - this.f840f;
            this.f839e = currX;
            this.f840f = currY;
            RecyclerView recyclerView2 = this.f845k;
            int[] iArr = recyclerView.f1858h0;
            if (recyclerView2.f(i2, i3, iArr, null, 1)) {
                i2 -= iArr[0];
                i3 -= iArr[1];
            }
            if (!recyclerView.f1867n.isEmpty()) {
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
            boolean z2 = (i2 == 0 && i3 == 0) || (i2 != 0 && recyclerView.f1866m.b() && i2 == 0) || (i3 != 0 && recyclerView.f1866m.c() && i3 == 0);
            if (overScroller.isFinished() || !(z2 || recyclerView.k())) {
                recyclerView.setScrollState(0);
                if (RecyclerView.f1823n0) {
                    C0099i c0099i = recyclerView.f1848a0;
                    c0099i.getClass();
                    c0099i.f920c = 0;
                }
                recyclerView.s(1);
            } else {
                a();
                RunnableC0101k runnableC0101k = recyclerView.f1847W;
                if (runnableC0101k != null) {
                    runnableC0101k.a(recyclerView, i2, i3);
                }
            }
        }
        this.f843i = false;
        if (this.f844j) {
            a();
        }
    }
}
