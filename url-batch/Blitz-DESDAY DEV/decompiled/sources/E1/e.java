package E1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends x {
    public static final ReentrantLock h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f195j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f196k;

    /* renamed from: l, reason: collision with root package name */
    public static e f197l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f198e;

    /* renamed from: f, reason: collision with root package name */
    public e f199f;

    /* renamed from: g, reason: collision with root package name */
    public long f200g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        g1.d.d(newCondition, "newCondition(...)");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f195j = millis;
        f196k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f237c;
        boolean z2 = this.f235a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.f198e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f198e = true;
                if (f197l == null) {
                    f197l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f200g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f200g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f200g = c();
                }
                long j3 = this.f200g - nanoTime;
                e eVar2 = f197l;
                g1.d.b(eVar2);
                while (true) {
                    eVar = eVar2.f199f;
                    if (eVar == null || j3 < eVar.f200g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f199f = eVar;
                eVar2.f199f = this;
                if (eVar2 == f197l) {
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
            if (!this.f198e) {
                return false;
            }
            this.f198e = false;
            e eVar = f197l;
            while (eVar != null) {
                e eVar2 = eVar.f199f;
                if (eVar2 == this) {
                    eVar.f199f = this.f199f;
                    this.f199f = null;
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
