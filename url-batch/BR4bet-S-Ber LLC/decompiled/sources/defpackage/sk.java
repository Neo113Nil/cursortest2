package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class sk extends bf implements ah {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(sk.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(sk.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(sk.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;
    public long h;
    public boolean i;
    public q6 j;

    @Override // defpackage.bf
    public final void q(ye yeVar, Runnable runnable) {
        u(runnable);
    }

    public void shutdown() {
        ThreadLocal threadLocal = a90.a;
        a90.a.set(null);
        m.set(this, 1);
        xj xjVar = xf.i;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof cu)) {
                    if (obj != xjVar) {
                        cu cuVar = new cu(8, true);
                        cuVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, cuVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((cu) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, xjVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (x() <= 0) {
        }
        System.nanoTime();
    }

    public final void t() {
        long j = this.h - 4294967296L;
        this.h = j;
        if (j <= 0 && this.i) {
            shutdown();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        r5 = v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (java.lang.Thread.currentThread() == r5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        java.util.concurrent.locks.LockSupport.unpark(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof cu)) {
                    if (obj != xf.i) {
                        cu cuVar = new cu(8, true);
                        cuVar.a((Runnable) obj);
                        cuVar.a(runnable);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, cuVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                cu cuVar2 = (cu) obj;
                int a = cuVar2.a(runnable);
                if (a == 0) {
                    break;
                }
                if (a == 1) {
                    cu c = cuVar2.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else if (a == 2) {
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
        }
        bg.n.u(runnable);
    }

    public abstract Thread v();

    public final boolean w() {
        q6 q6Var = this.j;
        if (q6Var != null ? q6Var.isEmpty() : true) {
            Object obj = k.get(this);
            if (obj != null) {
                if (obj instanceof cu) {
                    long j = cu.f.get((cu) obj);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (obj == xf.i) {
                }
            }
            return true;
        }
        return false;
    }

    public final long x() {
        Runnable runnable;
        if (!y()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                runnable = null;
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof cu)) {
                    if (obj != xf.i) {
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
                cu cuVar = (cu) obj;
                Object d = cuVar.d();
                if (d != cu.g) {
                    runnable = (Runnable) d;
                    break;
                }
                cu c = cuVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            q6 q6Var = this.j;
            if (((q6Var == null || q6Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = k.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof cu) {
                        long j = cu.f.get((cu) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == xf.i) {
                        return Long.MAX_VALUE;
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public final boolean y() {
        q6 q6Var = this.j;
        if (q6Var == null) {
            return false;
        }
        yh yhVar = (yh) (q6Var.isEmpty() ? null : q6Var.removeFirst());
        if (yhVar == null) {
            return false;
        }
        yhVar.run();
        return true;
    }
}
