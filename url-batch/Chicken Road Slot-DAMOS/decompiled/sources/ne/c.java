package ne;

import a2.r;
import ge.a0;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.collections.i0;
import le.q;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7264v = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7265w = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7266x = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: y, reason: collision with root package name */
    public static final a8.f f7267y = new a8.f("NOT_IN_STACK", 3);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f7268d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7269e;

    /* renamed from: i, reason: collision with root package name */
    public final long f7270i;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: r, reason: collision with root package name */
    public final String f7271r;

    /* renamed from: s, reason: collision with root package name */
    public final f f7272s;

    /* renamed from: t, reason: collision with root package name */
    public final f f7273t;

    /* renamed from: u, reason: collision with root package name */
    public final q f7274u;

    public c(String str, int i3, int i10, long j) {
        this.f7268d = i3;
        this.f7269e = i10;
        this.f7270i = j;
        this.f7271r = str;
        if (i3 < 1) {
            r.h(n0.l.f(i3, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i10 < i3) {
            i0.d(i10, i3, " should be greater than or equals to core pool size ", "Max pool size ");
            throw null;
        }
        if (i10 > 2097150) {
            r.h(n0.l.f(i10, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f7272s = new f();
        this.f7273t = new f();
        this.f7274u = new q((i3 + 1) * 2);
        this.controlState$volatile = i3 << 42;
    }

    public static /* synthetic */ void h(c cVar, Runnable runnable, int i3) {
        cVar.d(runnable, false, (i3 & 4) == 0);
    }

    public final int a() {
        synchronized (this.f7274u) {
            try {
                if (f7266x.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f7265w;
                long j = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j & 2097151);
                int i10 = i3 - ((int) ((j & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f7268d) {
                    return 0;
                }
                if (i3 >= this.f7269e) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f7274u.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i11);
                this.f7274u.c(i11, aVar);
                if (i11 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = i10 + 1;
                aVar.start();
                return i12;
            } catch (Throwable th) {
                throw th;
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
        h hVar;
        if (f7266x.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !aVar.f7257v.equals(this)) {
                aVar = null;
            }
            synchronized (this.f7274u) {
                i3 = (int) (f7265w.get(this) & 2097151);
            }
            if (1 <= i3) {
                int i10 = 1;
                while (true) {
                    Object b10 = this.f7274u.b(i10);
                    b10.getClass();
                    a aVar2 = (a) b10;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        l lVar = aVar2.f7250d;
                        f fVar = this.f7273t;
                        lVar.getClass();
                        h hVar2 = (h) l.f7290b.getAndSet(lVar, null);
                        if (hVar2 != null) {
                            fVar.a(hVar2);
                        }
                        while (true) {
                            h b11 = lVar.b();
                            if (b11 == null) {
                                break;
                            } else {
                                fVar.a(b11);
                            }
                        }
                    }
                    if (i10 == i3) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f7273t.b();
            this.f7272s.b();
            while (true) {
                if (aVar != null) {
                    hVar = aVar.a(true);
                }
                hVar = (h) this.f7272s.d();
                if (hVar == null && (hVar = (h) this.f7273t.d()) == null) {
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
                aVar.h(b.f7262s);
            }
            f7264v.set(this, 0L);
            f7265w.set(this, 0L);
        }
    }

    public final void d(Runnable runnable, boolean z10, boolean z11) {
        h iVar;
        b bVar;
        j.f7288f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f7280d = nanoTime;
            iVar.f7281e = z10;
        } else {
            iVar = new i(runnable, nanoTime, z10);
        }
        boolean z12 = iVar.f7281e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7265w;
        long addAndGet = z12 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !aVar.f7257v.equals(this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f7252i) != b.f7262s && (iVar.f7281e || bVar != b.f7259e)) {
            aVar.f7256u = true;
            l lVar = aVar.f7250d;
            if (z11) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                h hVar = (h) l.f7290b.getAndSet(lVar, iVar);
                iVar = hVar == null ? null : lVar.a(hVar);
            }
        }
        if (iVar != null) {
            if (!(iVar.f7281e ? this.f7273t.a(iVar) : this.f7272s.a(iVar))) {
                throw new RejectedExecutionException(v4.a.o(new StringBuilder(), this.f7271r, " was terminated"));
            }
        }
        if (z12) {
            if (m() || j(addAndGet)) {
                return;
            }
            m();
            return;
        }
        if (m() || j(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        h(this, runnable, 6);
    }

    public final void i(a aVar, int i3, int i10) {
        while (true) {
            long j = f7264v.get(this);
            int i11 = (int) (2097151 & j);
            long j3 = (2097152 + j) & (-2097152);
            if (i11 == i3) {
                if (i10 == 0) {
                    Object c10 = aVar.c();
                    while (true) {
                        if (c10 == f7267y) {
                            i11 = -1;
                            break;
                        }
                        if (c10 == null) {
                            i11 = 0;
                            break;
                        }
                        a aVar2 = (a) c10;
                        int b10 = aVar2.b();
                        if (b10 != 0) {
                            i11 = b10;
                            break;
                        }
                        c10 = aVar2.c();
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (f7264v.compareAndSet(this, j, i11 | j3)) {
                    return;
                }
            }
        }
    }

    public final boolean j(long j) {
        int i3 = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i3 < 0) {
            i3 = 0;
        }
        int i10 = this.f7268d;
        if (i3 < i10) {
            int a9 = a();
            if (a9 == 1 && i10 > 1) {
                a();
            }
            if (a9 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        a8.f fVar;
        int i3;
        while (true) {
            long j = f7264v.get(this);
            a aVar = (a) this.f7274u.b((int) (2097151 & j));
            if (aVar == null) {
                aVar = null;
            } else {
                long j3 = (2097152 + j) & (-2097152);
                Object c10 = aVar.c();
                while (true) {
                    fVar = f7267y;
                    if (c10 == fVar) {
                        i3 = -1;
                        break;
                    }
                    if (c10 == null) {
                        i3 = 0;
                        break;
                    }
                    a aVar2 = (a) c10;
                    i3 = aVar2.b();
                    if (i3 != 0) {
                        break;
                    }
                    c10 = aVar2.c();
                }
                if (i3 >= 0) {
                    if (f7264v.compareAndSet(this, j, i3 | j3)) {
                        aVar.g(fVar);
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
            if (a.f7249w.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        q qVar = this.f7274u;
        int a9 = qVar.a();
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < a9; i14++) {
            a aVar = (a) qVar.b(i14);
            if (aVar != null) {
                l lVar = aVar.f7250d;
                lVar.getClass();
                int i15 = l.f7290b.get(lVar) != null ? (l.f7291c.get(lVar) - l.f7292d.get(lVar)) + 1 : l.f7291c.get(lVar) - l.f7292d.get(lVar);
                int ordinal = aVar.f7252i.ordinal();
                if (ordinal == 0) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i15);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 1) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i15);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (ordinal == 2) {
                    i11++;
                } else if (ordinal == 3) {
                    i12++;
                    if (i15 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i15);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        r.p();
                        return null;
                    }
                    i13++;
                }
            }
        }
        long j = f7265w.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f7271r);
        sb5.append('@');
        sb5.append(a0.m(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f7268d;
        sb5.append(i16);
        sb5.append(", max = ");
        sb5.append(this.f7269e);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i3);
        sb5.append(", blocking = ");
        sb5.append(i10);
        sb5.append(", parked = ");
        sb5.append(i11);
        sb5.append(", dormant = ");
        sb5.append(i12);
        sb5.append(", terminated = ");
        sb5.append(i13);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f7272s.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f7273t.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
