package n6;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class d extends y {

    /* renamed from: h, reason: collision with root package name */
    public static final A.j f5510h;

    /* renamed from: i, reason: collision with root package name */
    public static d f5511i;

    /* renamed from: j, reason: collision with root package name */
    public static final ReentrantLock f5512j;

    /* renamed from: k, reason: collision with root package name */
    public static final Condition f5513k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f5514l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f5515m;

    /* renamed from: e, reason: collision with root package name */
    public int f5516e;

    /* renamed from: f, reason: collision with root package name */
    public int f5517f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f5518g;

    static {
        A.j jVar = new A.j(6);
        jVar.f27c = new d[8];
        f5510h = jVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        f5512j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.i.d(newCondition, "newCondition(...)");
        f5513k = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f5514l = millis;
        f5515m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j4 = this.f5565c;
        boolean z5 = this.f5563a;
        if (j4 != 0 || z5) {
            ReentrantLock reentrantLock = f5512j;
            reentrantLock.lock();
            try {
                if (this.f5516e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f5516e = 1;
                U0.h.f(this, j4, z5);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f5512j;
        reentrantLock.lock();
        try {
            int i7 = this.f5516e;
            this.f5516e = 0;
            if (i7 != 1) {
                return i7 == 2;
            }
            f5510h.h(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        throw null;
    }

    public void k() {
    }
}
