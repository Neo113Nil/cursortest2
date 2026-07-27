package W2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import z2.C1433q;

/* loaded from: classes.dex */
public abstract class T extends U implements E {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4236m = AtomicReferenceFieldUpdater.newUpdater(T.class, Object.class, "_queue$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4237n = AtomicReferenceFieldUpdater.newUpdater(T.class, Object.class, "_delayed$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4238o = AtomicIntegerFieldUpdater.newUpdater(T.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // W2.U
    public final long F() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b3.t tVar;
        Runnable runnable;
        Q q2;
        if (G()) {
            return 0L;
        }
        J();
        loop0: while (true) {
            atomicReferenceFieldUpdater = f4236m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            tVar = B.f4210c;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof b3.l)) {
                if (obj != tVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
                break;
            }
            b3.l lVar = (b3.l) obj;
            Object d4 = lVar.d();
            if (d4 != b3.l.f5674g) {
                runnable = (Runnable) d4;
                break;
            }
            b3.l c4 = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        runnable = null;
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        C1433q c1433q = this.f4242k;
        if (((c1433q == null || c1433q.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof b3.l)) {
                if (obj2 != tVar) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j4 = b3.l.f5673f.get((b3.l) obj2);
            if (((int) (1073741823 & j4)) != ((int) ((j4 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        S s4 = (S) f4237n.get(this);
        if (s4 != null) {
            synchronized (s4) {
                Q[] qArr = s4.f5696a;
                q2 = qArr != null ? qArr[0] : null;
            }
            if (q2 != null) {
                long nanoTime = q2.f4233d - System.nanoTime();
                if (nanoTime < 0) {
                    return 0L;
                }
                return nanoTime;
            }
        }
        return Long.MAX_VALUE;
    }

    public void I(Runnable runnable) {
        J();
        if (!K(runnable)) {
            C.f4219p.I(runnable);
            return;
        }
        Thread C3 = C();
        if (Thread.currentThread() != C3) {
            LockSupport.unpark(C3);
        }
    }

    public final void J() {
        Q q2;
        S s4 = (S) f4237n.get(this);
        if (s4 == null || b3.w.f5695b.get(s4) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (s4) {
                try {
                    Q[] qArr = s4.f5696a;
                    Q q4 = qArr != null ? qArr[0] : null;
                    if (q4 != null) {
                        q2 = ((nanoTime - q4.f4233d) > 0L ? 1 : ((nanoTime - q4.f4233d) == 0L ? 0 : -1)) >= 0 ? K(q4) : false ? s4.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (q2 != null);
    }

    public final boolean K(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4236m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f4238o.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof b3.l)) {
                if (obj == B.f4210c) {
                    return false;
                }
                b3.l lVar = new b3.l(8, true);
                lVar.a((Runnable) obj);
                lVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            b3.l lVar2 = (b3.l) obj;
            int a4 = lVar2.a(runnable);
            if (a4 == 0) {
                return true;
            }
            if (a4 == 1) {
                b3.l c4 = lVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (a4 == 2) {
                return false;
            }
        }
    }

    public final boolean L() {
        C1433q c1433q = this.f4242k;
        if (!(c1433q != null ? c1433q.isEmpty() : true)) {
            return false;
        }
        S s4 = (S) f4237n.get(this);
        if (s4 != null && b3.w.f5695b.get(s4) != 0) {
            return false;
        }
        Object obj = f4236m.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof b3.l) {
            long j4 = b3.l.f5673f.get((b3.l) obj);
            if (((int) (1073741823 & j4)) == ((int) ((j4 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == B.f4210c) {
            return true;
        }
        return false;
    }

    public final void M(long j4, Q q2) {
        int e4;
        Thread C3;
        boolean z4 = f4238o.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4237n;
        if (z4) {
            e4 = 1;
        } else {
            S s4 = (S) atomicReferenceFieldUpdater.get(this);
            if (s4 == null) {
                S s5 = new S();
                s5.f4235c = j4;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, s5) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                Intrinsics.c(obj);
                s4 = (S) obj;
            }
            e4 = q2.e(j4, s4, this);
        }
        if (e4 != 0) {
            if (e4 == 1) {
                H(j4, q2);
                return;
            } else {
                if (e4 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        S s6 = (S) atomicReferenceFieldUpdater.get(this);
        if (s6 != null) {
            synchronized (s6) {
                Q[] qArr = s6.f5696a;
                r4 = qArr != null ? qArr[0] : null;
            }
        }
        if (r4 != q2 || Thread.currentThread() == (C3 = C())) {
            return;
        }
        LockSupport.unpark(C3);
    }

    @Override // W2.E
    public final void n(long j4, C0286h c0286h) {
        long j5 = j4 > 0 ? j4 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j4 : 0L;
        if (j5 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            O o4 = new O(this, j5 + nanoTime, c0286h);
            M(nanoTime, o4);
            c0286h.w(new C0283e(2, o4));
        }
    }

    public L p(long j4, w0 w0Var, CoroutineContext coroutineContext) {
        return D.f4221a.p(j4, w0Var, coroutineContext);
    }

    @Override // W2.U
    public void shutdown() {
        Q b4;
        u0.f4294a.set(null);
        f4238o.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4236m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            b3.t tVar = B.f4210c;
            if (obj != null) {
                if (!(obj instanceof b3.l)) {
                    if (obj != tVar) {
                        b3.l lVar = new b3.l(8, true);
                        lVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((b3.l) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, tVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (F() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            S s4 = (S) f4237n.get(this);
            if (s4 == null) {
                return;
            }
            synchronized (s4) {
                b4 = b3.w.f5695b.get(s4) > 0 ? s4.b(0) : null;
            }
            if (b4 == null) {
                return;
            } else {
                H(nanoTime, b4);
            }
        }
    }

    @Override // W2.AbstractC0298u
    public final void t(CoroutineContext coroutineContext, Runnable runnable) {
        I(runnable);
    }
}
