package B1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends x {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f62j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f63k;

    /* renamed from: l, reason: collision with root package name */
    public static e f64l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f65e;

    /* renamed from: f, reason: collision with root package name */
    public e f66f;

    /* renamed from: g, reason: collision with root package name */
    public long f67g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        d1.d.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f62j = millis;
        f63k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f104c;
        boolean z2 = this.f102a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f65e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f65e = true;
                if (f64l == null) {
                    f64l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f67g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f67g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f67g = c();
                }
                long j3 = this.f67g - nanoTime;
                e eVar2 = f64l;
                d1.d.b(eVar2);
                while (true) {
                    eVar = eVar2.f66f;
                    if (eVar == null || j3 < eVar.f67g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f66f = eVar;
                eVar2.f66f = this;
                if (eVar2 == f64l) {
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
            if (!this.f65e) {
                return false;
            }
            this.f65e = false;
            e eVar = f64l;
            while (eVar != null) {
                e eVar2 = eVar.f66f;
                if (eVar2 == this) {
                    eVar.f66f = this.f66f;
                    this.f66f = null;
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
