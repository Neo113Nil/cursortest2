package t0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.BP;
import com.google.android.gms.internal.ads.C2830Vl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: t0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5050m implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public static final ThreadLocal f40749x = new ThreadLocal();

    /* renamed from: y, reason: collision with root package name */
    public static final B.i f40750y = new B.i(4);

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f40751n;

    /* renamed from: u, reason: collision with root package name */
    public long f40752u;

    /* renamed from: v, reason: collision with root package name */
    public long f40753v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f40754w;

    public static AbstractC5032P c(RecyclerView recyclerView, int i, long j9) {
        int l9 = recyclerView.f5382x.l();
        for (int i4 = 0; i4 < l9; i4++) {
            AbstractC5032P I2 = RecyclerView.I(recyclerView.f5382x.k(i4));
            if (I2.f40617c == i && !I2.f()) {
                return null;
            }
        }
        BP bp = recyclerView.f5376u;
        try {
            recyclerView.P();
            AbstractC5032P i9 = bp.i(i, j9);
            if (i9 != null) {
                if (!i9.e() || i9.f()) {
                    bp.a(i9, false);
                } else {
                    bp.f(i9.f40615a);
                }
            }
            recyclerView.Q(false);
            return i9;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i4) {
        if (recyclerView.f5338I && this.f40752u == 0) {
            this.f40752u = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C2830Vl c2830Vl = recyclerView.f5337H0;
        c2830Vl.f28294a = i;
        c2830Vl.f28295b = i4;
    }

    public final void b(long j9) {
        C5049l c5049l;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C5049l c5049l2;
        ArrayList arrayList = this.f40751n;
        int size = arrayList.size();
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i4);
            if (recyclerView3.getWindowVisibility() == 0) {
                C2830Vl c2830Vl = recyclerView3.f5337H0;
                c2830Vl.b(recyclerView3, false);
                i += c2830Vl.f28297d;
            }
        }
        ArrayList arrayList2 = this.f40754w;
        arrayList2.ensureCapacity(i);
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i10);
            if (recyclerView4.getWindowVisibility() == 0) {
                C2830Vl c2830Vl2 = recyclerView4.f5337H0;
                int abs = Math.abs(c2830Vl2.f28295b) + Math.abs(c2830Vl2.f28294a);
                for (int i11 = 0; i11 < c2830Vl2.f28297d * 2; i11 += 2) {
                    if (i9 >= arrayList2.size()) {
                        c5049l2 = new C5049l();
                        arrayList2.add(c5049l2);
                    } else {
                        c5049l2 = (C5049l) arrayList2.get(i9);
                    }
                    int[] iArr = c2830Vl2.f28296c;
                    int i12 = iArr[i11 + 1];
                    c5049l2.f40744a = i12 <= abs;
                    c5049l2.f40745b = abs;
                    c5049l2.f40746c = i12;
                    c5049l2.f40747d = recyclerView4;
                    c5049l2.f40748e = iArr[i11];
                    i9++;
                }
            }
        }
        Collections.sort(arrayList2, f40750y);
        for (int i13 = 0; i13 < arrayList2.size() && (recyclerView = (c5049l = (C5049l) arrayList2.get(i13)).f40747d) != null; i13++) {
            AbstractC5032P c4 = c(recyclerView, c5049l.f40748e, c5049l.f40744a ? Long.MAX_VALUE : j9);
            if (c4 != null && c4.f40616b != null && c4.e() && !c4.f() && (recyclerView2 = (RecyclerView) c4.f40616b.get()) != null) {
                if (recyclerView2.f5355R && recyclerView2.f5382x.l() != 0) {
                    AbstractC5063z abstractC5063z = recyclerView2.f5372q0;
                    if (abstractC5063z != null) {
                        abstractC5063z.e();
                    }
                    AbstractC5019C abstractC5019C = recyclerView2.f5330E;
                    BP bp = recyclerView2.f5376u;
                    if (abstractC5019C != null) {
                        abstractC5019C.g0(bp);
                        recyclerView2.f5330E.h0(bp);
                    }
                    ((ArrayList) bp.f24037c).clear();
                    bp.d();
                }
                C2830Vl c2830Vl3 = recyclerView2.f5337H0;
                c2830Vl3.b(recyclerView2, true);
                if (c2830Vl3.f28297d != 0) {
                    try {
                        int i14 = K.n.f1482a;
                        Trace.beginSection("RV Nested Prefetch");
                        C5029M c5029m = recyclerView2.f5339I0;
                        AbstractC5059v abstractC5059v = recyclerView2.f5328D;
                        c5029m.f40597d = 1;
                        c5029m.f40598e = abstractC5059v.a();
                        c5029m.f40600g = false;
                        c5029m.f40601h = false;
                        c5029m.i = false;
                        for (int i15 = 0; i15 < c2830Vl3.f28297d * 2; i15 += 2) {
                            c(recyclerView2, c2830Vl3.f28296c[i15], j9);
                        }
                        Trace.endSection();
                        c5049l.f40744a = false;
                        c5049l.f40745b = 0;
                        c5049l.f40746c = 0;
                        c5049l.f40747d = null;
                        c5049l.f40748e = 0;
                    } catch (Throwable th) {
                        int i16 = K.n.f1482a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c5049l.f40744a = false;
            c5049l.f40745b = 0;
            c5049l.f40746c = 0;
            c5049l.f40747d = null;
            c5049l.f40748e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = K.n.f1482a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f40751n;
            if (arrayList.isEmpty()) {
                this.f40752u = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j9 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i4);
                if (recyclerView.getWindowVisibility() == 0) {
                    j9 = Math.max(recyclerView.getDrawingTime(), j9);
                }
            }
            if (j9 == 0) {
                this.f40752u = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j9) + this.f40753v);
                this.f40752u = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f40752u = 0L;
            int i9 = K.n.f1482a;
            Trace.endSection();
            throw th;
        }
    }
}
