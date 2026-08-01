package r1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class D extends E implements InterfaceC0372w {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4037f = AtomicReferenceFieldUpdater.newUpdater(D.class, Object.class, "_queue");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4038g = AtomicReferenceFieldUpdater.newUpdater(D.class, Object.class, "_delayed");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4039h = AtomicIntegerFieldUpdater.newUpdater(D.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // r1.AbstractC0366p
    public final void D(a1.i iVar, Runnable runnable) {
        K(runnable);
    }

    @Override // r1.E
    public void J() {
        d0.f4066a.set(null);
        f4039h.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4037f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            V.q qVar = AbstractC0369t.f4092b;
            if (obj != null) {
                if (!(obj instanceof w1.m)) {
                    if (obj != qVar) {
                        w1.m mVar = new w1.m(8, true);
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
                ((w1.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, qVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (M() <= 0) {
        }
        System.nanoTime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = G();
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
    public void K(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4037f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f4039h.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof w1.m)) {
                    if (obj != AbstractC0369t.f4092b) {
                        w1.m mVar = new w1.m(8, true);
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
                w1.m mVar2 = (w1.m) obj;
                int a2 = mVar2.a(runnable);
                if (a2 == 0) {
                    break;
                }
                if (a2 == 1) {
                    w1.m c2 = mVar2.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else if (a2 == 2) {
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
        RunnableC0370u.i.K(runnable);
    }

    public final boolean L() {
        X0.i iVar = this.e;
        if (!(iVar != null ? iVar.isEmpty() : true)) {
            return false;
        }
        Object obj = f4037f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof w1.m) {
            long j = w1.m.f4487f.get((w1.m) obj);
            if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0369t.f4092b) {
            return true;
        }
        return false;
    }

    public final long M() {
        Runnable runnable;
        if (I()) {
            return 0L;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4037f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof w1.m)) {
                if (obj != AbstractC0369t.f4092b) {
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
            w1.m mVar = (w1.m) obj;
            Object d2 = mVar.d();
            if (d2 != w1.m.f4488g) {
                runnable = (Runnable) d2;
                break;
            }
            w1.m c2 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        X0.i iVar = this.e;
        if (((iVar == null || iVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f4037f.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof w1.m)) {
                if (obj2 != AbstractC0369t.f4092b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j = w1.m.f4487f.get((w1.m) obj2);
            if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }
}
