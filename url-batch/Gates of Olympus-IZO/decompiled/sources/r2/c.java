package r2;

import H2.AbstractC0080b;
import j1.p;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import k2.AbstractC0552y;
import p2.q;

/* loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7310k = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7311l = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7312m = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final p f7313n = new p("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f7314d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7315e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7316f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7317g;

    /* renamed from: h, reason: collision with root package name */
    public final f f7318h;

    /* renamed from: i, reason: collision with root package name */
    public final f f7319i;

    /* renamed from: j, reason: collision with root package name */
    public final q f7320j;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i3, int i4, long j3, String str) {
        this.f7314d = i3;
        this.f7315e = i4;
        this.f7316f = j3;
        this.f7317g = str;
        if (i3 < 1) {
            throw new IllegalArgumentException(AbstractC0080b.i("Core pool size ", i3, " should be at least 1").toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(AbstractC0080b.g(i4, i3, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i4 > 2097150) {
            throw new IllegalArgumentException(AbstractC0080b.i("Max pool size ", i4, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
        this.f7318h = new f();
        this.f7319i = new f();
        this.f7320j = new q((i3 + 1) * 2);
        this.controlState$volatile = i3 << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void e(c cVar, Runnable runnable, boolean z3, int i3) {
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        cVar.b(runnable, false, z3);
    }

    public final int a() {
        synchronized (this.f7320j) {
            try {
                if (f7312m.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f7311l;
                long j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 & 2097151);
                int i4 = i3 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 >= this.f7314d) {
                    return 0;
                }
                if (i3 >= this.f7315e) {
                    return 0;
                }
                int i5 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i5 <= 0 || this.f7320j.b(i5) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i5);
                this.f7320j.c(i5, aVar);
                if (i5 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i6 = i4 + 1;
                aVar.start();
                return i6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z3, boolean z4) {
        i jVar;
        b bVar;
        k.f7334f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f7326d = nanoTime;
            jVar.f7327e = z3;
        } else {
            jVar = new j(runnable, nanoTime, z3);
        }
        boolean z5 = jVar.f7327e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7311l;
        long addAndGet = z5 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !Z1.i.a(aVar.f7303k, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f7298f) != b.f7308h && (jVar.f7327e || bVar != b.f7305e)) {
            aVar.f7302j = true;
            m mVar = aVar.f7296d;
            if (z4) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f7336b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f7327e ? this.f7319i.a(jVar) : this.f7318h.a(jVar))) {
                throw new RejectedExecutionException(this.f7317g + " was terminated");
            }
        }
        boolean z6 = z4 && aVar != null;
        if (z5) {
            if (z6 || j() || i(addAndGet)) {
                return;
            }
            j();
            return;
        }
        if (z6 || j() || i(atomicLongFieldUpdater.get(this))) {
            return;
        }
        j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i3;
        i iVar;
        if (f7312m.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !Z1.i.a(aVar.f7303k, this)) {
                aVar = null;
            }
            synchronized (this.f7320j) {
                i3 = (int) (f7311l.get(this) & 2097151);
            }
            if (1 <= i3) {
                int i4 = 1;
                while (true) {
                    Object b2 = this.f7320j.b(i4);
                    Z1.i.c(b2);
                    a aVar2 = (a) b2;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f7296d;
                        f fVar = this.f7319i;
                        mVar.getClass();
                        i iVar2 = (i) m.f7336b.getAndSet(mVar, null);
                        if (iVar2 != null) {
                            fVar.a(iVar2);
                        }
                        while (true) {
                            i b3 = mVar.b();
                            if (b3 == null) {
                                break;
                            } else {
                                fVar.a(b3);
                            }
                        }
                    }
                    if (i4 == i3) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            this.f7319i.b();
            this.f7318h.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.f7318h.d();
                if (iVar == null && (iVar = (i) this.f7319i.d()) == null) {
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
                aVar.h(b.f7308h);
            }
            f7310k.set(this, 0L);
            f7311l.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, false, 6);
    }

    public final void h(a aVar, int i3, int i4) {
        while (true) {
            long j3 = f7310k.get(this);
            int i5 = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & (-2097152);
            if (i5 == i3) {
                if (i4 == 0) {
                    Object c3 = aVar.c();
                    while (true) {
                        if (c3 == f7313n) {
                            i5 = -1;
                            break;
                        }
                        if (c3 == null) {
                            i5 = 0;
                            break;
                        }
                        a aVar2 = (a) c3;
                        int b2 = aVar2.b();
                        if (b2 != 0) {
                            i5 = b2;
                            break;
                        }
                        c3 = aVar2.c();
                    }
                } else {
                    i5 = i4;
                }
            }
            if (i5 >= 0) {
                if (f7310k.compareAndSet(this, j3, i5 | j4)) {
                    return;
                }
            }
        }
    }

    public final boolean i(long j3) {
        int i3 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = this.f7314d;
        if (i3 < i4) {
            int a3 = a();
            if (a3 == 1 && i4 > 1) {
                a();
            }
            if (a3 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        p pVar;
        int i3;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7310k;
            long j3 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f7320j.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j4 = (2097152 + j3) & (-2097152);
                Object c3 = aVar.c();
                while (true) {
                    pVar = f7313n;
                    if (c3 == pVar) {
                        i3 = -1;
                        break;
                    }
                    if (c3 == null) {
                        i3 = 0;
                        break;
                    }
                    a aVar2 = (a) c3;
                    i3 = aVar2.b();
                    if (i3 != 0) {
                        break;
                    }
                    c3 = aVar2.c();
                }
                if (i3 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j3, j4 | i3)) {
                    aVar.g(pVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f7295l.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        q qVar = this.f7320j;
        int a3 = qVar.a();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 1; i8 < a3; i8++) {
            a aVar = (a) qVar.b(i8);
            if (aVar != null) {
                m mVar = aVar.f7296d;
                mVar.getClass();
                int i9 = m.f7336b.get(mVar) != null ? (m.f7337c.get(mVar) - m.f7338d.get(mVar)) + 1 : m.f7337c.get(mVar) - m.f7338d.get(mVar);
                int ordinal = aVar.f7298f.ordinal();
                if (ordinal == 0) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i9);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i9);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i5++;
                } else if (ordinal == 3) {
                    i6++;
                    if (i9 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i9);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        throw new L1.f();
                    }
                    i7++;
                }
            }
        }
        long j3 = f7311l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f7317g);
        sb4.append('@');
        sb4.append(AbstractC0552y.i(this));
        sb4.append("[Pool Size {core = ");
        int i10 = this.f7314d;
        sb4.append(i10);
        sb4.append(", max = ");
        sb4.append(this.f7315e);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i3);
        sb4.append(", blocking = ");
        sb4.append(i4);
        sb4.append(", parked = ");
        sb4.append(i5);
        sb4.append(", dormant = ");
        sb4.append(i6);
        sb4.append(", terminated = ");
        sb4.append(i7);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f7318h.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f7319i.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j3));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j3) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i10 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
