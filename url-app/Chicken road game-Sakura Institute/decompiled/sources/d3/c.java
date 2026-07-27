package d3;

import A.AbstractC0017m;
import b3.p;
import b3.t;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import r0.B;
import y2.C1338m;

/* loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f6105n = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f6106o = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6107p = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: q, reason: collision with root package name */
    public static final t f6108q = new t("NOT_IN_STACK", 0);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f6109d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6110e;

    /* renamed from: i, reason: collision with root package name */
    public final long f6111i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6112j;

    /* renamed from: k, reason: collision with root package name */
    public final f f6113k;

    /* renamed from: l, reason: collision with root package name */
    public final f f6114l;

    /* renamed from: m, reason: collision with root package name */
    public final p f6115m;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(String str, int i2, int i4, long j4) {
        this.f6109d = i2;
        this.f6110e = i4;
        this.f6111i = j4;
        this.f6112j = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(AbstractC0017m.h(i2, "Core pool size ", " should be at least 1").toString());
        }
        if (i4 < i2) {
            throw new IllegalArgumentException(B.b(i4, i2, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i4 > 2097150) {
            throw new IllegalArgumentException(AbstractC0017m.h(i4, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j4 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
        this.f6113k = new f();
        this.f6114l = new f();
        this.f6115m = new p((i2 + 1) * 2);
        this.controlState$volatile = i2 << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void d(c cVar, Runnable runnable, boolean z4, int i2) {
        if ((i2 & 4) != 0) {
            z4 = false;
        }
        cVar.b(runnable, false, z4);
    }

    public final int a() {
        synchronized (this.f6115m) {
            try {
                if (f6107p.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f6106o;
                long j4 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j4 & 2097151);
                int i4 = i2 - ((int) ((j4 & 4398044413952L) >> 21));
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 >= this.f6109d) {
                    return 0;
                }
                if (i2 >= this.f6110e) {
                    return 0;
                }
                int i5 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i5 <= 0 || this.f6115m.b(i5) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i5);
                this.f6115m.c(i5, aVar);
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

    public final void b(Runnable runnable, boolean z4, boolean z5) {
        i jVar;
        b bVar;
        k.f6129f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f6121d = nanoTime;
            jVar.f6122e = z4;
        } else {
            jVar = new j(runnable, nanoTime, z4);
        }
        boolean z6 = jVar.f6122e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6106o;
        long addAndGet = z6 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !Intrinsics.a(aVar.f6098n, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f6093i) != b.f6103k && (jVar.f6122e || bVar != b.f6100e)) {
            aVar.f6097m = true;
            m mVar = aVar.f6091d;
            if (z5) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f6131b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f6122e ? this.f6114l.a(jVar) : this.f6113k.a(jVar))) {
                throw new RejectedExecutionException(AbstractC0017m.n(new StringBuilder(), this.f6112j, " was terminated"));
            }
        }
        boolean z7 = z5 && aVar != null;
        if (z6) {
            if (z7 || h() || g(addAndGet)) {
                return;
            }
            h();
            return;
        }
        if (z7 || h() || g(atomicLongFieldUpdater.get(this))) {
            return;
        }
        h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i2;
        i iVar;
        if (f6107p.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !Intrinsics.a(aVar.f6098n, this)) {
                aVar = null;
            }
            synchronized (this.f6115m) {
                i2 = (int) (f6106o.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i4 = 1;
                while (true) {
                    Object b4 = this.f6115m.b(i4);
                    Intrinsics.c(b4);
                    a aVar2 = (a) b4;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f6091d;
                        f fVar = this.f6114l;
                        mVar.getClass();
                        i iVar2 = (i) m.f6131b.getAndSet(mVar, null);
                        if (iVar2 != null) {
                            fVar.a(iVar2);
                        }
                        while (true) {
                            i b5 = mVar.b();
                            if (b5 == null) {
                                break;
                            } else {
                                fVar.a(b5);
                            }
                        }
                    }
                    if (i4 == i2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            this.f6114l.b();
            this.f6113k.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.f6113k.d();
                if (iVar == null && (iVar = (i) this.f6114l.d()) == null) {
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
                aVar.h(b.f6103k);
            }
            f6105n.set(this, 0L);
            f6106o.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(this, runnable, false, 6);
    }

    public final void f(a aVar, int i2, int i4) {
        while (true) {
            long j4 = f6105n.get(this);
            int i5 = (int) (2097151 & j4);
            long j5 = (2097152 + j4) & (-2097152);
            if (i5 == i2) {
                if (i4 == 0) {
                    Object c4 = aVar.c();
                    while (true) {
                        if (c4 == f6108q) {
                            i5 = -1;
                            break;
                        }
                        if (c4 == null) {
                            i5 = 0;
                            break;
                        }
                        a aVar2 = (a) c4;
                        int b4 = aVar2.b();
                        if (b4 != 0) {
                            i5 = b4;
                            break;
                        }
                        c4 = aVar2.c();
                    }
                } else {
                    i5 = i4;
                }
            }
            if (i5 >= 0) {
                if (f6105n.compareAndSet(this, j4, i5 | j5)) {
                    return;
                }
            }
        }
    }

    public final boolean g(long j4) {
        int i2 = ((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i4 = this.f6109d;
        if (i2 < i4) {
            int a4 = a();
            if (a4 == 1 && i4 > 1) {
                a();
            }
            if (a4 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        t tVar;
        int i2;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6105n;
            long j4 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f6115m.b((int) (2097151 & j4));
            if (aVar == null) {
                aVar = null;
            } else {
                long j5 = (2097152 + j4) & (-2097152);
                Object c4 = aVar.c();
                while (true) {
                    tVar = f6108q;
                    if (c4 == tVar) {
                        i2 = -1;
                        break;
                    }
                    if (c4 == null) {
                        i2 = 0;
                        break;
                    }
                    a aVar2 = (a) c4;
                    i2 = aVar2.b();
                    if (i2 != 0) {
                        break;
                    }
                    c4 = aVar2.c();
                }
                if (i2 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j4, j5 | i2)) {
                    aVar.g(tVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f6090o.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f6115m;
        int a4 = pVar.a();
        int i2 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 1; i8 < a4; i8++) {
            a aVar = (a) pVar.b(i8);
            if (aVar != null) {
                m mVar = aVar.f6091d;
                mVar.getClass();
                int i9 = m.f6131b.get(mVar) != null ? (m.f6132c.get(mVar) - m.f6133d.get(mVar)) + 1 : m.f6132c.get(mVar) - m.f6133d.get(mVar);
                int ordinal = aVar.f6093i.ordinal();
                if (ordinal == 0) {
                    i2++;
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
                        throw new C1338m();
                    }
                    i7++;
                }
            }
        }
        long j4 = f6106o.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f6112j);
        sb4.append('@');
        sb4.append(W2.B.f(this));
        sb4.append("[Pool Size {core = ");
        int i10 = this.f6109d;
        sb4.append(i10);
        sb4.append(", max = ");
        sb4.append(this.f6110e);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
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
        sb4.append(this.f6113k.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f6114l.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j4));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j4) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i10 - ((int) ((j4 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
