package ge;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class u0 extends p0 implements f0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4404u = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "_queue$volatile");

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4405v = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "_delayed$volatile");

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4406w = AtomicIntegerFieldUpdater.newUpdater(u0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // ge.t
    public final void L(CoroutineContext coroutineContext, Runnable runnable) {
        U(runnable);
    }

    @Override // ge.p0
    public final long S() {
        Runnable runnable;
        s0 s0Var;
        a8.f fVar = a0.f4325c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4404u;
        if (!T()) {
            V();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof le.n)) {
                    if (obj != fVar) {
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
                le.n nVar = (le.n) obj;
                Object d10 = nVar.d();
                if (d10 != le.n.g) {
                    runnable = (Runnable) d10;
                    break;
                }
                le.n c10 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            kotlin.collections.s sVar = this.f4392s;
            if (((sVar == null || sVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof le.n) {
                        long j = le.n.f5990f.get((le.n) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == fVar) {
                        return Long.MAX_VALUE;
                    }
                }
                t0 t0Var = (t0) f4405v.get(this);
                if (t0Var != null) {
                    synchronized (t0Var) {
                        s0[] s0VarArr = t0Var.f6011a;
                        s0Var = s0VarArr != null ? s0VarArr[0] : null;
                    }
                    if (s0Var != null) {
                        long nanoTime = s0Var.f4398d - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void U(Runnable runnable) {
        V();
        if (!W(runnable)) {
            b0.f4334x.U(runnable);
            return;
        }
        Thread X = X();
        if (Thread.currentThread() != X) {
            LockSupport.unpark(X);
        }
    }

    public final void V() {
        s0 s0Var;
        t0 t0Var = (t0) f4405v.get(this);
        if (t0Var == null || le.y.f6010b.get(t0Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (t0Var) {
                try {
                    s0[] s0VarArr = t0Var.f6011a;
                    s0Var = null;
                    s0 s0Var2 = s0VarArr != null ? s0VarArr[0] : null;
                    if (s0Var2 != null) {
                        if (nanoTime - s0Var2.f4398d >= 0 ? W(s0Var2) : false) {
                            s0Var = t0Var.b(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (s0Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4404u;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f4406w.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof le.n)) {
                        if (obj != a0.f4325c) {
                            le.n nVar = new le.n(8, true);
                            nVar.a((Runnable) obj);
                            nVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    le.n nVar2 = (le.n) obj;
                    int a9 = nVar2.a(runnable);
                    if (a9 == 0) {
                        break;
                    }
                    if (a9 == 1) {
                        le.n c10 = nVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a9 == 2) {
                        return false;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
    }

    public abstract Thread X();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((le.y.f6010b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y() {
        kotlin.collections.s sVar = this.f4392s;
        if (sVar != null ? sVar.isEmpty() : true) {
            t0 t0Var = (t0) f4405v.get(this);
            if (t0Var != null) {
            }
            Object obj = f4404u.get(this);
            if (obj != null) {
                if (obj instanceof le.n) {
                    long j = le.n.f5990f.get((le.n) obj);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (obj == a0.f4325c) {
                }
            }
            return true;
        }
        return false;
    }

    public void Z(long j, s0 s0Var) {
        b0.f4334x.a0(j, s0Var);
    }

    public final void a0(long j, s0 s0Var) {
        int c10;
        Thread X;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4405v;
        if (f4406w.get(this) == 1) {
            c10 = 1;
        } else {
            t0 t0Var = (t0) atomicReferenceFieldUpdater.get(this);
            if (t0Var == null) {
                t0 t0Var2 = new t0();
                t0Var2.f4401c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, t0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                obj.getClass();
                t0Var = (t0) obj;
            }
            c10 = s0Var.c(j, t0Var, this);
        }
        if (c10 != 0) {
            if (c10 == 1) {
                Z(j, s0Var);
                return;
            } else {
                if (c10 == 2) {
                    return;
                }
                kotlin.collections.i0.l("unexpected result");
                return;
            }
        }
        t0 t0Var3 = (t0) atomicReferenceFieldUpdater.get(this);
        if (t0Var3 != null) {
            synchronized (t0Var3) {
                s0[] s0VarArr = t0Var3.f6011a;
                r2 = s0VarArr != null ? s0VarArr[0] : null;
            }
        }
        if (r2 != s0Var || Thread.currentThread() == (X = X())) {
            return;
        }
        LockSupport.unpark(X);
    }

    @Override // ge.f0
    public final void h(long j, h hVar) {
        long j3 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j3 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            q0 q0Var = new q0(this, j3 + nanoTime, hVar);
            a0(nanoTime, q0Var);
            hVar.v(new e(2, q0Var));
        }
    }

    @Override // ge.p0
    public void shutdown() {
        s0 b10;
        u1.f4407a.set(null);
        f4406w.set(this, 1);
        a8.f fVar = a0.f4325c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4404u;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof le.n)) {
                    if (obj != fVar) {
                        le.n nVar = new le.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((le.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, fVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (S() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            t0 t0Var = (t0) f4405v.get(this);
            if (t0Var == null) {
                return;
            }
            synchronized (t0Var) {
                b10 = le.y.f6010b.get(t0Var) > 0 ? t0Var.b(0) : null;
            }
            if (b10 == null) {
                return;
            } else {
                Z(nanoTime, b10);
            }
        }
    }
}
