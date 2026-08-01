package v1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends y {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f4477j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f4478k;

    /* renamed from: l, reason: collision with root package name */
    public static e f4479l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4480e;

    /* renamed from: f, reason: collision with root package name */
    public e f4481f;

    /* renamed from: g, reason: collision with root package name */
    public long f4482g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        X0.f.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4477j = millis;
        f4478k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f4524c;
        boolean z2 = this.f4522a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f4480e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f4480e = true;
                if (f4479l == null) {
                    f4479l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f4482g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f4482g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f4482g = c();
                }
                long j3 = this.f4482g - nanoTime;
                e eVar2 = f4479l;
                X0.f.b(eVar2);
                while (true) {
                    eVar = eVar2.f4481f;
                    if (eVar == null || j3 < eVar.f4482g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f4481f = eVar;
                eVar2.f4481f = this;
                if (eVar2 == f4479l) {
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
            if (!this.f4480e) {
                return false;
            }
            this.f4480e = false;
            e eVar = f4479l;
            while (eVar != null) {
                e eVar2 = eVar.f4481f;
                if (eVar2 == this) {
                    eVar.f4481f = this.f4481f;
                    this.f4481f = null;
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
