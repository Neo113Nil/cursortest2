package h0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: h0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0128o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2561e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final F0.n f2562f = new F0.n(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2563a;

    /* renamed from: b, reason: collision with root package name */
    public long f2564b;

    /* renamed from: c, reason: collision with root package name */
    public long f2565c;
    public ArrayList d;

    public static X c(RecyclerView recyclerView, int i, long j2) {
        int o2 = recyclerView.f1648e.o();
        for (int i2 = 0; i2 < o2; i2++) {
            X I2 = RecyclerView.I(recyclerView.f1648e.n(i2));
            if (I2.f2432c == i && !I2.g()) {
                return null;
            }
        }
        O o3 = recyclerView.f1643b;
        try {
            recyclerView.P();
            X i3 = o3.i(i, j2);
            if (i3 != null) {
                if (!i3.f() || i3.g()) {
                    o3.a(i3, false);
                } else {
                    o3.f(i3.f2430a);
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
        if (recyclerView.f1668p && this.f2564b == 0) {
            this.f2564b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0126m c0126m = recyclerView.f1644b0;
        c0126m.f2554a = i;
        c0126m.f2555b = i2;
    }

    public final void b(long j2) {
        C0127n c0127n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0127n c0127n2;
        ArrayList arrayList = this.f2563a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0126m c0126m = recyclerView3.f1644b0;
                c0126m.b(recyclerView3, false);
                i += c0126m.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0126m c0126m2 = recyclerView4.f1644b0;
                int abs = Math.abs(c0126m2.f2555b) + Math.abs(c0126m2.f2554a);
                for (int i5 = 0; i5 < c0126m2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0127n2 = new C0127n();
                        arrayList2.add(c0127n2);
                    } else {
                        c0127n2 = (C0127n) arrayList2.get(i3);
                    }
                    int[] iArr = c0126m2.f2556c;
                    int i6 = iArr[i5 + 1];
                    c0127n2.f2557a = i6 <= abs;
                    c0127n2.f2558b = abs;
                    c0127n2.f2559c = i6;
                    c0127n2.d = recyclerView4;
                    c0127n2.f2560e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2562f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0127n = (C0127n) arrayList2.get(i7)).d) != null; i7++) {
            X c2 = c(recyclerView, c0127n.f2560e, c0127n.f2557a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2431b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2431b.get()) != null) {
                if (recyclerView2.f1679y && recyclerView2.f1648e.o() != 0) {
                    E e2 = recyclerView2.H;
                    if (e2 != null) {
                        e2.e();
                    }
                    I i8 = recyclerView2.f1660l;
                    O o2 = recyclerView2.f1643b;
                    if (i8 != null) {
                        i8.g0(o2);
                        recyclerView2.f1660l.h0(o2);
                    }
                    o2.f2399a.clear();
                    o2.d();
                }
                C0126m c0126m3 = recyclerView2.f1644b0;
                c0126m3.b(recyclerView2, true);
                if (c0126m3.d != 0) {
                    try {
                        int i9 = I.h.f335a;
                        Trace.beginSection("RV Nested Prefetch");
                        U u2 = recyclerView2.f1646c0;
                        AbstractC0113A abstractC0113A = recyclerView2.f1658k;
                        u2.d = 1;
                        u2.f2415e = abstractC0113A.a();
                        u2.f2417g = false;
                        u2.h = false;
                        u2.i = false;
                        for (int i10 = 0; i10 < c0126m3.d * 2; i10 += 2) {
                            c(recyclerView2, c0126m3.f2556c[i10], j2);
                        }
                        Trace.endSection();
                        c0127n.f2557a = false;
                        c0127n.f2558b = 0;
                        c0127n.f2559c = 0;
                        c0127n.d = null;
                        c0127n.f2560e = 0;
                    } catch (Throwable th) {
                        int i11 = I.h.f335a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0127n.f2557a = false;
            c0127n.f2558b = 0;
            c0127n.f2559c = 0;
            c0127n.d = null;
            c0127n.f2560e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = I.h.f335a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2563a;
            if (arrayList.isEmpty()) {
                this.f2564b = 0L;
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
                this.f2564b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2565c);
                this.f2564b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2564b = 0L;
            int i3 = I.h.f335a;
            Trace.endSection();
            throw th;
        }
    }
}
