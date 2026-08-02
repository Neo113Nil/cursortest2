package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fca implements htq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ fca(fcf fcfVar, hvi hviVar, hvi hviVar2, Integer num, int i) {
        this.e = i;
        this.a = fcfVar;
        this.b = hviVar;
        this.c = hviVar2;
        this.d = num;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v11, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v12, types: [htr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.htq
    public final hvi a() {
        int i = this.e;
        int i2 = 6;
        if (i != 0) {
            if (i != 1) {
                int i3 = 13;
                if (i == 2) {
                    Object obj = this.a;
                    doj dojVar = new doj(obj, i3);
                    ?? r3 = this.d;
                    ?? r5 = this.b;
                    ?? r1 = this.c;
                    huf hufVar = huf.a;
                    hvi g = hti.g(r1, dojVar, hufVar);
                    hvi g2 = hti.g(g, r5, r3);
                    return hti.g(g2, gvx.c(new bpp(obj, g, g2, i2)), hufVar);
                }
                if (i == 3) {
                    return hti.g(this.c, gvx.c(new bpp(this.a, this.b, this.d, 7)), huf.a);
                }
                if (i == 4) {
                    ?? r0 = this.b;
                    iad iadVar = r0 != 0 ? (iad) hnu.aR(r0) : null;
                    ?? r2 = this.c;
                    final byte[] bArr = r2 != 0 ? (byte[]) hnu.aR(r2) : null;
                    if (iadVar == null) {
                        return hnu.aJ(null);
                    }
                    Object obj2 = this.d;
                    Object obj3 = this.a;
                    if (bArr == null) {
                        return ets.g(((ets) ((ldt) obj3).e).a.o((String) obj2, iadVar));
                    }
                    final dbw dbwVar = ((ets) ((ldt) obj3).e).a;
                    final String str = (String) obj2;
                    return ets.g(dbwVar.o(str, iadVar).a(huf.a, new dcy() { // from class: dbt
                        @Override // defpackage.dcy
                        public final Object a(ddi ddiVar) {
                            return dbw.this.e(str, bArr, ddiVar);
                        }
                    }));
                }
                if (i != 5) {
                    return hoq.at(((fwm) this.b).f((frv) this.a), new bso(this.c, this.d, 18), huf.a);
                }
                hdb<iyi> a = hdb.a(this.c, this.d);
                ArrayList arrayList = new ArrayList(ixc.w(a));
                for (iyi iyiVar : a) {
                    ?? r4 = this.b;
                    Object obj4 = this.a;
                    Object aR = hnu.aR(iyiVar.c);
                    aR.getClass();
                    giz gizVar = (giz) obj4;
                    arrayList.add(gizVar.a((etm) aR, (jjq) iyiVar.b, gizVar.e.d(((fuf) hnu.aR(r4)).b), (String) iyiVar.a));
                }
                return hoq.aU(arrayList).t(new fxs(arrayList, i3), huf.a);
            }
            ?? r02 = this.b;
            Object obj5 = this.d;
            try {
                Map map = (Map) ((gzp) hnu.aR(r02)).e();
                if (map != null) {
                    jkj jkjVar = (jkj) obj5;
                    long j = ((lfk) jkjVar.b).c;
                    for (Map.Entry entry : map.entrySet()) {
                        Integer num = (Integer) entry.getKey();
                        num.intValue();
                        long longValue = ((Long) entry.getValue()).longValue() - j;
                        if (!jkjVar.b.M()) {
                            jkjVar.t();
                        }
                        lfk lfkVar = (lfk) jkjVar.b;
                        jli jliVar = lfkVar.z;
                        if (!jliVar.b) {
                            lfkVar.z = jliVar.a();
                        }
                        lfkVar.z.put(num, Long.valueOf(longValue));
                    }
                }
            } catch (Exception e) {
                ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricRecordingService", "setCustomTimestamps", 'v', "StartupMetricRecordingService.java")).s("Failed to get custom timestamps future");
            }
            Object obj6 = this.a;
            eme a2 = emf.a();
            jkj k = lgv.a.k();
            jkj k2 = lfh.a.k();
            long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
            if (!k2.b.M()) {
                k2.t();
            }
            jkp jkpVar = k2.b;
            lfh lfhVar = (lfh) jkpVar;
            lfhVar.b |= 1;
            lfhVar.c = leastSignificantBits;
            if (!jkpVar.M()) {
                k2.t();
            }
            jkp jkpVar2 = k2.b;
            lfh lfhVar2 = (lfh) jkpVar2;
            lfhVar2.d = 2;
            lfhVar2.b = 2 | lfhVar2.b;
            if (!jkpVar2.M()) {
                k2.t();
            }
            lfh lfhVar3 = (lfh) k2.b;
            lfk lfkVar2 = (lfk) ((jkj) obj5).q();
            lfkVar2.getClass();
            lfhVar3.f = lfkVar2;
            lfhVar3.b |= 16;
            if (!k.b.M()) {
                k.t();
            }
            Object obj7 = ((eqm) obj6).a;
            ?? r12 = this.c;
            lgv lgvVar = (lgv) k.b;
            lfh lfhVar4 = (lfh) k2.q();
            lfhVar4.getClass();
            lgvVar.m = lfhVar4;
            lgvVar.b |= 1024;
            a2.f((lgv) k.q());
            a2.b = (lew) ((gzp) hnu.aR(r12)).e();
            a2.c = null;
            a2.d(true);
            return ((emi) obj7).b(a2.a());
        }
        Uri uri = (Uri) hnu.aR(this.b);
        Set set = (Set) hnu.aR(this.c);
        fce fceVar = new fce(set);
        Iterator it = set.iterator();
        while (true) {
            Object obj8 = this.a;
            if (!it.hasNext()) {
                Object obj9 = this.d;
                hab c = hab.c(gyd.a);
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                Integer num2 = (Integer) obj9;
                fcf fcfVar = (fcf) obj8;
                hvc w = hvc.v(fceVar.a).w(num2.intValue(), fcfVar.g, null);
                euy euyVar = new euy(atomicBoolean, i2);
                huf hufVar2 = huf.a;
                hvi f = hso.f(w, TimeoutException.class, euyVar, hufVar2);
                hnu.aS(f, new fcb(fcfVar, atomicBoolean, set, c, fceVar, num2), hufVar2);
                return f;
            }
            String str2 = (String) it.next();
            fce fceVar2 = fceVar;
            Intent intent = new Intent();
            intent.setAction("com.google.android.libraries.storage.protostore.MULTI_APP");
            Boolean bool = false;
            bool.getClass();
            intent.setData(uri);
            intent.setPackage(str2);
            intent.setFlags(268435456);
            fcf fcfVar2 = (fcf) obj8;
            fcfVar2.b.sendOrderedBroadcast(intent, null, fceVar2, fcfVar2.e, -1, null, null);
            fceVar = fceVar2;
        }
    }

    public /* synthetic */ fca(fwm fwmVar, frv frvVar, fwm fwmVar2, gzp gzpVar, int i) {
        this.e = i;
        this.b = fwmVar;
        this.a = frvVar;
        this.c = fwmVar2;
        this.d = gzpVar;
    }

    public /* synthetic */ fca(Object obj, hvi hviVar, htr htrVar, Executor executor, int i) {
        this.e = i;
        this.a = obj;
        this.c = hviVar;
        this.b = htrVar;
        this.d = executor;
    }

    public /* synthetic */ fca(Object obj, Object obj2, hvi hviVar, hvi hviVar2, int i) {
        this.e = i;
        this.a = obj;
        this.d = obj2;
        this.b = hviVar;
        this.c = hviVar2;
    }

    public /* synthetic */ fca(List list, List list2, giz gizVar, hvi hviVar, int i) {
        this.e = i;
        this.c = list;
        this.d = list2;
        this.a = gizVar;
        this.b = hviVar;
    }
}
