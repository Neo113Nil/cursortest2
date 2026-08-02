package P;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: P.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0101k implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f926i = new ThreadLocal();

    /* renamed from: j, reason: collision with root package name */
    public static final C0098h f927j = new C0098h();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f928e;

    /* renamed from: f, reason: collision with root package name */
    public long f929f;

    /* renamed from: g, reason: collision with root package name */
    public long f930g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f931h;

    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.f1870q && this.f929f == 0) {
            this.f929f = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0099i c0099i = recyclerView.f1848a0;
        c0099i.f918a = i2;
        c0099i.f919b = i3;
    }

    public final void b(long j2) {
        C0100j c0100j;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f928e;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i3);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0099i c0099i = recyclerView2.f1848a0;
                c0099i.f920c = 0;
                i2 += c0099i.f920c;
            }
        }
        ArrayList arrayList2 = this.f931h;
        arrayList2.ensureCapacity(i2);
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i4);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0099i c0099i2 = recyclerView3.f1848a0;
                Math.abs(c0099i2.f918a);
                Math.abs(c0099i2.f919b);
                if (c0099i2.f920c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new C0100j());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f927j);
        if (arrayList2.size() <= 0 || (recyclerView = (c0100j = (C0100j) arrayList2.get(0)).f924d) == null) {
            return;
        }
        int i5 = c0100j.f925e;
        if (recyclerView.f1857h.D() > 0) {
            RecyclerView.j(recyclerView.f1857h.C(0));
            throw null;
        }
        B b2 = recyclerView.f1852e;
        try {
            recyclerView.f1826A++;
            b2.d(i5);
            throw null;
        } catch (Throwable th) {
            int i6 = recyclerView.f1826A - 1;
            recyclerView.f1826A = i6;
            if (i6 < 1) {
                recyclerView.f1826A = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = w.b.f3549a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f928e;
            if (arrayList.isEmpty()) {
                this.f929f = 0L;
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
                this.f929f = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f930g);
                this.f929f = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f929f = 0L;
            int i4 = w.b.f3549a;
            Trace.endSection();
            throw th;
        }
    }
}
