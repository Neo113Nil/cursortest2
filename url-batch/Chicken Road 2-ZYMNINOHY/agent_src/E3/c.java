package E3;

import C3.r;
import C3.v;
import E.AbstractC0005f;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import x3.AbstractC1562w;

/* loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f698h = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f699i = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f700j = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final v f701k = new v("NOT_IN_STACK", 0);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f702a;

    /* renamed from: b, reason: collision with root package name */
    public final int f703b;

    /* renamed from: c, reason: collision with root package name */
    public final long f704c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final String f705d;

    /* renamed from: e, reason: collision with root package name */
    public final f f706e;

    /* renamed from: f, reason: collision with root package name */
    public final f f707f;

    /* renamed from: g, reason: collision with root package name */
    public final r f708g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i4, int i5, long j4, String str) {
        this.f702a = i4;
        this.f703b = i5;
        this.f704c = j4;
        this.f705d = str;
        if (i4 < 1) {
            throw new IllegalArgumentException(AbstractC0005f.k(i4, "Core pool size ", " should be at least 1").toString());
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(AbstractC0005f.i(i5, i4, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i5 > 2097150) {
            throw new IllegalArgumentException(AbstractC0005f.k(i5, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j4 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
        this.f706e = new f();
        this.f707f = new f();
        this.f708g = new r((i4 + 1) * 2);
        this.controlState$volatile = i4 << 42;
        this._isTerminated$volatile = 0;
    }

    public final int a() {
        synchronized (this.f708g) {
            try {
                if (f700j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f699i;
                long j4 = atomicLongFieldUpdater.get(this);
                int i4 = (int) (j4 & 2097151);
                int i5 = i4 - ((int) ((j4 & 4398044413952L) >> 21));
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i5 >= this.f702a) {
                    return 0;
                }
                if (i4 >= this.f703b) {
                    return 0;
                }
                int i6 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i6 <= 0 || this.f708g.b(i6) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i6);
                this.f708g.c(i6, aVar);
                if (i6 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i7 = i5 + 1;
                aVar.start();
                return i7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, j jVar) {
        i kVar;
        b bVar;
        l.f723f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            kVar = (i) runnable;
            kVar.f714a = nanoTime;
            kVar.f715b = jVar;
        } else {
            kVar = new k(runnable, nanoTime, jVar);
        }
        boolean z = kVar.f715b.f716a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f699i;
        long addAndGet = z ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !kotlin.jvm.internal.i.a(aVar.f691h, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f686c) != b.f696e && (kVar.f715b.f716a != 0 || bVar != b.f693b)) {
            aVar.f690g = true;
            n nVar = aVar.f684a;
            nVar.getClass();
            kVar = (i) n.f727b.getAndSet(nVar, kVar);
            if (kVar == null) {
                kVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = nVar.f731a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n.f728c;
                if (atomicIntegerFieldUpdater.get(nVar) - n.f729d.get(nVar) != 127) {
                    if (kVar.f715b.f716a == 1) {
                        n.f730e.incrementAndGet(nVar);
                    }
                    int i4 = atomicIntegerFieldUpdater.get(nVar) & 127;
                    while (atomicReferenceArray.get(i4) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i4, kVar);
                    atomicIntegerFieldUpdater.incrementAndGet(nVar);
                    kVar = null;
                }
            }
        }
        if (kVar != null) {
            if (!(kVar.f715b.f716a == 1 ? this.f707f.a(kVar) : this.f706e.a(kVar))) {
                throw new RejectedExecutionException(AbstractC0005f.q(new StringBuilder(), this.f705d, " was terminated"));
            }
        }
        if (z) {
            if (k() || f(addAndGet)) {
                return;
            }
            k();
            return;
        }
        if (k() || f(atomicLongFieldUpdater.get(this))) {
            return;
        }
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i4;
        i iVar;
        if (f700j.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !kotlin.jvm.internal.i.a(aVar.f691h, this)) {
                aVar = null;
            }
            synchronized (this.f708g) {
                i4 = (int) (f699i.get(this) & 2097151);
            }
            if (1 <= i4) {
                int i5 = 1;
                while (true) {
                    Object b4 = this.f708g.b(i5);
                    kotlin.jvm.internal.i.b(b4);
                    a aVar2 = (a) b4;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        n nVar = aVar2.f684a;
                        f fVar = this.f707f;
                        nVar.getClass();
                        i iVar2 = (i) n.f727b.getAndSet(nVar, null);
                        if (iVar2 != null) {
                            fVar.a(iVar2);
                        }
                        while (true) {
                            i a3 = nVar.a();
                            if (a3 == null) {
                                break;
                            } else {
                                fVar.a(a3);
                            }
                        }
                    }
                    if (i5 == i4) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f707f.b();
            this.f706e.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.f706e.d();
                if (iVar == null && (iVar = (i) this.f707f.d()) == null) {
                    break;
                }
                try {
                    iVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(b.f696e);
            }
            f698h.set(this, 0L);
            f699i.set(this, 0L);
        }
    }

    public final void e(a aVar, int i4, int i5) {
        while (true) {
            long j4 = f698h.get(this);
            int i6 = (int) (2097151 & j4);
            long j5 = (2097152 + j4) & (-2097152);
            if (i6 == i4) {
                if (i5 == 0) {
                    Object c4 = aVar.c();
                    while (true) {
                        if (c4 == f701k) {
                            i6 = -1;
                            break;
                        }
                        if (c4 == null) {
                            i6 = 0;
                            break;
                        }
                        a aVar2 = (a) c4;
                        int b4 = aVar2.b();
                        if (b4 != 0) {
                            i6 = b4;
                            break;
                        }
                        c4 = aVar2.c();
                    }
                } else {
                    i6 = i5;
                }
            }
            if (i6 >= 0) {
                if (f698h.compareAndSet(this, j4, i6 | j5)) {
                    return;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, l.f724g);
    }

    public final boolean f(long j4) {
        int i4 = ((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21));
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = this.f702a;
        if (i4 < i5) {
            int a3 = a();
            if (a3 == 1 && i5 > 1) {
                a();
            }
            if (a3 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        v vVar;
        int i4;
        while (true) {
            long j4 = f698h.get(this);
            a aVar = (a) this.f708g.b((int) (2097151 & j4));
            if (aVar == null) {
                aVar = null;
            } else {
                long j5 = (2097152 + j4) & (-2097152);
                Object c4 = aVar.c();
                while (true) {
                    vVar = f701k;
                    if (c4 == vVar) {
                        i4 = -1;
                        break;
                    }
                    if (c4 == null) {
                        i4 = 0;
                        break;
                    }
                    a aVar2 = (a) c4;
                    i4 = aVar2.b();
                    if (i4 != 0) {
                        break;
                    }
                    c4 = aVar2.c();
                }
                if (i4 >= 0) {
                    if (f698h.compareAndSet(this, j4, i4 | j5)) {
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
            if (a.f683i.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        r rVar = this.f708g;
        int a3 = rVar.a();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < a3; i9++) {
            a aVar = (a) rVar.b(i9);
            if (aVar != null) {
                n nVar = aVar.f684a;
                nVar.getClass();
                int i10 = n.f727b.get(nVar) != null ? (n.f728c.get(nVar) - n.f729d.get(nVar)) + 1 : n.f728c.get(nVar) - n.f729d.get(nVar);
                int ordinal = aVar.f686c.ordinal();
                if (ordinal == 0) {
                    i4++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i10);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i5++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i6++;
                } else if (ordinal == 3) {
                    i7++;
                    if (i10 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i10);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (ordinal == 4) {
                    i8++;
                }
            }
        }
        long j4 = f699i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f705d);
        sb4.append('@');
        sb4.append(AbstractC1562w.c(this));
        sb4.append("[Pool Size {core = ");
        int i11 = this.f702a;
        sb4.append(i11);
        sb4.append(", max = ");
        sb4.append(this.f703b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i4);
        sb4.append(", blocking = ");
        sb4.append(i5);
        sb4.append(", parked = ");
        sb4.append(i6);
        sb4.append(", dormant = ");
        sb4.append(i7);
        sb4.append(", terminated = ");
        sb4.append(i8);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f706e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f707f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j4));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j4) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i11 - ((int) ((j4 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
