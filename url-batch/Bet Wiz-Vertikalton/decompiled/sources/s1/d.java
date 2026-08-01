package s1;

import L0.B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import p1.g;

/* loaded from: classes.dex */
public final class d {
    public static final d h;
    public static final Logger i;

    /* renamed from: a, reason: collision with root package name */
    public final g f3676a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3678c;
    public long d;

    /* renamed from: b, reason: collision with root package name */
    public int f3677b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3679e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3680f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final B f3681g = new B(12, this);

    static {
        String str = q1.b.f3496g + " TaskRunner";
        e1.d.e(str, "name");
        h = new d(new g(new q1.a(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        e1.d.d(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public d(g gVar) {
        this.f3676a = gVar;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = q1.b.f3491a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f3666a);
        try {
            long a2 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a2);
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

    public final void b(a aVar, long j2) {
        byte[] bArr = q1.b.f3491a;
        c cVar = aVar.f3668c;
        e1.d.b(cVar);
        if (cVar.d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = cVar.f3675f;
        cVar.f3675f = false;
        cVar.d = null;
        this.f3679e.remove(cVar);
        if (j2 != -1 && !z2 && !cVar.f3673c) {
            cVar.d(aVar, j2, true);
        }
        if (cVar.f3674e.isEmpty()) {
            return;
        }
        this.f3680f.add(cVar);
    }

    public final a c() {
        boolean z2;
        d dVar = this;
        byte[] bArr = q1.b.f3491a;
        while (true) {
            ArrayList arrayList = dVar.f3680f;
            if (arrayList.isEmpty()) {
                return null;
            }
            g gVar = dVar.f3676a;
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j2 = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    dVar = this;
                    z2 = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).f3674e.get(0);
                long max = Math.max(0L, aVar2.d - nanoTime);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (aVar != null) {
                        dVar = this;
                        z2 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = dVar.f3679e;
            if (aVar != null) {
                byte[] bArr2 = q1.b.f3491a;
                aVar.d = -1L;
                c cVar = aVar.f3668c;
                e1.d.b(cVar);
                cVar.f3674e.remove(aVar);
                arrayList.remove(cVar);
                cVar.d = aVar;
                arrayList2.add(cVar);
                if (z2 || (!dVar.f3678c && !arrayList.isEmpty())) {
                    B b2 = dVar.f3681g;
                    e1.d.e(b2, "runnable");
                    ((ThreadPoolExecutor) gVar.f3336a).execute(b2);
                }
                return aVar;
            }
            if (dVar.f3678c) {
                if (j2 < dVar.d - nanoTime) {
                    notify();
                }
                return null;
            }
            dVar.f3678c = true;
            dVar.d = nanoTime + j2;
            try {
                try {
                    long j3 = j2 / 1000000;
                    long j4 = j2 - (1000000 * j3);
                    if (j3 > 0 || j2 > 0) {
                        dVar.wait(j3, (int) j4);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    int i2 = -1;
                    for (int size2 = arrayList.size() - 1; i2 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.f3674e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i2 = -1;
                    }
                }
            } finally {
                dVar.f3678c = false;
            }
        }
    }

    public final void d(c cVar) {
        e1.d.e(cVar, "taskQueue");
        byte[] bArr = q1.b.f3491a;
        if (cVar.d == null) {
            boolean isEmpty = cVar.f3674e.isEmpty();
            ArrayList arrayList = this.f3680f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                e1.d.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        boolean z2 = this.f3678c;
        g gVar = this.f3676a;
        if (z2) {
            notify();
            return;
        }
        B b2 = this.f3681g;
        e1.d.e(b2, "runnable");
        ((ThreadPoolExecutor) gVar.f3336a).execute(b2);
    }

    public final c e() {
        int i2;
        synchronized (this) {
            i2 = this.f3677b;
            this.f3677b = i2 + 1;
        }
        return new c(this, T0.c.d("Q", i2));
    }
}
