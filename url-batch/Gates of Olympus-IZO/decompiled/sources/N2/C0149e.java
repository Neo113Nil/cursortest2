package N2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: N2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0149e extends H {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f2920h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f2921i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f2922j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f2923k;

    /* renamed from: l, reason: collision with root package name */
    public static C0149e f2924l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2925e;

    /* renamed from: f, reason: collision with root package name */
    public C0149e f2926f;

    /* renamed from: g, reason: collision with root package name */
    public long f2927g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f2920h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Z1.i.e(newCondition, "newCondition(...)");
        f2921i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f2922j = millis;
        f2923k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        C0149e c0149e;
        long j3 = this.f2908c;
        boolean z3 = this.f2906a;
        if (j3 != 0 || z3) {
            ReentrantLock reentrantLock = f2920h;
            reentrantLock.lock();
            try {
                if (this.f2925e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f2925e = true;
                if (f2924l == null) {
                    f2924l = new C0149e();
                    C0146b c0146b = new C0146b("Okio Watchdog");
                    c0146b.setDaemon(true);
                    c0146b.start();
                }
                long nanoTime = System.nanoTime();
                if (j3 != 0 && z3) {
                    this.f2927g = Math.min(j3, c() - nanoTime) + nanoTime;
                } else if (j3 != 0) {
                    this.f2927g = j3 + nanoTime;
                } else {
                    if (!z3) {
                        throw new AssertionError();
                    }
                    this.f2927g = c();
                }
                long j4 = this.f2927g - nanoTime;
                C0149e c0149e2 = f2924l;
                Z1.i.c(c0149e2);
                while (true) {
                    c0149e = c0149e2.f2926f;
                    if (c0149e == null || j4 < c0149e.f2927g - nanoTime) {
                        break;
                    } else {
                        c0149e2 = c0149e;
                    }
                }
                this.f2926f = c0149e;
                c0149e2.f2926f = this;
                if (c0149e2 == f2924l) {
                    f2921i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f2920h;
        reentrantLock.lock();
        try {
            if (!this.f2925e) {
                return false;
            }
            this.f2925e = false;
            C0149e c0149e = f2924l;
            while (c0149e != null) {
                C0149e c0149e2 = c0149e.f2926f;
                if (c0149e2 == this) {
                    c0149e.f2926f = this.f2926f;
                    this.f2926f = null;
                    return false;
                }
                c0149e = c0149e2;
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
