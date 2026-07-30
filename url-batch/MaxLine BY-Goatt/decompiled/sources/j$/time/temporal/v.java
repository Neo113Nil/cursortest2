package j$.time.temporal;

import j$.time.format.d0;
import j$.time.format.e0;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class v implements q {
    public static final u f = u.f(1, 7);
    public static final u g = u.g(0, 4, 6);
    public static final u h = u.g(0, 52, 54);
    public static final u i = u.g(1, 52, 53);
    public final String a;
    public final w b;
    public final s c;
    public final s d;
    public final u e;

    public v(String str, w wVar, s sVar, s sVar2, u uVar) {
        this.a = str;
        this.b = wVar;
        this.c = sVar;
        this.d = sVar2;
        this.e = uVar;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    @Override // j$.time.temporal.q
    public final u B(TemporalAccessor temporalAccessor) {
        b bVar = b.WEEKS;
        s sVar = this.d;
        if (sVar == bVar) {
            return this.e;
        }
        if (sVar == b.MONTHS) {
            return f(temporalAccessor, a.DAY_OF_MONTH);
        }
        if (sVar == b.YEARS) {
            return f(temporalAccessor, a.DAY_OF_YEAR);
        }
        if (sVar == w.h) {
            return g(temporalAccessor);
        }
        if (sVar == b.FOREVER) {
            return a.YEAR.b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + sVar + ", this: " + this);
    }

    @Override // j$.time.temporal.q
    public final TemporalAccessor G(Map map, d0 d0Var, e0 e0Var) {
        j$.time.chrono.b bVar;
        j$.time.chrono.b bVar2;
        j$.time.chrono.b bVar3;
        long longValue = ((Long) map.get(this)).longValue();
        int intExact = Math.toIntExact(longValue);
        b bVar4 = b.WEEKS;
        u uVar = this.e;
        w wVar = this.b;
        s sVar = this.d;
        if (sVar == bVar4) {
            long floorMod = Math.floorMod((uVar.a(longValue, this) - 1) + (wVar.a.getValue() - 1), 7) + 1;
            map.remove(this);
            map.put(a.DAY_OF_WEEK, Long.valueOf(floorMod));
            return null;
        }
        a aVar = a.DAY_OF_WEEK;
        if (!map.containsKey(aVar)) {
            return null;
        }
        int floorMod2 = Math.floorMod(aVar.b.a(((Long) map.get(aVar)).longValue(), aVar) - wVar.a.getValue(), 7) + 1;
        j$.time.chrono.m r = j$.time.chrono.m.r(d0Var);
        a aVar2 = a.YEAR;
        if (!map.containsKey(aVar2)) {
            if ((sVar != w.h && sVar != b.FOREVER) || !map.containsKey(wVar.f) || !map.containsKey(wVar.e)) {
                return null;
            }
            v vVar = wVar.f;
            int a = vVar.e.a(((Long) map.get(vVar)).longValue(), wVar.f);
            if (e0Var == e0.LENIENT) {
                bVar = e(r, a, 1, floorMod2).l(Math.subtractExact(((Long) map.get(wVar.e)).longValue(), 1L), (s) bVar4);
            } else {
                v vVar2 = wVar.e;
                j$.time.chrono.b e = e(r, a, vVar2.e.a(((Long) map.get(vVar2)).longValue(), wVar.e), floorMod2);
                if (e0Var == e0.STRICT && c(e) != a) {
                    j$.time.h.a("Strict mode rejected resolved date as it is in a different week-based-year");
                    return null;
                }
                bVar = e;
            }
            map.remove(this);
            map.remove(wVar.f);
            map.remove(wVar.e);
            map.remove(aVar);
            return bVar;
        }
        int a2 = aVar2.b.a(((Long) map.get(aVar2)).longValue(), aVar2);
        b bVar5 = b.MONTHS;
        if (sVar == bVar5) {
            a aVar3 = a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                long longValue2 = ((Long) map.get(aVar3)).longValue();
                long j = intExact;
                if (e0Var == e0.LENIENT) {
                    j$.time.chrono.b l = r.Q(a2, 1, 1).l(Math.subtractExact(longValue2, 1L), (s) bVar5);
                    int b = b(l);
                    int e2 = l.e(a.DAY_OF_MONTH);
                    bVar3 = l.l(Math.addExact(Math.multiplyExact(Math.subtractExact(j, a(h(e2, b), e2)), 7L), floorMod2 - b(l)), (s) b.DAYS);
                } else {
                    j$.time.chrono.b Q = r.Q(a2, aVar3.b.a(longValue2, aVar3), 1);
                    long a3 = uVar.a(j, this);
                    int b2 = b(Q);
                    int e3 = Q.e(a.DAY_OF_MONTH);
                    j$.time.chrono.b l2 = Q.l((((int) (a3 - a(h(e3, b2), e3))) * 7) + (floorMod2 - b(Q)), (s) b.DAYS);
                    if (e0Var == e0.STRICT && l2.g(aVar3) != longValue2) {
                        j$.time.h.a("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                    bVar3 = l2;
                }
                map.remove(this);
                map.remove(aVar2);
                map.remove(aVar3);
                map.remove(aVar);
                return bVar3;
            }
        }
        if (sVar != b.YEARS) {
            return null;
        }
        long j2 = intExact;
        j$.time.chrono.b Q2 = r.Q(a2, 1, 1);
        if (e0Var == e0.LENIENT) {
            int b3 = b(Q2);
            int e4 = Q2.e(a.DAY_OF_YEAR);
            bVar2 = Q2.l(Math.addExact(Math.multiplyExact(Math.subtractExact(j2, a(h(e4, b3), e4)), 7L), floorMod2 - b(Q2)), (s) b.DAYS);
        } else {
            long a4 = uVar.a(j2, this);
            int b4 = b(Q2);
            int e5 = Q2.e(a.DAY_OF_YEAR);
            j$.time.chrono.b l3 = Q2.l((((int) (a4 - a(h(e5, b4), e5))) * 7) + (floorMod2 - b(Q2)), (s) b.DAYS);
            if (e0Var == e0.STRICT && l3.g(aVar2) != a2) {
                j$.time.h.a("Strict mode rejected resolved date as it is in a different year");
                return null;
            }
            bVar2 = l3;
        }
        map.remove(this);
        map.remove(aVar2);
        map.remove(aVar);
        return bVar2;
    }

    @Override // j$.time.temporal.q
    public final u J() {
        return this.e;
    }

    @Override // j$.time.temporal.q
    public final long P(TemporalAccessor temporalAccessor) {
        int c;
        b bVar = b.WEEKS;
        s sVar = this.d;
        if (sVar == bVar) {
            c = b(temporalAccessor);
        } else if (sVar == b.MONTHS) {
            int b = b(temporalAccessor);
            int e = temporalAccessor.e(a.DAY_OF_MONTH);
            c = a(h(e, b), e);
        } else if (sVar == b.YEARS) {
            int b2 = b(temporalAccessor);
            int e2 = temporalAccessor.e(a.DAY_OF_YEAR);
            c = a(h(e2, b2), e2);
        } else if (sVar == w.h) {
            c = d(temporalAccessor);
        } else {
            if (sVar != b.FOREVER) {
                throw new IllegalStateException("unreachable, rangeUnit: " + sVar + ", this: " + this);
            }
            c = c(temporalAccessor);
        }
        return c;
    }

    @Override // j$.time.temporal.q
    public final m W(m mVar, long j) {
        if (this.e.a(j, this) == mVar.e(this)) {
            return mVar;
        }
        if (this.d != b.FOREVER) {
            return mVar.l(r0 - r1, this.c);
        }
        w wVar = this.b;
        return e(j$.time.chrono.m.r(mVar), (int) j, mVar.e(wVar.e), mVar.e(wVar.c));
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return Math.floorMod(temporalAccessor.e(a.DAY_OF_WEEK) - this.b.a.getValue(), 7) + 1;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int b = b(temporalAccessor);
        int e = temporalAccessor.e(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int e2 = temporalAccessor.e(aVar);
        int h2 = h(e2, b);
        int a = a(h2, e2);
        return a == 0 ? e - 1 : a >= a(h2, ((int) temporalAccessor.k(aVar).d) + this.b.b) ? e + 1 : e;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int a;
        int b = b(temporalAccessor);
        a aVar = a.DAY_OF_YEAR;
        int e = temporalAccessor.e(aVar);
        int h2 = h(e, b);
        int a2 = a(h2, e);
        return a2 == 0 ? d(j$.time.chrono.m.r(temporalAccessor).H(temporalAccessor).a(e, (s) b.DAYS)) : (a2 <= 50 || a2 < (a = a(h2, ((int) temporalAccessor.k(aVar).d) + this.b.b))) ? a2 : (a2 - a) + 1;
    }

    public final j$.time.chrono.b e(j$.time.chrono.m mVar, int i2, int i3, int i4) {
        j$.time.chrono.b Q = mVar.Q(i2, 1, 1);
        int h2 = h(1, b(Q));
        int i5 = i4 - 1;
        return Q.l(((Math.min(i3, a(h2, Q.U() + this.b.b) - 1) - 1) * 7) + i5 + (-h2), (s) b.DAYS);
    }

    public final u f(TemporalAccessor temporalAccessor, a aVar) {
        int h2 = h(temporalAccessor.e(aVar), b(temporalAccessor));
        u k = temporalAccessor.k(aVar);
        return u.f(a(h2, (int) k.a), a(h2, (int) k.d));
    }

    public final u g(TemporalAccessor temporalAccessor) {
        a aVar = a.DAY_OF_YEAR;
        if (!temporalAccessor.f(aVar)) {
            return h;
        }
        int b = b(temporalAccessor);
        int e = temporalAccessor.e(aVar);
        int h2 = h(e, b);
        int a = a(h2, e);
        if (a == 0) {
            return g(j$.time.chrono.m.r(temporalAccessor).H(temporalAccessor).a(e + 7, (s) b.DAYS));
        }
        return a >= a(h2, this.b.b + ((int) temporalAccessor.k(aVar).d)) ? g(j$.time.chrono.m.r(temporalAccessor).H(temporalAccessor).l((r0 - e) + 8, (s) b.DAYS)) : u.f(1L, r1 - 1);
    }

    public final int h(int i2, int i3) {
        int floorMod = Math.floorMod(i2 - i3, 7);
        return floorMod + 1 > this.b.b ? 7 - floorMod : -floorMod;
    }

    @Override // j$.time.temporal.q
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.q
    public final boolean s(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.f(a.DAY_OF_WEEK)) {
            return false;
        }
        b bVar = b.WEEKS;
        s sVar = this.d;
        if (sVar == bVar) {
            return true;
        }
        if (sVar == b.MONTHS) {
            return temporalAccessor.f(a.DAY_OF_MONTH);
        }
        if (sVar == b.YEARS) {
            return temporalAccessor.f(a.DAY_OF_YEAR);
        }
        if (sVar == w.h) {
            return temporalAccessor.f(a.DAY_OF_YEAR);
        }
        if (sVar == b.FOREVER) {
            return temporalAccessor.f(a.YEAR);
        }
        return false;
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }
}
