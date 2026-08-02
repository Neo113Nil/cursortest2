package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class doj implements htr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ doj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v31, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v58, types: [gzf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v81, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v89, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.htr
    public final hvi a(Object obj) {
        hvi hviVar;
        int i = 10;
        int i2 = 19;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                return hoq.au(((dok) obj2).d.b(), new bpg(obj2, (ikc) obj, i2), huf.a);
            case 1:
                dop dopVar = (dop) obj;
                return dok.h(dopVar) ? hnu.aJ(dopVar) : ((dok) this.a).b();
            case 2:
                return ((ejl) this.a).a((ejj) obj);
            case 3:
                hel helVar = (hel) obj;
                if (helVar.isEmpty()) {
                    return hve.a;
                }
                Object obj3 = this.a;
                eny enyVar = (eny) obj3;
                lei leiVar = (lei) enyVar.g.b();
                jkj k = leh.a.k();
                int size = helVar.size();
                if (!k.b.M()) {
                    k.t();
                }
                jkp jkpVar = k.b;
                leh lehVar = (leh) jkpVar;
                lehVar.b |= 2;
                lehVar.e = size;
                if (!jkpVar.M()) {
                    k.t();
                }
                leh lehVar2 = (leh) k.b;
                leiVar.getClass();
                lehVar2.d = leiVar;
                lehVar2.b |= 1;
                HashSet hashSet = new HashSet();
                for (int i3 = 0; i3 < leiVar.b.size(); i3++) {
                    int h = jav.h(leiVar.b.e(i3));
                    if (h == 0) {
                        h = 1;
                    }
                    hashSet.add(Integer.valueOf(h - 1));
                }
                int size2 = helVar.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    leg legVar = (leg) helVar.get(i4);
                    int h2 = jav.h(legVar.d);
                    if (h2 == 0) {
                        h2 = 1;
                    }
                    if (hashSet.contains(Integer.valueOf(h2 - 1))) {
                        if (!k.b.M()) {
                            k.t();
                        }
                        leh lehVar3 = (leh) k.b;
                        legVar.getClass();
                        jkx jkxVar = lehVar3.c;
                        if (!jkxVar.c()) {
                            lehVar3.c = jkp.A(jkxVar);
                        }
                        lehVar3.c.add(legVar);
                    }
                }
                leh lehVar4 = (leh) k.q();
                emi emiVar = enyVar.a;
                eme a = emf.a();
                jkj k2 = lgv.a.k();
                if (!k2.b.M()) {
                    k2.t();
                }
                lgv lgvVar = (lgv) k2.b;
                lehVar4.getClass();
                lgvVar.o = lehVar4;
                lgvVar.b |= 65536;
                a.f((lgv) k2.q());
                return hti.f(emiVar.b(a.a()), new bso(obj3, helVar, 3), enyVar.c);
            case 4:
                return ((ewc) this.a).b((ewd) obj);
            case 5:
                return ((ewc) this.a).b((ewd) obj);
            case 6:
                return hnu.aK((hvi) ((ewg) this.a).e.bB());
            case 7:
                fwv fwvVar = (fwv) this.a;
                fwvVar.c = new ikm(((Context) fwvVar.d.c).getSharedPreferences("accounts", 0));
                return fwvVar.b.a((jll) obj, fwvVar.c);
            case 8:
                return this.a;
            case 9:
                Object obj4 = this.a;
                fcn fcnVar = (fcn) obj4;
                Uri uri = (Uri) hnu.aR(fcnVar.b);
                Uri l = exf.l(uri, ".tmp");
                try {
                    gty b = ((fcn) obj4).f.b("Write " + ((fcn) obj4).a);
                    try {
                        fem femVar = new fem();
                        try {
                            iyi iyiVar = ((fcn) obj4).m;
                            fbr fbrVar = new fbr();
                            fbrVar.a = new fem[]{femVar};
                            OutputStream outputStream = (OutputStream) iyiVar.r(l, fbrVar);
                            try {
                                ((jll) obj).e(outputStream);
                                femVar.a();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                b.close();
                                ((fcn) obj4).m.t(l, uri);
                                synchronized (fcnVar.g) {
                                    ((fcn) obj4).i = obj;
                                }
                                return hve.a;
                            } catch (Throwable th) {
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            throw exf.r(((fcn) obj4).m, uri, e, ((fcn) obj4).a);
                        }
                    } finally {
                    }
                } catch (IOException e2) {
                    iyi iyiVar2 = fcnVar.m;
                    if (iyiVar2.u(l)) {
                        try {
                            iyiVar2.s(l);
                        } catch (IOException e3) {
                            e2.addSuppressed(e3);
                        }
                    }
                    throw e2;
                }
            case 10:
                fcr fcrVar = (fcr) this.a;
                fcrVar.c((Uri) hnu.aR(fcrVar.a), obj);
                return hve.a;
            case 11:
                fcr fcrVar2 = (fcr) this.a;
                return hnu.aJ(fcrVar2.b((Uri) hnu.aR(fcrVar2.a)));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Uri uri2 = (Uri) obj;
                Uri l2 = exf.l(uri2, ".bak");
                try {
                    iyi iyiVar3 = ((fcr) this.a).f;
                    if (iyiVar3.u(l2)) {
                        iyiVar3.t(l2, uri2);
                    }
                    return hve.a;
                } catch (IOException e4) {
                    return hnu.aI(e4);
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj5 = this.a;
                synchronized (((fcr) obj5).d) {
                    hviVar = ((fcr) obj5).e;
                }
                return hviVar;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return hnu.aJ(this.a.a(obj));
            case 15:
                return ((fcu) this.a).c.c();
            case 16:
                return ((fcu) this.a).b.h();
            case 17:
                Object obj6 = this.a;
                ((IOException) obj6).addSuppressed((IOException) obj);
                throw ((Throwable) obj6);
            case 18:
                ((hkf) ((hkf) ((hkf) fuq.a.f()).h((Throwable) obj)).i("com/google/apps/tiktok/account/data/AccountInvalidator", "invalidateAllAccounts", 70, "AccountInvalidator.java")).s("Account sync failed");
                return ((fuq) this.a).b.e.a(new esh(i), huf.a);
            case 19:
                fwm fwmVar = (fwm) ((fuy) this.a).a.b();
                her d = fwmVar.d();
                ArrayList arrayList = new ArrayList();
                hjr it = d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    fut futVar = (fut) entry.getValue();
                    arrayList.add(hti.f(futVar.a(), gvx.a(new bso(str, futVar, i, null)), fwmVar.b));
                }
                return hnu.aX(arrayList).a(gvx.i(new avc(arrayList, 14)), fwmVar.b);
            default:
                final hel helVar2 = (hel) obj;
                Object obj7 = this.a;
                gty aC = hoq.aC(105, "Sync Accounts");
                Object obj8 = ((fuy) obj7).f.a;
                try {
                    Object obj9 = ((ghf) obj8).f;
                    gzf gzfVar = new gzf() { // from class: fws
                        @Override // defpackage.gzf
                        public final Object a(Object obj10) {
                            int i5;
                            ful fulVar;
                            jkj C = ((fxd) obj10).C();
                            fxd fxdVar = (fxd) C.q();
                            HashMap hashMap = new HashMap();
                            Collection collection = helVar2;
                            Iterator it2 = collection.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ful fulVar2 = (ful) it2.next();
                                Iterator it3 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((fxd) C.b).d)).values().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        fxf fxfVar = (fxf) it3.next();
                                        ful fulVar3 = fxfVar.d;
                                        if (fulVar3 == null) {
                                            fulVar3 = ful.a;
                                        }
                                        if (!fulVar3.k.equals(fulVar2.k) ? false : fulVar3.c.equals(fulVar2.c)) {
                                            jkj C2 = fxfVar.C();
                                            if (!C2.b.M()) {
                                                C2.t();
                                            }
                                            fxf fxfVar2 = (fxf) C2.b;
                                            fulVar2.getClass();
                                            jkp jkpVar2 = fxfVar2.d;
                                            if (jkpVar2 == null || jkpVar2 == (fulVar = ful.a)) {
                                                fxfVar2.d = fulVar2;
                                            } else {
                                                jkj k3 = fulVar.k();
                                                k3.w(jkpVar2);
                                                jkl jklVar = (jkl) k3;
                                                jklVar.w(fulVar2);
                                                fxfVar2.d = (ful) jklVar.r();
                                            }
                                            fxfVar2.b = 2 | fxfVar2.b;
                                            C.B(fxfVar.c, (fxf) C2.q());
                                            i5 = fxfVar.c;
                                        }
                                    } else {
                                        jkj k4 = fxf.a.k();
                                        if (!k4.b.M()) {
                                            k4.t();
                                        }
                                        jkp jkpVar3 = k4.b;
                                        fxf fxfVar3 = (fxf) jkpVar3;
                                        fulVar2.getClass();
                                        fxfVar3.d = fulVar2;
                                        fxfVar3.b = 2 | fxfVar3.b;
                                        if (!jkpVar3.M()) {
                                            k4.t();
                                        }
                                        fxf fxfVar4 = (fxf) k4.b;
                                        fxfVar4.e = 0;
                                        fxfVar4.b = 4 | fxfVar4.b;
                                        jkp jkpVar4 = C.b;
                                        int i6 = ((fxd) jkpVar4).c;
                                        int i7 = i6 + 1;
                                        if (!jkpVar4.M()) {
                                            C.t();
                                        }
                                        fxd fxdVar2 = (fxd) C.b;
                                        fxdVar2.b |= 1;
                                        fxdVar2.c = i7;
                                        if (!k4.b.M()) {
                                            k4.t();
                                        }
                                        fxf fxfVar5 = (fxf) k4.b;
                                        fxfVar5.b |= 1;
                                        fxfVar5.c = i6;
                                        C.B(i6, (fxf) k4.q());
                                        i5 = i6;
                                    }
                                }
                                hashMap.put(frv.a(i5), fulVar2);
                            }
                            her i8 = her.i(hashMap);
                            hoq.I(i8.size() == collection.size(), "Provider had duplicate accounts.");
                            hfk hfkVar = new hfk();
                            Iterator it4 = DesugarCollections.unmodifiableMap(fxdVar.d).values().iterator();
                            while (it4.hasNext()) {
                                hfkVar.c(frv.a(((fxf) it4.next()).c));
                            }
                            hfm<frv> f = hnu.i(hfkVar.g(), i8.keySet()).f();
                            hen henVar = new hen(4);
                            Map unmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((fxd) C.b).d));
                            for (frv frvVar : f) {
                                Integer valueOf = Integer.valueOf(frvVar.a);
                                if (unmodifiableMap.containsKey(valueOf)) {
                                    int x = a.x(((fxf) unmodifiableMap.get(valueOf)).e);
                                    if (x == 0) {
                                        x = 1;
                                    }
                                    if (x == 2) {
                                        henVar.g(frvVar, (fxf) unmodifiableMap.get(valueOf));
                                    }
                                }
                            }
                            her d2 = henVar.d(true);
                            Iterator<E> it5 = f.iterator();
                            while (it5.hasNext()) {
                                int i9 = ((frv) it5.next()).a;
                                if (!C.b.M()) {
                                    C.t();
                                }
                                ((fxd) C.b).b().remove(Integer.valueOf(i9));
                            }
                            return new fwt(d2, (fxd) C.q());
                        }
                    };
                    AtomicReference atomicReference = new AtomicReference();
                    hvi i5 = ((iyi) obj9).i(gvx.a(new bso(gzfVar, atomicReference, 12)), ((ghf) obj8).d);
                    gzf a2 = gvx.a(new euy(atomicReference, 18));
                    huf hufVar = huf.a;
                    gwu h3 = gwu.g(hti.f(i5, a2, hufVar)).i(new fvr(obj8, 5), ((ghf) obj8).e).h(new esh(i2), hufVar);
                    aC.b(h3);
                    aC.close();
                    return h3;
                } catch (Throwable th3) {
                    try {
                        aC.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}
