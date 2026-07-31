package k2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class N extends O implements B {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5323j = AtomicReferenceFieldUpdater.newUpdater(N.class, Object.class, "_queue$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5324k = AtomicReferenceFieldUpdater.newUpdater(N.class, Object.class, "_delayed$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5325l = AtomicIntegerFieldUpdater.newUpdater(N.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // k2.AbstractC0546s
    public final void P(P1.i iVar, Runnable runnable) {
        b0(runnable);
    }

    @Override // k2.O
    public final long X() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j1.p pVar;
        Runnable runnable;
        L l3;
        if (Y()) {
            return 0L;
        }
        c0();
        loop0: while (true) {
            atomicReferenceFieldUpdater = f5323j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            pVar = AbstractC0552y.f5402c;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof p2.m)) {
                if (obj != pVar) {
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
            p2.m mVar = (p2.m) obj;
            Object d3 = mVar.d();
            if (d3 != p2.m.f6794g) {
                runnable = (Runnable) d3;
                break;
            }
            p2.m c3 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        runnable = null;
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        M1.j jVar = this.f5329h;
        if (((jVar == null || jVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof p2.m)) {
                if (obj2 != pVar) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j3 = p2.m.f6793f.get((p2.m) obj2);
            if (((int) (1073741823 & j3)) != ((int) ((j3 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        M m3 = (M) f5324k.get(this);
        if (m3 != null) {
            synchronized (m3) {
                L[] lArr = m3.f6810a;
                l3 = lArr != null ? lArr[0] : null;
            }
            if (l3 != null) {
                long nanoTime = l3.f5320d - System.nanoTime();
                if (nanoTime < 0) {
                    return 0L;
                }
                return nanoTime;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // k2.O
    public void a0() {
        L b2;
        p0.f5379a.set(null);
        f5325l.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5323j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            j1.p pVar = AbstractC0552y.f5402c;
            if (obj != null) {
                if (!(obj instanceof p2.m)) {
                    if (obj != pVar) {
                        p2.m mVar = new p2.m(8, true);
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
                ((p2.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, pVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (X() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            M m3 = (M) f5324k.get(this);
            if (m3 == null) {
                return;
            }
            synchronized (m3) {
                b2 = p2.v.f6809b.get(m3) > 0 ? m3.b(0) : null;
            }
            if (b2 == null) {
                return;
            } else {
                Z(nanoTime, b2);
            }
        }
    }

    public void b0(Runnable runnable) {
        c0();
        if (!d0(runnable)) {
            RunnableC0553z.f5410m.b0(runnable);
            return;
        }
        Thread U2 = U();
        if (Thread.currentThread() != U2) {
            LockSupport.unpark(U2);
        }
    }

    public final void c0() {
        L l3;
        M m3 = (M) f5324k.get(this);
        if (m3 == null || p2.v.f6809b.get(m3) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (m3) {
                try {
                    L[] lArr = m3.f6810a;
                    L l4 = lArr != null ? lArr[0] : null;
                    if (l4 != null) {
                        l3 = ((nanoTime - l4.f5320d) > 0L ? 1 : ((nanoTime - l4.f5320d) == 0L ? 0 : -1)) >= 0 ? d0(l4) : false ? m3.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (l3 != null);
    }

    public final boolean d0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5323j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f5325l.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof p2.m)) {
                if (obj == AbstractC0552y.f5402c) {
                    return false;
                }
                p2.m mVar = new p2.m(8, true);
                mVar.a((Runnable) obj);
                mVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            p2.m mVar2 = (p2.m) obj;
            int a3 = mVar2.a(runnable);
            if (a3 == 0) {
                return true;
            }
            if (a3 == 1) {
                p2.m c3 = mVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (a3 == 2) {
                return false;
            }
        }
    }

    public final boolean e0() {
        M1.j jVar = this.f5329h;
        if (!(jVar != null ? jVar.isEmpty() : true)) {
            return false;
        }
        M m3 = (M) f5324k.get(this);
        if (m3 != null && p2.v.f6809b.get(m3) != 0) {
            return false;
        }
        Object obj = f5323j.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof p2.m) {
            long j3 = p2.m.f6793f.get((p2.m) obj);
            if (((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0552y.f5402c) {
            return true;
        }
        return false;
    }

    public final void f0(long j3, L l3) {
        int b2;
        Thread U2;
        boolean z3 = f5325l.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5324k;
        if (z3) {
            b2 = 1;
        } else {
            M m3 = (M) atomicReferenceFieldUpdater.get(this);
            if (m3 == null) {
                M m4 = new M();
                m4.f5322c = j3;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, m4) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                Z1.i.c(obj);
                m3 = (M) obj;
            }
            b2 = l3.b(j3, m3, this);
        }
        if (b2 != 0) {
            if (b2 == 1) {
                Z(j3, l3);
                return;
            } else {
                if (b2 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        M m5 = (M) atomicReferenceFieldUpdater.get(this);
        if (m5 != null) {
            synchronized (m5) {
                L[] lArr = m5.f6810a;
                r4 = lArr != null ? lArr[0] : null;
            }
        }
        if (r4 != l3 || Thread.currentThread() == (U2 = U())) {
            return;
        }
        LockSupport.unpark(U2);
    }

    @Override // k2.B
    public G i(long j3, r0 r0Var, P1.i iVar) {
        return AbstractC0528A.f5309a.i(j3, r0Var, iVar);
    }

    @Override // k2.B
    public final void u(long j3, C0536h c0536h) {
        long j4 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j4 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            J j5 = new J(this, j4 + nanoTime, c0536h);
            f0(nanoTime, j5);
            c0536h.u(new C0533e(2, j5));
        }
    }
}
