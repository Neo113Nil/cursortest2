package defpackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class x6 extends v50 {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static x6 l;
    public boolean e;
    public x6 f;
    public long g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        i = newCondition;
        j = 60000L;
        k = 60000000000L;
    }

    public final void h() {
        x6 x6Var;
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = true;
                if (l == null) {
                    l = new x6();
                    u6 u6Var = new u6("Okio Watchdog");
                    u6Var.setDaemon(true);
                    u6Var.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z) {
                    this.g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.g = j2 + nanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.g = c();
                }
                long j3 = this.g - nanoTime;
                x6 x6Var2 = l;
                x6Var2.getClass();
                while (true) {
                    x6Var = x6Var2.f;
                    if (x6Var == null || j3 < x6Var.g - nanoTime) {
                        break;
                    } else {
                        x6Var2 = x6Var;
                    }
                }
                this.f = x6Var;
                x6Var2.f = this;
                if (x6Var2 == l) {
                    i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            if (!this.e) {
                return false;
            }
            this.e = false;
            x6 x6Var = l;
            while (x6Var != null) {
                x6 x6Var2 = x6Var.f;
                if (x6Var2 == this) {
                    x6Var.f = this.f;
                    this.f = null;
                    return false;
                }
                x6Var = x6Var2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
