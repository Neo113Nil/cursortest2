package E1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends x {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f196j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f197k;

    /* renamed from: l, reason: collision with root package name */
    public static e f198l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f199e;

    /* renamed from: f, reason: collision with root package name */
    public e f200f;

    /* renamed from: g, reason: collision with root package name */
    public long f201g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        g1.d.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f196j = millis;
        f197k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f238c;
        boolean z2 = this.f236a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f199e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f199e = true;
                if (f198l == null) {
                    f198l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f201g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f201g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f201g = c();
                }
                long j3 = this.f201g - nanoTime;
                e eVar2 = f198l;
                g1.d.b(eVar2);
                while (true) {
                    eVar = eVar2.f200f;
                    if (eVar == null || j3 < eVar.f201g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f200f = eVar;
                eVar2.f200f = this;
                if (eVar2 == f198l) {
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
            if (!this.f199e) {
                return false;
            }
            this.f199e = false;
            e eVar = f198l;
            while (eVar != null) {
                e eVar2 = eVar.f200f;
                if (eVar2 == this) {
                    eVar.f200f = this.f200f;
                    this.f200f = null;
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
