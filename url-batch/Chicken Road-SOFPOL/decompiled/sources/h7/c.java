package h7;

import a0.q;
import a7.x;
import d4.t;
import f7.p;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3226k = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3227l = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3228m = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final t f3229n = new t("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f3230d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3231e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3232f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3233g;

    /* renamed from: h, reason: collision with root package name */
    public final f f3234h;
    public final f i;

    /* renamed from: j, reason: collision with root package name */
    public final p f3235j;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i, int i8, long j7, String str) {
        this.f3230d = i;
        this.f3231e = i8;
        this.f3232f = j7;
        this.f3233g = str;
        if (i < 1) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (i8 < i) {
            throw new IllegalArgumentException(q.i("Max pool size ", i8, " should be greater than or equals to core pool size ", i).toString());
        }
        if (i8 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i8 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j7 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j7 + " must be positive").toString());
        }
        this.f3234h = new f();
        this.i = new f();
        this.f3235j = new p((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void c(c cVar, Runnable runnable, int i) {
        cVar.b(runnable, false, (i & 4) == 0);
    }

    public final int a() {
        synchronized (this.f3235j) {
            try {
                if (f3228m.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f3227l;
                long j7 = atomicLongFieldUpdater.get(this);
                int i = (int) (j7 & 2097151);
                int i8 = i - ((int) ((j7 & 4398044413952L) >> 21));
                if (i8 < 0) {
                    i8 = 0;
                }
                if (i8 >= this.f3230d) {
                    return 0;
                }
                if (i >= this.f3231e) {
                    return 0;
                }
                int i9 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i9 <= 0 || this.f3235j.b(i9) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i9);
                this.f3235j.c(i9, aVar);
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

    public final void b(Runnable runnable, boolean z3, boolean z7) {
        i jVar;
        b bVar;
        k.f3249f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f3241d = nanoTime;
            jVar.f3242e = z3;
        } else {
            jVar = new j(runnable, nanoTime, z3);
        }
        boolean z8 = jVar.f3242e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3227l;
        long addAndGet = z8 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !q6.i.a(aVar.f3220k, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f3216f) != b.f3225h && (jVar.f3242e || bVar != b.f3222e)) {
            aVar.f3219j = true;
            m mVar = aVar.f3214d;
            if (z7) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f3251b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f3242e ? this.i.a(jVar) : this.f3234h.a(jVar))) {
                throw new RejectedExecutionException(this.f3233g + " was terminated");
            }
        }
        boolean z9 = z7 && aVar != null;
        if (z8) {
            if (z9 || f() || e(addAndGet)) {
                return;
            }
            f();
            return;
        }
        if (z9 || f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        i iVar;
        if (f3228m.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !q6.i.a(aVar.f3220k, this)) {
                aVar = null;
            }
            synchronized (this.f3235j) {
                i = (int) (f3227l.get(this) & 2097151);
            }
            if (1 <= i) {
                int i8 = 1;
                while (true) {
                    Object b8 = this.f3235j.b(i8);
                    q6.i.b(b8);
                    a aVar2 = (a) b8;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f3214d;
                        f fVar = this.i;
                        mVar.getClass();
                        i iVar2 = (i) m.f3251b.getAndSet(mVar, null);
                        if (iVar2 != null) {
                            fVar.a(iVar2);
                        }
                        while (true) {
                            i b9 = mVar.b();
                            if (b9 == null) {
                                break;
                            } else {
                                fVar.a(b9);
                            }
                        }
                    }
                    if (i8 == i) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.i.b();
            this.f3234h.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.f3234h.d();
                if (iVar == null && (iVar = (i) this.i.d()) == null) {
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
                aVar.h(b.f3225h);
            }
            f3226k.set(this, 0L);
            f3227l.set(this, 0L);
        }
    }

    public final void d(a aVar, int i, int i8) {
        while (true) {
            long j7 = f3226k.get(this);
            int i9 = (int) (2097151 & j7);
            long j8 = (2097152 + j7) & (-2097152);
            if (i9 == i) {
                if (i8 == 0) {
                    Object c8 = aVar.c();
                    while (true) {
                        if (c8 == f3229n) {
                            i9 = -1;
                            break;
                        }
                        if (c8 == null) {
                            i9 = 0;
                            break;
                        }
                        a aVar2 = (a) c8;
                        int b8 = aVar2.b();
                        if (b8 != 0) {
                            i9 = b8;
                            break;
                        }
                        c8 = aVar2.c();
                    }
                } else {
                    i9 = i8;
                }
            }
            if (i9 >= 0) {
                if (f3226k.compareAndSet(this, j7, i9 | j8)) {
                    return;
                }
            }
        }
    }

    public final boolean e(long j7) {
        int i = ((int) (2097151 & j7)) - ((int) ((j7 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i8 = this.f3230d;
        if (i < i8) {
            int a8 = a();
            if (a8 == 1 && i8 > 1) {
                a();
            }
            if (a8 > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, 6);
    }

    public final boolean f() {
        t tVar;
        int i;
        while (true) {
            long j7 = f3226k.get(this);
            a aVar = (a) this.f3235j.b((int) (2097151 & j7));
            if (aVar == null) {
                aVar = null;
            } else {
                long j8 = (2097152 + j7) & (-2097152);
                Object c8 = aVar.c();
                while (true) {
                    tVar = f3229n;
                    if (c8 == tVar) {
                        i = -1;
                        break;
                    }
                    if (c8 == null) {
                        i = 0;
                        break;
                    }
                    a aVar2 = (a) c8;
                    i = aVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c8 = aVar2.c();
                }
                if (i >= 0) {
                    if (f3226k.compareAndSet(this, j7, i | j8)) {
                        aVar.g(tVar);
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
            if (a.f3213l.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f3235j;
        int a8 = pVar.a();
        int i = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 1; i12 < a8; i12++) {
            a aVar = (a) pVar.b(i12);
            if (aVar != null) {
                m mVar = aVar.f3214d;
                mVar.getClass();
                int i13 = m.f3251b.get(mVar) != null ? (m.f3252c.get(mVar) - m.f3253d.get(mVar)) + 1 : m.f3252c.get(mVar) - m.f3253d.get(mVar);
                int ordinal = aVar.f3216f.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i13);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i8++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i13);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i9++;
                } else if (ordinal == 3) {
                    i10++;
                    if (i13 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i13);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        throw new a5.c();
                    }
                    i11++;
                }
            }
        }
        long j7 = f3227l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f3233g);
        sb4.append('@');
        sb4.append(x.g(this));
        sb4.append("[Pool Size {core = ");
        int i14 = this.f3230d;
        sb4.append(i14);
        sb4.append(", max = ");
        sb4.append(this.f3231e);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
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
        sb4.append(this.f3234h.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.i.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j7));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j7) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i14 - ((int) ((j7 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
