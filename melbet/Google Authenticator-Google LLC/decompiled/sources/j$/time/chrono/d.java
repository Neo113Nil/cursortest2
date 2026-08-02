package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public abstract class d implements b, Temporal, j$.time.temporal.l, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static b t(a aVar, Temporal temporal) {
        b bVar = (b) temporal;
        if (aVar.equals(bVar.getChronology())) {
            return bVar;
        }
        throw new ClassCastException(j$.time.g.a("Chronology mismatch, expected: ", aVar.j(), ", actual: ", bVar.getChronology().j()));
    }

    @Override // j$.time.temporal.Temporal
    public b a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return t(getChronology(), nVar.j(this, j));
        }
        j$.time.i.a("Unsupported field: ".concat(String.valueOf(nVar)));
        return null;
    }

    @Override // j$.time.temporal.Temporal
    public b b(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (!z) {
                return t(getChronology(), temporalUnit.f(this, j));
            }
            j$.time.i.a("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            return null;
        }
        switch (c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return w(j);
            case 2:
                return w(j$.nio.file.attribute.a.E(j, 7L));
            case 3:
                return x(j);
            case 4:
                return y(j);
            case 5:
                return y(j$.nio.file.attribute.a.E(j, 10L));
            case 6:
                return y(j$.nio.file.attribute.a.E(j, 100L));
            case 7:
                return y(j$.nio.file.attribute.a.E(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.nio.file.attribute.a.D(o(aVar), j), (j$.time.temporal.n) aVar);
            default:
                j$.time.i.a("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    @Override // j$.time.chrono.b, j$.time.temporal.k
    public /* synthetic */ boolean c(j$.time.temporal.n nVar) {
        return j$.nio.file.attribute.a.p(this, nVar);
    }

    @Override // j$.time.chrono.b, j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        b f = getChronology().f(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.between(this, f);
        }
        switch (c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return f.p() - p();
            case 2:
                return (f.p() - p()) / 7;
            case 3:
                return v(f);
            case 4:
                return v(f) / 12;
            case 5:
                return v(f) / 120;
            case 6:
                return v(f) / 1200;
            case 7:
                return v(f) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return f.o(aVar) - o(aVar);
            default:
                j$.time.i.a("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j$.nio.file.attribute.a.d(this, (b) obj) == 0;
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int f(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.k
    public /* synthetic */ j$.time.temporal.q h(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long p = p();
        return getChronology().hashCode() ^ ((int) (p ^ (p >>> 32)));
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Temporal j(Temporal temporal) {
        return j$.nio.file.attribute.a.c(this, temporal);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object k(j$.time.format.b bVar) {
        return j$.nio.file.attribute.a.r(this, bVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b n(long j, TemporalUnit temporalUnit) {
        return t(getChronology(), j$.time.temporal.o.b(this, j, temporalUnit));
    }

    @Override // j$.time.chrono.b
    public long p() {
        return o(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.b
    public e q(j$.time.n nVar) {
        return new g(this, nVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: s */
    public final /* synthetic */ int compareTo(b bVar) {
        return j$.nio.file.attribute.a.d(this, bVar);
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        long o = o(j$.time.temporal.a.YEAR_OF_ERA);
        long o2 = o(j$.time.temporal.a.MONTH_OF_YEAR);
        long o3 = o(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(u());
        sb.append(" ");
        sb.append(o);
        sb.append(o2 < 10 ? "-0" : "-");
        sb.append(o2);
        sb.append(o3 < 10 ? "-0" : "-");
        sb.append(o3);
        return sb.toString();
    }

    public m u() {
        return getChronology().g(j$.time.temporal.o.a(this, j$.time.temporal.a.ERA));
    }

    public final long v(b bVar) {
        if (getChronology().o(j$.time.temporal.a.MONTH_OF_YEAR).d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long o = o(aVar) * 32;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((bVar.o(aVar) * 32) + bVar.f(aVar2)) - (o + j$.time.temporal.o.a(this, aVar2))) / 32;
    }

    public abstract b w(long j);

    public abstract b x(long j);

    public abstract b y(long j);

    @Override // j$.time.temporal.Temporal
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public b g(j$.time.temporal.l lVar) {
        return t(getChronology(), lVar.j(this));
    }
}
