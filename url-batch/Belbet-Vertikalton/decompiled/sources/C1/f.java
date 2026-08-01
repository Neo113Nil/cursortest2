package C1;

import G1.AbstractC0001b;
import j1.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: h, reason: collision with root package name */
    public static final f f148h;
    public static final Logger i;

    /* renamed from: a, reason: collision with root package name */
    public final d f149a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f151c;

    /* renamed from: d, reason: collision with root package name */
    public long f152d;

    /* renamed from: b, reason: collision with root package name */
    public int f150b = 10000;
    public final ArrayList e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f153f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final e f154g = new e(0, this);

    static {
        String str = A1.c.f24g + " TaskRunner";
        h.e(str, "name");
        f148h = new f(new d(new A1.b(str, true)));
        Logger logger = Logger.getLogger(f.class.getName());
        h.d(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public f(d dVar) {
        this.f149a = dVar;
    }

    public static final void a(f fVar, a aVar) {
        fVar.getClass();
        byte[] bArr = A1.c.f19a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f133a);
        try {
            long a2 = aVar.a();
            synchronized (fVar) {
                fVar.b(aVar, a2);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (fVar) {
                fVar.b(aVar, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j) {
        byte[] bArr = A1.c.f19a;
        c cVar = aVar.f135c;
        h.b(cVar);
        if (cVar.f141d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = cVar.f142f;
        cVar.f142f = false;
        cVar.f141d = null;
        this.e.remove(cVar);
        if (j != -1 && !z2 && !cVar.f140c) {
            cVar.d(aVar, j, true);
        }
        if (cVar.e.isEmpty()) {
            return;
        }
        this.f153f.add(cVar);
    }

    public final a c() {
        boolean z2;
        f fVar = this;
        byte[] bArr = A1.c.f19a;
        while (true) {
            ArrayList arrayList = fVar.f153f;
            if (arrayList.isEmpty()) {
                return null;
            }
            d dVar = fVar.f149a;
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    fVar = this;
                    z2 = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).e.get(0);
                long max = Math.max(0L, aVar2.f136d - nanoTime);
                if (max > 0) {
                    j = Math.min(max, j);
                } else {
                    if (aVar != null) {
                        fVar = this;
                        z2 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = fVar.e;
            if (aVar != null) {
                byte[] bArr2 = A1.c.f19a;
                aVar.f136d = -1L;
                c cVar = aVar.f135c;
                h.b(cVar);
                cVar.e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f141d = aVar;
                arrayList2.add(cVar);
                if (z2 || (!fVar.f151c && !arrayList.isEmpty())) {
                    e eVar = fVar.f154g;
                    h.e(eVar, "runnable");
                    ((ThreadPoolExecutor) dVar.f145b).execute(eVar);
                }
                return aVar;
            }
            if (fVar.f151c) {
                if (j < fVar.f152d - nanoTime) {
                    notify();
                }
                return null;
            }
            fVar.f151c = true;
            fVar.f152d = nanoTime + j;
            try {
                try {
                    long j2 = j / 1000000;
                    long j3 = j - (1000000 * j2);
                    if (j2 > 0 || j > 0) {
                        fVar.wait(j2, (int) j3);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    int i2 = -1;
                    for (int size2 = arrayList.size() - 1; i2 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i2 = -1;
                    }
                }
            } finally {
                fVar.f151c = false;
            }
        }
    }

    public final void d(c cVar) {
        h.e(cVar, "taskQueue");
        byte[] bArr = A1.c.f19a;
        if (cVar.f141d == null) {
            boolean isEmpty = cVar.e.isEmpty();
            ArrayList arrayList = this.f153f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                h.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        boolean z2 = this.f151c;
        d dVar = this.f149a;
        if (z2) {
            notify();
            return;
        }
        e eVar = this.f154g;
        h.e(eVar, "runnable");
        ((ThreadPoolExecutor) dVar.f145b).execute(eVar);
    }

    public final c e() {
        int i2;
        synchronized (this) {
            i2 = this.f150b;
            this.f150b = i2 + 1;
        }
        return new c(this, AbstractC0001b.e("Q", i2));
    }
}
