package e0;

import W.J;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n extends s {

    /* renamed from: d, reason: collision with root package name */
    public final long f8399d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8400e;

    /* renamed from: f, reason: collision with root package name */
    public final List f8401f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8402g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8403h;

    /* renamed from: i, reason: collision with root package name */
    public final long f8404i;

    public n(j jVar, long j4, long j5, long j6, long j7, List list, long j8, long j9, long j10) {
        super(jVar, j4, j5);
        this.f8399d = j6;
        this.f8400e = j7;
        this.f8401f = list;
        this.f8404i = j8;
        this.f8402g = j9;
        this.f8403h = j10;
    }

    public final long b(long j4, long j5) {
        long d4 = d(j4);
        return d4 != -1 ? d4 : (int) (f((j5 - this.f8403h) + this.f8404i, j4) - c(j4, j5));
    }

    public final long c(long j4, long j5) {
        long d4 = d(j4);
        long j6 = this.f8399d;
        if (d4 == -1) {
            long j7 = this.f8402g;
            if (j7 != -9223372036854775807L) {
                return Math.max(j6, f((j5 - this.f8403h) - j7, j4));
            }
        }
        return j6;
    }

    public abstract long d(long j4);

    public final long e(long j4, long j5) {
        long j6 = this.f8414b;
        long j7 = this.f8399d;
        List list = this.f8401f;
        if (list != null) {
            return (((q) list.get((int) (j4 - j7))).f8410b * 1000000) / j6;
        }
        long d4 = d(j5);
        return (d4 == -1 || j4 != (j7 + d4) - 1) ? (this.f8400e * 1000000) / j6 : j5 - g(j4);
    }

    public final long f(long j4, long j5) {
        long d4 = d(j5);
        long j6 = this.f8399d;
        if (d4 != 0) {
            if (this.f8401f != null) {
                long j7 = (d4 + j6) - 1;
                long j8 = j6;
                while (j8 <= j7) {
                    long j9 = ((j7 - j8) / 2) + j8;
                    long g4 = g(j9);
                    if (g4 < j4) {
                        j8 = j9 + 1;
                    } else {
                        if (g4 <= j4) {
                            return j9;
                        }
                        j7 = j9 - 1;
                    }
                }
                return j8 == j6 ? j8 : j7;
            }
            long j10 = (j4 / ((this.f8400e * 1000000) / this.f8414b)) + j6;
            if (j10 >= j6) {
                return d4 == -1 ? j10 : Math.min(j10, (j6 + d4) - 1);
            }
        }
        return j6;
    }

    public final long g(long j4) {
        long j5 = this.f8399d;
        List list = this.f8401f;
        long j6 = list != null ? ((q) list.get((int) (j4 - j5))).f8409a - this.f8415c : (j4 - j5) * this.f8400e;
        String str = J.f3263a;
        return J.U(j6, 1000000L, this.f8414b, RoundingMode.DOWN);
    }

    public abstract j h(k kVar, long j4);

    public boolean i() {
        return this.f8401f != null;
    }
}
