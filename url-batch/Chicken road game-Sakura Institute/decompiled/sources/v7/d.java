package v7;

import a0.m;
import androidx.room.o;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import l1.x;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final d f9171h;

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f9172i;

    /* renamed from: a, reason: collision with root package name */
    public final x f9173a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9175c;

    /* renamed from: d, reason: collision with root package name */
    public long f9176d;

    /* renamed from: b, reason: collision with root package name */
    public int f9174b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9177e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f9178f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final o f9179g = new o(10, this);

    static {
        String str = t7.b.f8938g + " TaskRunner";
        k.f(str, "name");
        f9171h = new d(new x(new t7.a(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        k.e(logger, "getLogger(TaskRunner::class.java.name)");
        f9172i = logger;
    }

    public d(x xVar) {
        this.f9173a = xVar;
    }

    public static final void a(d dVar, a aVar) {
        byte[] bArr = t7.b.f8932a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f9159a);
        try {
            long a3 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a3);
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

    public final void b(a aVar, long j8) {
        byte[] bArr = t7.b.f8932a;
        c cVar = aVar.f9161c;
        k.c(cVar);
        if (cVar.f9168d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z8 = cVar.f9170f;
        cVar.f9170f = false;
        cVar.f9168d = null;
        this.f9177e.remove(cVar);
        if (j8 != -1 && !z8 && !cVar.f9167c) {
            cVar.d(aVar, j8, true);
        }
        if (cVar.f9169e.isEmpty()) {
            return;
        }
        this.f9178f.add(cVar);
    }

    public final a c() {
        long j8;
        a aVar;
        boolean z8;
        byte[] bArr = t7.b.f8932a;
        while (true) {
            ArrayList arrayList = this.f9178f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j9 = Long.MAX_VALUE;
            int i7 = 0;
            a aVar2 = null;
            while (true) {
                if (i7 >= size) {
                    j8 = nanoTime;
                    aVar = null;
                    z8 = false;
                    break;
                }
                Object obj = arrayList.get(i7);
                i7++;
                a aVar3 = (a) ((c) obj).f9169e.get(0);
                j8 = nanoTime;
                aVar = null;
                long max = Math.max(0L, aVar3.f9162d - j8);
                if (max > 0) {
                    j9 = Math.min(max, j9);
                } else {
                    if (aVar2 != null) {
                        z8 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                nanoTime = j8;
            }
            ArrayList arrayList2 = this.f9177e;
            if (aVar2 != null) {
                byte[] bArr2 = t7.b.f8932a;
                aVar2.f9162d = -1L;
                c cVar = aVar2.f9161c;
                k.c(cVar);
                cVar.f9169e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f9168d = aVar2;
                arrayList2.add(cVar);
                if (z8 || (!this.f9175c && !arrayList.isEmpty())) {
                    o oVar = this.f9179g;
                    k.f(oVar, "runnable");
                    ((ThreadPoolExecutor) this.f9173a.f5847g).execute(oVar);
                }
                return aVar2;
            }
            if (this.f9175c) {
                if (j9 >= this.f9176d - j8) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f9175c = true;
            this.f9176d = j8 + j9;
            try {
                try {
                    long j10 = j9 / 1000000;
                    long j11 = j9 - (1000000 * j10);
                    if (j10 > 0 || j9 > 0) {
                        wait(j10, (int) j11);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((c) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        c cVar2 = (c) arrayList.get(size3);
                        cVar2.b();
                        if (cVar2.f9169e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.f9175c = false;
            }
        }
    }

    public final void d(c cVar) {
        k.f(cVar, "taskQueue");
        byte[] bArr = t7.b.f8932a;
        if (cVar.f9168d == null) {
            boolean isEmpty = cVar.f9169e.isEmpty();
            ArrayList arrayList = this.f9178f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                k.f(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        if (this.f9175c) {
            notify();
            return;
        }
        o oVar = this.f9179g;
        k.f(oVar, "runnable");
        ((ThreadPoolExecutor) this.f9173a.f5847g).execute(oVar);
    }

    public final c e() {
        int i7;
        synchronized (this) {
            i7 = this.f9174b;
            this.f9174b = i7 + 1;
        }
        return new c(this, m.i("Q", i7));
    }
}
