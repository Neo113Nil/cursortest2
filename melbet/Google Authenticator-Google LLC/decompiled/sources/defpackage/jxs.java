package defpackage;

import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxs implements Comparable {
    public static final iwy b = new iwy();
    private static final long d;
    private static final long e;
    private static final long f;
    public final long a;
    public final iwy c;
    private volatile boolean g;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        d = 3153600000000000000L;
        e = -3153600000000000000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        f = 1000000000L;
    }

    private jxs(iwy iwyVar, long j, long j2) {
        this.c = iwyVar;
        long min = Math.min(d, Math.max(e, j2));
        this.a = j + min;
        this.g = min <= 0;
    }

    public static jxs c(long j, TimeUnit timeUnit) {
        return g(j, timeUnit, b);
    }

    public static jxs g(long j, TimeUnit timeUnit, iwy iwyVar) {
        timeUnit.getClass();
        return new jxs(iwyVar, System.nanoTime(), timeUnit.toNanos(j));
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(jxs jxsVar) {
        d(jxsVar);
        return Long.compare(this.a, jxsVar.a);
    }

    public final long b(TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        if (!this.g && this.a - nanoTime <= 0) {
            this.g = true;
        }
        return timeUnit.convert(this.a - nanoTime, TimeUnit.NANOSECONDS);
    }

    public final void d(jxs jxsVar) {
        iwy iwyVar = this.c;
        iwy iwyVar2 = jxsVar.c;
        if (iwyVar == iwyVar2) {
            return;
        }
        throw new AssertionError("Tickers (" + String.valueOf(iwyVar) + " and " + String.valueOf(iwyVar2) + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean e(jxs jxsVar) {
        d(jxsVar);
        return this.a - jxsVar.a < 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jxs)) {
            return false;
        }
        jxs jxsVar = (jxs) obj;
        iwy iwyVar = this.c;
        if (iwyVar != null ? iwyVar == jxsVar.c : jxsVar.c == null) {
            return this.a == jxsVar.a;
        }
        return false;
    }

    public final boolean f() {
        if (!this.g) {
            if (this.a - System.nanoTime() > 0) {
                return false;
            }
            this.g = true;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.c, Long.valueOf(this.a));
    }

    public final String toString() {
        long b2 = b(TimeUnit.NANOSECONDS);
        long abs = Math.abs(b2);
        long j = f;
        long j2 = abs / j;
        long abs2 = Math.abs(b2) % j;
        StringBuilder sb = new StringBuilder();
        if (b2 < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        iwy iwyVar = this.c;
        if (iwyVar != b) {
            sb.append(a.aj(iwyVar, " (ticker=", ")"));
        }
        return sb.toString();
    }
}
