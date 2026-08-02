package l1;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: l1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1262i implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f14234e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final C1260g f14235f = new C1260g();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f14236a;

    /* renamed from: b, reason: collision with root package name */
    public long f14237b;

    /* renamed from: c, reason: collision with root package name */
    public long f14238c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f14239d;

    public final void a(RecyclerView recyclerView, int i4, int i5) {
        if (recyclerView.f5178m && this.f14237b == 0) {
            this.f14237b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        A0.c cVar = recyclerView.f5155T;
        cVar.f9a = i4;
        cVar.f10b = i5;
    }

    public final void b(long j4) {
        C1261h c1261h;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f14239d;
        ArrayList arrayList2 = this.f14236a;
        int size = arrayList2.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList2.get(i5);
            int windowVisibility = recyclerView2.getWindowVisibility();
            A0.c cVar = recyclerView2.f5155T;
            if (windowVisibility == 0) {
                cVar.f11c = 0;
                i4 += cVar.f11c;
            }
        }
        arrayList.ensureCapacity(i4);
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i6);
            if (recyclerView3.getWindowVisibility() == 0) {
                A0.c cVar2 = recyclerView3.f5155T;
                Math.abs(cVar2.f9a);
                Math.abs(cVar2.f10b);
                if (cVar2.f11c * 2 > 0) {
                    if (arrayList.size() <= 0) {
                        arrayList.add(new C1261h());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList, f14235f);
        if (arrayList.size() <= 0 || (recyclerView = (c1261h = (C1261h) arrayList.get(0)).f14232d) == null) {
            return;
        }
        int i7 = c1261h.f14233e;
        if (recyclerView.f5165d.r() > 0) {
            RecyclerView.j(recyclerView.f5165d.q(0));
            throw null;
        }
        c0.F f4 = recyclerView.f5159a;
        try {
            recyclerView.f5185w++;
            f4.b(i7);
            throw null;
        } catch (Throwable th) {
            int i8 = recyclerView.f5185w - 1;
            recyclerView.f5185w = i8;
            if (i8 < 1) {
                recyclerView.f5185w = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f14236a;
        try {
            int i4 = A.e.f5a;
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
                    b(TimeUnit.MILLISECONDS.toNanos(j4) + this.f14238c);
                }
            }
            this.f14237b = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f14237b = 0L;
            int i6 = A.e.f5a;
            Trace.endSection();
            throw th;
        }
    }
}
