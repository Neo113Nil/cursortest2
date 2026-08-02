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
public final class u implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final n a;
    public final c0 b;

    static {
        n nVar = n.e;
        c0 c0Var = c0.g;
        nVar.getClass();
        new u(nVar, c0Var);
        n nVar2 = n.f;
        c0 c0Var2 = c0.f;
        nVar2.getClass();
        new u(nVar2, c0Var2);
    }

    public u(n nVar, c0 c0Var) {
        Objects.a(nVar, "time");
        this.a = nVar;
        Objects.a(c0Var, "offset");
        this.b = c0Var;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 9, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (u) nVar.j(this, j);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        n nVar2 = this.a;
        if (nVar != aVar) {
            return v(nVar2.a(j, nVar), this.b);
        }
        j$.time.temporal.a aVar2 = (j$.time.temporal.a) nVar;
        return v(nVar2, c0.C(aVar2.b.a(j, aVar2)));
    }

    @Override // j$.time.temporal.k
    public final boolean c(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).n() || nVar == j$.time.temporal.a.OFFSET_SECONDS : nVar != null && nVar.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u uVar = (u) obj;
        c0 c0Var = uVar.b;
        n nVar = uVar.a;
        boolean equals = this.b.equals(c0Var);
        n nVar2 = this.a;
        if (equals) {
            return nVar2.compareTo(nVar);
        }
        int compare = Long.compare(u(), uVar.u());
        return compare == 0 ? nVar2.compareTo(nVar) : compare;
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        u uVar;
        if (temporal instanceof u) {
            uVar = (u) temporal;
        } else {
            try {
                uVar = new u(n.v(temporal), c0.z(temporal));
            } catch (c e) {
                throw new c(g.a("Unable to obtain OffsetTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, uVar);
        }
        long u = uVar.u() - u();
        switch (t.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return u;
            case 2:
                return u / 1000;
            case 3:
                return u / 1000000;
            case 4:
                return u / 1000000000;
            case 5:
                return u / 60000000000L;
            case 6:
                return u / 3600000000000L;
            case 7:
                return u / 43200000000000L;
            default:
                i.a("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.a.equals(uVar.a) && this.b.equals(uVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final int f(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(j jVar) {
        return (u) j$.nio.file.attribute.a.c(jVar, this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.g(this);
        }
        if (nVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return ((j$.time.temporal.a) nVar).b;
        }
        n nVar2 = this.a;
        nVar2.getClass();
        return j$.time.temporal.o.d(nVar2, nVar);
    }

    public final int hashCode() {
        return this.b.a ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.l
    public final Temporal j(Temporal temporal) {
        return temporal.a(this.a.E(), j$.time.temporal.a.NANO_OF_DAY).a(this.b.a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.k
    public final Object k(j$.time.format.b bVar) {
        if (bVar == j$.time.temporal.o.d || bVar == j$.time.temporal.o.e) {
            return this.b;
        }
        if (((bVar == j$.time.temporal.o.a) || (bVar == j$.time.temporal.o.b)) || bVar == j$.time.temporal.o.f) {
            return null;
        }
        return bVar == j$.time.temporal.o.g ? this.a : bVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : bVar.a(this);
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
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.OFFSET_SECONDS ? this.b.a : this.a.o(nVar) : nVar.h(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final u b(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? v(this.a.b(j, temporalUnit), this.b) : (u) temporalUnit.f(this, j);
    }

    public final String toString() {
        return this.a.toString() + this.b.b;
    }

    public final long u() {
        return this.a.E() - (this.b.a * 1000000000);
    }

    public final u v(n nVar, c0 c0Var) {
        return (this.a == nVar && this.b.equals(c0Var)) ? this : new u(nVar, c0Var);
    }
}
