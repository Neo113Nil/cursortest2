package F1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends x {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f239h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f240j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f241k;

    /* renamed from: l, reason: collision with root package name */
    public static e f242l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f243e;

    /* renamed from: f, reason: collision with root package name */
    public e f244f;

    /* renamed from: g, reason: collision with root package name */
    public long f245g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f239h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        h1.d.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f240j = millis;
        f241k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f282c;
        boolean z2 = this.f280a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = f239h;
            reentrantLock.lock();
            try {
                if (this.f243e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f243e = true;
                if (f242l == null) {
                    f242l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f245g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f245g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f245g = c();
                }
                long j3 = this.f245g - nanoTime;
                e eVar2 = f242l;
                h1.d.b(eVar2);
                while (true) {
                    eVar = eVar2.f244f;
                    if (eVar == null || j3 < eVar.f245g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f244f = eVar;
                eVar2.f244f = this;
                if (eVar2 == f242l) {
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
        ReentrantLock reentrantLock = f239h;
        reentrantLock.lock();
        try {
            if (!this.f243e) {
                return false;
            }
            this.f243e = false;
            e eVar = f242l;
            while (eVar != null) {
                e eVar2 = eVar.f244f;
                if (eVar2 == this) {
                    eVar.f244f = this.f244f;
                    this.f244f = null;
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
