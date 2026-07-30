package j$.time.chrono;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public abstract class a implements m {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    public static m B(m mVar, String str) {
        String u;
        m mVar2 = (m) a.putIfAbsent(str, mVar);
        if (mVar2 == null && (u = mVar.u()) != null) {
            b.putIfAbsent(u, mVar);
        }
        return mVar2;
    }

    public static b G(b bVar, long j, long j2, long j3) {
        long j4;
        b l = bVar.l(j, (j$.time.temporal.s) j$.time.temporal.b.MONTHS);
        j$.time.temporal.b bVar2 = j$.time.temporal.b.WEEKS;
        b l2 = l.l(j2, (j$.time.temporal.s) bVar2);
        if (j3 <= 7) {
            if (j3 < 1) {
                l2 = l2.l(Math.subtractExact(j3, 7L) / 7, (j$.time.temporal.s) bVar2);
                j4 = (j3 + 6) % 7;
            }
            return l2.m(new j$.time.temporal.o(j$.time.e.s((int) j3).getValue(), 0));
        }
        long j5 = j3 - 1;
        l2 = l2.l(j5 / 7, (j$.time.temporal.s) bVar2);
        j4 = j5 % 7;
        j3 = j4 + 1;
        return l2.m(new j$.time.temporal.o(j$.time.e.s((int) j3).getValue(), 0));
    }

    public static void s(Map map, j$.time.temporal.a aVar, long j) {
        Long l = (Long) map.get(aVar);
        if (l == null || l.longValue() == j) {
            map.put(aVar, Long.valueOf(j));
            return;
        }
        throw new j$.time.c("Conflict found: " + aVar + " " + l + " differs from " + aVar + " " + j);
    }

    public void J(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (e0Var != j$.time.format.e0.LENIENT) {
                aVar.Z(l.longValue());
            }
            b i = M().i(1L, (j$.time.temporal.q) j$.time.temporal.a.DAY_OF_MONTH).i(l.longValue(), (j$.time.temporal.q) aVar);
            s(map, j$.time.temporal.a.MONTH_OF_YEAR, i.e(r6));
            s(map, j$.time.temporal.a.YEAR, i.e(r6));
        }
    }

    public b P(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int a2 = z(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (e0Var == j$.time.format.e0.LENIENT) {
            long subtractExact = Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return Q(a2, 1, 1).l(subtractExact, (j$.time.temporal.s) j$.time.temporal.b.MONTHS).l(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int a3 = z(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int a4 = z(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (e0Var != j$.time.format.e0.SMART) {
            return Q(a2, a3, a4);
        }
        try {
            return Q(a2, a3, a4);
        } catch (j$.time.c unused) {
            return this.Q(a2, a3, 1).m(new j$.time.a0(2));
        }
    }

    @Override // j$.time.chrono.m
    public b S(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return p(((Long) map.remove(aVar)).longValue());
        }
        J(map, e0Var);
        b W = W(map, e0Var);
        if (W != null) {
            return W;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar2)) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                    return P(map, e0Var);
                }
                j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    if (map.containsKey(aVar5)) {
                        int a2 = z(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                        if (e0Var == j$.time.format.e0.LENIENT) {
                            long subtractExact = Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L);
                            return Q(a2, 1, 1).l(subtractExact, (j$.time.temporal.s) j$.time.temporal.b.MONTHS).l(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.WEEKS).l(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
                        }
                        int a3 = z(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                        int a4 = z(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                        b l = Q(a2, a3, 1).l((z(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((a4 - 1) * 7), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
                        if (e0Var != j$.time.format.e0.STRICT || l.e(aVar3) == a3) {
                            return l;
                        }
                        j$.time.h.a("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                    j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                    if (map.containsKey(aVar6)) {
                        int a5 = z(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                        if (e0Var == j$.time.format.e0.LENIENT) {
                            return G(Q(a5, 1, 1), Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar6)).longValue(), 1L));
                        }
                        int a6 = z(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                        b m = Q(a5, a6, 1).l((z(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (j$.time.temporal.s) j$.time.temporal.b.DAYS).m(new j$.time.temporal.o(j$.time.e.s(z(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                        if (e0Var != j$.time.format.e0.STRICT || m.e(aVar3) == a6) {
                            return m;
                        }
                        j$.time.h.a("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                }
            }
            j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar7)) {
                int a7 = z(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                if (e0Var != j$.time.format.e0.LENIENT) {
                    return v(a7, z(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
                }
                return v(a7, 1).l(Math.subtractExact(((Long) map.remove(aVar7)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
            }
            j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
            if (map.containsKey(aVar8)) {
                j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                if (map.containsKey(aVar9)) {
                    int a8 = z(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (e0Var == j$.time.format.e0.LENIENT) {
                        return v(a8, 1).l(Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.WEEKS).l(Math.subtractExact(((Long) map.remove(aVar9)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
                    }
                    int a9 = z(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8);
                    b l2 = v(a8, 1).l((z(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((a9 - 1) * 7), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
                    if (e0Var != j$.time.format.e0.STRICT || l2.e(aVar2) == a8) {
                        return l2;
                    }
                    j$.time.h.a("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
                j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar10)) {
                    int a10 = z(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (e0Var == j$.time.format.e0.LENIENT) {
                        return G(v(a10, 1), 0L, Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar10)).longValue(), 1L));
                    }
                    b m2 = v(a10, 1).l((z(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (j$.time.temporal.s) j$.time.temporal.b.DAYS).m(new j$.time.temporal.o(j$.time.e.s(z(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
                    if (e0Var != j$.time.format.e0.STRICT || m2.e(aVar2) == a10) {
                        return m2;
                    }
                    j$.time.h.a("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
            }
        }
        return null;
    }

    public b W(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            z(aVar2).b(((Long) map.get(aVar2)).longValue(), aVar2);
            return null;
        }
        Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
        int a2 = e0Var != j$.time.format.e0.LENIENT ? z(aVar).a(l.longValue(), aVar) : Math.toIntExact(l.longValue());
        if (l2 != null) {
            s(map, j$.time.temporal.a.YEAR, D(C(z(r2).a(l2.longValue(), r2)), a2));
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar3)) {
            s(map, aVar3, D(v(z(aVar3).a(((Long) map.get(aVar3)).longValue(), aVar3), 1).N(), a2));
            return null;
        }
        if (e0Var == j$.time.format.e0.STRICT) {
            map.put(aVar, l);
            return null;
        }
        if (A().isEmpty()) {
            s(map, aVar3, a2);
            return null;
        }
        s(map, aVar3, D((n) r9.get(r9.size() - 1), a2));
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return q().compareTo(((m) obj).q());
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && q().compareTo(((a) obj).q()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return q().hashCode() ^ getClass().hashCode();
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return q();
    }
}
