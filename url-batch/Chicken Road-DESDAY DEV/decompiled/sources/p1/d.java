package p1;

import L0.B;
import X.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import l.C0207a0;

/* loaded from: classes.dex */
public final class d {
    public static final d h;
    public static final Logger i;

    /* renamed from: a, reason: collision with root package name */
    public final C0207a0 f3399a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3401c;
    public long d;

    /* renamed from: b, reason: collision with root package name */
    public int f3400b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3402e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3403f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final B f3404g = new B(12, this);

    static {
        String str = n1.b.f3291g + " TaskRunner";
        b1.d.e(str, "name");
        h = new d(new C0207a0(new n1.a(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        b1.d.d(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public d(C0207a0 c0207a0) {
        this.f3399a = c0207a0;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = n1.b.f3286a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f3389a);
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
        byte[] bArr = n1.b.f3286a;
        c cVar = aVar.f3391c;
        b1.d.b(cVar);
        if (cVar.d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = cVar.f3398f;
        cVar.f3398f = false;
        cVar.d = null;
        this.f3402e.remove(cVar);
        if (j2 != -1 && !z2 && !cVar.f3396c) {
            cVar.d(aVar, j2, true);
        }
        if (cVar.f3397e.isEmpty()) {
            return;
        }
        this.f3403f.add(cVar);
    }

    public final a c() {
        boolean z2;
        d dVar = this;
        byte[] bArr = n1.b.f3286a;
        while (true) {
            ArrayList arrayList = dVar.f3403f;
            if (arrayList.isEmpty()) {
                return null;
            }
            C0207a0 c0207a0 = dVar.f3399a;
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
                a aVar2 = (a) ((c) it.next()).f3397e.get(0);
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
            ArrayList arrayList2 = dVar.f3402e;
            if (aVar != null) {
                byte[] bArr2 = n1.b.f3286a;
                aVar.d = -1L;
                c cVar = aVar.f3391c;
                b1.d.b(cVar);
                cVar.f3397e.remove(aVar);
                arrayList.remove(cVar);
                cVar.d = aVar;
                arrayList2.add(cVar);
                if (z2 || (!dVar.f3401c && !arrayList.isEmpty())) {
                    B b2 = dVar.f3404g;
                    b1.d.e(b2, "runnable");
                    ((ThreadPoolExecutor) c0207a0.f2889a).execute(b2);
                }
                return aVar;
            }
            if (dVar.f3401c) {
                if (j2 < dVar.d - nanoTime) {
                    notify();
                }
                return null;
            }
            dVar.f3401c = true;
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
                        if (cVar2.f3397e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i2 = -1;
                    }
                }
            } finally {
                dVar.f3401c = false;
            }
        }
    }

    public final void d(c cVar) {
        b1.d.e(cVar, "taskQueue");
        byte[] bArr = n1.b.f3286a;
        if (cVar.d == null) {
            boolean isEmpty = cVar.f3397e.isEmpty();
            ArrayList arrayList = this.f3403f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                b1.d.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        boolean z2 = this.f3401c;
        C0207a0 c0207a0 = this.f3399a;
        if (z2) {
            notify();
            return;
        }
        B b2 = this.f3404g;
        b1.d.e(b2, "runnable");
        ((ThreadPoolExecutor) c0207a0.f2889a).execute(b2);
    }

    public final c e() {
        int i2;
        synchronized (this) {
            i2 = this.f3400b;
            this.f3400b = i2 + 1;
        }
        return new c(this, V.d("Q", i2));
    }
}
