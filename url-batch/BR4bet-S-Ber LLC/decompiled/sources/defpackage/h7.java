package defpackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class h7 extends f90 {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static h7 l;
    public boolean e;
    public h7 f;
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
        h7 h7Var;
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
                    l = new h7();
                    e7 e7Var = new e7("Okio Watchdog");
                    e7Var.setDaemon(true);
                    e7Var.start();
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
                h7 h7Var2 = l;
                h7Var2.getClass();
                while (true) {
                    h7Var = h7Var2.f;
                    if (h7Var == null || j3 < h7Var.g - nanoTime) {
                        break;
                    } else {
                        h7Var2 = h7Var;
                    }
                }
                this.f = h7Var;
                h7Var2.f = this;
                if (h7Var2 == l) {
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
            h7 h7Var = l;
            while (h7Var != null) {
                h7 h7Var2 = h7Var.f;
                if (h7Var2 == this) {
                    h7Var.f = this.f;
                    this.f = null;
                    return false;
                }
                h7Var = h7Var2;
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
