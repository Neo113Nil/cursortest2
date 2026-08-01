package C1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends x {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f175j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f176k;

    /* renamed from: l, reason: collision with root package name */
    public static e f177l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f178e;

    /* renamed from: f, reason: collision with root package name */
    public e f179f;

    /* renamed from: g, reason: collision with root package name */
    public long f180g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        e1.d.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f175j = millis;
        f176k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f217c;
        boolean z2 = this.f215a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f178e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f178e = true;
                if (f177l == null) {
                    f177l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f180g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f180g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f180g = c();
                }
                long j3 = this.f180g - nanoTime;
                e eVar2 = f177l;
                e1.d.b(eVar2);
                while (true) {
                    eVar = eVar2.f179f;
                    if (eVar == null || j3 < eVar.f180g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f179f = eVar;
                eVar2.f179f = this;
                if (eVar2 == f177l) {
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
            if (!this.f178e) {
                return false;
            }
            this.f178e = false;
            e eVar = f177l;
            while (eVar != null) {
                e eVar2 = eVar.f179f;
                if (eVar2 == this) {
                    eVar.f179f = this.f179f;
                    this.f179f = null;
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
