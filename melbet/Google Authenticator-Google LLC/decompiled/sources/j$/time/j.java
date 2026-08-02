package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.chromium.net.UrlRequest;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class j implements Temporal, j$.time.temporal.l, j$.time.chrono.b, Serializable {
    public static final j d = E(-999999999, 1, 1);
    public static final j e = E(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        E(1970, 1, 1);
    }

    public j(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static j E(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.k(i);
        j$.time.temporal.a.MONTH_OF_YEAR.k(i2);
        j$.time.temporal.a.DAY_OF_MONTH.k(i3);
        return u(i, i2, i3);
    }

    public static j F(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.k(j);
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
        return new j(aVar.b.a(j7, aVar), i3, i4);
    }

    public static j K(int i, int i2, int i3) {
        if (i2 == 2) {
            j$.time.chrono.s.c.getClass();
            i3 = Math.min(i3, j$.time.chrono.s.w((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new j(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static j u(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.s.c.getClass();
                if (j$.time.chrono.s.w(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    i.c("Invalid date 'February 29' as '", i, "' is not a leap year");
                    return null;
                }
                throw new c("Invalid date '" + o.w(i2).name() + " " + i3 + "'");
            }
        }
        return new j(i, i2, i3);
    }

    public static j v(j$.time.temporal.k kVar) {
        Objects.a(kVar, "temporal");
        j jVar = (j) kVar.k(j$.time.temporal.o.f);
        if (jVar != null) {
            return jVar;
        }
        i.d(g.a("Unable to obtain LocalDate from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()));
        return null;
    }

    private Object writeReplace() {
        return new w((byte) 3, this);
    }

    public final boolean A(j$.time.chrono.b bVar) {
        return bVar instanceof j ? t((j) bVar) < 0 : p() < bVar.p();
    }

    public final boolean B() {
        j$.time.chrono.s sVar = j$.time.chrono.s.c;
        long j = this.a;
        sVar.getClass();
        return j$.time.chrono.s.w(j);
    }

    public final int C() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : B() ? 29 : 28;
    }

    public final long D(j jVar) {
        return (((jVar.z() * 32) + jVar.c) - ((z() * 32) + this.c)) / 32;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final j b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (j) temporalUnit.f(this, j);
        }
        switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return H(j);
            case 2:
                return H(j$.nio.file.attribute.a.E(j, 7L));
            case 3:
                return I(j);
            case 4:
                return J(j);
            case 5:
                return J(j$.nio.file.attribute.a.E(j, 10L));
            case 6:
                return J(j$.nio.file.attribute.a.E(j, 100L));
            case 7:
                return J(j$.nio.file.attribute.a.E(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.nio.file.attribute.a.D(o(aVar), j), aVar);
            default:
                i.a("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    public final j H(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new j(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long C = C();
                if (j2 <= C) {
                    return new j(i, s, (int) j2);
                }
                if (s < 12) {
                    return new j(i, s + 1, (int) (j2 - C));
                }
                int i2 = i + 1;
                j$.time.temporal.a.YEAR.k(i2);
                return new j(i2, 1, (int) (j2 - C));
            }
        }
        return F(j$.nio.file.attribute.a.D(p(), j));
    }

    public final j I(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return K(aVar.b.a(j$.nio.file.attribute.a.B(j2, 12L), aVar), ((int) j$.nio.file.attribute.a.C(j2, 12L)) + 1, this.c);
    }

    public final j J(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return K(aVar.b.a(this.a + j, aVar), this.b, this.c);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final j a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (j) nVar.j(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.k(j);
        int i = h.a[aVar.ordinal()];
        short s = this.c;
        short s2 = this.b;
        int i2 = this.a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                if (s != i3) {
                    return E(i2, s2, i3);
                }
                return this;
            case 2:
                return N((int) j);
            case 3:
                return H(j$.nio.file.attribute.a.E(j - o(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7L));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return O((int) j);
            case 5:
                return H(j - x().getValue());
            case 6:
                return H(j - o(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return H(j - o(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return F(j);
            case 9:
                return H(j$.nio.file.attribute.a.E(j - o(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7L));
            case 10:
                int i4 = (int) j;
                if (s2 != i4) {
                    j$.time.temporal.a.MONTH_OF_YEAR.k(i4);
                    return K(i2, i4, s);
                }
                return this;
            case 11:
                return I(j - z());
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return O((int) j);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                if (o(j$.time.temporal.a.ERA) != j) {
                    return O(1 - i2);
                }
                return this;
            default:
                i.a("Unsupported field: ".concat(String.valueOf(nVar)));
                return null;
        }
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final j g(j$.time.temporal.l lVar) {
        return lVar instanceof j ? (j) lVar : (j) lVar.j(this);
    }

    public final j N(int i) {
        if (y() == i) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i2 = this.a;
        long j = i2;
        aVar.k(j);
        j$.time.temporal.a.DAY_OF_YEAR.k(i);
        j$.time.chrono.s.c.getClass();
        boolean w = j$.time.chrono.s.w(j);
        if (i == 366 && !w) {
            i.c("Invalid date 'DayOfYear 366' as '", i2, "' is not a leap year");
            return null;
        }
        o w2 = o.w(((i - 1) / 31) + 1);
        if (i > (w2.u(w) + w2.t(w)) - 1) {
            w2 = o.a[(w2.ordinal() + 13) % 12];
        }
        return new j(i2, w2.getValue(), (i - w2.t(w)) + 1);
    }

    public final j O(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.k(i);
        return K(i, this.b, this.c);
    }

    @Override // j$.time.temporal.k
    public final boolean c(j$.time.temporal.n nVar) {
        return j$.nio.file.attribute.a.p(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        j v = v(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, v);
        }
        switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return v.p() - p();
            case 2:
                return (v.p() - p()) / 7;
            case 3:
                return D(v);
            case 4:
                return D(v) / 12;
            case 5:
                return D(v) / 120;
            case 6:
                return D(v) / 1200;
            case 7:
                return D(v) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return v.o(aVar) - o(aVar);
            default:
                i.a("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && t((j) obj) == 0;
    }

    @Override // j$.time.temporal.k
    public final int f(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? w(nVar) : j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.a getChronology() {
        return j$.time.chrono.s.c;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.g(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        if (!aVar.isDateBased()) {
            i.a("Unsupported field: ".concat(String.valueOf(nVar)));
            return null;
        }
        int i = h.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.q.f(1L, C());
        }
        if (i == 2) {
            return j$.time.temporal.q.f(1L, B() ? 366 : 365);
        }
        if (i != 3) {
            return i != 4 ? aVar.b : this.a <= 0 ? j$.time.temporal.q.f(1L, 1000000000L) : j$.time.temporal.q.f(1L, 999999999L);
        }
        return j$.time.temporal.q.f(1L, (o.w(this.b) != o.FEBRUARY || B()) ? 5L : 4L);
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i = this.a;
        return (i & (-2048)) ^ (((i << 11) + (this.b << 6)) + this.c);
    }

    @Override // j$.time.temporal.l
    public final Temporal j(Temporal temporal) {
        return j$.nio.file.attribute.a.c(this, temporal);
    }

    @Override // j$.time.temporal.k
    public final Object k(j$.time.format.b bVar) {
        return bVar == j$.time.temporal.o.f ? this : j$.nio.file.attribute.a.r(this, bVar);
    }

    @Override // j$.time.chrono.b
    /* renamed from: l */
    public final j$.time.chrono.b n(long j, TemporalUnit temporalUnit) {
        return b(-1L, temporalUnit);
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
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.EPOCH_DAY ? p() : nVar == j$.time.temporal.a.PROLEPTIC_MONTH ? z() : w(nVar) : nVar.h(this);
    }

    @Override // j$.time.chrono.b
    public final long p() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !B() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.e q(n nVar) {
        return l.w(this, nVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        return bVar instanceof j ? t((j) bVar) : j$.nio.file.attribute.a.d(this, bVar);
    }

    public final int t(j jVar) {
        int i = this.a - jVar.a;
        return (i == 0 && (i = this.b - jVar.b) == 0) ? this.c - jVar.c : i;
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i = this.a;
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
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    public final int w(j$.time.temporal.n nVar) {
        int i;
        int i2 = h.a[((j$.time.temporal.a) nVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return y();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return x().getValue();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((y() - 1) % 7) + 1;
            case 8:
                i.a("Invalid field 'EpochDay' for get() method, use getLong() instead");
                return 0;
            case 9:
                return ((y() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                i.a("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
                return 0;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return i3;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return i3 >= 1 ? 1 : 0;
            default:
                i.a("Unsupported field: ".concat(String.valueOf(nVar)));
                return 0;
        }
        return i + 1;
    }

    public final d x() {
        return d.t(((int) j$.nio.file.attribute.a.C(p() + 3, 7L)) + 1);
    }

    public final int y() {
        return (o.w(this.b).t(B()) + this.c) - 1;
    }

    public final long z() {
        return ((this.a * 12) + this.b) - 1;
    }
}
