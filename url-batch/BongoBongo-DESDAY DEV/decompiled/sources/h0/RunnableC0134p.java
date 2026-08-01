package h0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: h0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0134p implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2591e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final E0.o f2592f = new E0.o(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2593a;

    /* renamed from: b, reason: collision with root package name */
    public long f2594b;

    /* renamed from: c, reason: collision with root package name */
    public long f2595c;
    public ArrayList d;

    public static a0 c(RecyclerView recyclerView, int i, long j2) {
        int h2 = recyclerView.f1660f.h();
        for (int i2 = 0; i2 < h2; i2++) {
            a0 L2 = RecyclerView.L(recyclerView.f1660f.g(i2));
            if (L2.f2457c == i && !L2.g()) {
                return null;
            }
        }
        P p2 = recyclerView.f1655c;
        try {
            recyclerView.S();
            a0 k2 = p2.k(i, j2);
            if (k2 != null) {
                if (!k2.f() || k2.g()) {
                    p2.a(k2, false);
                } else {
                    p2.h(k2.f2455a);
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
        if (recyclerView.f1681r) {
            if (RecyclerView.f1626x0 && !this.f2593a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f2594b == 0) {
                this.f2594b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0132n c0132n = recyclerView.f1657d0;
        c0132n.f2584a = i;
        c0132n.f2585b = i2;
    }

    public final void b(long j2) {
        C0133o c0133o;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0133o c0133o2;
        ArrayList arrayList = this.f2593a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0132n c0132n = recyclerView3.f1657d0;
                c0132n.b(recyclerView3, false);
                i += c0132n.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0132n c0132n2 = recyclerView4.f1657d0;
                int abs = Math.abs(c0132n2.f2585b) + Math.abs(c0132n2.f2584a);
                for (int i5 = 0; i5 < c0132n2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0133o2 = new C0133o();
                        arrayList2.add(c0133o2);
                    } else {
                        c0133o2 = (C0133o) arrayList2.get(i3);
                    }
                    int[] iArr = c0132n2.f2586c;
                    int i6 = iArr[i5 + 1];
                    c0133o2.f2587a = i6 <= abs;
                    c0133o2.f2588b = abs;
                    c0133o2.f2589c = i6;
                    c0133o2.d = recyclerView4;
                    c0133o2.f2590e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2592f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0133o = (C0133o) arrayList2.get(i7)).d) != null; i7++) {
            a0 c2 = c(recyclerView, c0133o.f2590e, c0133o.f2587a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2456b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2456b.get()) != null) {
                if (recyclerView2.f1629A && recyclerView2.f1660f.h() != 0) {
                    AbstractC0118F abstractC0118F = recyclerView2.f1637J;
                    if (abstractC0118F != null) {
                        abstractC0118F.e();
                    }
                    J j3 = recyclerView2.f1672m;
                    P p2 = recyclerView2.f1655c;
                    if (j3 != null) {
                        j3.i0(p2);
                        recyclerView2.f1672m.j0(p2);
                    }
                    p2.f2418a.clear();
                    p2.f();
                }
                C0132n c0132n3 = recyclerView2.f1657d0;
                c0132n3.b(recyclerView2, true);
                if (c0132n3.d != 0) {
                    try {
                        int i8 = H.h.f295a;
                        Trace.beginSection("RV Nested Prefetch");
                        W w2 = recyclerView2.f1659e0;
                        AbstractC0114B abstractC0114B = recyclerView2.f1671l;
                        w2.d = 1;
                        w2.f2436e = abstractC0114B.a();
                        w2.f2438g = false;
                        w2.f2439h = false;
                        w2.i = false;
                        for (int i9 = 0; i9 < c0132n3.d * 2; i9 += 2) {
                            c(recyclerView2, c0132n3.f2586c[i9], j2);
                        }
                        Trace.endSection();
                        c0133o.f2587a = false;
                        c0133o.f2588b = 0;
                        c0133o.f2589c = 0;
                        c0133o.d = null;
                        c0133o.f2590e = 0;
                    } catch (Throwable th) {
                        int i10 = H.h.f295a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0133o.f2587a = false;
            c0133o.f2588b = 0;
            c0133o.f2589c = 0;
            c0133o.d = null;
            c0133o.f2590e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = H.h.f295a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2593a;
            if (arrayList.isEmpty()) {
                this.f2594b = 0L;
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
                this.f2594b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2595c);
                this.f2594b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2594b = 0L;
            int i3 = H.h.f295a;
            Trace.endSection();
            throw th;
        }
    }
}
