package defpackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class l7 extends d60 {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static l7 l;
    public boolean e;
    public l7 f;
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
        l7 l7Var;
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
                    l = new l7();
                    i7 i7Var = new i7("Okio Watchdog");
                    i7Var.setDaemon(true);
                    i7Var.start();
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
                l7 l7Var2 = l;
                l7Var2.getClass();
                while (true) {
                    l7Var = l7Var2.f;
                    if (l7Var == null || j3 < l7Var.g - nanoTime) {
                        break;
                    } else {
                        l7Var2 = l7Var;
                    }
                }
                this.f = l7Var;
                l7Var2.f = this;
                if (l7Var2 == l) {
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
            l7 l7Var = l;
            while (l7Var != null) {
                l7 l7Var2 = l7Var.f;
                if (l7Var2 == this) {
                    l7Var.f = this.f;
                    this.f = null;
                    return false;
                }
                l7Var = l7Var2;
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
