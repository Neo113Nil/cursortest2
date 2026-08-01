package f1;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final ThreadLocal f1467j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public static final a0.i f1468k = new a0.i(2);

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1469f;

    /* renamed from: g, reason: collision with root package name */
    public long f1470g;

    /* renamed from: h, reason: collision with root package name */
    public long f1471h;
    public ArrayList i;

    public static b1 c(RecyclerView recyclerView, int i, long j4) {
        int s3 = recyclerView.f669j.s();
        for (int i4 = 0; i4 < s3; i4++) {
            b1 I = RecyclerView.I(recyclerView.f669j.r(i4));
            if (I.f1311c == i && !I.f()) {
                return null;
            }
        }
        s0 s0Var = recyclerView.f665g;
        try {
            recyclerView.P();
            b1 j5 = s0Var.j(i, j4);
            if (j5 != null) {
                if (!j5.e() || j5.f()) {
                    s0Var.a(j5, false);
                } else {
                    s0Var.g(j5.f1309a);
                }
            }
            recyclerView.Q(false);
            return j5;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i4) {
        if (recyclerView.f695w && this.f1470g == 0) {
            this.f1470g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        n nVar = recyclerView.f670j0;
        nVar.f1457a = i;
        nVar.f1458b = i4;
    }

    public final void b(long j4) {
        o oVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        o oVar2;
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = this.f1469f;
        int size = arrayList2.size();
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i4);
            int windowVisibility = recyclerView3.getWindowVisibility();
            n nVar = recyclerView3.f670j0;
            if (windowVisibility == 0) {
                nVar.b(recyclerView3, false);
                i += nVar.d;
            }
        }
        arrayList.ensureCapacity(i);
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i6);
            if (recyclerView4.getWindowVisibility() == 0) {
                n nVar2 = recyclerView4.f670j0;
                int abs = Math.abs(nVar2.f1458b) + Math.abs(nVar2.f1457a);
                for (int i7 = 0; i7 < nVar2.d * 2; i7 += 2) {
                    if (i5 >= arrayList.size()) {
                        oVar2 = new o();
                        arrayList.add(oVar2);
                    } else {
                        oVar2 = (o) arrayList.get(i5);
                    }
                    int[] iArr = nVar2.f1459c;
                    int i8 = iArr[i7 + 1];
                    oVar2.f1463a = i8 <= abs;
                    oVar2.f1464b = abs;
                    oVar2.f1465c = i8;
                    oVar2.d = recyclerView4;
                    oVar2.f1466e = iArr[i7];
                    i5++;
                }
            }
        }
        Collections.sort(arrayList, f1468k);
        for (int i9 = 0; i9 < arrayList.size() && (recyclerView = (oVar = (o) arrayList.get(i9)).d) != null; i9++) {
            b1 c4 = c(recyclerView, oVar.f1466e, oVar.f1463a ? Long.MAX_VALUE : j4);
            if (c4 != null && c4.f1310b != null && c4.e() && !c4.f() && (recyclerView2 = (RecyclerView) c4.f1310b.get()) != null) {
                if (recyclerView2.G && recyclerView2.f669j.s() != 0) {
                    s0 s0Var = recyclerView2.f665g;
                    i0 i0Var = recyclerView2.P;
                    if (i0Var != null) {
                        i0Var.e();
                    }
                    m0 m0Var = recyclerView2.f685r;
                    if (m0Var != null) {
                        m0Var.h0(s0Var);
                        recyclerView2.f685r.i0(s0Var);
                    }
                    s0Var.f1490a.clear();
                    s0Var.e();
                }
                n nVar3 = recyclerView2.f670j0;
                nVar3.b(recyclerView2, true);
                if (nVar3.d != 0) {
                    try {
                        int i10 = j0.g.f1893a;
                        Trace.beginSection("RV Nested Prefetch");
                        y0 y0Var = recyclerView2.f672k0;
                        d0 d0Var = recyclerView2.f683q;
                        y0Var.d = 1;
                        y0Var.f1539e = d0Var.a();
                        y0Var.f1541g = false;
                        y0Var.f1542h = false;
                        y0Var.i = false;
                        for (int i11 = 0; i11 < nVar3.d * 2; i11 += 2) {
                            c(recyclerView2, nVar3.f1459c[i11], j4);
                        }
                        Trace.endSection();
                        oVar.f1463a = false;
                        oVar.f1464b = 0;
                        oVar.f1465c = 0;
                        oVar.d = null;
                        oVar.f1466e = 0;
                    } catch (Throwable th) {
                        int i12 = j0.g.f1893a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            oVar.f1463a = false;
            oVar.f1464b = 0;
            oVar.f1465c = 0;
            oVar.d = null;
            oVar.f1466e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f1469f;
        try {
            int i = j0.g.f1893a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j4 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i4);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j4 = Math.max(recyclerView.getDrawingTime(), j4);
                    }
                }
                if (j4 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j4) + this.f1471h);
                }
            }
            this.f1470g = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f1470g = 0L;
            int i5 = j0.g.f1893a;
            Trace.endSection();
            throw th;
        }
    }
}
