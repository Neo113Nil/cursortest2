package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class rj extends rx2 {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static rj l;
    public int e;
    public rj f;
    public long g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        i = newCondition;
        j = 60000L;
        k = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    public final void h() {
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = 1;
                nj.c(this, j2, z);
                Unit unit = Unit.a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            int i2 = this.e;
            this.e = 0;
            if (i2 != 1) {
                return i2 == 2;
            }
            rj rjVar = l;
            while (rjVar != null) {
                rj rjVar2 = rjVar.f;
                if (rjVar2 == this) {
                    rjVar.f = this.f;
                    this.f = null;
                    return false;
                }
                rjVar = rjVar2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
