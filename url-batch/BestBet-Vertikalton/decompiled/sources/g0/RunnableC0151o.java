package g0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: g0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0151o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2906e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final L0.l f2907f = new L0.l(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2908a;

    /* renamed from: b, reason: collision with root package name */
    public long f2909b;

    /* renamed from: c, reason: collision with root package name */
    public long f2910c;
    public ArrayList d;

    public static Y c(RecyclerView recyclerView, int i, long j2) {
        int h = recyclerView.f1977f.h();
        for (int i2 = 0; i2 < h; i2++) {
            Y L2 = RecyclerView.L(recyclerView.f1977f.g(i2));
            if (L2.f2779c == i && !L2.g()) {
                return null;
            }
        }
        N n2 = recyclerView.f1972c;
        try {
            recyclerView.S();
            Y k2 = n2.k(i, j2);
            if (k2 != null) {
                if (!k2.f() || k2.g()) {
                    n2.a(k2, false);
                } else {
                    n2.h(k2.f2777a);
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
        if (recyclerView.f1998r) {
            if (RecyclerView.f1943x0 && !this.f2908a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f2909b == 0) {
                this.f2909b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0149m c0149m = recyclerView.f1974d0;
        c0149m.f2899a = i;
        c0149m.f2900b = i2;
    }

    public final void b(long j2) {
        C0150n c0150n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0150n c0150n2;
        ArrayList arrayList = this.f2908a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0149m c0149m = recyclerView3.f1974d0;
                c0149m.b(recyclerView3, false);
                i += c0149m.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0149m c0149m2 = recyclerView4.f1974d0;
                int abs = Math.abs(c0149m2.f2900b) + Math.abs(c0149m2.f2899a);
                for (int i5 = 0; i5 < c0149m2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0150n2 = new C0150n();
                        arrayList2.add(c0150n2);
                    } else {
                        c0150n2 = (C0150n) arrayList2.get(i3);
                    }
                    int[] iArr = c0149m2.f2901c;
                    int i6 = iArr[i5 + 1];
                    c0150n2.f2902a = i6 <= abs;
                    c0150n2.f2903b = abs;
                    c0150n2.f2904c = i6;
                    c0150n2.d = recyclerView4;
                    c0150n2.f2905e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2907f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0150n = (C0150n) arrayList2.get(i7)).d) != null; i7++) {
            Y c2 = c(recyclerView, c0150n.f2905e, c0150n.f2902a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2778b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2778b.get()) != null) {
                if (recyclerView2.f1946A && recyclerView2.f1977f.h() != 0) {
                    AbstractC0134D abstractC0134D = recyclerView2.f1954J;
                    if (abstractC0134D != null) {
                        abstractC0134D.e();
                    }
                    H h = recyclerView2.f1989m;
                    N n2 = recyclerView2.f1972c;
                    if (h != null) {
                        h.i0(n2);
                        recyclerView2.f1989m.j0(n2);
                    }
                    n2.f2745a.clear();
                    n2.f();
                }
                C0149m c0149m3 = recyclerView2.f1974d0;
                c0149m3.b(recyclerView2, true);
                if (c0149m3.d != 0) {
                    try {
                        int i8 = G.h.f291a;
                        Trace.beginSection("RV Nested Prefetch");
                        U u2 = recyclerView2.f1976e0;
                        AbstractC0161z abstractC0161z = recyclerView2.f1987l;
                        u2.d = 1;
                        u2.f2762e = abstractC0161z.a();
                        u2.f2764g = false;
                        u2.h = false;
                        u2.i = false;
                        for (int i9 = 0; i9 < c0149m3.d * 2; i9 += 2) {
                            c(recyclerView2, c0149m3.f2901c[i9], j2);
                        }
                        Trace.endSection();
                        c0150n.f2902a = false;
                        c0150n.f2903b = 0;
                        c0150n.f2904c = 0;
                        c0150n.d = null;
                        c0150n.f2905e = 0;
                    } catch (Throwable th) {
                        int i10 = G.h.f291a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0150n.f2902a = false;
            c0150n.f2903b = 0;
            c0150n.f2904c = 0;
            c0150n.d = null;
            c0150n.f2905e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.h.f291a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2908a;
            if (arrayList.isEmpty()) {
                this.f2909b = 0L;
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
                this.f2909b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2910c);
                this.f2909b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2909b = 0L;
            int i3 = G.h.f291a;
            Trace.endSection();
            throw th;
        }
    }
}
