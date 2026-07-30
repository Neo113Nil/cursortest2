package j7;

import c7.a0;
import h7.o;
import h7.s;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5140m = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5141n = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5142o = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: p, reason: collision with root package name */
    public static final s f5143p = new s("NOT_IN_STACK", 0);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: f, reason: collision with root package name */
    public final int f5144f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5145g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5146h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5147i;

    /* renamed from: j, reason: collision with root package name */
    public final f f5148j;

    /* renamed from: k, reason: collision with root package name */
    public final f f5149k;

    /* renamed from: l, reason: collision with root package name */
    public final o f5150l;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i7, int i8, long j8, String str) {
        this.f5144f = i7;
        this.f5145g = i8;
        this.f5146h = j8;
        this.f5147i = str;
        if (i7 < 1) {
            throw new IllegalArgumentException(a0.m.g(i7, "Core pool size ", " should be at least 1").toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(r6.i.b(i8, i7, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i8 > 2097150) {
            throw new IllegalArgumentException(a0.m.g(i8, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j8 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j8 + " must be positive").toString());
        }
        this.f5148j = new f();
        this.f5149k = new f();
        this.f5150l = new o((i7 + 1) * 2);
        this.controlState$volatile = i7 << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void k(c cVar, Runnable runnable, int i7) {
        cVar.c(runnable, false, (i7 & 4) == 0);
    }

    public final int b() {
        synchronized (this.f5150l) {
            try {
                if (f5142o.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f5141n;
                long j8 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j8 & 2097151);
                int i8 = i7 - ((int) ((j8 & 4398044413952L) >> 21));
                if (i8 < 0) {
                    i8 = 0;
                }
                if (i8 >= this.f5144f) {
                    return 0;
                }
                if (i7 >= this.f5145g) {
                    return 0;
                }
                int i9 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i9 <= 0 || this.f5150l.b(i9) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i9);
                this.f5150l.c(i9, aVar);
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

    public final void c(Runnable runnable, boolean z8, boolean z9) {
        i jVar;
        b bVar;
        k.f5164f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f5156f = nanoTime;
            jVar.f5157g = z8;
        } else {
            jVar = new j(runnable, nanoTime, z8);
        }
        boolean z10 = jVar.f5157g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5141n;
        long addAndGet = z10 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !r6.k.a(aVar.f5133m, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f5128h) != b.f5138j && (jVar.f5157g || bVar != b.f5135g)) {
            aVar.f5132l = true;
            m mVar = aVar.f5126f;
            if (z9) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f5166b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f5157g ? this.f5149k.a(jVar) : this.f5148j.a(jVar))) {
                throw new RejectedExecutionException(a0.m.m(new StringBuilder(), this.f5147i, " was terminated"));
            }
        }
        boolean z11 = z9 && aVar != null;
        if (z10) {
            if (z11 || u() || t(addAndGet)) {
                return;
            }
            u();
            return;
        }
        if (z11 || u() || t(atomicLongFieldUpdater.get(this))) {
            return;
        }
        u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i7;
        i iVar;
        if (f5142o.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !r6.k.a(aVar.f5133m, this)) {
                aVar = null;
            }
            synchronized (this.f5150l) {
                i7 = (int) (f5141n.get(this) & 2097151);
            }
            if (1 <= i7) {
                int i8 = 1;
                while (true) {
                    Object b9 = this.f5150l.b(i8);
                    r6.k.c(b9);
                    a aVar2 = (a) b9;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f5126f;
                        f fVar = this.f5149k;
                        mVar.getClass();
                        i iVar2 = (i) m.f5166b.getAndSet(mVar, null);
                        if (iVar2 != null) {
                            fVar.a(iVar2);
                        }
                        while (true) {
                            i b10 = mVar.b();
                            if (b10 == null) {
                                break;
                            } else {
                                fVar.a(b10);
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
            this.f5149k.b();
            this.f5148j.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.f5148j.d();
                if (iVar == null && (iVar = (i) this.f5149k.d()) == null) {
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
                aVar.h(b.f5138j);
            }
            f5140m.set(this, 0L);
            f5141n.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        k(this, runnable, 6);
    }

    public final void n(a aVar, int i7, int i8) {
        while (true) {
            long j8 = f5140m.get(this);
            int i9 = (int) (2097151 & j8);
            long j9 = (2097152 + j8) & (-2097152);
            if (i9 == i7) {
                if (i8 == 0) {
                    Object c4 = aVar.c();
                    while (true) {
                        if (c4 == f5143p) {
                            i9 = -1;
                            break;
                        }
                        if (c4 == null) {
                            i9 = 0;
                            break;
                        }
                        a aVar2 = (a) c4;
                        int b9 = aVar2.b();
                        if (b9 != 0) {
                            i9 = b9;
                            break;
                        }
                        c4 = aVar2.c();
                    }
                } else {
                    i9 = i8;
                }
            }
            if (i9 >= 0) {
                if (f5140m.compareAndSet(this, j8, i9 | j9)) {
                    return;
                }
            }
        }
    }

    public final boolean t(long j8) {
        int i7 = ((int) (2097151 & j8)) - ((int) ((j8 & 4398044413952L) >> 21));
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = this.f5144f;
        if (i7 < i8) {
            int b9 = b();
            if (b9 == 1 && i8 > 1) {
                b();
            }
            if (b9 > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        o oVar = this.f5150l;
        int a3 = oVar.a();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 1; i12 < a3; i12++) {
            a aVar = (a) oVar.b(i12);
            if (aVar != null) {
                m mVar = aVar.f5126f;
                mVar.getClass();
                int i13 = m.f5166b.get(mVar) != null ? (m.f5167c.get(mVar) - m.f5168d.get(mVar)) + 1 : m.f5167c.get(mVar) - m.f5168d.get(mVar);
                int ordinal = aVar.f5128h.ordinal();
                if (ordinal == 0) {
                    i7++;
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
                        throw new b4.c();
                    }
                    i11++;
                }
            }
        }
        long j8 = f5141n.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f5147i);
        sb4.append('@');
        sb4.append(a0.i(this));
        sb4.append("[Pool Size {core = ");
        int i14 = this.f5144f;
        sb4.append(i14);
        sb4.append(", max = ");
        sb4.append(this.f5145g);
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
        sb4.append(this.f5148j.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f5149k.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j8));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j8) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i14 - ((int) ((j8 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean u() {
        s sVar;
        int i7;
        while (true) {
            long j8 = f5140m.get(this);
            a aVar = (a) this.f5150l.b((int) (2097151 & j8));
            if (aVar == null) {
                aVar = null;
            } else {
                long j9 = (2097152 + j8) & (-2097152);
                Object c4 = aVar.c();
                while (true) {
                    sVar = f5143p;
                    if (c4 == sVar) {
                        i7 = -1;
                        break;
                    }
                    if (c4 == null) {
                        i7 = 0;
                        break;
                    }
                    a aVar2 = (a) c4;
                    i7 = aVar2.b();
                    if (i7 != 0) {
                        break;
                    }
                    c4 = aVar2.c();
                }
                if (i7 >= 0) {
                    if (f5140m.compareAndSet(this, j8, i7 | j9)) {
                        aVar.g(sVar);
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
            if (a.f5125n.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }
}
