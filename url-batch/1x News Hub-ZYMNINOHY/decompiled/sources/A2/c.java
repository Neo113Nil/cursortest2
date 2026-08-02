package A2;

import E1.AbstractC0033i;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import n0.C1148j;
import t2.AbstractC1212w;
import y2.r;

/* loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f42h = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f43i = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f44j = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final C1148j f45k = new C1148j("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f46a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47b;

    /* renamed from: c, reason: collision with root package name */
    public final long f48c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final String f49d;

    /* renamed from: e, reason: collision with root package name */
    public final f f50e;
    public final f f;

    /* renamed from: g, reason: collision with root package name */
    public final r f51g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i3, int i4, long j3, String str) {
        this.f46a = i3;
        this.f47b = i4;
        this.f48c = j3;
        this.f49d = str;
        if (i3 < 1) {
            throw new IllegalArgumentException(AbstractC0033i.i(i3, "Core pool size ", " should be at least 1").toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(AbstractC0033i.g(i4, i3, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i4 > 2097150) {
            throw new IllegalArgumentException(AbstractC0033i.i(i4, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
        this.f50e = new f();
        this.f = new f();
        this.f51g = new r((i3 + 1) * 2);
        this.controlState$volatile = i3 << 42;
        this._isTerminated$volatile = 0;
    }

    public final int a() {
        synchronized (this.f51g) {
            try {
                if (f44j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f43i;
                long j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 & 2097151);
                int i4 = i3 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 >= this.f46a) {
                    return 0;
                }
                if (i3 >= this.f47b) {
                    return 0;
                }
                int i5 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i5 <= 0 || this.f51g.b(i5) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i5);
                this.f51g.c(i5, aVar);
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

    public final void b(Runnable runnable, j jVar) {
        i kVar;
        b bVar;
        AtomicReferenceArray atomicReferenceArray;
        l.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            kVar = (i) runnable;
            kVar.f57a = nanoTime;
            kVar.f58b = jVar;
        } else {
            kVar = new k(runnable, nanoTime, jVar);
        }
        boolean z = kVar.f58b.f59a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f43i;
        long addAndGet = z ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !kotlin.jvm.internal.j.a(aVar.f36h, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f32c) != b.f41e && (kVar.f58b.f59a != 0 || bVar != b.f38b)) {
            aVar.f35g = true;
            n nVar = aVar.f30a;
            nVar.getClass();
            kVar = (i) n.f69b.getAndSet(nVar, kVar);
            if (kVar == null) {
                kVar = null;
            } else {
                nVar.getClass();
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n.f70c;
                if (atomicIntegerFieldUpdater.get(nVar) - n.f71d.get(nVar) != 127) {
                    if (kVar.f58b.f59a == 1) {
                        n.f72e.incrementAndGet(nVar);
                    }
                    int i3 = atomicIntegerFieldUpdater.get(nVar) & 127;
                    while (true) {
                        atomicReferenceArray = nVar.f73a;
                        if (atomicReferenceArray.get(i3) == null) {
                            break;
                        } else {
                            Thread.yield();
                        }
                    }
                    atomicReferenceArray.lazySet(i3, kVar);
                    atomicIntegerFieldUpdater.incrementAndGet(nVar);
                    kVar = null;
                }
            }
        }
        if (kVar != null) {
            if (!(kVar.f58b.f59a == 1 ? this.f.a(kVar) : this.f50e.a(kVar))) {
                throw new RejectedExecutionException(AbstractC0033i.m(new StringBuilder(), this.f49d, " was terminated"));
            }
        }
        if (z) {
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

    public final void c(a aVar, int i3, int i4) {
        while (true) {
            long j3 = f42h.get(this);
            int i5 = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & (-2097152);
            if (i5 == i3) {
                if (i4 == 0) {
                    Object c3 = aVar.c();
                    while (true) {
                        if (c3 == f45k) {
                            i5 = -1;
                            break;
                        }
                        if (c3 == null) {
                            i5 = 0;
                            break;
                        }
                        a aVar2 = (a) c3;
                        int b3 = aVar2.b();
                        if (b3 != 0) {
                            i5 = b3;
                            break;
                        }
                        c3 = aVar2.c();
                    }
                } else {
                    i5 = i4;
                }
            }
            if (i5 >= 0) {
                if (f42h.compareAndSet(this, j3, i5 | j4)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i3;
        i iVar;
        if (f44j.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !kotlin.jvm.internal.j.a(aVar.f36h, this)) {
                aVar = null;
            }
            synchronized (this.f51g) {
                i3 = (int) (f43i.get(this) & 2097151);
            }
            if (1 <= i3) {
                int i4 = 1;
                while (true) {
                    Object b3 = this.f51g.b(i4);
                    kotlin.jvm.internal.j.b(b3);
                    a aVar2 = (a) b3;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        n nVar = aVar2.f30a;
                        f fVar = this.f;
                        nVar.getClass();
                        i iVar2 = (i) n.f69b.getAndSet(nVar, null);
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
                    if (i4 == i3) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            this.f.b();
            this.f50e.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.f50e.d();
                if (iVar == null && (iVar = (i) this.f.d()) == null) {
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
                aVar.h(b.f41e);
            }
            f42h.set(this, 0L);
            f43i.set(this, 0L);
        }
    }

    public final boolean d(long j3) {
        int i3 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = this.f46a;
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

    public final boolean e() {
        C1148j c1148j;
        int i3;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f42h;
            long j3 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f51g.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j4 = (2097152 + j3) & (-2097152);
                Object c3 = aVar.c();
                while (true) {
                    c1148j = f45k;
                    if (c3 == c1148j) {
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
                    aVar.g(c1148j);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f29i.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, l.f66g);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        r rVar = this.f51g;
        int a3 = rVar.a();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 1; i8 < a3; i8++) {
            a aVar = (a) rVar.b(i8);
            if (aVar != null) {
                n nVar = aVar.f30a;
                nVar.getClass();
                int i9 = n.f69b.get(nVar) != null ? (n.f70c.get(nVar) - n.f71d.get(nVar)) + 1 : n.f70c.get(nVar) - n.f71d.get(nVar);
                int ordinal = aVar.f32c.ordinal();
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
                } else if (ordinal == 4) {
                    i7++;
                }
            }
        }
        long j3 = f43i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f49d);
        sb4.append('@');
        sb4.append(AbstractC1212w.c(this));
        sb4.append("[Pool Size {core = ");
        int i10 = this.f46a;
        sb4.append(i10);
        sb4.append(", max = ");
        sb4.append(this.f47b);
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
        sb4.append(this.f50e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
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
