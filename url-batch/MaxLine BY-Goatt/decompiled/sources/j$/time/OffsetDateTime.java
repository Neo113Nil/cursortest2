package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.n, Comparable<OffsetDateTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static OffsetDateTime s(Instant instant, y yVar) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(yVar, "zone");
        ZoneOffset d = yVar.B().d(instant);
        return new OffsetDateTime(LocalDateTime.P(instant.getEpochSecond(), instant.getNano(), d), d);
    }

    private Object writeReplace() {
        return new t((byte) 10, this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime l(long j, j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.b ? G(this.a.l(j, sVar), this.b) : (OffsetDateTime) sVar.s(this, j);
    }

    public final OffsetDateTime G(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
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

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(a0 a0Var) {
        if (a0Var == j$.time.temporal.r.d || a0Var == j$.time.temporal.r.e) {
            return this.b;
        }
        if (a0Var == j$.time.temporal.r.a) {
            return null;
        }
        return a0Var == j$.time.temporal.r.f ? this.a.a : a0Var == j$.time.temporal.r.g ? this.a.b : a0Var == j$.time.temporal.r.b ? j$.time.chrono.t.c : a0Var == j$.time.temporal.r.c ? j$.time.temporal.b.NANOS : a0Var.j(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(this.a.a.toEpochDay(), j$.time.temporal.a.EPOCH_DAY).i(this.a.b.f0(), j$.time.temporal.a.NANO_OF_DAY).i(this.b.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int compare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.b.equals(offsetDateTime2.b)) {
            compare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            compare = Long.compare(this.a.w(this.b), offsetDateTime2.a.w(offsetDateTime2.b));
            if (compare == 0) {
                compare = this.a.b.d - offsetDateTime2.a.b.d;
            }
        }
        return compare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : compare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return super.e(qVar);
        }
        int i = q.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.e(qVar) : this.b.b;
        }
        throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.P(this);
        }
        int i = q.a[((j$.time.temporal.a) qVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.g(qVar) : this.b.b : this.a.w(this.b);
    }

    public final int hashCode() {
        return this.b.b ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (OffsetDateTime) qVar.W(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = q.a[aVar.ordinal()];
        LocalDateTime localDateTime = this.a;
        return i != 1 ? i != 2 ? G(localDateTime.i(j, qVar), this.b) : G(localDateTime, ZoneOffset.b0(aVar.b.a(j, aVar))) : s(Instant.ofEpochSecond(j, localDateTime.b.d), this.b);
    }

    @Override // j$.time.temporal.m
    /* renamed from: j */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return localDate == null ? (OffsetDateTime) localDate.c(this) : G(this.a.m(localDate), this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) qVar).b : this.a.k(qVar) : qVar.B(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }
}
