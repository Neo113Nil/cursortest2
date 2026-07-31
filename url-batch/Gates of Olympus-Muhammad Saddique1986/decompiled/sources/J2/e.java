package J2;

import A.k;
import B.Y;
import f2.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    public static final e f3199h;

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f3200i;

    /* renamed from: a, reason: collision with root package name */
    public final Y f3201a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3203c;

    /* renamed from: d, reason: collision with root package name */
    public long f3204d;

    /* renamed from: b, reason: collision with root package name */
    public int f3202b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3205e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3206f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final d f3207g = new d(0, this);

    static {
        String str = H2.b.f2638g + " TaskRunner";
        j.f(str, "name");
        H2.a aVar = new H2.a(str, true);
        Y y3 = new Y();
        y3.f334d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
        f3199h = new e(y3);
        Logger logger = Logger.getLogger(e.class.getName());
        j.e(logger, "getLogger(TaskRunner::class.java.name)");
        f3200i = logger;
    }

    public e(Y y3) {
        this.f3201a = y3;
    }

    public static final void a(e eVar, a aVar) {
        eVar.getClass();
        byte[] bArr = H2.b.f2632a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f3185a);
        try {
            long a3 = aVar.a();
            synchronized (eVar) {
                eVar.b(aVar, a3);
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

    public final void b(a aVar, long j3) {
        byte[] bArr = H2.b.f2632a;
        c cVar = aVar.f3187c;
        j.c(cVar);
        if (cVar.f3194d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z3 = cVar.f3196f;
        cVar.f3196f = false;
        cVar.f3194d = null;
        this.f3205e.remove(cVar);
        if (j3 != -1 && !z3 && !cVar.f3193c) {
            cVar.d(aVar, j3, true);
        }
        if (cVar.f3195e.isEmpty()) {
            return;
        }
        this.f3206f.add(cVar);
    }

    public final a c() {
        boolean z3;
        e eVar = this;
        byte[] bArr = H2.b.f2632a;
        while (true) {
            ArrayList arrayList = eVar.f3206f;
            if (arrayList.isEmpty()) {
                return null;
            }
            Y y3 = eVar.f3201a;
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j3 = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    eVar = this;
                    z3 = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).f3195e.get(0);
                long max = Math.max(0L, aVar2.f3188d - nanoTime);
                if (max > 0) {
                    j3 = Math.min(max, j3);
                } else {
                    if (aVar != null) {
                        eVar = this;
                        z3 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = eVar.f3205e;
            if (aVar != null) {
                byte[] bArr2 = H2.b.f2632a;
                aVar.f3188d = -1L;
                c cVar = aVar.f3187c;
                j.c(cVar);
                cVar.f3195e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f3194d = aVar;
                arrayList2.add(cVar);
                if (z3 || (!eVar.f3203c && !arrayList.isEmpty())) {
                    d dVar = eVar.f3207g;
                    j.f(dVar, "runnable");
                    ((ThreadPoolExecutor) y3.f334d).execute(dVar);
                }
                return aVar;
            }
            if (eVar.f3203c) {
                if (j3 < eVar.f3204d - nanoTime) {
                    notify();
                }
                return null;
            }
            eVar.f3203c = true;
            eVar.f3204d = nanoTime + j3;
            try {
                try {
                    long j4 = j3 / 1000000;
                    long j5 = j3 - (1000000 * j4);
                    if (j4 > 0 || j3 > 0) {
                        eVar.wait(j4, (int) j5);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    int i3 = -1;
                    for (int size2 = arrayList.size() - 1; i3 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.f3195e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i3 = -1;
                    }
                }
            } finally {
                eVar.f3203c = false;
            }
        }
    }

    public final void d(c cVar) {
        j.f(cVar, "taskQueue");
        byte[] bArr = H2.b.f2632a;
        if (cVar.f3194d == null) {
            boolean isEmpty = cVar.f3195e.isEmpty();
            ArrayList arrayList = this.f3206f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                j.f(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        boolean z3 = this.f3203c;
        Y y3 = this.f3201a;
        if (z3) {
            notify();
            return;
        }
        d dVar = this.f3207g;
        j.f(dVar, "runnable");
        ((ThreadPoolExecutor) y3.f334d).execute(dVar);
    }

    public final c e() {
        int i3;
        synchronized (this) {
            i3 = this.f3202b;
            this.f3202b = i3 + 1;
        }
        return new c(this, k.h("Q", i3));
    }
}
