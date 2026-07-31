package o2;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    private long f19731a;

    /* renamed from: b, reason: collision with root package name */
    private long f19732b;

    /* renamed from: c, reason: collision with root package name */
    private long f19733c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f19734d = new ThreadLocal<>();

    public i0(long j7) {
        g(j7);
    }

    public static long f(long j7) {
        return (j7 * 1000000) / 90000;
    }

    public static long i(long j7) {
        return (j7 * 90000) / 1000000;
    }

    public static long j(long j7) {
        return i(j7) % 8589934592L;
    }

    public synchronized long a(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f19732b == -9223372036854775807L) {
            long j8 = this.f19731a;
            if (j8 == 9223372036854775806L) {
                j8 = ((Long) a.e(this.f19734d.get())).longValue();
            }
            this.f19732b = j8 - j7;
            notifyAll();
        }
        this.f19733c = j7;
        return j7 + this.f19732b;
    }

    public synchronized long b(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j8 = this.f19733c;
        if (j8 != -9223372036854775807L) {
            long i7 = i(j8);
            long j9 = (4294967296L + i7) / 8589934592L;
            long j10 = ((j9 - 1) * 8589934592L) + j7;
            j7 += j9 * 8589934592L;
            if (Math.abs(j10 - i7) < Math.abs(j7 - i7)) {
                j7 = j10;
            }
        }
        return a(f(j7));
    }

    public synchronized long c() {
        long j7;
        j7 = this.f19731a;
        if (j7 == Long.MAX_VALUE || j7 == 9223372036854775806L) {
            j7 = -9223372036854775807L;
        }
        return j7;
    }

    public synchronized long d() {
        long j7;
        j7 = this.f19733c;
        return j7 != -9223372036854775807L ? j7 + this.f19732b : c();
    }

    public synchronized long e() {
        return this.f19732b;
    }

    public synchronized void g(long j7) {
        this.f19731a = j7;
        this.f19732b = j7 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f19733c = -9223372036854775807L;
    }

    public synchronized void h(boolean z6, long j7) {
        a.f(this.f19731a == 9223372036854775806L);
        if (this.f19732b != -9223372036854775807L) {
            return;
        }
        if (z6) {
            this.f19734d.set(Long.valueOf(j7));
        } else {
            while (this.f19732b == -9223372036854775807L) {
                wait();
            }
        }
    }
}
