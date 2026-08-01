package v1;

import N0.B;
import Z.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import m.C0202a0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final d f3967h;
    public static final Logger i;

    /* renamed from: a, reason: collision with root package name */
    public final C0202a0 f3968a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3970c;
    public long d;

    /* renamed from: b, reason: collision with root package name */
    public int f3969b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3971e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3972f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final B f3973g = new B(13, this);

    static {
        String str = t1.b.f3903g + " TaskRunner";
        h1.d.e(str, "name");
        f3967h = new d(new C0202a0(new t1.a(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        h1.d.d(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public d(C0202a0 c0202a0) {
        this.f3968a = c0202a0;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = t1.b.f3898a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f3957a);
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
        byte[] bArr = t1.b.f3898a;
        c cVar = aVar.f3959c;
        h1.d.b(cVar);
        if (cVar.d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = cVar.f3966f;
        cVar.f3966f = false;
        cVar.d = null;
        this.f3971e.remove(cVar);
        if (j2 != -1 && !z2 && !cVar.f3964c) {
            cVar.d(aVar, j2, true);
        }
        if (cVar.f3965e.isEmpty()) {
            return;
        }
        this.f3972f.add(cVar);
    }

    public final a c() {
        boolean z2;
        d dVar = this;
        byte[] bArr = t1.b.f3898a;
        while (true) {
            ArrayList arrayList = dVar.f3972f;
            if (arrayList.isEmpty()) {
                return null;
            }
            C0202a0 c0202a0 = dVar.f3968a;
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
                a aVar2 = (a) ((c) it.next()).f3965e.get(0);
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
            ArrayList arrayList2 = dVar.f3971e;
            if (aVar != null) {
                byte[] bArr2 = t1.b.f3898a;
                aVar.d = -1L;
                c cVar = aVar.f3959c;
                h1.d.b(cVar);
                cVar.f3965e.remove(aVar);
                arrayList.remove(cVar);
                cVar.d = aVar;
                arrayList2.add(cVar);
                if (z2 || (!dVar.f3970c && !arrayList.isEmpty())) {
                    B b2 = dVar.f3973g;
                    h1.d.e(b2, "runnable");
                    ((ThreadPoolExecutor) c0202a0.f3068a).execute(b2);
                }
                return aVar;
            }
            if (dVar.f3970c) {
                if (j2 < dVar.d - nanoTime) {
                    notify();
                }
                return null;
            }
            dVar.f3970c = true;
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
                        if (cVar2.f3965e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i2 = -1;
                    }
                }
            } finally {
                dVar.f3970c = false;
            }
        }
    }

    public final void d(c cVar) {
        h1.d.e(cVar, "taskQueue");
        byte[] bArr = t1.b.f3898a;
        if (cVar.d == null) {
            boolean isEmpty = cVar.f3965e.isEmpty();
            ArrayList arrayList = this.f3972f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                h1.d.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        boolean z2 = this.f3970c;
        C0202a0 c0202a0 = this.f3968a;
        if (z2) {
            notify();
            return;
        }
        B b2 = this.f3973g;
        h1.d.e(b2, "runnable");
        ((ThreadPoolExecutor) c0202a0.f3068a).execute(b2);
    }

    public final c e() {
        int i2;
        synchronized (this) {
            i2 = this.f3969b;
            this.f3969b = i2 + 1;
        }
        return new c(this, V.e("Q", i2));
    }
}
