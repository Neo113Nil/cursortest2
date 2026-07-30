package g0;

import I.T;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* renamed from: g0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0411D implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f4860d;

    /* renamed from: e, reason: collision with root package name */
    public int f4861e;

    /* renamed from: i, reason: collision with root package name */
    public OverScroller f4862i;

    /* renamed from: l, reason: collision with root package name */
    public Interpolator f4863l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4864m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4865n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4866o;

    public RunnableC0411D(RecyclerView recyclerView) {
        this.f4866o = recyclerView;
        O.a aVar = RecyclerView.f3954s0;
        this.f4863l = aVar;
        this.f4864m = false;
        this.f4865n = false;
        this.f4862i = new OverScroller(recyclerView.getContext(), aVar);
    }

    public final void a() {
        if (this.f4864m) {
            this.f4865n = true;
            return;
        }
        RecyclerView recyclerView = this.f4866o;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = T.f1153a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        int i5;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f4866o;
        if (recyclerView.f4000q == null) {
            recyclerView.removeCallbacks(this);
            this.f4862i.abortAnimation();
            return;
        }
        this.f4865n = false;
        this.f4864m = true;
        recyclerView.d();
        OverScroller overScroller = this.f4862i;
        recyclerView.f4000q.getClass();
        if (overScroller.computeScrollOffset()) {
            int[] iArr = recyclerView.f3992l0;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i7 = currX - this.f4860d;
            int i8 = currY - this.f4861e;
            this.f4860d = currX;
            this.f4861e = currY;
            if (recyclerView.f(i7, i8, iArr, null, 1)) {
                i2 = i7 - iArr[0];
                i5 = i8 - iArr[1];
            } else {
                i2 = i7;
                i5 = i8;
            }
            if (!recyclerView.f4001r.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i2, i5);
            }
            recyclerView.g(null, 1);
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z7 = (i2 == 0 && i5 == 0) || (i2 != 0 && recyclerView.f4000q.b() && i2 == 0) || (i5 != 0 && recyclerView.f4000q.c() && i5 == 0);
            if (overScroller.isFinished() || !(z7 || recyclerView.k())) {
                recyclerView.setScrollState(0);
                C0428h c0428h = recyclerView.f3983e0;
                c0428h.getClass();
                c0428h.f4933c = 0;
                recyclerView.s(1);
            } else {
                a();
                RunnableC0430j runnableC0430j = recyclerView.f3981d0;
                if (runnableC0430j != null) {
                    runnableC0430j.a(recyclerView, i2, i5);
                }
            }
        }
        this.f4864m = false;
        if (this.f4865n) {
            a();
        }
    }
}
