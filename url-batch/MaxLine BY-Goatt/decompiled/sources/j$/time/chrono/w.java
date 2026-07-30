package j$.time.chrono;

import defpackage.l42;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class w extends a implements Serializable {
    public static final w c = new w();
    private static final long serialVersionUID = 459996390165777884L;

    private w() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final List A() {
        z[] zVarArr = z.e;
        return j$.time.b.c((z[]) Arrays.copyOf(zVarArr, zVarArr.length));
    }

    @Override // j$.time.chrono.m
    public final n C(int i) {
        return z.r(i);
    }

    @Override // j$.time.chrono.m
    public final int D(n nVar, int i) {
        if (!(nVar instanceof z)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        z zVar = (z) nVar;
        int year = (zVar.b.getYear() + i) - 1;
        if (i == 1 || (year >= -999999999 && year <= 999999999 && year >= zVar.b.getYear() && nVar == z.p(LocalDate.of(year, 1, 1)))) {
            return year;
        }
        j$.time.h.a("Invalid yearOfEra value");
        return 0;
    }

    @Override // j$.time.chrono.m
    public final b H(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof y ? (y) temporalAccessor : new y(LocalDate.G(temporalAccessor));
    }

    @Override // j$.time.chrono.m
    public final b M() {
        return new y(LocalDate.G(LocalDate.c0(j$.time.b.d())));
    }

    @Override // j$.time.chrono.m
    public final b Q(int i, int i2, int i3) {
        return new y(LocalDate.of(i, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.m
    public final b S(Map map, j$.time.format.e0 e0Var) {
        return (y) super.S(map, e0Var);
    }

    @Override // j$.time.chrono.m
    public final j T(Instant instant, j$.time.y yVar) {
        return l.G(this, instant, yVar);
    }

    @Override // j$.time.chrono.a
    public final b W(Map map, j$.time.format.e0 e0Var) {
        y a0;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l = (Long) map.get(aVar);
        z r = l != null ? z.r(z(aVar).a(l.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) map.get(aVar2);
        int a = l2 != null ? z(aVar2).a(l2.longValue(), aVar2) : 0;
        if (r == null && l2 != null && !map.containsKey(j$.time.temporal.a.YEAR) && e0Var != j$.time.format.e0.STRICT) {
            z[] zVarArr = z.e;
            r = ((z[]) Arrays.copyOf(zVarArr, zVarArr.length))[((z[]) Arrays.copyOf(zVarArr, zVarArr.length)).length - 1];
        }
        if (l2 != null && r != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (e0Var == j$.time.format.e0.LENIENT) {
                        return new y(LocalDate.of((r.b.getYear() + a) - 1, 1, 1)).P(Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), j$.time.temporal.b.MONTHS).P(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), j$.time.temporal.b.DAYS);
                    }
                    int a2 = z(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int a3 = z(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (e0Var != j$.time.format.e0.SMART) {
                        LocalDate localDate = y.d;
                        LocalDate of = LocalDate.of((r.b.getYear() + a) - 1, a2, a3);
                        if (!of.Z(r.b) && r == z.p(of)) {
                            return new y(r, a, of);
                        }
                        j$.time.h.a("year, month, and day not valid for Era");
                        return null;
                    }
                    if (a < 1) {
                        j$.time.h.b("Invalid YearOfEra: ", a);
                        return null;
                    }
                    int year = (r.b.getYear() + a) - 1;
                    try {
                        a0 = new y(LocalDate.of(year, a2, a3));
                    } catch (j$.time.c unused) {
                        a0 = new y(LocalDate.of(year, a2, 1)).a0(new j$.time.a0(2));
                    }
                    if (a0.b == r || a0.e(j$.time.temporal.a.YEAR_OF_ERA) <= 1 || a <= 1) {
                        return a0;
                    }
                    throw new j$.time.c("Invalid YearOfEra for Era: " + r + " " + a);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (e0Var == j$.time.format.e0.LENIENT) {
                    return new y(LocalDate.d0((r.b.getYear() + a) - 1, 1)).P(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), j$.time.temporal.b.DAYS);
                }
                int a4 = z(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                LocalDate localDate2 = y.d;
                LocalDate localDate3 = r.b;
                LocalDate d0 = a == 1 ? LocalDate.d0(localDate3.getYear(), (r.b.W() + a4) - 1) : LocalDate.d0((localDate3.getYear() + a) - 1, a4);
                if (!d0.Z(r.b) && r == z.p(d0)) {
                    return new y(r, a, d0);
                }
                j$.time.h.a("Invalid parameters");
            }
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public final boolean X(long j) {
        return t.c.X(j);
    }

    @Override // j$.time.chrono.m
    public final b p(long j) {
        return new y(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.m
    public final String q() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final String u() {
        return "japanese";
    }

    @Override // j$.time.chrono.m
    public final b v(int i, int i2) {
        return new y(LocalDate.d0(i, i2));
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.u z(j$.time.temporal.a aVar) {
        switch (v.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                j$.time.h.d("Unsupported field: ", aVar);
                return null;
            case 5:
                z[] zVarArr = z.e;
                int year = zVarArr[zVarArr.length - 1].b.getYear();
                int year2 = 1000000000 - zVarArr[zVarArr.length - 1].b.getYear();
                int year3 = zVarArr[0].b.getYear();
                int i = 1;
                while (true) {
                    z[] zVarArr2 = z.e;
                    if (i >= zVarArr2.length) {
                        return j$.time.temporal.u.g(1L, year2, 999999999 - year);
                    }
                    z zVar = zVarArr2[i];
                    year2 = Math.min(year2, (zVar.b.getYear() - year3) + 1);
                    year3 = zVar.b.getYear();
                    i++;
                }
            case 6:
                z zVar2 = z.d;
                long j = j$.time.temporal.a.DAY_OF_YEAR.b.c;
                long j2 = j;
                for (z zVar3 : z.e) {
                    long min = Math.min(j2, (zVar3.b.U() - zVar3.b.W()) + 1);
                    j2 = zVar3.q() != null ? Math.min(min, zVar3.q().b.W() - 1) : min;
                }
                return j$.time.temporal.u.g(1L, j2, j$.time.temporal.a.DAY_OF_YEAR.b.d);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return j$.time.temporal.u.f(y.d.getYear(), 999999999L);
            case 8:
                long j3 = z.d.a;
                z[] zVarArr3 = z.e;
                return j$.time.temporal.u.f(j3, zVarArr3[zVarArr3.length - 1].a);
            default:
                return aVar.b;
        }
    }
}
