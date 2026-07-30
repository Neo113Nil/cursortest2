package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class d0 implements TemporalAccessor {
    public j$.time.y b;
    public j$.time.chrono.m c;
    public boolean d;
    public e0 e;
    public j$.time.chrono.b f;
    public j$.time.l g;
    public final Map a = new HashMap();
    public j$.time.s h = j$.time.s.d;

    public final void A(j$.time.temporal.q qVar, j$.time.temporal.a aVar, Long l) {
        Long l2 = (Long) ((HashMap) this.a).put(aVar, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new j$.time.c("Conflict found: " + aVar + " " + l2 + " differs from " + aVar + " " + l + " while resolving  " + qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(j$.time.a0 a0Var) {
        if (a0Var == j$.time.temporal.r.a) {
            return this.b;
        }
        if (a0Var == j$.time.temporal.r.b) {
            return this.c;
        }
        if (a0Var == j$.time.temporal.r.f) {
            j$.time.chrono.b bVar = this.f;
            if (bVar != null) {
                return LocalDate.G(bVar);
            }
            return null;
        }
        if (a0Var == j$.time.temporal.r.g) {
            return this.g;
        }
        if (a0Var == j$.time.temporal.r.d) {
            Long l = (Long) ((HashMap) this.a).get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l != null) {
                return ZoneOffset.b0(l.intValue());
            }
            j$.time.y yVar = this.b;
            return yVar instanceof ZoneOffset ? yVar : a0Var.j(this);
        }
        if (a0Var == j$.time.temporal.r.e) {
            return a0Var.j(this);
        }
        if (a0Var == j$.time.temporal.r.c) {
            return null;
        }
        return a0Var.j(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        if (((HashMap) this.a).containsKey(qVar)) {
            return true;
        }
        j$.time.chrono.b bVar = this.f;
        if (bVar != null && bVar.f(qVar)) {
            return true;
        }
        j$.time.l lVar = this.g;
        if (lVar == null || !lVar.f(qVar)) {
            return (qVar == null || (qVar instanceof j$.time.temporal.a) || !qVar.s(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        Objects.requireNonNull(qVar, "field");
        Long l = (Long) ((HashMap) this.a).get(qVar);
        if (l != null) {
            return l.longValue();
        }
        j$.time.chrono.b bVar = this.f;
        if (bVar != null && bVar.f(qVar)) {
            return this.f.g(qVar);
        }
        j$.time.l lVar = this.g;
        if (lVar != null && lVar.f(qVar)) {
            return this.g.g(qVar);
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", qVar));
        }
        return qVar.P(this);
    }

    public final void p(TemporalAccessor temporalAccessor) {
        Iterator it = ((HashMap) this.a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.q qVar = (j$.time.temporal.q) entry.getKey();
            if (temporalAccessor.f(qVar)) {
                try {
                    long g = temporalAccessor.g(qVar);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (g != longValue) {
                        throw new j$.time.c("Conflict found: Field " + qVar + " " + g + " differs from " + qVar + " " + longValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final void q() {
        if (((HashMap) this.a).containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            j$.time.y yVar = this.b;
            if (yVar != null) {
                r(yVar);
                return;
            }
            Long l = (Long) ((HashMap) this.a).get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l != null) {
                r(ZoneOffset.b0(l.intValue()));
            }
        }
    }

    public final void r(j$.time.y yVar) {
        Map map = this.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        z(this.c.T(Instant.s(((Long) ((HashMap) map).remove(aVar)).longValue(), 0), yVar).n());
        A(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(r5.h().g0()));
    }

    public final void s(long j, long j2, long j3, long j4) {
        if (this.e == e0.LENIENT) {
            long addExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j, 3600000000000L), Math.multiplyExact(j2, 60000000000L)), Math.multiplyExact(j3, 1000000000L)), j4);
            v(j$.time.l.W(Math.floorMod(addExact, 86400000000000L)), j$.time.s.a(0, 0, (int) Math.floorDiv(addExact, 86400000000000L)));
            return;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.MINUTE_OF_HOUR;
        int a = aVar.b.a(j2, aVar);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
        int a2 = aVar2.b.a(j4, aVar2);
        if (this.e == e0.SMART && j == 24 && a == 0 && j3 == 0 && a2 == 0) {
            v(j$.time.l.g, j$.time.s.a(0, 0, 1));
            return;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.HOUR_OF_DAY;
        int a3 = aVar3.b.a(j, aVar3);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.SECOND_OF_MINUTE;
        v(j$.time.l.P(a3, a, aVar4.b.a(j3, aVar4), a2), j$.time.s.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            j$.time.chrono.b bVar = this.f;
            if (bVar != null) {
                sb.append(bVar);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }

    public final void u() {
        Map map = this.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(aVar)) {
            long longValue = ((Long) ((HashMap) this.a).remove(aVar)).longValue();
            e0 e0Var = this.e;
            if (e0Var == e0.STRICT || (e0Var == e0.SMART && longValue != 0)) {
                aVar.Z(longValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            A(aVar, aVar2, Long.valueOf(longValue));
        }
        Map map2 = this.a;
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(aVar3)) {
            long longValue2 = ((Long) ((HashMap) this.a).remove(aVar3)).longValue();
            e0 e0Var2 = this.e;
            if (e0Var2 == e0.STRICT || (e0Var2 == e0.SMART && longValue2 != 0)) {
                aVar3.Z(longValue2);
            }
            A(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(longValue2 != 12 ? longValue2 : 0L));
        }
        Map map3 = this.a;
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(aVar4)) {
            Map map4 = this.a;
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(aVar5)) {
                long longValue3 = ((Long) ((HashMap) this.a).remove(aVar4)).longValue();
                long longValue4 = ((Long) ((HashMap) this.a).remove(aVar5)).longValue();
                if (this.e == e0.LENIENT) {
                    A(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(longValue3, 12L), longValue4)));
                } else {
                    aVar4.Z(longValue3);
                    aVar5.Z(longValue3);
                    A(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((longValue3 * 12) + longValue4));
                }
            }
        }
        Map map5 = this.a;
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(aVar6)) {
            long longValue5 = ((Long) ((HashMap) this.a).remove(aVar6)).longValue();
            if (this.e != e0.LENIENT) {
                aVar6.Z(longValue5);
            }
            A(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            A(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            A(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            A(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        Map map6 = this.a;
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(aVar7)) {
            long longValue6 = ((Long) ((HashMap) this.a).remove(aVar7)).longValue();
            if (this.e != e0.LENIENT) {
                aVar7.Z(longValue6);
            }
            A(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            A(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        Map map7 = this.a;
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(aVar8)) {
            long longValue7 = ((Long) ((HashMap) this.a).remove(aVar8)).longValue();
            if (this.e != e0.LENIENT) {
                aVar8.Z(longValue7);
            }
            A(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            A(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        Map map8 = this.a;
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(aVar9)) {
            long longValue8 = ((Long) ((HashMap) this.a).remove(aVar9)).longValue();
            if (this.e != e0.LENIENT) {
                aVar9.Z(longValue8);
            }
            A(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            A(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            A(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        Map map9 = this.a;
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(aVar10)) {
            long longValue9 = ((Long) ((HashMap) this.a).remove(aVar10)).longValue();
            if (this.e != e0.LENIENT) {
                aVar10.Z(longValue9);
            }
            A(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            A(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        Map map10 = this.a;
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(aVar11)) {
            long longValue10 = ((Long) ((HashMap) this.a).get(aVar11)).longValue();
            e0 e0Var3 = this.e;
            e0 e0Var4 = e0.LENIENT;
            if (e0Var3 != e0Var4) {
                aVar11.Z(longValue10);
            }
            Map map11 = this.a;
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(aVar12)) {
                long longValue11 = ((Long) ((HashMap) this.a).remove(aVar12)).longValue();
                if (this.e != e0Var4) {
                    aVar12.Z(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                A(aVar12, aVar11, Long.valueOf(longValue10));
            }
            Map map12 = this.a;
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(aVar13)) {
                long longValue12 = ((Long) ((HashMap) this.a).remove(aVar13)).longValue();
                if (this.e != e0Var4) {
                    aVar13.Z(longValue12);
                }
                A(aVar13, aVar11, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        Map map13 = this.a;
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(aVar14)) {
            Map map14 = this.a;
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(aVar15)) {
                Map map15 = this.a;
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(aVar16) && ((HashMap) this.a).containsKey(aVar11)) {
                    s(((Long) ((HashMap) this.a).remove(aVar14)).longValue(), ((Long) ((HashMap) this.a).remove(aVar15)).longValue(), ((Long) ((HashMap) this.a).remove(aVar16)).longValue(), ((Long) ((HashMap) this.a).remove(aVar11)).longValue());
                }
            }
        }
    }

    public final void v(j$.time.l lVar, j$.time.s sVar) {
        j$.time.l lVar2 = this.g;
        if (lVar2 == null) {
            this.g = lVar;
            this.h = sVar;
            return;
        }
        if (!lVar2.equals(lVar)) {
            j$.time.h.f("Conflict found: Fields resolved to different times: ", this.g, " ", lVar);
            return;
        }
        j$.time.s sVar2 = this.h;
        sVar2.getClass();
        j$.time.s sVar3 = j$.time.s.d;
        if (sVar2 == sVar3 || sVar == sVar3 || this.h.equals(sVar)) {
            this.h = sVar;
        } else {
            j$.time.h.f("Conflict found: Fields resolved to different excess periods: ", this.h, " ", sVar);
        }
    }

    public final void z(j$.time.chrono.b bVar) {
        j$.time.chrono.b bVar2 = this.f;
        if (bVar2 != null) {
            if (bVar == null || bVar2.equals(bVar)) {
                return;
            }
            j$.time.h.f("Conflict found: Fields resolved to two different dates: ", this.f, " ", bVar);
            return;
        }
        if (bVar != null) {
            if (this.c.equals(bVar.d())) {
                this.f = bVar;
                return;
            }
            throw new j$.time.c("ChronoLocalDate must use the effective parsed chronology: " + this.c);
        }
    }
}
