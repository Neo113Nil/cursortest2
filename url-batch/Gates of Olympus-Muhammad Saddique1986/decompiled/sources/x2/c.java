package x2;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m1.q;
import q2.AbstractC0837y;
import v2.p;

/* loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10335k = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10336l = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10337m = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final q f10338n = new q("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f10339d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10340e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10341f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10342g;

    /* renamed from: h, reason: collision with root package name */
    public final f f10343h;

    /* renamed from: i, reason: collision with root package name */
    public final f f10344i;

    /* renamed from: j, reason: collision with root package name */
    public final p f10345j;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i3, int i4, long j3, String str) {
        this.f10339d = i3;
        this.f10340e = i4;
        this.f10341f = j3;
        this.f10342g = str;
        if (i3 < 1) {
            throw new IllegalArgumentException(A.k.g(i3, "Core pool size ", " should be at least 1").toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(A.k.f(i4, i3, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i4 > 2097150) {
            throw new IllegalArgumentException(A.k.g(i4, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
        this.f10343h = new f();
        this.f10344i = new f();
        this.f10345j = new p((i3 + 1) * 2);
        this.controlState$volatile = i3 << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void d(c cVar, Runnable runnable, boolean z3, int i3) {
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        cVar.b(runnable, false, z3);
    }

    public final int a() {
        synchronized (this.f10345j) {
            try {
                if (f10337m.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f10336l;
                long j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 & 2097151);
                int i4 = i3 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 >= this.f10339d) {
                    return 0;
                }
                if (i3 >= this.f10340e) {
                    return 0;
                }
                int i5 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i5 <= 0 || this.f10345j.b(i5) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i5);
                this.f10345j.c(i5, aVar);
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
        k.f10359f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f10351d = nanoTime;
            jVar.f10352e = z3;
        } else {
            jVar = new j(runnable, nanoTime, z3);
        }
        boolean z5 = jVar.f10352e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10336l;
        long addAndGet = z5 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !f2.j.a(aVar.f10328k, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f10323f) != b.f10333h && (jVar.f10352e || bVar != b.f10330e)) {
            aVar.f10327j = true;
            m mVar = aVar.f10321d;
            if (z4) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f10361b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f10352e ? this.f10344i.a(jVar) : this.f10343h.a(jVar))) {
                throw new RejectedExecutionException(this.f10342g + " was terminated");
            }
        }
        boolean z6 = z4 && aVar != null;
        if (z5) {
            if (z6 || h() || g(addAndGet)) {
                return;
            }
            h();
            return;
        }
        if (z6 || h() || g(atomicLongFieldUpdater.get(this))) {
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
        int i3;
        i iVar;
        if (f10337m.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !f2.j.a(aVar.f10328k, this)) {
                aVar = null;
            }
            synchronized (this.f10345j) {
                i3 = (int) (f10336l.get(this) & 2097151);
            }
            if (1 <= i3) {
                int i4 = 1;
                while (true) {
                    Object b3 = this.f10345j.b(i4);
                    f2.j.c(b3);
                    a aVar2 = (a) b3;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f10321d;
                        f fVar = this.f10344i;
                        mVar.getClass();
                        i iVar2 = (i) m.f10361b.getAndSet(mVar, null);
                        if (iVar2 != null) {
                            fVar.a(iVar2);
                        }
                        while (true) {
                            i b4 = mVar.b();
                            if (b4 == null) {
                                break;
                            } else {
                                fVar.a(b4);
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
            this.f10344i.b();
            this.f10343h.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.f10343h.d();
                if (iVar == null && (iVar = (i) this.f10344i.d()) == null) {
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
                aVar.h(b.f10333h);
            }
            f10335k.set(this, 0L);
            f10336l.set(this, 0L);
        }
    }

    public final void e(a aVar, int i3, int i4) {
        while (true) {
            long j3 = f10335k.get(this);
            int i5 = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & (-2097152);
            if (i5 == i3) {
                if (i4 == 0) {
                    Object c2 = aVar.c();
                    while (true) {
                        if (c2 == f10338n) {
                            i5 = -1;
                            break;
                        }
                        if (c2 == null) {
                            i5 = 0;
                            break;
                        }
                        a aVar2 = (a) c2;
                        int b3 = aVar2.b();
                        if (b3 != 0) {
                            i5 = b3;
                            break;
                        }
                        c2 = aVar2.c();
                    }
                } else {
                    i5 = i4;
                }
            }
            if (i5 >= 0) {
                if (f10335k.compareAndSet(this, j3, i5 | j4)) {
                    return;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(this, runnable, false, 6);
    }

    public final boolean g(long j3) {
        int i3 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = this.f10339d;
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

    public final boolean h() {
        q qVar;
        int i3;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10335k;
            long j3 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f10345j.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j4 = (2097152 + j3) & (-2097152);
                Object c2 = aVar.c();
                while (true) {
                    qVar = f10338n;
                    if (c2 == qVar) {
                        i3 = -1;
                        break;
                    }
                    if (c2 == null) {
                        i3 = 0;
                        break;
                    }
                    a aVar2 = (a) c2;
                    i3 = aVar2.b();
                    if (i3 != 0) {
                        break;
                    }
                    c2 = aVar2.c();
                }
                if (i3 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j3, j4 | i3)) {
                    aVar.g(qVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f10320l.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f10345j;
        int a3 = pVar.a();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 1; i8 < a3; i8++) {
            a aVar = (a) pVar.b(i8);
            if (aVar != null) {
                m mVar = aVar.f10321d;
                mVar.getClass();
                int i9 = m.f10361b.get(mVar) != null ? (m.f10362c.get(mVar) - m.f10363d.get(mVar)) + 1 : m.f10362c.get(mVar) - m.f10363d.get(mVar);
                int ordinal = aVar.f10323f.ordinal();
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
                        throw new C1.c();
                    }
                    i7++;
                }
            }
        }
        long j3 = f10336l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f10342g);
        sb4.append('@');
        sb4.append(AbstractC0837y.j(this));
        sb4.append("[Pool Size {core = ");
        int i10 = this.f10339d;
        sb4.append(i10);
        sb4.append(", max = ");
        sb4.append(this.f10340e);
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
        sb4.append(this.f10343h.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f10344i.c());
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
