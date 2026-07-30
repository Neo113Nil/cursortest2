package j$.time.temporal;

import j$.time.format.d0;
import j$.time.format.e0;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public enum k implements q {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient u b;
    public final transient long c;

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j) {
        this.a = str;
        this.b = u.f((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // j$.time.temporal.q
    public final u B(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.f(a.EPOCH_DAY)) {
            return this.b;
        }
        j$.time.h.i("Unsupported field: ", this);
        return null;
    }

    @Override // j$.time.temporal.q
    public final TemporalAccessor G(Map map, d0 d0Var, e0 e0Var) {
        long longValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.m r = j$.time.chrono.m.r(d0Var);
        e0 e0Var2 = e0.LENIENT;
        long j = this.c;
        if (e0Var == e0Var2) {
            return r.p(Math.subtractExact(longValue, j));
        }
        this.b.b(longValue, this);
        return r.p(longValue - j);
    }

    @Override // j$.time.temporal.q
    public final u J() {
        return this.b;
    }

    @Override // j$.time.temporal.q
    public final long P(TemporalAccessor temporalAccessor) {
        return temporalAccessor.g(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.q
    public final m W(m mVar, long j) {
        if (this.b.e(j)) {
            return mVar.i(Math.subtractExact(j, this.c), a.EPOCH_DAY);
        }
        throw new j$.time.c("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.q
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.q
    public final boolean s(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(a.EPOCH_DAY);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
