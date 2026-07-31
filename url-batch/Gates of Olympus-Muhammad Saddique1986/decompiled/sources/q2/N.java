package q2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class N extends O implements B {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7862j = AtomicReferenceFieldUpdater.newUpdater(N.class, Object.class, "_queue$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7863k = AtomicReferenceFieldUpdater.newUpdater(N.class, Object.class, "_delayed$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7864l = AtomicIntegerFieldUpdater.newUpdater(N.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // q2.AbstractC0831s
    public final void D(V1.i iVar, Runnable runnable) {
        Q(runnable);
    }

    @Override // q2.O
    public final long M() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m1.q qVar;
        Runnable runnable;
        L l3;
        if (N()) {
            return 0L;
        }
        R();
        loop0: while (true) {
            atomicReferenceFieldUpdater = f7862j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            qVar = AbstractC0837y.f7942c;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof v2.l)) {
                if (obj != qVar) {
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
            v2.l lVar = (v2.l) obj;
            Object d3 = lVar.d();
            if (d3 != v2.l.f9814g) {
                runnable = (Runnable) d3;
                break;
            }
            v2.l c2 = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        runnable = null;
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        S1.j jVar = this.f7868h;
        if (((jVar == null || jVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof v2.l)) {
                if (obj2 != qVar) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j3 = v2.l.f9813f.get((v2.l) obj2);
            if (((int) (1073741823 & j3)) != ((int) ((j3 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        M m3 = (M) f7863k.get(this);
        if (m3 != null) {
            synchronized (m3) {
                L[] lArr = m3.f9830a;
                l3 = lArr != null ? lArr[0] : null;
            }
            if (l3 != null) {
                long nanoTime = l3.f7859d - System.nanoTime();
                if (nanoTime < 0) {
                    return 0L;
                }
                return nanoTime;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // q2.O
    public void P() {
        L b3;
        p0.f7918a.set(null);
        f7864l.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7862j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            m1.q qVar = AbstractC0837y.f7942c;
            if (obj != null) {
                if (!(obj instanceof v2.l)) {
                    if (obj != qVar) {
                        v2.l lVar = new v2.l(8, true);
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
                ((v2.l) obj).b();
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
        long nanoTime = System.nanoTime();
        while (true) {
            M m3 = (M) f7863k.get(this);
            if (m3 == null) {
                return;
            }
            synchronized (m3) {
                b3 = v2.u.f9829b.get(m3) > 0 ? m3.b(0) : null;
            }
            if (b3 == null) {
                return;
            } else {
                O(nanoTime, b3);
            }
        }
    }

    public void Q(Runnable runnable) {
        R();
        if (!S(runnable)) {
            RunnableC0838z.f7950m.Q(runnable);
            return;
        }
        Thread J3 = J();
        if (Thread.currentThread() != J3) {
            LockSupport.unpark(J3);
        }
    }

    public final void R() {
        L l3;
        M m3 = (M) f7863k.get(this);
        if (m3 == null || v2.u.f9829b.get(m3) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (m3) {
                try {
                    L[] lArr = m3.f9830a;
                    L l4 = lArr != null ? lArr[0] : null;
                    if (l4 != null) {
                        l3 = ((nanoTime - l4.f7859d) > 0L ? 1 : ((nanoTime - l4.f7859d) == 0L ? 0 : -1)) >= 0 ? S(l4) : false ? m3.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (l3 != null);
    }

    public final boolean S(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7862j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f7864l.get(this) != 0) {
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
            if (!(obj instanceof v2.l)) {
                if (obj == AbstractC0837y.f7942c) {
                    return false;
                }
                v2.l lVar = new v2.l(8, true);
                lVar.a((Runnable) obj);
                lVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            v2.l lVar2 = (v2.l) obj;
            int a3 = lVar2.a(runnable);
            if (a3 == 0) {
                return true;
            }
            if (a3 == 1) {
                v2.l c2 = lVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (a3 == 2) {
                return false;
            }
        }
    }

    public final boolean T() {
        S1.j jVar = this.f7868h;
        if (!(jVar != null ? jVar.isEmpty() : true)) {
            return false;
        }
        M m3 = (M) f7863k.get(this);
        if (m3 != null && v2.u.f9829b.get(m3) != 0) {
            return false;
        }
        Object obj = f7862j.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof v2.l) {
            long j3 = v2.l.f9813f.get((v2.l) obj);
            if (((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0837y.f7942c) {
            return true;
        }
        return false;
    }

    public final void U(long j3, L l3) {
        int b3;
        Thread J3;
        boolean z3 = f7864l.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7863k;
        if (z3) {
            b3 = 1;
        } else {
            M m3 = (M) atomicReferenceFieldUpdater.get(this);
            if (m3 == null) {
                M m4 = new M();
                m4.f7861c = j3;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, m4) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                f2.j.c(obj);
                m3 = (M) obj;
            }
            b3 = l3.b(j3, m3, this);
        }
        if (b3 != 0) {
            if (b3 == 1) {
                O(j3, l3);
                return;
            } else {
                if (b3 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        M m5 = (M) atomicReferenceFieldUpdater.get(this);
        if (m5 != null) {
            synchronized (m5) {
                L[] lArr = m5.f9830a;
                r4 = lArr != null ? lArr[0] : null;
            }
        }
        if (r4 != l3 || Thread.currentThread() == (J3 = J())) {
            return;
        }
        LockSupport.unpark(J3);
    }

    @Override // q2.B
    public final void q(long j3, C0821h c0821h) {
        long j4 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j4 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            J j5 = new J(this, j4 + nanoTime, c0821h);
            U(nanoTime, j5);
            c0821h.w(new C0818e(2, j5));
        }
    }

    @Override // q2.B
    public G u(long j3, r0 r0Var, V1.i iVar) {
        return AbstractC0813A.f7848a.u(j3, r0Var, iVar);
    }
}
