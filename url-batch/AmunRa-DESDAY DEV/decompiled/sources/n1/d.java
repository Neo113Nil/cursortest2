package n1;

import L0.B;
import X.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import l.C0229n;

/* loaded from: classes.dex */
public final class d {
    public static final d h;
    public static final Logger i;

    /* renamed from: a, reason: collision with root package name */
    public final C0229n f3291a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3293c;
    public long d;

    /* renamed from: b, reason: collision with root package name */
    public int f3292b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3294e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3295f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final B f3296g = new B(12, this);

    static {
        String str = l1.b.f3257g + " TaskRunner";
        Z0.d.e(str, "name");
        h = new d(new C0229n(new l1.a(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        Z0.d.d(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public d(C0229n c0229n) {
        this.f3291a = c0229n;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = l1.b.f3252a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f3281a);
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
        byte[] bArr = l1.b.f3252a;
        c cVar = aVar.f3283c;
        Z0.d.b(cVar);
        if (cVar.d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = cVar.f3290f;
        cVar.f3290f = false;
        cVar.d = null;
        this.f3294e.remove(cVar);
        if (j2 != -1 && !z2 && !cVar.f3288c) {
            cVar.d(aVar, j2, true);
        }
        if (cVar.f3289e.isEmpty()) {
            return;
        }
        this.f3295f.add(cVar);
    }

    public final a c() {
        boolean z2;
        d dVar = this;
        byte[] bArr = l1.b.f3252a;
        while (true) {
            ArrayList arrayList = dVar.f3295f;
            if (arrayList.isEmpty()) {
                return null;
            }
            C0229n c0229n = dVar.f3291a;
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
                a aVar2 = (a) ((c) it.next()).f3289e.get(0);
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
            ArrayList arrayList2 = dVar.f3294e;
            if (aVar != null) {
                byte[] bArr2 = l1.b.f3252a;
                aVar.d = -1L;
                c cVar = aVar.f3283c;
                Z0.d.b(cVar);
                cVar.f3289e.remove(aVar);
                arrayList.remove(cVar);
                cVar.d = aVar;
                arrayList2.add(cVar);
                if (z2 || (!dVar.f3293c && !arrayList.isEmpty())) {
                    B b2 = dVar.f3296g;
                    Z0.d.e(b2, "runnable");
                    ((ThreadPoolExecutor) c0229n.f3111a).execute(b2);
                }
                return aVar;
            }
            if (dVar.f3293c) {
                if (j2 < dVar.d - nanoTime) {
                    notify();
                }
                return null;
            }
            dVar.f3293c = true;
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
                        if (cVar2.f3289e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i2 = -1;
                    }
                }
            } finally {
                dVar.f3293c = false;
            }
        }
    }

    public final void d(c cVar) {
        Z0.d.e(cVar, "taskQueue");
        byte[] bArr = l1.b.f3252a;
        if (cVar.d == null) {
            boolean isEmpty = cVar.f3289e.isEmpty();
            ArrayList arrayList = this.f3295f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                Z0.d.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        boolean z2 = this.f3293c;
        C0229n c0229n = this.f3291a;
        if (z2) {
            notify();
            return;
        }
        B b2 = this.f3296g;
        Z0.d.e(b2, "runnable");
        ((ThreadPoolExecutor) c0229n.f3111a).execute(b2);
    }

    public final c e() {
        int i2;
        synchronized (this) {
            i2 = this.f3292b;
            this.f3292b = i2 + 1;
        }
        return new c(this, V.d("Q", i2));
    }
}
