package g1;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final ThreadLocal f1593j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public static final a0.j f1594k = new a0.j(2);

    /* renamed from: g, reason: collision with root package name */
    public long f1596g;
    public long h;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1595f = new ArrayList();
    public final ArrayList i = new ArrayList();

    public static q1 c(RecyclerView recyclerView, int i, long j2) {
        int h = recyclerView.f772k.h();
        for (int i4 = 0; i4 < h; i4++) {
            q1 M = RecyclerView.M(recyclerView.f772k.g(i4));
            if (M.f1770c == i && !M.f()) {
                return null;
            }
        }
        g1 g1Var = recyclerView.h;
        if (j2 == Long.MAX_VALUE) {
            try {
                if (j0.h.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.U(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.T();
        q1 l4 = g1Var.l(i, j2);
        if (l4 != null) {
            if (!l4.e() || l4.f()) {
                g1Var.a(l4, false);
            } else {
                g1Var.i(l4.f1768a);
            }
        }
        recyclerView.U(false);
        Trace.endSection();
        return l4;
    }

    public final void a(RecyclerView recyclerView, int i, int i4) {
        if (recyclerView.f798x) {
            if (RecyclerView.G0 && !this.f1595f.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f1596g == 0) {
                this.f1596g = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        y yVar = recyclerView.f773k0;
        yVar.f1851a = i;
        yVar.f1852b = i4;
    }

    public final void b(long j2) {
        z zVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        z zVar2;
        ArrayList arrayList = this.f1595f;
        int size = arrayList.size();
        int i = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i5);
            int windowVisibility = recyclerView3.getWindowVisibility();
            y yVar = recyclerView3.f773k0;
            if (windowVisibility == 0) {
                yVar.b(recyclerView3, false);
                i4 += yVar.d;
            }
        }
        ArrayList arrayList2 = this.i;
        arrayList2.ensureCapacity(i4);
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i6);
            if (recyclerView4.getWindowVisibility() == 0) {
                y yVar2 = recyclerView4.f773k0;
                int abs = Math.abs(yVar2.f1852b) + Math.abs(yVar2.f1851a);
                for (int i8 = i; i8 < yVar2.d * 2; i8 += 2) {
                    if (i7 >= arrayList2.size()) {
                        zVar2 = new z();
                        arrayList2.add(zVar2);
                    } else {
                        zVar2 = (z) arrayList2.get(i7);
                    }
                    int[] iArr = yVar2.f1853c;
                    int i9 = iArr[i8 + 1];
                    zVar2.f1862a = i9 <= abs;
                    zVar2.f1863b = abs;
                    zVar2.f1864c = i9;
                    zVar2.d = recyclerView4;
                    zVar2.f1865e = iArr[i8];
                    i7++;
                }
            }
            i6++;
            i = 0;
        }
        Collections.sort(arrayList2, f1594k);
        for (int i10 = 0; i10 < arrayList2.size() && (recyclerView = (zVar = (z) arrayList2.get(i10)).d) != null; i10++) {
            q1 c5 = c(recyclerView, zVar.f1865e, zVar.f1862a ? Long.MAX_VALUE : j2);
            if (c5 != null && c5.f1769b != null && c5.e() && !c5.f() && (recyclerView2 = (RecyclerView) c5.f1769b.get()) != null) {
                if (recyclerView2.H && recyclerView2.f772k.h() != 0) {
                    g1 g1Var = recyclerView2.h;
                    w0 w0Var = recyclerView2.Q;
                    if (w0Var != null) {
                        w0Var.e();
                    }
                    a1 a1Var = recyclerView2.f788s;
                    if (a1Var != null) {
                        a1Var.j0(g1Var);
                        recyclerView2.f788s.k0(g1Var);
                    }
                    g1Var.f1665a.clear();
                    g1Var.g();
                }
                y yVar3 = recyclerView2.f773k0;
                yVar3.b(recyclerView2, true);
                if (yVar3.d != 0) {
                    try {
                        Trace.beginSection(j2 == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        m1 m1Var = recyclerView2.f775l0;
                        q0 q0Var = recyclerView2.f786r;
                        m1Var.d = 1;
                        m1Var.f1723e = q0Var.a();
                        m1Var.f1725g = false;
                        m1Var.h = false;
                        m1Var.i = false;
                        for (int i11 = 0; i11 < yVar3.d * 2; i11 += 2) {
                            c(recyclerView2, yVar3.f1853c[i11], j2);
                        }
                        Trace.endSection();
                        zVar.f1862a = false;
                        zVar.f1863b = 0;
                        zVar.f1864c = 0;
                        zVar.d = null;
                        zVar.f1865e = 0;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            zVar.f1862a = false;
            zVar.f1863b = 0;
            zVar.f1864c = 0;
            zVar.d = null;
            zVar.f1865e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f1595f;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j2 = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j2) + this.h);
                }
            }
        } finally {
            this.f1596g = 0L;
            Trace.endSection();
        }
    }
}
