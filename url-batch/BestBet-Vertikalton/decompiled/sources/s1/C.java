package s1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class C extends D implements InterfaceC0338v {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4009f = AtomicReferenceFieldUpdater.newUpdater(C.class, Object.class, "_queue");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4010g = AtomicReferenceFieldUpdater.newUpdater(C.class, Object.class, "_delayed");
    public static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(C.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    public final long A() {
        Runnable runnable;
        if (w()) {
            return 0L;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4009f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof w1.l)) {
                if (obj != AbstractC0335s.f4062a) {
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
            w1.l lVar = (w1.l) obj;
            Object d = lVar.d();
            if (d != w1.l.f4511g) {
                runnable = (Runnable) d;
                break;
            }
            w1.l c2 = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        Y0.h hVar = this.f4012e;
        if (((hVar == null || hVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f4009f.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof w1.l)) {
                if (obj2 != AbstractC0335s.f4062a) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j2 = w1.l.f4510f.get((w1.l) obj2);
            if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // s1.AbstractC0332o
    public final void r(b1.j jVar, Runnable runnable) {
        y(runnable);
    }

    @Override // s1.D
    public void x() {
        c0.f4036a.set(null);
        h.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4009f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            U.q qVar = AbstractC0335s.f4062a;
            if (obj != null) {
                if (!(obj instanceof w1.l)) {
                    if (obj != qVar) {
                        w1.l lVar = new w1.l(8, true);
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
                ((w1.l) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, qVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (A() <= 0) {
        }
        System.nanoTime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = u();
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
    public void y(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4009f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (h.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof w1.l)) {
                    if (obj != AbstractC0335s.f4062a) {
                        w1.l lVar = new w1.l(8, true);
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
                w1.l lVar2 = (w1.l) obj;
                int a2 = lVar2.a(runnable);
                if (a2 == 0) {
                    break;
                }
                if (a2 == 1) {
                    w1.l c2 = lVar2.c();
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
        RunnableC0336t.i.y(runnable);
    }

    public final boolean z() {
        Y0.h hVar = this.f4012e;
        if (!(hVar != null ? hVar.isEmpty() : true)) {
            return false;
        }
        Object obj = f4009f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof w1.l) {
            long j2 = w1.l.f4510f.get((w1.l) obj);
            if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0335s.f4062a) {
            return true;
        }
        return false;
    }
}
