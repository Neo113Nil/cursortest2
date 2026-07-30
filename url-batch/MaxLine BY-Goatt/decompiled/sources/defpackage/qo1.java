package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qo1 extends pi2 implements oo1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(qo1.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long w = hd2.a.objectFieldOffset(qo1.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public qo1() {
        super(1);
        this.owner$volatile = z71.u;
    }

    @Override // defpackage.oo1
    public final void b(Object obj) {
        while (Math.max(pi2.s.get(this), 0) == 0) {
            v.getClass();
            Unsafe unsafe = hd2.a;
            long j = w;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            ng0 ng0Var = z71.u;
            if (objectVolatile != ng0Var) {
                if (objectVolatile != obj && obj != null) {
                    b71.m("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    Unsafe unsafe2 = hd2.a;
                    qo1 qo1Var = this;
                    if (unsafe2.compareAndSwapObject(qo1Var, w, objectVolatile, ng0Var)) {
                        qo1Var.d();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(qo1Var, j) != objectVolatile) {
                            this = qo1Var;
                            break;
                        }
                        this = qo1Var;
                    }
                }
            }
        }
        lh.g("This mutex is not locked");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0022, code lost:
    
        r0.c(kotlin.Unit.a, r3.n);
     */
    @Override // defpackage.oo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(r30 r30Var) {
        if (g()) {
            return Unit.a;
        }
        fs I = ll3.I(q41.b(r30Var));
        try {
            po1 po1Var = new po1(this, I);
            while (true) {
                int andDecrement = pi2.s.getAndDecrement(this);
                if (andDecrement <= this.m) {
                    if (andDecrement > 0) {
                        break;
                    }
                    if (c(po1Var)) {
                        break;
                    }
                }
            }
            Object s = I.s();
            b50 b50Var = b50.m;
            if (s != b50Var) {
                s = Unit.a;
            }
            return s == b50Var ? s : Unit.a;
        } catch (Throwable th) {
            I.B();
            throw th;
        }
    }

    public final boolean g() {
        int h = h();
        if (h == 0) {
            return true;
        }
        if (h == 1) {
            return false;
        }
        if (h != 2) {
            lh.g("unexpected");
            return false;
        }
        b71.h("This mutex is already locked by the specified owner: null");
        return false;
    }

    public final int h() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = pi2.s;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.m;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    v.getClass();
                    hd2.a.putObjectVolatile(this, w, (Object) null);
                    return 0;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(o70.x(this));
        sb.append("[isLocked=");
        sb.append(Math.max(pi2.s.get(this), 0) == 0);
        sb.append(",owner=");
        v.getClass();
        sb.append(hd2.a.getObjectVolatile(this, w));
        sb.append(']');
        return sb.toString();
    }
}
