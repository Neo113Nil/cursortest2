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
public final class y implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    static {
        j$.time.format.o oVar = new j$.time.format.o();
        oVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.v.EXCEEDS_PAD);
        oVar.l(Locale.getDefault(), j$.time.format.u.SMART, null);
    }

    public y(int i) {
        this.a = i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static y t(int i) {
        j$.time.temporal.a.YEAR.k(i);
        return new y(i);
    }

    private Object writeReplace() {
        return new w((byte) 11, this);
    }

    @Override // j$.time.temporal.k
    public final boolean c(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.YEAR || nVar == j$.time.temporal.a.YEAR_OF_ERA || nVar == j$.time.temporal.a.ERA : nVar != null && nVar.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((y) obj).a;
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        y t;
        if (temporal instanceof y) {
            t = (y) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.s.c.equals(j$.nio.file.attribute.a.A(temporal))) {
                    temporal = j.v(temporal);
                }
                t = t(temporal.f(j$.time.temporal.a.YEAR));
            } catch (c e) {
                throw new c(g.a("Unable to obtain Year from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, t);
        }
        long j = t.a - this.a;
        int i = x.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j / 10;
        }
        if (i == 3) {
            return j / 100;
        }
        if (i == 4) {
            return j / 1000;
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return t.o(aVar) - o(aVar);
        }
        i.a("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            if (this.a == ((y) obj).a) {
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
        return (y) j$.nio.file.attribute.a.c(jVar, this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.q.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.o.d(this, nVar);
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.l
    public final Temporal j(Temporal temporal) {
        if (j$.nio.file.attribute.a.A(temporal).equals(j$.time.chrono.s.c)) {
            return temporal.a(this.a, j$.time.temporal.a.YEAR);
        }
        i.d("Adjustment only supported on ISO date-time");
        return null;
    }

    @Override // j$.time.temporal.k
    public final Object k(j$.time.format.b bVar) {
        return bVar == j$.time.temporal.o.b ? j$.time.chrono.s.c : bVar == j$.time.temporal.o.c ? ChronoUnit.YEARS : j$.time.temporal.o.c(this, bVar);
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
        int i = x.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return i2;
        }
        if (i == 3) {
            return i2 < 1 ? 0 : 1;
        }
        i.a("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0L;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final y b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (y) temporalUnit.f(this, j);
        }
        int i = x.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return v(j);
        }
        if (i == 2) {
            return v(j$.nio.file.attribute.a.E(j, 10L));
        }
        if (i == 3) {
            return v(j$.nio.file.attribute.a.E(j, 100L));
        }
        if (i == 4) {
            return v(j$.nio.file.attribute.a.E(j, 1000L));
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return a(j$.nio.file.attribute.a.D(o(aVar), j), aVar);
        }
        i.a("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        return null;
    }

    public final y v(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return t(aVar.b.a(this.a + j, aVar));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final y a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (y) nVar.j(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.k(j);
        int i = x.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return t((int) j);
        }
        if (i == 2) {
            return t((int) j);
        }
        if (i == 3) {
            return o(j$.time.temporal.a.ERA) == j ? this : t(1 - i2);
        }
        i.a("Unsupported field: ".concat(String.valueOf(nVar)));
        return null;
    }
}
