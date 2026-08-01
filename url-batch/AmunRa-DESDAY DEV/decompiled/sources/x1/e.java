package x1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends x {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f4229j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f4230k;

    /* renamed from: l, reason: collision with root package name */
    public static e f4231l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4232e;

    /* renamed from: f, reason: collision with root package name */
    public e f4233f;

    /* renamed from: g, reason: collision with root package name */
    public long f4234g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Z0.d.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4229j = millis;
        f4230k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f4271c;
        boolean z2 = this.f4269a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f4232e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f4232e = true;
                if (f4231l == null) {
                    f4231l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f4234g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f4234g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f4234g = c();
                }
                long j3 = this.f4234g - nanoTime;
                e eVar2 = f4231l;
                Z0.d.b(eVar2);
                while (true) {
                    eVar = eVar2.f4233f;
                    if (eVar == null || j3 < eVar.f4234g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f4233f = eVar;
                eVar2.f4233f = this;
                if (eVar2 == f4231l) {
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
            if (!this.f4232e) {
                return false;
            }
            this.f4232e = false;
            e eVar = f4231l;
            while (eVar != null) {
                e eVar2 = eVar.f4233f;
                if (eVar2 == this) {
                    eVar.f4233f = this.f4233f;
                    this.f4233f = null;
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
