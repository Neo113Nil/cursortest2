package O5;

import D3.A;
import H5.AbstractC0165z;
import M5.r;
import M5.v;
import N.p;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class b implements Executor, Closeable {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1803m = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1804n = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1805o = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: p, reason: collision with root package name */
    public static final v f1806p = new v("NOT_IN_STACK", 0);
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: f, reason: collision with root package name */
    public final int f1807f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1808g;

    /* renamed from: h, reason: collision with root package name */
    public final long f1809h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1810i;

    /* renamed from: j, reason: collision with root package name */
    public final e f1811j;

    /* renamed from: k, reason: collision with root package name */
    public final e f1812k;

    /* renamed from: l, reason: collision with root package name */
    public final r f1813l;
    private volatile long parkedWorkersStack;

    public b(int i7, int i8, long j4, String str) {
        this.f1807f = i7;
        this.f1808g = i8;
        this.f1809h = j4;
        this.f1810i = str;
        if (i7 < 1) {
            throw new IllegalArgumentException(C1.c.g("Core pool size ", i7, " should be at least 1").toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(C1.c.f(i8, i7, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i8 > 2097150) {
            throw new IllegalArgumentException(C1.c.g("Max pool size ", i8, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j4 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
        this.f1811j = new e();
        this.f1812k = new e();
        this.f1813l = new r((i7 + 1) * 2);
        this.controlState = i7 << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void e(b bVar, Runnable runnable, int i7) {
        bVar.d(runnable, j.f1828g, (i7 & 4) == 0);
    }

    public final int a() {
        synchronized (this.f1813l) {
            try {
                if (f1805o.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f1804n;
                long j4 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j4 & 2097151);
                int i8 = i7 - ((int) ((j4 & 4398044413952L) >> 21));
                if (i8 < 0) {
                    i8 = 0;
                }
                if (i8 >= this.f1807f) {
                    return 0;
                }
                if (i7 >= this.f1808g) {
                    return 0;
                }
                int i9 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i9 <= 0 || this.f1813l.b(i9) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i9);
                this.f1813l.c(i9, aVar);
                if (i9 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i10 = i8 + 1;
                aVar.start();
                return i10;
            } catch (Throwable th) {
                throw th;
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
        int i7;
        h hVar;
        if (f1805o.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !kotlin.jvm.internal.i.a(aVar.f1802m, this)) {
                aVar = null;
            }
            synchronized (this.f1813l) {
                i7 = (int) (f1804n.get(this) & 2097151);
            }
            if (1 <= i7) {
                int i8 = 1;
                while (true) {
                    Object b7 = this.f1813l.b(i8);
                    kotlin.jvm.internal.i.b(b7);
                    a aVar2 = (a) b7;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        l lVar = aVar2.f1795f;
                        e eVar = this.f1812k;
                        lVar.getClass();
                        h hVar2 = (h) l.f1831b.getAndSet(lVar, null);
                        if (hVar2 != null) {
                            eVar.a(hVar2);
                        }
                        while (true) {
                            h b8 = lVar.b();
                            if (b8 == null) {
                                break;
                            } else {
                                eVar.a(b8);
                            }
                        }
                    }
                    if (i8 == i7) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.f1812k.b();
            this.f1811j.b();
            while (true) {
                if (aVar != null) {
                    hVar = aVar.a(true);
                }
                hVar = (h) this.f1811j.d();
                if (hVar == null && (hVar = (h) this.f1812k.d()) == null) {
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
            f1803m.set(this, 0L);
            f1804n.set(this, 0L);
        }
    }

    public final void d(Runnable runnable, A a7, boolean z5) {
        h iVar;
        int i7;
        j.f1827f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f1819f = nanoTime;
            iVar.f1820g = a7;
        } else {
            iVar = new i(runnable, nanoTime, a7);
        }
        boolean z6 = false;
        boolean z7 = iVar.f1820g.f384a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1804n;
        long addAndGet = z7 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !kotlin.jvm.internal.i.a(aVar.f1802m, this)) {
            aVar = null;
        }
        if (aVar != null && (i7 = aVar.f1797h) != 5 && (iVar.f1820g.f384a != 0 || i7 != 2)) {
            aVar.f1801l = true;
            l lVar = aVar.f1795f;
            if (z5) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                h hVar = (h) l.f1831b.getAndSet(lVar, iVar);
                iVar = hVar == null ? null : lVar.a(hVar);
            }
        }
        if (iVar != null) {
            if (!(iVar.f1820g.f384a == 1 ? this.f1812k.a(iVar) : this.f1811j.a(iVar))) {
                throw new RejectedExecutionException(p.b(new StringBuilder(), this.f1810i, " was terminated"));
            }
        }
        if (z5 && aVar != null) {
            z6 = true;
        }
        if (z7) {
            if (z6 || m() || h(addAndGet)) {
                return;
            }
            m();
            return;
        }
        if (z6 || m() || h(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, 6);
    }

    public final void g(a aVar, int i7, int i8) {
        while (true) {
            long j4 = f1803m.get(this);
            int i9 = (int) (2097151 & j4);
            long j7 = (2097152 + j4) & (-2097152);
            if (i9 == i7) {
                if (i8 == 0) {
                    Object c7 = aVar.c();
                    while (true) {
                        if (c7 == f1806p) {
                            i9 = -1;
                            break;
                        }
                        if (c7 == null) {
                            i9 = 0;
                            break;
                        }
                        a aVar2 = (a) c7;
                        int b7 = aVar2.b();
                        if (b7 != 0) {
                            i9 = b7;
                            break;
                        }
                        c7 = aVar2.c();
                    }
                } else {
                    i9 = i8;
                }
            }
            if (i9 >= 0) {
                if (f1803m.compareAndSet(this, j4, i9 | j7)) {
                    return;
                }
            }
        }
    }

    public final boolean h(long j4) {
        int i7 = ((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21));
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = this.f1807f;
        if (i7 < i8) {
            int a7 = a();
            if (a7 == 1 && i8 > 1) {
                a();
            }
            if (a7 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        v vVar;
        int i7;
        while (true) {
            long j4 = f1803m.get(this);
            a aVar = (a) this.f1813l.b((int) (2097151 & j4));
            if (aVar == null) {
                aVar = null;
            } else {
                long j7 = (2097152 + j4) & (-2097152);
                Object c7 = aVar.c();
                while (true) {
                    vVar = f1806p;
                    if (c7 == vVar) {
                        i7 = -1;
                        break;
                    }
                    if (c7 == null) {
                        i7 = 0;
                        break;
                    }
                    a aVar2 = (a) c7;
                    i7 = aVar2.b();
                    if (i7 != 0) {
                        break;
                    }
                    c7 = aVar2.c();
                }
                if (i7 >= 0) {
                    if (f1803m.compareAndSet(this, j4, i7 | j7)) {
                        aVar.g(vVar);
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
            if (a.f1794n.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        r rVar = this.f1813l;
        int a7 = rVar.a();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 1; i12 < a7; i12++) {
            a aVar = (a) rVar.b(i12);
            if (aVar != null) {
                l lVar = aVar.f1795f;
                lVar.getClass();
                int i13 = l.f1831b.get(lVar) != null ? (l.f1832c.get(lVar) - l.f1833d.get(lVar)) + 1 : l.f1832c.get(lVar) - l.f1833d.get(lVar);
                int c7 = p.c(aVar.f1797h);
                if (c7 == 0) {
                    i7++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i13);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (c7 == 1) {
                    i8++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i13);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (c7 == 2) {
                    i9++;
                } else if (c7 == 3) {
                    i10++;
                    if (i13 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i13);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (c7 == 4) {
                    i11++;
                }
            }
        }
        long j4 = f1804n.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f1810i);
        sb4.append('@');
        sb4.append(AbstractC0165z.g(this));
        sb4.append("[Pool Size {core = ");
        int i14 = this.f1807f;
        sb4.append(i14);
        sb4.append(", max = ");
        sb4.append(this.f1808g);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i7);
        sb4.append(", blocking = ");
        sb4.append(i8);
        sb4.append(", parked = ");
        sb4.append(i9);
        sb4.append(", dormant = ");
        sb4.append(i10);
        sb4.append(", terminated = ");
        sb4.append(i11);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f1811j.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f1812k.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j4));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j4) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i14 - ((int) ((j4 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
