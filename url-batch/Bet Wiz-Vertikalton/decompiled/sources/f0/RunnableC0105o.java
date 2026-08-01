package f0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: f0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0105o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2270e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final C0.o f2271f = new C0.o(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2272a;

    /* renamed from: b, reason: collision with root package name */
    public long f2273b;

    /* renamed from: c, reason: collision with root package name */
    public long f2274c;
    public ArrayList d;

    public static X c(RecyclerView recyclerView, int i, long j2) {
        int m2 = recyclerView.f1546e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            X I2 = RecyclerView.I(recyclerView.f1546e.l(i2));
            if (I2.f2145c == i && !I2.g()) {
                return null;
            }
        }
        O o2 = recyclerView.f1541b;
        try {
            recyclerView.P();
            X i3 = o2.i(i, j2);
            if (i3 != null) {
                if (!i3.f() || i3.g()) {
                    o2.a(i3, false);
                } else {
                    o2.f(i3.f2143a);
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
        if (recyclerView.f1565p && this.f2273b == 0) {
            this.f2273b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0103m c0103m = recyclerView.f1542b0;
        c0103m.f2263a = i;
        c0103m.f2264b = i2;
    }

    public final void b(long j2) {
        C0104n c0104n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0104n c0104n2;
        ArrayList arrayList = this.f2272a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0103m c0103m = recyclerView3.f1542b0;
                c0103m.b(recyclerView3, false);
                i += c0103m.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0103m c0103m2 = recyclerView4.f1542b0;
                int abs = Math.abs(c0103m2.f2264b) + Math.abs(c0103m2.f2263a);
                for (int i5 = 0; i5 < c0103m2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0104n2 = new C0104n();
                        arrayList2.add(c0104n2);
                    } else {
                        c0104n2 = (C0104n) arrayList2.get(i3);
                    }
                    int[] iArr = c0103m2.f2265c;
                    int i6 = iArr[i5 + 1];
                    c0104n2.f2266a = i6 <= abs;
                    c0104n2.f2267b = abs;
                    c0104n2.f2268c = i6;
                    c0104n2.d = recyclerView4;
                    c0104n2.f2269e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2271f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0104n = (C0104n) arrayList2.get(i7)).d) != null; i7++) {
            X c2 = c(recyclerView, c0104n.f2269e, c0104n.f2266a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2144b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2144b.get()) != null) {
                if (recyclerView2.f1577y && recyclerView2.f1546e.m() != 0) {
                    AbstractC0089E abstractC0089E = recyclerView2.f1523H;
                    if (abstractC0089E != null) {
                        abstractC0089E.e();
                    }
                    I i8 = recyclerView2.f1558l;
                    O o2 = recyclerView2.f1541b;
                    if (i8 != null) {
                        i8.g0(o2);
                        recyclerView2.f1558l.h0(o2);
                    }
                    o2.f2112a.clear();
                    o2.d();
                }
                C0103m c0103m3 = recyclerView2.f1542b0;
                c0103m3.b(recyclerView2, true);
                if (c0103m3.d != 0) {
                    try {
                        int i9 = G.h.f247a;
                        Trace.beginSection("RV Nested Prefetch");
                        U u2 = recyclerView2.f1544c0;
                        AbstractC0085A abstractC0085A = recyclerView2.f1556k;
                        u2.d = 1;
                        u2.f2128e = abstractC0085A.a();
                        u2.f2130g = false;
                        u2.h = false;
                        u2.i = false;
                        for (int i10 = 0; i10 < c0103m3.d * 2; i10 += 2) {
                            c(recyclerView2, c0103m3.f2265c[i10], j2);
                        }
                        Trace.endSection();
                        c0104n.f2266a = false;
                        c0104n.f2267b = 0;
                        c0104n.f2268c = 0;
                        c0104n.d = null;
                        c0104n.f2269e = 0;
                    } catch (Throwable th) {
                        int i11 = G.h.f247a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0104n.f2266a = false;
            c0104n.f2267b = 0;
            c0104n.f2268c = 0;
            c0104n.d = null;
            c0104n.f2269e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.h.f247a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2272a;
            if (arrayList.isEmpty()) {
                this.f2273b = 0L;
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
                this.f2273b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2274c);
                this.f2273b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2273b = 0L;
            int i3 = G.h.f247a;
            Trace.endSection();
            throw th;
        }
    }
}
