package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class km implements Runnable {
    public static final ThreadLocal j = new ThreadLocal();
    public static final ja k = new ja(3);
    public ArrayList f;
    public long g;
    public long h;
    public ArrayList i;

    public static nz c(RecyclerView recyclerView, int i, long j2) {
        int q = recyclerView.j.q();
        for (int i2 = 0; i2 < q; i2++) {
            nz J = RecyclerView.J(recyclerView.j.p(i2));
            if (J.c == i && !J.g()) {
                return null;
            }
        }
        ez ezVar = recyclerView.g;
        try {
            recyclerView.Q();
            nz j3 = ezVar.j(i, j2);
            if (j3 != null) {
                if (!j3.f() || j3.g()) {
                    ezVar.a(j3, false);
                } else {
                    ezVar.g(j3.a);
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
        im imVar = recyclerView.k0;
        imVar.a = i;
        imVar.b = i2;
    }

    public final void b(long j2) {
        jm jmVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        jm jmVar2;
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            im imVar = recyclerView3.k0;
            if (windowVisibility == 0) {
                imVar.c(recyclerView3, false);
                i += imVar.c;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                im imVar2 = recyclerView4.k0;
                int abs = Math.abs(imVar2.b) + Math.abs(imVar2.a);
                for (int i5 = 0; i5 < imVar2.c * 2; i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        jmVar2 = new jm();
                        arrayList.add(jmVar2);
                    } else {
                        jmVar2 = (jm) arrayList.get(i3);
                    }
                    int[] iArr = (int[]) imVar2.d;
                    int i6 = iArr[i5 + 1];
                    jmVar2.a = i6 <= abs;
                    jmVar2.b = abs;
                    jmVar2.c = i6;
                    jmVar2.d = recyclerView4;
                    jmVar2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, k);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (jmVar = (jm) arrayList.get(i7)).d) != null; i7++) {
            nz c = c(recyclerView, jmVar.e, jmVar.a ? Long.MAX_VALUE : j2);
            if (c != null && c.b != null && c.f() && !c.g() && (recyclerView2 = (RecyclerView) c.b.get()) != null) {
                if (recyclerView2.H && recyclerView2.j.q() != 0) {
                    ez ezVar = recyclerView2.g;
                    ty tyVar = recyclerView2.Q;
                    if (tyVar != null) {
                        tyVar.e();
                    }
                    xy xyVar = recyclerView2.r;
                    if (xyVar != null) {
                        xyVar.h0(ezVar);
                        recyclerView2.r.i0(ezVar);
                    }
                    ezVar.a.clear();
                    ezVar.e();
                }
                im imVar3 = recyclerView2.k0;
                imVar3.c(recyclerView2, true);
                if (imVar3.c != 0) {
                    try {
                        int i8 = n60.a;
                        Trace.beginSection("RV Nested Prefetch");
                        kz kzVar = recyclerView2.l0;
                        py pyVar = recyclerView2.q;
                        kzVar.d = 1;
                        kzVar.e = pyVar.a();
                        kzVar.g = false;
                        kzVar.h = false;
                        kzVar.i = false;
                        for (int i9 = 0; i9 < imVar3.c * 2; i9 += 2) {
                            c(recyclerView2, ((int[]) imVar3.d)[i9], j2);
                        }
                        Trace.endSection();
                        jmVar.a = false;
                        jmVar.b = 0;
                        jmVar.c = 0;
                        jmVar.d = null;
                        jmVar.e = 0;
                    } catch (Throwable th) {
                        int i10 = n60.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            jmVar.a = false;
            jmVar.b = 0;
            jmVar.c = 0;
            jmVar.d = null;
            jmVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f;
        try {
            int i = n60.a;
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
            int i3 = n60.a;
            Trace.endSection();
            throw th;
        }
    }
}
