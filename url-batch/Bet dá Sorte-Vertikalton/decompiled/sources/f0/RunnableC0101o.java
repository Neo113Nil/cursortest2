package f0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: f0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0101o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2245e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final G0.n f2246f = new G0.n(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2247a;

    /* renamed from: b, reason: collision with root package name */
    public long f2248b;

    /* renamed from: c, reason: collision with root package name */
    public long f2249c;
    public ArrayList d;

    public static X c(RecyclerView recyclerView, int i, long j2) {
        int m2 = recyclerView.f1518e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            X I2 = RecyclerView.I(recyclerView.f1518e.l(i2));
            if (I2.f2120c == i && !I2.g()) {
                return null;
            }
        }
        O o2 = recyclerView.f1513b;
        try {
            recyclerView.P();
            X i3 = o2.i(i, j2);
            if (i3 != null) {
                if (!i3.f() || i3.g()) {
                    o2.a(i3, false);
                } else {
                    o2.f(i3.f2118a);
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
        if (recyclerView.f1536p && this.f2248b == 0) {
            this.f2248b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0099m c0099m = recyclerView.f1514b0;
        c0099m.f2238a = i;
        c0099m.f2239b = i2;
    }

    public final void b(long j2) {
        C0100n c0100n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0100n c0100n2;
        ArrayList arrayList = this.f2247a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0099m c0099m = recyclerView3.f1514b0;
                c0099m.b(recyclerView3, false);
                i += c0099m.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0099m c0099m2 = recyclerView4.f1514b0;
                int abs = Math.abs(c0099m2.f2239b) + Math.abs(c0099m2.f2238a);
                for (int i5 = 0; i5 < c0099m2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0100n2 = new C0100n();
                        arrayList2.add(c0100n2);
                    } else {
                        c0100n2 = (C0100n) arrayList2.get(i3);
                    }
                    int[] iArr = c0099m2.f2240c;
                    int i6 = iArr[i5 + 1];
                    c0100n2.f2241a = i6 <= abs;
                    c0100n2.f2242b = abs;
                    c0100n2.f2243c = i6;
                    c0100n2.d = recyclerView4;
                    c0100n2.f2244e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2246f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0100n = (C0100n) arrayList2.get(i7)).d) != null; i7++) {
            X c2 = c(recyclerView, c0100n.f2244e, c0100n.f2241a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2119b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2119b.get()) != null) {
                if (recyclerView2.f1548y && recyclerView2.f1518e.m() != 0) {
                    E e2 = recyclerView2.f1495H;
                    if (e2 != null) {
                        e2.e();
                    }
                    I i8 = recyclerView2.f1529l;
                    O o2 = recyclerView2.f1513b;
                    if (i8 != null) {
                        i8.g0(o2);
                        recyclerView2.f1529l.h0(o2);
                    }
                    o2.f2087a.clear();
                    o2.d();
                }
                C0099m c0099m3 = recyclerView2.f1514b0;
                c0099m3.b(recyclerView2, true);
                if (c0099m3.d != 0) {
                    try {
                        int i9 = G.h.f178a;
                        Trace.beginSection("RV Nested Prefetch");
                        U u2 = recyclerView2.f1516c0;
                        AbstractC0086A abstractC0086A = recyclerView2.f1527k;
                        u2.d = 1;
                        u2.f2103e = abstractC0086A.a();
                        u2.f2105g = false;
                        u2.h = false;
                        u2.i = false;
                        for (int i10 = 0; i10 < c0099m3.d * 2; i10 += 2) {
                            c(recyclerView2, c0099m3.f2240c[i10], j2);
                        }
                        Trace.endSection();
                        c0100n.f2241a = false;
                        c0100n.f2242b = 0;
                        c0100n.f2243c = 0;
                        c0100n.d = null;
                        c0100n.f2244e = 0;
                    } catch (Throwable th) {
                        int i11 = G.h.f178a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0100n.f2241a = false;
            c0100n.f2242b = 0;
            c0100n.f2243c = 0;
            c0100n.d = null;
            c0100n.f2244e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.h.f178a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2247a;
            if (arrayList.isEmpty()) {
                this.f2248b = 0L;
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
                this.f2248b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2249c);
                this.f2248b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2248b = 0L;
            int i3 = G.h.f178a;
            Trace.endSection();
            throw th;
        }
    }
}
