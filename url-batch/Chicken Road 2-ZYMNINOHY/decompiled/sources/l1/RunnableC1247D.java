package l1;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* renamed from: l1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1247D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f14170a;

    /* renamed from: b, reason: collision with root package name */
    public int f14171b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f14172c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f14173d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14174e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f14176g;

    public RunnableC1247D(RecyclerView recyclerView) {
        this.f14176g = recyclerView;
        InterpolatorC1267n interpolatorC1267n = RecyclerView.f5136k0;
        this.f14173d = interpolatorC1267n;
        this.f14174e = false;
        this.f14175f = false;
        this.f14172c = new OverScroller(recyclerView.getContext(), interpolatorC1267n);
    }

    public final void a() {
        if (this.f14174e) {
            this.f14175f = true;
            return;
        }
        RecyclerView recyclerView = this.f14176g;
        recyclerView.removeCallbacks(this);
        Field field = E.H.f375a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        int i5;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f14176g;
        if (recyclerView.f5174i == null) {
            recyclerView.removeCallbacks(this);
            this.f14172c.abortAnimation();
            return;
        }
        this.f14175f = false;
        this.f14174e = true;
        recyclerView.d();
        OverScroller overScroller = this.f14172c;
        recyclerView.f5174i.getClass();
        if (overScroller.computeScrollOffset()) {
            int[] iArr = recyclerView.f5166d0;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.f14170a;
            int i7 = currY - this.f14171b;
            this.f14170a = currX;
            this.f14171b = currY;
            if (recyclerView.f(i6, i7, 1, iArr, null)) {
                i4 = i6 - iArr[0];
                i5 = i7 - iArr[1];
            } else {
                i4 = i6;
                i5 = i7;
            }
            if (!recyclerView.f5175j.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i4, i5);
            }
            recyclerView.g(null, 1);
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z = (i4 == 0 && i5 == 0) || (i4 != 0 && recyclerView.f5174i.b() && i4 == 0) || (i5 != 0 && recyclerView.f5174i.c() && i5 == 0);
            if (overScroller.isFinished() || !(z || recyclerView.k())) {
                recyclerView.setScrollState(0);
                A0.c cVar = recyclerView.f5155T;
                cVar.getClass();
                cVar.f11c = 0;
                recyclerView.s(1);
            } else {
                a();
                RunnableC1262i runnableC1262i = recyclerView.f5154S;
                if (runnableC1262i != null) {
                    runnableC1262i.a(recyclerView, i4, i5);
                }
            }
        }
        this.f14174e = false;
        if (this.f14175f) {
            a();
        }
    }
}
