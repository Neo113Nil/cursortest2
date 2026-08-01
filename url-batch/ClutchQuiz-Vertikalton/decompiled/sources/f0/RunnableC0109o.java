package f0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: f0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0109o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2319e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final I0.l f2320f = new I0.l(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2321a;

    /* renamed from: b, reason: collision with root package name */
    public long f2322b;

    /* renamed from: c, reason: collision with root package name */
    public long f2323c;
    public ArrayList d;

    public static W c(RecyclerView recyclerView, int i, long j2) {
        int m2 = recyclerView.f1588e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            W I2 = RecyclerView.I(recyclerView.f1588e.l(i2));
            if (I2.f2195c == i && !I2.g()) {
                return null;
            }
        }
        N n2 = recyclerView.f1583b;
        try {
            recyclerView.P();
            W i3 = n2.i(i, j2);
            if (i3 != null) {
                if (!i3.f() || i3.g()) {
                    n2.a(i3, false);
                } else {
                    n2.f(i3.f2193a);
                }
            }
            recyclerView.Q(false);
            return i3;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f1607p && this.f2322b == 0) {
            this.f2322b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0107m c0107m = recyclerView.f1584b0;
        c0107m.f2312a = i;
        c0107m.f2313b = i2;
    }

    public final void b(long j2) {
        C0108n c0108n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0108n c0108n2;
        ArrayList arrayList = this.f2321a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0107m c0107m = recyclerView3.f1584b0;
                c0107m.b(recyclerView3, false);
                i += c0107m.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0107m c0107m2 = recyclerView4.f1584b0;
                int abs = Math.abs(c0107m2.f2313b) + Math.abs(c0107m2.f2312a);
                for (int i5 = 0; i5 < c0107m2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0108n2 = new C0108n();
                        arrayList2.add(c0108n2);
                    } else {
                        c0108n2 = (C0108n) arrayList2.get(i3);
                    }
                    int[] iArr = c0107m2.f2314c;
                    int i6 = iArr[i5 + 1];
                    c0108n2.f2315a = i6 <= abs;
                    c0108n2.f2316b = abs;
                    c0108n2.f2317c = i6;
                    c0108n2.d = recyclerView4;
                    c0108n2.f2318e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2320f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0108n = (C0108n) arrayList2.get(i7)).d) != null; i7++) {
            W c2 = c(recyclerView, c0108n.f2318e, c0108n.f2315a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2194b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2194b.get()) != null) {
                if (recyclerView2.f1618y && recyclerView2.f1588e.m() != 0) {
                    D d = recyclerView2.f1565H;
                    if (d != null) {
                        d.e();
                    }
                    H h = recyclerView2.f1600l;
                    N n2 = recyclerView2.f1583b;
                    if (h != null) {
                        h.g0(n2);
                        recyclerView2.f1600l.h0(n2);
                    }
                    n2.f2162a.clear();
                    n2.d();
                }
                C0107m c0107m3 = recyclerView2.f1584b0;
                c0107m3.b(recyclerView2, true);
                if (c0107m3.d != 0) {
                    try {
                        int i8 = G.h.f211a;
                        Trace.beginSection("RV Nested Prefetch");
                        T t2 = recyclerView2.f1586c0;
                        AbstractC0119z abstractC0119z = recyclerView2.f1598k;
                        t2.d = 1;
                        t2.f2178e = abstractC0119z.a();
                        t2.f2180g = false;
                        t2.h = false;
                        t2.i = false;
                        for (int i9 = 0; i9 < c0107m3.d * 2; i9 += 2) {
                            c(recyclerView2, c0107m3.f2314c[i9], j2);
                        }
                        Trace.endSection();
                        c0108n.f2315a = false;
                        c0108n.f2316b = 0;
                        c0108n.f2317c = 0;
                        c0108n.d = null;
                        c0108n.f2318e = 0;
                    } catch (Throwable th) {
                        int i10 = G.h.f211a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0108n.f2315a = false;
            c0108n.f2316b = 0;
            c0108n.f2317c = 0;
            c0108n.d = null;
            c0108n.f2318e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.h.f211a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2321a;
            if (arrayList.isEmpty()) {
                this.f2322b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f2322b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2323c);
                this.f2322b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2322b = 0L;
            int i3 = G.h.f211a;
            Trace.endSection();
            throw th;
        }
    }
}
