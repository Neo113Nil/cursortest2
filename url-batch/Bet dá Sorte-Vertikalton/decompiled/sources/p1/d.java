package p1;

import P0.A;
import X.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import m1.g;

/* loaded from: classes.dex */
public final class d {
    public static final d h;
    public static final Logger i;

    /* renamed from: a, reason: collision with root package name */
    public final g f3432a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3434c;
    public long d;

    /* renamed from: b, reason: collision with root package name */
    public int f3433b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3435e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3436f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final A f3437g = new A(12, this);

    static {
        String str = n1.b.f3324g + " TaskRunner";
        b1.d.e(str, "name");
        h = new d(new g(new n1.a(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        b1.d.d(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public d(g gVar) {
        this.f3432a = gVar;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = n1.b.f3319a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f3422a);
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
        byte[] bArr = n1.b.f3319a;
        c cVar = aVar.f3424c;
        b1.d.b(cVar);
        if (cVar.d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = cVar.f3431f;
        cVar.f3431f = false;
        cVar.d = null;
        this.f3435e.remove(cVar);
        if (j2 != -1 && !z2 && !cVar.f3429c) {
            cVar.d(aVar, j2, true);
        }
        if (cVar.f3430e.isEmpty()) {
            return;
        }
        this.f3436f.add(cVar);
    }

    public final a c() {
        boolean z2;
        d dVar = this;
        byte[] bArr = n1.b.f3319a;
        while (true) {
            ArrayList arrayList = dVar.f3436f;
            if (arrayList.isEmpty()) {
                return null;
            }
            g gVar = dVar.f3432a;
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
                a aVar2 = (a) ((c) it.next()).f3430e.get(0);
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
            ArrayList arrayList2 = dVar.f3435e;
            if (aVar != null) {
                byte[] bArr2 = n1.b.f3319a;
                aVar.d = -1L;
                c cVar = aVar.f3424c;
                b1.d.b(cVar);
                cVar.f3430e.remove(aVar);
                arrayList.remove(cVar);
                cVar.d = aVar;
                arrayList2.add(cVar);
                if (z2 || (!dVar.f3434c && !arrayList.isEmpty())) {
                    A a2 = dVar.f3437g;
                    b1.d.e(a2, "runnable");
                    ((ThreadPoolExecutor) gVar.f3189a).execute(a2);
                }
                return aVar;
            }
            if (dVar.f3434c) {
                if (j2 < dVar.d - nanoTime) {
                    notify();
                }
                return null;
            }
            dVar.f3434c = true;
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
                        if (cVar2.f3430e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i2 = -1;
                    }
                }
            } finally {
                dVar.f3434c = false;
            }
        }
    }

    public final void d(c cVar) {
        b1.d.e(cVar, "taskQueue");
        byte[] bArr = n1.b.f3319a;
        if (cVar.d == null) {
            boolean isEmpty = cVar.f3430e.isEmpty();
            ArrayList arrayList = this.f3436f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                b1.d.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        boolean z2 = this.f3434c;
        g gVar = this.f3432a;
        if (z2) {
            notify();
            return;
        }
        A a2 = this.f3437g;
        b1.d.e(a2, "runnable");
        ((ThreadPoolExecutor) gVar.f3189a).execute(a2);
    }

    public final c e() {
        int i2;
        synchronized (this) {
            i2 = this.f3433b;
            this.f3433b = i2 + 1;
        }
        return new c(this, V.d("Q", i2));
    }
}
