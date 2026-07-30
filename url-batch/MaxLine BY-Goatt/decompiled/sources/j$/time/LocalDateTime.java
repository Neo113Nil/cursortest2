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
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.n, j$.time.chrono.e, Serializable {
    public static final LocalDateTime c = J(LocalDate.d, l.e);
    public static final LocalDateTime d = J(LocalDate.e, l.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final l b;

    public LocalDateTime(LocalDate localDate, l lVar) {
        this.a = localDate;
        this.b = lVar;
    }

    public static LocalDateTime B(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).a;
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.G(temporalAccessor), l.G(temporalAccessor));
        } catch (c e) {
            h.g("Unable to obtain LocalDateTime from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
            return null;
        }
    }

    public static LocalDateTime J(LocalDate localDate, l lVar) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(lVar, "time");
        return new LocalDateTime(localDate, lVar);
    }

    public static LocalDateTime P(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.Z(j2);
        return new LocalDateTime(LocalDate.ofEpochDay(Math.floorDiv(j + zoneOffset.b, 86400L)), l.W((((int) Math.floorMod(r5, 86400L)) * 1000000000) + j2));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 5, this);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.j F(y yVar) {
        return ZonedDateTime.B(this, yVar, null);
    }

    public final boolean G(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return s((LocalDateTime) eVar) < 0;
        }
        long epochDay = this.a.toEpochDay();
        long epochDay2 = eVar.n().toEpochDay();
        if (epochDay >= epochDay2) {
            return epochDay == epochDay2 && this.b.f0() < eVar.h().f0();
        }
        return true;
    }

    @Override // j$.time.chrono.e, java.lang.Comparable
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.e eVar) {
        return eVar instanceof LocalDateTime ? s((LocalDateTime) eVar) : super.compareTo(eVar);
    }

    @Override // j$.time.temporal.m
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime l(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (LocalDateTime) sVar.s(this, j);
        }
        switch (j.a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return a0(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime c0 = c0(this.a.f0(j / 86400000000L), this.b);
                return c0.a0(c0.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime c02 = c0(this.a.f0(j / 86400000), this.b);
                return c02.a0(c02.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return Z(j);
            case 5:
                return a0(this.a, 0L, j, 0L, 0L);
            case 6:
                return a0(this.a, j, 0L, 0L, 0L);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                LocalDateTime c03 = c0(this.a.f0(j / 256), this.b);
                return c03.a0(c03.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return c0(this.a.l(j, sVar), this.b);
        }
    }

    public final LocalDateTime Z(long j) {
        return a0(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.m
    public final j$.time.chrono.e a(long j, j$.time.temporal.s sVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = l(Long.MAX_VALUE, sVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.l(j2, sVar);
    }

    public final LocalDateTime a0(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        l lVar = this.b;
        if (j5 == 0) {
            return c0(localDate, lVar);
        }
        long j6 = j / 24;
        long f0 = lVar.f0();
        long j7 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L) + f0;
        long floorDiv = Math.floorDiv(j7, 86400000000000L) + j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long floorMod = Math.floorMod(j7, 86400000000000L);
        return c0(localDate.f0(floorDiv), floorMod == f0 ? this.b : l.W(floorMod));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(a0 a0Var) {
        return a0Var == j$.time.temporal.r.f ? this.a : super.b(a0Var);
    }

    @Override // j$.time.temporal.m
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime i(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) qVar.W(this, j);
        }
        boolean a0 = ((j$.time.temporal.a) qVar).a0();
        LocalDate localDate = this.a;
        return a0 ? c0(localDate, this.b.i(j, qVar)) : c0(localDate.i(j, qVar), this.b);
    }

    public final LocalDateTime c0(LocalDate localDate, l lVar) {
        return (this.a == localDate && this.b == lVar) ? this : new LocalDateTime(localDate, lVar);
    }

    @Override // j$.time.temporal.m
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime m(j$.time.temporal.n nVar) {
        return nVar instanceof LocalDate ? c0((LocalDate) nVar, this.b) : nVar instanceof l ? c0(this.a, (l) nVar) : nVar instanceof LocalDateTime ? (LocalDateTime) nVar : (LocalDateTime) nVar.c(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).a0() ? this.b.e(qVar) : this.a.e(qVar) : super.e(qVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.s(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.isDateBased() || aVar.a0();
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).a0() ? this.b.g(qVar) : this.a.g(qVar) : qVar.P(this);
    }

    @Override // j$.time.chrono.e
    public final l h() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).a0() ? this.b.k(qVar) : this.a.k(qVar) : qVar.B(this);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.b n() {
        return this.a;
    }

    public final int s(LocalDateTime localDateTime) {
        int s = this.a.s(localDateTime.a);
        return s == 0 ? this.b.compareTo(localDateTime.b) : s;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
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
}
