package Y0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class G extends H implements InterfaceC0130y {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1163k = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_queue");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1164l = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_delayed");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1165m = AtomicIntegerFieldUpdater.newUpdater(G.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // Y0.AbstractC0124s
    public final void c(H0.i iVar, Runnable runnable) {
        o(runnable);
    }

    @Override // Y0.H
    public final long j() {
        Runnable runnable;
        if (l()) {
            return 0L;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1163k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof d1.o)) {
                if (obj != AbstractC0127v.f1232b) {
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
            d1.o oVar = (d1.o) obj;
            Object d2 = oVar.d();
            if (d2 != d1.o.f2095g) {
                runnable = (Runnable) d2;
                break;
            }
            d1.o c2 = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable == null) {
            return p();
        }
        runnable.run();
        return 0L;
    }

    @Override // Y0.H
    public void n() {
        h0.f1208a.set(null);
        f1165m.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1163k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            B.m mVar = AbstractC0127v.f1232b;
            if (obj != null) {
                if (!(obj instanceof d1.o)) {
                    if (obj != mVar) {
                        d1.o oVar = new d1.o(8, true);
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
                ((d1.o) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (j() <= 0) {
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1163k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f1165m.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof d1.o)) {
                    if (obj != AbstractC0127v.f1232b) {
                        d1.o oVar = new d1.o(8, true);
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
                d1.o oVar2 = (d1.o) obj;
                int a2 = oVar2.a(runnable);
                if (a2 == 0) {
                    break;
                }
                if (a2 == 1) {
                    d1.o c2 = oVar2.c();
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
        RunnableC0128w.f1240n.o(runnable);
    }

    public final long p() {
        G0.b bVar = this.f1169i;
        if (((bVar == null || bVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj = f1163k.get(this);
        if (obj != null) {
            if (!(obj instanceof d1.o)) {
                return obj == AbstractC0127v.f1232b ? Long.MAX_VALUE : 0L;
            }
            long j2 = d1.o.f2094f.get((d1.o) obj);
            if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    public final boolean q() {
        G0.b bVar = this.f1169i;
        if (!(bVar != null ? bVar.isEmpty() : true)) {
            return false;
        }
        Object obj = f1163k.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof d1.o) {
            long j2 = d1.o.f2094f.get((d1.o) obj);
            if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0127v.f1232b) {
            return true;
        }
        return false;
    }
}
