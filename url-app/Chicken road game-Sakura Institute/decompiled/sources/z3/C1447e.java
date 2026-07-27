package z3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1447e extends H {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f11990h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f11991i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f11992j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f11993k;

    /* renamed from: l, reason: collision with root package name */
    public static C1447e f11994l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11995e;

    /* renamed from: f, reason: collision with root package name */
    public C1447e f11996f;

    /* renamed from: g, reason: collision with root package name */
    public long f11997g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f11990h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "newCondition(...)");
        f11991i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f11992j = millis;
        f11993k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        C1447e c1447e;
        long j4 = this.f11978c;
        boolean z4 = this.f11976a;
        if (j4 != 0 || z4) {
            ReentrantLock reentrantLock = f11990h;
            reentrantLock.lock();
            try {
                if (this.f11995e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f11995e = true;
                if (f11994l == null) {
                    f11994l = new C1447e();
                    C1444b c1444b = new C1444b("Okio Watchdog");
                    c1444b.setDaemon(true);
                    c1444b.start();
                }
                long nanoTime = System.nanoTime();
                if (j4 != 0 && z4) {
                    this.f11997g = Math.min(j4, c() - nanoTime) + nanoTime;
                } else if (j4 != 0) {
                    this.f11997g = j4 + nanoTime;
                } else {
                    if (!z4) {
                        throw new AssertionError();
                    }
                    this.f11997g = c();
                }
                long j5 = this.f11997g - nanoTime;
                C1447e c1447e2 = f11994l;
                Intrinsics.c(c1447e2);
                while (true) {
                    c1447e = c1447e2.f11996f;
                    if (c1447e == null || j5 < c1447e.f11997g - nanoTime) {
                        break;
                    } else {
                        c1447e2 = c1447e;
                    }
                }
                this.f11996f = c1447e;
                c1447e2.f11996f = this;
                if (c1447e2 == f11994l) {
                    f11991i.signal();
                }
                Unit unit = Unit.f7487a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f11990h;
        reentrantLock.lock();
        try {
            if (!this.f11995e) {
                return false;
            }
            this.f11995e = false;
            C1447e c1447e = f11994l;
            while (c1447e != null) {
                C1447e c1447e2 = c1447e.f11996f;
                if (c1447e2 == this) {
                    c1447e.f11996f = this.f11996f;
                    this.f11996f = null;
                    return false;
                }
                c1447e = c1447e2;
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
