package H5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import l5.C0504h;
import o5.InterfaceC0569i;

/* loaded from: classes.dex */
public abstract class O extends P implements C {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1040l = AtomicReferenceFieldUpdater.newUpdater(O.class, Object.class, "_queue");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1041m = AtomicReferenceFieldUpdater.newUpdater(O.class, Object.class, "_delayed");

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1042n = AtomicIntegerFieldUpdater.newUpdater(O.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // H5.AbstractC0161v
    public final void F(InterfaceC0569i interfaceC0569i, Runnable runnable) {
        P(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d1, code lost:
    
        if ((((int) (1073741823 & r7)) == ((int) ((r7 & 1152921503533105152L) >> 30))) == false) goto L97;
     */
    @Override // H5.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long M() {
        Runnable runnable;
        M m4;
        M b7;
        if (!N()) {
            N n7 = (N) f1041m.get(this);
            if (n7 != null && M5.y.f1631b.get(n7) != 0) {
                long nanoTime = System.nanoTime();
                do {
                    synchronized (n7) {
                        try {
                            M[] mArr = n7.f1632a;
                            M m7 = mArr != null ? mArr[0] : null;
                            if (m7 == null) {
                                b7 = null;
                            } else {
                                b7 = ((nanoTime - m7.f1037f) > 0L ? 1 : ((nanoTime - m7.f1037f) == 0L ? 0 : -1)) >= 0 ? Q(m7) : false ? n7.b(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (b7 != null);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1040l;
            loop1: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof M5.n)) {
                    if (obj != AbstractC0165z.f1116c) {
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
                M5.n nVar = (M5.n) obj;
                Object d7 = nVar.d();
                if (d7 != M5.n.f1613g) {
                    runnable = (Runnable) d7;
                    break;
                }
                M5.n c7 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c7) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C0504h c0504h = this.f1046j;
            if (((c0504h == null || c0504h.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f1040l.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof M5.n) {
                        long j4 = M5.n.f1612f.get((M5.n) obj2);
                    } else if (obj2 == AbstractC0165z.f1116c) {
                        return Long.MAX_VALUE;
                    }
                }
                N n8 = (N) f1041m.get(this);
                if (n8 != null) {
                    synchronized (n8) {
                        M[] mArr2 = n8.f1632a;
                        m4 = mArr2 != null ? mArr2[0] : null;
                    }
                    if (m4 != null) {
                        long nanoTime2 = m4.f1037f - System.nanoTime();
                        if (nanoTime2 >= 0) {
                            return nanoTime2;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void P(Runnable runnable) {
        if (!Q(runnable)) {
            A.f1022o.P(runnable);
            return;
        }
        Thread K6 = K();
        if (Thread.currentThread() != K6) {
            LockSupport.unpark(K6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1040l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f1042n.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof M5.n)) {
                        if (obj != AbstractC0165z.f1116c) {
                            M5.n nVar = new M5.n(8, true);
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
                    M5.n nVar2 = (M5.n) obj;
                    int a7 = nVar2.a(runnable);
                    if (a7 == 0) {
                        break;
                    }
                    if (a7 == 1) {
                        M5.n c7 = nVar2.c();
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
    
        if ((M5.y.f1631b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean R() {
        C0504h c0504h = this.f1046j;
        if (c0504h != null ? c0504h.isEmpty() : true) {
            N n7 = (N) f1041m.get(this);
            if (n7 != null) {
            }
            Object obj = f1040l.get(this);
            if (obj != null) {
                if (obj instanceof M5.n) {
                    long j4 = M5.n.f1612f.get((M5.n) obj);
                    return ((int) (1073741823 & j4)) == ((int) ((j4 & 1152921503533105152L) >> 30));
                }
                if (obj == AbstractC0165z.f1116c) {
                }
            }
            return true;
        }
        return false;
    }

    public final void S(long j4, M m4) {
        int a7;
        Thread K6;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1041m;
        if (f1042n.get(this) != 0) {
            a7 = 1;
        } else {
            N n7 = (N) atomicReferenceFieldUpdater.get(this);
            if (n7 == null) {
                N n8 = new N();
                n8.f1039c = j4;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, n8) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.i.b(obj);
                n7 = (N) obj;
            }
            a7 = m4.a(j4, n7, this);
        }
        if (a7 != 0) {
            if (a7 == 1) {
                O(j4, m4);
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
                M[] mArr = n9.f1632a;
                r2 = mArr != null ? mArr[0] : null;
            }
        }
        if (r2 != m4 || Thread.currentThread() == (K6 = K())) {
            return;
        }
        LockSupport.unpark(K6);
    }

    @Override // H5.C
    public final void e(long j4, C0147g c0147g) {
        long j7 = j4 > 0 ? j4 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j4 : 0L;
        if (j7 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            K k4 = new K(this, j7 + nanoTime, c0147g);
            S(nanoTime, k4);
            c0147g.t(new C0145e(1, k4));
        }
    }

    public H g(long j4, s0 s0Var, InterfaceC0569i interfaceC0569i) {
        return B.f1024a.g(j4, s0Var, interfaceC0569i);
    }

    @Override // H5.P
    public void shutdown() {
        M b7;
        p0.f1094a.set(null);
        f1042n.set(this, 1);
        M5.v vVar = AbstractC0165z.f1116c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1040l;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof M5.n)) {
                    if (obj != vVar) {
                        M5.n nVar = new M5.n(8, true);
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
                ((M5.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, vVar)) {
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
            N n7 = (N) f1041m.get(this);
            if (n7 == null) {
                return;
            }
            synchronized (n7) {
                b7 = M5.y.f1631b.get(n7) > 0 ? n7.b(0) : null;
            }
            if (b7 == null) {
                return;
            } else {
                O(nanoTime, b7);
            }
        }
    }
}
