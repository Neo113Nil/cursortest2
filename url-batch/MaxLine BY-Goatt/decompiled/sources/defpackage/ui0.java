package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ui0 extends pi0 implements m90 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(ui0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater t;
    public static final /* synthetic */ AtomicIntegerFieldUpdater u;
    public static final /* synthetic */ long v;
    public static final /* synthetic */ long w;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = hd2.a;
        w = unsafe.objectFieldOffset(ui0.class.getDeclaredField("_queue$volatile"));
        t = AtomicReferenceFieldUpdater.newUpdater(ui0.class, Object.class, "_delayed$volatile");
        v = unsafe.objectFieldOffset(ui0.class.getDeclaredField("_delayed$volatile"));
        u = AtomicIntegerFieldUpdater.newUpdater(ui0.class, "_isCompleted$volatile");
    }

    @Override // defpackage.m90
    public ec0 A(long j, tx2 tx2Var, CoroutineContext coroutineContext) {
        return z70.a.A(j, tx2Var, coroutineContext);
    }

    @Override // defpackage.t40
    public final void N(CoroutineContext coroutineContext, Runnable runnable) {
        Y(runnable);
    }

    @Override // defpackage.pi0
    public final long U() {
        if (V()) {
            return 0L;
        }
        Z();
        Runnable X = X();
        if (X == null) {
            return b0();
        }
        X.run();
        return 0L;
    }

    public final void W() {
        ui0 ui0Var;
        Unsafe unsafe;
        ng0 ng0Var = s93.k;
        while (true) {
            s.getClass();
            Unsafe unsafe2 = hd2.a;
            long j = w;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = hd2.a;
                    ui0Var = this;
                    if (unsafe3.compareAndSwapObject(ui0Var, w, (Object) null, ng0Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(ui0Var, j) != null) {
                        break;
                    } else {
                        this = ui0Var;
                    }
                }
            } else {
                ui0Var = this;
                if (objectVolatile instanceof ag1) {
                    ((ag1) objectVolatile).c();
                    return;
                }
                if (objectVolatile == ng0Var) {
                    return;
                }
                ag1 ag1Var = new ag1(8, true);
                ag1Var.a((Runnable) objectVolatile);
                do {
                    unsafe = hd2.a;
                    if (unsafe.compareAndSwapObject(ui0Var, w, objectVolatile, ag1Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(ui0Var, j) == objectVolatile);
            }
            this = ui0Var;
        }
    }

    public final Runnable X() {
        ui0 ui0Var;
        Unsafe unsafe;
        while (true) {
            s.getClass();
            Unsafe unsafe2 = hd2.a;
            long j = w;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof ag1) {
                ag1 ag1Var = (ag1) objectVolatile;
                Object e = ag1Var.e();
                if (e != ag1.g) {
                    return (Runnable) e;
                }
                ag1 d = ag1Var.d();
                while (true) {
                    Unsafe unsafe3 = hd2.a;
                    ui0Var = this;
                    if (!unsafe3.compareAndSwapObject(ui0Var, w, objectVolatile, d) && unsafe3.getObjectVolatile(ui0Var, j) == objectVolatile) {
                        this = ui0Var;
                    }
                }
            } else {
                ui0Var = this;
                if (objectVolatile == s93.k) {
                    return null;
                }
                do {
                    unsafe = hd2.a;
                    if (unsafe.compareAndSwapObject(ui0Var, w, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(ui0Var, j) == objectVolatile);
            }
            this = ui0Var;
        }
    }

    public void Y(Runnable runnable) {
        Z();
        if (!a0(runnable)) {
            y70.x.Y(runnable);
            return;
        }
        Thread c0 = c0();
        if (Thread.currentThread() != c0) {
            LockSupport.unpark(c0);
        }
    }

    public final void Z() {
        si0 si0Var;
        t.getClass();
        ti0 ti0Var = (ti0) hd2.a.getObjectVolatile(this, v);
        if (ti0Var == null || fx2.b.get(ti0Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (ti0Var) {
                try {
                    si0[] si0VarArr = ti0Var.a;
                    si0 si0Var2 = si0VarArr != null ? si0VarArr[0] : null;
                    if (si0Var2 != null) {
                        si0Var = ((nanoTime - si0Var2.m) > 0L ? 1 : ((nanoTime - si0Var2.m) == 0L ? 0 : -1)) >= 0 ? a0(si0Var2) : false ? ti0Var.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (si0Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a0(Runnable runnable) {
        ui0 ui0Var;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        loop0: while (true) {
            s.getClass();
            Unsafe unsafe3 = hd2.a;
            long j = w;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (u.get(this) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = hd2.a;
                    ui0 ui0Var2 = this;
                    runnable2 = runnable;
                    ui0Var = ui0Var2;
                    if (unsafe4.compareAndSwapObject(ui0Var2, w, (Object) null, runnable2)) {
                        break loop0;
                    }
                    if (unsafe4.getObjectVolatile(ui0Var, j) != null) {
                        break;
                    }
                    this = ui0Var;
                    runnable = runnable2;
                }
                this = ui0Var;
                runnable = runnable2;
            } else {
                ui0Var = this;
                runnable2 = runnable;
                if (objectVolatile instanceof ag1) {
                    ag1 ag1Var = (ag1) objectVolatile;
                    int a = ag1Var.a(runnable2);
                    if (a == 0) {
                        break;
                    }
                    if (a == 1) {
                        ag1 d = ag1Var.d();
                        do {
                            unsafe2 = hd2.a;
                            if (unsafe2.compareAndSwapObject(ui0Var, w, objectVolatile, d)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(ui0Var, j) == objectVolatile);
                    } else if (a == 2) {
                        break;
                    }
                    this = ui0Var;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == s93.k) {
                        break;
                    }
                    ag1 ag1Var2 = new ag1(8, true);
                    ag1Var2.a((Runnable) objectVolatile);
                    ag1Var2.a(runnable2);
                    do {
                        unsafe = hd2.a;
                        if (unsafe.compareAndSwapObject(ui0Var, w, objectVolatile, ag1Var2)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(ui0Var, j) == objectVolatile);
                    this = ui0Var;
                    runnable = runnable2;
                }
            }
        }
        return true;
    }

    public final long b0() {
        si0 si0Var;
        bi biVar = this.q;
        if (((biVar == null || biVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            s.getClass();
            Unsafe unsafe = hd2.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, w);
            if (objectVolatile != null) {
                if (objectVolatile instanceof ag1) {
                    long j = ag1.f.get((ag1) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == s93.k) {
                    return Long.MAX_VALUE;
                }
            }
            t.getClass();
            ti0 ti0Var = (ti0) unsafe.getObjectVolatile(this, v);
            if (ti0Var != null) {
                synchronized (ti0Var) {
                    si0[] si0VarArr = ti0Var.a;
                    si0Var = si0VarArr != null ? si0VarArr[0] : null;
                }
                if (si0Var != null) {
                    long nanoTime = si0Var.m - System.nanoTime();
                    if (nanoTime >= 0) {
                        return nanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public abstract Thread c0();

    public final boolean d0() {
        bi biVar = this.q;
        if (biVar != null ? biVar.isEmpty() : true) {
            t.getClass();
            Unsafe unsafe = hd2.a;
            ti0 ti0Var = (ti0) unsafe.getObjectVolatile(this, v);
            if (ti0Var != null && fx2.b.get(ti0Var) != 0) {
                return false;
            }
            s.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, w);
            if (objectVolatile != null) {
                if (objectVolatile instanceof ag1) {
                    long j = ag1.f.get((ag1) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == s93.k) {
                }
            }
            return true;
        }
        return false;
    }

    public void e0(long j, si0 si0Var) {
        y70.x.h0(j, si0Var);
    }

    public final void f0() {
        si0 b;
        long nanoTime = System.nanoTime();
        while (true) {
            t.getClass();
            ti0 ti0Var = (ti0) hd2.a.getObjectVolatile(this, v);
            if (ti0Var == null) {
                return;
            }
            synchronized (ti0Var) {
                b = fx2.b.get(ti0Var) > 0 ? ti0Var.b(0) : null;
            }
            if (b == null) {
                return;
            } else {
                e0(nanoTime, b);
            }
        }
    }

    public final void g0() {
        s.getClass();
        Unsafe unsafe = hd2.a;
        unsafe.putObjectVolatile(this, w, (Object) null);
        t.getClass();
        unsafe.putObjectVolatile(this, v, (Object) null);
    }

    public final void h0(long j, si0 si0Var) {
        Thread c0;
        int i0 = i0(j, si0Var);
        if (i0 == 0) {
            if (!j0(si0Var) || Thread.currentThread() == (c0 = c0())) {
                return;
            }
            LockSupport.unpark(c0);
            return;
        }
        if (i0 == 1) {
            e0(j, si0Var);
        } else {
            if (i0 == 2) {
                return;
            }
            lh.g("unexpected result");
        }
    }

    public final int i0(long j, si0 si0Var) {
        ui0 ui0Var;
        Unsafe unsafe;
        if (u.get(this) != 0) {
            return 1;
        }
        t.getClass();
        Unsafe unsafe2 = hd2.a;
        long j2 = v;
        ti0 ti0Var = (ti0) unsafe2.getObjectVolatile(this, j2);
        if (ti0Var == null) {
            ti0 ti0Var2 = new ti0();
            ti0Var2.c = j;
            while (true) {
                unsafe = hd2.a;
                ui0Var = this;
                if (!unsafe.compareAndSwapObject(ui0Var, v, (Object) null, ti0Var2) && unsafe.getObjectVolatile(ui0Var, j2) == null) {
                    this = ui0Var;
                }
            }
            Object objectVolatile = unsafe.getObjectVolatile(ui0Var, j2);
            objectVolatile.getClass();
            ti0Var = (ti0) objectVolatile;
        } else {
            ui0Var = this;
        }
        return si0Var.b(j, ti0Var, ui0Var);
    }

    public final boolean j0(si0 si0Var) {
        t.getClass();
        ti0 ti0Var = (ti0) hd2.a.getObjectVolatile(this, v);
        if (ti0Var != null) {
            synchronized (ti0Var) {
                si0[] si0VarArr = ti0Var.a;
                r0 = si0VarArr != null ? si0VarArr[0] : null;
            }
        }
        return r0 == si0Var;
    }

    @Override // defpackage.m90
    public final void n(long j, fs fsVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            qi0 qi0Var = new qi0(this, j2 + nanoTime, fsVar);
            h0(nanoTime, qi0Var);
            fsVar.x(new as(2, qi0Var));
        }
    }

    @Override // defpackage.pi0
    public void shutdown() {
        bx2.a.set(null);
        u.set(this, 1);
        W();
        while (U() <= 0) {
        }
        f0();
    }
}
