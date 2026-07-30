package L;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: L.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0036l implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f571i = new ThreadLocal();

    /* renamed from: j, reason: collision with root package name */
    public static final C0033i f572j = new C0033i();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f573e;

    /* renamed from: f, reason: collision with root package name */
    public long f574f;

    /* renamed from: g, reason: collision with root package name */
    public long f575g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f576h;

    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.f1612q && this.f574f == 0) {
            this.f574f = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0034j c0034j = recyclerView.f1590a0;
        c0034j.f563a = i2;
        c0034j.f564b = i3;
    }

    public final void b(long j2) {
        C0035k c0035k;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f573e;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i3);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0034j c0034j = recyclerView2.f1590a0;
                c0034j.f565c = 0;
                i2 += c0034j.f565c;
            }
        }
        ArrayList arrayList2 = this.f576h;
        arrayList2.ensureCapacity(i2);
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i4);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0034j c0034j2 = recyclerView3.f1590a0;
                Math.abs(c0034j2.f563a);
                Math.abs(c0034j2.f564b);
                if (c0034j2.f565c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new C0035k());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f572j);
        if (arrayList2.size() <= 0 || (recyclerView = (c0035k = (C0035k) arrayList2.get(0)).f569d) == null) {
            return;
        }
        int i5 = c0035k.f570e;
        if (recyclerView.f1600h.A() > 0) {
            RecyclerView.j(recyclerView.f1600h.z(0));
            throw null;
        }
        D d2 = recyclerView.f1594e;
        try {
            recyclerView.f1568A++;
            d2.a(i5);
            throw null;
        } catch (Throwable th) {
            int i6 = recyclerView.f1568A - 1;
            recyclerView.f1568A = i6;
            if (i6 < 1) {
                recyclerView.f1568A = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = s.b.f2838a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f573e;
            if (arrayList.isEmpty()) {
                this.f574f = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f574f = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f575g);
                this.f574f = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f574f = 0L;
            int i4 = s.b.f2838a;
            Trace.endSection();
            throw th;
        }
    }
}
