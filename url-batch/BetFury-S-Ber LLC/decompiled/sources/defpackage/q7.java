package defpackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class q7 extends gi0 {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static q7 l;
    public boolean e;
    public q7 f;
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
        q7 q7Var;
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
                    l = new q7();
                    n7 n7Var = new n7("Okio Watchdog");
                    n7Var.setDaemon(true);
                    n7Var.start();
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
                q7 q7Var2 = l;
                q7Var2.getClass();
                while (true) {
                    q7Var = q7Var2.f;
                    if (q7Var == null || j3 < q7Var.g - nanoTime) {
                        break;
                    } else {
                        q7Var2 = q7Var;
                    }
                }
                this.f = q7Var;
                q7Var2.f = this;
                if (q7Var2 == l) {
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
            q7 q7Var = l;
            while (q7Var != null) {
                q7 q7Var2 = q7Var.f;
                if (q7Var2 == this) {
                    q7Var.f = this.f;
                    this.f = null;
                    return false;
                }
                q7Var = q7Var2;
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
