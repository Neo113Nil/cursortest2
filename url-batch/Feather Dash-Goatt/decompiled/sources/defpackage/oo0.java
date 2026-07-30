package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class oo0 extends z81 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(oo0.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long j = n51.a.objectFieldOffset(oo0.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile = p4.f;

    public final boolean d() {
        return Math.max(z81.f.get(this), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0021, code lost:
    
        r0.n(kotlin.Unit.a, r3.a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(fn fnVar) {
        if (f()) {
            return Unit.a;
        }
        tf z = op.z(qa0.b(fnVar));
        try {
            no0 no0Var = new no0(this, z);
            while (true) {
                int andDecrement = z81.f.getAndDecrement(this);
                if (andDecrement <= 1) {
                    if (andDecrement > 0) {
                        break;
                    }
                    if (a(no0Var)) {
                        break;
                    }
                }
            }
            Object u = z.u();
            tn tnVar = tn.d;
            if (u != tnVar) {
                u = Unit.a;
            }
            return u == tnVar ? u : Unit.a;
        } catch (Throwable th) {
            z.E();
            throw th;
        }
    }

    public final boolean f() {
        int g = g();
        if (g == 0) {
            return true;
        }
        if (g == 1) {
            return false;
        }
        if (g == 2) {
            throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
        }
        dd0.j("unexpected");
        return false;
    }

    public final int g() {
        int i2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = z81.f;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 > 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
            } else {
                if (i3 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    i.getClass();
                    n51.a.putObjectVolatile(this, j, (Object) null);
                    return 0;
                }
            }
        }
    }

    public final void h(Object obj) {
        while (this.d()) {
            i.getClass();
            Unsafe unsafe = n51.a;
            long j2 = j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            fv fvVar = p4.f;
            if (objectVolatile != fvVar) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = n51.a;
                    oo0 oo0Var = this;
                    if (unsafe2.compareAndSwapObject(oo0Var, j, objectVolatile, fvVar)) {
                        oo0Var.b();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(oo0Var, j2) != objectVolatile) {
                            this = oo0Var;
                            break;
                        }
                        this = oo0Var;
                    }
                }
            }
        }
        dd0.j("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(op.y(this));
        sb.append("[isLocked=");
        sb.append(d());
        sb.append(",owner=");
        i.getClass();
        sb.append(n51.a.getObjectVolatile(this, j));
        sb.append(']');
        return sb.toString();
    }
}
