package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
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
public final class l implements j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient g a;
    public final transient j$.time.c0 b;
    public final transient j$.time.b0 c;

    public l(j$.time.b0 b0Var, j$.time.c0 c0Var, g gVar) {
        Objects.a(gVar, "dateTime");
        this.a = gVar;
        this.b = c0Var;
        Objects.a(b0Var, "zone");
        this.c = b0Var;
    }

    public static l j(a aVar, Temporal temporal) {
        l lVar = (l) temporal;
        if (aVar.equals(lVar.getChronology())) {
            return lVar;
        }
        throw new ClassCastException(j$.time.g.a("Chronology mismatch, required: ", aVar.j(), ", actual: ", lVar.getChronology().j()));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static l t(j$.time.b0 b0Var, j$.time.c0 c0Var, g gVar) {
        Objects.a(gVar, "localDateTime");
        Objects.a(b0Var, "zone");
        if (b0Var instanceof j$.time.c0) {
            return new l(b0Var, (j$.time.c0) b0Var, gVar);
        }
        j$.time.zone.e v = b0Var.v();
        j$.time.l u = j$.time.l.u(gVar);
        List f = v.f(u);
        if (f.size() == 1) {
            c0Var = (j$.time.c0) f.get(0);
        } else if (f.size() == 0) {
            Object e = v.e(u);
            j$.time.zone.b bVar = e instanceof j$.time.zone.b ? (j$.time.zone.b) e : null;
            gVar = gVar.v(gVar.a, 0L, 0L, Duration.ofSeconds(bVar.d.a - bVar.c.a).getSeconds(), 0L);
            c0Var = bVar.d;
        } else {
            if (c0Var == null || !f.contains(c0Var)) {
                c0Var = (j$.time.c0) f.get(0);
            }
            gVar = gVar;
        }
        Objects.a(c0Var, "offset");
        return new l(b0Var, c0Var, gVar);
    }

    public static l u(a aVar, Instant instant, j$.time.b0 b0Var) {
        j$.time.c0 d = b0Var.v().d(instant);
        Objects.a(d, "offset");
        return new l(b0Var, d, (g) aVar.k(j$.time.l.x(instant.getEpochSecond(), instant.getNano(), d)));
    }

    private Object writeReplace() {
        return new e0((byte) 3, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j(getChronology(), nVar.j(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = k.a[aVar.ordinal()];
        if (i == 1) {
            return b(j - j$.nio.file.attribute.a.w(this), ChronoUnit.SECONDS);
        }
        j$.time.b0 b0Var = this.c;
        g gVar = this.a;
        if (i != 2) {
            return t(b0Var, this.b, gVar.a(j, nVar));
        }
        j$.time.c0 C = j$.time.c0.C(aVar.b.a(j, aVar));
        gVar.getClass();
        return u(getChronology(), Instant.ofEpochSecond(gVar.w(C), gVar.toLocalTime().d), b0Var);
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
        return j$.nio.file.attribute.a.h(this, (j) obj);
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        j v = getChronology().v(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.a.d(v.e(this.b).toLocalDateTime(), temporalUnit);
        }
        Objects.a(temporalUnit, "unit");
        return temporalUnit.between(this, v);
    }

    @Override // j$.time.chrono.j
    public final j e(j$.time.b0 b0Var) {
        if (this.c.equals(b0Var)) {
            return this;
        }
        g gVar = this.a;
        gVar.getClass();
        return u(getChronology(), Instant.ofEpochSecond(gVar.w(this.b), gVar.toLocalTime().d), b0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && j$.nio.file.attribute.a.h(this, (j) obj) == 0;
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int f(j$.time.temporal.n nVar) {
        return j$.nio.file.attribute.a.k(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(j$.time.j jVar) {
        return j(getChronology(), jVar.j(this));
    }

    @Override // j$.time.chrono.j
    public final a getChronology() {
        return this.a.a.getChronology();
    }

    @Override // j$.time.chrono.j
    public final j$.time.c0 getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.j
    public final j$.time.b0 getZone() {
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
    public final /* synthetic */ Object k(j$.time.format.b bVar) {
        return j$.nio.file.attribute.a.t(this, bVar);
    }

    @Override // j$.time.chrono.j
    public final j m(j$.time.b0 b0Var) {
        return t(b0Var, this.b, this.a);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return j(getChronology(), j$.time.temporal.o.b(this, j, chronoUnit));
    }

    @Override // j$.time.temporal.k
    public final long o(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.h(this);
        }
        int i = i.a[((j$.time.temporal.a) nVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.o(nVar) : this.b.a : j$.nio.file.attribute.a.w(this);
    }

    @Override // j$.time.chrono.j
    public final /* synthetic */ long toEpochSecond() {
        return j$.nio.file.attribute.a.w(this);
    }

    @Override // j$.time.chrono.j
    public final b toLocalDate() {
        return this.a.a;
    }

    @Override // j$.time.chrono.j
    public final e toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.chrono.j
    public final j$.time.n toLocalTime() {
        return ((g) toLocalDateTime()).toLocalTime();
    }

    public final String toString() {
        String gVar = this.a.toString();
        j$.time.c0 c0Var = this.b;
        String str = gVar + c0Var.b;
        j$.time.b0 b0Var = this.c;
        return c0Var != b0Var ? j$.time.g.a(str, "[", b0Var.toString(), "]") : str;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final l b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return j(getChronology(), temporalUnit.f(this, j));
        }
        return j(getChronology(), this.a.b(j, temporalUnit).j(this));
    }
}
