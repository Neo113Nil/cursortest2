package f3;

import a2.e;
import androidx.fragment.app.g;
import androidx.fragment.app.w0;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d {
    public static final d h;

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f1747i;

    /* renamed from: a, reason: collision with root package name */
    public final e f1748a;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public long f1750d;

    /* renamed from: b, reason: collision with root package name */
    public int f1749b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1751e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1752f = new ArrayList();
    public final g g = new g(5, this);

    static {
        String str = d3.c.g + " TaskRunner";
        u2.c.e(str, "name");
        h = new d(new e(new d3.b(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        u2.c.d(logger, "getLogger(TaskRunner::class.java.name)");
        f1747i = logger;
    }

    public d(e eVar) {
        this.f1748a = eVar;
    }

    public static final void a(d dVar, a aVar) {
        byte[] bArr = d3.c.f1490a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f1737a);
        try {
            long a4 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a4);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j4) {
        byte[] bArr = d3.c.f1490a;
        c cVar = aVar.c;
        u2.c.b(cVar);
        if (cVar.f1744d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z3 = cVar.f1746f;
        cVar.f1746f = false;
        cVar.f1744d = null;
        this.f1751e.remove(cVar);
        if (j4 != -1 && !z3 && !cVar.c) {
            cVar.d(aVar, j4, true);
        }
        if (cVar.f1745e.isEmpty()) {
            return;
        }
        this.f1752f.add(cVar);
    }

    public final a c() {
        long j4;
        a aVar;
        boolean z3;
        byte[] bArr = d3.c.f1490a;
        while (true) {
            ArrayList arrayList = this.f1752f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j5 = Long.MAX_VALUE;
            int i4 = 0;
            a aVar2 = null;
            while (true) {
                if (i4 >= size) {
                    j4 = nanoTime;
                    aVar = null;
                    z3 = false;
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                a aVar3 = (a) ((c) obj).f1745e.get(0);
                j4 = nanoTime;
                aVar = null;
                long max = Math.max(0L, aVar3.f1739d - j4);
                if (max > 0) {
                    j5 = Math.min(max, j5);
                } else {
                    if (aVar2 != null) {
                        z3 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                nanoTime = j4;
            }
            ArrayList arrayList2 = this.f1751e;
            if (aVar2 != null) {
                byte[] bArr2 = d3.c.f1490a;
                aVar2.f1739d = -1L;
                c cVar = aVar2.c;
                u2.c.b(cVar);
                cVar.f1745e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f1744d = aVar2;
                arrayList2.add(cVar);
                if (z3 || (!this.c && !arrayList.isEmpty())) {
                    g gVar = this.g;
                    u2.c.e(gVar, "runnable");
                    ((ThreadPoolExecutor) this.f1748a.g).execute(gVar);
                }
                return aVar2;
            }
            if (this.c) {
                if (j5 >= this.f1750d - j4) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.c = true;
            this.f1750d = j4 + j5;
            try {
                try {
                    long j6 = j5 / 1000000;
                    long j7 = j5 - (1000000 * j6);
                    if (j6 > 0 || j5 > 0) {
                        wait(j6, (int) j7);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((c) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        c cVar2 = (c) arrayList.get(size3);
                        cVar2.b();
                        if (cVar2.f1745e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.c = false;
            }
        }
    }

    public final void d(c cVar) {
        u2.c.e(cVar, "taskQueue");
        byte[] bArr = d3.c.f1490a;
        if (cVar.f1744d == null) {
            boolean isEmpty = cVar.f1745e.isEmpty();
            ArrayList arrayList = this.f1752f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                u2.c.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        if (this.c) {
            notify();
            return;
        }
        g gVar = this.g;
        u2.c.e(gVar, "runnable");
        ((ThreadPoolExecutor) this.f1748a.g).execute(gVar);
    }

    public final c e() {
        int i4;
        synchronized (this) {
            i4 = this.f1749b;
            this.f1749b = i4 + 1;
        }
        return new c(this, w0.e("Q", i4));
    }
}
