package h0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: h0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0164n implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final H0.n f3084f = new H0.n(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3085a;

    /* renamed from: b, reason: collision with root package name */
    public long f3086b;

    /* renamed from: c, reason: collision with root package name */
    public long f3087c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3088d;

    public static V c(RecyclerView recyclerView, int i, long j) {
        int m2 = recyclerView.e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            V I2 = RecyclerView.I(recyclerView.e.l(i2));
            if (I2.f2960c == i && !I2.g()) {
                return null;
            }
        }
        C0147M c0147m = recyclerView.f2014b;
        try {
            recyclerView.P();
            V i3 = c0147m.i(i, j);
            if (i3 != null) {
                if (!i3.f() || i3.g()) {
                    c0147m.a(i3, false);
                } else {
                    c0147m.f(i3.f2958a);
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
        if (recyclerView.f2038p && this.f3086b == 0) {
            this.f3086b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0162l c0162l = recyclerView.f2015b0;
        c0162l.f3076a = i;
        c0162l.f3077b = i2;
    }

    public final void b(long j) {
        C0163m c0163m;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0163m c0163m2;
        ArrayList arrayList = this.f3085a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0162l c0162l = recyclerView3.f2015b0;
                c0162l.b(recyclerView3, false);
                i += c0162l.f3079d;
            }
        }
        ArrayList arrayList2 = this.f3088d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0162l c0162l2 = recyclerView4.f2015b0;
                int abs = Math.abs(c0162l2.f3077b) + Math.abs(c0162l2.f3076a);
                for (int i5 = 0; i5 < c0162l2.f3079d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0163m2 = new C0163m();
                        arrayList2.add(c0163m2);
                    } else {
                        c0163m2 = (C0163m) arrayList2.get(i3);
                    }
                    int[] iArr = c0162l2.f3078c;
                    int i6 = iArr[i5 + 1];
                    c0163m2.f3080a = i6 <= abs;
                    c0163m2.f3081b = abs;
                    c0163m2.f3082c = i6;
                    c0163m2.f3083d = recyclerView4;
                    c0163m2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f3084f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0163m = (C0163m) arrayList2.get(i7)).f3083d) != null; i7++) {
            V c2 = c(recyclerView, c0163m.e, c0163m.f3080a ? Long.MAX_VALUE : j);
            if (c2 != null && c2.f2959b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2959b.get()) != null) {
                if (recyclerView2.f2050y && recyclerView2.e.m() != 0) {
                    AbstractC0137C abstractC0137C = recyclerView2.H;
                    if (abstractC0137C != null) {
                        abstractC0137C.e();
                    }
                    AbstractC0141G abstractC0141G = recyclerView2.f2031l;
                    C0147M c0147m = recyclerView2.f2014b;
                    if (abstractC0141G != null) {
                        abstractC0141G.g0(c0147m);
                        recyclerView2.f2031l.h0(c0147m);
                    }
                    c0147m.f2926a.clear();
                    c0147m.d();
                }
                C0162l c0162l3 = recyclerView2.f2015b0;
                c0162l3.b(recyclerView2, true);
                if (c0162l3.f3079d != 0) {
                    try {
                        int i8 = I.h.f579a;
                        Trace.beginSection("RV Nested Prefetch");
                        S s2 = recyclerView2.f2017c0;
                        AbstractC0174y abstractC0174y = recyclerView2.f2029k;
                        s2.f2943d = 1;
                        s2.e = abstractC0174y.a();
                        s2.f2945g = false;
                        s2.f2946h = false;
                        s2.i = false;
                        for (int i9 = 0; i9 < c0162l3.f3079d * 2; i9 += 2) {
                            c(recyclerView2, c0162l3.f3078c[i9], j);
                        }
                        Trace.endSection();
                        c0163m.f3080a = false;
                        c0163m.f3081b = 0;
                        c0163m.f3082c = 0;
                        c0163m.f3083d = null;
                        c0163m.e = 0;
                    } catch (Throwable th) {
                        int i10 = I.h.f579a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0163m.f3080a = false;
            c0163m.f3081b = 0;
            c0163m.f3082c = 0;
            c0163m.f3083d = null;
            c0163m.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = I.h.f579a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f3085a;
            if (arrayList.isEmpty()) {
                this.f3086b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f3086b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j) + this.f3087c);
                this.f3086b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f3086b = 0L;
            int i3 = I.h.f579a;
            Trace.endSection();
            throw th;
        }
    }
}
