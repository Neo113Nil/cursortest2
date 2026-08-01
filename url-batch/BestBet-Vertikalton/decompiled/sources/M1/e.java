package M1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends x {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f792j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f793k;

    /* renamed from: l, reason: collision with root package name */
    public static e f794l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f795e;

    /* renamed from: f, reason: collision with root package name */
    public e f796f;

    /* renamed from: g, reason: collision with root package name */
    public long f797g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        k1.e.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f792j = millis;
        f793k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f834c;
        boolean z2 = this.f832a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f795e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f795e = true;
                if (f794l == null) {
                    f794l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f797g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f797g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f797g = c();
                }
                long j3 = this.f797g - nanoTime;
                e eVar2 = f794l;
                k1.e.b(eVar2);
                while (true) {
                    eVar = eVar2.f796f;
                    if (eVar == null || j3 < eVar.f797g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f796f = eVar;
                eVar2.f796f = this;
                if (eVar2 == f794l) {
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
            if (!this.f795e) {
                return false;
            }
            this.f795e = false;
            e eVar = f794l;
            while (eVar != null) {
                e eVar2 = eVar.f796f;
                if (eVar2 == this) {
                    eVar.f796f = this.f796f;
                    this.f796f = null;
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
