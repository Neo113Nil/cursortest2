package p3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class e extends x {
    public static final ReentrantLock h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f3022i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f3023j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f3024k;

    /* renamed from: l, reason: collision with root package name */
    public static e f3025l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3026e;

    /* renamed from: f, reason: collision with root package name */
    public e f3027f;
    public long g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        u2.c.d(newCondition, "newCondition(...)");
        f3022i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f3023j = millis;
        f3024k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j4 = this.c;
        boolean z3 = this.f3052a;
        if (j4 != 0 || z3) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f3026e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f3026e = true;
                if (f3025l == null) {
                    f3025l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j4 != 0 && z3) {
                    this.g = Math.min(j4, c() - nanoTime) + nanoTime;
                } else if (j4 != 0) {
                    this.g = j4 + nanoTime;
                } else {
                    if (!z3) {
                        throw new AssertionError();
                    }
                    this.g = c();
                }
                long j5 = this.g - nanoTime;
                e eVar2 = f3025l;
                u2.c.b(eVar2);
                while (true) {
                    eVar = eVar2.f3027f;
                    if (eVar == null || j5 < eVar.g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f3027f = eVar;
                eVar2.f3027f = this;
                if (eVar2 == f3025l) {
                    f3022i.signal();
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
            if (!this.f3026e) {
                return false;
            }
            this.f3026e = false;
            e eVar = f3025l;
            while (eVar != null) {
                e eVar2 = eVar.f3027f;
                if (eVar2 == this) {
                    eVar.f3027f = this.f3027f;
                    this.f3027f = null;
                    return false;
                }
                eVar = eVar2;
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
