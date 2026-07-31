package W0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class G extends H implements InterfaceC0084y {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f909k = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_queue");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f910l = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_delayed");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f911m = AtomicIntegerFieldUpdater.newUpdater(G.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // W0.AbstractC0078s
    public final void c(G0.i iVar, Runnable runnable) {
        n(runnable);
    }

    @Override // W0.H
    public final long k() {
        Runnable runnable;
        if (!l()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f909k;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                runnable = null;
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof b1.o)) {
                    if (obj != AbstractC0081v.f976b) {
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
                b1.o oVar = (b1.o) obj;
                Object d2 = oVar.d();
                if (d2 != b1.o.f1768g) {
                    runnable = (Runnable) d2;
                    break;
                }
                b1.o c2 = oVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            E0.d dVar = this.f915i;
            if (((dVar == null || dVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f909k.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof b1.o) {
                        long j2 = b1.o.f1767f.get((b1.o) obj2);
                        if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == AbstractC0081v.f976b) {
                        return Long.MAX_VALUE;
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = f();
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
    public void n(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f909k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f911m.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof b1.o)) {
                    if (obj != AbstractC0081v.f976b) {
                        b1.o oVar = new b1.o(8, true);
                        oVar.a((Runnable) obj);
                        oVar.a(runnable);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                b1.o oVar2 = (b1.o) obj;
                int a2 = oVar2.a(runnable);
                if (a2 == 0) {
                    break;
                }
                if (a2 == 1) {
                    b1.o c2 = oVar2.c();
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
        RunnableC0082w.f984n.n(runnable);
    }

    public final boolean o() {
        E0.d dVar = this.f915i;
        if (dVar != null ? dVar.isEmpty() : true) {
            Object obj = f909k.get(this);
            if (obj != null) {
                if (obj instanceof b1.o) {
                    long j2 = b1.o.f1767f.get((b1.o) obj);
                    return ((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30));
                }
                if (obj == AbstractC0081v.f976b) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // W0.H
    public void shutdown() {
        h0.f954a.set(null);
        f911m.set(this, 1);
        B0.E e2 = AbstractC0081v.f976b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f909k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof b1.o)) {
                    if (obj != e2) {
                        b1.o oVar = new b1.o(8, true);
                        oVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((b1.o) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, e2)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (k() <= 0) {
        }
        System.nanoTime();
    }
}
