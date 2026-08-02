package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class l implements Temporal, j$.time.temporal.l, j$.time.chrono.e, Serializable {
    public static final l c = w(j.d, n.e);
    public static final l d = w(j.e, n.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final j a;
    public final n b;

    public l(j jVar, n nVar) {
        this.a = jVar;
        this.b = nVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static l u(j$.time.temporal.k kVar) {
        if (kVar instanceof l) {
            return (l) kVar;
        }
        if (kVar instanceof f0) {
            return ((f0) kVar).a;
        }
        if (kVar instanceof s) {
            return ((s) kVar).a;
        }
        try {
            return new l(j.v(kVar), n.v(kVar));
        } catch (c e) {
            throw new c(g.a("Unable to obtain LocalDateTime from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()), e);
        }
    }

    public static l w(j jVar, n nVar) {
        Objects.a(jVar, "date");
        Objects.a(nVar, "time");
        return new l(jVar, nVar);
    }

    private Object writeReplace() {
        return new w((byte) 5, this);
    }

    public static l x(long j, int i, c0 c0Var) {
        Objects.a(c0Var, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.k(j2);
        return new l(j.F(j$.nio.file.attribute.a.B(j + c0Var.a, 86400L)), n.x((((int) j$.nio.file.attribute.a.C(r5, 86400L)) * 1000000000) + j2));
    }

    public final l A(j jVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        n nVar = this.b;
        if (j5 == 0) {
            return C(jVar, nVar);
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
            nVar = n.x(C);
        }
        return C(jVar.H(B), nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final l a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (l) nVar.j(this, j);
        }
        boolean n = ((j$.time.temporal.a) nVar).n();
        n nVar2 = this.b;
        j jVar = this.a;
        return n ? C(jVar, nVar2.a(j, nVar)) : C(jVar.a(j, nVar), nVar2);
    }

    public final l C(j jVar, n nVar) {
        return (this.a == jVar && this.b == nVar) ? this : new l(jVar, nVar);
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
        j jVar;
        long j;
        long j2;
        l u = u(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, u);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        int compareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
        n nVar = this.b;
        j jVar2 = this.a;
        if (compareTo >= 0) {
            j jVar3 = u.a;
            n nVar2 = u.b;
            boolean z = false;
            if (jVar2 == null ? jVar3.p() > jVar2.p() : jVar3.t(jVar2) > 0) {
                z = true;
            }
            if (!z || nVar2.compareTo(nVar) >= 0) {
                boolean A = jVar3.A(jVar2);
                jVar = jVar3;
                if (A) {
                    jVar = jVar3;
                    if (nVar2.compareTo(nVar) > 0) {
                        jVar = jVar3.H(1L);
                    }
                }
            } else {
                jVar = jVar3.H(-1L);
            }
            return jVar2.d(jVar, temporalUnit);
        }
        j jVar4 = u.a;
        n nVar3 = u.b;
        jVar2.getClass();
        long p = jVar4.p() - jVar2.p();
        if (p == 0) {
            return nVar.d(nVar3, temporalUnit);
        }
        long E = nVar3.E() - nVar.E();
        if (p > 0) {
            j = p - 1;
            j2 = E + 86400000000000L;
        } else {
            j = p + 1;
            j2 = E - 86400000000000L;
        }
        switch (k.a[chronoUnit.ordinal()]) {
            case 1:
                j = j$.nio.file.attribute.a.E(j, 86400000000000L);
                break;
            case 2:
                j = j$.nio.file.attribute.a.E(j, 86400000000L);
                j2 /= 1000;
                break;
            case 3:
                j = j$.nio.file.attribute.a.E(j, 86400000L);
                j2 /= 1000000;
                break;
            case 4:
                j = j$.nio.file.attribute.a.E(j, 86400L);
                j2 /= 1000000000;
                break;
            case 5:
                j = j$.nio.file.attribute.a.E(j, 1440L);
                j2 /= 60000000000L;
                break;
            case 6:
                j = j$.nio.file.attribute.a.E(j, 24L);
                j2 /= 3600000000000L;
                break;
            case 7:
                j = j$.nio.file.attribute.a.E(j, 2L);
                j2 /= 43200000000000L;
                break;
        }
        return j$.nio.file.attribute.a.D(j, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.a.equals(lVar.a) && this.b.equals(lVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final int f(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).n() ? this.b.f(nVar) : this.a.f(nVar) : j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(j jVar) {
        return C(jVar, this.b);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.a getChronology() {
        return ((j) toLocalDate()).getChronology();
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.g(this);
        }
        if (!((j$.time.temporal.a) nVar).n()) {
            return this.a.h(nVar);
        }
        n nVar2 = this.b;
        nVar2.getClass();
        return j$.time.temporal.o.d(nVar2, nVar);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.j i(c0 c0Var) {
        return f0.u(this, c0Var, null);
    }

    @Override // j$.time.temporal.l
    public final Temporal j(Temporal temporal) {
        return temporal.a(((j) toLocalDate()).p(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().E(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.k
    public final Object k(j$.time.format.b bVar) {
        return bVar == j$.time.temporal.o.f ? this.a : j$.nio.file.attribute.a.s(this, bVar);
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
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).n() ? this.b.o(nVar) : this.a.o(nVar) : nVar.h(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.e eVar) {
        return eVar instanceof l ? t((l) eVar) : j$.nio.file.attribute.a.g(this, eVar);
    }

    public final int t(l lVar) {
        int t = this.a.t(lVar.a);
        return t == 0 ? this.b.compareTo(lVar.b) : t;
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.b toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.e
    public final n toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    public final boolean v(j$.time.chrono.e eVar) {
        if (eVar instanceof l) {
            return t((l) eVar) < 0;
        }
        long p = this.a.p();
        long p2 = eVar.toLocalDate().p();
        if (p >= p2) {
            return p == p2 && this.b.E() < eVar.toLocalTime().E();
        }
        return true;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final l b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (l) temporalUnit.f(this, j);
        }
        int i = k.a[((ChronoUnit) temporalUnit).ordinal()];
        n nVar = this.b;
        j jVar = this.a;
        switch (i) {
            case 1:
                return A(this.a, 0L, 0L, 0L, j);
            case 2:
                l C = C(jVar.H(j / 86400000000L), nVar);
                return C.A(C.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                l C2 = C(jVar.H(j / 86400000), nVar);
                return C2.A(C2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return z(j);
            case 5:
                return A(this.a, 0L, j, 0L, 0L);
            case 6:
                return A(this.a, j, 0L, 0L, 0L);
            case 7:
                l C3 = C(jVar.H(j / 256), nVar);
                return C3.A(C3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return C(jVar.b(j, temporalUnit), nVar);
        }
    }

    public final l z(long j) {
        return A(this.a, 0L, 0L, j, 0L);
    }
}
