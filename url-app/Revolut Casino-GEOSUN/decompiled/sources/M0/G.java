package M0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class G extends H implements InterfaceC0066y {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f620k = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_queue");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f621l = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_delayed");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f622m = AtomicIntegerFieldUpdater.newUpdater(G.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // M0.AbstractC0060s
    public final void c(w0.i iVar, Runnable runnable) {
        o(runnable);
    }

    @Override // M0.H
    public final long l() {
        Runnable runnable;
        if (m()) {
            return 0L;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f620k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof R0.o)) {
                if (obj != AbstractC0063v.f689b) {
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
            R0.o oVar = (R0.o) obj;
            Object d2 = oVar.d();
            if (d2 != R0.o.f926g) {
                runnable = (Runnable) d2;
                break;
            }
            R0.o c2 = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        v0.b bVar = this.f626i;
        if (((bVar == null || bVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f620k.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof R0.o)) {
                if (obj2 != AbstractC0063v.f689b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j2 = R0.o.f925f.get((R0.o) obj2);
            if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // M0.H
    public void n() {
        h0.f665a.set(null);
        f622m.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f620k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            A.j jVar = AbstractC0063v.f689b;
            if (obj != null) {
                if (!(obj instanceof R0.o)) {
                    if (obj != jVar) {
                        R0.o oVar = new R0.o(8, true);
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
                ((R0.o) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, jVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (l() <= 0) {
        }
        System.nanoTime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = g();
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
    public void o(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f620k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f622m.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof R0.o)) {
                    if (obj != AbstractC0063v.f689b) {
                        R0.o oVar = new R0.o(8, true);
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
                R0.o oVar2 = (R0.o) obj;
                int a2 = oVar2.a(runnable);
                if (a2 == 0) {
                    break;
                }
                if (a2 == 1) {
                    R0.o c2 = oVar2.c();
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
        RunnableC0064w.f697n.o(runnable);
    }

    public final boolean p() {
        v0.b bVar = this.f626i;
        if (!(bVar != null ? bVar.isEmpty() : true)) {
            return false;
        }
        Object obj = f620k.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof R0.o) {
            long j2 = R0.o.f925f.get((R0.o) obj);
            if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0063v.f689b) {
            return true;
        }
        return false;
    }
}
