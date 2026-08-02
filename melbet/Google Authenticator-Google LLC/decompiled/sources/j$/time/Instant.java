package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class Instant implements Temporal, j$.time.temporal.l, Comparable<Instant>, Serializable {
    public static final Instant EPOCH = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    static {
        ofEpochSecond(-31557014167219200L, 0L);
        ofEpochSecond(31556889864403199L, 999999999L);
    }

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant now() {
        int i = b.a;
        a.c.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochMilli(long j) {
        return t(j$.nio.file.attribute.a.B(j, 1000L), ((int) j$.nio.file.attribute.a.C(j, 1000L)) * 1000000);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return t(j$.nio.file.attribute.a.D(j, j$.nio.file.attribute.a.B(j2, 1000000000L)), (int) j$.nio.file.attribute.a.C(j2, 1000000000L));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static Instant t(long j, int i) {
        if ((i | j) == 0) {
            return EPOCH;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        i.d("Instant exceeds minimum or maximum instant");
        return null;
    }

    public static Instant u(Temporal temporal) {
        if (temporal instanceof Instant) {
            return (Instant) temporal;
        }
        Objects.a(temporal, "temporal");
        try {
            return ofEpochSecond(temporal.o(j$.time.temporal.a.INSTANT_SECONDS), temporal.f(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e) {
            throw new c(g.a("Unable to obtain Instant from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
        }
    }

    private Object writeReplace() {
        return new w((byte) 2, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (Instant) nVar.j(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.k(j);
        int i = f.a[aVar.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i == 1) {
            return j != ((long) i2) ? t(j2, (int) j) : this;
        }
        if (i == 2) {
            int i3 = ((int) j) * 1000;
            return i3 != i2 ? t(j2, i3) : this;
        }
        if (i == 3) {
            int i4 = ((int) j) * 1000000;
            return i4 != i2 ? t(j2, i4) : this;
        }
        if (i == 4) {
            return j != j2 ? t(j, i2) : this;
        }
        i.a("Unsupported field: ".concat(String.valueOf(nVar)));
        return null;
    }

    @Override // j$.time.temporal.k
    public final boolean c(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.NANO_OF_SECOND || nVar == j$.time.temporal.a.MICRO_OF_SECOND || nVar == j$.time.temporal.a.MILLI_OF_SECOND : nVar != null && nVar.f(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int compare = Long.compare(this.a, instant.a);
        return compare != 0 ? compare : this.b - instant.b;
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        Instant u = u(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, u);
        }
        int i = f.b[((ChronoUnit) temporalUnit).ordinal()];
        int i2 = this.b;
        long j = this.a;
        switch (i) {
            case 1:
                return j$.nio.file.attribute.a.D(j$.nio.file.attribute.a.E(j$.nio.file.attribute.a.F(u.a, j), 1000000000L), u.b - i2);
            case 2:
                return j$.nio.file.attribute.a.D(j$.nio.file.attribute.a.E(j$.nio.file.attribute.a.F(u.a, j), 1000000000L), u.b - i2) / 1000;
            case 3:
                return j$.nio.file.attribute.a.F(u.toEpochMilli(), toEpochMilli());
            case 4:
                return x(u);
            case 5:
                return x(u) / 60;
            case 6:
                return x(u) / 3600;
            case 7:
                return x(u) / 43200;
            case 8:
                return x(u) / 86400;
            default:
                i.a("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final int f(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.o.d(this, nVar).a(nVar.h(this), nVar);
        }
        int i = f.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(this.a, aVar);
        }
        i.a("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(j jVar) {
        return (Instant) j$.nio.file.attribute.a.c(jVar, this);
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    @Override // j$.time.temporal.l
    public final Temporal j(Temporal temporal) {
        return temporal.a(this.a, j$.time.temporal.a.INSTANT_SECONDS).a(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    @Override // j$.time.temporal.k
    public final Object k(j$.time.format.b bVar) {
        if (bVar == j$.time.temporal.o.c) {
            return ChronoUnit.NANOS;
        }
        if (bVar == j$.time.temporal.o.b || bVar == j$.time.temporal.o.a || bVar == j$.time.temporal.o.e || bVar == j$.time.temporal.o.d || bVar == j$.time.temporal.o.f || bVar == j$.time.temporal.o.g) {
            return null;
        }
        return bVar.a(this);
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.g(this);
    }

    public Instant minusSeconds(long j) {
        return j == Long.MIN_VALUE ? v(Long.MAX_VALUE, 0L).v(1L, 0L) : v(-j, 0L);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, chronoUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long o(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.h(this);
        }
        int i = f.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            return this.a;
        }
        i.a("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0L;
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.f(this);
    }

    public Instant plusMillis(long j) {
        return v(j / 1000, (j % 1000) * 1000000);
    }

    public long toEpochMilli() {
        long j = this.a;
        return (j >= 0 || this.b <= 0) ? j$.nio.file.attribute.a.D(j$.nio.file.attribute.a.E(j, 1000L), r8 / 1000000) : j$.nio.file.attribute.a.D(j$.nio.file.attribute.a.E(j + 1, 1000L), (r8 / 1000000) - 1000);
    }

    public final String toString() {
        j$.time.format.a aVar = j$.time.format.a.d;
        StringBuilder sb = new StringBuilder(32);
        try {
            aVar.a.f(new j$.time.format.q(this, aVar), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new c(e.getMessage(), e);
        }
    }

    public final Instant v(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(j$.nio.file.attribute.a.D(j$.nio.file.attribute.a.D(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final Instant b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.f(this, j);
        }
        switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return v(0L, j);
            case 2:
                return v(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return plusMillis(j);
            case 4:
                return v(j, 0L);
            case 5:
                return v(j$.nio.file.attribute.a.E(j, 60L), 0L);
            case 6:
                return v(j$.nio.file.attribute.a.E(j, 3600L), 0L);
            case 7:
                return v(j$.nio.file.attribute.a.E(j, 43200L), 0L);
            case 8:
                return v(j$.nio.file.attribute.a.E(j, 86400L), 0L);
            default:
                i.a("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    public final long x(Instant instant) {
        long F = j$.nio.file.attribute.a.F(instant.a, this.a);
        long j = instant.b - this.b;
        return (F <= 0 || j >= 0) ? (F >= 0 || j <= 0) ? F : F + 1 : F - 1;
    }

    public static Instant ofEpochSecond(long j) {
        return t(j, 0);
    }
}
