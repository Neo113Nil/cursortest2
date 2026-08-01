package f0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: f0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0104o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2202e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final C0.o f2203f = new C0.o(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2204a;

    /* renamed from: b, reason: collision with root package name */
    public long f2205b;

    /* renamed from: c, reason: collision with root package name */
    public long f2206c;
    public ArrayList d;

    public static X c(RecyclerView recyclerView, int i, long j2) {
        int m2 = recyclerView.f1476e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            X I2 = RecyclerView.I(recyclerView.f1476e.l(i2));
            if (I2.f2077c == i && !I2.g()) {
                return null;
            }
        }
        O o2 = recyclerView.f1471b;
        try {
            recyclerView.P();
            X i3 = o2.i(i, j2);
            if (i3 != null) {
                if (!i3.f() || i3.g()) {
                    o2.a(i3, false);
                } else {
                    o2.f(i3.f2075a);
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
        if (recyclerView.f1494p && this.f2205b == 0) {
            this.f2205b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0102m c0102m = recyclerView.f1472b0;
        c0102m.f2195a = i;
        c0102m.f2196b = i2;
    }

    public final void b(long j2) {
        C0103n c0103n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0103n c0103n2;
        ArrayList arrayList = this.f2204a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0102m c0102m = recyclerView3.f1472b0;
                c0102m.b(recyclerView3, false);
                i += c0102m.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0102m c0102m2 = recyclerView4.f1472b0;
                int abs = Math.abs(c0102m2.f2196b) + Math.abs(c0102m2.f2195a);
                for (int i5 = 0; i5 < c0102m2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0103n2 = new C0103n();
                        arrayList2.add(c0103n2);
                    } else {
                        c0103n2 = (C0103n) arrayList2.get(i3);
                    }
                    int[] iArr = c0102m2.f2197c;
                    int i6 = iArr[i5 + 1];
                    c0103n2.f2198a = i6 <= abs;
                    c0103n2.f2199b = abs;
                    c0103n2.f2200c = i6;
                    c0103n2.d = recyclerView4;
                    c0103n2.f2201e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2203f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0103n = (C0103n) arrayList2.get(i7)).d) != null; i7++) {
            X c2 = c(recyclerView, c0103n.f2201e, c0103n.f2198a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2076b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2076b.get()) != null) {
                if (recyclerView2.f1506y && recyclerView2.f1476e.m() != 0) {
                    AbstractC0088E abstractC0088E = recyclerView2.f1453H;
                    if (abstractC0088E != null) {
                        abstractC0088E.e();
                    }
                    I i8 = recyclerView2.f1487l;
                    O o2 = recyclerView2.f1471b;
                    if (i8 != null) {
                        i8.g0(o2);
                        recyclerView2.f1487l.h0(o2);
                    }
                    o2.f2044a.clear();
                    o2.d();
                }
                C0102m c0102m3 = recyclerView2.f1472b0;
                c0102m3.b(recyclerView2, true);
                if (c0102m3.d != 0) {
                    try {
                        int i9 = G.h.f187a;
                        Trace.beginSection("RV Nested Prefetch");
                        U u2 = recyclerView2.f1474c0;
                        AbstractC0084A abstractC0084A = recyclerView2.f1485k;
                        u2.d = 1;
                        u2.f2060e = abstractC0084A.a();
                        u2.f2062g = false;
                        u2.h = false;
                        u2.i = false;
                        for (int i10 = 0; i10 < c0102m3.d * 2; i10 += 2) {
                            c(recyclerView2, c0102m3.f2197c[i10], j2);
                        }
                        Trace.endSection();
                        c0103n.f2198a = false;
                        c0103n.f2199b = 0;
                        c0103n.f2200c = 0;
                        c0103n.d = null;
                        c0103n.f2201e = 0;
                    } catch (Throwable th) {
                        int i11 = G.h.f187a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0103n.f2198a = false;
            c0103n.f2199b = 0;
            c0103n.f2200c = 0;
            c0103n.d = null;
            c0103n.f2201e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.h.f187a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2204a;
            if (arrayList.isEmpty()) {
                this.f2205b = 0L;
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
                this.f2205b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2206c);
                this.f2205b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2205b = 0L;
            int i3 = G.h.f187a;
            Trace.endSection();
            throw th;
        }
    }
}
