package v1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends x {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f4050j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f4051k;

    /* renamed from: l, reason: collision with root package name */
    public static e f4052l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4053e;

    /* renamed from: f, reason: collision with root package name */
    public e f4054f;

    /* renamed from: g, reason: collision with root package name */
    public long f4055g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        X0.d.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4050j = millis;
        f4051k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f4091c;
        boolean z2 = this.f4089a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f4053e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f4053e = true;
                if (f4052l == null) {
                    f4052l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f4055g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f4055g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f4055g = c();
                }
                long j3 = this.f4055g - nanoTime;
                e eVar2 = f4052l;
                X0.d.b(eVar2);
                while (true) {
                    eVar = eVar2.f4054f;
                    if (eVar == null || j3 < eVar.f4055g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f4054f = eVar;
                eVar2.f4054f = this;
                if (eVar2 == f4052l) {
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
            if (!this.f4053e) {
                return false;
            }
            this.f4053e = false;
            e eVar = f4052l;
            while (eVar != null) {
                e eVar2 = eVar.f4054f;
                if (eVar2 == this) {
                    eVar.f4054f = this.f4054f;
                    this.f4054f = null;
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
