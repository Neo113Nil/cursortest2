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
public final class s implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final l a;
    public final c0 b;

    static {
        l lVar = l.c;
        c0 c0Var = c0.g;
        lVar.getClass();
        new s(lVar, c0Var);
        l lVar2 = l.d;
        c0 c0Var2 = c0.f;
        lVar2.getClass();
        new s(lVar2, c0Var2);
    }

    public s(l lVar, c0 c0Var) {
        Objects.a(lVar, "dateTime");
        this.a = lVar;
        Objects.a(c0Var, "offset");
        this.b = c0Var;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static s t(Instant instant, b0 b0Var) {
        Objects.a(instant, "instant");
        Objects.a(b0Var, "zone");
        c0 d = b0Var.v().d(instant);
        return new s(l.x(instant.getEpochSecond(), instant.getNano(), d), d);
    }

    private Object writeReplace() {
        return new w((byte) 10, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (s) nVar.j(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = r.a[aVar.ordinal()];
        c0 c0Var = this.b;
        l lVar = this.a;
        return i != 1 ? i != 2 ? v(lVar.a(j, nVar), c0Var) : v(lVar, c0.C(aVar.b.a(j, aVar))) : t(Instant.ofEpochSecond(j, lVar.b.d), c0Var);
    }

    @Override // j$.time.temporal.k
    public final boolean c(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return true;
        }
        return nVar != null && nVar.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compare;
        s sVar = (s) obj;
        c0 c0Var = sVar.b;
        l lVar = sVar.a;
        c0 c0Var2 = this.b;
        boolean equals = c0Var2.equals(c0Var);
        l lVar2 = this.a;
        if (equals) {
            compare = lVar2.compareTo(lVar);
        } else {
            lVar2.getClass();
            long v = j$.nio.file.attribute.a.v(lVar2, c0Var2);
            c0 c0Var3 = sVar.b;
            lVar.getClass();
            compare = Long.compare(v, j$.nio.file.attribute.a.v(lVar, c0Var3));
            if (compare == 0) {
                compare = lVar2.b.d - lVar.b.d;
            }
        }
        return compare == 0 ? lVar2.compareTo(lVar) : compare;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [j$.time.s] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        if (temporal instanceof s) {
            temporal = (s) temporal;
        } else {
            try {
                c0 z = c0.z(temporal);
                j jVar = (j) temporal.k(j$.time.temporal.o.f);
                n nVar = (n) temporal.k(j$.time.temporal.o.g);
                temporal = (jVar == null || nVar == null) ? t(Instant.u(temporal), z) : new s(l.w(jVar, nVar), z);
            } catch (c e) {
                throw new c(g.a("Unable to obtain OffsetDateTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, temporal);
        }
        c0 c0Var = temporal.b;
        c0 c0Var2 = this.b;
        s sVar = temporal;
        if (!c0Var2.equals(c0Var)) {
            sVar = new s(temporal.a.z(c0Var2.a - c0Var.a), c0Var2);
        }
        return this.a.d(sVar.a, temporalUnit);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.a.equals(sVar.a) && this.b.equals(sVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final int f(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.o.a(this, nVar);
        }
        int i = r.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.f(nVar) : this.b.a;
        }
        i.a("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        return 0;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(j jVar) {
        l lVar = this.a;
        return v(lVar.C(jVar, lVar.b), this.b);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) nVar).b : this.a.h(nVar) : nVar.g(this);
    }

    public final int hashCode() {
        return this.b.a ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.l
    public final Temporal j(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        l lVar = this.a;
        return temporal.a(lVar.a.p(), aVar).a(lVar.b.E(), j$.time.temporal.a.NANO_OF_DAY).a(this.b.a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.k
    public final Object k(j$.time.format.b bVar) {
        if (bVar == j$.time.temporal.o.d || bVar == j$.time.temporal.o.e) {
            return this.b;
        }
        if (bVar == j$.time.temporal.o.a) {
            return null;
        }
        j$.time.format.b bVar2 = j$.time.temporal.o.f;
        l lVar = this.a;
        return bVar == bVar2 ? lVar.a : bVar == j$.time.temporal.o.g ? lVar.b : bVar == j$.time.temporal.o.b ? j$.time.chrono.s.c : bVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : bVar.a(this);
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
        int i = r.a[((j$.time.temporal.a) nVar).ordinal()];
        c0 c0Var = this.b;
        l lVar = this.a;
        if (i != 1) {
            return i != 2 ? lVar.o(nVar) : c0Var.a;
        }
        lVar.getClass();
        return j$.nio.file.attribute.a.v(lVar, c0Var);
    }

    public final String toString() {
        return this.a.toString() + this.b.b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final s b(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? v(this.a.b(j, temporalUnit), this.b) : (s) temporalUnit.f(this, j);
    }

    public final s v(l lVar, c0 c0Var) {
        return (this.a == lVar && this.b.equals(c0Var)) ? this : new s(lVar, c0Var);
    }
}
