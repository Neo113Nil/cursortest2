package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import androidx.work.WorkerParameters;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Map;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cap implements htq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ cap(ikm ikmVar, gpk gpkVar, int i) {
        this.d = i;
        this.a = ikmVar;
        this.b = gpkVar;
        this.c = "otp_database";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v139, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v160, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v169, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v179, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v34, types: [htr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v52, types: [hvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v84, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v64, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v68, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v73, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v80, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v60, types: [fyj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.htq
    public final hvi a() {
        NetworkInfo activeNetworkInfo;
        hvi g;
        hvi aI;
        int i = 2;
        int i2 = 8;
        int i3 = 13;
        ArrayList arrayList = null;
        int i4 = 4;
        int i5 = 5;
        int i6 = 1;
        int i7 = 0;
        switch (this.d) {
            case 0:
                String str = (String) hnu.aR(this.b);
                bpc bpcVar = (bpc) hnu.aR(this.c);
                if (str.equals("pseudonymous")) {
                    return hnu.aJ(bpcVar);
                }
                Object obj = this.a;
                long epochMilli = Instant.now().toEpochMilli();
                try {
                    jnd B = kt.B(bpcVar, str);
                    Object obj2 = ((car) obj).e;
                    caz cazVar = (caz) obj2;
                    kuq a = cazVar.f.a(TimeUnit.SECONDS);
                    jnm jnmVar = jnm.a;
                    jkj k = jnmVar.k();
                    if (!k.b.M()) {
                        k.t();
                    }
                    jnm jnmVar2 = (jnm) k.b;
                    B.getClass();
                    jnmVar2.c = B;
                    jnmVar2.b |= 1;
                    jnm jnmVar3 = (jnm) k.q();
                    Object obj3 = a.a;
                    kae kaeVar = jnk.c;
                    if (kaeVar == null) {
                        synchronized (jnk.class) {
                            kaeVar = jnk.c;
                            if (kaeVar == null) {
                                kab c = kae.c();
                                c.c = kad.a;
                                c.d = kae.b("google.internal.identity.passbox.passbox.v1.PassboxExternalService", "UpdateCredential");
                                c.b();
                                jkd jkdVar = knl.a;
                                c.a = new knk(jnmVar);
                                c.b = new knk(jnd.a);
                                kae a2 = c.a();
                                jnk.c = a2;
                                kaeVar = a2;
                            }
                        }
                    }
                    hvi a3 = knp.a(((jwx) obj3).b(kaeVar, (jww) a.b), jnmVar3);
                    cax caxVar = new cax(obj2, epochMilli, i7);
                    hvl hvlVar = cazVar.d;
                    hvi au = hoq.au(a3, caxVar, hvlVar);
                    return hoq.ap(au, Exception.class, new bpm(obj2, epochMilli, au, 5), hvlVar);
                } catch (boz | bps e) {
                    throw new cat("Could not create a passbox credential when updating an OTP before making the gRPC call", e);
                }
            case 1:
                String str2 = (String) hnu.aR(this.b);
                hel helVar = (hel) hnu.aR(this.c);
                return str2.equals("pseudonymous") ? hnu.aJ(helVar) : ((caz) ((car) this.a).e).a(helVar, str2);
            case 2:
                String str3 = (String) hnu.aR(this.b);
                bpc bpcVar2 = (bpc) hnu.aR(this.c);
                if (str3.equals("pseudonymous")) {
                    return hnu.aI(new can());
                }
                Object obj4 = this.a;
                long epochMilli2 = Instant.now().toEpochMilli();
                String str4 = bpcVar2.c;
                if (str4 == null) {
                    str4 = "nil";
                }
                try {
                    jnd B2 = kt.B(bpcVar2, str3);
                    Object obj5 = ((car) obj4).e;
                    caz cazVar2 = (caz) obj5;
                    kuq a4 = cazVar2.f.a(TimeUnit.SECONDS);
                    jnc jncVar = jnc.a;
                    jkj k2 = jncVar.k();
                    String d = caz.d(str4, str3);
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    jkp jkpVar = k2.b;
                    d.getClass();
                    ((jnc) jkpVar).c = d;
                    if (!jkpVar.M()) {
                        k2.t();
                    }
                    jkp jkpVar2 = k2.b;
                    jnc jncVar2 = (jnc) jkpVar2;
                    B2.getClass();
                    jncVar2.d = B2;
                    jncVar2.b |= 1;
                    String str5 = bpcVar2.g;
                    if (!jkpVar2.M()) {
                        k2.t();
                    }
                    jnc jncVar3 = (jnc) k2.b;
                    str5.getClass();
                    jncVar3.e = str5;
                    jnc jncVar4 = (jnc) k2.q();
                    Object obj6 = a4.a;
                    kae kaeVar2 = jnk.a;
                    if (kaeVar2 == null) {
                        synchronized (jnk.class) {
                            kaeVar2 = jnk.a;
                            if (kaeVar2 == null) {
                                kab c2 = kae.c();
                                c2.c = kad.a;
                                c2.d = kae.b("google.internal.identity.passbox.passbox.v1.PassboxExternalService", "CreateCredential");
                                c2.b();
                                jkd jkdVar2 = knl.a;
                                c2.a = new knk(jncVar);
                                c2.b = new knk(jnd.a);
                                kaeVar2 = c2.a();
                                jnk.a = kaeVar2;
                            }
                        }
                    }
                    hvi a5 = knp.a(((jwx) obj6).b(kaeVar2, (jww) a4.b), jncVar4);
                    cax caxVar2 = new cax(obj5, epochMilli2, i6);
                    hvl hvlVar2 = cazVar2.d;
                    hvi au2 = hoq.au(a5, caxVar2, hvlVar2);
                    return hoq.ap(au2, Exception.class, new bpm(obj5, epochMilli2, au2, 2), hvlVar2);
                } catch (boz | bps e2) {
                    throw new cat("Could not create a passbox credential when adding an OTP before making the gRPC call", e2);
                }
            case 3:
                String str6 = (String) hnu.aR(this.c);
                return str6.equals("pseudonymous") ? hnu.aJ(0L) : ((caz) ((car) this.b).e).b((bpc) this.a, str6, false);
            case 4:
                String str7 = (String) hnu.aR(this.b);
                if (str7.equals("pseudonymous")) {
                    return hve.a;
                }
                ?? r2 = this.c;
                Object obj7 = this.a;
                heg hegVar = new heg(4);
                Iterator it = r2.iterator();
                while (true) {
                    Object obj8 = ((car) obj7).e;
                    if (!it.hasNext()) {
                        return hoq.aW(hegVar.g()).s(new bws(3), ((caz) obj8).c);
                    }
                    hegVar.h(((caz) obj8).b((bpc) it.next(), str7, false));
                }
            case 5:
                Map map = (Map) hnu.aR(this.b);
                List list = (List) hnu.aR(this.c);
                ArrayList arrayList2 = new ArrayList();
                for (String str8 : map.keySet()) {
                    gzp R = hnu.R(hdb.c(list).f(), new bqg(true != str8.equals("0") ? str8 : "pseudonymous", i2));
                    if (R.f()) {
                        car a6 = ((cbe) this.a).h.a(((fuf) R.b()).a);
                        List list2 = (List) map.get(str8);
                        bpr bprVar = (bpr) a6.d;
                        arrayList2.add(hoq.at(bprVar.e.q(new bpl(bprVar, list2, i7)), new bpf(list2, i), bprVar.b));
                    }
                }
                return hnu.aG(arrayList2);
            case 6:
                Object obj9 = this.c;
                Object obj10 = this.b;
                try {
                    int H = a.H(((lgc) ((eqd) obj10).e.b()).e);
                    Object obj11 = this.a;
                    if (H != 0 && H == 5) {
                        ((eqa) obj11).q = (eru) obj9;
                    }
                    Context context = ((eqd) obj10).a;
                    ((eqa) obj11).l = ((eqd) obj10).h.r();
                    int i8 = -1;
                    try {
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                            i8 = activeNetworkInfo.getType();
                        }
                    } catch (SecurityException e3) {
                        ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e3)).i("com/google/android/libraries/performance/primes/metrics/network/NetworkCapture", "getNetworkType", '$', "NetworkCapture.java")).s("Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml");
                    }
                    int g2 = jav.g(i8);
                    if (g2 != 0) {
                        i6 = g2;
                    }
                    ((eqa) obj11).s = i6;
                    int i9 = ((epz) ((eqd) obj10).b.b()).a;
                    synchronized (((eqd) obj10).c) {
                        ((eqd) obj10).f.ensureCapacity(i9);
                        ((eqd) obj10).f.add(obj11);
                        if (((eqd) obj10).f.size() >= i9) {
                            arrayList = ((eqd) obj10).f;
                            ((eqd) obj10).f = new ArrayList(0);
                        }
                    }
                    return arrayList == null ? hve.a : ((eqd) obj10).b(((eqb) ((eqd) obj10).d.b()).c(arrayList));
                } finally {
                    ((eqd) obj10).g.decrementAndGet();
                }
            case 7:
                Object obj12 = this.a;
                fcn fcnVar = (fcn) obj12;
                Uri uri = (Uri) hnu.aR(fcnVar.b);
                fbe fbeVar = new fbe((Closeable) fcnVar.m.r(uri, new fbo(false, false)));
                ?? r8 = this.c;
                ?? r1 = this.b;
                try {
                    try {
                        g = hnu.aJ(((fcn) obj12).c(uri));
                    } catch (IOException e4) {
                        gzp gzpVar = ((fcn) obj12).d;
                        if (gzpVar.f()) {
                            g = hti.g(fcn.e(e4) ? hnu.aI(e4) : ((fby) gzpVar.b()).a(e4, ((fcn) obj12).e), gvx.c(new egl(obj12, uri, i2, null == true ? 1 : 0)), ((fcn) obj12).c);
                        } else {
                            aI = hnu.aI(e4);
                        }
                    }
                    hvi g3 = hti.g(g, r1, r8);
                    aI = fcn.b(hti.g(g3, gvx.c(new bpp(obj12, g, g3, i5)), huf.a), fbeVar.a(), ((fcn) obj12).c);
                    fbeVar.close();
                    return aI;
                } finally {
                }
            case 8:
                Object aR = hnu.aR(this.b);
                aR.getClass();
                final hel helVar2 = (hel) aR;
                Object aR2 = hnu.aR(this.c);
                aR2.getClass();
                final Map map2 = (Map) aR2;
                hkh hkhVar = fvw.a;
                ((hkf) hkhVar.e().i("com/google/apps/tiktok/account/data/google/GmsAccounts", "createAccountInfos", 137, "GmsAccounts.kt")).t("GMSCore Auth returned %d accounts.", map2.size());
                ((hkf) hkhVar.e().i("com/google/apps/tiktok/account/data/google/GmsAccounts", "createAccountInfos", 138, "GmsAccounts.kt")).t("GoogleOwnersProvider returned %d accounts.", helVar2.size());
                if (helVar2.size() < map2.size()) {
                    ((hkf) hkhVar.g().i("com/google/apps/tiktok/account/data/google/GmsAccounts", "createAccountInfos", 140, "GmsAccounts.kt")).s("GoogleOwnersProvider did not return all accounts.");
                }
                final LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                final qi qiVar = new qi(map2.size());
                hjs listIterator = helVar2.listIterator(0);
                listIterator.getClass();
                while (true) {
                    Object obj13 = this.a;
                    if (!listIterator.hasNext()) {
                        for (String str9 : linkedHashMap.keySet()) {
                            Map.EL.computeIfAbsent(qiVar, str9, new ckw(new fvv(obj13, str9, i7), 2));
                        }
                        if (!qiVar.isEmpty()) {
                            ((hkf) hkhVar.g().i("com/google/apps/tiktok/account/data/google/GmsAccounts", "createAccountInfos", 162, "GmsAccounts.kt")).t("GoogleOwnersProvider had %d missing ids.", qiVar.d);
                        }
                        jxu aV = hnu.aV(qiVar.values());
                        Callable i10 = gvx.i(new Callable() { // from class: fvq
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Object obj14;
                                HashMap hashMap = new HashMap();
                                hjs listIterator2 = hel.this.listIterator(0);
                                listIterator2.getClass();
                                while (true) {
                                    qi qiVar2 = qiVar;
                                    if (!listIterator2.hasNext()) {
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            String str10 = (String) entry.getKey();
                                            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                                            try {
                                                obj14 = qiVar2.get(str10);
                                            } catch (ExecutionException e5) {
                                                ((hkf) ((hkf) fvw.a.f()).h(e5.getCause()).i("com/google/apps/tiktok/account/data/google/GmsAccounts$Companion", "createGaiaIdToAccountInfosMap", 517, "GmsAccounts.kt")).s("Failed to get GaiaId");
                                            }
                                            if (obj14 == null) {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                            Object aR3 = hnu.aR((Future) obj14);
                                            aR3.getClass();
                                            String str11 = (String) aR3;
                                            jkl jklVar = (jkl) ful.a.k();
                                            jklVar.getClass();
                                            fhr.s(str11, jklVar);
                                            fhr.q(str10, jklVar);
                                            fhr.r(str10, jklVar);
                                            fhr.t(jklVar);
                                            iwq iwqVar = fwc.a;
                                            iwqVar.getClass();
                                            jkj k3 = fvy.a.k();
                                            k3.getClass();
                                            fhr.m(booleanValue, k3);
                                            fhr.n(1, k3);
                                            jklVar.ao(iwqVar, fhr.l(k3));
                                            fhr.o(str11, fhr.p(jklVar), hashMap);
                                        }
                                        return hashMap;
                                    }
                                    E next = listIterator2.next();
                                    next.getClass();
                                    ega egaVar = (ega) next;
                                    String str12 = egaVar.e;
                                    if (str12 == null) {
                                        hvi hviVar = (hvi) qiVar2.get(egaVar.a);
                                        if (hviVar == null) {
                                            ((hkf) fvw.a.g().i("com/google/apps/tiktok/account/data/google/GmsAccounts$Companion", "createGaiaIdToAccountInfosMap", 457, "GmsAccounts.kt")).s("GoogleOwnersProvider returned account that does not exist on the device.");
                                        } else {
                                            try {
                                                str12 = (String) hnu.aR(hviVar);
                                            } catch (ExecutionException e6) {
                                                ((hkf) ((hkf) fvw.a.f()).h(e6.getCause()).i("com/google/apps/tiktok/account/data/google/GmsAccounts$Companion", "createGaiaIdToAccountInfosMap", 464, "GmsAccounts.kt")).s("Failed to get GaiaId");
                                            }
                                        }
                                    }
                                    if (str12 == null) {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    java.util.Map map3 = map2;
                                    String str13 = egaVar.a;
                                    Boolean bool = (Boolean) map3.get(str13);
                                    if (bool != null) {
                                        jkl jklVar2 = (jkl) ful.a.k();
                                        jklVar2.getClass();
                                        fhr.s(str12, jklVar2);
                                        if (!jklVar2.b.M()) {
                                            jklVar2.t();
                                        }
                                        ful fulVar = (ful) jklVar2.b;
                                        fulVar.b |= 64;
                                        fulVar.i = false;
                                        str13.getClass();
                                        fhr.q(str13, jklVar2);
                                        String str14 = egaVar.b;
                                        if (str14 != null && str14.length() != 0) {
                                            fhr.r(str14, jklVar2);
                                        }
                                        String str15 = egaVar.g;
                                        if (str15 != null && str15.length() != 0) {
                                            if (!jklVar2.b.M()) {
                                                jklVar2.t();
                                            }
                                            ful fulVar2 = (ful) jklVar2.b;
                                            fulVar2.b |= 32;
                                            fulVar2.h = str15;
                                        }
                                        String str16 = egaVar.c;
                                        if (str16 != null && str16.length() != 0) {
                                            if (!jklVar2.b.M()) {
                                                jklVar2.t();
                                            }
                                            ful fulVar3 = (ful) jklVar2.b;
                                            fulVar3.b |= 4;
                                            fulVar3.e = str16;
                                        }
                                        String str17 = egaVar.d;
                                        if (str17 != null && str17.length() != 0) {
                                            if (!jklVar2.b.M()) {
                                                jklVar2.t();
                                            }
                                            ful fulVar4 = (ful) jklVar2.b;
                                            fulVar4.b |= 8;
                                            fulVar4.f = str17;
                                        }
                                        fhr.t(jklVar2);
                                        iwq iwqVar2 = fwc.a;
                                        iwqVar2.getClass();
                                        jkj k4 = fvy.a.k();
                                        k4.getClass();
                                        fhr.m(bool.booleanValue(), k4);
                                        int i11 = egaVar.i;
                                        if (i11 == 0) {
                                            throw null;
                                        }
                                        int i12 = i11 - 1;
                                        fhr.n(i12 != 0 ? i12 != 1 ? 3 : 2 : 1, k4);
                                        jklVar2.ao(iwqVar2, fhr.l(k4));
                                        fhr.o(str12, fhr.p(jklVar2), hashMap);
                                    } else {
                                        ((hkf) fvw.a.b().i("com/google/apps/tiktok/account/data/google/GmsAccounts$Companion", "createGaiaIdToAccountInfosMap", 509, "GmsAccounts.kt")).s("Dropping stale account.");
                                    }
                                }
                            }
                        });
                        hvl hvlVar3 = ((fvw) obj13).c;
                        return hti.g(aV.a(i10, hvlVar3), gvx.c(new fvr(obj13, i7)), hvlVar3);
                    }
                    E next = listIterator.next();
                    next.getClass();
                    ega egaVar = (ega) next;
                    String str10 = egaVar.a;
                    if (str10 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (map2.containsKey(str10)) {
                        linkedHashMap.remove(str10);
                        if (egaVar.e == null && !qiVar.containsKey(str10)) {
                            qiVar.put(str10, ((fvw) obj13).a(str10));
                        }
                    }
                }
                break;
            case 9:
                Set b = ((jsd) ((ghf) this.b).h).b();
                ArrayList arrayList3 = new ArrayList(b.size());
                Iterator it2 = b.iterator();
                Object obj14 = this.a;
                while (it2.hasNext()) {
                    try {
                        arrayList3.add(((fum) it2.next()).a((fun) obj14));
                    } catch (Exception e5) {
                        arrayList3.add(hnu.aI(e5));
                    }
                }
                ?? r0 = this.c;
                r0.addAll(arrayList3);
                return hnu.aX(r0).a(new bws(19), huf.a);
            case 10:
                ikm b2 = ((fxl) ((ikm) this.a).b).b((gpk) this.b, ((String) this.c).concat(".db"));
                return hti.f(b2.b.submit(gvx.i(new avc(b2, 16))), gvx.a(new esh(20)), huf.a);
            case 11:
                gzp gzpVar2 = (gzp) hnu.aR(this.b);
                gzp gzpVar3 = (gzp) hnu.aR(this.c);
                if (!gzpVar2.f() || !gzpVar3.f()) {
                    return hnu.aJ(gdm.a);
                }
                Object obj15 = this.a;
                hel o = hel.o((Collection) gzpVar2.b());
                fyh fyhVar = (fyh) obj15;
                gzp gzpVar4 = fyhVar.a;
                if (gzpVar4.f()) {
                    return hti.f(gzpVar4.b().a(o), gvx.a(new bso(o, gzpVar3, i3, null == true ? 1 : 0)), fyhVar.b);
                }
                hen henVar = new hen(4);
                int size = o.size();
                while (i7 < size) {
                    henVar.g((fuf) o.get(i7), fyi.a);
                    i7++;
                }
                return hnu.aJ(gdm.a(henVar.d(true), Instant.ofEpochMilli(((Long) gzpVar3.b()).longValue())));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                hvi a7 = ((gbr) ((gcl) this.b).a.b()).a((WorkerParameters) this.a);
                ((gty) this.c).b(a7);
                return a7;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj16 = this.c;
                Object obj17 = this.a;
                return ((cka) ((gjl) obj17).k).m(new gib(obj16, obj17, i5), (hfm) this.b);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((gqn) this.a).c(this.b, this.c);
            case 15:
                ((hkf) ((hkf) gqn.a.e()).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInParallel", 658, "SyncManagerImpl.java")).s("Completed sync. Scheduling next wakeup");
                return ((gqn) this.a).g(this.b, ((Long) this.c).longValue());
            case 16:
                return ((gqn) this.a).d(this.c, (gqs) this.b);
            case 17:
                Object obj18 = this.c;
                Object obj19 = this.a;
                gib gibVar = new gib(obj18, obj19, 10);
                gqn gqnVar = (gqn) this.b;
                return hnu.aQ(hti.f(hoq.as(gibVar, gqnVar.c), new fxn(15), huf.a), ((gpv) obj19).a().b, TimeUnit.MILLISECONDS, gqnVar.b);
            case 18:
                Set set = (Set) hnu.aR(this.b);
                Set set2 = (Set) hnu.aR(this.c);
                hjm i11 = hnu.i(set, set2);
                hjm i12 = hnu.i(set2, set);
                Object obj20 = this.a;
                gqn gqnVar2 = (gqn) obj20;
                gqnVar2.i(i11);
                HashSet hashSet = new HashSet();
                Object obj21 = gqnVar2.h;
                synchronized (obj21) {
                    for (gqs gqsVar : ((gqn) obj20).i.keySet()) {
                        if (i12.contains(gqsVar.c)) {
                            hashSet.add(gqsVar);
                        }
                    }
                    synchronized (obj21) {
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            hvi hviVar = (hvi) ((gqn) obj20).j.get((gqs) it3.next());
                            if (hviVar != null) {
                                hviVar.cancel(false);
                            }
                        }
                    }
                    if (!i11.isEmpty() && i12.isEmpty()) {
                        return hve.a;
                    }
                    ((hkf) ((hkf) gqn.a.e()).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 764, "SyncManagerImpl.java")).s("Accounts did change. Rescheduling synclets.");
                    return hoq.at(gqnVar2.f(hnu.aJ(hjb.a)), new fxn(i3), huf.a);
                }
                ((gqn) obj20).i.keySet().removeAll(hashSet);
                gaj gajVar = ((gqn) obj20).d;
                gqh gqhVar = ((gqn) obj20).e;
                hvi submit = gqhVar.c.submit(new gnq(gqhVar, hashSet, i4));
                gajVar.b(submit, "SyncManager: removeAccounts");
                gaj.d(206, submit, "Error removing accounts from sync. IDs: %s", i12);
                if (!i11.isEmpty()) {
                }
                ((hkf) ((hkf) gqn.a.e()).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 764, "SyncManagerImpl.java")).s("Accounts did change. Rescheduling synclets.");
                return hoq.at(gqnVar2.f(hnu.aJ(hjb.a)), new fxn(i3), huf.a);
            default:
                grm grmVar = (grm) this.a;
                hnu.aR(grmVar.b);
                return grmVar.a.a(this.c, (Duration) hnu.aR(this.b));
        }
    }

    public /* synthetic */ cap(gqn gqnVar, hvi hviVar, gqs gqsVar, int i) {
        this.d = i;
        this.a = gqnVar;
        this.c = hviVar;
        this.b = gqsVar;
    }

    public /* synthetic */ cap(eqd eqdVar, eqa eqaVar, eru eruVar, int i) {
        this.d = i;
        this.b = eqdVar;
        this.a = eqaVar;
        this.c = eruVar;
    }

    public /* synthetic */ cap(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ cap(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }
}
