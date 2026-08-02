package T3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends x {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f2964h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f2965i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f2966j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f2967k;

    /* renamed from: l, reason: collision with root package name */
    public static e f2968l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2969e;

    /* renamed from: f, reason: collision with root package name */
    public e f2970f;

    /* renamed from: g, reason: collision with root package name */
    public long f2971g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f2964h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.i.d(newCondition, "lock.newCondition()");
        f2965i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f2966j = millis;
        f2967k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j4 = this.f3013c;
        boolean z = this.f3011a;
        if (j4 != 0 || z) {
            ReentrantLock reentrantLock = f2964h;
            reentrantLock.lock();
            try {
                if (this.f2969e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f2969e = true;
                if (f2968l == null) {
                    f2968l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j4 != 0 && z) {
                    this.f2971g = Math.min(j4, c() - nanoTime) + nanoTime;
                } else if (j4 != 0) {
                    this.f2971g = j4 + nanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.f2971g = c();
                }
                long j5 = this.f2971g - nanoTime;
                e eVar2 = f2968l;
                kotlin.jvm.internal.i.b(eVar2);
                while (true) {
                    eVar = eVar2.f2970f;
                    if (eVar == null || j5 < eVar.f2971g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f2970f = eVar;
                eVar2.f2970f = this;
                if (eVar2 == f2968l) {
                    f2965i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f2964h;
        reentrantLock.lock();
        try {
            if (!this.f2969e) {
                return false;
            }
            this.f2969e = false;
            e eVar = f2968l;
            while (eVar != null) {
                e eVar2 = eVar.f2970f;
                if (eVar2 == this) {
                    eVar.f2970f = this.f2970f;
                    this.f2970f = null;
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
