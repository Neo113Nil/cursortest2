package defpackage;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jx implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    static final Comparator b = new ju(0);
    long d;
    public long e;
    public final ArrayList c = new ArrayList();
    private final ArrayList f = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:34:0x0035, B:17:0x0041, B:19:0x004a, B:21:0x0050, B:23:0x0056, B:24:0x005c), top: B:33:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final lp b(RecyclerView recyclerView, int i, long j) {
        boolean z;
        lp o;
        int c = recyclerView.h.c();
        for (int i2 = 0; i2 < c; i2++) {
            lp h = RecyclerView.h(recyclerView.h.f(i2));
            if (h.c == i && !h.s()) {
                return null;
            }
        }
        le leVar = recyclerView.e;
        if (j == Long.MAX_VALUE) {
            try {
                if (vy.a()) {
                    z = true;
                    try {
                        Trace.beginSection("RV Prefetch forced - needed next frame");
                        recyclerView.O();
                        o = leVar.o(i, j);
                        if (o != null) {
                            if (!o.r() || o.s()) {
                                leVar.b(o, false);
                            } else {
                                leVar.i(o.a);
                            }
                        }
                        recyclerView.P(false);
                        if (z) {
                            Trace.endSection();
                        }
                        return o;
                    } catch (Throwable th) {
                        th = th;
                        recyclerView.P(false);
                        if (z) {
                            Trace.endSection();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
        }
        z = false;
        recyclerView.O();
        o = leVar.o(i, j);
        if (o != null) {
        }
        recyclerView.P(false);
        if (z) {
        }
        return o;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.p && this.d == 0) {
            this.d = System.nanoTime();
            recyclerView.post(this);
        }
        jv jvVar = recyclerView.L;
        jvVar.a = i;
        jvVar.b = i2;
    }

    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean, int] */
    @Override // java.lang.Runnable
    public final void run() {
        jw jwVar;
        RecyclerView recyclerView;
        ?? r9;
        WeakReference weakReference;
        jw jwVar2;
        long j = 0;
        try {
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.c;
            if (!arrayList.isEmpty()) {
                try {
                    int size = arrayList.size();
                    int i = 0;
                    long j2 = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i2);
                        if (recyclerView2.getWindowVisibility() == 0) {
                            j2 = Math.max(recyclerView2.getDrawingTime(), j2);
                        }
                    }
                    if (j2 != 0) {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.e;
                        int size2 = arrayList.size();
                        int i3 = 0;
                        for (int i4 = 0; i4 < size2; i4++) {
                            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i4);
                            if (recyclerView3.getWindowVisibility() == 0) {
                                recyclerView3.L.c(recyclerView3, false);
                                i3 += recyclerView3.L.d;
                            }
                        }
                        ArrayList arrayList2 = this.f;
                        arrayList2.ensureCapacity(i3);
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < size2) {
                            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i5);
                            if (recyclerView4.getWindowVisibility() == 0) {
                                jv jvVar = recyclerView4.L;
                                int abs = Math.abs(jvVar.a) + Math.abs(jvVar.b);
                                int i7 = i;
                                while (true) {
                                    int i8 = jvVar.d;
                                    if (i7 < i8 + i8) {
                                        if (i6 >= arrayList2.size()) {
                                            jwVar2 = new jw();
                                            arrayList2.add(jwVar2);
                                        } else {
                                            jwVar2 = (jw) arrayList2.get(i6);
                                        }
                                        int[] iArr = jvVar.c;
                                        int i9 = iArr[i7 + 1];
                                        jwVar2.a = i9 <= abs;
                                        jwVar2.b = abs;
                                        jwVar2.c = i9;
                                        jwVar2.d = recyclerView4;
                                        jwVar2.e = iArr[i7];
                                        i6++;
                                        i7 += 2;
                                    }
                                }
                            }
                            i5++;
                            i = 0;
                        }
                        Collections.sort(arrayList2, b);
                        for (int i10 = 0; i10 < arrayList2.size() && (recyclerView = (jwVar = (jw) arrayList2.get(i10)).d) != null; i10++) {
                            lp b2 = b(recyclerView, jwVar.e, true != jwVar.a ? nanos : Long.MAX_VALUE);
                            if (b2 != null && (weakReference = b2.b) != null && b2.r() && !b2.s()) {
                                RecyclerView recyclerView5 = (RecyclerView) weakReference.get();
                                if (recyclerView5 == null) {
                                    r9 = 0;
                                    jwVar.a = r9;
                                    jwVar.b = r9;
                                    jwVar.c = r9;
                                    jwVar.d = null;
                                    jwVar.e = r9;
                                } else {
                                    if (recyclerView5.w && recyclerView5.h.c() != 0) {
                                        recyclerView5.S();
                                    }
                                    jv jvVar2 = recyclerView5.L;
                                    jvVar2.c(recyclerView5, true);
                                    if (jvVar2.d != 0) {
                                        try {
                                            Trace.beginSection(nanos == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                                            lm lmVar = recyclerView5.M;
                                            kr krVar = recyclerView5.l;
                                            lmVar.d = 1;
                                            lmVar.e = krVar.a();
                                            lmVar.g = false;
                                            lmVar.h = false;
                                            lmVar.i = false;
                                            int i11 = 0;
                                            while (true) {
                                                int i12 = jvVar2.d;
                                                if (i11 >= i12 + i12) {
                                                    break;
                                                }
                                                b(recyclerView5, jvVar2.c[i11], nanos);
                                                i11 += 2;
                                            }
                                            Trace.endSection();
                                            r9 = 0;
                                            jwVar.a = r9;
                                            jwVar.b = r9;
                                            jwVar.c = r9;
                                            jwVar.d = null;
                                            jwVar.e = r9;
                                        } finally {
                                            Trace.endSection();
                                        }
                                    }
                                }
                            }
                            r9 = 0;
                            jwVar.a = r9;
                            jwVar.b = r9;
                            jwVar.c = r9;
                            jwVar.d = null;
                            jwVar.e = r9;
                        }
                        j = 0;
                    }
                } catch (Throwable th) {
                    th = th;
                    j = 0;
                    this.d = j;
                    throw th;
                }
            }
            this.d = j;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
