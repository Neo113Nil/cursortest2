package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class qi0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(qi0.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = n51.a.objectFieldOffset(qi0.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new si0(8, false);

    public final boolean a(Runnable runnable) {
        qi0 qi0Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = n51.a;
            long j = b;
            si0 si0Var = (si0) unsafe.getObjectVolatile(this, j);
            int a2 = si0Var.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                si0 d = si0Var.d();
                while (true) {
                    Unsafe unsafe2 = n51.a;
                    qi0Var = this;
                    if (!unsafe2.compareAndSwapObject(qi0Var, b, si0Var, d) && unsafe2.getObjectVolatile(qi0Var, j) == si0Var) {
                        this = qi0Var;
                    }
                }
            } else {
                if (a2 == 2) {
                    return false;
                }
                qi0Var = this;
            }
            this = qi0Var;
        }
    }

    public final void b() {
        qi0 qi0Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = n51.a;
            long j = b;
            si0 si0Var = (si0) unsafe.getObjectVolatile(this, j);
            if (si0Var.c()) {
                return;
            }
            si0 d = si0Var.d();
            while (true) {
                Unsafe unsafe2 = n51.a;
                qi0Var = this;
                if (!unsafe2.compareAndSwapObject(qi0Var, b, si0Var, d) && unsafe2.getObjectVolatile(qi0Var, j) == si0Var) {
                    this = qi0Var;
                }
            }
            this = qi0Var;
        }
    }

    public final int c() {
        a.getClass();
        si0 si0Var = (si0) n51.a.getObjectVolatile(this, b);
        si0Var.getClass();
        long j = si0.f.get(si0Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        qi0 qi0Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = n51.a;
            long j = b;
            si0 si0Var = (si0) unsafe.getObjectVolatile(this, j);
            Object e = si0Var.e();
            if (e != si0.g) {
                return e;
            }
            si0 d = si0Var.d();
            while (true) {
                Unsafe unsafe2 = n51.a;
                qi0Var = this;
                if (!unsafe2.compareAndSwapObject(qi0Var, b, si0Var, d) && unsafe2.getObjectVolatile(qi0Var, j) == si0Var) {
                    this = qi0Var;
                }
            }
            this = qi0Var;
        }
    }
}
