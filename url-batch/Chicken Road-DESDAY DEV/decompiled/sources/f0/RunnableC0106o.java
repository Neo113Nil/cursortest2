package f0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: f0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0106o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2203e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final C0.o f2204f = new C0.o(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2205a;

    /* renamed from: b, reason: collision with root package name */
    public long f2206b;

    /* renamed from: c, reason: collision with root package name */
    public long f2207c;
    public ArrayList d;

    public static X c(RecyclerView recyclerView, int i, long j2) {
        int m2 = recyclerView.f1501e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            X I2 = RecyclerView.I(recyclerView.f1501e.l(i2));
            if (I2.f2078c == i && !I2.g()) {
                return null;
            }
        }
        O o2 = recyclerView.f1496b;
        try {
            recyclerView.P();
            X i3 = o2.i(i, j2);
            if (i3 != null) {
                if (!i3.f() || i3.g()) {
                    o2.a(i3, false);
                } else {
                    o2.f(i3.f2076a);
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
        if (recyclerView.f1520p && this.f2206b == 0) {
            this.f2206b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0104m c0104m = recyclerView.f1497b0;
        c0104m.f2196a = i;
        c0104m.f2197b = i2;
    }

    public final void b(long j2) {
        C0105n c0105n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0105n c0105n2;
        ArrayList arrayList = this.f2205a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0104m c0104m = recyclerView3.f1497b0;
                c0104m.b(recyclerView3, false);
                i += c0104m.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0104m c0104m2 = recyclerView4.f1497b0;
                int abs = Math.abs(c0104m2.f2197b) + Math.abs(c0104m2.f2196a);
                for (int i5 = 0; i5 < c0104m2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0105n2 = new C0105n();
                        arrayList2.add(c0105n2);
                    } else {
                        c0105n2 = (C0105n) arrayList2.get(i3);
                    }
                    int[] iArr = c0104m2.f2198c;
                    int i6 = iArr[i5 + 1];
                    c0105n2.f2199a = i6 <= abs;
                    c0105n2.f2200b = abs;
                    c0105n2.f2201c = i6;
                    c0105n2.d = recyclerView4;
                    c0105n2.f2202e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2204f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0105n = (C0105n) arrayList2.get(i7)).d) != null; i7++) {
            X c2 = c(recyclerView, c0105n.f2202e, c0105n.f2199a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2077b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2077b.get()) != null) {
                if (recyclerView2.f1532y && recyclerView2.f1501e.m() != 0) {
                    AbstractC0090E abstractC0090E = recyclerView2.f1478H;
                    if (abstractC0090E != null) {
                        abstractC0090E.e();
                    }
                    I i8 = recyclerView2.f1513l;
                    O o2 = recyclerView2.f1496b;
                    if (i8 != null) {
                        i8.g0(o2);
                        recyclerView2.f1513l.h0(o2);
                    }
                    o2.f2045a.clear();
                    o2.d();
                }
                C0104m c0104m3 = recyclerView2.f1497b0;
                c0104m3.b(recyclerView2, true);
                if (c0104m3.d != 0) {
                    try {
                        int i9 = G.h.f194a;
                        Trace.beginSection("RV Nested Prefetch");
                        U u2 = recyclerView2.f1499c0;
                        AbstractC0086A abstractC0086A = recyclerView2.f1511k;
                        u2.d = 1;
                        u2.f2061e = abstractC0086A.a();
                        u2.f2063g = false;
                        u2.h = false;
                        u2.i = false;
                        for (int i10 = 0; i10 < c0104m3.d * 2; i10 += 2) {
                            c(recyclerView2, c0104m3.f2198c[i10], j2);
                        }
                        Trace.endSection();
                        c0105n.f2199a = false;
                        c0105n.f2200b = 0;
                        c0105n.f2201c = 0;
                        c0105n.d = null;
                        c0105n.f2202e = 0;
                    } catch (Throwable th) {
                        int i11 = G.h.f194a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0105n.f2199a = false;
            c0105n.f2200b = 0;
            c0105n.f2201c = 0;
            c0105n.d = null;
            c0105n.f2202e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.h.f194a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2205a;
            if (arrayList.isEmpty()) {
                this.f2206b = 0L;
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
                this.f2206b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2207c);
                this.f2206b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2206b = 0L;
            int i3 = G.h.f194a;
            Trace.endSection();
            throw th;
        }
    }
}
