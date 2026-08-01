package z1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends x {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f4262j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f4263k;

    /* renamed from: l, reason: collision with root package name */
    public static e f4264l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4265e;

    /* renamed from: f, reason: collision with root package name */
    public e f4266f;

    /* renamed from: g, reason: collision with root package name */
    public long f4267g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        b1.d.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4262j = millis;
        f4263k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f4304c;
        boolean z2 = this.f4302a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f4265e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f4265e = true;
                if (f4264l == null) {
                    f4264l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f4267g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f4267g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f4267g = c();
                }
                long j3 = this.f4267g - nanoTime;
                e eVar2 = f4264l;
                b1.d.b(eVar2);
                while (true) {
                    eVar = eVar2.f4266f;
                    if (eVar == null || j3 < eVar.f4267g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f4266f = eVar;
                eVar2.f4266f = this;
                if (eVar2 == f4264l) {
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
            if (!this.f4265e) {
                return false;
            }
            this.f4265e = false;
            e eVar = f4264l;
            while (eVar != null) {
                e eVar2 = eVar.f4266f;
                if (eVar2 == this) {
                    eVar.f4266f = this.f4266f;
                    this.f4266f = null;
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
