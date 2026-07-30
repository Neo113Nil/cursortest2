package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class t extends a implements Serializable {
    public static final t c = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    private t() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final List A() {
        return j$.time.b.c(u.values());
    }

    @Override // j$.time.chrono.m
    public final n C(int i) {
        if (i == 0) {
            return u.BCE;
        }
        if (i == 1) {
            return u.CE;
        }
        j$.time.h.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.m
    public final int D(n nVar, int i) {
        if (nVar instanceof u) {
            return nVar == u.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.m
    public final b H(TemporalAccessor temporalAccessor) {
        return LocalDate.G(temporalAccessor);
    }

    @Override // j$.time.chrono.m
    public final e I(LocalDateTime localDateTime) {
        return LocalDateTime.B(localDateTime);
    }

    @Override // j$.time.chrono.a
    public final void J(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (e0Var != j$.time.format.e0.LENIENT) {
                aVar.Z(l.longValue());
            }
            a.s(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) Math.floorMod(l.longValue(), 12L)) + 1);
            a.s(map, j$.time.temporal.a.YEAR, Math.floorDiv(l.longValue(), 12L));
        }
    }

    @Override // j$.time.chrono.m
    public final b M() {
        return LocalDate.G(LocalDate.c0(j$.time.b.d()));
    }

    @Override // j$.time.chrono.a
    public final b P(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int a = aVar.b.a(((Long) map.remove(aVar)).longValue(), aVar);
        boolean z = true;
        if (e0Var == j$.time.format.e0.LENIENT) {
            return LocalDate.of(a, 1, 1).g0(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).f0(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int a2 = aVar2.b.a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int a3 = aVar3.b.a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (e0Var == j$.time.format.e0.SMART) {
            if (a2 == 4 || a2 == 6 || a2 == 9 || a2 == 11) {
                a3 = Math.min(a3, 30);
            } else if (a2 == 2) {
                j$.time.n nVar = j$.time.n.FEBRUARY;
                long j = a;
                int i = j$.time.v.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                a3 = Math.min(a3, nVar.B(z));
            }
        }
        return LocalDate.of(a, a2, a3);
    }

    @Override // j$.time.chrono.m
    public final b Q(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.m
    public final b S(Map map, j$.time.format.e0 e0Var) {
        return (LocalDate) super.S(map, e0Var);
    }

    @Override // j$.time.chrono.m
    public final j T(Instant instant, j$.time.y yVar) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(yVar, "zone");
        return ZonedDateTime.s(instant.getEpochSecond(), instant.getNano(), yVar);
    }

    @Override // j$.time.chrono.a
    public final b W(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (e0Var != j$.time.format.e0.LENIENT) {
                aVar.Z(l.longValue());
            }
            Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (l2 == null) {
                j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
                Long l3 = (Long) map.get(aVar2);
                if (e0Var != j$.time.format.e0.STRICT) {
                    a.s(map, aVar2, (l3 == null || l3.longValue() > 0) ? l.longValue() : Math.subtractExact(1L, l.longValue()));
                } else if (l3 != null) {
                    long longValue = l3.longValue();
                    long longValue2 = l.longValue();
                    if (longValue <= 0) {
                        longValue2 = Math.subtractExact(1L, longValue2);
                    }
                    a.s(map, aVar2, longValue2);
                } else {
                    map.put(aVar, l);
                }
            } else if (l2.longValue() == 1) {
                a.s(map, j$.time.temporal.a.YEAR, l.longValue());
            } else {
                if (l2.longValue() != 0) {
                    j$.time.h.i("Invalid value for era: ", l2);
                    return null;
                }
                a.s(map, j$.time.temporal.a.YEAR, Math.subtractExact(1L, l.longValue()));
            }
        } else {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
            if (map.containsKey(aVar3)) {
                aVar3.Z(((Long) map.get(aVar3)).longValue());
            }
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public final boolean X(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.m
    public final b p(long j) {
        return LocalDate.ofEpochDay(j);
    }

    @Override // j$.time.chrono.m
    public final String q() {
        return "ISO";
    }

    @Override // j$.time.chrono.m
    public final String u() {
        return "iso8601";
    }

    @Override // j$.time.chrono.m
    public final b v(int i, int i2) {
        return LocalDate.d0(i, i2);
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.u z(j$.time.temporal.a aVar) {
        return aVar.b;
    }
}
