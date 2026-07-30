package j$.time;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import defpackage.l42;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class LocalDate implements j$.time.temporal.m, j$.time.temporal.n, j$.time.chrono.b, Serializable {
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        of(1970, 1, 1);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static LocalDate B(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.t.c.X(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    h.c("Invalid date 'February 29' as '", i, "' is not a leap year");
                    return null;
                }
                throw new c("Invalid date '" + n.J(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate G(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.b(j$.time.temporal.r.f);
        if (localDate != null) {
            return localDate;
        }
        h.f("Unable to obtain LocalDate from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static LocalDate c0(a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        Instant instant = Instant.c;
        Instant s = Instant.s(Math.floorDiv(currentTimeMillis, 1000L), ((int) Math.floorMod(currentTimeMillis, 1000L)) * 1000000);
        Objects.requireNonNull(aVar.a, "zone");
        return ofEpochDay(Math.floorDiv(s.getEpochSecond() + r6.B().d(s).b, 86400L));
    }

    public static LocalDate d0(int i, int i2) {
        long j = i;
        j$.time.temporal.a.YEAR.Z(j);
        j$.time.temporal.a.DAY_OF_YEAR.Z(i2);
        boolean X = j$.time.chrono.t.c.X(j);
        if (i2 == 366 && !X) {
            h.c("Invalid date 'DayOfYear 366' as '", i, "' is not a leap year");
            return null;
        }
        n J = n.J(((i2 - 1) / 31) + 1);
        if (i2 > (J.B(X) + J.s(X)) - 1) {
            J = n.a[(J.ordinal() + 13) % 12];
        }
        return new LocalDate(i, J.getValue(), (i2 - J.s(X)) + 1);
    }

    public static LocalDate j0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, j$.time.chrono.t.c.X((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate now() {
        return c0(b.d());
    }

    public static LocalDate of(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.Z(i);
        j$.time.temporal.a.MONTH_OF_YEAR.Z(i2);
        j$.time.temporal.a.DAY_OF_MONTH.Z(i3);
        return B(i, i2, i3);
    }

    public static LocalDate ofEpochDay(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.Z(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + (i2 / 10);
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new LocalDate(aVar.b.a(j7, aVar), i3, i4);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 3, this);
    }

    public final int J(j$.time.temporal.q qVar) {
        switch (i.a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return W();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return P().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((W() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.t("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((W() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.t("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return this.a;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.e L(l lVar) {
        return LocalDateTime.J(this, lVar);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.n N() {
        return getYear() >= 1 ? j$.time.chrono.u.CE : j$.time.chrono.u.BCE;
    }

    public final e P() {
        return e.s(((int) Math.floorMod(toEpochDay() + 3, 7L)) + 1);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.b R(j$.time.temporal.p pVar) {
        if (pVar != null) {
            s sVar = (s) pVar;
            return g0((sVar.a * 12) + sVar.b).f0(sVar.c);
        }
        Objects.requireNonNull(pVar, "amountToAdd");
        return (LocalDate) ((s) pVar).s(this);
    }

    @Override // j$.time.chrono.b
    public final int U() {
        return y() ? 366 : 365;
    }

    @Override // j$.time.chrono.b, java.lang.Comparable
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        return bVar instanceof LocalDate ? s((LocalDate) bVar) : super.compareTo(bVar);
    }

    public final int W() {
        return (n.J(this.b).s(y()) + this.c) - 1;
    }

    public final boolean Z(j$.time.chrono.b bVar) {
        return bVar instanceof LocalDate ? s((LocalDate) bVar) < 0 : toEpochDay() < bVar.toEpochDay();
    }

    public final int a0() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : y() ? 29 : 28;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(a0 a0Var) {
        return a0Var == j$.time.temporal.r.f ? this : super.b(a0Var);
    }

    @Override // j$.time.temporal.m
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final LocalDate a(long j, j$.time.temporal.s sVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = l(Long.MAX_VALUE, sVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.l(j2, sVar);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.m d() {
        return j$.time.chrono.t.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? J(qVar) : super.e(qVar);
    }

    @Override // j$.time.temporal.m
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final LocalDate l(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (LocalDate) sVar.s(this, j);
        }
        switch (i.b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return f0(j);
            case 2:
                return h0(j);
            case 3:
                return g0(j);
            case 4:
                return i0(j);
            case 5:
                return i0(Math.multiplyExact(j, 10L));
            case 6:
                return i0(Math.multiplyExact(j, 100L));
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return i0(Math.multiplyExact(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return i(Math.addExact(g(aVar), j), aVar);
            default:
                h.d("Unsupported unit: ", sVar);
                return null;
        }
    }

    @Override // j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && s((LocalDate) obj) == 0;
    }

    public final LocalDate f0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new LocalDate(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long a0 = a0();
                if (j2 <= a0) {
                    return new LocalDate(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new LocalDate(this.a, s + 1, (int) (j2 - a0));
                }
                j$.time.temporal.a.YEAR.Z(this.a + 1);
                return new LocalDate(this.a + 1, 1, (int) (j2 - a0));
            }
        }
        return ofEpochDay(Math.addExact(toEpochDay(), j));
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.EPOCH_DAY ? toEpochDay() : qVar == j$.time.temporal.a.PROLEPTIC_MONTH ? ((this.a * 12) + this.b) - 1 : J(qVar) : qVar.P(this);
    }

    public final LocalDate g0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return j0(aVar.b.a(Math.floorDiv(j2, 12L), aVar), ((int) Math.floorMod(j2, 12L)) + 1, this.c);
    }

    public int getDayOfMonth() {
        return this.c;
    }

    public int getMonthValue() {
        return this.b;
    }

    public int getYear() {
        return this.a;
    }

    public final LocalDate h0(long j) {
        return f0(Math.multiplyExact(j, 7L));
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i = this.a;
        return (i & (-2048)) ^ (((i << 11) + (this.b << 6)) + this.c);
    }

    public final LocalDate i0(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return j0(aVar.b.a(this.a + j, aVar), this.b, this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.B(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
        }
        int i = i.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.u.f(1L, a0());
        }
        if (i == 2) {
            return j$.time.temporal.u.f(1L, U());
        }
        if (i != 3) {
            return i != 4 ? aVar.b : getYear() <= 0 ? j$.time.temporal.u.f(1L, 1000000000L) : j$.time.temporal.u.f(1L, 999999999L);
        }
        return j$.time.temporal.u.f(1L, (n.J(this.b) != n.FEBRUARY || y()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.m
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final LocalDate i(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (LocalDate) qVar.W(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.Z(j);
        switch (i.a[aVar.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.c != i) {
                    return of(this.a, this.b, i);
                }
                return this;
            case 2:
                int i2 = (int) j;
                if (W() != i2) {
                    return d0(this.a, i2);
                }
                return this;
            case 3:
                return h0(j - g(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return m0((int) j);
            case 5:
                return f0(j - P().getValue());
            case 6:
                return f0(j - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return f0(j - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j);
            case 9:
                return h0(j - g(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i3 = (int) j;
                if (this.b != i3) {
                    j$.time.temporal.a.MONTH_OF_YEAR.Z(i3);
                    return j0(this.a, i3, this.c);
                }
                return this;
            case 11:
                return g0(j - (((this.a * 12) + this.b) - 1));
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return m0((int) j);
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                if (g(j$.time.temporal.a.ERA) != j) {
                    return m0(1 - this.a);
                }
                return this;
            default:
                throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.b
    /* renamed from: l0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate m(j$.time.temporal.n nVar) {
        return nVar instanceof LocalDate ? (LocalDate) nVar : (LocalDate) nVar.c(this);
    }

    public final LocalDate m0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.Z(i);
        return j0(i, this.b, this.c);
    }

    public final int s(LocalDate localDate) {
        int i = this.a - localDate.a;
        return (i == 0 && (i = this.b - localDate.b) == 0) ? this.c - localDate.c : i;
    }

    @Override // j$.time.chrono.b
    public long toEpochDay() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !y() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i = this.a;
        short s = this.b;
        short s2 = this.c;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.chrono.b
    public final boolean y() {
        return j$.time.chrono.t.c.X(this.a);
    }
}
