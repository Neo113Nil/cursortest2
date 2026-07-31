package D2;

import A2.g;
import H2.AbstractC0080b;
import Z1.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    public static final e f600h;

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f601i;

    /* renamed from: a, reason: collision with root package name */
    public final g f602a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f604c;

    /* renamed from: d, reason: collision with root package name */
    public long f605d;

    /* renamed from: b, reason: collision with root package name */
    public int f603b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f606e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f607f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final d f608g = new d(0, this);

    static {
        String str = B2.c.f421g + " TaskRunner";
        i.f(str, "name");
        f600h = new e(new g(new B2.b(str, true)));
        Logger logger = Logger.getLogger(e.class.getName());
        i.e(logger, "getLogger(TaskRunner::class.java.name)");
        f601i = logger;
    }

    public e(g gVar) {
        this.f602a = gVar;
    }

    public static final void a(e eVar, a aVar) {
        eVar.getClass();
        byte[] bArr = B2.c.f415a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f586a);
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
        byte[] bArr = B2.c.f415a;
        c cVar = aVar.f588c;
        i.c(cVar);
        if (cVar.f595d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z3 = cVar.f597f;
        cVar.f597f = false;
        cVar.f595d = null;
        this.f606e.remove(cVar);
        if (j3 != -1 && !z3 && !cVar.f594c) {
            cVar.d(aVar, j3, true);
        }
        if (cVar.f596e.isEmpty()) {
            return;
        }
        this.f607f.add(cVar);
    }

    public final a c() {
        boolean z3;
        e eVar = this;
        byte[] bArr = B2.c.f415a;
        while (true) {
            ArrayList arrayList = eVar.f607f;
            if (arrayList.isEmpty()) {
                return null;
            }
            g gVar = eVar.f602a;
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
                a aVar2 = (a) ((c) it.next()).f596e.get(0);
                long max = Math.max(0L, aVar2.f589d - nanoTime);
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
            ArrayList arrayList2 = eVar.f606e;
            if (aVar != null) {
                byte[] bArr2 = B2.c.f415a;
                aVar.f589d = -1L;
                c cVar = aVar.f588c;
                i.c(cVar);
                cVar.f596e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f595d = aVar;
                arrayList2.add(cVar);
                if (z3 || (!eVar.f604c && !arrayList.isEmpty())) {
                    d dVar = eVar.f608g;
                    i.f(dVar, "runnable");
                    ((ThreadPoolExecutor) gVar.f83b).execute(dVar);
                }
                return aVar;
            }
            if (eVar.f604c) {
                if (j3 < eVar.f605d - nanoTime) {
                    notify();
                }
                return null;
            }
            eVar.f604c = true;
            eVar.f605d = nanoTime + j3;
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
                        if (cVar2.f596e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i3 = -1;
                    }
                }
            } finally {
                eVar.f604c = false;
            }
        }
    }

    public final void d(c cVar) {
        i.f(cVar, "taskQueue");
        byte[] bArr = B2.c.f415a;
        if (cVar.f595d == null) {
            boolean isEmpty = cVar.f596e.isEmpty();
            ArrayList arrayList = this.f607f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                i.f(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        boolean z3 = this.f604c;
        g gVar = this.f602a;
        if (z3) {
            notify();
            return;
        }
        d dVar = this.f608g;
        i.f(dVar, "runnable");
        ((ThreadPoolExecutor) gVar.f83b).execute(dVar);
    }

    public final c e() {
        int i3;
        synchronized (this) {
            i3 = this.f603b;
            this.f603b = i3 + 1;
        }
        return new c(this, AbstractC0080b.h("Q", i3));
    }
}
