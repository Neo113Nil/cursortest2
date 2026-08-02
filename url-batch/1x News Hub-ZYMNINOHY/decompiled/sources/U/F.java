package U;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class F implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f1357a;

    /* renamed from: b, reason: collision with root package name */
    public int f1358b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f1359c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f1360d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1361e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1362g;

    public F(RecyclerView recyclerView) {
        this.f1362g = recyclerView;
        p pVar = RecyclerView.f2446k0;
        this.f1360d = pVar;
        this.f1361e = false;
        this.f = false;
        this.f1359c = new OverScroller(recyclerView.getContext(), pVar);
    }

    public final void a() {
        if (this.f1361e) {
            this.f = true;
            return;
        }
        RecyclerView recyclerView = this.f1362g;
        recyclerView.removeCallbacks(this);
        Field field = E.A.f243a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f1362g;
        if (recyclerView.f2483i == null) {
            recyclerView.removeCallbacks(this);
            this.f1359c.abortAnimation();
            return;
        }
        this.f = false;
        this.f1361e = true;
        recyclerView.d();
        OverScroller overScroller = this.f1359c;
        recyclerView.f2483i.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f1357a;
            int i6 = currY - this.f1358b;
            this.f1357a = currX;
            this.f1358b = currY;
            int[] iArr = recyclerView.f2476d0;
            if (recyclerView.f(i5, i6, 1, iArr, null)) {
                i3 = i5 - iArr[0];
                i4 = i6 - iArr[1];
            } else {
                i3 = i5;
                i4 = i6;
            }
            if (!recyclerView.f2484j.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i3, i4);
            }
            recyclerView.g(null, 1);
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z = (i3 == 0 && i4 == 0) || (i3 != 0 && recyclerView.f2483i.b() && i3 == 0) || (i4 != 0 && recyclerView.f2483i.c() && i4 == 0);
            if (overScroller.isFinished() || !(z || recyclerView.k())) {
                recyclerView.setScrollState(0);
                C0073i c0073i = recyclerView.f2465T;
                c0073i.getClass();
                c0073i.f1427c = 0;
                recyclerView.s(1);
            } else {
                a();
                RunnableC0075k runnableC0075k = recyclerView.f2464S;
                if (runnableC0075k != null) {
                    runnableC0075k.a(recyclerView, i3, i4);
                }
            }
        }
        this.f1361e = false;
        if (this.f) {
            a();
        }
    }
}
