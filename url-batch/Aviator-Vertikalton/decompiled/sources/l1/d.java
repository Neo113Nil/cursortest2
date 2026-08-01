package l1;

import K0.B;
import X0.e;
import X0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import l.C0274n;

/* loaded from: classes.dex */
public final class d {
    public static final d h;
    public static final Logger i;

    /* renamed from: a, reason: collision with root package name */
    public final C0274n f3524a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3526c;

    /* renamed from: d, reason: collision with root package name */
    public long f3527d;

    /* renamed from: b, reason: collision with root package name */
    public int f3525b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3528e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3529f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final B f3530g = new B(13, this);

    static {
        String str = j1.b.f2973g + " TaskRunner";
        f.e(str, "name");
        h = new d(new C0274n(new j1.a(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        f.d(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public d(C0274n c0274n) {
        this.f3524a = c0274n;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = j1.b.f2967a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f3512a);
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
        byte[] bArr = j1.b.f2967a;
        c cVar = aVar.f3514c;
        f.b(cVar);
        if (cVar.f3521d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = cVar.f3523f;
        cVar.f3523f = false;
        cVar.f3521d = null;
        this.f3528e.remove(cVar);
        if (j2 != -1 && !z2 && !cVar.f3520c) {
            cVar.d(aVar, j2, true);
        }
        if (cVar.f3522e.isEmpty()) {
            return;
        }
        this.f3529f.add(cVar);
    }

    public final a c() {
        boolean z2;
        d dVar = this;
        byte[] bArr = j1.b.f2967a;
        while (true) {
            ArrayList arrayList = dVar.f3529f;
            if (arrayList.isEmpty()) {
                return null;
            }
            C0274n c0274n = dVar.f3524a;
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
                a aVar2 = (a) ((c) it.next()).f3522e.get(0);
                long max = Math.max(0L, aVar2.f3515d - nanoTime);
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
            ArrayList arrayList2 = dVar.f3528e;
            if (aVar != null) {
                byte[] bArr2 = j1.b.f2967a;
                aVar.f3515d = -1L;
                c cVar = aVar.f3514c;
                f.b(cVar);
                cVar.f3522e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f3521d = aVar;
                arrayList2.add(cVar);
                if (z2 || (!dVar.f3526c && !arrayList.isEmpty())) {
                    B b2 = dVar.f3530g;
                    f.e(b2, "runnable");
                    ((ThreadPoolExecutor) c0274n.f3416a).execute(b2);
                }
                return aVar;
            }
            if (dVar.f3526c) {
                if (j2 < dVar.f3527d - nanoTime) {
                    notify();
                }
                return null;
            }
            dVar.f3526c = true;
            dVar.f3527d = nanoTime + j2;
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
                        if (cVar2.f3522e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i2 = -1;
                    }
                }
            } finally {
                dVar.f3526c = false;
            }
        }
    }

    public final void d(c cVar) {
        f.e(cVar, "taskQueue");
        byte[] bArr = j1.b.f2967a;
        if (cVar.f3521d == null) {
            boolean isEmpty = cVar.f3522e.isEmpty();
            ArrayList arrayList = this.f3529f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                f.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        boolean z2 = this.f3526c;
        C0274n c0274n = this.f3524a;
        if (z2) {
            notify();
            return;
        }
        B b2 = this.f3530g;
        f.e(b2, "runnable");
        ((ThreadPoolExecutor) c0274n.f3416a).execute(b2);
    }

    public final c e() {
        int i2;
        synchronized (this) {
            i2 = this.f3525b;
            this.f3525b = i2 + 1;
        }
        return new c(this, e.d("Q", i2));
    }
}
