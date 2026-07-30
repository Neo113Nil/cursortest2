package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class yf1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(yf1.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = hd2.a.objectFieldOffset(yf1.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new ag1(8, false);

    public final boolean a(Runnable runnable) {
        yf1 yf1Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = hd2.a;
            long j = b;
            ag1 ag1Var = (ag1) unsafe.getObjectVolatile(this, j);
            int a2 = ag1Var.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                ag1 d = ag1Var.d();
                while (true) {
                    Unsafe unsafe2 = hd2.a;
                    yf1Var = this;
                    if (!unsafe2.compareAndSwapObject(yf1Var, b, ag1Var, d) && unsafe2.getObjectVolatile(yf1Var, j) == ag1Var) {
                        this = yf1Var;
                    }
                }
            } else {
                if (a2 == 2) {
                    return false;
                }
                yf1Var = this;
            }
            this = yf1Var;
        }
    }

    public final void b() {
        yf1 yf1Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = hd2.a;
            long j = b;
            ag1 ag1Var = (ag1) unsafe.getObjectVolatile(this, j);
            if (ag1Var.c()) {
                return;
            }
            ag1 d = ag1Var.d();
            while (true) {
                Unsafe unsafe2 = hd2.a;
                yf1Var = this;
                if (!unsafe2.compareAndSwapObject(yf1Var, b, ag1Var, d) && unsafe2.getObjectVolatile(yf1Var, j) == ag1Var) {
                    this = yf1Var;
                }
            }
            this = yf1Var;
        }
    }

    public final int c() {
        a.getClass();
        ag1 ag1Var = (ag1) hd2.a.getObjectVolatile(this, b);
        ag1Var.getClass();
        long j = ag1.f.get(ag1Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        yf1 yf1Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = hd2.a;
            long j = b;
            ag1 ag1Var = (ag1) unsafe.getObjectVolatile(this, j);
            Object e = ag1Var.e();
            if (e != ag1.g) {
                return e;
            }
            ag1 d = ag1Var.d();
            while (true) {
                Unsafe unsafe2 = hd2.a;
                yf1Var = this;
                if (!unsafe2.compareAndSwapObject(yf1Var, b, ag1Var, d) && unsafe2.getObjectVolatile(yf1Var, j) == ag1Var) {
                    this = yf1Var;
                }
            }
            this = yf1Var;
        }
    }
}
