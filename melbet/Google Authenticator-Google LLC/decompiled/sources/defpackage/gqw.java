package defpackage;

import j$.time.Instant;
import j$.util.DesugarCollections;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gqw {
    public final double a;
    public final kee b;
    private final gqh c;
    private final hvl d;
    private final boolean e;

    public gqw(gqh gqhVar, kee keeVar, hvl hvlVar, gzp gzpVar, gzp gzpVar2) {
        this.c = gqhVar;
        this.b = keeVar;
        this.d = hvlVar;
        double doubleValue = ((Double) gzpVar.d(Double.valueOf(1.0d))).doubleValue();
        int i = hsg.a;
        this.a = Math.min(Math.max(doubleValue, 0.5d), 2.0d);
        this.e = ((Boolean) gzpVar2.d(false)).booleanValue();
    }

    public final hvi a(final Set set, final long j, final Map map) {
        return this.e ? hnu.aJ(hix.b) : hti.f(this.c.b(), gvx.a(new gzf() { // from class: gqv
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v19, types: [gzp] */
            /* JADX WARN: Type inference failed for: r0v23, types: [gzp] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, koe] */
            @Override // defpackage.gzf
            public final Object a(Object obj) {
                gqw gqwVar;
                long j2;
                long j3;
                long j4;
                Iterator it;
                Iterator it2;
                gyf gyfVar;
                gqv gqvVar = this;
                Map map2 = (Map) obj;
                ArrayList<gqt> arrayList = new ArrayList();
                long epochMilli = Instant.now().toEpochMilli();
                Iterator it3 = map.entrySet().iterator();
                while (true) {
                    gqwVar = gqw.this;
                    if (!it3.hasNext()) {
                        break;
                    }
                    Set set2 = set;
                    Map.Entry entry = (Map.Entry) it3.next();
                    gqs gqsVar = (gqs) entry.getKey();
                    gpp a = ((gpv) entry.getValue()).a();
                    Long l = (Long) map2.get(gqsVar);
                    if (set2.contains(gqsVar)) {
                        j3 = epochMilli;
                    } else {
                        j3 = j;
                        if (l != null) {
                            j3 = l.longValue();
                        }
                    }
                    hfk hfkVar = new hfk();
                    long j5 = a.a;
                    double d = gqwVar.a;
                    Map map3 = a.c;
                    gyf gyfVar2 = gyf.a;
                    Iterator it4 = ((her) map3).values().iterator();
                    Map map4 = map2;
                    while (true) {
                        j4 = (long) (j5 * d);
                        if (it4.hasNext()) {
                            gpr gprVar = (gpr) it4.next();
                            long j6 = gprVar.b;
                            if (j6 != -1) {
                                long j7 = j6 + j3 + j4;
                                if (epochMilli <= j7) {
                                    if (gyfVar2.f()) {
                                        it = it3;
                                        it2 = it4;
                                        gyfVar = gzp.h(Long.valueOf(Math.min(((Long) gyfVar2.b()).longValue(), j7)));
                                    } else {
                                        it = it3;
                                        it2 = it4;
                                        gyfVar = gzp.h(Long.valueOf(j7));
                                    }
                                    gyfVar2 = gyfVar;
                                    hfkVar.c(gprVar.a);
                                } else {
                                    it = it3;
                                    it2 = it4;
                                }
                            } else {
                                it = it3;
                                it2 = it4;
                                hfkVar.c(gprVar.a);
                            }
                            it3 = it;
                            it4 = it2;
                        }
                    }
                    Iterator it5 = it3;
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(hfkVar.g());
                    arrayList.add(new gqt(hashSet, j4 + j3, gyfVar2));
                    gqvVar = this;
                    map2 = map4;
                    it3 = it5;
                }
                int i = 0;
                while (true) {
                    j2 = 900000;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    gqt gqtVar = (gqt) arrayList.get(i);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    TimeUnit timeUnit2 = TimeUnit.MINUTES;
                    long j8 = gqtVar.b;
                    long j9 = 900000 + epochMilli;
                    if (j8 < j9) {
                        long max = Math.max(epochMilli, j8);
                        HashSet hashSet2 = new HashSet();
                        gzp gzpVar = gyf.a;
                        hashSet2.addAll(gqtVar.a);
                        gzp gzpVar2 = gqtVar.c;
                        if (gzpVar2.f()) {
                            long j10 = j9 - max;
                            hoq.H(j10 > 0);
                            hoq.H(j10 <= 900000);
                            gzpVar = gzp.h(Long.valueOf(((Long) gzpVar2.b()).longValue() + j10));
                        }
                        arrayList.set(i, new gqt(hashSet2, j9, gzpVar));
                    }
                    i++;
                }
                long abs = Math.abs(((SecureRandom) gqwVar.b.a.b()).nextLong());
                TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
                if (exf.p(gqz.a)) {
                    TimeUnit timeUnit4 = TimeUnit.SECONDS;
                    j2 = 5000;
                } else {
                    TimeUnit timeUnit5 = TimeUnit.MINUTES;
                }
                long j11 = abs % j2;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    gqt gqtVar2 = (gqt) arrayList.get(i2);
                    HashSet hashSet3 = new HashSet();
                    gzp gzpVar3 = gyf.a;
                    hashSet3.addAll(gqtVar2.a);
                    long j12 = gqtVar2.b + j11;
                    gzp gzpVar4 = gqtVar2.c;
                    if (gzpVar4.f()) {
                        gzpVar3 = gzp.h(Long.valueOf(((Long) gzpVar4.b()).longValue() + j11));
                    }
                    arrayList.set(i2, new gqt(hashSet3, j12, gzpVar3));
                }
                qi qiVar = new qi();
                for (gqt gqtVar3 : arrayList) {
                    Set set3 = gqtVar3.a;
                    gqt gqtVar4 = (gqt) qiVar.get(set3);
                    if (gqtVar4 == null) {
                        qiVar.put(set3, gqtVar3);
                    } else {
                        qiVar.put(set3, gqt.a(gqtVar4, gqtVar3));
                    }
                }
                gzp gzpVar5 = gyf.a;
                Iterator it6 = qiVar.values().iterator();
                while (it6.hasNext()) {
                    gzp gzpVar6 = ((gqt) it6.next()).c;
                    if (gzpVar6.f()) {
                        gzpVar5 = gzpVar5.f() ? gzp.h(Long.valueOf(Math.min(((Long) gzpVar5.b()).longValue(), ((Long) gzpVar6.b()).longValue()))) : gzpVar6;
                    }
                }
                if (!gzpVar5.f()) {
                    return qiVar;
                }
                HashMap hashMap = new HashMap(qiVar);
                hjb hjbVar = hjb.a;
                HashSet hashSet4 = new HashSet();
                long longValue = ((Long) gzpVar5.b()).longValue();
                hashSet4.addAll(hjbVar);
                gqt gqtVar5 = new gqt(hashSet4, longValue, gzpVar5);
                gqt gqtVar6 = (gqt) hashMap.get(hjbVar);
                if (gqtVar6 == null) {
                    hashMap.put(hjbVar, gqtVar5);
                } else {
                    hashMap.put(hjbVar, gqt.a(gqtVar6, gqtVar5));
                }
                return DesugarCollections.unmodifiableMap(hashMap);
            }
        }), this.d);
    }
}
