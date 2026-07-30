package j$.time;

import defpackage.l42;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.n, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
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

    public static Instant from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.g(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.e(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e) {
            h.g("Unable to obtain Instant from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
            return null;
        }
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return s(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static Instant s(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        h.a("Instant exceeds minimum or maximum instant");
        return null;
    }

    private Object writeReplace() {
        return new t((byte) 2, this);
    }

    public final Instant B(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(Math.addExact(Math.addExact(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.m
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final Instant l(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (Instant) sVar.s(this, j);
        }
        switch (g.b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return B(0L, j);
            case 2:
                return B(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return B(j / 1000, (j % 1000) * 1000000);
            case 4:
                return B(j, 0L);
            case 5:
                return B(Math.multiplyExact(j, 60L), 0L);
            case 6:
                return B(Math.multiplyExact(j, 3600L), 0L);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return B(Math.multiplyExact(j, 43200L), 0L);
            case 8:
                return B(Math.multiplyExact(j, 86400L), 0L);
            default:
                h.d("Unsupported unit: ", sVar);
                return null;
        }
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = l(Long.MAX_VALUE, sVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.l(j2, sVar);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.s(this, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(a0 a0Var) {
        if (a0Var == j$.time.temporal.r.c) {
            return j$.time.temporal.b.NANOS;
        }
        if (a0Var == j$.time.temporal.r.b || a0Var == j$.time.temporal.r.a || a0Var == j$.time.temporal.r.e || a0Var == j$.time.temporal.r.d || a0Var == j$.time.temporal.r.f || a0Var == j$.time.temporal.r.g) {
            return null;
        }
        return a0Var.j(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(this.a, j$.time.temporal.a.INSTANT_SECONDS).i(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int compare = Long.compare(this.a, instant2.a);
        return compare != 0 ? compare : this.b - instant2.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return super.k(qVar).a(qVar.P(this), qVar);
        }
        int i = g.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.b / 1000;
        }
        if (i == 3) {
            return this.b / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(this.a, aVar);
        }
        throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
    }

    public final boolean equals(Object obj) {
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

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.NANO_OF_SECOND || qVar == j$.time.temporal.a.MICRO_OF_SECOND || qVar == j$.time.temporal.a.MILLI_OF_SECOND : qVar != null && qVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        int i;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.P(this);
        }
        int i2 = g.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else if (i2 == 2) {
            i = this.b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
            }
            i = this.b / 1000000;
        }
        return i;
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (Instant) qVar.W(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.Z(j);
        int i = g.a[aVar.ordinal()];
        if (i == 1) {
            return j != ((long) this.b) ? s(this.a, (int) j) : this;
        }
        if (i == 2) {
            int i2 = ((int) j) * 1000;
            return i2 != this.b ? s(this.a, i2) : this;
        }
        if (i == 3) {
            int i3 = ((int) j) * 1000000;
            return i3 != this.b ? s(this.a, i3) : this;
        }
        if (i == 4) {
            return j != this.a ? s(j, this.b) : this;
        }
        throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.m
    /* renamed from: j */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (Instant) localDate.c(this);
    }

    public String toString() {
        return DateTimeFormatter.f.a(this);
    }
}
