package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.InflaterInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eub {
    public static final eub a = new eub(etz.a, etu.a);
    public final etz b;
    public final etu c;

    private eub(etz etzVar, etu etuVar) {
        etzVar.getClass();
        this.b = etzVar;
        this.c = etuVar;
    }

    public static eub c(jju jjuVar, boolean z) {
        etz a2;
        int o = jjuVar.o();
        if (o > 1) {
            throw new jld(a.ai(o, "Unsupported version: ", ". Current version is: 1"));
        }
        jjuVar.o();
        int f = jjuVar.f(jjuVar.r());
        jkp w = jkp.w(etu.a, jjuVar, jkd.a);
        jkp.N(w);
        etu etuVar = (etu) w;
        jjuVar.E(f);
        etx etxVar = new etx();
        try {
            if (!z) {
                etxVar.a.setInput(jjuVar.J());
                try {
                    a2 = etz.a(jju.L(new etv(etxVar), 4096));
                    etxVar.close();
                    return new eub(a2, etuVar);
                } finally {
                }
            }
            int f2 = jjuVar.f(jjuVar.r());
            try {
                a2 = etz.a(jju.L(new InflaterInputStream(new etw(jjuVar), etxVar.a, 4096), 4096));
                etxVar.a.reset();
                int d = jjuVar.d();
                if (d > 0) {
                    jjuVar.F(d);
                }
                jjuVar.E(f2);
                etxVar.close();
                return new eub(a2, etuVar);
            } finally {
            }
        } catch (Throwable th) {
            try {
                etxVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final long a() {
        return this.c.e;
    }

    public final etz b() {
        her d;
        long j;
        etu etuVar = this.c;
        int size = etuVar.f.size();
        etz etzVar = this.b;
        if (size <= 0) {
            return etzVar;
        }
        Collection<eto> values = DesugarCollections.unmodifiableMap(etuVar.f).values();
        int i = 0;
        int i2 = 1;
        if (values == null) {
            d = hix.b;
        } else {
            hen henVar = new hen(4);
            for (eto etoVar : values) {
                int i3 = etoVar.c;
                int L = eos.L(i3);
                if (L == 0) {
                    throw null;
                }
                int i4 = L - 1;
                if (i4 == 0) {
                    henVar.g(etoVar.e, Long.valueOf(i3 == 1 ? ((Long) etoVar.d).longValue() : 0L));
                } else if (i4 == 1) {
                    henVar.g(etoVar.e, Boolean.valueOf(i3 == 2 ? ((Boolean) etoVar.d).booleanValue() : false));
                } else if (i4 == 2) {
                    henVar.g(etoVar.e, Double.valueOf(i3 == 3 ? ((Double) etoVar.d).doubleValue() : 0.0d));
                } else if (i4 == 3) {
                    henVar.g(etoVar.e, i3 == 4 ? (String) etoVar.d : "");
                } else {
                    if (i4 != 4) {
                        throw new IllegalStateException("Could not serialize Flag for override: ".concat(String.valueOf(etoVar.e)));
                    }
                    henVar.g(etoVar.e, (i3 == 5 ? (jjq) etoVar.d : jjq.d).x());
                }
            }
            d = henVar.d(false);
        }
        if (d.isEmpty()) {
            return etzVar;
        }
        HashMap hashMap = new HashMap(d);
        hft hftVar = new hft(hih.a);
        hjr it = etzVar.b.iterator();
        while (it.hasNext()) {
            ety etyVar = (ety) it.next();
            Object remove = hashMap.remove(etyVar.c());
            if (remove == null) {
                hftVar.m(etyVar);
            } else if (remove instanceof String) {
                hftVar.m(new ety(etyVar.a, etyVar.b, 4, 0L, remove));
            } else if (remove instanceof byte[]) {
                hftVar.m(new ety(etyVar.a, etyVar.b, 5, 0L, remove));
            } else if (remove instanceof Boolean) {
                hftVar.m(new ety(etyVar.a, etyVar.b, ((Boolean) remove).booleanValue() ? 1 : 0, 0L, null));
            } else if (remove instanceof Long) {
                hftVar.m(new ety(etyVar.a, etyVar.b, 2, ((Long) remove).longValue(), null));
            } else {
                if (!(remove instanceof Double)) {
                    throw new IllegalStateException("Cannot serialize override for existing flag " + etyVar.c() + ": " + remove.toString());
                }
                hftVar.m(new ety(etyVar.a, etyVar.b, 3, Double.doubleToRawLongBits(((Double) remove).doubleValue()), null));
            }
        }
        for (String str : hashMap.keySet()) {
            Object obj = hashMap.get(str);
            int length = str.length();
            if (length <= 19 && length != 0) {
                long charAt = str.charAt(i) - '0';
                if (charAt >= 1 && charAt <= 9) {
                    int i5 = i2;
                    while (true) {
                        if (i5 < length) {
                            int charAt2 = str.charAt(i5) - '0';
                            if (((charAt2 < 0 ? i2 : i) | (charAt2 > 9 ? i2 : i)) != 0) {
                                break;
                            }
                            charAt = (charAt * 10) + charAt2;
                            i5++;
                            i = 0;
                            i2 = 1;
                        } else if (charAt >= 0 && charAt <= 2305843009213693951L) {
                            j = charAt;
                        }
                    }
                }
            }
            j = 0;
            String str2 = j == 0 ? str : null;
            if (obj instanceof String) {
                hftVar.m(new ety(j, str2, 4, 0L, obj));
            } else if (obj instanceof byte[]) {
                hftVar.m(new ety(j, str2, 5, 0L, obj));
            } else if (obj instanceof Boolean) {
                hftVar.m(new ety(j, str2, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
            } else if (obj instanceof Long) {
                hftVar.m(new ety(j, str2, 2, ((Long) obj).longValue(), null));
            } else {
                if (!(obj instanceof Double)) {
                    throw new IllegalStateException("Cannot serialize override " + str + ": " + String.valueOf(obj));
                }
                hftVar.m(new ety(j, str2, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
            }
            i = 0;
            i2 = 1;
        }
        return new etz(hftVar.g());
    }

    public final jjq d() {
        return this.c.c;
    }

    public final String e() {
        return this.c.d;
    }

    public final String f() {
        return this.c.b;
    }

    public final Map g() {
        etu etuVar = this.c;
        if (etuVar.f.size() == 0) {
            return null;
        }
        return DesugarCollections.unmodifiableMap(etuVar.f);
    }
}
