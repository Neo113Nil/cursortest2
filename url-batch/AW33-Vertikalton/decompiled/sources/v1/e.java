package v1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends w {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f4062j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f4063k;

    /* renamed from: l, reason: collision with root package name */
    public static e f4064l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4065e;

    /* renamed from: f, reason: collision with root package name */
    public e f4066f;

    /* renamed from: g, reason: collision with root package name */
    public long f4067g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        X0.e.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4062j = millis;
        f4063k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f4102c;
        boolean z2 = this.f4100a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f4065e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f4065e = true;
                if (f4064l == null) {
                    f4064l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f4067g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f4067g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f4067g = c();
                }
                long j3 = this.f4067g - nanoTime;
                e eVar2 = f4064l;
                X0.e.b(eVar2);
                while (true) {
                    eVar = eVar2.f4066f;
                    if (eVar == null || j3 < eVar.f4067g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f4066f = eVar;
                eVar2.f4066f = this;
                if (eVar2 == f4064l) {
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
            if (!this.f4065e) {
                return false;
            }
            this.f4065e = false;
            e eVar = f4064l;
            while (eVar != null) {
                e eVar2 = eVar.f4066f;
                if (eVar2 == this) {
                    eVar.f4066f = this.f4066f;
                    this.f4066f = null;
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
