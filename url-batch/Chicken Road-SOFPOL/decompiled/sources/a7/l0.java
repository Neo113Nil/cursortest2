package a7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class l0 extends m0 implements a0 {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f271j = AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "_queue$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f272k = AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "_delayed$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f273l = AtomicIntegerFieldUpdater.newUpdater(l0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public void A(Runnable runnable) {
        B();
        if (!C(runnable)) {
            y.f320m.A(runnable);
            return;
        }
        Thread s5 = s();
        if (Thread.currentThread() != s5) {
            LockSupport.unpark(s5);
        }
    }

    public final void B() {
        j0 j0Var;
        k0 k0Var = (k0) f272k.get(this);
        if (k0Var == null || f7.u.f2802b.get(k0Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (k0Var) {
                try {
                    j0[] j0VarArr = k0Var.f2803a;
                    j0 j0Var2 = j0VarArr != null ? j0VarArr[0] : null;
                    if (j0Var2 != null) {
                        j0Var = ((nanoTime - j0Var2.f267d) > 0L ? 1 : ((nanoTime - j0Var2.f267d) == 0L ? 0 : -1)) >= 0 ? C(j0Var2) : false ? k0Var.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (j0Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f271j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f273l.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof f7.m)) {
                        if (obj != x.f312c) {
                            f7.m mVar = new f7.m(8, true);
                            mVar.a((Runnable) obj);
                            mVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    f7.m mVar2 = (f7.m) obj;
                    int a8 = mVar2.a(runnable);
                    if (a8 == 0) {
                        break;
                    }
                    if (a8 == 1) {
                        f7.m c8 = mVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c8) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a8 == 2) {
                        break;
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
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((f7.u.f2802b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D() {
        d6.k kVar = this.f277h;
        if (kVar != null ? kVar.isEmpty() : true) {
            k0 k0Var = (k0) f272k.get(this);
            if (k0Var != null) {
            }
            Object obj = f271j.get(this);
            if (obj != null) {
                if (obj instanceof f7.m) {
                    long j7 = f7.m.f2789f.get((f7.m) obj);
                    return ((int) (1073741823 & j7)) == ((int) ((j7 & 1152921503533105152L) >> 30));
                }
                if (obj == x.f312c) {
                }
            }
            return true;
        }
        return false;
    }

    public final void E(long j7, j0 j0Var) {
        int b8;
        Thread s5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f272k;
        if (f273l.get(this) != 0) {
            b8 = 1;
        } else {
            k0 k0Var = (k0) atomicReferenceFieldUpdater.get(this);
            if (k0Var == null) {
                k0 k0Var2 = new k0();
                k0Var2.f269c = j7;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, k0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                q6.i.b(obj);
                k0Var = (k0) obj;
            }
            b8 = j0Var.b(j7, k0Var, this);
        }
        if (b8 != 0) {
            if (b8 == 1) {
                z(j7, j0Var);
                return;
            } else {
                if (b8 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        k0 k0Var3 = (k0) atomicReferenceFieldUpdater.get(this);
        if (k0Var3 != null) {
            synchronized (k0Var3) {
                j0[] j0VarArr = k0Var3.f2803a;
                r2 = j0VarArr != null ? j0VarArr[0] : null;
            }
        }
        if (r2 != j0Var || Thread.currentThread() == (s5 = s())) {
            return;
        }
        LockSupport.unpark(s5);
    }

    @Override // a7.a0
    public e0 e(long j7, n1 n1Var, g6.h hVar) {
        return z.f325a.e(j7, n1Var, hVar);
    }

    @Override // a7.a0
    public final void f(long j7, h hVar) {
        long j8 = j7 > 0 ? j7 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j7 : 0L;
        if (j8 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            h0 h0Var = new h0(this, j8 + nanoTime, hVar);
            E(nanoTime, h0Var);
            hVar.w(new e(1, h0Var));
        }
    }

    @Override // a7.q
    public final void h(g6.h hVar, Runnable runnable) {
        A(runnable);
    }

    @Override // a7.m0
    public void shutdown() {
        j0 b8;
        l1.f274a.set(null);
        f273l.set(this, 1);
        d4.t tVar = x.f312c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f271j;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof f7.m)) {
                    if (obj != tVar) {
                        f7.m mVar = new f7.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((f7.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, tVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (x() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            k0 k0Var = (k0) f272k.get(this);
            if (k0Var == null) {
                return;
            }
            synchronized (k0Var) {
                b8 = f7.u.f2802b.get(k0Var) > 0 ? k0Var.b(0) : null;
            }
            if (b8 == null) {
                return;
            } else {
                z(nanoTime, b8);
            }
        }
    }

    @Override // a7.m0
    public final long x() {
        Runnable runnable;
        j0 j0Var;
        d4.t tVar = x.f312c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f271j;
        if (!y()) {
            B();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof f7.m)) {
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
                f7.m mVar = (f7.m) obj;
                Object d8 = mVar.d();
                if (d8 != f7.m.f2790g) {
                    runnable = (Runnable) d8;
                    break;
                }
                f7.m c8 = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c8) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            d6.k kVar = this.f277h;
            if (((kVar == null || kVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof f7.m) {
                        long j7 = f7.m.f2789f.get((f7.m) obj2);
                        if (((int) (1073741823 & j7)) != ((int) ((j7 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == tVar) {
                        return Long.MAX_VALUE;
                    }
                }
                k0 k0Var = (k0) f272k.get(this);
                if (k0Var != null) {
                    synchronized (k0Var) {
                        j0[] j0VarArr = k0Var.f2803a;
                        j0Var = j0VarArr != null ? j0VarArr[0] : null;
                    }
                    if (j0Var != null) {
                        long nanoTime = j0Var.f267d - System.nanoTime();
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
}
