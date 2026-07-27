package D4;

import G0.C0051a;
import g4.C0463h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public abstract class N extends O implements B {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f472g = AtomicReferenceFieldUpdater.newUpdater(N.class, Object.class, "_queue");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f473h = AtomicReferenceFieldUpdater.newUpdater(N.class, Object.class, "_delayed");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f474i = AtomicIntegerFieldUpdater.newUpdater(N.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // D4.AbstractC0020u
    public final void C(InterfaceC1223i interfaceC1223i, Runnable runnable) {
        N(runnable);
    }

    @Override // D4.O
    public final long K() {
        Runnable runnable;
        L l2;
        L b6;
        if (L()) {
            return 0L;
        }
        M m6 = (M) f473h.get(this);
        if (m6 != null && I4.y.f1330b.get(m6) != 0) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (m6) {
                    try {
                        L[] lArr = m6.f1331a;
                        L l6 = lArr != null ? lArr[0] : null;
                        if (l6 == null) {
                            b6 = null;
                        } else {
                            b6 = ((nanoTime - l6.f469a) > 0L ? 1 : ((nanoTime - l6.f469a) == 0L ? 0 : -1)) >= 0 ? O(l6) : false ? m6.b(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (b6 != null);
        }
        loop1: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f472g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            }
            if (!(obj instanceof I4.n)) {
                if (obj != AbstractC0024y.f550c) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop1;
                }
                break;
            }
            I4.n nVar = (I4.n) obj;
            Object d6 = nVar.d();
            if (d6 != I4.n.f1311g) {
                runnable = (Runnable) d6;
                break;
            }
            I4.n c2 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        runnable = null;
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        C0463h c0463h = this.f478e;
        if (((c0463h == null || c0463h.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f472g.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof I4.n)) {
                if (obj2 != AbstractC0024y.f550c) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j2 = I4.n.f1310f.get((I4.n) obj2);
            if (!(((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30)))) {
                return 0L;
            }
        }
        M m7 = (M) f473h.get(this);
        if (m7 != null) {
            synchronized (m7) {
                L[] lArr2 = m7.f1331a;
                l2 = lArr2 != null ? lArr2[0] : null;
            }
            if (l2 != null) {
                long nanoTime2 = l2.f469a - System.nanoTime();
                if (nanoTime2 < 0) {
                    return 0L;
                }
                return nanoTime2;
            }
        }
        return Long.MAX_VALUE;
    }

    public void N(Runnable runnable) {
        if (!O(runnable)) {
            RunnableC0025z.f560j.N(runnable);
            return;
        }
        Thread H5 = H();
        if (Thread.currentThread() != H5) {
            LockSupport.unpark(H5);
        }
    }

    public final boolean O(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f472g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f474i.get(this) != 0) {
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
            if (!(obj instanceof I4.n)) {
                if (obj == AbstractC0024y.f550c) {
                    return false;
                }
                I4.n nVar = new I4.n(8, true);
                nVar.a((Runnable) obj);
                nVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            I4.n nVar2 = (I4.n) obj;
            int a6 = nVar2.a(runnable);
            if (a6 == 0) {
                return true;
            }
            if (a6 == 1) {
                I4.n c2 = nVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (a6 == 2) {
                return false;
            }
        }
    }

    public final boolean P() {
        C0463h c0463h = this.f478e;
        if (!(c0463h != null ? c0463h.isEmpty() : true)) {
            return false;
        }
        M m6 = (M) f473h.get(this);
        if (m6 != null && I4.y.f1330b.get(m6) != 0) {
            return false;
        }
        Object obj = f472g.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof I4.n) {
            long j2 = I4.n.f1310f.get((I4.n) obj);
            if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0024y.f550c) {
            return true;
        }
        return false;
    }

    public final void Q(long j2, L l2) {
        int a6;
        Thread H5;
        boolean z = f474i.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f473h;
        if (z) {
            a6 = 1;
        } else {
            M m6 = (M) atomicReferenceFieldUpdater.get(this);
            if (m6 == null) {
                M m7 = new M();
                m7.f471c = j2;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, m7) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.i.b(obj);
                m6 = (M) obj;
            }
            a6 = l2.a(j2, m6, this);
        }
        if (a6 != 0) {
            if (a6 == 1) {
                M(j2, l2);
                return;
            } else {
                if (a6 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        M m8 = (M) atomicReferenceFieldUpdater.get(this);
        if (m8 != null) {
            synchronized (m8) {
                L[] lArr = m8.f1331a;
                r4 = lArr != null ? lArr[0] : null;
            }
        }
        if (r4 != l2 || Thread.currentThread() == (H5 = H())) {
            return;
        }
        LockSupport.unpark(H5);
    }

    @Override // D4.B
    public final void p(long j2, C0007g c0007g) {
        long j6 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j6 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            J j7 = new J(this, j6 + nanoTime, c0007g);
            Q(nanoTime, j7);
            c0007g.u(new C0005e(1, j7));
        }
    }

    @Override // D4.O
    public void shutdown() {
        L b6;
        p0.f527a.set(null);
        f474i.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f472g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C0051a c0051a = AbstractC0024y.f550c;
            if (obj != null) {
                if (!(obj instanceof I4.n)) {
                    if (obj != c0051a) {
                        I4.n nVar = new I4.n(8, true);
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
                ((I4.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0051a)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (K() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            M m6 = (M) f473h.get(this);
            if (m6 == null) {
                return;
            }
            synchronized (m6) {
                b6 = I4.y.f1330b.get(m6) > 0 ? m6.b(0) : null;
            }
            if (b6 == null) {
                return;
            } else {
                M(nanoTime, b6);
            }
        }
    }

    @Override // D4.B
    public G y(long j2, s0 s0Var, InterfaceC1223i interfaceC1223i) {
        return A.f456a.y(j2, s0Var, interfaceC1223i);
    }
}
