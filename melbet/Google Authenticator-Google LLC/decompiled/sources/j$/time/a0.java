package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class a0 implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    static {
        j$.time.format.o oVar = new j$.time.format.o();
        oVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.v.EXCEEDS_PAD);
        oVar.c('-');
        oVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        oVar.l(Locale.getDefault(), j$.time.format.u.SMART, null);
    }

    public a0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 12, this);
    }

    @Override // j$.time.temporal.k
    public final boolean c(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.YEAR || nVar == j$.time.temporal.a.MONTH_OF_YEAR || nVar == j$.time.temporal.a.PROLEPTIC_MONTH || nVar == j$.time.temporal.a.YEAR_OF_ERA || nVar == j$.time.temporal.a.ERA : nVar != null && nVar.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a0 a0Var = (a0) obj;
        int i = this.a - a0Var.a;
        return i == 0 ? this.b - a0Var.b : i;
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        a0 a0Var;
        if (temporal instanceof a0) {
            a0Var = (a0) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.s.c.equals(j$.nio.file.attribute.a.A(temporal))) {
                    temporal = j.v(temporal);
                }
                j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
                int f = temporal.f(aVar);
                j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
                int f2 = temporal.f(aVar2);
                aVar.k(f);
                aVar2.k(f2);
                a0Var = new a0(f, f2);
            } catch (c e) {
                throw new c(g.a("Unable to obtain YearMonth from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, a0Var);
        }
        long t = a0Var.t() - t();
        switch (z.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return t;
            case 2:
                return t / 12;
            case 3:
                return t / 120;
            case 4:
                return t / 1200;
            case 5:
                return t / 12000;
            case 6:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
                return a0Var.o(aVar3) - o(aVar3);
            default:
                i.a("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.a == a0Var.a && this.b == a0Var.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final int f(j$.time.temporal.n nVar) {
        return h(nVar).a(o(nVar), nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(j jVar) {
        return (a0) j$.nio.file.attribute.a.c(jVar, this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.q.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.o.d(this, nVar);
    }

    public final int hashCode() {
        return this.a ^ (this.b << 27);
    }

    @Override // j$.time.temporal.l
    public final Temporal j(Temporal temporal) {
        if (j$.nio.file.attribute.a.A(temporal).equals(j$.time.chrono.s.c)) {
            return temporal.a(t(), j$.time.temporal.a.PROLEPTIC_MONTH);
        }
        i.d("Adjustment only supported on ISO date-time");
        return null;
    }

    @Override // j$.time.temporal.k
    public final Object k(j$.time.format.b bVar) {
        return bVar == j$.time.temporal.o.b ? j$.time.chrono.s.c : bVar == j$.time.temporal.o.c ? ChronoUnit.MONTHS : j$.time.temporal.o.c(this, bVar);
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
        int i = z.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return t();
        }
        int i2 = this.a;
        if (i == 3) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 4) {
            return i2;
        }
        if (i == 5) {
            return i2 < 1 ? 0 : 1;
        }
        i.a("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0L;
    }

    public final long t() {
        return ((this.a * 12) + this.b) - 1;
    }

    public final String toString() {
        int i = this.a;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (abs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final a0 b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (a0) temporalUnit.f(this, j);
        }
        switch (z.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return v(j);
            case 2:
                return w(j);
            case 3:
                return w(j$.nio.file.attribute.a.E(j, 10L));
            case 4:
                return w(j$.nio.file.attribute.a.E(j, 100L));
            case 5:
                return w(j$.nio.file.attribute.a.E(j, 1000L));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.nio.file.attribute.a.D(o(aVar), j), aVar);
            default:
                i.a("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    public final a0 v(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return x(aVar.b.a(j$.nio.file.attribute.a.B(j2, 12L), aVar), ((int) j$.nio.file.attribute.a.C(j2, 12L)) + 1);
    }

    public final a0 w(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return x(aVar.b.a(this.a + j, aVar), this.b);
    }

    public final a0 x(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new a0(i, i2);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final a0 a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (a0) nVar.j(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.k(j);
        int i = z.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.k(i3);
            return x(i2, i3);
        }
        if (i == 2) {
            return v(j - t());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            j$.time.temporal.a.YEAR.k(i5);
            return x(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            j$.time.temporal.a.YEAR.k(i6);
            return x(i6, i4);
        }
        if (i != 5) {
            i.a("Unsupported field: ".concat(String.valueOf(nVar)));
            return null;
        }
        if (o(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        j$.time.temporal.a.YEAR.k(i7);
        return x(i7, i4);
    }
}
