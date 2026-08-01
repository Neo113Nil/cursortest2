package l1;

import K0.B;
import X.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import l.C0242k;

/* loaded from: classes.dex */
public final class d {
    public static final d h;
    public static final Logger i;

    /* renamed from: a, reason: collision with root package name */
    public final C0242k f3181a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3183c;
    public long d;

    /* renamed from: b, reason: collision with root package name */
    public int f3182b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3184e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3185f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final B f3186g = new B(12, this);

    static {
        String str = j1.b.f2607f + " TaskRunner";
        X0.d.e(str, "name");
        h = new d(new C0242k(new j1.a(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        X0.d.d(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public d(C0242k c0242k) {
        this.f3181a = c0242k;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = j1.b.f2603a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f3171a);
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
        byte[] bArr = j1.b.f2603a;
        c cVar = aVar.f3173c;
        X0.d.b(cVar);
        if (cVar.d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = cVar.f3180f;
        cVar.f3180f = false;
        cVar.d = null;
        this.f3184e.remove(cVar);
        if (j2 != -1 && !z2 && !cVar.f3178c) {
            cVar.d(aVar, j2, true);
        }
        if (cVar.f3179e.isEmpty()) {
            return;
        }
        this.f3185f.add(cVar);
    }

    public final a c() {
        boolean z2;
        d dVar = this;
        byte[] bArr = j1.b.f2603a;
        while (true) {
            ArrayList arrayList = dVar.f3185f;
            if (arrayList.isEmpty()) {
                return null;
            }
            C0242k c0242k = dVar.f3181a;
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
                a aVar2 = (a) ((c) it.next()).f3179e.get(0);
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
            ArrayList arrayList2 = dVar.f3184e;
            if (aVar != null) {
                byte[] bArr2 = j1.b.f2603a;
                aVar.d = -1L;
                c cVar = aVar.f3173c;
                X0.d.b(cVar);
                cVar.f3179e.remove(aVar);
                arrayList.remove(cVar);
                cVar.d = aVar;
                arrayList2.add(cVar);
                if (z2 || (!dVar.f3183c && !arrayList.isEmpty())) {
                    B b2 = dVar.f3186g;
                    X0.d.e(b2, "runnable");
                    ((ThreadPoolExecutor) c0242k.f3007a).execute(b2);
                }
                return aVar;
            }
            if (dVar.f3183c) {
                if (j2 < dVar.d - nanoTime) {
                    notify();
                }
                return null;
            }
            dVar.f3183c = true;
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
                        if (cVar2.f3179e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i2 = -1;
                    }
                }
            } finally {
                dVar.f3183c = false;
            }
        }
    }

    public final void d(c cVar) {
        X0.d.e(cVar, "taskQueue");
        byte[] bArr = j1.b.f2603a;
        if (cVar.d == null) {
            boolean isEmpty = cVar.f3179e.isEmpty();
            ArrayList arrayList = this.f3185f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                X0.d.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        boolean z2 = this.f3183c;
        C0242k c0242k = this.f3181a;
        if (z2) {
            notify();
            return;
        }
        B b2 = this.f3186g;
        X0.d.e(b2, "runnable");
        ((ThreadPoolExecutor) c0242k.f3007a).execute(b2);
    }

    public final c e() {
        int i2;
        synchronized (this) {
            i2 = this.f3182b;
            this.f3182b = i2 + 1;
        }
        return new c(this, V.d("Q", i2));
    }
}
