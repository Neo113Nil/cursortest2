package v1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends w {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f4044j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f4045k;

    /* renamed from: l, reason: collision with root package name */
    public static e f4046l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4047e;

    /* renamed from: f, reason: collision with root package name */
    public e f4048f;

    /* renamed from: g, reason: collision with root package name */
    public long f4049g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        X0.e.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4044j = millis;
        f4045k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f4084c;
        boolean z2 = this.f4082a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f4047e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f4047e = true;
                if (f4046l == null) {
                    f4046l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f4049g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f4049g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f4049g = c();
                }
                long j3 = this.f4049g - nanoTime;
                e eVar2 = f4046l;
                X0.e.b(eVar2);
                while (true) {
                    eVar = eVar2.f4048f;
                    if (eVar == null || j3 < eVar.f4049g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f4048f = eVar;
                eVar2.f4048f = this;
                if (eVar2 == f4046l) {
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
            if (!this.f4047e) {
                return false;
            }
            this.f4047e = false;
            e eVar = f4046l;
            while (eVar != null) {
                e eVar2 = eVar.f4048f;
                if (eVar2 == this) {
                    eVar.f4048f = this.f4048f;
                    this.f4048f = null;
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
