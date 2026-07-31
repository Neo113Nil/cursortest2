package w4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final ThreadLocal f7965h = new ThreadLocal();
    public static final d3.g i = new d3.g(3);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f7966d;

    /* renamed from: e, reason: collision with root package name */
    public long f7967e;

    /* renamed from: f, reason: collision with root package name */
    public long f7968f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f7969g;

    public final void a(RecyclerView recyclerView, int i8, int i9) {
        if (recyclerView.f934r && this.f7967e == 0) {
            this.f7967e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        r5.m mVar = recyclerView.f909b0;
        mVar.f6680a = i8;
        mVar.f6681b = i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a8, code lost:
    
        r9 = r4.f911d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
    
        r4.w();
        r9.i(r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        if (r5.e() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ba, code lost:
    
        if (r5.f() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bc, code lost:
    
        r9.g(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        r4.x(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c2, code lost:
    
        r9.a(null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c0, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d5, code lost:
    
        r4.x(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d8, code lost:
    
        throw r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j7) {
        k kVar;
        RecyclerView recyclerView;
        int i8;
        ArrayList arrayList = this.f7969g;
        ArrayList arrayList2 = this.f7966d;
        int size = arrayList2.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList2.get(i10);
            int windowVisibility = recyclerView2.getWindowVisibility();
            r5.m mVar = recyclerView2.f909b0;
            if (windowVisibility == 0) {
                mVar.a(recyclerView2, false);
                i9 += mVar.f6682c;
            }
        }
        arrayList.ensureCapacity(i9);
        int i11 = 0;
        while (true) {
            p0 p0Var = null;
            if (i11 >= size) {
                Collections.sort(arrayList, i);
                for (int i12 = 0; i12 < arrayList.size() && (recyclerView = (kVar = (k) arrayList.get(i12)).f7963d) != null; i12++) {
                    long j8 = kVar.f7960a ? Long.MAX_VALUE : j7;
                    int i13 = kVar.f7964e;
                    int w7 = recyclerView.f917g.w();
                    while (true) {
                        if (i8 >= w7) {
                            break;
                        }
                        RecyclerView.s(recyclerView.f917g.v(i8));
                        p0Var.getClass();
                        i8 = (i13 != 0 || p0Var.f()) ? i8 + 1 : 0;
                    }
                    kVar.f7960a = false;
                    kVar.f7961b = 0;
                    kVar.f7962c = 0;
                    kVar.f7963d = null;
                    kVar.f7964e = 0;
                }
                return;
            }
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                r5.m mVar2 = recyclerView3.f909b0;
                Math.abs(mVar2.f6680a);
                Math.abs(mVar2.f6681b);
                if (mVar2.f6682c * 2 > 0) {
                    if (arrayList.size() <= 0) {
                        arrayList.add(new k());
                        throw null;
                    }
                    throw null;
                }
            }
            i11++;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f7966d;
        try {
            int i8 = m3.b.f5221a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j7 = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i9);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j7 = Math.max(recyclerView.getDrawingTime(), j7);
                    }
                }
                if (j7 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j7) + this.f7968f);
                }
            }
            this.f7967e = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f7967e = 0L;
            int i10 = m3.b.f5221a;
            Trace.endSection();
            throw th;
        }
    }
}
