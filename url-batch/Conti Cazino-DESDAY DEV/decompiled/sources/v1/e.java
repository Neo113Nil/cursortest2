package v1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends x {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f4066j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f4067k;

    /* renamed from: l, reason: collision with root package name */
    public static e f4068l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4069e;

    /* renamed from: f, reason: collision with root package name */
    public e f4070f;

    /* renamed from: g, reason: collision with root package name */
    public long f4071g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        X0.d.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4066j = millis;
        f4067k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f4107c;
        boolean z2 = this.f4105a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f4069e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f4069e = true;
                if (f4068l == null) {
                    f4068l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f4071g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f4071g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f4071g = c();
                }
                long j3 = this.f4071g - nanoTime;
                e eVar2 = f4068l;
                X0.d.b(eVar2);
                while (true) {
                    eVar = eVar2.f4070f;
                    if (eVar == null || j3 < eVar.f4071g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f4070f = eVar;
                eVar2.f4070f = this;
                if (eVar2 == f4068l) {
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
            if (!this.f4069e) {
                return false;
            }
            this.f4069e = false;
            e eVar = f4068l;
            while (eVar != null) {
                e eVar2 = eVar.f4070f;
                if (eVar2 == this) {
                    eVar.f4070f = this.f4070f;
                    this.f4070f = null;
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
