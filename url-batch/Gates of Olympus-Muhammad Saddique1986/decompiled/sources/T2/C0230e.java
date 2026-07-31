package T2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: T2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0230e extends H {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f4400h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f4401i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f4402j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f4403k;

    /* renamed from: l, reason: collision with root package name */
    public static C0230e f4404l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4405e;

    /* renamed from: f, reason: collision with root package name */
    public C0230e f4406f;

    /* renamed from: g, reason: collision with root package name */
    public long f4407g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f4400h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        f2.j.e(newCondition, "newCondition(...)");
        f4401i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4402j = millis;
        f4403k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        C0230e c0230e;
        long j3 = this.f4388c;
        boolean z3 = this.f4386a;
        if (j3 != 0 || z3) {
            ReentrantLock reentrantLock = f4400h;
            reentrantLock.lock();
            try {
                if (this.f4405e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f4405e = true;
                if (f4404l == null) {
                    f4404l = new C0230e();
                    C0227b c0227b = new C0227b("Okio Watchdog");
                    c0227b.setDaemon(true);
                    c0227b.start();
                }
                long nanoTime = System.nanoTime();
                if (j3 != 0 && z3) {
                    this.f4407g = Math.min(j3, c() - nanoTime) + nanoTime;
                } else if (j3 != 0) {
                    this.f4407g = j3 + nanoTime;
                } else {
                    if (!z3) {
                        throw new AssertionError();
                    }
                    this.f4407g = c();
                }
                long j4 = this.f4407g - nanoTime;
                C0230e c0230e2 = f4404l;
                f2.j.c(c0230e2);
                while (true) {
                    c0230e = c0230e2.f4406f;
                    if (c0230e == null || j4 < c0230e.f4407g - nanoTime) {
                        break;
                    } else {
                        c0230e2 = c0230e;
                    }
                }
                this.f4406f = c0230e;
                c0230e2.f4406f = this;
                if (c0230e2 == f4404l) {
                    f4401i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f4400h;
        reentrantLock.lock();
        try {
            if (!this.f4405e) {
                return false;
            }
            this.f4405e = false;
            C0230e c0230e = f4404l;
            while (c0230e != null) {
                C0230e c0230e2 = c0230e.f4406f;
                if (c0230e2 == this) {
                    c0230e.f4406f = this.f4406f;
                    this.f4406f = null;
                    return false;
                }
                c0230e = c0230e2;
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
