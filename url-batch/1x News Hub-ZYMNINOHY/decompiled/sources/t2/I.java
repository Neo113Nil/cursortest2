package t2;

import c2.C0204b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C1148j;

/* loaded from: classes.dex */
public abstract class I extends J implements A {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10381g = AtomicReferenceFieldUpdater.newUpdater(I.class, Object.class, "_queue$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10382h = AtomicReferenceFieldUpdater.newUpdater(I.class, Object.class, "_delayed$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10383i = AtomicIntegerFieldUpdater.newUpdater(I.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // t2.AbstractC1208s
    public final void c(d2.h hVar, Runnable runnable) {
        n(runnable);
    }

    @Override // t2.J
    public final long j() {
        Runnable runnable;
        if (!m()) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10381g;
                Object obj = atomicReferenceFieldUpdater.get(this);
                runnable = null;
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof y2.n)) {
                    if (obj != AbstractC1212w.f10446b) {
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
                y2.n nVar = (y2.n) obj;
                Object d3 = nVar.d();
                if (d3 != y2.n.f10857g) {
                    runnable = (Runnable) d3;
                    break;
                }
                y2.n c3 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C0204b c0204b = this.f10386e;
            if (((c0204b == null || c0204b.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f10381g.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof y2.n) {
                        long j3 = y2.n.f.get((y2.n) obj2);
                        if (((int) (1073741823 & j3)) != ((int) ((j3 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == AbstractC1212w.f10446b) {
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10381g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f10383i.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof y2.n)) {
                    if (obj != AbstractC1212w.f10446b) {
                        y2.n nVar = new y2.n(8, true);
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
                y2.n nVar2 = (y2.n) obj;
                int a3 = nVar2.a(runnable);
                if (a3 == 0) {
                    break;
                }
                if (a3 == 1) {
                    y2.n c3 = nVar2.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
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
        RunnableC1213x.f10453j.n(runnable);
    }

    public final boolean o() {
        C0204b c0204b = this.f10386e;
        if (c0204b != null ? c0204b.isEmpty() : true) {
            Object obj = f10381g.get(this);
            if (obj != null) {
                if (obj instanceof y2.n) {
                    long j3 = y2.n.f.get((y2.n) obj);
                    return ((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30));
                }
                if (obj == AbstractC1212w.f10446b) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // t2.J
    public void shutdown() {
        l0.f10423a.set(null);
        f10383i.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10381g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C1148j c1148j = AbstractC1212w.f10446b;
            if (obj != null) {
                if (!(obj instanceof y2.n)) {
                    if (obj != c1148j) {
                        y2.n nVar = new y2.n(8, true);
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
                ((y2.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c1148j)) {
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
}
