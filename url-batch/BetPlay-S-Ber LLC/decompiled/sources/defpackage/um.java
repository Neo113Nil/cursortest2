package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class um implements Runnable {
    public static final ThreadLocal j = new ThreadLocal();
    public static final ma k = new ma(2);
    public ArrayList f;
    public long g;
    public long h;
    public ArrayList i;

    public static c00 c(RecyclerView recyclerView, int i, long j2) {
        int q = recyclerView.j.q();
        for (int i2 = 0; i2 < q; i2++) {
            c00 I = RecyclerView.I(recyclerView.j.p(i2));
            if (I.c == i && !I.f()) {
                return null;
            }
        }
        tz tzVar = recyclerView.g;
        try {
            recyclerView.P();
            c00 j3 = tzVar.j(i, j2);
            if (j3 != null) {
                if (!j3.e() || j3.f()) {
                    tzVar.a(j3, false);
                } else {
                    tzVar.g(j3.a);
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
        sm smVar = recyclerView.j0;
        smVar.a = i;
        smVar.b = i2;
    }

    public final void b(long j2) {
        tm tmVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        tm tmVar2;
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            sm smVar = recyclerView3.j0;
            if (windowVisibility == 0) {
                smVar.b(recyclerView3, false);
                i += smVar.d;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                sm smVar2 = recyclerView4.j0;
                int abs = Math.abs(smVar2.b) + Math.abs(smVar2.a);
                for (int i5 = 0; i5 < smVar2.d * 2; i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        tmVar2 = new tm();
                        arrayList.add(tmVar2);
                    } else {
                        tmVar2 = (tm) arrayList.get(i3);
                    }
                    int[] iArr = smVar2.c;
                    int i6 = iArr[i5 + 1];
                    tmVar2.a = i6 <= abs;
                    tmVar2.b = abs;
                    tmVar2.c = i6;
                    tmVar2.d = recyclerView4;
                    tmVar2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, k);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (tmVar = (tm) arrayList.get(i7)).d) != null; i7++) {
            c00 c = c(recyclerView, tmVar.e, tmVar.a ? Long.MAX_VALUE : j2);
            if (c != null && c.b != null && c.e() && !c.f() && (recyclerView2 = (RecyclerView) c.b.get()) != null) {
                if (recyclerView2.G && recyclerView2.j.q() != 0) {
                    tz tzVar = recyclerView2.g;
                    jz jzVar = recyclerView2.P;
                    if (jzVar != null) {
                        jzVar.e();
                    }
                    nz nzVar = recyclerView2.r;
                    if (nzVar != null) {
                        nzVar.h0(tzVar);
                        recyclerView2.r.i0(tzVar);
                    }
                    tzVar.a.clear();
                    tzVar.e();
                }
                sm smVar3 = recyclerView2.j0;
                smVar3.b(recyclerView2, true);
                if (smVar3.d != 0) {
                    try {
                        int i8 = t60.a;
                        Trace.beginSection("RV Nested Prefetch");
                        zz zzVar = recyclerView2.k0;
                        fz fzVar = recyclerView2.q;
                        zzVar.d = 1;
                        zzVar.e = fzVar.a();
                        zzVar.g = false;
                        zzVar.h = false;
                        zzVar.i = false;
                        for (int i9 = 0; i9 < smVar3.d * 2; i9 += 2) {
                            c(recyclerView2, smVar3.c[i9], j2);
                        }
                        Trace.endSection();
                        tmVar.a = false;
                        tmVar.b = 0;
                        tmVar.c = 0;
                        tmVar.d = null;
                        tmVar.e = 0;
                    } catch (Throwable th) {
                        int i10 = t60.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            tmVar.a = false;
            tmVar.b = 0;
            tmVar.c = 0;
            tmVar.d = null;
            tmVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f;
        try {
            int i = t60.a;
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
            int i3 = t60.a;
            Trace.endSection();
            throw th;
        }
    }
}
