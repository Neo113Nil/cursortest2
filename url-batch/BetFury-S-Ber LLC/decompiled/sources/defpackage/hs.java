package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class hs implements Runnable {
    public static final ThreadLocal j = new ThreadLocal();
    public static final yb k = new yb(3);
    public ArrayList f;
    public long g;
    public long h;
    public ArrayList i;

    public static x80 c(RecyclerView recyclerView, int i, long j2) {
        int p = recyclerView.j.p();
        for (int i2 = 0; i2 < p; i2++) {
            x80 J = RecyclerView.J(recyclerView.j.o(i2));
            if (J.c == i && !J.g()) {
                return null;
            }
        }
        o80 o80Var = recyclerView.g;
        try {
            recyclerView.Q();
            x80 j3 = o80Var.j(i, j2);
            if (j3 != null) {
                if (!j3.f() || j3.g()) {
                    o80Var.a(j3, false);
                } else {
                    o80Var.g(j3.a);
                }
            }
            recyclerView.R(false);
            return j3;
        } catch (Throwable th) {
            recyclerView.R(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.w && this.g == 0) {
            this.g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        ac acVar = recyclerView.k0;
        acVar.a = i;
        acVar.b = i2;
    }

    public final void b(long j2) {
        gs gsVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        gs gsVar2;
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            ac acVar = recyclerView3.k0;
            if (windowVisibility == 0) {
                acVar.d(recyclerView3, false);
                i += acVar.c;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                ac acVar2 = recyclerView4.k0;
                int abs = Math.abs(acVar2.b) + Math.abs(acVar2.a);
                for (int i5 = 0; i5 < acVar2.c * 2; i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        gsVar2 = new gs();
                        arrayList.add(gsVar2);
                    } else {
                        gsVar2 = (gs) arrayList.get(i3);
                    }
                    int[] iArr = (int[]) acVar2.d;
                    int i6 = iArr[i5 + 1];
                    gsVar2.a = i6 <= abs;
                    gsVar2.b = abs;
                    gsVar2.c = i6;
                    gsVar2.d = recyclerView4;
                    gsVar2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, k);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (gsVar = (gs) arrayList.get(i7)).d) != null; i7++) {
            x80 c = c(recyclerView, gsVar.e, gsVar.a ? Long.MAX_VALUE : j2);
            if (c != null && c.b != null && c.f() && !c.g() && (recyclerView2 = (RecyclerView) c.b.get()) != null) {
                if (recyclerView2.H && recyclerView2.j.p() != 0) {
                    o80 o80Var = recyclerView2.g;
                    d80 d80Var = recyclerView2.Q;
                    if (d80Var != null) {
                        d80Var.e();
                    }
                    h80 h80Var = recyclerView2.r;
                    if (h80Var != null) {
                        h80Var.h0(o80Var);
                        recyclerView2.r.i0(o80Var);
                    }
                    o80Var.a.clear();
                    o80Var.e();
                }
                ac acVar3 = recyclerView2.k0;
                acVar3.d(recyclerView2, true);
                if (acVar3.c != 0) {
                    try {
                        int i8 = bj0.a;
                        Trace.beginSection("RV Nested Prefetch");
                        u80 u80Var = recyclerView2.l0;
                        z70 z70Var = recyclerView2.q;
                        u80Var.d = 1;
                        u80Var.e = z70Var.a();
                        u80Var.g = false;
                        u80Var.h = false;
                        u80Var.i = false;
                        for (int i9 = 0; i9 < acVar3.c * 2; i9 += 2) {
                            c(recyclerView2, ((int[]) acVar3.d)[i9], j2);
                        }
                        Trace.endSection();
                        gsVar.a = false;
                        gsVar.b = 0;
                        gsVar.c = 0;
                        gsVar.d = null;
                        gsVar.e = 0;
                    } catch (Throwable th) {
                        int i10 = bj0.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            gsVar.a = false;
            gsVar.b = 0;
            gsVar.c = 0;
            gsVar.d = null;
            gsVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f;
        try {
            int i = bj0.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j2) + this.h);
                }
            }
            this.g = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.g = 0L;
            int i3 = bj0.a;
            Trace.endSection();
            throw th;
        }
    }
}
