package n6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.collections.C0633l;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import l0.C0654a;

/* loaded from: classes.dex */
public abstract class O extends P implements InterfaceC0765C {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7023o = AtomicReferenceFieldUpdater.newUpdater(O.class, Object.class, "_queue$volatile");

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7024p = AtomicReferenceFieldUpdater.newUpdater(O.class, Object.class, "_delayed$volatile");

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7025q = AtomicIntegerFieldUpdater.newUpdater(O.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // n6.AbstractC0786t
    public final void E(CoroutineContext coroutineContext, Runnable runnable) {
        P(runnable);
    }

    @Override // n6.P
    public final long M() {
        Runnable runnable;
        M m2;
        C0654a c0654a = AbstractC0792z.f7097c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7023o;
        if (!N()) {
            Q();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof s6.m)) {
                    if (obj != c0654a) {
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
                s6.m mVar = (s6.m) obj;
                Object d7 = mVar.d();
                if (d7 != s6.m.f7845g) {
                    runnable = (Runnable) d7;
                    break;
                }
                s6.m c7 = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c7) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C0633l c0633l = this.f7029m;
            if (((c0633l == null || c0633l.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof s6.m) {
                        long j = s6.m.f7844f.get((s6.m) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == c0654a) {
                        return Long.MAX_VALUE;
                    }
                }
                N n7 = (N) f7024p.get(this);
                if (n7 != null) {
                    synchronized (n7) {
                        M[] mArr = n7.f7862a;
                        m2 = mArr != null ? mArr[0] : null;
                    }
                    if (m2 != null) {
                        long nanoTime = m2.f7020d - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void P(Runnable runnable) {
        Q();
        if (!R(runnable)) {
            RunnableC0763A.f7006r.P(runnable);
            return;
        }
        Thread K7 = K();
        if (Thread.currentThread() != K7) {
            LockSupport.unpark(K7);
        }
    }

    public final void Q() {
        M m2;
        N n7 = (N) f7024p.get(this);
        if (n7 == null || s6.v.f7861b.get(n7) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (n7) {
                try {
                    M[] mArr = n7.f7862a;
                    M m7 = mArr != null ? mArr[0] : null;
                    if (m7 != null) {
                        m2 = ((nanoTime - m7.f7020d) > 0L ? 1 : ((nanoTime - m7.f7020d) == 0L ? 0 : -1)) >= 0 ? R(m7) : false ? n7.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (m2 != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean R(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7023o;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f7025q.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof s6.m)) {
                        if (obj != AbstractC0792z.f7097c) {
                            s6.m mVar = new s6.m(8, true);
                            mVar.a((Runnable) obj);
                            mVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    s6.m mVar2 = (s6.m) obj;
                    int a7 = mVar2.a(runnable);
                    if (a7 == 0) {
                        break;
                    }
                    if (a7 == 1) {
                        s6.m c7 = mVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c7) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a7 == 2) {
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
            } else {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((s6.v.f7861b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S() {
        C0633l c0633l = this.f7029m;
        if (c0633l != null ? c0633l.isEmpty() : true) {
            N n7 = (N) f7024p.get(this);
            if (n7 != null) {
            }
            Object obj = f7023o.get(this);
            if (obj != null) {
                if (obj instanceof s6.m) {
                    long j = s6.m.f7844f.get((s6.m) obj);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (obj == AbstractC0792z.f7097c) {
                }
            }
            return true;
        }
        return false;
    }

    public final void T(long j, M m2) {
        int a7;
        Thread K7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7024p;
        if (f7025q.get(this) != 0) {
            a7 = 1;
        } else {
            N n7 = (N) atomicReferenceFieldUpdater.get(this);
            if (n7 == null) {
                N n8 = new N();
                n8.f7022c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, n8) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                Intrinsics.b(obj);
                n7 = (N) obj;
            }
            a7 = m2.a(j, n7, this);
        }
        if (a7 != 0) {
            if (a7 == 1) {
                O(j, m2);
                return;
            } else {
                if (a7 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        N n9 = (N) atomicReferenceFieldUpdater.get(this);
        if (n9 != null) {
            synchronized (n9) {
                M[] mArr = n9.f7862a;
                r2 = mArr != null ? mArr[0] : null;
            }
        }
        if (r2 != m2 || Thread.currentThread() == (K7 = K())) {
            return;
        }
        LockSupport.unpark(K7);
    }

    @Override // n6.InterfaceC0765C
    public final void h(long j, C0775h c0775h) {
        long j7 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j7 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            K k7 = new K(this, j7 + nanoTime, c0775h);
            T(nanoTime, k7);
            c0775h.v(new C0772e(2, k7));
        }
    }

    public H s(long j, r0 r0Var, CoroutineContext coroutineContext) {
        return AbstractC0764B.f7008a.s(j, r0Var, coroutineContext);
    }

    @Override // n6.P
    public void shutdown() {
        M b7;
        o0.f7069a.set(null);
        f7025q.set(this, 1);
        C0654a c0654a = AbstractC0792z.f7097c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7023o;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof s6.m)) {
                    if (obj != c0654a) {
                        s6.m mVar = new s6.m(8, true);
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
                ((s6.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0654a)) {
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
            N n7 = (N) f7024p.get(this);
            if (n7 == null) {
                return;
            }
            synchronized (n7) {
                b7 = s6.v.f7861b.get(n7) > 0 ? n7.b(0) : null;
            }
            if (b7 == null) {
                return;
            } else {
                O(nanoTime, b7);
            }
        }
    }
}
