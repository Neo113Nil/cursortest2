package defpackage;

import j$.time.Instant;
import j$.util.Collection;
import j$.util.Map;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gjt implements htr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gjt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r0v12, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, krt] */
    @Override // defpackage.htr
    public final hvi a(Object obj) {
        gzp gzpVar;
        Object obj2;
        int i = this.b;
        if (i == 0) {
            ?? r0 = this.a;
            iwq iwqVar = gjw.m;
            return a.p(r0, obj);
        }
        if (i == 1) {
            ?? r02 = this.a;
            iwq iwqVar2 = gjw.m;
            return a.p(r02, obj);
        }
        int i2 = 2;
        if (i == 2) {
            Map map = (Map) obj;
            ((hkf) ((hkf) gqn.a.e()).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "syncInternal", 317, "SyncManagerImpl.java")).u("Running synclets: %s", Collection.EL.stream(map.keySet()).map(new ejs(9)).toArray());
            if (map.isEmpty()) {
                return hnu.aJ(hjb.a);
            }
            Object obj3 = this.a;
            final Set keySet = map.keySet();
            gqn gqnVar = (gqn) obj3;
            final gqh gqhVar = gqnVar.e;
            hvi ar = hoq.ar(new Callable() { // from class: gqd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean z;
                    java.util.Collection<gqs> collection;
                    gqh gqhVar2 = gqh.this;
                    gqhVar2.b.writeLock().lock();
                    try {
                        gsa gsaVar = gsa.a;
                        boolean z2 = false;
                        try {
                            gsaVar = gqhVar2.a();
                        } catch (IOException e) {
                            if (!gqhVar2.g(e)) {
                                ((hkf) ((hkf) ((hkf) gqh.a.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "prepareForSync", 237, "SyncManagerDataStore.java")).s("Error, could not read or clear store. Aborting sync attempt.");
                                z = false;
                            }
                        }
                        jkj k = gsa.a.k();
                        k.w(gsaVar);
                        if (!k.b.M()) {
                            k.t();
                        }
                        ((gsa) k.b).d = jlu.a;
                        long epochMilli = Instant.now().toEpochMilli();
                        HashSet hashSet = new HashSet();
                        Iterator it = gsaVar.d.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            collection = keySet;
                            if (!hasNext) {
                                break;
                            }
                            grz grzVar = (grz) it.next();
                            gsc gscVar = grzVar.c;
                            if (gscVar == null) {
                                gscVar = gsc.a;
                            }
                            if (collection.contains(new gqs(gscVar))) {
                                gsc gscVar2 = grzVar.c;
                                if (gscVar2 == null) {
                                    gscVar2 = gsc.a;
                                }
                                hashSet.add(new gqs(gscVar2));
                                jkj C = grzVar.C();
                                if (!C.b.M()) {
                                    C.t();
                                }
                                grz grzVar2 = (grz) C.b;
                                grzVar2.b |= 4;
                                grzVar2.e = epochMilli;
                                k.D((grz) C.q());
                            } else {
                                k.D(grzVar);
                            }
                        }
                        for (gqs gqsVar : collection) {
                            if (!hashSet.contains(gqsVar)) {
                                jkj k2 = grz.a.k();
                                gsc gscVar3 = gqsVar.a;
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                jkp jkpVar = k2.b;
                                grz grzVar3 = (grz) jkpVar;
                                gscVar3.getClass();
                                grzVar3.c = gscVar3;
                                grzVar3.b |= 1;
                                long j = gqhVar2.e;
                                if (!jkpVar.M()) {
                                    k2.t();
                                }
                                jkp jkpVar2 = k2.b;
                                grz grzVar4 = (grz) jkpVar2;
                                grzVar4.b |= 2;
                                grzVar4.d = j;
                                if (!jkpVar2.M()) {
                                    k2.t();
                                }
                                jkp jkpVar3 = k2.b;
                                grz grzVar5 = (grz) jkpVar3;
                                grzVar5.b |= 4;
                                grzVar5.e = epochMilli;
                                if (!jkpVar3.M()) {
                                    k2.t();
                                }
                                grz grzVar6 = (grz) k2.b;
                                grzVar6.b |= 8;
                                grzVar6.f = 0;
                                k.D((grz) k2.q());
                            }
                        }
                        if (gsaVar.c < 0) {
                            long j2 = gqhVar2.e;
                            if (j2 < 0) {
                                j2 = Instant.now().toEpochMilli();
                                gqhVar2.e = j2;
                            }
                            if (!k.b.M()) {
                                k.t();
                            }
                            gsa gsaVar2 = (gsa) k.b;
                            gsaVar2.b |= 1;
                            gsaVar2.c = j2;
                        }
                        try {
                            gqhVar2.f((gsa) k.q());
                            gqhVar2.d.set(true);
                            z2 = true;
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            gqhVar2.d.set(true);
                            throw th;
                        }
                        z = Boolean.valueOf(z2);
                        return z;
                    } finally {
                        gqhVar2.b.writeLock().unlock();
                    }
                }
            }, gqhVar.c);
            hvi h = gqnVar.h(ar);
            cap capVar = new cap(obj3, ar, map, 14);
            hvm hvmVar = gqnVar.b;
            hvi ax = hoq.ax(h, capVar, hvmVar);
            map.getClass();
            hvi aw = hoq.aw(ax, new gqe(map, 3), hvmVar);
            gqnVar.d.b(aw, "SyncManager: Syncing");
            return aw;
        }
        if (i == 3) {
            final long longValue = ((Long) obj).longValue();
            final qi qiVar = new qi();
            final qi qiVar2 = new qi();
            final long epochMilli = Instant.now().toEpochMilli();
            Object obj4 = this.a;
            final gqn gqnVar2 = (gqn) obj4;
            hvi h2 = gqnVar2.h(gqnVar2.e.b());
            gzf gzfVar = new gzf() { // from class: gqi
                @Override // defpackage.gzf
                public final Object a(Object obj5) {
                    Map map2;
                    Iterator it;
                    gqi gqiVar = this;
                    gqn gqnVar3 = gqn.this;
                    Object obj6 = gqnVar3.h;
                    Map map3 = (Map) obj5;
                    Map map4 = qiVar2;
                    synchronized (obj6) {
                        Iterator it2 = gqnVar3.i.entrySet().iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            map2 = qiVar;
                            if (hasNext) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                gqs gqsVar = (gqs) entry.getKey();
                                Map map5 = gqnVar3.j;
                                if (map5.containsKey(gqsVar) || !gqnVar3.m(entry)) {
                                    gqiVar = this;
                                } else {
                                    long max = Math.max(((Long) Map.EL.getOrDefault(gqnVar3.k, gqsVar, -1L)).longValue(), ((Long) Map.EL.getOrDefault(map3, gqsVar, -1L)).longValue());
                                    gzp h3 = max == -1 ? gyf.a : gzp.h(Instant.ofEpochMilli(max));
                                    if (max == -1) {
                                        max = longValue;
                                    }
                                    gpt gptVar = ((gqs) entry.getKey()).b;
                                    gpp a = ((gpv) entry.getValue()).a();
                                    long j = max;
                                    long j2 = a.a;
                                    long j3 = epochMilli;
                                    if (j + j2 <= j3) {
                                        Iterator it3 = ((her) a.c).entrySet().iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                it = it2;
                                                hvw hvwVar = new hvw();
                                                map5.put(gqsVar, hvwVar);
                                                map2.put(gqsVar, new gqm(hvwVar, h3));
                                                break;
                                            }
                                            Map.Entry entry2 = (Map.Entry) it3.next();
                                            it = it2;
                                            Iterator it4 = it3;
                                            long j4 = ((gpr) entry2.getValue()).b;
                                            long j5 = j3 - j;
                                            long j6 = j4 + j2;
                                            if (j4 != -1 && j5 > j6) {
                                                it2 = it;
                                                it3 = it4;
                                            }
                                            gps gpsVar = (gps) entry2.getKey();
                                            if (!map4.containsKey(gpsVar)) {
                                                map4.put(gpsVar, Boolean.valueOf(((gpx) ((koe) gqnVar3.f.get(gpsVar)).b()).a()));
                                            }
                                            if (!((Boolean) map4.get(gpsVar)).booleanValue()) {
                                                ((hkf) ((hkf) gqn.a.c()).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "shouldSync", 586, "SyncManagerImpl.java")).u("Skipping synclet %s due to unsatisfied constraint", gptVar);
                                                break;
                                            }
                                            it2 = it;
                                            it3 = it4;
                                        }
                                    } else {
                                        it = it2;
                                    }
                                    gqiVar = this;
                                    it2 = it;
                                }
                            }
                        }
                    }
                    return map2;
                }
            };
            hvm hvmVar2 = gqnVar2.b;
            return hoq.au(hoq.at(h2, gzfVar, hvmVar2), new gjt(obj4, i2), hvmVar2);
        }
        if (i == 4) {
            return this.a;
        }
        char[] cArr = null;
        if (i != 5) {
            java.util.Map map2 = (java.util.Map) obj;
            ArrayList arrayList = new ArrayList();
            Iterator it = map2.entrySet().iterator();
            while (true) {
                obj2 = this.a;
                if (!it.hasNext()) {
                    break;
                }
                gqt gqtVar = (gqt) ((Map.Entry) it.next()).getValue();
                brn brnVar = new brn(cArr, cArr);
                ary b = gri.b(gqtVar.a);
                gri griVar = (gri) obj2;
                grq grqVar = griVar.e;
                long j = gqtVar.b;
                grqVar.c(Instant.ofEpochMilli(j), brnVar);
                gby gbyVar = new gby(((Long) ((gzs) griVar.d).a).longValue(), TimeUnit.HOURS);
                ghf ghfVar = griVar.f;
                String d = gri.d(b, griVar.c());
                gzp c = griVar.c();
                boolean booleanValue = ((Boolean) griVar.c.d(false)).booleanValue();
                gbw a = gca.a(grd.class);
                a.e = gzp.h(Long.valueOf(j));
                a.g = gzp.h(new gbx(gbyVar, gyf.a));
                a.f(new gbz(d, 3));
                a.c(b);
                a.d(hfm.p(grd.f(c), "sync_constraint:".concat(hoq.aR(b))));
                a.f = brnVar.x();
                if (booleanValue) {
                    a.b(art.b, new gby(5L, TimeUnit.HOURS));
                }
                if (c.f()) {
                    a.e((String) c.b());
                }
                arrayList.add(hti.f(ghfVar.c(a.a()), gvx.a(new grv(gqtVar, 1)), huf.a));
                cArr = null;
            }
            Set keySet2 = map2.keySet();
            HashSet hashSet = new HashSet();
            Iterator it2 = keySet2.iterator();
            while (it2.hasNext()) {
                hashSet.add(gri.b((Set) it2.next()));
            }
            gri griVar2 = (gri) obj2;
            arrayList.add(hti.g(griVar2.f.d(grd.f(griVar2.c())), gvx.c(new gja(obj2, hashSet, 11, null)), griVar2.b));
            return hnu.aX(arrayList).a(gvx.i(new bws(16)), huf.a);
        }
        java.util.Map map3 = (java.util.Map) obj;
        if (map3.isEmpty()) {
            return hve.a;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = map3.entrySet().iterator();
        while (it3.hasNext()) {
            gqt gqtVar2 = (gqt) ((Map.Entry) it3.next()).getValue();
            brn brnVar2 = new brn((char[]) null, (char[]) null);
            Set<gps> set = gqtVar2.a;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (gps gpsVar : set) {
                z |= gpsVar == gps.ON_CHARGER;
                z3 |= gpsVar == gps.ON_NETWORK_CONNECTED;
                z2 |= gpsVar == gps.ON_NETWORK_UNMETERED;
            }
            arw arwVar = new arw();
            arwVar.a = z;
            if (z2) {
                arwVar.b(3);
            } else if (z3) {
                arwVar.b(2);
            }
            Object obj5 = this.a;
            ary a2 = arwVar.a();
            long j2 = gqtVar2.b;
            grg grgVar = (grg) obj5;
            grgVar.c.c(Instant.ofEpochMilli(j2), brnVar2);
            StringBuilder sb = new StringBuilder(hnu.bK("SyncTask", grgVar.b()));
            Iterator it4 = new TreeSet(set).iterator();
            while (it4.hasNext()) {
                sb.append(((gps) it4.next()).d);
                sb.append('_');
            }
            String sb2 = sb.toString();
            gby gbyVar2 = new gby(Math.max(0L, j2 - Instant.now().toEpochMilli()), TimeUnit.MILLISECONDS);
            gzp b2 = grgVar.b();
            boolean booleanValue2 = ((Boolean) grgVar.b.d(false)).booleanValue();
            gbw a3 = gca.a(gra.class);
            a3.d = gbyVar2;
            a3.f(new gbz(sb2, 1));
            a3.c(a2);
            a3.d(hfm.p("com.google.apps.tiktok.sync.impl.workmanager.SyncWorker", "sync_constraint:".concat(hoq.aR(a2))));
            a3.f = brnVar2.x();
            if (booleanValue2) {
                gzpVar = b2;
                a3.b(art.b, new gby(5L, TimeUnit.HOURS));
            } else {
                gzpVar = b2;
            }
            if (gzpVar.f()) {
                a3.e((String) gzpVar.b());
            }
            arrayList2.add(hti.f(grgVar.d.c(a3.a()), gvx.a(new gia(gqtVar2, 20)), huf.a));
        }
        return hnu.aX(arrayList2).a(gvx.i(new bws(15)), huf.a);
    }
}
