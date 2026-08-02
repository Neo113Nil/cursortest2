package W;

import a.AbstractC0124a;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public long f3258a;

    /* renamed from: b, reason: collision with root package name */
    public long f3259b;

    /* renamed from: c, reason: collision with root package name */
    public long f3260c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f3261d = new ThreadLocal();

    public G(long j4) {
        f(j4);
    }

    public final synchronized long a(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!e()) {
                long j5 = this.f3258a;
                if (j5 == 9223372036854775806L) {
                    Long l4 = (Long) this.f3261d.get();
                    l4.getClass();
                    j5 = l4.longValue();
                }
                this.f3259b = j5 - j4;
                notifyAll();
            }
            this.f3260c = j4;
            return j4 + this.f3259b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j5 = this.f3260c;
            if (j5 != -9223372036854775807L) {
                String str = J.f3263a;
                long U4 = J.U(j5, 90000L, 1000000L, RoundingMode.DOWN);
                long j6 = (4294967296L + U4) / 8589934592L;
                long j7 = ((j6 - 1) * 8589934592L) + j4;
                long j8 = (j6 * 8589934592L) + j4;
                j4 = Math.abs(j7 - U4) < Math.abs(j8 - U4) ? j7 : j8;
            }
            long j9 = j4;
            String str2 = J.f3263a;
            return a(J.U(j9, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j5 = this.f3260c;
            if (j5 != -9223372036854775807L) {
                String str = J.f3263a;
                long U4 = J.U(j5, 90000L, 1000000L, RoundingMode.DOWN);
                long j6 = U4 / 8589934592L;
                long j7 = (j6 * 8589934592L) + j4;
                j4 = j7 >= U4 ? j7 : ((j6 + 1) * 8589934592L) + j4;
            }
            long j8 = j4;
            String str2 = J.f3263a;
            return a(J.U(j8, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d() {
        long j4;
        j4 = this.f3258a;
        if (j4 == Long.MAX_VALUE || j4 == 9223372036854775806L) {
            j4 = -9223372036854775807L;
        }
        return j4;
    }

    public final synchronized boolean e() {
        return this.f3259b != -9223372036854775807L;
    }

    public final synchronized void f(long j4) {
        this.f3258a = j4;
        this.f3259b = j4 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f3260c = -9223372036854775807L;
    }

    public final synchronized void g(long j4, boolean z) {
        try {
            AbstractC0124a.t(this.f3258a == 9223372036854775806L);
            if (e()) {
                return;
            }
            if (z) {
                this.f3261d.set(Long.valueOf(j4));
            } else {
                while (!e()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
