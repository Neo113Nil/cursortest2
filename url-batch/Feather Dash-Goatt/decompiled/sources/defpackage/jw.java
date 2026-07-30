package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class jw extends ew implements xq {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(jw.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l;
    public static final /* synthetic */ AtomicIntegerFieldUpdater m;
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long o;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = n51.a;
        o = unsafe.objectFieldOffset(jw.class.getDeclaredField("_queue$volatile"));
        l = AtomicReferenceFieldUpdater.newUpdater(jw.class, Object.class, "_delayed$volatile");
        n = unsafe.objectFieldOffset(jw.class.getDeclaredField("_delayed$volatile"));
        m = AtomicIntegerFieldUpdater.newUpdater(jw.class, "_isCompleted$volatile");
    }

    public final void A() {
        jw jwVar;
        Unsafe unsafe;
        fv fvVar = op.f;
        while (true) {
            k.getClass();
            Unsafe unsafe2 = n51.a;
            long j = o;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = n51.a;
                    jwVar = this;
                    if (unsafe3.compareAndSwapObject(jwVar, o, (Object) null, fvVar)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(jwVar, j) != null) {
                        break;
                    } else {
                        this = jwVar;
                    }
                }
            } else {
                jwVar = this;
                if (objectVolatile instanceof si0) {
                    ((si0) objectVolatile).c();
                    return;
                }
                if (objectVolatile == fvVar) {
                    return;
                }
                si0 si0Var = new si0(8, true);
                si0Var.a((Runnable) objectVolatile);
                do {
                    unsafe = n51.a;
                    if (unsafe.compareAndSwapObject(jwVar, o, objectVolatile, si0Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(jwVar, j) == objectVolatile);
            }
            this = jwVar;
        }
    }

    public final Runnable B() {
        jw jwVar;
        Unsafe unsafe;
        while (true) {
            k.getClass();
            Unsafe unsafe2 = n51.a;
            long j = o;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof si0) {
                si0 si0Var = (si0) objectVolatile;
                Object e = si0Var.e();
                if (e != si0.g) {
                    return (Runnable) e;
                }
                si0 d = si0Var.d();
                while (true) {
                    Unsafe unsafe3 = n51.a;
                    jwVar = this;
                    if (!unsafe3.compareAndSwapObject(jwVar, o, objectVolatile, d) && unsafe3.getObjectVolatile(jwVar, j) == objectVolatile) {
                        this = jwVar;
                    }
                }
            } else {
                jwVar = this;
                if (objectVolatile == op.f) {
                    return null;
                }
                do {
                    unsafe = n51.a;
                    if (unsafe.compareAndSwapObject(jwVar, o, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(jwVar, j) == objectVolatile);
            }
            this = jwVar;
        }
    }

    public void C(Runnable runnable) {
        D();
        if (!E(runnable)) {
            up.p.C(runnable);
            return;
        }
        Thread G = G();
        if (Thread.currentThread() != G) {
            LockSupport.unpark(G);
        }
    }

    public final void D() {
        hw hwVar;
        l.getClass();
        iw iwVar = (iw) n51.a.getObjectVolatile(this, n);
        if (iwVar == null || ei1.b.get(iwVar) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (iwVar) {
                try {
                    hw[] hwVarArr = iwVar.a;
                    hw hwVar2 = hwVarArr != null ? hwVarArr[0] : null;
                    if (hwVar2 != null) {
                        hwVar = ((nanoTime - hwVar2.d) > 0L ? 1 : ((nanoTime - hwVar2.d) == 0L ? 0 : -1)) >= 0 ? E(hwVar2) : false ? iwVar.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (hwVar != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(Runnable runnable) {
        jw jwVar;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        loop0: while (true) {
            k.getClass();
            Unsafe unsafe3 = n51.a;
            long j = o;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (m.get(this) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = n51.a;
                    jw jwVar2 = this;
                    runnable2 = runnable;
                    jwVar = jwVar2;
                    if (unsafe4.compareAndSwapObject(jwVar2, o, (Object) null, runnable2)) {
                        break loop0;
                    }
                    if (unsafe4.getObjectVolatile(jwVar, j) != null) {
                        break;
                    }
                    this = jwVar;
                    runnable = runnable2;
                }
                this = jwVar;
                runnable = runnable2;
            } else {
                jwVar = this;
                runnable2 = runnable;
                if (objectVolatile instanceof si0) {
                    si0 si0Var = (si0) objectVolatile;
                    int a = si0Var.a(runnable2);
                    if (a == 0) {
                        break;
                    }
                    if (a == 1) {
                        si0 d = si0Var.d();
                        do {
                            unsafe2 = n51.a;
                            if (unsafe2.compareAndSwapObject(jwVar, o, objectVolatile, d)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(jwVar, j) == objectVolatile);
                    } else if (a == 2) {
                        break;
                    }
                    this = jwVar;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == op.f) {
                        break;
                    }
                    si0 si0Var2 = new si0(8, true);
                    si0Var2.a((Runnable) objectVolatile);
                    si0Var2.a(runnable2);
                    do {
                        unsafe = n51.a;
                        if (unsafe.compareAndSwapObject(jwVar, o, objectVolatile, si0Var2)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(jwVar, j) == objectVolatile);
                    this = jwVar;
                    runnable = runnable2;
                }
            }
        }
        return true;
    }

    public final long F() {
        hw hwVar;
        m9 m9Var = this.i;
        if (((m9Var == null || m9Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            k.getClass();
            Unsafe unsafe = n51.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, o);
            if (objectVolatile != null) {
                if (objectVolatile instanceof si0) {
                    long j = si0.f.get((si0) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == op.f) {
                    return Long.MAX_VALUE;
                }
            }
            l.getClass();
            iw iwVar = (iw) unsafe.getObjectVolatile(this, n);
            if (iwVar != null) {
                synchronized (iwVar) {
                    hw[] hwVarArr = iwVar.a;
                    hwVar = hwVarArr != null ? hwVarArr[0] : null;
                }
                if (hwVar != null) {
                    long nanoTime = hwVar.d - System.nanoTime();
                    if (nanoTime >= 0) {
                        return nanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public abstract Thread G();

    public final boolean H() {
        m9 m9Var = this.i;
        if (m9Var != null ? m9Var.isEmpty() : true) {
            l.getClass();
            Unsafe unsafe = n51.a;
            iw iwVar = (iw) unsafe.getObjectVolatile(this, n);
            if (iwVar != null && ei1.b.get(iwVar) != 0) {
                return false;
            }
            k.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, o);
            if (objectVolatile != null) {
                if (objectVolatile instanceof si0) {
                    long j = si0.f.get((si0) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == op.f) {
                }
            }
            return true;
        }
        return false;
    }

    public void I(long j, hw hwVar) {
        up.p.L(j, hwVar);
    }

    public final void J() {
        hw b;
        long nanoTime = System.nanoTime();
        while (true) {
            l.getClass();
            iw iwVar = (iw) n51.a.getObjectVolatile(this, n);
            if (iwVar == null) {
                return;
            }
            synchronized (iwVar) {
                b = ei1.b.get(iwVar) > 0 ? iwVar.b(0) : null;
            }
            if (b == null) {
                return;
            } else {
                I(nanoTime, b);
            }
        }
    }

    public final void K() {
        k.getClass();
        Unsafe unsafe = n51.a;
        unsafe.putObjectVolatile(this, o, (Object) null);
        l.getClass();
        unsafe.putObjectVolatile(this, n, (Object) null);
    }

    public final void L(long j, hw hwVar) {
        Thread G;
        int M = M(j, hwVar);
        if (M == 0) {
            if (!N(hwVar) || Thread.currentThread() == (G = G())) {
                return;
            }
            LockSupport.unpark(G);
            return;
        }
        if (M == 1) {
            I(j, hwVar);
        } else {
            if (M == 2) {
                return;
            }
            dd0.j("unexpected result");
        }
    }

    public final int M(long j, hw hwVar) {
        jw jwVar;
        Unsafe unsafe;
        if (m.get(this) != 0) {
            return 1;
        }
        l.getClass();
        Unsafe unsafe2 = n51.a;
        long j2 = n;
        iw iwVar = (iw) unsafe2.getObjectVolatile(this, j2);
        if (iwVar == null) {
            iw iwVar2 = new iw();
            iwVar2.c = j;
            while (true) {
                unsafe = n51.a;
                jwVar = this;
                if (!unsafe.compareAndSwapObject(jwVar, n, (Object) null, iwVar2) && unsafe.getObjectVolatile(jwVar, j2) == null) {
                    this = jwVar;
                }
            }
            Object objectVolatile = unsafe.getObjectVolatile(jwVar, j2);
            objectVolatile.getClass();
            iwVar = (iw) objectVolatile;
        } else {
            jwVar = this;
        }
        return hwVar.b(j, iwVar, jwVar);
    }

    public final boolean N(hw hwVar) {
        l.getClass();
        iw iwVar = (iw) n51.a.getObjectVolatile(this, n);
        if (iwVar != null) {
            synchronized (iwVar) {
                hw[] hwVarArr = iwVar.a;
                r0 = hwVarArr != null ? hwVarArr[0] : null;
            }
        }
        return r0 == hwVar;
    }

    @Override // defpackage.xq
    public final void c(long j, tf tfVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            fw fwVar = new fw(this, j2 + nanoTime, tfVar);
            L(nanoTime, fwVar);
            tfVar.z(new pf(2, fwVar));
        }
    }

    @Override // defpackage.xq
    public rs e(long j, ni1 ni1Var, CoroutineContext coroutineContext) {
        return vp.a.e(j, ni1Var, coroutineContext);
    }

    @Override // defpackage.ln
    public final void f(CoroutineContext coroutineContext, Runnable runnable) {
        C(runnable);
    }

    @Override // defpackage.ew
    public final long s() {
        if (t()) {
            return 0L;
        }
        D();
        Runnable B = B();
        if (B == null) {
            return F();
        }
        B.run();
        return 0L;
    }

    @Override // defpackage.ew
    public void shutdown() {
        ci1.a.set(null);
        m.set(this, 1);
        A();
        while (s() <= 0) {
        }
        J();
    }
}
