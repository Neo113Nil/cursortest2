package q0;

import E.D;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import k0.AbstractC0058t;
import m.AbstractC0068d;
import p0.t;

/* loaded from: classes.dex */
public final class b implements Executor, Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1199i = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1200j = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1201k = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: l, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1202l = new io.flutter.plugin.editing.a(5, "NOT_IN_STACK");
    private volatile int _isTerminated;

    /* renamed from: b, reason: collision with root package name */
    public final int f1203b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1204c;
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final long f1205d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1206e;

    /* renamed from: f, reason: collision with root package name */
    public final e f1207f;

    /* renamed from: g, reason: collision with root package name */
    public final e f1208g;

    /* renamed from: h, reason: collision with root package name */
    public final t f1209h;
    private volatile long parkedWorkersStack;

    public b(int i2, int i3, long j2, String str) {
        this.f1203b = i2;
        this.f1204c = i3;
        this.f1205d = j2;
        this.f1206e = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f1207f = new e();
        this.f1208g = new e();
        this.f1209h = new t((i2 + 1) * 2);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        synchronized (this.f1209h) {
            try {
                if (f1201k.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f1200j;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f1203b) {
                    return 0;
                }
                if (i2 >= this.f1204c) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.f1209h.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i4);
                this.f1209h.c(i4, aVar);
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

    public final void b(Runnable runnable, D d2, boolean z) {
        h iVar;
        int i2;
        j.f1223f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f1215b = nanoTime;
            iVar.f1216c = d2;
        } else {
            iVar = new i(runnable, nanoTime, d2);
        }
        boolean z2 = false;
        boolean z3 = iVar.f1216c.f112a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1200j;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !e0.h.a(aVar.f1198i, this)) {
            aVar = null;
        }
        if (aVar != null && (i2 = aVar.f1193d) != 5 && (iVar.f1216c.f112a != 0 || i2 != 2)) {
            aVar.f1197h = true;
            l lVar = aVar.f1191b;
            if (z) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                h hVar = (h) l.f1227b.getAndSet(lVar, iVar);
                iVar = hVar == null ? null : lVar.a(hVar);
            }
        }
        if (iVar != null) {
            if (!(iVar.f1216c.f112a == 1 ? this.f1208g.a(iVar) : this.f1207f.a(iVar))) {
                throw new RejectedExecutionException(this.f1206e + " was terminated");
            }
        }
        if (z && aVar != null) {
            z2 = true;
        }
        if (z3) {
            if (z2 || e() || d(addAndGet)) {
                return;
            }
            e();
            return;
        }
        if (z2 || e() || d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        e();
    }

    public final void c(a aVar, int i2, int i3) {
        while (true) {
            long j2 = f1199i.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object c2 = aVar.c();
                    while (true) {
                        if (c2 == f1202l) {
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
                if (f1199i.compareAndSet(this, j2, i4 | j3)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i2;
        h hVar;
        if (f1201k.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !e0.h.a(aVar.f1198i, this)) {
                aVar = null;
            }
            synchronized (this.f1209h) {
                i2 = (int) (f1200j.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    Object b2 = this.f1209h.b(i3);
                    e0.h.b(b2);
                    a aVar2 = (a) b2;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        l lVar = aVar2.f1191b;
                        e eVar = this.f1208g;
                        lVar.getClass();
                        h hVar2 = (h) l.f1227b.getAndSet(lVar, null);
                        if (hVar2 != null) {
                            eVar.a(hVar2);
                        }
                        while (true) {
                            h b3 = lVar.b();
                            if (b3 == null) {
                                break;
                            } else {
                                eVar.a(b3);
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
            this.f1208g.b();
            this.f1207f.b();
            while (true) {
                if (aVar != null) {
                    hVar = aVar.a(true);
                }
                hVar = (h) this.f1207f.d();
                if (hVar == null && (hVar = (h) this.f1208g.d()) == null) {
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
            f1199i.set(this, 0L);
            f1200j.set(this, 0L);
        }
    }

    public final boolean d(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f1203b;
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
        io.flutter.plugin.editing.a aVar;
        int i2;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1199i;
            long j2 = atomicLongFieldUpdater.get(this);
            a aVar2 = (a) this.f1209h.b((int) (2097151 & j2));
            if (aVar2 == null) {
                aVar2 = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object c2 = aVar2.c();
                while (true) {
                    aVar = f1202l;
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
                if (i2 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j2, j3 | i2)) {
                    aVar2.g(aVar);
                }
            }
            if (aVar2 == null) {
                return false;
            }
            if (a.f1190j.compareAndSet(aVar2, -1, 0)) {
                LockSupport.unpark(aVar2);
                return true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, j.f1224g, false);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        t tVar = this.f1209h;
        int a2 = tVar.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a2; i7++) {
            a aVar = (a) tVar.b(i7);
            if (aVar != null) {
                l lVar = aVar.f1191b;
                lVar.getClass();
                int i8 = l.f1227b.get(lVar) != null ? (l.f1228c.get(lVar) - l.f1229d.get(lVar)) + 1 : l.f1228c.get(lVar) - l.f1229d.get(lVar);
                int a3 = AbstractC0068d.a(aVar.f1193d);
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
        long j2 = f1200j.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f1206e);
        sb4.append('@');
        sb4.append(AbstractC0058t.a(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.f1203b;
        sb4.append(i9);
        sb4.append(", max = ");
        sb4.append(this.f1204c);
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
        sb4.append(this.f1207f.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f1208g.c());
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
