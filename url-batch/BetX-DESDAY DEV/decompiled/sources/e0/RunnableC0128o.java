package e0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: e0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0128o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2316e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final B0.p f2317f = new B0.p(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2318a;

    /* renamed from: b, reason: collision with root package name */
    public long f2319b;

    /* renamed from: c, reason: collision with root package name */
    public long f2320c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f2321d;

    public static X c(RecyclerView recyclerView, int i, long j2) {
        int m2 = recyclerView.f1574e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            X I2 = RecyclerView.I(recyclerView.f1574e.l(i2));
            if (I2.f2174c == i && !I2.g()) {
                return null;
            }
        }
        O o2 = recyclerView.f1568b;
        try {
            recyclerView.P();
            X i3 = o2.i(i, j2);
            if (i3 != null) {
                if (!i3.f() || i3.g()) {
                    o2.a(i3, false);
                } else {
                    o2.f(i3.f2172a);
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
        if (recyclerView.f1592p && this.f2319b == 0) {
            this.f2319b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0126m c0126m = recyclerView.f1569b0;
        c0126m.f2307a = i;
        c0126m.f2308b = i2;
    }

    public final void b(long j2) {
        C0127n c0127n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0127n c0127n2;
        ArrayList arrayList = this.f2318a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0126m c0126m = recyclerView3.f1569b0;
                c0126m.b(recyclerView3, false);
                i += c0126m.f2310d;
            }
        }
        ArrayList arrayList2 = this.f2321d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0126m c0126m2 = recyclerView4.f1569b0;
                int abs = Math.abs(c0126m2.f2308b) + Math.abs(c0126m2.f2307a);
                for (int i5 = 0; i5 < c0126m2.f2310d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0127n2 = new C0127n();
                        arrayList2.add(c0127n2);
                    } else {
                        c0127n2 = (C0127n) arrayList2.get(i3);
                    }
                    int[] iArr = c0126m2.f2309c;
                    int i6 = iArr[i5 + 1];
                    c0127n2.f2311a = i6 <= abs;
                    c0127n2.f2312b = abs;
                    c0127n2.f2313c = i6;
                    c0127n2.f2314d = recyclerView4;
                    c0127n2.f2315e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2317f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0127n = (C0127n) arrayList2.get(i7)).f2314d) != null; i7++) {
            X c2 = c(recyclerView, c0127n.f2315e, c0127n.f2311a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2173b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2173b.get()) != null) {
                if (recyclerView2.f1604y && recyclerView2.f1574e.m() != 0) {
                    AbstractC0112E abstractC0112E = recyclerView2.f1550H;
                    if (abstractC0112E != null) {
                        abstractC0112E.e();
                    }
                    I i8 = recyclerView2.f1585l;
                    O o2 = recyclerView2.f1568b;
                    if (i8 != null) {
                        i8.g0(o2);
                        recyclerView2.f1585l.h0(o2);
                    }
                    o2.f2137a.clear();
                    o2.d();
                }
                C0126m c0126m3 = recyclerView2.f1569b0;
                c0126m3.b(recyclerView2, true);
                if (c0126m3.f2310d != 0) {
                    try {
                        int i9 = G.i.f203a;
                        Trace.beginSection("RV Nested Prefetch");
                        U u2 = recyclerView2.f1571c0;
                        AbstractC0108A abstractC0108A = recyclerView2.f1583k;
                        u2.f2155d = 1;
                        u2.f2156e = abstractC0108A.a();
                        u2.f2158g = false;
                        u2.h = false;
                        u2.i = false;
                        for (int i10 = 0; i10 < c0126m3.f2310d * 2; i10 += 2) {
                            c(recyclerView2, c0126m3.f2309c[i10], j2);
                        }
                        Trace.endSection();
                        c0127n.f2311a = false;
                        c0127n.f2312b = 0;
                        c0127n.f2313c = 0;
                        c0127n.f2314d = null;
                        c0127n.f2315e = 0;
                    } catch (Throwable th) {
                        int i11 = G.i.f203a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0127n.f2311a = false;
            c0127n.f2312b = 0;
            c0127n.f2313c = 0;
            c0127n.f2314d = null;
            c0127n.f2315e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.i.f203a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2318a;
            if (arrayList.isEmpty()) {
                this.f2319b = 0L;
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
                this.f2319b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2320c);
                this.f2319b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2319b = 0L;
            int i3 = G.i.f203a;
            Trace.endSection();
            throw th;
        }
    }
}
