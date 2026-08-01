package l1;

import K0.B;
import X0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class e {
    public static final e h;
    public static final Logger i;

    /* renamed from: a, reason: collision with root package name */
    public final d f3528a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3530c;

    /* renamed from: d, reason: collision with root package name */
    public long f3531d;

    /* renamed from: b, reason: collision with root package name */
    public int f3529b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3532e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3533f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final B f3534g = new B(13, this);

    static {
        String str = j1.b.f2977g + " TaskRunner";
        f.e(str, "name");
        h = new e(new d(new j1.a(str, true)));
        Logger logger = Logger.getLogger(e.class.getName());
        f.d(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public e(d dVar) {
        this.f3528a = dVar;
    }

    public static final void a(e eVar, a aVar) {
        eVar.getClass();
        byte[] bArr = j1.b.f2971a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f3515a);
        try {
            long a2 = aVar.a();
            synchronized (eVar) {
                eVar.b(aVar, a2);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (eVar) {
                eVar.b(aVar, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j2) {
        byte[] bArr = j1.b.f2971a;
        c cVar = aVar.f3517c;
        f.b(cVar);
        if (cVar.f3524d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = cVar.f3526f;
        cVar.f3526f = false;
        cVar.f3524d = null;
        this.f3532e.remove(cVar);
        if (j2 != -1 && !z2 && !cVar.f3523c) {
            cVar.d(aVar, j2, true);
        }
        if (cVar.f3525e.isEmpty()) {
            return;
        }
        this.f3533f.add(cVar);
    }

    public final a c() {
        boolean z2;
        e eVar = this;
        byte[] bArr = j1.b.f2971a;
        while (true) {
            ArrayList arrayList = eVar.f3533f;
            if (arrayList.isEmpty()) {
                return null;
            }
            d dVar = eVar.f3528a;
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j2 = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    eVar = this;
                    z2 = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).f3525e.get(0);
                long max = Math.max(0L, aVar2.f3518d - nanoTime);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (aVar != null) {
                        eVar = this;
                        z2 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = eVar.f3532e;
            if (aVar != null) {
                byte[] bArr2 = j1.b.f2971a;
                aVar.f3518d = -1L;
                c cVar = aVar.f3517c;
                f.b(cVar);
                cVar.f3525e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f3524d = aVar;
                arrayList2.add(cVar);
                if (z2 || (!eVar.f3530c && !arrayList.isEmpty())) {
                    B b2 = eVar.f3534g;
                    f.e(b2, "runnable");
                    ((ThreadPoolExecutor) dVar.f3527a).execute(b2);
                }
                return aVar;
            }
            if (eVar.f3530c) {
                if (j2 < eVar.f3531d - nanoTime) {
                    notify();
                }
                return null;
            }
            eVar.f3530c = true;
            eVar.f3531d = nanoTime + j2;
            try {
                try {
                    long j3 = j2 / 1000000;
                    long j4 = j2 - (1000000 * j3);
                    if (j3 > 0 || j2 > 0) {
                        eVar.wait(j3, (int) j4);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    int i2 = -1;
                    for (int size2 = arrayList.size() - 1; i2 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.f3525e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i2 = -1;
                    }
                }
            } finally {
                eVar.f3530c = false;
            }
        }
    }

    public final void d(c cVar) {
        f.e(cVar, "taskQueue");
        byte[] bArr = j1.b.f2971a;
        if (cVar.f3524d == null) {
            boolean isEmpty = cVar.f3525e.isEmpty();
            ArrayList arrayList = this.f3533f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                f.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        boolean z2 = this.f3530c;
        d dVar = this.f3528a;
        if (z2) {
            notify();
            return;
        }
        B b2 = this.f3534g;
        f.e(b2, "runnable");
        ((ThreadPoolExecutor) dVar.f3527a).execute(b2);
    }

    public final c e() {
        int i2;
        synchronized (this) {
            i2 = this.f3529b;
            this.f3529b = i2 + 1;
        }
        return new c(this, X0.e.d("Q", i2));
    }
}
