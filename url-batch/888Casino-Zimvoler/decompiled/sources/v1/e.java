package v1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends w {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f4045j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f4046k;

    /* renamed from: l, reason: collision with root package name */
    public static e f4047l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4048e;

    /* renamed from: f, reason: collision with root package name */
    public e f4049f;

    /* renamed from: g, reason: collision with root package name */
    public long f4050g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        X0.e.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4045j = millis;
        f4046k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f4085c;
        boolean z2 = this.f4083a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f4048e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f4048e = true;
                if (f4047l == null) {
                    f4047l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f4050g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f4050g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f4050g = c();
                }
                long j3 = this.f4050g - nanoTime;
                e eVar2 = f4047l;
                X0.e.b(eVar2);
                while (true) {
                    eVar = eVar2.f4049f;
                    if (eVar == null || j3 < eVar.f4050g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f4049f = eVar;
                eVar2.f4049f = this;
                if (eVar2 == f4047l) {
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
            if (!this.f4048e) {
                return false;
            }
            this.f4048e = false;
            e eVar = f4047l;
            while (eVar != null) {
                e eVar2 = eVar.f4049f;
                if (eVar2 == this) {
                    eVar.f4049f = this.f4049f;
                    this.f4049f = null;
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
