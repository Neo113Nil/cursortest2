package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class f0 implements Temporal, j$.time.chrono.j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final l a;
    public final c0 b;
    public final b0 c;

    public f0(l lVar, b0 b0Var, c0 c0Var) {
        this.a = lVar;
        this.b = c0Var;
        this.c = b0Var;
    }

    public static f0 j(long j, int i, b0 b0Var) {
        c0 d = b0Var.v().d(Instant.ofEpochSecond(j, i));
        return new f0(l.x(j, i, d), b0Var, d);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static f0 t(Temporal temporal) {
        if (temporal instanceof f0) {
            return (f0) temporal;
        }
        try {
            b0 t = b0.t(temporal);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            return temporal.c(aVar) ? j(temporal.o(aVar), temporal.f(j$.time.temporal.a.NANO_OF_SECOND), t) : u(l.w(j.v(temporal), n.v(temporal)), t, null);
        } catch (c e) {
            throw new c(g.a("Unable to obtain ZonedDateTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
        }
    }

    public static f0 u(l lVar, b0 b0Var, c0 c0Var) {
        Objects.a(lVar, "localDateTime");
        Objects.a(b0Var, "zone");
        if (b0Var instanceof c0) {
            return new f0(lVar, b0Var, (c0) b0Var);
        }
        j$.time.zone.e v = b0Var.v();
        List f = v.f(lVar);
        if (f.size() == 1) {
            c0Var = (c0) f.get(0);
        } else if (f.size() == 0) {
            Object e = v.e(lVar);
            j$.time.zone.b bVar = e instanceof j$.time.zone.b ? (j$.time.zone.b) e : null;
            lVar = lVar.z(Duration.ofSeconds(bVar.d.a - bVar.c.a).getSeconds());
            c0Var = bVar.d;
        } else if (c0Var == null || !f.contains(c0Var)) {
            c0Var = (c0) f.get(0);
            Objects.a(c0Var, "offset");
        }
        return new f0(lVar, b0Var, c0Var);
    }

    private Object writeReplace() {
        return new w((byte) 6, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (f0) nVar.j(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = e0.a[aVar.ordinal()];
        b0 b0Var = this.c;
        l lVar = this.a;
        if (i == 1) {
            return j(j, lVar.b.d, b0Var);
        }
        c0 c0Var = this.b;
        if (i != 2) {
            return u(lVar.a(j, nVar), b0Var, c0Var);
        }
        c0 C = c0.C(aVar.b.a(j, aVar));
        return (C.equals(c0Var) || !b0Var.v().f(lVar).contains(C)) ? this : new f0(lVar, b0Var, C);
    }

    @Override // j$.time.temporal.k
    public final boolean c(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return true;
        }
        return nVar != null && nVar.f(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.nio.file.attribute.a.h(this, (j$.time.chrono.j) obj);
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        f0 t = t(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, t);
        }
        f0 e = t.e(this.c);
        l lVar = e.a;
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        int compareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
        l lVar2 = this.a;
        return (compareTo < 0 || chronoUnit == ChronoUnit.FOREVER) ? new s(lVar2, this.b).d(new s(lVar, e.b), temporalUnit) : lVar2.d(lVar, temporalUnit);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (this.a.equals(f0Var.a) && this.b.equals(f0Var.b) && this.c.equals(f0Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final int f(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.nio.file.attribute.a.k(this, nVar);
        }
        int i = e0.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.f(nVar) : this.b.a;
        }
        i.a("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        return 0;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(j jVar) {
        return u(l.w(jVar, this.a.b), this.c, this.b);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.a getChronology() {
        return ((j) toLocalDate()).getChronology();
    }

    @Override // j$.time.chrono.j
    public final c0 getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.j
    public final b0 getZone() {
        return this.c;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) nVar).b : this.a.h(nVar) : nVar.g(this);
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c.hashCode(), 3) ^ (this.a.hashCode() ^ this.b.a);
    }

    @Override // j$.time.temporal.k
    public final Object k(j$.time.format.b bVar) {
        return bVar == j$.time.temporal.o.f ? this.a.a : j$.nio.file.attribute.a.t(this, bVar);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.j m(b0 b0Var) {
        Objects.a(b0Var, "zone");
        return this.c.equals(b0Var) ? this : u(this.a, b0Var, this.b);
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
        int i = e0.a[((j$.time.temporal.a) nVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.o(nVar) : this.b.a : j$.nio.file.attribute.a.w(this);
    }

    @Override // j$.time.chrono.j
    public final /* synthetic */ long toEpochSecond() {
        return j$.nio.file.attribute.a.w(this);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.b toLocalDate() {
        return this.a.a;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.e toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.chrono.j
    public final n toLocalTime() {
        return this.a.b;
    }

    public final String toString() {
        String lVar = this.a.toString();
        c0 c0Var = this.b;
        String str = lVar + c0Var.b;
        b0 b0Var = this.c;
        return c0Var != b0Var ? g.a(str, "[", b0Var.toString(), "]") : str;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final f0 b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (f0) temporalUnit.f(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        boolean z = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
        c0 c0Var = this.b;
        b0 b0Var = this.c;
        l lVar = this.a;
        if (z) {
            return u(lVar.b(j, temporalUnit), b0Var, c0Var);
        }
        l b = lVar.b(j, temporalUnit);
        Objects.a(b, "localDateTime");
        Objects.a(c0Var, "offset");
        Objects.a(b0Var, "zone");
        return b0Var.v().f(b).contains(c0Var) ? new f0(b, b0Var, c0Var) : j(j$.nio.file.attribute.a.v(b, c0Var), b.b.d, b0Var);
    }

    @Override // j$.time.chrono.j
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final f0 e(b0 b0Var) {
        Objects.a(b0Var, "zone");
        if (this.c.equals(b0Var)) {
            return this;
        }
        l lVar = this.a;
        lVar.getClass();
        return j(j$.nio.file.attribute.a.v(lVar, this.b), lVar.b.d, b0Var);
    }
}
