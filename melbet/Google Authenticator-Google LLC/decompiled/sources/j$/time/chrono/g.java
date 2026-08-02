package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class g implements e, Temporal, j$.time.temporal.l, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient b a;
    public final transient j$.time.n b;

    public g(b bVar, j$.time.n nVar) {
        Objects.a(nVar, "time");
        this.a = bVar;
        this.b = nVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static g t(a aVar, Temporal temporal) {
        g gVar = (g) temporal;
        if (aVar.equals(gVar.a.getChronology())) {
            return gVar;
        }
        throw new ClassCastException(j$.time.g.a("Chronology mismatch, required: ", aVar.j(), ", actual: ", gVar.a.getChronology().j()));
    }

    private Object writeReplace() {
        return new e0((byte) 2, this);
    }

    @Override // j$.time.temporal.k
    public final boolean c(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar != null && nVar.f(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        return aVar.isDateBased() || aVar.n();
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        b bVar = this.a;
        e k = bVar.getChronology().k(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.between(this, k);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
        int compareTo = chronoUnit.compareTo(chronoUnit2);
        j$.time.n nVar = this.b;
        if (compareTo >= 0) {
            b localDate = k.toLocalDate();
            if (k.toLocalTime().compareTo(nVar) < 0) {
                localDate = localDate.n(1L, chronoUnit2);
            }
            return bVar.d(localDate, temporalUnit);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long o = k.o(aVar) - bVar.o(aVar);
        switch (f.a[chronoUnit.ordinal()]) {
            case 1:
                o = j$.nio.file.attribute.a.E(o, 86400000000000L);
                break;
            case 2:
                o = j$.nio.file.attribute.a.E(o, 86400000000L);
                break;
            case 3:
                o = j$.nio.file.attribute.a.E(o, 86400000L);
                break;
            case 4:
                o = j$.nio.file.attribute.a.E(o, 86400L);
                break;
            case 5:
                o = j$.nio.file.attribute.a.E(o, 1440L);
                break;
            case 6:
                o = j$.nio.file.attribute.a.E(o, 24L);
                break;
            case 7:
                o = j$.nio.file.attribute.a.E(o, 2L);
                break;
        }
        return j$.nio.file.attribute.a.D(o, nVar.d(k.toLocalTime(), temporalUnit));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && j$.nio.file.attribute.a.g(this, (e) obj) == 0;
    }

    @Override // j$.time.temporal.k
    public final int f(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).n() ? this.b.f(nVar) : this.a.f(nVar) : h(nVar).a(o(nVar), nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(j$.time.j jVar) {
        return y(jVar, this.b);
    }

    @Override // j$.time.chrono.e
    public final a getChronology() {
        return this.a.getChronology();
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.g(this);
        }
        if (!((j$.time.temporal.a) nVar).n()) {
            return this.a.h(nVar);
        }
        j$.time.n nVar2 = this.b;
        nVar2.getClass();
        return j$.time.temporal.o.d(nVar2, nVar);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.chrono.e
    public final j i(j$.time.c0 c0Var) {
        return l.t(c0Var, null, this);
    }

    @Override // j$.time.temporal.l
    public final Temporal j(Temporal temporal) {
        return temporal.a(toLocalDate().p(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().E(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object k(j$.time.format.b bVar) {
        return j$.nio.file.attribute.a.s(this, bVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return t(this.a.getChronology(), j$.time.temporal.o.b(this, j, chronoUnit));
    }

    @Override // j$.time.temporal.k
    public final long o(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).n() ? this.b.o(nVar) : this.a.o(nVar) : nVar.h(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: r */
    public final /* synthetic */ int compareTo(e eVar) {
        return j$.nio.file.attribute.a.g(this, eVar);
    }

    @Override // j$.time.chrono.e
    public final b toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.e
    public final j$.time.n toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final g b(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        b bVar = this.a;
        if (!z) {
            return t(bVar.getChronology(), temporalUnit.f(this, j));
        }
        int i = f.a[((ChronoUnit) temporalUnit).ordinal()];
        j$.time.n nVar = this.b;
        switch (i) {
            case 1:
                return v(bVar, 0L, 0L, 0L, j);
            case 2:
                g y = y(bVar.b(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), nVar);
                return y.v(y.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                g y2 = y(bVar.b(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), nVar);
                return y2.v(y2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return v(bVar, 0L, 0L, j, 0L);
            case 5:
                return v(bVar, 0L, j, 0L, 0L);
            case 6:
                return v(bVar, j, 0L, 0L, 0L);
            case 7:
                g y3 = y(bVar.b(j / 256, (TemporalUnit) ChronoUnit.DAYS), nVar);
                return y3.v(y3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return y(bVar.b(j, temporalUnit), nVar);
        }
    }

    public final g v(b bVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.n nVar = this.b;
        if (j5 == 0) {
            return y(bVar, nVar);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long E = nVar.E();
        long j10 = j9 + E;
        long B = j$.nio.file.attribute.a.B(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long C = j$.nio.file.attribute.a.C(j10, 86400000000000L);
        if (C != E) {
            nVar = j$.time.n.x(C);
        }
        return y(bVar.b(B, (TemporalUnit) ChronoUnit.DAYS), nVar);
    }

    public final /* synthetic */ long w(j$.time.c0 c0Var) {
        return j$.nio.file.attribute.a.v(this, c0Var);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final g a(long j, j$.time.temporal.n nVar) {
        boolean z = nVar instanceof j$.time.temporal.a;
        b bVar = this.a;
        if (!z) {
            return t(bVar.getChronology(), nVar.j(this, j));
        }
        boolean n = ((j$.time.temporal.a) nVar).n();
        j$.time.n nVar2 = this.b;
        return n ? y(bVar, nVar2.a(j, nVar)) : y(bVar.a(j, nVar), nVar2);
    }

    public final g y(Temporal temporal, j$.time.n nVar) {
        b bVar = this.a;
        return (bVar == temporal && this.b == nVar) ? this : new g(d.t(bVar.getChronology(), temporal), nVar);
    }
}
