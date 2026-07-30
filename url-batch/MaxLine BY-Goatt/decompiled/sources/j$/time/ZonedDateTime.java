package j$.time;

import j$.time.format.DateTimeFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.m, j$.time.chrono.j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final y c;

    public ZonedDateTime(LocalDateTime localDateTime, y yVar, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = yVar;
    }

    public static ZonedDateTime B(LocalDateTime localDateTime, y yVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(yVar, "zone");
        if (yVar instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, yVar, (ZoneOffset) yVar);
        }
        j$.time.zone.f B = yVar.B();
        List f = B.f(localDateTime);
        if (f.size() == 1) {
            zoneOffset = (ZoneOffset) f.get(0);
        } else if (f.size() == 0) {
            Object e = B.e(localDateTime);
            j$.time.zone.b bVar = e instanceof j$.time.zone.b ? (j$.time.zone.b) e : null;
            localDateTime = localDateTime.Z(f.B(bVar.d.b - bVar.c.b, 0).a);
            zoneOffset = bVar.d;
        } else if (zoneOffset == null || !f.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) f.get(0);
            Objects.requireNonNull(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, yVar, zoneOffset);
    }

    public static ZonedDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        String charSequence2;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        a0 a0Var = new a0(0);
        Objects.requireNonNull(charSequence, "text");
        try {
            return (ZonedDateTime) dateTimeFormatter.b(charSequence).b(a0Var);
        } catch (j$.time.format.w e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                charSequence2 = charSequence.toString();
            }
            j$.time.format.w wVar = new j$.time.format.w("Text '" + charSequence2 + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw wVar;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZonedDateTime s(long j, int i, y yVar) {
        ZoneOffset d = yVar.B().d(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.P(j, i, d), yVar, d);
    }

    private Object writeReplace() {
        return new t((byte) 6, this);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.j E(y yVar) {
        Objects.requireNonNull(yVar, "zone");
        return this.c.equals(yVar) ? this : B(this.a, yVar, this.b);
    }

    @Override // j$.time.temporal.m
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime l(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (ZonedDateTime) sVar.s(this, j);
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) sVar;
        if (bVar.compareTo(j$.time.temporal.b.DAYS) >= 0 && bVar != j$.time.temporal.b.FOREVER) {
            return B(this.a.l(j, sVar), this.c, this.b);
        }
        LocalDateTime l = this.a.l(j, sVar);
        ZoneOffset zoneOffset = this.b;
        y yVar = this.c;
        Objects.requireNonNull(l, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(yVar, "zone");
        return yVar.B().f(l).contains(zoneOffset) ? new ZonedDateTime(l, yVar, zoneOffset) : s(l.w(zoneOffset), l.b.d, yVar);
    }

    public final ZonedDateTime J(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.b) || !this.c.B().f(this.a).contains(zoneOffset)) ? this : new ZonedDateTime(this.a, this.c, zoneOffset);
    }

    @Override // j$.time.chrono.j
    public final y K() {
        return this.c;
    }

    @Override // j$.time.chrono.j
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime m(j$.time.temporal.n nVar) {
        if (nVar instanceof LocalDate) {
            return B(LocalDateTime.J((LocalDate) nVar, this.a.b), this.c, this.b);
        }
        if (nVar instanceof l) {
            return B(LocalDateTime.J(this.a.a, (l) nVar), this.c, this.b);
        }
        if (nVar instanceof LocalDateTime) {
            return B((LocalDateTime) nVar, this.c, this.b);
        }
        if (nVar instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) nVar;
            return B(offsetDateTime.toLocalDateTime(), this.c, offsetDateTime.b);
        }
        if (!(nVar instanceof Instant)) {
            return nVar instanceof ZoneOffset ? J((ZoneOffset) nVar) : (ZonedDateTime) nVar.c(this);
        }
        Instant instant = (Instant) nVar;
        return s(instant.getEpochSecond(), instant.getNano(), this.c);
    }

    @Override // j$.time.temporal.m
    public final j$.time.chrono.j a(long j, j$.time.temporal.s sVar) {
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
        return a0Var == j$.time.temporal.r.f ? this.a.a : super.b(a0Var);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return super.e(qVar);
        }
        int i = b0.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.e(qVar) : this.b.b;
        }
        throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
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

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.P(this);
        }
        int i = b0.a[((j$.time.temporal.a) qVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.g(qVar) : this.b.b : Y();
    }

    @Override // j$.time.chrono.j
    public final l h() {
        return this.a.b;
    }

    public int hashCode() {
        return Integer.rotateLeft(this.c.hashCode(), 3) ^ (this.a.hashCode() ^ this.b.b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (ZonedDateTime) qVar.W(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = b0.a[aVar.ordinal()];
        return i != 1 ? i != 2 ? B(this.a.i(j, qVar), this.c, this.b) : J(ZoneOffset.b0(aVar.b.a(j, aVar))) : s(j, this.a.b.d, this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) qVar).b : this.a.k(qVar) : qVar.B(this);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.b n() {
        return this.a.a;
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset o() {
        return this.b;
    }

    public final String toString() {
        String str = this.a.toString() + this.b.c;
        ZoneOffset zoneOffset = this.b;
        y yVar = this.c;
        if (zoneOffset == yVar) {
            return str;
        }
        return str + "[" + yVar.toString() + "]";
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.e x() {
        return this.a;
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
