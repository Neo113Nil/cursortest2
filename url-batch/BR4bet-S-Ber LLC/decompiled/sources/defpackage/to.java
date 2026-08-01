package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class to implements Runnable {
    public static final ThreadLocal j = new ThreadLocal();
    public static final cb k = new cb(3);
    public ArrayList f;
    public long g;
    public long h;
    public ArrayList i;

    public static q20 c(RecyclerView recyclerView, int i, long j2) {
        int u = recyclerView.j.u();
        for (int i2 = 0; i2 < u; i2++) {
            q20 I = RecyclerView.I(recyclerView.j.t(i2));
            if (I.c == i && !I.f()) {
                return null;
            }
        }
        h20 h20Var = recyclerView.g;
        try {
            recyclerView.P();
            q20 j3 = h20Var.j(i, j2);
            if (j3 != null) {
                if (!j3.e() || j3.f()) {
                    h20Var.a(j3, false);
                } else {
                    h20Var.g(j3.a);
                }
            }
            recyclerView.Q(false);
            return j3;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.w && this.g == 0) {
            this.g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        ro roVar = recyclerView.j0;
        roVar.a = i;
        roVar.b = i2;
    }

    public final void b(long j2) {
        so soVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        so soVar2;
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            ro roVar = recyclerView3.j0;
            if (windowVisibility == 0) {
                roVar.c(recyclerView3, false);
                i += roVar.c;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                ro roVar2 = recyclerView4.j0;
                int abs = Math.abs(roVar2.b) + Math.abs(roVar2.a);
                for (int i5 = 0; i5 < roVar2.c * 2; i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        soVar2 = new so();
                        arrayList.add(soVar2);
                    } else {
                        soVar2 = (so) arrayList.get(i3);
                    }
                    int[] iArr = (int[]) roVar2.d;
                    int i6 = iArr[i5 + 1];
                    soVar2.a = i6 <= abs;
                    soVar2.b = abs;
                    soVar2.c = i6;
                    soVar2.d = recyclerView4;
                    soVar2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, k);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (soVar = (so) arrayList.get(i7)).d) != null; i7++) {
            q20 c = c(recyclerView, soVar.e, soVar.a ? Long.MAX_VALUE : j2);
            if (c != null && c.b != null && c.e() && !c.f() && (recyclerView2 = (RecyclerView) c.b.get()) != null) {
                if (recyclerView2.G && recyclerView2.j.u() != 0) {
                    h20 h20Var = recyclerView2.g;
                    x10 x10Var = recyclerView2.P;
                    if (x10Var != null) {
                        x10Var.e();
                    }
                    b20 b20Var = recyclerView2.r;
                    if (b20Var != null) {
                        b20Var.h0(h20Var);
                        recyclerView2.r.i0(h20Var);
                    }
                    h20Var.a.clear();
                    h20Var.e();
                }
                ro roVar3 = recyclerView2.j0;
                roVar3.c(recyclerView2, true);
                if (roVar3.c != 0) {
                    try {
                        int i8 = v90.a;
                        Trace.beginSection("RV Nested Prefetch");
                        n20 n20Var = recyclerView2.k0;
                        t10 t10Var = recyclerView2.q;
                        n20Var.d = 1;
                        n20Var.e = t10Var.a();
                        n20Var.g = false;
                        n20Var.h = false;
                        n20Var.i = false;
                        for (int i9 = 0; i9 < roVar3.c * 2; i9 += 2) {
                            c(recyclerView2, ((int[]) roVar3.d)[i9], j2);
                        }
                        Trace.endSection();
                        soVar.a = false;
                        soVar.b = 0;
                        soVar.c = 0;
                        soVar.d = null;
                        soVar.e = 0;
                    } catch (Throwable th) {
                        int i10 = v90.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            soVar.a = false;
            soVar.b = 0;
            soVar.c = 0;
            soVar.d = null;
            soVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f;
        try {
            int i = v90.a;
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
            int i3 = v90.a;
            Trace.endSection();
            throw th;
        }
    }
}
