package j$.time.temporal;

import j$.time.Duration;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public enum g implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));

    public final String a;
    public final Duration b;

    g(String str, Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.d(temporal2, this);
        }
        int ordinal = ordinal();
        if (ordinal == 0) {
            f fVar = h.c;
            return j$.nio.file.attribute.a.F(temporal2.o(fVar), temporal.o(fVar));
        }
        if (ordinal == 1) {
            return temporal.d(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal f(Temporal temporal, long j) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return temporal.a(j$.nio.file.attribute.a.D(temporal.f(r4), j), h.c);
        }
        if (ordinal == 1) {
            return temporal.b(j / 4, ChronoUnit.YEARS).b((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration getDuration() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean isDurationEstimated() {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
