package M1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends x {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f821h;
    public static final Condition i;
    public static final long j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f822k;

    /* renamed from: l, reason: collision with root package name */
    public static e f823l;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public e f824f;

    /* renamed from: g, reason: collision with root package name */
    public long f825g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f821h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        j1.h.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        f822k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f863c;
        boolean z2 = this.f861a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = f821h;
            reentrantLock.lock();
            try {
                if (this.e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = true;
                if (f823l == null) {
                    f823l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f825g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f825g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f825g = c();
                }
                long j3 = this.f825g - nanoTime;
                e eVar2 = f823l;
                j1.h.b(eVar2);
                while (true) {
                    eVar = eVar2.f824f;
                    if (eVar == null || j3 < eVar.f825g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f824f = eVar;
                eVar2.f824f = this;
                if (eVar2 == f823l) {
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
        ReentrantLock reentrantLock = f821h;
        reentrantLock.lock();
        try {
            if (!this.e) {
                return false;
            }
            this.e = false;
            e eVar = f823l;
            while (eVar != null) {
                e eVar2 = eVar.f824f;
                if (eVar2 == this) {
                    eVar.f824f = this.f824f;
                    this.f824f = null;
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
