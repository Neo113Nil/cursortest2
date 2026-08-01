package z1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends x {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f4261j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f4262k;

    /* renamed from: l, reason: collision with root package name */
    public static e f4263l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4264e;

    /* renamed from: f, reason: collision with root package name */
    public e f4265f;

    /* renamed from: g, reason: collision with root package name */
    public long f4266g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        b1.d.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4261j = millis;
        f4262k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f4303c;
        boolean z2 = this.f4301a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f4264e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f4264e = true;
                if (f4263l == null) {
                    f4263l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f4266g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f4266g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f4266g = c();
                }
                long j3 = this.f4266g - nanoTime;
                e eVar2 = f4263l;
                b1.d.b(eVar2);
                while (true) {
                    eVar = eVar2.f4265f;
                    if (eVar == null || j3 < eVar.f4266g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f4265f = eVar;
                eVar2.f4265f = this;
                if (eVar2 == f4263l) {
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
            if (!this.f4264e) {
                return false;
            }
            this.f4264e = false;
            e eVar = f4263l;
            while (eVar != null) {
                e eVar2 = eVar.f4265f;
                if (eVar2 == this) {
                    eVar.f4265f = this.f4265f;
                    this.f4265f = null;
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
