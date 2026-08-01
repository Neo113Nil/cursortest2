package g0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: g0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0131q implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2465e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final D0.o f2466f = new D0.o(2);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2467a;

    /* renamed from: b, reason: collision with root package name */
    public long f2468b;

    /* renamed from: c, reason: collision with root package name */
    public long f2469c;
    public ArrayList d;

    public static c0 c(RecyclerView recyclerView, int i, long j2) {
        int h = recyclerView.f1567f.h();
        for (int i2 = 0; i2 < h; i2++) {
            c0 L2 = RecyclerView.L(recyclerView.f1567f.g(i2));
            if (L2.f2341c == i && !L2.h()) {
                return null;
            }
        }
        S s2 = recyclerView.f1562c;
        try {
            recyclerView.S();
            c0 k2 = s2.k(i, j2);
            if (k2 != null) {
                if (!k2.g() || k2.h()) {
                    s2.a(k2, false);
                } else {
                    s2.h(k2.f2339a);
                }
            }
            recyclerView.T(false);
            return k2;
        } catch (Throwable th) {
            recyclerView.T(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f1589s) {
            if (RecyclerView.z0 && !this.f2467a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f2468b == 0) {
                this.f2468b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0129o c0129o = recyclerView.f1568f0;
        c0129o.f2458a = i;
        c0129o.f2459b = i2;
    }

    public final void b(long j2) {
        C0130p c0130p;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0130p c0130p2;
        ArrayList arrayList = this.f2467a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0129o c0129o = recyclerView3.f1568f0;
                c0129o.b(recyclerView3, false);
                i += c0129o.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0129o c0129o2 = recyclerView4.f1568f0;
                int abs = Math.abs(c0129o2.f2459b) + Math.abs(c0129o2.f2458a);
                for (int i5 = 0; i5 < c0129o2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0130p2 = new C0130p();
                        arrayList2.add(c0130p2);
                    } else {
                        c0130p2 = (C0130p) arrayList2.get(i3);
                    }
                    int[] iArr = c0129o2.f2460c;
                    int i6 = iArr[i5 + 1];
                    c0130p2.f2461a = i6 <= abs;
                    c0130p2.f2462b = abs;
                    c0130p2.f2463c = i6;
                    c0130p2.d = recyclerView4;
                    c0130p2.f2464e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2466f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0130p = (C0130p) arrayList2.get(i7)).d) != null; i7++) {
            c0 c2 = c(recyclerView, c0130p.f2464e, c0130p.f2461a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2340b != null && c2.g() && !c2.h() && (recyclerView2 = (RecyclerView) c2.f2340b.get()) != null) {
                if (recyclerView2.f1538C && recyclerView2.f1567f.h() != 0) {
                    H h = recyclerView2.f1546L;
                    if (h != null) {
                        h.e();
                    }
                    L l2 = recyclerView2.f1580n;
                    S s2 = recyclerView2.f1562c;
                    if (l2 != null) {
                        l2.i0(s2);
                        recyclerView2.f1580n.j0(s2);
                    }
                    s2.f2296a.clear();
                    s2.f();
                }
                C0129o c0129o3 = recyclerView2.f1568f0;
                c0129o3.b(recyclerView2, true);
                if (c0129o3.d != 0) {
                    try {
                        int i8 = G.h.f234a;
                        Trace.beginSection("RV Nested Prefetch");
                        Y y2 = recyclerView2.f1570g0;
                        AbstractC0112D abstractC0112D = recyclerView2.f1578m;
                        y2.d = 1;
                        y2.f2313e = abstractC0112D.a();
                        y2.f2315g = false;
                        y2.h = false;
                        y2.i = false;
                        for (int i9 = 0; i9 < c0129o3.d * 2; i9 += 2) {
                            c(recyclerView2, c0129o3.f2460c[i9], j2);
                        }
                        Trace.endSection();
                        c0130p.f2461a = false;
                        c0130p.f2462b = 0;
                        c0130p.f2463c = 0;
                        c0130p.d = null;
                        c0130p.f2464e = 0;
                    } catch (Throwable th) {
                        int i10 = G.h.f234a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0130p.f2461a = false;
            c0130p.f2462b = 0;
            c0130p.f2463c = 0;
            c0130p.d = null;
            c0130p.f2464e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.h.f234a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2467a;
            if (arrayList.isEmpty()) {
                this.f2468b = 0L;
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
                this.f2468b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2469c);
                this.f2468b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2468b = 0L;
            int i3 = G.h.f234a;
            Trace.endSection();
            throw th;
        }
    }
}
