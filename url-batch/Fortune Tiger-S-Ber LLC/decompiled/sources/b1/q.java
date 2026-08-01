package b1;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final ThreadLocal f896j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public static final a2.q f897k = new a2.q(1);

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f898f;
    public long g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f899i;

    public static c1 c(RecyclerView recyclerView, int i4, long j4) {
        int n3 = recyclerView.f637j.n();
        for (int i5 = 0; i5 < n3; i5++) {
            c1 I = RecyclerView.I(recyclerView.f637j.m(i5));
            if (I.c == i4 && !I.f()) {
                return null;
            }
        }
        t0 t0Var = recyclerView.g;
        try {
            recyclerView.P();
            c1 j5 = t0Var.j(i4, j4);
            if (j5 != null) {
                if (!j5.e() || j5.f()) {
                    t0Var.a(j5, false);
                } else {
                    t0Var.g(j5.f747a);
                }
            }
            recyclerView.Q(false);
            return j5;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i4, int i5) {
        if (recyclerView.f663w && this.g == 0) {
            this.g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        o oVar = recyclerView.f638j0;
        oVar.f886a = i4;
        oVar.f887b = i5;
    }

    public final void b(long j4) {
        p pVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        p pVar2;
        ArrayList arrayList = this.f899i;
        ArrayList arrayList2 = this.f898f;
        int size = arrayList2.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i5);
            int windowVisibility = recyclerView3.getWindowVisibility();
            o oVar = recyclerView3.f638j0;
            if (windowVisibility == 0) {
                oVar.b(recyclerView3, false);
                i4 += oVar.f888d;
            }
        }
        arrayList.ensureCapacity(i4);
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i7);
            if (recyclerView4.getWindowVisibility() == 0) {
                o oVar2 = recyclerView4.f638j0;
                int abs = Math.abs(oVar2.f887b) + Math.abs(oVar2.f886a);
                for (int i8 = 0; i8 < oVar2.f888d * 2; i8 += 2) {
                    if (i6 >= arrayList.size()) {
                        pVar2 = new p();
                        arrayList.add(pVar2);
                    } else {
                        pVar2 = (p) arrayList.get(i6);
                    }
                    int[] iArr = oVar2.c;
                    int i9 = iArr[i8 + 1];
                    pVar2.f892a = i9 <= abs;
                    pVar2.f893b = abs;
                    pVar2.c = i9;
                    pVar2.f894d = recyclerView4;
                    pVar2.f895e = iArr[i8];
                    i6++;
                }
            }
        }
        Collections.sort(arrayList, f897k);
        for (int i10 = 0; i10 < arrayList.size() && (recyclerView = (pVar = (p) arrayList.get(i10)).f894d) != null; i10++) {
            c1 c = c(recyclerView, pVar.f895e, pVar.f892a ? Long.MAX_VALUE : j4);
            if (c != null && c.f748b != null && c.e() && !c.f() && (recyclerView2 = (RecyclerView) c.f748b.get()) != null) {
                if (recyclerView2.G && recyclerView2.f637j.n() != 0) {
                    t0 t0Var = recyclerView2.g;
                    j0 j0Var = recyclerView2.P;
                    if (j0Var != null) {
                        j0Var.e();
                    }
                    n0 n0Var = recyclerView2.f653r;
                    if (n0Var != null) {
                        n0Var.h0(t0Var);
                        recyclerView2.f653r.i0(t0Var);
                    }
                    t0Var.f917a.clear();
                    t0Var.e();
                }
                o oVar3 = recyclerView2.f638j0;
                oVar3.b(recyclerView2, true);
                if (oVar3.f888d != 0) {
                    try {
                        int i11 = g0.f.f1759a;
                        Trace.beginSection("RV Nested Prefetch");
                        z0 z0Var = recyclerView2.f640k0;
                        e0 e0Var = recyclerView2.f651q;
                        z0Var.f958d = 1;
                        z0Var.f959e = e0Var.a();
                        z0Var.g = false;
                        z0Var.h = false;
                        z0Var.f961i = false;
                        for (int i12 = 0; i12 < oVar3.f888d * 2; i12 += 2) {
                            c(recyclerView2, oVar3.c[i12], j4);
                        }
                        Trace.endSection();
                        pVar.f892a = false;
                        pVar.f893b = 0;
                        pVar.c = 0;
                        pVar.f894d = null;
                        pVar.f895e = 0;
                    } catch (Throwable th) {
                        int i13 = g0.f.f1759a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            pVar.f892a = false;
            pVar.f893b = 0;
            pVar.c = 0;
            pVar.f894d = null;
            pVar.f895e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f898f;
        try {
            int i4 = g0.f.f1759a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i5);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j4 = Math.max(recyclerView.getDrawingTime(), j4);
                    }
                }
                if (j4 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j4) + this.h);
                }
            }
            this.g = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.g = 0L;
            int i6 = g0.f.f1759a;
            Trace.endSection();
            throw th;
        }
    }
}
