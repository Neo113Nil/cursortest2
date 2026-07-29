package f0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: f0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0098o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2134e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final B0.p f2135f = new B0.p(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2136a;

    /* renamed from: b, reason: collision with root package name */
    public long f2137b;

    /* renamed from: c, reason: collision with root package name */
    public long f2138c;
    public ArrayList d;

    public static X c(RecyclerView recyclerView, int i, long j2) {
        int m2 = recyclerView.f1438e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            X I2 = RecyclerView.I(recyclerView.f1438e.l(i2));
            if (I2.f2009c == i && !I2.g()) {
                return null;
            }
        }
        O o2 = recyclerView.f1433b;
        try {
            recyclerView.P();
            X i3 = o2.i(i, j2);
            if (i3 != null) {
                if (!i3.f() || i3.g()) {
                    o2.a(i3, false);
                } else {
                    o2.f(i3.f2007a);
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
        if (recyclerView.f1457p && this.f2137b == 0) {
            this.f2137b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0096m c0096m = recyclerView.f1434b0;
        c0096m.f2127a = i;
        c0096m.f2128b = i2;
    }

    public final void b(long j2) {
        C0097n c0097n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0097n c0097n2;
        ArrayList arrayList = this.f2136a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0096m c0096m = recyclerView3.f1434b0;
                c0096m.b(recyclerView3, false);
                i += c0096m.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0096m c0096m2 = recyclerView4.f1434b0;
                int abs = Math.abs(c0096m2.f2128b) + Math.abs(c0096m2.f2127a);
                for (int i5 = 0; i5 < c0096m2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0097n2 = new C0097n();
                        arrayList2.add(c0097n2);
                    } else {
                        c0097n2 = (C0097n) arrayList2.get(i3);
                    }
                    int[] iArr = c0096m2.f2129c;
                    int i6 = iArr[i5 + 1];
                    c0097n2.f2130a = i6 <= abs;
                    c0097n2.f2131b = abs;
                    c0097n2.f2132c = i6;
                    c0097n2.d = recyclerView4;
                    c0097n2.f2133e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2135f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0097n = (C0097n) arrayList2.get(i7)).d) != null; i7++) {
            X c2 = c(recyclerView, c0097n.f2133e, c0097n.f2130a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2008b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2008b.get()) != null) {
                if (recyclerView2.f1469y && recyclerView2.f1438e.m() != 0) {
                    E e2 = recyclerView2.f1415H;
                    if (e2 != null) {
                        e2.e();
                    }
                    I i8 = recyclerView2.f1449l;
                    O o2 = recyclerView2.f1433b;
                    if (i8 != null) {
                        i8.g0(o2);
                        recyclerView2.f1449l.h0(o2);
                    }
                    o2.f1976a.clear();
                    o2.d();
                }
                C0096m c0096m3 = recyclerView2.f1434b0;
                c0096m3.b(recyclerView2, true);
                if (c0096m3.d != 0) {
                    try {
                        int i9 = G.h.f194a;
                        Trace.beginSection("RV Nested Prefetch");
                        U u2 = recyclerView2.f1436c0;
                        AbstractC0083A abstractC0083A = recyclerView2.f1447k;
                        u2.d = 1;
                        u2.f1992e = abstractC0083A.a();
                        u2.f1994g = false;
                        u2.h = false;
                        u2.i = false;
                        for (int i10 = 0; i10 < c0096m3.d * 2; i10 += 2) {
                            c(recyclerView2, c0096m3.f2129c[i10], j2);
                        }
                        Trace.endSection();
                        c0097n.f2130a = false;
                        c0097n.f2131b = 0;
                        c0097n.f2132c = 0;
                        c0097n.d = null;
                        c0097n.f2133e = 0;
                    } catch (Throwable th) {
                        int i11 = G.h.f194a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0097n.f2130a = false;
            c0097n.f2131b = 0;
            c0097n.f2132c = 0;
            c0097n.d = null;
            c0097n.f2133e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.h.f194a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2136a;
            if (arrayList.isEmpty()) {
                this.f2137b = 0L;
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
                this.f2137b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2138c);
                this.f2137b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2137b = 0L;
            int i3 = G.h.f194a;
            Trace.endSection();
            throw th;
        }
    }
}
