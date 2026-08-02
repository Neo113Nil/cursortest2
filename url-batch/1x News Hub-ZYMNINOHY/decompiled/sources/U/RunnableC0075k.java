package U;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: U.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0075k implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f1433e = new ThreadLocal();
    public static final C0072h f = new C0072h();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1434a;

    /* renamed from: b, reason: collision with root package name */
    public long f1435b;

    /* renamed from: c, reason: collision with root package name */
    public long f1436c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1437d;

    public final void a(RecyclerView recyclerView, int i3, int i4) {
        if (recyclerView.f2487m && this.f1435b == 0) {
            this.f1435b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0073i c0073i = recyclerView.f2465T;
        c0073i.f1425a = i3;
        c0073i.f1426b = i4;
    }

    public final void b(long j3) {
        C0074j c0074j;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f1434a;
        int size = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0073i c0073i = recyclerView2.f2465T;
                c0073i.f1427c = 0;
                i3 += c0073i.f1427c;
            }
        }
        ArrayList arrayList2 = this.f1437d;
        arrayList2.ensureCapacity(i3);
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i5);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0073i c0073i2 = recyclerView3.f2465T;
                Math.abs(c0073i2.f1425a);
                Math.abs(c0073i2.f1426b);
                if (c0073i2.f1427c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new C0074j());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f);
        if (arrayList2.size() <= 0 || (recyclerView = (c0074j = (C0074j) arrayList2.get(0)).f1431d) == null) {
            return;
        }
        int i6 = c0074j.f1432e;
        if (recyclerView.f2475d.F() > 0) {
            RecyclerView.j(recyclerView.f2475d.E(0));
            throw null;
        }
        A a3 = recyclerView.f2469a;
        try {
            recyclerView.f2495w++;
            a3.a(i6);
            throw null;
        } catch (Throwable th) {
            int i7 = recyclerView.f2495w - 1;
            recyclerView.f2495w = i7;
            if (i7 < 1) {
                recyclerView.f2495w = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i3 = A.d.f2a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f1434a;
            if (arrayList.isEmpty()) {
                this.f1435b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i4);
                if (recyclerView.getWindowVisibility() == 0) {
                    j3 = Math.max(recyclerView.getDrawingTime(), j3);
                }
            }
            if (j3 == 0) {
                this.f1435b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j3) + this.f1436c);
                this.f1435b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f1435b = 0L;
            int i5 = A.d.f2a;
            Trace.endSection();
            throw th;
        }
    }
}
