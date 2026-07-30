package q1;

import e0.c0;
import f0.l;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import k1.t;
import p1.s;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class b implements Executor, Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1098i = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1099j = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1100k = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: l, reason: collision with root package name */
    public static final o0.a f1101l = new o0.a(2, "NOT_IN_STACK");
    private volatile int _isTerminated;

    /* renamed from: b, reason: collision with root package name */
    public final int f1102b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1103c;
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final long f1104d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1105e;

    /* renamed from: f, reason: collision with root package name */
    public final e f1106f;

    /* renamed from: g, reason: collision with root package name */
    public final e f1107g;

    /* renamed from: h, reason: collision with root package name */
    public final s f1108h;
    private volatile long parkedWorkersStack;

    public b(int i2, int i3, long j2, String str) {
        this.f1102b = i2;
        this.f1103c = i3;
        this.f1104d = j2;
        this.f1105e = str;
        if (i2 < 1) {
            l.d("Core pool size ", i2, " should be at least 1");
            throw null;
        }
        if (i3 < i2) {
            l.e("Max pool size ", i3, " should be greater than or equals to core pool size ", i2);
            throw null;
        }
        if (i3 > 2097150) {
            l.d("Max pool size ", i3, " should not exceed maximal supported number of threads 2097150");
            throw null;
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f1106f = new e();
        this.f1107g = new e();
        this.f1108h = new s((i2 + 1) * 2);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        synchronized (this.f1108h) {
            try {
                if (f1100k.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f1099j;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f1102b) {
                    return 0;
                }
                if (i2 >= this.f1103c) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.f1108h.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i4);
                this.f1108h.c(i4, aVar);
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

    public final void b(Runnable runnable, c0 c0Var) {
        g hVar;
        int i2;
        i.f1122f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof g) {
            hVar = (g) runnable;
            hVar.f1114b = nanoTime;
            hVar.f1115c = c0Var;
        } else {
            hVar = new h(runnable, nanoTime, c0Var);
        }
        boolean z2 = hVar.f1115c.f133a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1099j;
        long addAndGet = z2 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !aVar.f1097i.equals(this)) {
            aVar = null;
        }
        if (aVar != null && (i2 = aVar.f1092d) != 5 && (hVar.f1115c.f133a != 0 || i2 != 2)) {
            aVar.f1096h = true;
            k kVar = aVar.f1090b;
            kVar.getClass();
            hVar = (g) k.f1126b.getAndSet(kVar, hVar);
            if (hVar == null) {
                hVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = kVar.f1130a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k.f1127c;
                if (atomicIntegerFieldUpdater.get(kVar) - k.f1128d.get(kVar) != 127) {
                    if (hVar.f1115c.f133a == 1) {
                        k.f1129e.incrementAndGet(kVar);
                    }
                    int i3 = atomicIntegerFieldUpdater.get(kVar) & 127;
                    while (atomicReferenceArray.get(i3) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i3, hVar);
                    atomicIntegerFieldUpdater.incrementAndGet(kVar);
                    hVar = null;
                }
            }
        }
        if (hVar != null) {
            if (!(hVar.f1115c.f133a == 1 ? this.f1107g.a(hVar) : this.f1106f.a(hVar))) {
                throw new RejectedExecutionException(this.f1105e + " was terminated");
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
            long j2 = f1098i.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object c2 = aVar.c();
                    while (true) {
                        if (c2 == f1101l) {
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
                if (f1098i.compareAndSet(this, j2, i4 | j3)) {
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
        g gVar;
        if (f1100k.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !aVar.f1097i.equals(this)) {
                aVar = null;
            }
            synchronized (this.f1108h) {
                i2 = (int) (f1099j.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    Object b2 = this.f1108h.b(i3);
                    b2.getClass();
                    a aVar2 = (a) b2;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        k kVar = aVar2.f1090b;
                        e eVar = this.f1107g;
                        kVar.getClass();
                        g gVar2 = (g) k.f1126b.getAndSet(kVar, null);
                        if (gVar2 != null) {
                            eVar.a(gVar2);
                        }
                        while (true) {
                            g a2 = kVar.a();
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
            this.f1107g.b();
            this.f1106f.b();
            while (true) {
                if (aVar != null) {
                    gVar = aVar.a(true);
                }
                gVar = (g) this.f1106f.d();
                if (gVar == null && (gVar = (g) this.f1107g.d()) == null) {
                    break;
                }
                try {
                    gVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(5);
            }
            f1098i.set(this, 0L);
            f1099j.set(this, 0L);
        }
    }

    public final boolean d(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f1102b;
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
        o0.a aVar;
        int i2;
        while (true) {
            long j2 = f1098i.get(this);
            a aVar2 = (a) this.f1108h.b((int) (2097151 & j2));
            if (aVar2 == null) {
                aVar2 = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object c2 = aVar2.c();
                while (true) {
                    aVar = f1101l;
                    if (c2 == aVar) {
                        i2 = -1;
                        break;
                    }
                    if (c2 == null) {
                        i2 = 0;
                        break;
                    }
                    a aVar3 = (a) c2;
                    i2 = aVar3.b();
                    if (i2 != 0) {
                        break;
                    }
                    c2 = aVar3.c();
                }
                if (i2 >= 0) {
                    if (f1098i.compareAndSet(this, j2, i2 | j3)) {
                        aVar2.g(aVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar2 == null) {
                return false;
            }
            if (a.f1089j.compareAndSet(aVar2, -1, 0)) {
                LockSupport.unpark(aVar2);
                return true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, i.f1123g);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s sVar = this.f1108h;
        int a2 = sVar.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a2; i7++) {
            a aVar = (a) sVar.b(i7);
            if (aVar != null) {
                k kVar = aVar.f1090b;
                kVar.getClass();
                int i8 = k.f1126b.get(kVar) != null ? (k.f1127c.get(kVar) - k.f1128d.get(kVar)) + 1 : k.f1127c.get(kVar) - k.f1128d.get(kVar);
                int a3 = o.d.a(aVar.f1092d);
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
        long j2 = f1099j.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f1105e);
        sb4.append('@');
        sb4.append(t.a(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.f1102b;
        sb4.append(i9);
        sb4.append(", max = ");
        sb4.append(this.f1103c);
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
        sb4.append(this.f1106f.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f1107g.c());
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
