package x3;

import f3.InterfaceC0430h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: x3.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1533H extends AbstractC1534I implements InterfaceC1565z {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15993g = AtomicReferenceFieldUpdater.newUpdater(AbstractC1533H.class, Object.class, "_queue$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15994h = AtomicReferenceFieldUpdater.newUpdater(AbstractC1533H.class, Object.class, "_delayed$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15995i = AtomicIntegerFieldUpdater.newUpdater(AbstractC1533H.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public final boolean A() {
        d3.f fVar = this.f15999e;
        if (fVar != null ? fVar.isEmpty() : true) {
            Object obj = f15993g.get(this);
            if (obj != null) {
                if (obj instanceof C3.n) {
                    long j4 = C3.n.f308f.get((C3.n) obj);
                    return ((int) (1073741823 & j4)) == ((int) ((j4 & 1152921503533105152L) >> 30));
                }
                if (obj == AbstractC1562w.f16064b) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // x3.AbstractC1558s
    public final void s(InterfaceC0430h interfaceC0430h, Runnable runnable) {
        z(runnable);
    }

    @Override // x3.AbstractC1534I
    public void shutdown() {
        l0.f16040a.set(null);
        f15995i.set(this, 1);
        C3.v vVar = AbstractC1562w.f16064b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15993g;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof C3.n)) {
                    if (obj != vVar) {
                        C3.n nVar = new C3.n(8, true);
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
                ((C3.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, vVar)) {
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

    @Override // x3.AbstractC1534I
    public final long x() {
        Runnable runnable;
        if (!y()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15993g;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                runnable = null;
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof C3.n)) {
                    if (obj != AbstractC1562w.f16064b) {
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
                C3.n nVar = (C3.n) obj;
                Object d4 = nVar.d();
                if (d4 != C3.n.f309g) {
                    runnable = (Runnable) d4;
                    break;
                }
                C3.n c4 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            d3.f fVar = this.f15999e;
            if (((fVar == null || fVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f15993g.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof C3.n) {
                        long j4 = C3.n.f308f.get((C3.n) obj2);
                        if (((int) (1073741823 & j4)) != ((int) ((j4 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == AbstractC1562w.f16064b) {
                        return Long.MAX_VALUE;
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (java.lang.Thread.currentThread() == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        java.util.concurrent.locks.LockSupport.unpark(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15993g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f15995i.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof C3.n)) {
                    if (obj != AbstractC1562w.f16064b) {
                        C3.n nVar = new C3.n(8, true);
                        nVar.a((Runnable) obj);
                        nVar.a(runnable);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                C3.n nVar2 = (C3.n) obj;
                int a3 = nVar2.a(runnable);
                if (a3 == 0) {
                    break;
                }
                if (a3 == 1) {
                    C3.n c4 = nVar2.c();
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
        }
        RunnableC1563x.f16072j.z(runnable);
    }
}
