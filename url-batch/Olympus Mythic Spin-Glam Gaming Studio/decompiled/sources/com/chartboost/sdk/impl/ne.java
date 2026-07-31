package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.iab.omid.library.chartboost.adsession.Partner;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class ne {
    public static Integer j;
    public static final String k = Build.VERSION.RELEASE;
    public final JSONObject a;
    public final JSONObject b;
    public final JSONArray c;
    public final JSONObject d;
    public final JSONObject e;
    public final JSONObject f;
    public final ig g;
    public final b0 h;
    public final he i;

    public ne(ig igVar, b0 b0Var, he heVar) {
        j = igVar.e();
        this.g = igVar;
        this.h = b0Var;
        this.i = heVar;
        this.b = new JSONObject();
        this.c = new JSONArray();
        this.d = new JSONObject();
        this.e = new JSONObject();
        this.f = new JSONObject();
        this.a = new JSONObject();
        q();
        n();
        o();
        m();
        p();
        r();
    }

    public final void q() {
        JSONObject jSONObject = this.a;
        Object obj = JSONObject.NULL;
        b3.a(jSONObject, "id", obj);
        b3.a(this.a, POBConstants.TEST_MODE, obj);
        b3.a(this.a, BidResponsed.KEY_CUR, new JSONArray().put("USD"));
        b3.a(this.a, POBConstants.KEY_AT, 2);
    }

    public JSONObject h() {
        return this.a;
    }

    public final void n() {
        s9 c = this.g.c();
        b3.a(this.b, POBConstants.KEY_DEVICE_TYPE, j);
        b3.a(this.b, "w", Integer.valueOf(this.g.b().c()));
        b3.a(this.b, "h", Integer.valueOf(this.g.b().a()));
        b3.a(this.b, "ifa", c.a());
        b3.a(this.b, "osv", k);
        b3.a(this.b, "lmt", Integer.valueOf(c.f().b()));
        b3.a(this.b, "connectiontype", Integer.valueOf(i()));
        b3.a(this.b, "os", "Android");
        b3.a(this.b, POBConstants.KEY_GEO, a());
        b3.a(this.b, POBConstants.KEY_IP, JSONObject.NULL);
        b3.a(this.b, POBConstants.KEY_LANGUAGE, this.g.d);
        b3.a(this.b, "ua", kj.b.a());
        b3.a(this.b, "make", this.g.k);
        b3.a(this.b, "model", this.g.a);
        b3.a(this.b, "carrier", this.g.n);
        b3.a(this.b, "ext", a(c, this.i, this.g.d()));
        b3.a(this.a, "device", this.b);
    }

    public final void o() {
        JSONObject jSONObject = new JSONObject();
        Object obj = JSONObject.NULL;
        b3.a(jSONObject, "id", obj);
        JSONObject jSONObject2 = new JSONObject();
        b3.a(jSONObject2, "w", this.h.e());
        b3.a(jSONObject2, "h", this.h.b());
        b3.a(jSONObject2, "btype", obj);
        b3.a(jSONObject2, "battr", obj);
        b3.a(jSONObject2, "pos", obj);
        b3.a(jSONObject2, "topframe", obj);
        b3.a(jSONObject2, "api", obj);
        JSONObject jSONObject3 = new JSONObject();
        b3.a(jSONObject3, "placementtype", j());
        b3.a(jSONObject3, "playableonly", obj);
        b3.a(jSONObject3, "allowscustomclosebutton", obj);
        b3.a(jSONObject2, "ext", jSONObject3);
        b3.a(jSONObject, "banner", jSONObject2);
        b3.a(jSONObject, POBConstants.KEY_INTERSTITIAL, l());
        b3.a(jSONObject, POBConstants.KEY_TAG_ID, this.h.d());
        b3.a(jSONObject, POBConstants.KEY_DISPLAY_MANAGER, "Chartboost-Android-SDK");
        b3.a(jSONObject, POBConstants.KEY_DISPLAY_MANAGER_VERSION, this.g.g);
        b3.a(jSONObject, "bidfloor", obj);
        b3.a(jSONObject, "bidfloorcur", "USD");
        b3.a(jSONObject, POBConstants.KEY_SECURE, 1);
        this.c.put(jSONObject);
        b3.a(this.a, POBConstants.KEY_IMPRESSION, this.c);
    }

    public final void m() {
        b3.a(this.d, "id", this.g.h);
        JSONObject jSONObject = this.d;
        Object obj = JSONObject.NULL;
        b3.a(jSONObject, "name", obj);
        b3.a(this.d, POBConstants.KEY_BUNDLE, this.g.f);
        b3.a(this.d, POBConstants.KEY_STORE_URL, obj);
        JSONObject jSONObject2 = new JSONObject();
        b3.a(jSONObject2, "id", obj);
        b3.a(jSONObject2, "name", obj);
        b3.a(this.d, "publisher", jSONObject2);
        b3.a(this.d, POBConstants.KEY_CATEGORY, obj);
        b3.a(this.a, "app", this.d);
    }

    public final void p() {
        Integer b = b();
        if (b != null) {
            b3.a(this.e, "coppa", b);
        }
        JSONObject jSONObject = new JSONObject();
        b3.a(jSONObject, "gdpr", Integer.valueOf(e()));
        b3.a(jSONObject, "gpp", g());
        b3.a(jSONObject, POBConstants.KEY_GPP_SID, f());
        for (DataUseConsent dataUseConsent : d()) {
            if (!dataUseConsent.getPrivacyStandardName().equals("coppa")) {
                b3.a(jSONObject, dataUseConsent.getPrivacyStandardName(), dataUseConsent.getConsent());
            }
        }
        b3.a(this.e, "ext", jSONObject);
        b3.a(this.a, POBConstants.KEY_REGS, this.e);
    }

    public final void r() {
        b3.a(this.f, "id", JSONObject.NULL);
        b3.a(this.f, POBConstants.KEY_GEO, a());
        String k2 = k();
        if (k2 != null) {
            b3.a(this.f, "consent", k2);
        }
        JSONObject jSONObject = new JSONObject();
        b3.a(jSONObject, "consent", Integer.valueOf(c()));
        b3.a(jSONObject, POBConstants.KEY_IMP_DEPTH, Integer.valueOf(this.h.c()));
        b3.a(this.f, "ext", jSONObject);
        b3.a(this.a, POBConstants.KEY_USER, this.f);
    }

    public final JSONObject a(s9 s9Var, he heVar, lc lcVar) {
        JSONObject jSONObject = new JSONObject();
        if (s9Var.d() != null) {
            b3.a(jSONObject, "appsetid", s9Var.d());
        }
        if (s9Var.e() != null) {
            b3.a(jSONObject, "appsetidscope", s9Var.e());
        }
        Partner c = heVar.c();
        if (heVar.g() && c != null) {
            b3.a(jSONObject, "omidpn", c.getName());
            b3.a(jSONObject, "omidpv", c.getVersion());
        }
        if (lcVar != null) {
            b3.a(jSONObject, "medtype", lcVar.d());
            b3.a(jSONObject, "medversion", lcVar.b());
            b3.a(jSONObject, "medadpt", lcVar.a());
        }
        return jSONObject;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Object obj = JSONObject.NULL;
        b3.a(jSONObject, "lat", obj);
        b3.a(jSONObject, POBConstants.KEY_LONGITUDE, obj);
        b3.a(jSONObject, "country", this.g.c);
        b3.a(jSONObject, "type", 2);
        return jSONObject;
    }

    public final String j() {
        if (this.h.a() == c0.b.g) {
            xb.b("INTERSTITIAL NOT COMPATIBLE WITH OPENRTB", null);
        } else if (this.h.a() == c0.c.g) {
            xb.b("REWARDED_VIDEO NOT COMPATIBLE WITH OPENRTB", null);
        }
        return this.h.a().b().toLowerCase(Locale.ROOT);
    }

    public final Integer l() {
        return Integer.valueOf(this.h.a().e() ? 1 : 0);
    }

    public final Collection d() {
        ig igVar = this.g;
        if (igVar != null) {
            return igVar.f().i();
        }
        return new ArrayList();
    }

    public final String k() {
        ig igVar = this.g;
        if (igVar != null) {
            return igVar.f().h();
        }
        return null;
    }

    public final String g() {
        ig igVar = this.g;
        if (igVar != null) {
            return igVar.f().b();
        }
        return null;
    }

    public final String f() {
        ig igVar = this.g;
        if (igVar != null) {
            return igVar.f().a();
        }
        return null;
    }

    public final int c() {
        ig igVar = this.g;
        if (igVar == null || igVar.f().c() == null) {
            return 0;
        }
        return this.g.f().c().intValue();
    }

    public final int e() {
        ig igVar = this.g;
        if (igVar == null || igVar.f().e() == null) {
            return 0;
        }
        return this.g.f().e().intValue();
    }

    public final Integer b() {
        ig igVar = this.g;
        if (igVar != null) {
            return igVar.f().d();
        }
        return null;
    }

    public final int i() {
        return this.g.g().d().c();
    }
}
