package com.anythink.core.common.a;

import android.text.TextUtils;
import com.anythink.basead.c.b;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.g;
import com.anythink.core.common.h.bk;
import com.anythink.core.common.h.bl;
import com.anythink.core.common.h.r;
import com.anythink.core.common.v.q;
import com.anythink.core.d.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {
    private static r a(String str, JSONObject jSONObject, int i) {
        return a(str, jSONObject, i, false);
    }

    public static r a(String str, JSONObject jSONObject, int i, boolean z8) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(j.e.f12597e);
            if (optJSONObject != null) {
                jSONObject = optJSONObject;
            } else if (!jSONObject.has("seatbid")) {
                return null;
            }
            JSONObject optJSONObject2 = jSONObject.optJSONArray("seatbid").optJSONObject(0);
            r rVar = new r();
            rVar.L(optJSONObject2.toString());
            rVar.V(jSONObject.toString());
            rVar.b(str);
            rVar.k(optJSONObject2.optString(com.anythink.core.common.k.ah));
            rVar.l(optJSONObject2.optString(l.a.aE));
            rVar.x(optJSONObject2.optString(b.a.f6228A));
            rVar.m(optJSONObject2.optString("title"));
            rVar.n(optJSONObject2.optString("desc"));
            rVar.i(optJSONObject2.optInt(com.anythink.expressad.foundation.d.d.ae));
            rVar.o(optJSONObject2.optString("icon_u"));
            rVar.q(optJSONObject2.optString("full_u"));
            rVar.g(optJSONObject2.optInt("unit_type"));
            rVar.r(optJSONObject2.optString("tp_logo_u"));
            rVar.s(optJSONObject2.optString(b.a.f6245k));
            rVar.t(optJSONObject2.optString("video_u"));
            rVar.e(optJSONObject2.optInt("video_l"));
            rVar.ac(optJSONObject2.optString("video_r"));
            rVar.ad(optJSONObject2.optString("ec_u"));
            rVar.u(optJSONObject2.optString("store_u"));
            rVar.h(optJSONObject2.optInt("link_type"));
            rVar.w(optJSONObject2.optString("click_u"));
            rVar.v(optJSONObject2.optString("deeplink"));
            rVar.t(optJSONObject2.optInt("crt_type", 1));
            rVar.ae(optJSONObject2.optString("img_list"));
            rVar.af(optJSONObject2.optString("banner_xhtml"));
            rVar.f(optJSONObject2.optInt("offer_firm_id"));
            rVar.j(optJSONObject2.optString("jump_url"));
            try {
                String optString = optJSONObject2.optString("sdk_resp");
                if (!TextUtils.isEmpty(optString)) {
                    rVar.a(new JSONObject(optString).optString("data"));
                }
            } catch (Throwable unused) {
            }
            rVar.ag(optJSONObject2.optString("app_name"));
            rVar.z(optJSONObject2.optString("publisher"));
            rVar.A(optJSONObject2.optString("app_version"));
            rVar.B(optJSONObject2.optString("privacy"));
            rVar.C(optJSONObject2.optString("permission"));
            rVar.c(optJSONObject2.optString(g.a.f13116N));
            rVar.i(optJSONObject2.optString("mtr_ver"));
            int i4 = 2;
            rVar.u(optJSONObject2.optInt("o_im_cap_sw", 2));
            rVar.v(optJSONObject2.optInt("o_cl_cap_sw", 2));
            rVar.w(optJSONObject2.optInt("c_im_cap_sw", 2));
            rVar.x(optJSONObject2.optInt("c_cl_cap_sw", 2));
            if (i == 67) {
                rVar.a(2);
            } else {
                rVar.a(1);
            }
            rVar.c(bk.u(optJSONObject2.optString("ctrl")));
            rVar.a(bl.a(optJSONObject2.optString("tk")));
            try {
                JSONObject jSONObject2 = new JSONObject(optJSONObject2.optString("nw_info"));
                rVar.X(jSONObject2.optString("app_id"));
                rVar.Y(jSONObject2.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.APP_KEY));
                rVar.Z(jSONObject2.optString("unit_id"));
            } catch (Throwable unused2) {
            }
            rVar.aa(optJSONObject2.optString("dsp_id", ""));
            rVar.ab(optJSONObject2.optString("dsp_oid", ""));
            rVar.r(optJSONObject2.optInt(com.anythink.expressad.foundation.d.d.f18734Z, -1));
            rVar.s(optJSONObject2.optInt("install_sw", -1));
            rVar.H(optJSONObject2.optString("wv_ctrl"));
            rVar.e(optJSONObject2.optInt("adp_type"));
            rVar.f(optJSONObject2.optString("offer_html"));
            rVar.g(optJSONObject2.optString("offer_url"));
            rVar.d(optJSONObject2.optString("wx_username"));
            rVar.e(optJSONObject2.optString("wx_path"));
            rVar.c(optJSONObject2.optInt("o_w"));
            rVar.d(optJSONObject2.optInt("o_h"));
            if (z8) {
                optJSONObject2.put(r.f14198c, 1);
            }
            rVar.b(optJSONObject2.optInt(r.f14198c));
            rVar.J(optJSONObject2.optString("mraid_u"));
            if (i == 66 && !TextUtils.isEmpty(rVar.G())) {
                String optString2 = optJSONObject2.optString("dp_package", "");
                rVar.D(optString2);
                if (TextUtils.isEmpty(optString2)) {
                    i4 = 3;
                } else if (q.b(t.b().g(), optString2)) {
                    i4 = 1;
                }
                rVar.j(i4);
            }
            rVar.K(optJSONObject2.optString("adm"));
            rVar.p(optJSONObject2.optInt("cr_m", 1));
            rVar.q(optJSONObject2.optInt("scr_m", 1));
            rVar.n(optJSONObject2.optInt("img_w", 0));
            rVar.o(optJSONObject2.optInt("img_h", 0));
            rVar.k(optJSONObject2.optInt("video_w", 0));
            rVar.l(optJSONObject2.optInt("video_h", 0));
            rVar.N(optJSONObject2.optString("a_info", ""));
            rVar.O(optJSONObject2.optString("a_privacy", ""));
            rVar.M(optJSONObject2.optString("a_info_url", ""));
            rVar.S(optJSONObject2.optString("fast_u", ""));
            rVar.R(optJSONObject2.optString("market_u", ""));
            rVar.T(optJSONObject2.optString("d_c_u", ""));
            rVar.U(optJSONObject2.optString("om_ids", ""));
            rVar.W(optJSONObject2.optString("p_pkg", ""));
            return rVar;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
