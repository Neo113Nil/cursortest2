package d1;

import B0.E;
import W0.AbstractC0081v;
import b1.t;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class b implements Executor, Closeable {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1818l = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1819m = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1820n = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: o, reason: collision with root package name */
    public static final E f1821o = new E(14, "NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: e, reason: collision with root package name */
    public final int f1822e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1823f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1824g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1825h;

    /* renamed from: i, reason: collision with root package name */
    public final e f1826i;

    /* renamed from: j, reason: collision with root package name */
    public final e f1827j;

    /* renamed from: k, reason: collision with root package name */
    public final t f1828k;
    private volatile long parkedWorkersStack;

    public b(int i2, int i3, long j2, String str) {
        this.f1822e = i2;
        this.f1823f = i3;
        this.f1824g = j2;
        this.f1825h = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(L.d.f("Max pool size ", i3, " should be greater than or equals to core pool size ", i2).toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f1826i = new e();
        this.f1827j = new e();
        this.f1828k = new t((i2 + 1) * 2);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        synchronized (this.f1828k) {
            try {
                if (f1820n.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f1819m;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f1822e) {
                    return 0;
                }
                if (i2 >= this.f1823f) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.f1828k.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i4);
                this.f1828k.c(i4, aVar);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = i3 + 1;
                aVar.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, i iVar) {
        h jVar;
        int i2;
        k.f1843f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            jVar = (h) runnable;
            jVar.f1834e = nanoTime;
            jVar.f1835f = iVar;
        } else {
            jVar = new j(runnable, nanoTime, iVar);
        }
        boolean z2 = jVar.f1835f.f1836a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1819m;
        long addAndGet = z2 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !P0.h.a(aVar.f1817l, this)) {
            aVar = null;
        }
        if (aVar != null && (i2 = aVar.f1812g) != 5 && (jVar.f1835f.f1836a != 0 || i2 != 2)) {
            aVar.f1816k = true;
            m mVar = aVar.f1810e;
            mVar.getClass();
            jVar = (h) m.f1847b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.f1851a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f1848c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.f1849d.get(mVar) != 127) {
                    if (jVar.f1835f.f1836a == 1) {
                        m.f1850e.incrementAndGet(mVar);
                    }
                    int i3 = atomicIntegerFieldUpdater.get(mVar) & 127;
                    while (atomicReferenceArray.get(i3) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i3, jVar);
                    atomicIntegerFieldUpdater.incrementAndGet(mVar);
                    jVar = null;
                }
            }
        }
        if (jVar != null) {
            if (!(jVar.f1835f.f1836a == 1 ? this.f1827j.a(jVar) : this.f1826i.a(jVar))) {
                throw new RejectedExecutionException(this.f1825h + " was terminated");
            }
        }
        if (z2) {
            if (e() || d(addAndGet)) {
                return;
            }
            e();
            return;
        }
        if (e() || d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        e();
    }

    public final void c(a aVar, int i2, int i3) {
        while (true) {
            long j2 = f1818l.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object c2 = aVar.c();
                    while (true) {
                        if (c2 == f1821o) {
                            i4 = -1;
                            break;
                        }
                        if (c2 == null) {
                            i4 = 0;
                            break;
                        }
                        a aVar2 = (a) c2;
                        int b2 = aVar2.b();
                        if (b2 != 0) {
                            i4 = b2;
                            break;
                        }
                        c2 = aVar2.c();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                if (f1818l.compareAndSet(this, j2, i4 | j3)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i2;
        h hVar;
        if (f1820n.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !P0.h.a(aVar.f1817l, this)) {
                aVar = null;
            }
            synchronized (this.f1828k) {
                i2 = (int) (f1819m.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    Object b2 = this.f1828k.b(i3);
                    P0.h.b(b2);
                    a aVar2 = (a) b2;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f1810e;
                        e eVar = this.f1827j;
                        mVar.getClass();
                        h hVar2 = (h) m.f1847b.getAndSet(mVar, null);
                        if (hVar2 != null) {
                            eVar.a(hVar2);
                        }
                        while (true) {
                            h a2 = mVar.a();
                            if (a2 == null) {
                                break;
                            } else {
                                eVar.a(a2);
                            }
                        }
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f1827j.b();
            this.f1826i.b();
            while (true) {
                if (aVar != null) {
                    hVar = aVar.a(true);
                }
                hVar = (h) this.f1826i.d();
                if (hVar == null && (hVar = (h) this.f1827j.d()) == null) {
                    break;
                }
                try {
                    hVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(5);
            }
            f1818l.set(this, 0L);
            f1819m.set(this, 0L);
        }
    }

    public final boolean d(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f1822e;
        if (i2 < i3) {
            int a2 = a();
            if (a2 == 1 && i3 > 1) {
                a();
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        E e2;
        int i2;
        while (true) {
            long j2 = f1818l.get(this);
            a aVar = (a) this.f1828k.b((int) (2097151 & j2));
            if (aVar == null) {
                aVar = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object c2 = aVar.c();
                while (true) {
                    e2 = f1821o;
                    if (c2 == e2) {
                        i2 = -1;
                        break;
                    }
                    if (c2 == null) {
                        i2 = 0;
                        break;
                    }
                    a aVar2 = (a) c2;
                    i2 = aVar2.b();
                    if (i2 != 0) {
                        break;
                    }
                    c2 = aVar2.c();
                }
                if (i2 >= 0) {
                    if (f1818l.compareAndSet(this, j2, i2 | j3)) {
                        aVar.g(e2);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f1809m.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, k.f1844g);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        t tVar = this.f1828k;
        int a2 = tVar.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a2; i7++) {
            a aVar = (a) tVar.b(i7);
            if (aVar != null) {
                m mVar = aVar.f1810e;
                mVar.getClass();
                int i8 = m.f1847b.get(mVar) != null ? (m.f1848c.get(mVar) - m.f1849d.get(mVar)) + 1 : m.f1848c.get(mVar) - m.f1849d.get(mVar);
                int a3 = H.j.a(aVar.f1812g);
                if (a3 == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (a3 == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i8);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (a3 == 2) {
                    i4++;
                } else if (a3 == 3) {
                    i5++;
                    if (i8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (a3 == 4) {
                    i6++;
                }
            }
        }
        long j2 = f1819m.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f1825h);
        sb4.append('@');
        sb4.append(AbstractC0081v.b(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.f1822e;
        sb4.append(i9);
        sb4.append(", max = ");
        sb4.append(this.f1823f);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i4);
        sb4.append(", dormant = ");
        sb4.append(i5);
        sb4.append(", terminated = ");
        sb4.append(i6);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f1826i.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f1827j.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
