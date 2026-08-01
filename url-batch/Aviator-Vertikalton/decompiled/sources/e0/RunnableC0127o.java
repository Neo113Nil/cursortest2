package e0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: e0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0127o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2312e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final B0.p f2313f = new B0.p(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2314a;

    /* renamed from: b, reason: collision with root package name */
    public long f2315b;

    /* renamed from: c, reason: collision with root package name */
    public long f2316c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f2317d;

    public static X c(RecyclerView recyclerView, int i, long j2) {
        int m2 = recyclerView.f1573e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            X I2 = RecyclerView.I(recyclerView.f1573e.l(i2));
            if (I2.f2170c == i && !I2.g()) {
                return null;
            }
        }
        O o2 = recyclerView.f1567b;
        try {
            recyclerView.P();
            X i3 = o2.i(i, j2);
            if (i3 != null) {
                if (!i3.f() || i3.g()) {
                    o2.a(i3, false);
                } else {
                    o2.f(i3.f2168a);
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
        if (recyclerView.f1591p && this.f2315b == 0) {
            this.f2315b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0125m c0125m = recyclerView.f1568b0;
        c0125m.f2303a = i;
        c0125m.f2304b = i2;
    }

    public final void b(long j2) {
        C0126n c0126n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0126n c0126n2;
        ArrayList arrayList = this.f2314a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0125m c0125m = recyclerView3.f1568b0;
                c0125m.b(recyclerView3, false);
                i += c0125m.f2306d;
            }
        }
        ArrayList arrayList2 = this.f2317d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0125m c0125m2 = recyclerView4.f1568b0;
                int abs = Math.abs(c0125m2.f2304b) + Math.abs(c0125m2.f2303a);
                for (int i5 = 0; i5 < c0125m2.f2306d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0126n2 = new C0126n();
                        arrayList2.add(c0126n2);
                    } else {
                        c0126n2 = (C0126n) arrayList2.get(i3);
                    }
                    int[] iArr = c0125m2.f2305c;
                    int i6 = iArr[i5 + 1];
                    c0126n2.f2307a = i6 <= abs;
                    c0126n2.f2308b = abs;
                    c0126n2.f2309c = i6;
                    c0126n2.f2310d = recyclerView4;
                    c0126n2.f2311e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2313f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0126n = (C0126n) arrayList2.get(i7)).f2310d) != null; i7++) {
            X c2 = c(recyclerView, c0126n.f2311e, c0126n.f2307a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2169b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2169b.get()) != null) {
                if (recyclerView2.f1603y && recyclerView2.f1573e.m() != 0) {
                    AbstractC0111E abstractC0111E = recyclerView2.f1549H;
                    if (abstractC0111E != null) {
                        abstractC0111E.e();
                    }
                    I i8 = recyclerView2.f1584l;
                    O o2 = recyclerView2.f1567b;
                    if (i8 != null) {
                        i8.g0(o2);
                        recyclerView2.f1584l.h0(o2);
                    }
                    o2.f2133a.clear();
                    o2.d();
                }
                C0125m c0125m3 = recyclerView2.f1568b0;
                c0125m3.b(recyclerView2, true);
                if (c0125m3.f2306d != 0) {
                    try {
                        int i9 = G.i.f204a;
                        Trace.beginSection("RV Nested Prefetch");
                        U u2 = recyclerView2.f1570c0;
                        AbstractC0107A abstractC0107A = recyclerView2.f1582k;
                        u2.f2151d = 1;
                        u2.f2152e = abstractC0107A.a();
                        u2.f2154g = false;
                        u2.h = false;
                        u2.i = false;
                        for (int i10 = 0; i10 < c0125m3.f2306d * 2; i10 += 2) {
                            c(recyclerView2, c0125m3.f2305c[i10], j2);
                        }
                        Trace.endSection();
                        c0126n.f2307a = false;
                        c0126n.f2308b = 0;
                        c0126n.f2309c = 0;
                        c0126n.f2310d = null;
                        c0126n.f2311e = 0;
                    } catch (Throwable th) {
                        int i11 = G.i.f204a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0126n.f2307a = false;
            c0126n.f2308b = 0;
            c0126n.f2309c = 0;
            c0126n.f2310d = null;
            c0126n.f2311e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.i.f204a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2314a;
            if (arrayList.isEmpty()) {
                this.f2315b = 0L;
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
                this.f2315b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2316c);
                this.f2315b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2315b = 0L;
            int i3 = G.i.f204a;
            Trace.endSection();
            throw th;
        }
    }
}
