package g0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: g0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0430j implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    public static final ThreadLocal f4939m = new ThreadLocal();

    /* renamed from: n, reason: collision with root package name */
    public static final C0427g f4940n = new C0427g();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4941d;

    /* renamed from: e, reason: collision with root package name */
    public long f4942e;

    /* renamed from: i, reason: collision with root package name */
    public long f4943i;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f4944l;

    public final void a(RecyclerView recyclerView, int i2, int i5) {
        if (recyclerView.f4004u && this.f4942e == 0) {
            this.f4942e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0428h c0428h = recyclerView.f3983e0;
        c0428h.f4931a = i2;
        c0428h.f4932b = i5;
    }

    public final void b(long j) {
        C0429i c0429i;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f4944l;
        ArrayList arrayList2 = this.f4941d;
        int size = arrayList2.size();
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList2.get(i5);
            int windowVisibility = recyclerView2.getWindowVisibility();
            C0428h c0428h = recyclerView2.f3983e0;
            if (windowVisibility == 0) {
                c0428h.f4933c = 0;
                i2 += c0428h.f4933c;
            }
        }
        arrayList.ensureCapacity(i2);
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i7);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0428h c0428h2 = recyclerView3.f3983e0;
                Math.abs(c0428h2.f4931a);
                Math.abs(c0428h2.f4932b);
                if (c0428h2.f4933c * 2 > 0) {
                    if (arrayList.size() <= 0) {
                        arrayList.add(new C0429i());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList, f4940n);
        if (arrayList.size() <= 0 || (recyclerView = (c0429i = (C0429i) arrayList.get(0)).f4937d) == null) {
            return;
        }
        int i8 = c0429i.f4938e;
        if (recyclerView.f3991l.N() > 0) {
            RecyclerView.j(recyclerView.f3991l.M(0));
            throw null;
        }
        D6.n nVar = recyclerView.f3980d;
        try {
            recyclerView.f3959E++;
            nVar.f(i8);
            throw null;
        } catch (Throwable th) {
            int i9 = recyclerView.f3959E - 1;
            recyclerView.f3959E = i9;
            if (i9 < 1) {
                recyclerView.f3959E = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f4941d;
        try {
            int i2 = E.h.f656a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i5);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.f4943i);
                }
            }
            this.f4942e = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f4942e = 0L;
            int i7 = E.h.f656a;
            Trace.endSection();
            throw th;
        }
    }
}
