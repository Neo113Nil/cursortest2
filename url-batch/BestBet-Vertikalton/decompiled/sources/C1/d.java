package C1;

import C0.i;
import G1.AbstractC0001b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import k1.e;

/* loaded from: classes.dex */
public final class d {
    public static final d h;
    public static final Logger i;

    /* renamed from: a, reason: collision with root package name */
    public final A0.c f118a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f120c;
    public long d;

    /* renamed from: b, reason: collision with root package name */
    public int f119b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f121e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f122f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final i f123g = new i(1, this);

    static {
        String str = A1.c.f18g + " TaskRunner";
        e.e(str, "name");
        h = new d(new A0.c(new A1.b(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        e.d(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public d(A0.c cVar) {
        this.f118a = cVar;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = A1.c.f13a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f108a);
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
        byte[] bArr = A1.c.f13a;
        c cVar = aVar.f110c;
        e.b(cVar);
        if (cVar.d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = cVar.f117f;
        cVar.f117f = false;
        cVar.d = null;
        this.f121e.remove(cVar);
        if (j2 != -1 && !z2 && !cVar.f115c) {
            cVar.d(aVar, j2, true);
        }
        if (cVar.f116e.isEmpty()) {
            return;
        }
        this.f122f.add(cVar);
    }

    public final a c() {
        boolean z2;
        d dVar = this;
        byte[] bArr = A1.c.f13a;
        while (true) {
            ArrayList arrayList = dVar.f122f;
            if (arrayList.isEmpty()) {
                return null;
            }
            A0.c cVar = dVar.f118a;
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
                a aVar2 = (a) ((c) it.next()).f116e.get(0);
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
            ArrayList arrayList2 = dVar.f121e;
            if (aVar != null) {
                byte[] bArr2 = A1.c.f13a;
                aVar.d = -1L;
                c cVar2 = aVar.f110c;
                e.b(cVar2);
                cVar2.f116e.remove(aVar);
                arrayList.remove(cVar2);
                cVar2.d = aVar;
                arrayList2.add(cVar2);
                if (z2 || (!dVar.f120c && !arrayList.isEmpty())) {
                    i iVar = dVar.f123g;
                    e.e(iVar, "runnable");
                    ((ThreadPoolExecutor) cVar.f6b).execute(iVar);
                }
                return aVar;
            }
            if (dVar.f120c) {
                if (j2 < dVar.d - nanoTime) {
                    notify();
                }
                return null;
            }
            dVar.f120c = true;
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
                        c cVar3 = (c) arrayList.get(size2);
                        cVar3.b();
                        if (cVar3.f116e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i2 = -1;
                    }
                }
            } finally {
                dVar.f120c = false;
            }
        }
    }

    public final void d(c cVar) {
        e.e(cVar, "taskQueue");
        byte[] bArr = A1.c.f13a;
        if (cVar.d == null) {
            boolean isEmpty = cVar.f116e.isEmpty();
            ArrayList arrayList = this.f122f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                e.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        boolean z2 = this.f120c;
        A0.c cVar2 = this.f118a;
        if (z2) {
            notify();
            return;
        }
        i iVar = this.f123g;
        e.e(iVar, "runnable");
        ((ThreadPoolExecutor) cVar2.f6b).execute(iVar);
    }

    public final c e() {
        int i2;
        synchronized (this) {
            i2 = this.f119b;
            this.f119b = i2 + 1;
        }
        return new c(this, AbstractC0001b.f("Q", i2));
    }
}
