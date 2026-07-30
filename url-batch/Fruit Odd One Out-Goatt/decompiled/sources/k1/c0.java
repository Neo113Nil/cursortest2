package k1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class c0 extends p implements w {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f665g = AtomicReferenceFieldUpdater.newUpdater(c0.class, Object.class, "_queue");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f666h = AtomicReferenceFieldUpdater.newUpdater(c0.class, Object.class, "_delayed");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f667i = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* renamed from: d, reason: collision with root package name */
    public long f668d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f669e;

    /* renamed from: f, reason: collision with root package name */
    public u0.b f670f;

    @Override // k1.p
    public final void b(v0.h hVar, Runnable runnable) {
        e(runnable);
    }

    public final void d() {
        long j2 = this.f668d - 4294967296L;
        this.f668d = j2;
        if (j2 <= 0 && this.f669e) {
            shutdown();
        }
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
    public void e(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f665g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f667i.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof p1.o)) {
                    if (obj != t.f718b) {
                        p1.o oVar = new p1.o(8, true);
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
                p1.o oVar2 = (p1.o) obj;
                int a2 = oVar2.a(runnable);
                if (a2 == 0) {
                    break;
                }
                if (a2 == 1) {
                    p1.o c2 = oVar2.c();
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
        u.f726j.e(runnable);
    }

    public abstract Thread f();

    public final void g(boolean z2) {
        this.f668d = (z2 ? 4294967296L : 1L) + this.f668d;
        if (z2) {
            return;
        }
        this.f669e = true;
    }

    public final boolean k() {
        u0.b bVar = this.f670f;
        if (bVar != null ? bVar.isEmpty() : true) {
            Object obj = f665g.get(this);
            if (obj != null) {
                if (obj instanceof p1.o) {
                    long j2 = p1.o.f1065f.get((p1.o) obj);
                    return ((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30));
                }
                if (obj == t.f718b) {
                }
            }
            return true;
        }
        return false;
    }

    public final long l() {
        Runnable runnable;
        if (!m()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f665g;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                runnable = null;
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof p1.o)) {
                    if (obj != t.f718b) {
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
                p1.o oVar = (p1.o) obj;
                Object d2 = oVar.d();
                if (d2 != p1.o.f1066g) {
                    runnable = (Runnable) d2;
                    break;
                }
                p1.o c2 = oVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            u0.b bVar = this.f670f;
            if (((bVar == null || bVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f665g.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof p1.o) {
                        long j2 = p1.o.f1065f.get((p1.o) obj2);
                        if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == t.f718b) {
                        return Long.MAX_VALUE;
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public final boolean m() {
        u0.b bVar = this.f670f;
        if (bVar == null) {
            return false;
        }
        x xVar = (x) (bVar.isEmpty() ? null : bVar.removeFirst());
        if (xVar == null) {
            return false;
        }
        xVar.run();
        return true;
    }

    public void shutdown() {
        ThreadLocal threadLocal = v0.f729a;
        v0.f729a.set(null);
        f667i.set(this, 1);
        o0.a aVar = t.f718b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f665g;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof p1.o)) {
                    if (obj != aVar) {
                        p1.o oVar = new p1.o(8, true);
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
                ((p1.o) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
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
}
