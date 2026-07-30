package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.format.d0;
import j$.time.format.e0;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public abstract class h implements q {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ h[] b;

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.q
            public final u B(TemporalAccessor temporalAccessor) {
                if (!s(temporalAccessor)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                long g = temporalAccessor.g(h.QUARTER_OF_YEAR);
                if (g == 1) {
                    return j$.time.chrono.t.c.X(temporalAccessor.g(a.YEAR)) ? u.f(1L, 91L) : u.f(1L, 90L);
                }
                return g == 2 ? u.f(1L, 91L) : (g == 3 || g == 4) ? u.f(1L, 92L) : J();
            }

            @Override // j$.time.temporal.q
            public final TemporalAccessor G(Map map, d0 d0Var, e0 e0Var) {
                LocalDate of;
                long j;
                a aVar = a.YEAR;
                Long l = (Long) map.get(aVar);
                q qVar = h.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(qVar);
                if (l != null && l2 != null) {
                    int a2 = aVar.b.a(l.longValue(), aVar);
                    long longValue = ((Long) map.get(h.DAY_OF_QUARTER)).longValue();
                    h hVar2 = j.a;
                    if (j$.time.chrono.m.r(d0Var).equals(j$.time.chrono.t.c)) {
                        if (e0Var == e0.LENIENT) {
                            of = LocalDate.of(a2, 1, 1).g0(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1L), 3L));
                            j = Math.subtractExact(longValue, 1L);
                        } else {
                            of = LocalDate.of(a2, ((qVar.J().a(l2.longValue(), qVar) - 1) * 3) + 1, 1);
                            if (longValue < 1 || longValue > 90) {
                                if (e0Var == e0.STRICT) {
                                    B(of).b(longValue, this);
                                } else {
                                    J().b(longValue, this);
                                }
                            }
                            j = longValue - 1;
                        }
                        map.remove(this);
                        map.remove(aVar);
                        map.remove(qVar);
                        return of.f0(j);
                    }
                    j$.time.h.a("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.q
            public final u J() {
                return u.g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.q
            public final long P(TemporalAccessor temporalAccessor) {
                if (!s(temporalAccessor)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.e(a.DAY_OF_YEAR) - h.a[((temporalAccessor.e(a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.t.c.X(temporalAccessor.g(a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.q
            public final m W(m mVar, long j) {
                long P = P(mVar);
                J().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.i((j - P) + mVar.g(aVar), aVar);
            }

            @Override // j$.time.temporal.q
            public final boolean s(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.f(a.DAY_OF_YEAR) || !temporalAccessor.f(a.MONTH_OF_YEAR) || !temporalAccessor.f(a.YEAR)) {
                    return false;
                }
                h hVar2 = j.a;
                return j$.time.chrono.m.r(temporalAccessor).equals(j$.time.chrono.t.c);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.q
            public final u B(TemporalAccessor temporalAccessor) {
                if (s(temporalAccessor)) {
                    return J();
                }
                throw new t("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.q
            public final u J() {
                return u.f(1L, 4L);
            }

            @Override // j$.time.temporal.q
            public final long P(TemporalAccessor temporalAccessor) {
                if (s(temporalAccessor)) {
                    return (temporalAccessor.g(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new t("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.q
            public final m W(m mVar, long j) {
                long P = P(mVar);
                J().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.i(((j - P) * 3) + mVar.g(aVar), aVar);
            }

            @Override // j$.time.temporal.q
            public final boolean s(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.f(a.MONTH_OF_YEAR)) {
                    return false;
                }
                h hVar3 = j.a;
                return j$.time.chrono.m.r(temporalAccessor).equals(j$.time.chrono.t.c);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.q
            public final u B(TemporalAccessor temporalAccessor) {
                if (s(temporalAccessor)) {
                    return h.c0(LocalDate.G(temporalAccessor));
                }
                throw new t("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final TemporalAccessor G(Map map, d0 d0Var, e0 e0Var) {
                LocalDate i;
                long j;
                q qVar = h.WEEK_BASED_YEAR;
                Long l = (Long) map.get(qVar);
                a aVar = a.DAY_OF_WEEK;
                Long l2 = (Long) map.get(aVar);
                if (l != null && l2 != null) {
                    int a2 = qVar.J().a(l.longValue(), qVar);
                    long longValue = ((Long) map.get(h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                    h hVar4 = j.a;
                    if (j$.time.chrono.m.r(d0Var).equals(j$.time.chrono.t.c)) {
                        LocalDate of = LocalDate.of(a2, 1, 4);
                        if (e0Var == e0.LENIENT) {
                            long longValue2 = l2.longValue();
                            if (longValue2 > 7) {
                                long j2 = longValue2 - 1;
                                of = of.h0(j2 / 7);
                                j = j2 % 7;
                            } else {
                                if (longValue2 < 1) {
                                    of = of.h0(Math.subtractExact(longValue2, 7L) / 7);
                                    j = (longValue2 + 6) % 7;
                                }
                                i = of.h0(Math.subtractExact(longValue, 1L)).i(longValue2, aVar);
                            }
                            longValue2 = j + 1;
                            i = of.h0(Math.subtractExact(longValue, 1L)).i(longValue2, aVar);
                        } else {
                            int a3 = aVar.b.a(l2.longValue(), aVar);
                            if (longValue < 1 || longValue > 52) {
                                if (e0Var == e0.STRICT) {
                                    h.c0(of).b(longValue, this);
                                } else {
                                    J().b(longValue, this);
                                }
                            }
                            i = of.h0(longValue - 1).i(a3, aVar);
                        }
                        map.remove(this);
                        map.remove(qVar);
                        map.remove(aVar);
                        return i;
                    }
                    j$.time.h.a("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.q
            public final u J() {
                return u.g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.q
            public final long P(TemporalAccessor temporalAccessor) {
                if (s(temporalAccessor)) {
                    return h.Z(LocalDate.G(temporalAccessor));
                }
                throw new t("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final m W(m mVar, long j) {
                J().b(j, this);
                return mVar.l(Math.subtractExact(j, P(mVar)), b.WEEKS);
            }

            @Override // j$.time.temporal.q
            public final boolean s(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.f(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar4 = j.a;
                return j$.time.chrono.m.r(temporalAccessor).equals(j$.time.chrono.t.c);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.q
            public final u B(TemporalAccessor temporalAccessor) {
                if (s(temporalAccessor)) {
                    return a.YEAR.b;
                }
                throw new t("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final u J() {
                return a.YEAR.b;
            }

            @Override // j$.time.temporal.q
            public final long P(TemporalAccessor temporalAccessor) {
                if (s(temporalAccessor)) {
                    return h.a0(LocalDate.G(temporalAccessor));
                }
                throw new t("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final m W(m mVar, long j) {
                if (!s(mVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                int a2 = a.YEAR.b.a(j, h.WEEK_BASED_YEAR);
                LocalDate G = LocalDate.G(mVar);
                int e = G.e(a.DAY_OF_WEEK);
                int Z = h.Z(G);
                if (Z == 53 && h.b0(a2) == 52) {
                    Z = 52;
                }
                return mVar.m(LocalDate.of(a2, 1, 4).f0(((Z - 1) * 7) + (e - r3.e(r6))));
            }

            @Override // j$.time.temporal.q
            public final boolean s(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.f(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar5 = j.a;
                return j$.time.chrono.m.r(temporalAccessor).equals(j$.time.chrono.t.c);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        b = new h[]{hVar, hVar2, hVar3, hVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int Z(LocalDate localDate) {
        int ordinal = localDate.P().ordinal();
        int W = localDate.W() - 1;
        int i = (3 - ordinal) + W;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (W < i3) {
            if (localDate.W() != 180) {
                localDate = LocalDate.d0(localDate.a, 180);
            }
            return (int) c0(localDate.i0(-1L)).d;
        }
        int i4 = ((W - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.y())) {
            return i4;
        }
        return 1;
    }

    public static int a0(LocalDate localDate) {
        int year = localDate.getYear();
        int W = localDate.W();
        if (W <= 3) {
            return W - localDate.P().ordinal() < -2 ? year - 1 : year;
        }
        if (W >= 363) {
            return ((W - 363) - (localDate.y() ? 1 : 0)) - localDate.P().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }

    public static int b0(int i) {
        LocalDate of = LocalDate.of(i, 1, 1);
        if (of.P() != j$.time.e.THURSDAY) {
            return (of.P() == j$.time.e.WEDNESDAY && of.y()) ? 53 : 52;
        }
        return 53;
    }

    public static u c0(LocalDate localDate) {
        return u.f(1L, b0(a0(localDate)));
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) b.clone();
    }

    @Override // j$.time.temporal.q
    public final boolean isDateBased() {
        return true;
    }
}
