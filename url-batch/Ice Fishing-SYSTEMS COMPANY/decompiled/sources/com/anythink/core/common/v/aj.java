package com.anythink.core.common.v;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.ap;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.h.bo;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.cb;
import com.anythink.core.d.l;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aj {
    public static com.anythink.core.common.h.n a(String str, String str2, com.anythink.core.d.l lVar, int i, int i4, Map<String, Object> map, com.anythink.core.common.h.d dVar, int i9, ATAdRequest aTAdRequest) {
        com.anythink.core.common.h.n nVar = new com.anythink.core.common.h.n();
        nVar.I(str2);
        nVar.J(str);
        nVar.C(i);
        nVar.D(i);
        nVar.E(com.anythink.core.common.u.a().e(str2) ? 1 : 2);
        nVar.f14183u = 0;
        nVar.f14182t = 2;
        nVar.f14184v = 0;
        a(nVar, lVar);
        nVar.aD();
        nVar.an(com.anythink.core.common.d.t.b().j());
        nVar.ao(i4);
        if (lVar != null) {
            nVar.al(lVar.p());
        } else {
            nVar.al(2);
        }
        a(map, nVar);
        nVar.a(dVar);
        nVar.c(ATAdxSetting.getInstance().isAdxNetworkMode(str2));
        nVar.ad(i9);
        nVar.a(aTAdRequest);
        return nVar;
    }

    public static void a(Map<String, Object> map, com.anythink.core.common.h.n nVar) {
        if (map != null) {
            Object obj = map.get(ATAdConst.KEY.CP_PLACEMENT_ID);
            if (obj != null) {
                nVar.F(obj.toString());
            }
            Object obj2 = map.get(ATAdConst.KEY.CP_LOAD_MODE);
            if (obj2 instanceof Integer) {
                nVar.am(Integer.parseInt(obj2.toString()));
            }
            Object obj3 = map.get(com.anythink.core.common.e.f13040b);
            if (obj3 != null) {
                nVar.a(obj3);
            }
            JSONObject a9 = ai.a(map);
            if (a9 != null) {
                nVar.a(a9);
            }
        }
    }

    public static void a(String str, com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar) {
        if (lVar == null || nVar == null) {
            return;
        }
        com.anythink.core.common.h.d dVar = new com.anythink.core.common.h.d();
        dVar.a(str, lVar.ay(), lVar.ai());
        nVar.a(dVar);
    }

    public static void a(String str, com.anythink.core.common.h.n nVar) {
        com.anythink.core.d.l a9;
        if (nVar == null || (a9 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(str)) == null || !a9.bm()) {
            return;
        }
        a(str, a9, nVar);
    }

    public static com.anythink.core.common.h.n a(ATBaseAdAdapter aTBaseAdAdapter, com.anythink.core.common.h.n nVar, bv bvVar) {
        com.anythink.core.common.h.ad R8 = bvVar.R();
        if (R8 != null) {
            nVar.l(bvVar.aQ());
            nVar.m(R8.originPrice);
        }
        aTBaseAdAdapter.setUnitGroupInfo(bvVar);
        aTBaseAdAdapter.setRefresh(nVar.U() == 1);
        try {
            nVar.f14186x = aTBaseAdAdapter.getInternalNetworkSDKVersion();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(nVar.aF())) {
            nVar.G(aTBaseAdAdapter.getInternalNetworkName());
        }
        nVar.k(aTBaseAdAdapter.getClass().getName());
        aTBaseAdAdapter.setTrackingInfo(nVar);
        return nVar;
    }

    public static void a(com.anythink.core.common.h.n nVar, bv bvVar, int i, boolean z8) {
        com.anythink.core.common.h.ad R8;
        ay b9;
        String str;
        bo.a a9 = z8 ? com.anythink.core.a.a.a(com.anythink.core.common.d.t.b().g()).a(nVar.aI(), bvVar.z(), Integer.parseInt(nVar.aK())) : null;
        nVar.j(bvVar.d());
        nVar.i(bvVar.q());
        nVar.F(bvVar.g());
        nVar.r(bvVar.z());
        nVar.u(bvVar.I());
        nVar.v(bvVar.J());
        nVar.m(bvVar.aa());
        nVar.x(i);
        nVar.t(bvVar.k());
        nVar.z(a9 != null ? a9.f13889e : 0);
        nVar.A(a9 != null ? a9.f13888d : 0);
        if (bvVar.Q()) {
            nVar.j(bvVar.D());
            nVar.f(bvVar.at());
            nVar.k(bvVar.c());
        } else {
            nVar.j(0.0d);
            nVar.f(0.0d);
            nVar.k(0.0d);
        }
        nVar.a(bvVar.aA());
        if (bvVar.o()) {
            if (bvVar.ab() != 2) {
                com.anythink.core.common.h.ad R9 = bvVar.R();
                if (R9 == null) {
                    str = "";
                } else if (R9.t() == 3) {
                    str = "ecpm_api";
                } else {
                    str = R9.f13591q;
                }
                if (TextUtils.isEmpty(str)) {
                    str = "exact";
                }
                nVar.o(str);
                if (!bvVar.an()) {
                    nVar.g(nVar.u() * bvVar.D());
                    nVar.h(bvVar.c());
                } else if (R9 != null) {
                    nVar.g(nVar.u() * R9.f13589o);
                    nVar.h(R9.getRmbPrice());
                }
            }
            nVar.c(nVar.u() * bvVar.ar());
        } else {
            nVar.g(bvVar.O());
            nVar.h(bvVar.c());
            String L8 = bvVar.L();
            if (TextUtils.isEmpty(L8)) {
                L8 = "publisher_defined";
            }
            nVar.o(L8);
        }
        nVar.w(bvVar.n());
        nVar.l(bvVar.E());
        nVar.aP = bvVar.A();
        nVar.aQ = bvVar.B();
        nVar.aR = bvVar.C();
        nVar.s(bvVar.K());
        nVar.l(bvVar.ab());
        try {
            Map<String, Object> l9 = bvVar.l();
            JSONObject jSONObject = new JSONObject();
            if (35 == bvVar.g()) {
                String a10 = q.a(l9, "my_oid");
                com.anythink.core.d.l a11 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(nVar.aI());
                if (a11 != null && (b9 = a11.b(a10)) != null) {
                    jSONObject.put("o_id", a10);
                    jSONObject.put(l.a.aE, b9.w());
                }
            }
            if ("0".equals(nVar.aK()) && (3 == bvVar.q() || 7 == bvVar.q())) {
                String a12 = q.a(l9, "layout_type");
                if (TextUtils.isEmpty(a12) || a12.equals("0")) {
                    a12 = "2";
                }
                jSONObject.put("tpl_type", a12);
            }
            if (28 == bvVar.g()) {
                com.anythink.core.common.h.ad R10 = bvVar.R();
                if (R10 != null) {
                    jSONObject.put("origin_price", R10.originPrice);
                }
            } else if (22 == bvVar.g() && (R8 = bvVar.R()) != null) {
                jSONObject.put("en_p", R8.getExtra());
            }
            nVar.v(jSONObject.toString());
            nVar.X(q.a(l9, j.w.f12765E, 0));
            nVar.Y(q.a(l9, j.w.f12766F, 0));
        } catch (Throwable unused) {
        }
        com.anythink.core.common.h.ad R11 = bvVar.R();
        nVar.f(R11 != null ? R11.f13582g : "");
        nVar.H(bvVar.ae());
        nVar.G(bvVar.h());
        nVar.d(bvVar.aM());
        ap aW = bvVar.aW();
        if (aW != null) {
            nVar.g(aW.b());
            nVar.h(aW.f());
            if (bvVar.aU()) {
                nVar.n(aW.e());
            } else {
                nVar.n(aW.d());
            }
            nVar.i(aW.a());
            bvVar.z();
        }
        nVar.a(bvVar.bb());
        nVar.ae(bvVar.az());
        nVar.af(bvVar.bd());
        nVar.n(bvVar.bp());
        nVar.v(bvVar.bq());
        if (R11 != null) {
            if (R11.t() > 0) {
                nVar.B(R11.u());
            }
            nVar.C(R11.v());
            nVar.D(R11.x());
            nVar.L(R11.getOriginRequestId());
        }
        nVar.ak(bvVar.al());
    }

    public static void a(com.anythink.core.common.h.n nVar, com.anythink.core.d.l lVar) {
        if (nVar == null || lVar == null) {
            return;
        }
        if (lVar.aq() == Integer.parseInt("1")) {
            nVar.u("1");
        } else {
            nVar.u("0");
        }
        nVar.ap(lVar.ai());
        nVar.H(lVar.an());
        nVar.G(lVar.ay());
        nVar.K(String.valueOf(lVar.aq()));
        nVar.p(lVar.ae());
        nVar.q(lVar.ad());
        nVar.i(lVar.T());
        nVar.j(lVar.U());
        nVar.c(lVar.ac());
        nVar.a(lVar.af());
        nVar.d(lVar.ag());
        nVar.g(lVar.G());
        nVar.h(lVar.H());
        nVar.E(lVar.A());
        JSONObject aQ = lVar.aQ();
        if (aQ != null) {
            nVar.b(aQ);
        }
        nVar.al(lVar.p());
        if (com.anythink.core.common.w.a().a(nVar.aI())) {
            nVar.f(2);
        } else {
            nVar.f(1);
        }
        nVar.Q(lVar.bd());
        nVar.aj(lVar.bC());
    }

    private static void a(com.anythink.core.common.h.n nVar, cb cbVar) {
        if (nVar != null) {
            nVar.g(cbVar.e());
            nVar.h(cbVar.f());
        }
    }

    public static void a(Context context, com.anythink.core.common.h.n nVar) {
        System.currentTimeMillis();
        int parseInt = Integer.parseInt(nVar.aK());
        int[] a9 = com.anythink.core.a.a.a(context).a(Integer.parseInt(nVar.aK()));
        int i = a9[0];
        int i4 = a9[1];
        bo a10 = com.anythink.core.a.a.a(context).a(nVar.aI(), parseInt);
        nVar.o(i + 1);
        nVar.p(i4 + 1);
        nVar.q((a10 != null ? a10.f13879c : 0) + 1);
        nVar.r((a10 != null ? a10.f13880d : 0) + 1);
        System.currentTimeMillis();
    }

    private static void a(com.anythink.core.common.h.n nVar, bv bvVar) {
        ap aW = bvVar.aW();
        if (aW == null) {
            return;
        }
        nVar.g(aW.b());
        nVar.h(aW.f());
        if (bvVar.aU()) {
            nVar.n(aW.e());
        } else {
            nVar.n(aW.d());
        }
        nVar.i(aW.a());
        bvVar.z();
    }

    public static void a(com.anythink.core.common.h.n nVar) {
        if (nVar != null) {
            nVar.j(0.0d);
            nVar.f(0.0d);
            nVar.g(0.0d);
            nVar.h(0.0d);
        }
    }
}
