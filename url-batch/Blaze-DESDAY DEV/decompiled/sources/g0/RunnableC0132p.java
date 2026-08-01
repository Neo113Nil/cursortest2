package g0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: g0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0132p implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2495e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final D0.o f2496f = new D0.o(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2497a;

    /* renamed from: b, reason: collision with root package name */
    public long f2498b;

    /* renamed from: c, reason: collision with root package name */
    public long f2499c;
    public ArrayList d;

    public static a0 c(RecyclerView recyclerView, int i, long j2) {
        int h = recyclerView.f1597f.h();
        for (int i2 = 0; i2 < h; i2++) {
            a0 L2 = RecyclerView.L(recyclerView.f1597f.g(i2));
            if (L2.f2368c == i && !L2.g()) {
                return null;
            }
        }
        P p2 = recyclerView.f1592c;
        try {
            recyclerView.S();
            a0 k2 = p2.k(i, j2);
            if (k2 != null) {
                if (!k2.f() || k2.g()) {
                    p2.a(k2, false);
                } else {
                    p2.h(k2.f2366a);
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
        if (recyclerView.f1618r) {
            if (RecyclerView.f1564x0 && !this.f2497a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f2498b == 0) {
                this.f2498b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0130n c0130n = recyclerView.f1594d0;
        c0130n.f2488a = i;
        c0130n.f2489b = i2;
    }

    public final void b(long j2) {
        C0131o c0131o;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0131o c0131o2;
        ArrayList arrayList = this.f2497a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0130n c0130n = recyclerView3.f1594d0;
                c0130n.b(recyclerView3, false);
                i += c0130n.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0130n c0130n2 = recyclerView4.f1594d0;
                int abs = Math.abs(c0130n2.f2489b) + Math.abs(c0130n2.f2488a);
                for (int i5 = 0; i5 < c0130n2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0131o2 = new C0131o();
                        arrayList2.add(c0131o2);
                    } else {
                        c0131o2 = (C0131o) arrayList2.get(i3);
                    }
                    int[] iArr = c0130n2.f2490c;
                    int i6 = iArr[i5 + 1];
                    c0131o2.f2491a = i6 <= abs;
                    c0131o2.f2492b = abs;
                    c0131o2.f2493c = i6;
                    c0131o2.d = recyclerView4;
                    c0131o2.f2494e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2496f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0131o = (C0131o) arrayList2.get(i7)).d) != null; i7++) {
            a0 c2 = c(recyclerView, c0131o.f2494e, c0131o.f2491a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2367b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2367b.get()) != null) {
                if (recyclerView2.f1566A && recyclerView2.f1597f.h() != 0) {
                    AbstractC0116F abstractC0116F = recyclerView2.f1574J;
                    if (abstractC0116F != null) {
                        abstractC0116F.e();
                    }
                    J j3 = recyclerView2.f1609m;
                    P p2 = recyclerView2.f1592c;
                    if (j3 != null) {
                        j3.i0(p2);
                        recyclerView2.f1609m.j0(p2);
                    }
                    p2.f2331a.clear();
                    p2.f();
                }
                C0130n c0130n3 = recyclerView2.f1594d0;
                c0130n3.b(recyclerView2, true);
                if (c0130n3.d != 0) {
                    try {
                        int i8 = G.h.f251a;
                        Trace.beginSection("RV Nested Prefetch");
                        W w2 = recyclerView2.f1596e0;
                        AbstractC0112B abstractC0112B = recyclerView2.f1607l;
                        w2.d = 1;
                        w2.f2348e = abstractC0112B.a();
                        w2.f2350g = false;
                        w2.h = false;
                        w2.i = false;
                        for (int i9 = 0; i9 < c0130n3.d * 2; i9 += 2) {
                            c(recyclerView2, c0130n3.f2490c[i9], j2);
                        }
                        Trace.endSection();
                        c0131o.f2491a = false;
                        c0131o.f2492b = 0;
                        c0131o.f2493c = 0;
                        c0131o.d = null;
                        c0131o.f2494e = 0;
                    } catch (Throwable th) {
                        int i10 = G.h.f251a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0131o.f2491a = false;
            c0131o.f2492b = 0;
            c0131o.f2493c = 0;
            c0131o.d = null;
            c0131o.f2494e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.h.f251a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2497a;
            if (arrayList.isEmpty()) {
                this.f2498b = 0L;
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
                this.f2498b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2499c);
                this.f2498b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2498b = 0L;
            int i3 = G.h.f251a;
            Trace.endSection();
            throw th;
        }
    }
}
