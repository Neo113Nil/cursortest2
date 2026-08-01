package w3;

import androidx.fragment.app.g;
import i3.d;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c {
    public static final c h;
    public static final Logger i;

    /* renamed from: a, reason: collision with root package name */
    public final q3.a f3830a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3832c;
    public long d;

    /* renamed from: b, reason: collision with root package name */
    public int f3831b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3833e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3834f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final g f3835g = new g(12, this);

    static {
        String str = u3.b.f3586g + " TaskRunner";
        d.e(str, "name");
        h = new c(new q3.a(new u3.a(str, true)));
        Logger logger = Logger.getLogger(c.class.getName());
        d.d(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public c(q3.a aVar) {
        this.f3830a = aVar;
    }

    public static final void a(c cVar, a aVar) {
        byte[] bArr = u3.b.f3581a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f3822a);
        try {
            long a5 = aVar.a();
            synchronized (cVar) {
                cVar.b(aVar, a5);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (cVar) {
                cVar.b(aVar, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j2) {
        byte[] bArr = u3.b.f3581a;
        b bVar = aVar.f3824c;
        d.b(bVar);
        if (bVar.d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z4 = bVar.f3829f;
        bVar.f3829f = false;
        bVar.d = null;
        this.f3833e.remove(bVar);
        if (j2 != -1 && !z4 && !bVar.f3827c) {
            bVar.d(aVar, j2, true);
        }
        if (bVar.f3828e.isEmpty()) {
            return;
        }
        this.f3834f.add(bVar);
    }

    public final a c() {
        long j2;
        a aVar;
        boolean z4;
        byte[] bArr = u3.b.f3581a;
        while (true) {
            ArrayList arrayList = this.f3834f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j4 = Long.MAX_VALUE;
            int i4 = 0;
            a aVar2 = null;
            while (true) {
                if (i4 >= size) {
                    j2 = nanoTime;
                    aVar = null;
                    z4 = false;
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                a aVar3 = (a) ((b) obj).f3828e.get(0);
                j2 = nanoTime;
                aVar = null;
                long max = Math.max(0L, aVar3.d - j2);
                if (max > 0) {
                    j4 = Math.min(max, j4);
                } else {
                    if (aVar2 != null) {
                        z4 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                nanoTime = j2;
            }
            ArrayList arrayList2 = this.f3833e;
            if (aVar2 != null) {
                byte[] bArr2 = u3.b.f3581a;
                aVar2.d = -1L;
                b bVar = aVar2.f3824c;
                d.b(bVar);
                bVar.f3828e.remove(aVar2);
                arrayList.remove(bVar);
                bVar.d = aVar2;
                arrayList2.add(bVar);
                if (z4 || (!this.f3832c && !arrayList.isEmpty())) {
                    g gVar = this.f3835g;
                    d.e(gVar, "runnable");
                    ((ThreadPoolExecutor) this.f3830a.f3172a).execute(gVar);
                }
                return aVar2;
            }
            if (this.f3832c) {
                if (j4 >= this.d - j2) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f3832c = true;
            this.d = j2 + j4;
            try {
                try {
                    long j5 = j4 / 1000000;
                    long j6 = j4 - (1000000 * j5);
                    if (j5 > 0 || j4 > 0) {
                        wait(j5, (int) j6);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((b) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        b bVar2 = (b) arrayList.get(size3);
                        bVar2.b();
                        if (bVar2.f3828e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.f3832c = false;
            }
        }
    }

    public final void d(b bVar) {
        d.e(bVar, "taskQueue");
        byte[] bArr = u3.b.f3581a;
        if (bVar.d == null) {
            boolean isEmpty = bVar.f3828e.isEmpty();
            ArrayList arrayList = this.f3834f;
            if (isEmpty) {
                arrayList.remove(bVar);
            } else {
                d.e(arrayList, "<this>");
                if (!arrayList.contains(bVar)) {
                    arrayList.add(bVar);
                }
            }
        }
        if (this.f3832c) {
            notify();
            return;
        }
        g gVar = this.f3835g;
        d.e(gVar, "runnable");
        ((ThreadPoolExecutor) this.f3830a.f3172a).execute(gVar);
    }

    public final b e() {
        int i4;
        synchronized (this) {
            i4 = this.f3831b;
            this.f3831b = i4 + 1;
        }
        return new b(this, a4.b.f("Q", i4));
    }
}
