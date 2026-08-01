package g4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class e extends x {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f1928j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f1929k;

    /* renamed from: l, reason: collision with root package name */
    public static e f1930l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1931e;

    /* renamed from: f, reason: collision with root package name */
    public e f1932f;

    /* renamed from: g, reason: collision with root package name */
    public long f1933g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        i3.d.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f1928j = millis;
        f1929k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f1965c;
        boolean z4 = this.f1963a;
        if (j2 != 0 || z4) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f1931e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f1931e = true;
                if (f1930l == null) {
                    f1930l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z4) {
                    this.f1933g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f1933g = j2 + nanoTime;
                } else {
                    if (!z4) {
                        throw new AssertionError();
                    }
                    this.f1933g = c();
                }
                long j4 = this.f1933g - nanoTime;
                e eVar2 = f1930l;
                i3.d.b(eVar2);
                while (true) {
                    eVar = eVar2.f1932f;
                    if (eVar == null || j4 < eVar.f1933g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f1932f = eVar;
                eVar2.f1932f = this;
                if (eVar2 == f1930l) {
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
            if (!this.f1931e) {
                return false;
            }
            this.f1931e = false;
            e eVar = f1930l;
            while (eVar != null) {
                e eVar2 = eVar.f1932f;
                if (eVar2 == this) {
                    eVar.f1932f = this.f1932f;
                    this.f1932f = null;
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
