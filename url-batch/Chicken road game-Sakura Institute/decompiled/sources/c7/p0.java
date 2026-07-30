package c7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class p0 extends q0 implements d0 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1726l = AtomicReferenceFieldUpdater.newUpdater(p0.class, Object.class, "_queue$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1727m = AtomicReferenceFieldUpdater.newUpdater(p0.class, Object.class, "_delayed$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1728n = AtomicIntegerFieldUpdater.newUpdater(p0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public i0 U(long j8, r1 r1Var, h6.i iVar) {
        return c0.f1677a.U(j8, r1Var, iVar);
    }

    @Override // c7.t
    public final void V(h6.i iVar, Runnable runnable) {
        g0(runnable);
    }

    @Override // c7.q0
    public final long d0() {
        Runnable runnable;
        n0 n0Var;
        h7.s sVar = a0.f1662c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1726l;
        if (!e0()) {
            h0();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof h7.l)) {
                    if (obj != sVar) {
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
                h7.l lVar = (h7.l) obj;
                Object d8 = lVar.d();
                if (d8 != h7.l.f4695g) {
                    runnable = (Runnable) d8;
                    break;
                }
                h7.l c4 = lVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            e6.j jVar = this.f1734j;
            if (((jVar == null || jVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof h7.l) {
                        long j8 = h7.l.f4694f.get((h7.l) obj2);
                        if (((int) (1073741823 & j8)) != ((int) ((j8 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == sVar) {
                        return Long.MAX_VALUE;
                    }
                }
                o0 o0Var = (o0) f1727m.get(this);
                if (o0Var != null) {
                    synchronized (o0Var) {
                        n0[] n0VarArr = o0Var.f4710a;
                        n0Var = n0VarArr != null ? n0VarArr[0] : null;
                    }
                    if (n0Var != null) {
                        long nanoTime = n0Var.f1716f - System.nanoTime();
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

    public void g0(Runnable runnable) {
        h0();
        if (!i0(runnable)) {
            b0.f1672o.g0(runnable);
            return;
        }
        Thread b0 = b0();
        if (Thread.currentThread() != b0) {
            LockSupport.unpark(b0);
        }
    }

    public final void h0() {
        n0 n0Var;
        o0 o0Var = (o0) f1727m.get(this);
        if (o0Var == null || h7.u.f4709b.get(o0Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (o0Var) {
                try {
                    n0[] n0VarArr = o0Var.f4710a;
                    n0 n0Var2 = n0VarArr != null ? n0VarArr[0] : null;
                    if (n0Var2 != null) {
                        n0Var = ((nanoTime - n0Var2.f1716f) > 0L ? 1 : ((nanoTime - n0Var2.f1716f) == 0L ? 0 : -1)) >= 0 ? i0(n0Var2) : false ? o0Var.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (n0Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i0(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1726l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f1728n.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof h7.l)) {
                        if (obj != a0.f1662c) {
                            h7.l lVar = new h7.l(8, true);
                            lVar.a((Runnable) obj);
                            lVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    h7.l lVar2 = (h7.l) obj;
                    int a3 = lVar2.a(runnable);
                    if (a3 == 0) {
                        break;
                    }
                    if (a3 == 1) {
                        h7.l c4 = lVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a3 == 2) {
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
    
        if ((h7.u.f4709b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j0() {
        e6.j jVar = this.f1734j;
        if (jVar != null ? jVar.isEmpty() : true) {
            o0 o0Var = (o0) f1727m.get(this);
            if (o0Var != null) {
            }
            Object obj = f1726l.get(this);
            if (obj != null) {
                if (obj instanceof h7.l) {
                    long j8 = h7.l.f4694f.get((h7.l) obj);
                    return ((int) (1073741823 & j8)) == ((int) ((j8 & 1152921503533105152L) >> 30));
                }
                if (obj == a0.f1662c) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // c7.d0
    public final void k(long j8, h hVar) {
        long j9 = j8 > 0 ? j8 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j8 : 0L;
        if (j9 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            l0 l0Var = new l0(this, j9 + nanoTime, hVar);
            k0(nanoTime, l0Var);
            hVar.u(new e(2, l0Var));
        }
    }

    public final void k0(long j8, n0 n0Var) {
        int g9;
        Thread b0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1727m;
        if (f1728n.get(this) != 0) {
            g9 = 1;
        } else {
            o0 o0Var = (o0) atomicReferenceFieldUpdater.get(this);
            if (o0Var == null) {
                o0 o0Var2 = new o0();
                o0Var2.f1723c = j8;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, o0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                r6.k.c(obj);
                o0Var = (o0) obj;
            }
            g9 = n0Var.g(j8, o0Var, this);
        }
        if (g9 != 0) {
            if (g9 == 1) {
                f0(j8, n0Var);
                return;
            } else {
                if (g9 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        o0 o0Var3 = (o0) atomicReferenceFieldUpdater.get(this);
        if (o0Var3 != null) {
            synchronized (o0Var3) {
                n0[] n0VarArr = o0Var3.f4710a;
                r2 = n0VarArr != null ? n0VarArr[0] : null;
            }
        }
        if (r2 != n0Var || Thread.currentThread() == (b0 = b0())) {
            return;
        }
        LockSupport.unpark(b0);
    }

    @Override // c7.q0
    public void shutdown() {
        n0 b9;
        p1.f1729a.set(null);
        f1728n.set(this, 1);
        h7.s sVar = a0.f1662c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1726l;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof h7.l)) {
                    if (obj != sVar) {
                        h7.l lVar = new h7.l(8, true);
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
                ((h7.l) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, sVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (d0() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            o0 o0Var = (o0) f1727m.get(this);
            if (o0Var == null) {
                return;
            }
            synchronized (o0Var) {
                b9 = h7.u.f4709b.get(o0Var) > 0 ? o0Var.b(0) : null;
            }
            if (b9 == null) {
                return;
            } else {
                f0(nanoTime, b9);
            }
        }
    }
}
