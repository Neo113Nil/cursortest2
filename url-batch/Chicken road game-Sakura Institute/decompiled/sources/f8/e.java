package f8;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class e extends i0 {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f3589h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f3590i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f3591j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f3592k;

    /* renamed from: l, reason: collision with root package name */
    public static e f3593l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3594e;

    /* renamed from: f, reason: collision with root package name */
    public e f3595f;

    /* renamed from: g, reason: collision with root package name */
    public long f3596g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f3589h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        r6.k.e(newCondition, "newCondition(...)");
        f3590i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f3591j = millis;
        f3592k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j8 = this.f3607c;
        boolean z8 = this.f3605a;
        if (j8 != 0 || z8) {
            ReentrantLock reentrantLock = f3589h;
            reentrantLock.lock();
            try {
                if (this.f3594e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f3594e = true;
                if (f3593l == null) {
                    f3593l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j8 != 0 && z8) {
                    this.f3596g = Math.min(j8, c() - nanoTime) + nanoTime;
                } else if (j8 != 0) {
                    this.f3596g = j8 + nanoTime;
                } else {
                    if (!z8) {
                        throw new AssertionError();
                    }
                    this.f3596g = c();
                }
                long j9 = this.f3596g - nanoTime;
                e eVar2 = f3593l;
                r6.k.c(eVar2);
                while (true) {
                    eVar = eVar2.f3595f;
                    if (eVar == null || j9 < eVar.f3596g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f3595f = eVar;
                eVar2.f3595f = this;
                if (eVar2 == f3593l) {
                    f3590i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f3589h;
        reentrantLock.lock();
        try {
            if (!this.f3594e) {
                return false;
            }
            this.f3594e = false;
            e eVar = f3593l;
            while (eVar != null) {
                e eVar2 = eVar.f3595f;
                if (eVar2 == this) {
                    eVar.f3595f = this.f3595f;
                    this.f3595f = null;
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
