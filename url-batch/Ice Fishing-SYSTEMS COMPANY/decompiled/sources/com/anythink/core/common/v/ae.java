package com.anythink.core.common.v;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.anythink.core.api.ATAdFilter;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.h.aw;
import com.anythink.core.common.h.bo;
import com.anythink.core.common.h.bp;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.bw;
import com.anythink.core.common.h.ca;
import com.anythink.core.common.w.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    static Random f16818a = new Random();

    /* renamed from: b, reason: collision with root package name */
    private static final String f16819b = "PlacementPrepareUtils";

    public static final bp a(com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar) {
        List<bv> a9;
        List<bv> a10;
        List<bv> c4;
        List<bv> d2;
        List<bv> e6;
        if (lVar == null) {
            return null;
        }
        ATAdRequest a11 = nVar.a();
        if (a11 != null) {
            lVar.a(a11);
        }
        if (nVar.ah()) {
            nVar.aI();
            nVar.Z();
            a9 = new ArrayList<>();
            a10 = com.anythink.core.d.u.a(lVar, lVar.Y());
            c4 = new ArrayList<>();
            d2 = new ArrayList<>();
            e6 = new ArrayList<>();
        } else {
            nVar.aI();
            nVar.Z();
            a9 = a(nVar, lVar, com.anythink.core.d.u.b(lVar));
            nVar.aI();
            nVar.Z();
            a10 = com.anythink.core.d.u.a(lVar);
            c4 = com.anythink.core.d.u.c(lVar);
            com.anythink.core.c.a.a().a(nVar, a9, lVar);
            com.anythink.core.c.a.a().a(nVar, c4, lVar);
            d2 = com.anythink.core.d.u.d(lVar);
            e6 = com.anythink.core.d.u.e(lVar);
        }
        bp bpVar = new bp(lVar, nVar, e6.size() + d2.size() + c4.size() + a10.size() + a9.size());
        bpVar.a(a9);
        bpVar.b(a10);
        bpVar.e(c4);
        bpVar.c(d2);
        bpVar.d(e6);
        b(lVar, bpVar.c(), a9);
        b(lVar, bpVar.c(), a10);
        b(lVar, bpVar.c(), c4);
        b(lVar, bpVar.c(), d2);
        b(lVar, bpVar.c(), e6);
        return bpVar;
    }

    public static void b(bp bpVar, List<bv> list) {
        List<bv> d2 = bpVar.d();
        List<bv> e6 = bpVar.e();
        List<bv> f6 = bpVar.f();
        List<bv> g9 = bpVar.g();
        a(d2, e6, bpVar.c(), list);
        a(d2, f6, bpVar.c(), list);
        a(d2, g9, bpVar.c(), list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e3  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar, List<bv> list) {
        com.anythink.core.common.h.n nVar2;
        int i;
        com.anythink.core.common.h.aj a9;
        int i4;
        String str;
        String str2;
        com.anythink.core.common.h.i c4;
        Boolean b9;
        int i9;
        char c9;
        int i10;
        int i11 = 1;
        ?? r72 = 0;
        Iterator<bv> it = list.iterator();
        while (it.hasNext()) {
            bv next = it.next();
            int U7 = nVar.U();
            com.anythink.core.common.h.n af = nVar.af();
            String aI = nVar.aI();
            aj.a(af, next, r72, r72);
            bo.a a10 = com.anythink.core.a.a.a(com.anythink.core.common.d.t.b().g()).a(aI, next.z(), lVar.aq());
            int i12 = a10 != null ? a10.f13889e : r72;
            int i13 = a10 != null ? a10.f13888d : r72;
            Context g9 = com.anythink.core.common.d.t.b().g();
            Pair<Integer, List<String>> I2 = com.anythink.core.common.d.t.b().I();
            String str3 = "";
            if (I2 != null && ((Integer) I2.first).intValue() == i11) {
                List list2 = (List) I2.second;
                if (list2 != null && !list2.isEmpty()) {
                    if (list2.contains(String.valueOf(next.g()))) {
                        next.h("Filter ad source loading for specified channel id on risky devices.");
                        ab.a(aI, nVar, "Filter ad source loading for specified channel id on risky devices.", next, i12, i13, list2);
                        com.anythink.core.common.u.e.a(af, 28, ErrorCode.getErrorCode(ErrorCode.adSourceLoadRiskError, "", "Filter ad source loading for specified channel id on risky devices."));
                    }
                } else {
                    next.h("Filter ad source loading across all channels on risky devices.");
                    ab.a(aI, nVar, "Filter ad source loading across all channels on risky devices.", next, i12, i13);
                    com.anythink.core.common.u.e.a(af, 27, ErrorCode.getErrorCode(ErrorCode.adSourceLoadRiskError, "", "Filter ad source loading across all channels on risky devices."));
                }
                i = 1;
                next.f();
                it.remove();
                i11 = i;
                r72 = 0;
            }
            AdError a11 = a(1, af, next, (com.anythink.core.common.h.z) null);
            if (a11 != null) {
                String code = a11.getCode();
                code.getClass();
                switch (code.hashCode()) {
                    case 1537309:
                        if (code.equals(ErrorCode.adSourceLoadBidTypeFilterError)) {
                            c9 = 0;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1537310:
                        if (code.equals(ErrorCode.adSourceLoadPriceFilterError)) {
                            c9 = 1;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1537311:
                        if (code.equals(ErrorCode.adSourceLoadUnitFilterError)) {
                            c9 = 2;
                            break;
                        }
                        c9 = 65535;
                        break;
                    default:
                        c9 = 65535;
                        break;
                }
                switch (c9) {
                    case 0:
                        i10 = 29;
                        break;
                    case 1:
                        i10 = 30;
                        break;
                    case 2:
                        i10 = 31;
                        break;
                    default:
                        i10 = 9;
                        break;
                }
                next.h(a11.getPlatformMSG());
                ab.a(aI, nVar, a11.getPlatformMSG(), next, i12, i13);
                com.anythink.core.common.u.e.a(af, i10, a11);
            } else {
                List<String> J = com.anythink.core.common.d.t.b().J();
                com.anythink.core.common.d.t.b();
                if (com.anythink.core.common.d.t.a(J, String.valueOf(next.g()))) {
                    next.h("Forbid network by developer");
                    ab.a(aI, nVar, "Forbid network by developer", next, i12, i13, J);
                    com.anythink.core.common.u.e.a(af, 14, ErrorCode.getErrorCode(ErrorCode.forbidNetworkByDeveloper, "", "Forbid network by developer"));
                } else if (ak.b(next) && com.anythink.core.common.a.i.a(g9).a(next.z())) {
                    next.h("Adx bid Pacing");
                    ab.a(aI, nVar, "Adx bid Pacing", next, i12, i13);
                    com.anythink.core.common.u.e.a(af, 12, ErrorCode.getErrorCode(ErrorCode.inAdxBidInterval, "", "Adx bid Pacing"));
                } else {
                    int a12 = com.anythink.core.a.a.a(g9).a(aI, next, lVar.aq());
                    if (a12 != -1) {
                        next.g(-5);
                        next.h("Out of Cap");
                        ab.a(aI, nVar, "Out of Cap", next, i12, i13);
                        switch (a12) {
                            case 8:
                                i9 = 19;
                                break;
                            case 9:
                                i9 = 20;
                                break;
                            case 10:
                                i9 = 21;
                                break;
                            case 11:
                                i9 = 22;
                                break;
                            default:
                                i9 = 2;
                                break;
                        }
                        com.anythink.core.common.u.e.a(af, i9, ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", "Out of Cap"));
                    } else {
                        com.anythink.core.a.d.a();
                        int a13 = com.anythink.core.a.d.a(aI, next);
                        if (a13 != -1) {
                            next.g(-6);
                            next.h("Out of Pacing");
                            ab.a(aI, nVar, "Out of Pacing", next, i12, i13);
                            com.anythink.core.common.u.e.a(af, a13 != 12 ? a13 != 13 ? 3 : 24 : 23, ErrorCode.getErrorCode(ErrorCode.inPacingError, "", "Out of Pacing"));
                        } else if (com.anythink.core.common.c.a().a(next)) {
                            next.g(-6);
                            next.h("Request fail in pacing");
                            ab.a(aI, nVar, "Request fail in pacing", next, i12, i13);
                            com.anythink.core.common.u.e.a(af, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Request fail in pacing"));
                        } else {
                            List<String> m8 = com.anythink.core.common.d.t.b().m(aI);
                            if (m8 != null && m8.contains(next.z())) {
                                next.g(-8);
                                next.h("Request fail in filter list");
                                ab.a(aI, nVar, "Request fail in filter list", next, i12, i13, m8);
                                com.anythink.core.common.u.e.a(af, 5, ErrorCode.getErrorCode(ErrorCode.filterSourceError, "", "Request fail in filter list"));
                            } else {
                                List<String> n9 = com.anythink.core.common.d.t.b().n(aI);
                                if (n9 != null && n9.contains(String.valueOf(next.g()))) {
                                    next.g(-8);
                                    next.h("Filter by network firm id.");
                                    ab.a(aI, nVar, "Filter by network firm id.", next, i12, i13, n9);
                                    com.anythink.core.common.u.e.a(af, 9, ErrorCode.getErrorCode(ErrorCode.networkFirmIdFilterSourceError, "", "Filter by network firm id."));
                                } else {
                                    if (next.o()) {
                                        if (ak.b(next) && (b9 = com.anythink.core.common.a.i.a(g9).b(next.z())) != null) {
                                            if (b9.booleanValue()) {
                                                next.h("Adx bid fail in pacing");
                                                ab.a(aI, nVar, "Bid fail in pacing", next, i12, i13);
                                                com.anythink.core.common.u.e.a(af, 13, ErrorCode.getErrorCode(ErrorCode.inAdxBidFailedInterval, "", "Adx Bid fail in pacing"));
                                            }
                                            if (next.ad() != 1) {
                                            }
                                        } else {
                                            if (com.anythink.core.common.c.a().b(next)) {
                                                next.g(-7);
                                                next.h("Bid fail in pacing");
                                                ab.a(aI, nVar, "Bid fail in pacing", next, i12, i13);
                                                com.anythink.core.common.u.e.a(af, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                                            }
                                            if (next.ad() != 1) {
                                                if (next.q() == 2 && (c4 = com.anythink.core.common.u.a().c(aI)) != null && c4.a(next)) {
                                                    next.g(-7);
                                                    next.h("Can't Load On Showing");
                                                    ab.a(aI, nVar, "Can't Load On Showing", next, i12, i13);
                                                    com.anythink.core.common.u.e.a(nVar, 7, ErrorCode.getErrorCode(ErrorCode.loadInShowingFilter, "", "Can't Load On Showing"));
                                                } else {
                                                    nVar2 = nVar;
                                                    if (!com.anythink.core.common.c.a().a(U7, lVar, next)) {
                                                        next.g(-8);
                                                        next.h("Error Code Request fail in pacing");
                                                        ab.a(aI, nVar2, "Error Code Request fail in pacing", next, i12, i13);
                                                        com.anythink.core.common.u.e.a(af, 10, ErrorCode.getErrorCode(ErrorCode.inNetworkErrorCodeRequestFailPacing, "", "Error Code Request fail in pacing"));
                                                        i = 1;
                                                    } else {
                                                        if (U7 != 0) {
                                                            i = 1;
                                                            if (next.aJ() == 1) {
                                                                next.h("System splash not allow preload");
                                                                ab.a(aI, nVar, "System splash not allow preload", next, i12, i13);
                                                                com.anythink.core.common.u.e.a(af, 11, ErrorCode.getErrorCode(ErrorCode.filterByRefreshSystemSplash, ErrorCode.filterByRefreshSystemSplash, "System splash not allow preload"));
                                                            }
                                                        } else {
                                                            i = 1;
                                                        }
                                                        int a14 = com.anythink.core.a.c.a().a(g9, next, aI, lVar.aq());
                                                        if (a14 != -1) {
                                                            next.h("The adSource load too many times within the specified time period.");
                                                            ab.a(aI, nVar, "The adSource load too many times within the specified time period.", next, i12, i13);
                                                            com.anythink.core.common.u.e.a(af, a14, ErrorCode.getErrorCode(ErrorCode.adSourceLoadCappingError, "", "The adSource load too many times within the specified time period."));
                                                        } else {
                                                            com.anythink.core.a.c.a();
                                                            com.anythink.core.common.h.k a15 = com.anythink.core.a.c.a(g9, next);
                                                            if (a15 != null) {
                                                                AdError b10 = a15.b();
                                                                if (b10 != null) {
                                                                    str3 = b10.getDesc();
                                                                }
                                                                String str4 = str3;
                                                                next.h(str4);
                                                                ab.a(aI, nVar, str4, next, i12, i13);
                                                                com.anythink.core.common.u.e.a(af, a15.a(), b10);
                                                            } else {
                                                                com.anythink.core.common.w.a.b.c cVar = (com.anythink.core.common.w.a.b.c) com.anythink.core.common.w.a.a.d.a(aI, com.anythink.core.common.w.a.b.c.class);
                                                                if (cVar != null && (a9 = cVar.a(next)) != null) {
                                                                    if (a9.d() == a.C0102a.f17138b) {
                                                                        i4 = 16;
                                                                        str = ErrorCode.filterByMNErrorCodeReqLimit;
                                                                        str2 = "AD platform's error code strategy limit1";
                                                                    } else {
                                                                        i4 = 17;
                                                                        str = ErrorCode.filterByMatchNetworkErrorCode;
                                                                        str2 = "AD platform's error code strategy limit2";
                                                                    }
                                                                    String str5 = str2;
                                                                    next.h(str5);
                                                                    ab.a(aI, nVar, str5, next, i12, i13);
                                                                    com.anythink.core.common.u.e.a(af, i4, ErrorCode.getErrorCode(str, str, str5));
                                                                }
                                                                i11 = i;
                                                                r72 = 0;
                                                            }
                                                        }
                                                        next.f();
                                                        it.remove();
                                                        i11 = i;
                                                        r72 = 0;
                                                    }
                                                    next.f();
                                                    it.remove();
                                                    i11 = i;
                                                    r72 = 0;
                                                }
                                            }
                                        }
                                    }
                                    nVar2 = nVar;
                                    if (!com.anythink.core.common.c.a().a(U7, lVar, next)) {
                                    }
                                    next.f();
                                    it.remove();
                                    i11 = i;
                                    r72 = 0;
                                }
                            }
                        }
                    }
                }
            }
            i = 1;
            next.f();
            it.remove();
            i11 = i;
            r72 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x012e, code lost:
    
        r16.aI();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List<bv> a(com.anythink.core.common.h.n nVar, com.anythink.core.d.l lVar, List<bv> list) {
        if (com.anythink.core.common.d.t.b().z()) {
            nVar.aI();
            return list;
        }
        if (nVar.U() == 9 && lVar.bg() && lVar.bh()) {
            nVar.aI();
            return list;
        }
        com.anythink.core.d.f j9 = lVar.j();
        if (j9 == null) {
            nVar.aI();
            return list;
        }
        if (list.size() <= j9.f()) {
            nVar.aI();
            return list;
        }
        com.anythink.core.c.a.d a9 = com.anythink.core.c.b.a().a(nVar.aI(), lVar, j9);
        if (a9 != null) {
            double d2 = a9.f12187a;
            if (d2 > 0.0d) {
                nVar.aI();
                a9.toString();
                double e6 = j9.e() * d2;
                if (p.a(list.get(0)) <= e6) {
                    nVar.aI();
                    return list;
                }
                int size = list.size() - 1;
                int size2 = list.size() - 1;
                HashMap hashMap = new HashMap();
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    double a10 = p.a(list.get(i));
                    if (!hashMap.containsKey(String.valueOf(a10))) {
                        hashMap.put(String.valueOf(a10), Integer.valueOf(i));
                    }
                    if (size2 == list.size() - 1) {
                        if (a10 == d2) {
                            size2 = i - j9.f();
                            nVar.aI();
                        } else if (a10 < d2) {
                            if (i > 0) {
                                size2 = ((Integer) hashMap.get(String.valueOf(p.a(list.get(i - 1))))).intValue() - j9.f();
                                nVar.aI();
                            } else {
                                size2 = i - j9.f();
                                nVar.aI();
                            }
                        }
                    }
                    if (size == list.size() - 1) {
                        if (a10 == e6) {
                            nVar.aI();
                            size = i;
                        } else if (a10 < e6) {
                            size = i - 1;
                            nVar.aI();
                        }
                    }
                    if (size <= 0 || size2 <= 0) {
                        break;
                    }
                    if (size < list.size() - 1 && size2 < list.size() - 1) {
                        nVar.aI();
                        break;
                    }
                    i++;
                }
                int min = Math.min(size, size2);
                nVar.aI();
                if (min <= 0) {
                    nVar.aI();
                    return list;
                }
                bv bvVar = list.get(min);
                double a11 = p.a(bvVar);
                String z8 = bvVar.z();
                Integer num = (Integer) hashMap.get(String.valueOf(a11));
                if (num != null) {
                    min = num.intValue();
                    z8 = list.get(min).z();
                }
                nVar.aI();
                nVar.aI();
                List<bv> subList = list.subList(min, list.size());
                int[] g9 = j9.g();
                if (g9 != null && g9.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    List<bv> subList2 = list.subList(0, min);
                    for (int i4 = 0; i4 < subList2.size(); i4++) {
                        bv bvVar2 = subList2.get(i4);
                        if (a(g9, bvVar2.g())) {
                            arrayList.add(bvVar2);
                        }
                    }
                    if (arrayList.size() > 0) {
                        subList.addAll(0, arrayList);
                    }
                }
                com.anythink.core.common.u.e.a(nVar, j9, a9.f12188b, d2, z8, a11, j9.h());
                return subList;
            }
        }
        nVar.aI();
        return list;
    }

    private static boolean a(int[] iArr, int i) {
        for (int i4 : iArr) {
            if (i4 == i) {
                return true;
            }
        }
        return false;
    }

    public static List<bv> a(final bp bpVar, List<bv> list) {
        return p.a(list, new com.anythink.core.common.k.f() { // from class: com.anythink.core.common.v.ae.1
            @Override // com.anythink.core.common.k.f
            public final void a(bv bvVar, int i, int i4) {
                bvVar.H(i);
                if (i4 >= 0) {
                    bvVar.G(i4);
                    bw a9 = com.anythink.core.common.a.a().a(bp.this.c().aI(), bvVar);
                    if (a9 != null) {
                        a9.b(bvVar.aw());
                    }
                }
            }
        });
    }

    private static void a(List<bv> list, List<bv> list2, com.anythink.core.common.h.n nVar, List<bv> list3) {
        String aI = nVar.aI();
        if (list == null || list2 == null) {
            return;
        }
        boolean z8 = false;
        for (int size = list2.size() - 1; size >= 0; size--) {
            bv bvVar = list2.get(size);
            if (bvVar.an()) {
                list3.add(bvVar);
            }
            if (!a(aI, bvVar)) {
                bw a9 = com.anythink.core.common.a.a().a(aI, bvVar);
                bv bvVar2 = null;
                com.anythink.core.common.h.c a10 = a9 != null ? a9.a((com.anythink.core.common.h.ad) null).a() : null;
                if (a10 != null) {
                    bvVar.a(a10.e().getUnitGroupInfo(), 0, 3, 1);
                    p.a(bvVar);
                    bvVar.toString();
                    bvVar2 = bvVar;
                }
                if (bvVar2 == null) {
                    try {
                        com.anythink.core.common.h.ad a11 = com.anythink.core.b.f.a().a(aI, bvVar);
                        if (a11 != null && !a11.a()) {
                            bvVar.a(a11, 0, 2, 1);
                            bvVar2 = bvVar;
                        } else if (a11 != null) {
                            com.anythink.core.b.d.c.a(a11, new aw(1, bvVar, nVar), true, 25);
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (bvVar2 != null) {
                    try {
                        if (bvVar.q() == 7) {
                            z8 = true;
                        }
                        list2.remove(size);
                        p.a(list, bvVar);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        if (z8) {
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                if (list2.get(size2).q() == 7) {
                    list2.remove(size2);
                }
            }
        }
    }

    public static void a(com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar, List<bv> list) {
        int i;
        Iterator<bv> it = list.iterator();
        while (it.hasNext()) {
            bv next = it.next();
            com.anythink.core.common.h.n af = nVar.af();
            String aI = nVar.aI();
            aj.a(af, next, 0, false);
            bo.a a9 = com.anythink.core.a.a.a(com.anythink.core.common.d.t.b().g()).a(aI, next.z(), lVar.aq());
            int i4 = a9 != null ? a9.f13889e : 0;
            int i9 = a9 != null ? a9.f13888d : 0;
            AdError a10 = a(0, af, next, (com.anythink.core.common.h.z) null);
            if (a10 != null) {
                String code = a10.getCode();
                code.getClass();
                switch (code) {
                    case "2032":
                        i = 29;
                        break;
                    case "2033":
                        i = 30;
                        break;
                    case "2034":
                        i = 31;
                        break;
                    default:
                        i = 9;
                        break;
                }
                int i10 = i;
                next.h(a10.getPlatformMSG());
                com.anythink.core.common.h.n nVar2 = nVar;
                ab.a(aI, nVar2, a10.getPlatformMSG(), next, i4, i9);
                com.anythink.core.common.u.e.a(af, i10, a10);
                next.f();
                it.remove();
                nVar = nVar2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r4.equals(com.anythink.core.api.ErrorCode.adSourceLoadBidTypeFilterError) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean a(com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar, bv bvVar) {
        int i;
        com.anythink.core.common.h.n af = nVar.af();
        String aI = nVar.aI();
        char c4 = 0;
        aj.a(af, bvVar, 0, false);
        bo.a a9 = com.anythink.core.a.a.a(com.anythink.core.common.d.t.b().g()).a(aI, bvVar.z(), lVar.aq());
        int i4 = a9 != null ? a9.f13889e : 0;
        int i9 = a9 != null ? a9.f13888d : 0;
        AdError a10 = a(0, af, bvVar, (com.anythink.core.common.h.z) null);
        if (a10 == null) {
            return false;
        }
        String code = a10.getCode();
        code.getClass();
        switch (code.hashCode()) {
            case 1537309:
                break;
            case 1537310:
                if (code.equals(ErrorCode.adSourceLoadPriceFilterError)) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 1537311:
                if (code.equals(ErrorCode.adSourceLoadUnitFilterError)) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                i = 29;
                break;
            case 1:
                i = 30;
                break;
            case 2:
                i = 31;
                break;
            default:
                i = 9;
                break;
        }
        int i10 = i;
        bvVar.h(a10.getPlatformMSG());
        ab.a(aI, nVar, a10.getPlatformMSG(), bvVar, i4, i9);
        com.anythink.core.common.u.e.a(af, i10, a10);
        return true;
    }

    public static AdError a(int i, com.anythink.core.common.h.n nVar, bv bvVar, com.anythink.core.common.h.z zVar) {
        Map<String, ATAdFilter> aa;
        ATAdFilter aTAdFilter;
        if (nVar == null || bvVar == null || (aa = com.anythink.core.common.d.t.b().aa()) == null || aa.isEmpty() || (aTAdFilter = aa.get(nVar.aI())) == null) {
            return null;
        }
        int e6 = p.e(bvVar.d());
        String a9 = ak.a(bvVar, (ATBaseAdAdapter) null);
        double a10 = p.a(bvVar);
        if (zVar != null) {
            a10 = zVar.getSortPrice();
        }
        return aTAdFilter.doFilter(new ca(i, String.valueOf(bvVar.g()), String.valueOf(e6), a10, a9));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(int i, com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar, bv bvVar) {
        boolean z8;
        com.anythink.core.common.h.aj a9;
        int i4;
        String str;
        String str2;
        com.anythink.core.common.h.i c4;
        Boolean b9;
        int i9;
        char c9;
        int i10;
        com.anythink.core.common.h.n af = nVar.af();
        String aI = nVar.aI();
        aj.a(af, bvVar, 0, false);
        bo.a a10 = com.anythink.core.a.a.a(com.anythink.core.common.d.t.b().g()).a(aI, bvVar.z(), lVar.aq());
        int i11 = a10 != null ? a10.f13889e : 0;
        int i12 = a10 != null ? a10.f13888d : 0;
        Context g9 = com.anythink.core.common.d.t.b().g();
        Pair<Integer, List<String>> I2 = com.anythink.core.common.d.t.b().I();
        String str3 = "";
        if (I2 != null && ((Integer) I2.first).intValue() == 1) {
            List list = (List) I2.second;
            if (list != null && !list.isEmpty()) {
                if (list.contains(String.valueOf(bvVar.g()))) {
                    bvVar.h("Filter ad source loading for specified channel id on risky devices.");
                    ab.a(aI, nVar, "Filter ad source loading for specified channel id on risky devices.", bvVar, i11, i12, list);
                    com.anythink.core.common.u.e.a(af, 28, ErrorCode.getErrorCode(ErrorCode.adSourceLoadRiskError, "", "Filter ad source loading for specified channel id on risky devices."));
                    return true;
                }
            } else {
                bvVar.h("Filter ad source loading across all channels on risky devices.");
                ab.a(aI, nVar, "Filter ad source loading across all channels on risky devices.", bvVar, i11, i12);
                com.anythink.core.common.u.e.a(af, 27, ErrorCode.getErrorCode(ErrorCode.adSourceLoadRiskError, "", "Filter ad source loading across all channels on risky devices."));
                return true;
            }
        }
        int i13 = i11;
        AdError a11 = a(1, af, bvVar, (com.anythink.core.common.h.z) null);
        if (a11 != null) {
            String code = a11.getCode();
            code.getClass();
            switch (code.hashCode()) {
                case 1537309:
                    if (code.equals(ErrorCode.adSourceLoadBidTypeFilterError)) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1537310:
                    if (code.equals(ErrorCode.adSourceLoadPriceFilterError)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1537311:
                    if (code.equals(ErrorCode.adSourceLoadUnitFilterError)) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                    i10 = 29;
                    break;
                case 1:
                    i10 = 30;
                    break;
                case 2:
                    i10 = 31;
                    break;
                default:
                    i10 = 9;
                    break;
            }
            bvVar.h(a11.getPlatformMSG());
            ab.a(aI, nVar, a11.getPlatformMSG(), bvVar, i13, i12);
            com.anythink.core.common.u.e.a(af, i10, a11);
            return true;
        }
        List<String> J = com.anythink.core.common.d.t.b().J();
        com.anythink.core.common.d.t.b();
        if (com.anythink.core.common.d.t.a(J, String.valueOf(bvVar.g()))) {
            bvVar.h("Forbid network by developer");
            ab.a(aI, nVar, "Forbid network by developer", bvVar, i13, i12, J);
            com.anythink.core.common.u.e.a(af, 14, ErrorCode.getErrorCode(ErrorCode.forbidNetworkByDeveloper, "", "Forbid network by developer"));
            return true;
        }
        if (ak.b(bvVar)) {
            z8 = 1;
            if (com.anythink.core.common.a.i.a(g9).a(bvVar.z())) {
                bvVar.h("Adx bid Pacing");
                ab.a(aI, nVar, "Adx bid Pacing", bvVar, i13, i12);
                com.anythink.core.common.u.e.a(af, 12, ErrorCode.getErrorCode(ErrorCode.inAdxBidInterval, "", "Adx bid Pacing"));
                return true;
            }
        } else {
            z8 = 1;
        }
        int a12 = com.anythink.core.a.a.a(g9).a(aI, bvVar, lVar.aq());
        if (a12 != -1) {
            bvVar.g(-5);
            bvVar.h("Out of Cap");
            ab.a(aI, nVar, "Out of Cap", bvVar, i13, i12);
            switch (a12) {
                case 8:
                    i9 = 19;
                    break;
                case 9:
                    i9 = 20;
                    break;
                case 10:
                    i9 = 21;
                    break;
                case 11:
                    i9 = 22;
                    break;
                default:
                    i9 = 2;
                    break;
            }
            com.anythink.core.common.u.e.a(af, i9, ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", "Out of Cap"));
            return z8;
        }
        com.anythink.core.a.d.a();
        int a13 = com.anythink.core.a.d.a(aI, bvVar);
        if (a13 != -1) {
            bvVar.g(-6);
            bvVar.h("Out of Pacing");
            ab.a(aI, nVar, "Out of Pacing", bvVar, i13, i12);
            com.anythink.core.common.u.e.a(af, a13 != 12 ? a13 != 13 ? 3 : 24 : 23, ErrorCode.getErrorCode(ErrorCode.inPacingError, "", "Out of Pacing"));
            return z8;
        }
        if (com.anythink.core.common.c.a().a(bvVar)) {
            bvVar.g(-6);
            bvVar.h("Request fail in pacing");
            ab.a(aI, nVar, "Request fail in pacing", bvVar, i13, i12);
            com.anythink.core.common.u.e.a(af, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Request fail in pacing"));
            return z8;
        }
        List<String> m8 = com.anythink.core.common.d.t.b().m(aI);
        if (m8 != null && m8.contains(bvVar.z())) {
            bvVar.g(-8);
            bvVar.h("Request fail in filter list");
            ab.a(aI, nVar, "Request fail in filter list", bvVar, i13, i12, m8);
            com.anythink.core.common.u.e.a(af, 5, ErrorCode.getErrorCode(ErrorCode.filterSourceError, "", "Request fail in filter list"));
            return z8;
        }
        List<String> n9 = com.anythink.core.common.d.t.b().n(aI);
        if (n9 != null && n9.contains(String.valueOf(bvVar.g()))) {
            bvVar.g(-8);
            bvVar.h("Filter by network firm id.");
            ab.a(aI, nVar, "Filter by network firm id.", bvVar, i13, i12, n9);
            com.anythink.core.common.u.e.a(af, 9, ErrorCode.getErrorCode(ErrorCode.networkFirmIdFilterSourceError, "", "Filter by network firm id."));
            return z8;
        }
        if (bvVar.o()) {
            if (ak.b(bvVar) && (b9 = com.anythink.core.common.a.i.a(g9).b(bvVar.z())) != null) {
                if (b9.booleanValue()) {
                    bvVar.h("Adx bid fail in pacing");
                    ab.a(aI, nVar, "Bid fail in pacing", bvVar, i13, i12);
                    com.anythink.core.common.u.e.a(af, 13, ErrorCode.getErrorCode(ErrorCode.inAdxBidFailedInterval, "", "Adx Bid fail in pacing"));
                    return z8;
                }
            } else if (com.anythink.core.common.c.a().b(bvVar)) {
                bvVar.g(-7);
                bvVar.h("Bid fail in pacing");
                ab.a(aI, nVar, "Bid fail in pacing", bvVar, i13, i12);
                com.anythink.core.common.u.e.a(af, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                return z8;
            }
            if (bvVar.ad() != z8 && bvVar.q() == 2 && (c4 = com.anythink.core.common.u.a().c(aI)) != null && c4.a(bvVar)) {
                bvVar.g(-7);
                bvVar.h("Can't Load On Showing");
                ab.a(aI, nVar, "Can't Load On Showing", bvVar, i13, i12);
                com.anythink.core.common.u.e.a(nVar, 7, ErrorCode.getErrorCode(ErrorCode.loadInShowingFilter, "", "Can't Load On Showing"));
                return true;
            }
        }
        if (com.anythink.core.common.c.a().a(i, lVar, bvVar)) {
            bvVar.g(-8);
            bvVar.h("Error Code Request fail in pacing");
            ab.a(aI, nVar, "Error Code Request fail in pacing", bvVar, i13, i12);
            com.anythink.core.common.u.e.a(af, 10, ErrorCode.getErrorCode(ErrorCode.inNetworkErrorCodeRequestFailPacing, "", "Error Code Request fail in pacing"));
            return true;
        }
        if (i != 0 && bvVar.aJ() == 1) {
            bvVar.h("System splash not allow preload");
            ab.a(aI, nVar, "System splash not allow preload", bvVar, i13, i12);
            com.anythink.core.common.u.e.a(af, 11, ErrorCode.getErrorCode(ErrorCode.filterByRefreshSystemSplash, ErrorCode.filterByRefreshSystemSplash, "System splash not allow preload"));
            return true;
        }
        int a14 = com.anythink.core.a.c.a().a(g9, bvVar, aI, lVar.aq());
        if (a14 != -1) {
            bvVar.h("The adSource load too many times within the specified time period.");
            ab.a(aI, nVar, "The adSource load too many times within the specified time period.", bvVar, i13, i12);
            com.anythink.core.common.u.e.a(af, a14, ErrorCode.getErrorCode(ErrorCode.adSourceLoadCappingError, "", "The adSource load too many times within the specified time period."));
            return true;
        }
        com.anythink.core.a.c.a();
        com.anythink.core.common.h.k a15 = com.anythink.core.a.c.a(g9, bvVar);
        if (a15 != null) {
            AdError b10 = a15.b();
            if (b10 != null) {
                str3 = b10.getDesc();
            }
            String str4 = str3;
            bvVar.h(str4);
            ab.a(aI, nVar, str4, bvVar, i13, i12);
            com.anythink.core.common.u.e.a(af, a15.a(), b10);
            return true;
        }
        com.anythink.core.common.w.a.b.c cVar = (com.anythink.core.common.w.a.b.c) com.anythink.core.common.w.a.a.d.a(aI, com.anythink.core.common.w.a.b.c.class);
        if (cVar == null || (a9 = cVar.a(bvVar)) == null) {
            return false;
        }
        if (a9.d() == a.C0102a.f17138b) {
            i4 = 16;
            str = ErrorCode.filterByMNErrorCodeReqLimit;
            str2 = "AD platform's error code strategy limit1";
        } else {
            i4 = 17;
            str = ErrorCode.filterByMatchNetworkErrorCode;
            str2 = "AD platform's error code strategy limit2";
        }
        String str5 = str;
        String str6 = str2;
        int i14 = i4;
        bvVar.h(str6);
        ab.a(aI, nVar, str6, bvVar, i13, i12);
        com.anythink.core.common.u.e.a(af, i14, ErrorCode.getErrorCode(str5, str5, str6));
        return true;
    }

    private static boolean a(String str, bv bvVar) {
        com.anythink.core.common.h.c a9;
        if (ak.b(bvVar)) {
            com.anythink.core.common.h.ad a10 = com.anythink.core.b.f.a().a(str, bvVar);
            if (a10 != null && !a10.a() && a10.s()) {
                return false;
            }
            bw a11 = com.anythink.core.common.a.a().a(str, bvVar);
            if (a11 != null && (a9 = a11.a((com.anythink.core.common.h.ad) null).a()) != null && a9.e() != null && a9.e().getUnitGroupInfo() != null && TextUtils.equals(a9.e().getUnitGroupInfo().z(), bvVar.z()) && a9.e().getUnitGroupInfo().br()) {
                return false;
            }
            Boolean a12 = com.anythink.core.common.a.i.a(com.anythink.core.common.d.t.b().g()).a(bvVar);
            if (a12 != null) {
                return a12.booleanValue();
            }
        }
        return bvVar.r() == 2;
    }
}
