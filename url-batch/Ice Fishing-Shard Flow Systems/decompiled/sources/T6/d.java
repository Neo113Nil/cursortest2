package T6;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class d extends y {

    /* renamed from: h, reason: collision with root package name */
    public static final B6.p f2604h;

    /* renamed from: i, reason: collision with root package name */
    public static d f2605i;
    public static final ReentrantLock j;

    /* renamed from: k, reason: collision with root package name */
    public static final Condition f2606k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f2607l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f2608m;

    /* renamed from: e, reason: collision with root package name */
    public int f2609e;

    /* renamed from: f, reason: collision with root package name */
    public int f2610f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f2611g;

    static {
        B6.p pVar = new B6.p(5, (byte) 0);
        pVar.f234c = new d[8];
        f2604h = pVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "newCondition(...)");
        f2606k = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f2607l = millis;
        f2608m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j7 = this.f2658c;
        boolean z7 = this.f2656a;
        if (j7 != 0 || z7) {
            ReentrantLock reentrantLock = j;
            reentrantLock.lock();
            try {
                if (this.f2609e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f2609e = 1;
                c2.e.h(this, j7, z7);
                Unit unit = Unit.f6114a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            int i2 = this.f2609e;
            this.f2609e = 0;
            if (i2 != 1) {
                return i2 == 2;
            }
            f2604h.i(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        throw null;
    }

    public void k() {
    }
}
