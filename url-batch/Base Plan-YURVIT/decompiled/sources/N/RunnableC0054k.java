package N;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: N.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0054k implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f749i = new ThreadLocal();

    /* renamed from: j, reason: collision with root package name */
    public static final C0051h f750j = new C0051h();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f751e;

    /* renamed from: f, reason: collision with root package name */
    public long f752f;

    /* renamed from: g, reason: collision with root package name */
    public long f753g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f754h;

    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.f1701q && this.f752f == 0) {
            this.f752f = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0052i c0052i = recyclerView.f1680a0;
        c0052i.f741a = i2;
        c0052i.f742b = i3;
    }

    public final void b(long j2) {
        C0053j c0053j;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f754h;
        ArrayList arrayList2 = this.f751e;
        int size = arrayList2.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList2.get(i3);
            int windowVisibility = recyclerView2.getWindowVisibility();
            C0052i c0052i = recyclerView2.f1680a0;
            if (windowVisibility == 0) {
                c0052i.f743c = 0;
                i2 += c0052i.f743c;
            }
        }
        arrayList.ensureCapacity(i2);
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0052i c0052i2 = recyclerView3.f1680a0;
                Math.abs(c0052i2.f741a);
                Math.abs(c0052i2.f742b);
                if (c0052i2.f743c * 2 > 0) {
                    if (arrayList.size() <= 0) {
                        arrayList.add(new C0053j());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList, f750j);
        if (arrayList.size() <= 0 || (recyclerView = (c0053j = (C0053j) arrayList.get(0)).f747d) == null) {
            return;
        }
        int i5 = c0053j.f748e;
        if (recyclerView.f1689h.y() > 0) {
            RecyclerView.j(recyclerView.f1689h.x(0));
            throw null;
        }
        C c2 = recyclerView.f1683e;
        try {
            recyclerView.f1659A++;
            c2.a(i5);
            throw null;
        } catch (Throwable th) {
            int i6 = recyclerView.f1659A - 1;
            recyclerView.f1659A = i6;
            if (i6 < 1) {
                recyclerView.f1659A = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f751e;
        try {
            int i2 = u.c.f2984a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i3);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f753g);
                }
            }
            this.f752f = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f752f = 0L;
            int i4 = u.c.f2984a;
            Trace.endSection();
            throw th;
        }
    }
}
