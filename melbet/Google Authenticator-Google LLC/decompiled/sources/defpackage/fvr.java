package defpackage;

import android.os.Bundle;
import j$.time.Instant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fvr implements htr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fvr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v43, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r10v45, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r10v47, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r10v49, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r10v51, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r10v53, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r10v58, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r10v60, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r10v62, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r10v64, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r10v66, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.htr
    public final hvi a(Object obj) {
        byte[] bArr = null;
        int i = 0;
        switch (this.b) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                int i2 = hel.d;
                heg hegVar = new heg(4);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Map map2 = (Map) entry.getValue();
                    if (map2.size() == 1) {
                        hegVar.h(ixc.i(map2.values()));
                    } else {
                        linkedHashMap.put(str, map2);
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return hnu.aJ(hegVar.g());
                }
                Object obj2 = this.a;
                fvw fvwVar = (fvw) obj2;
                final boolean z = !((Boolean) ((gzp) ((jrx) fvwVar.e).a).d(false)).booleanValue();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    final Map map3 = (Map) entry2.getValue();
                    if (str2.length() <= 0) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    gty aC = hoq.aC(101, "getAccountNameFromAccountId");
                    try {
                        hvi aN = hnu.aN(gvx.b(new bwr(obj2, str2, 12)), ((fvw) obj2).b);
                        aC.b(aN);
                        ixf.j(aC, null);
                        arrayList.add(hti.f(aN, gvx.a(new gzf() { // from class: fvs
                            @Override // defpackage.gzf
                            public final Object a(Object obj3) {
                                String str3 = (String) obj3;
                                if (str3 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                Map map4 = map3;
                                ful fulVar = (ful) map4.get(str3);
                                if (fulVar == null) {
                                    ((hkf) fvw.a.f().i("com/google/apps/tiktok/account/data/google/GmsAccounts", "getValidAccount$<anonymous>", 268, "GmsAccounts.kt")).s("the primary email address for the duplicate gaia id does not match any of the corresponding accounts on device.");
                                    return null;
                                }
                                if (!z) {
                                    return fulVar;
                                }
                                ArrayList arrayList2 = new ArrayList(map4.size() - 1);
                                for (String str4 : map4.keySet()) {
                                    if (!ksp.b(str3, str4)) {
                                        arrayList2.add(str4);
                                    }
                                }
                                iwq iwqVar = fwc.a;
                                fulVar.g(iwqVar);
                                Object j = fulVar.l.j((jko) iwqVar.c);
                                if (j == null) {
                                    j = iwqVar.b;
                                } else {
                                    iwqVar.c(j);
                                }
                                jkj C = ((fvy) j).C();
                                if (!C.b.M()) {
                                    C.t();
                                }
                                fvy fvyVar = (fvy) C.b;
                                jkx jkxVar = fvyVar.d;
                                if (!jkxVar.c()) {
                                    fvyVar.d = jkp.A(jkxVar);
                                }
                                jiz.f(arrayList2, fvyVar.d);
                                jkl jklVar = (jkl) fulVar.C();
                                jklVar.ao(iwqVar, C.q());
                                return (ful) jklVar.q();
                            }
                        }), fvwVar.c));
                    } finally {
                    }
                }
                return hnu.aX(arrayList).a(gvx.i(new bsp(arrayList, hegVar, 15, bArr)), fvwVar.c);
            case 1:
                return (((fuz) obj).b & 1) != 0 ? hoq.at(((fwm) ((fwm) this.a).a).g(), new esh(11), huf.a) : hnu.aJ(gyf.a);
            case 2:
                return hti.f(((fug) ((iwq) this.a).d).d(), new gzg(((Bundle) obj).getString("authAccount")), huf.a);
            case 3:
                ikm ikmVar = ((fwq) this.a).a;
                return ikmVar.f(ikmVar.e(true));
            case 4:
                Object obj3 = this.a;
                ((IOException) obj3).addSuppressed((IOException) obj);
                throw ((Throwable) obj3);
            case 5:
                ArrayList arrayList2 = new ArrayList();
                hjr it = ((her) obj).entrySet().iterator();
                while (it.hasNext()) {
                    Object obj4 = this.a;
                    Map.Entry entry3 = (Map.Entry) it.next();
                    fun funVar = new fun((frv) entry3.getKey(), iyi.j((fxf) entry3.getValue()).b);
                    ghf ghfVar = (ghf) obj4;
                    Set b = ((jsd) ghfVar.g).b();
                    ArrayList arrayList3 = new ArrayList(b.size());
                    Iterator it2 = b.iterator();
                    while (it2.hasNext()) {
                        try {
                            arrayList3.add(((fuo) it2.next()).a(funVar));
                        } catch (Exception e) {
                            arrayList3.add(hnu.aI(e));
                        }
                    }
                    arrayList2.add(hnu.aV(arrayList3).b(gvx.b(new cap(obj4, arrayList3, funVar, 9, null)), ghfVar.e));
                }
                return hnu.aX(arrayList2).a(new bws(19), huf.a);
            case 6:
                fuz fuzVar = (fuz) obj;
                return ((fuzVar.b & 1) == 0 || Math.abs(Instant.now().toEpochMilli() - fuzVar.c) >= fxo.b) ? hti.f(((fxo) this.a).d.a(), gvx.a(new fxn(i)), huf.a) : hnu.aJ(false);
            case 7:
                return ((Boolean) obj).booleanValue() ? ((fxo) this.a).a() : hnu.aJ(null);
            case 8:
                String str3 = (String) obj;
                str3.getClass();
                return ((fym) this.a).c(str3);
            case 9:
                return a.p(this.a, obj);
            case 10:
                return a.p(this.a, obj);
            case 11:
                return a.p(this.a, obj);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return a.p(this.a, obj);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return a.p(this.a, obj);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return a.p(this.a, obj);
            case 15:
                String str4 = (String) obj;
                str4.getClass();
                return ((fym) this.a).c(str4);
            case 16:
                ?? r10 = this.a;
                iwq iwqVar = gjw.m;
                return a.p(r10, obj);
            case 17:
                ?? r102 = this.a;
                iwq iwqVar2 = gjw.m;
                return a.p(r102, obj);
            case 18:
                ?? r103 = this.a;
                iwq iwqVar3 = gjw.m;
                return a.p(r103, obj);
            case 19:
                ?? r104 = this.a;
                iwq iwqVar4 = gjw.m;
                return a.p(r104, obj);
            default:
                ?? r105 = this.a;
                iwq iwqVar5 = gjw.m;
                return a.p(r105, obj);
        }
    }
}
