package com.anythink.basead.f.e;

import com.anythink.basead.c.b;
import com.anythink.core.common.d.j;
import com.anythink.core.common.e.g;
import com.anythink.core.common.h.bi;
import com.anythink.core.common.h.bk;
import com.anythink.core.common.h.bl;
import com.anythink.core.common.h.x;
import com.anythink.core.common.k;
import com.anythink.core.d.l;
import com.anythink.expressad.foundation.d.d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9111a = "sdk_updatetime";

    public static final bi a(x xVar, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(j.e.f12597e);
            if (optJSONObject == null) {
                return null;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONArray("offers").optJSONObject(0);
            bi biVar = new bi();
            biVar.a(xVar.f14317f);
            biVar.k(optJSONObject2.optString(k.ah));
            biVar.l(optJSONObject2.optString(l.a.aE));
            biVar.x(optJSONObject2.optString(b.a.f6228A));
            biVar.m(optJSONObject2.optString("title"));
            biVar.n(optJSONObject2.optString("desc"));
            biVar.i(optJSONObject2.optInt(d.ae));
            biVar.o(optJSONObject2.optString("icon_u"));
            biVar.q(optJSONObject2.optString("full_u"));
            biVar.g(optJSONObject2.optInt("unit_type"));
            biVar.r(optJSONObject2.optString("tp_logo_u"));
            biVar.s(optJSONObject2.optString(b.a.f6245k));
            biVar.t(optJSONObject2.optString("video_u"));
            biVar.e(optJSONObject2.optInt("video_l"));
            biVar.ac(optJSONObject2.optString("video_r"));
            biVar.ad(optJSONObject2.optString("ec_u"));
            biVar.u(optJSONObject2.optString("store_u"));
            biVar.h(optJSONObject2.optInt("link_type"));
            biVar.w(optJSONObject2.optString("click_u"));
            biVar.v(optJSONObject2.optString("deeplink"));
            biVar.b(optJSONObject2.optInt("r_target"));
            biVar.b(optJSONObject2.optLong("expire"));
            biVar.y(optJSONObject2.optString("ad_logo_title"));
            biVar.t(optJSONObject2.optInt("crt_type", 1));
            biVar.ae(optJSONObject2.optString("img_list"));
            biVar.af(optJSONObject2.optString("banner_xhtml"));
            biVar.c(jSONObject.optLong(f9111a));
            biVar.f(optJSONObject2.optInt("offer_firm_id"));
            biVar.j(optJSONObject2.optString("jump_url"));
            biVar.ag(optJSONObject2.optString("app_name"));
            biVar.z(optJSONObject2.optString("publisher"));
            biVar.A(optJSONObject2.optString("app_version"));
            biVar.B(optJSONObject2.optString("privacy"));
            biVar.C(optJSONObject2.optString("permission"));
            biVar.c(optJSONObject2.optString(g.a.f13116N));
            biVar.H(optJSONObject2.optString("wv_ctrl"));
            biVar.c(bk.u(optJSONObject2.optString("ctrl")));
            biVar.a(bl.a(optJSONObject2.optString("tk")));
            biVar.e(optJSONObject2.optInt("adp_type"));
            biVar.f(optJSONObject2.optString("offer_html"));
            biVar.g(optJSONObject2.optString("offer_url"));
            biVar.d(optJSONObject2.optString("wx_username"));
            biVar.e(optJSONObject2.optString("wx_path"));
            biVar.c(optJSONObject2.optInt("o_w"));
            biVar.d(optJSONObject2.optInt("o_h"));
            return biVar;
        } catch (Throwable unused) {
            return null;
        }
    }
}
