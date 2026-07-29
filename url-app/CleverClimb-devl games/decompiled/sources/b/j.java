package b;

import b.a.b.g;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ConnectionPool.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f2094c = !j.class.desiredAssertionStatus();

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f2095d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), b.a.c.a("OkHttp ConnectionPool", true));

    /* renamed from: a, reason: collision with root package name */
    final b.a.b.d f2096a;

    /* renamed from: b, reason: collision with root package name */
    boolean f2097b;
    private final int e;
    private final long f;
    private final Runnable g;
    private final Deque<b.a.b.c> h;

    public j() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public j(int i, long j, TimeUnit timeUnit) {
        this.g = new Runnable() { // from class: b.j.1
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    long a2 = j.this.a(System.nanoTime());
                    if (a2 == -1) {
                        return;
                    }
                    if (a2 > 0) {
                        long j2 = a2 / 1000000;
                        long j3 = a2 - (1000000 * j2);
                        synchronized (j.this) {
                            try {
                                j.this.wait(j2, (int) j3);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            }
        };
        this.h = new ArrayDeque();
        this.f2096a = new b.a.b.d();
        this.e = i;
        this.f = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
    }

    b.a.b.c a(a aVar, b.a.b.g gVar, ae aeVar) {
        if (!f2094c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (b.a.b.c cVar : this.h) {
            if (cVar.a(aVar, aeVar)) {
                gVar.a(cVar);
                return cVar;
            }
        }
        return null;
    }

    Socket a(a aVar, b.a.b.g gVar) {
        if (!f2094c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (b.a.b.c cVar : this.h) {
            if (cVar.a(aVar, (ae) null) && cVar.e() && cVar != gVar.b()) {
                return gVar.b(cVar);
            }
        }
        return null;
    }

    void a(b.a.b.c cVar) {
        if (!f2094c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.f2097b) {
            this.f2097b = true;
            f2095d.execute(this.g);
        }
        this.h.add(cVar);
    }

    boolean b(b.a.b.c cVar) {
        if (!f2094c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (cVar.f1837a || this.e == 0) {
            this.h.remove(cVar);
            return true;
        }
        notifyAll();
        return false;
    }

    long a(long j) {
        synchronized (this) {
            long j2 = Long.MIN_VALUE;
            b.a.b.c cVar = null;
            int i = 0;
            int i2 = 0;
            for (b.a.b.c cVar2 : this.h) {
                if (a(cVar2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - cVar2.e;
                    if (j3 > j2) {
                        cVar = cVar2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f && i <= this.e) {
                if (i > 0) {
                    return this.f - j2;
                }
                if (i2 > 0) {
                    return this.f;
                }
                this.f2097b = false;
                return -1L;
            }
            this.h.remove(cVar);
            b.a.c.a(cVar.c());
            return 0L;
        }
    }

    private int a(b.a.b.c cVar, long j) {
        List<Reference<b.a.b.g>> list = cVar.f1840d;
        int i = 0;
        while (i < list.size()) {
            Reference<b.a.b.g> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                b.a.g.e.b().a("A connection to " + cVar.a().a().a() + " was leaked. Did you forget to close a response body?", ((g.a) reference).f1852a);
                list.remove(i);
                cVar.f1837a = true;
                if (list.isEmpty()) {
                    cVar.e = j - this.f;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
