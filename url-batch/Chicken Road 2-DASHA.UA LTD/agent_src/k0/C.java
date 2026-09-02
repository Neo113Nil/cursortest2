package k0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class C extends D implements InterfaceC0063w {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f824g = AtomicReferenceFieldUpdater.newUpdater(C.class, Object.class, "_queue");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f825h = AtomicReferenceFieldUpdater.newUpdater(C.class, Object.class, "_delayed");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f826i = AtomicIntegerFieldUpdater.newUpdater(C.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // k0.AbstractC0057p
    public final void d(W.i iVar, Runnable runnable) {
        n(runnable);
    }

    @Override // k0.D
    public void m() {
        a0.f854a.set(null);
        f826i.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f824g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            io.flutter.plugin.platform.c cVar = AbstractC0060t.f885b;
            if (obj != null) {
                if (!(obj instanceof p0.o)) {
                    if (obj != cVar) {
                        p0.o oVar = new p0.o(8, true);
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
                ((p0.o) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, cVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (p() <= 0) {
        }
        System.nanoTime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = i();
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f824g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f826i.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof p0.o)) {
                    if (obj != AbstractC0060t.f885b) {
                        p0.o oVar = new p0.o(8, true);
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
                p0.o oVar2 = (p0.o) obj;
                int a2 = oVar2.a(runnable);
                if (a2 == 0) {
                    break;
                }
                if (a2 == 1) {
                    p0.o c2 = oVar2.c();
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
        RunnableC0061u.f893j.n(runnable);
    }

    public final boolean o() {
        V.c cVar = this.f829f;
        if (!(cVar != null ? cVar.isEmpty() : true)) {
            return false;
        }
        Object obj = f824g.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof p0.o) {
            long j2 = p0.o.f1158f.get((p0.o) obj);
            if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0060t.f885b) {
            return true;
        }
        return false;
    }

    public final long p() {
        Runnable runnable;
        if (l()) {
            return 0L;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f824g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof p0.o)) {
                if (obj != AbstractC0060t.f885b) {
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
            p0.o oVar = (p0.o) obj;
            Object d2 = oVar.d();
            if (d2 != p0.o.f1159g) {
                runnable = (Runnable) d2;
                break;
            }
            p0.o c2 = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        V.c cVar = this.f829f;
        if (((cVar == null || cVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f824g.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof p0.o)) {
                if (obj2 != AbstractC0060t.f885b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j2 = p0.o.f1158f.get((p0.o) obj2);
            if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }
}
