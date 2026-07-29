package com.ironsource.b.h;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AudienceNetworkActivity;
import com.ironsource.b.d.c;
import com.ironsource.b.e.j;
import com.ironsource.b.e.l;
import com.ironsource.b.e.m;
import com.ironsource.b.e.n;
import com.ironsource.b.e.o;
import com.ironsource.b.e.p;
import com.ironsource.b.e.q;
import com.ironsource.b.e.r;
import com.ironsource.b.k;
import com.mopub.common.AdType;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.youappi.sdk.net.model.ProductRequestItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ServerResponseWrapper.java */
/* loaded from: classes2.dex */
public class h {
    private n ac;
    private p ad;
    private com.ironsource.b.e.f ae;
    private String af;
    private String ag;
    private JSONObject ah;
    private Context ai;

    /* renamed from: a, reason: collision with root package name */
    private final String f6943a = "error";

    /* renamed from: b, reason: collision with root package name */
    private final int f6944b = 3;

    /* renamed from: c, reason: collision with root package name */
    private final int f6945c = 2;

    /* renamed from: d, reason: collision with root package name */
    private final int f6946d = 60;
    private final int e = 10000;
    private final int f = 5000;
    private final String g = "providerOrder";
    private final String h = "providerSettings";
    private final String i = TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS;
    private final String j = "adUnits";
    private final String k = "providerLoadName";
    private final String l = "application";
    private final String m = ProductRequestItem.PublisherApp.UNIT_TYPE_REWARDED_VIDEO;
    private final String n = AdType.INTERSTITIAL;
    private final String o = "offerwall";
    private final String p = "banner";
    private final String q = "integration";
    private final String r = "loggers";
    private final String s = "segment";
    private final String t = "events";
    private final String u = "maxNumOfAdaptersToLoadOnStart";
    private final String v = "adapterTimeOutInSeconds";
    private final String w = "atim";
    private final String x = "bannerInterval";
    private final String y = "server";
    private final String z = "publisher";
    private final String A = "console";
    private final String B = "sendUltraEvents";
    private final String C = "sendEventsToggle";
    private final String D = "serverEventsURL";
    private final String E = "serverEventsType";
    private final String F = "backupThreshold";
    private final String G = "maxNumberOfEvents";
    private final String H = "maxEventsPerBatch";
    private final String I = "optOut";
    private final String J = "allowLocation";
    private final String K = "placements";
    private final String L = AudienceNetworkActivity.PLACEMENT_ID;
    private final String M = "placementName";
    private final String N = "delivery";
    private final String O = "capping";
    private final String P = "pacing";
    private final String Q = TJAdUnitConstants.String.ENABLED;
    private final String R = "maxImpressions";
    private final String S = "numOfSeconds";
    private final String T = "unit";
    private final String U = "virtualItemName";
    private final String V = "virtualItemCount";
    private final String W = "backFill";
    private final String X = "premium";
    private final String Y = "uuidEnabled";
    private final String Z = "abt";
    private final String aa = "spId";
    private final String ab = "mpis";

    public h(Context context, String str, String str2, String str3) {
        this.ai = context;
        try {
            if (TextUtils.isEmpty(str3)) {
                this.ah = new JSONObject();
            } else {
                this.ah = new JSONObject(str3);
            }
            j();
            k();
            i();
            this.af = TextUtils.isEmpty(str) ? "" : str;
            this.ag = TextUtils.isEmpty(str2) ? "" : str2;
        } catch (JSONException e) {
            e.printStackTrace();
            h();
        }
    }

    public h(h hVar) {
        try {
            this.ai = hVar.l();
            this.ah = new JSONObject(hVar.ah.toString());
            this.af = hVar.af;
            this.ag = hVar.ag;
            this.ac = hVar.f();
            this.ad = hVar.e();
            this.ae = hVar.g();
        } catch (Exception unused) {
            h();
        }
    }

    private void h() {
        this.ah = new JSONObject();
        this.af = "";
        this.ag = "";
        this.ac = new n();
        this.ad = p.a();
        this.ae = new com.ironsource.b.e.f();
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.af);
            jSONObject.put("userId", this.ag);
            jSONObject.put("response", this.ah);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public boolean a() {
        return ((((this.ah != null) && !this.ah.has("error")) && this.ac != null) && this.ad != null) && this.ae != null;
    }

    public List<k.a> b() {
        if (this.ah == null || this.ae == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.ae.b() != null && this.ac != null && this.ac.a().size() > 0) {
            arrayList.add(k.a.REWARDED_VIDEO);
        }
        if (this.ae.c() != null && this.ac != null && this.ac.b().size() > 0) {
            arrayList.add(k.a.INTERSTITIAL);
        }
        if (this.ae.d() != null) {
            arrayList.add(k.a.OFFERWALL);
        }
        if (this.ae.e() != null) {
            arrayList.add(k.a.BANNER);
        }
        return arrayList;
    }

    private void i() {
        try {
            JSONObject a2 = a(this.ah, "providerOrder");
            JSONArray optJSONArray = a2.optJSONArray(ProductRequestItem.PublisherApp.UNIT_TYPE_REWARDED_VIDEO);
            JSONArray optJSONArray2 = a2.optJSONArray(AdType.INTERSTITIAL);
            JSONArray optJSONArray3 = a2.optJSONArray("banner");
            this.ac = new n();
            if (optJSONArray != null && g() != null && g().b() != null) {
                String e = g().b().e();
                String f = g().b().f();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (optString.equals(e)) {
                        this.ac.d(e);
                    } else {
                        if (optString.equals(f)) {
                            this.ac.e(f);
                        }
                        this.ac.a(optString);
                        o a3 = p.a().a(optString);
                        if (a3 != null) {
                            a3.c(i);
                        }
                    }
                }
            }
            if (optJSONArray2 != null && g() != null && g().c() != null) {
                String e2 = g().c().e();
                String f2 = g().c().f();
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    String optString2 = optJSONArray2.optString(i2);
                    if (optString2.equals(e2)) {
                        this.ac.f(e2);
                    } else {
                        if (optString2.equals(f2)) {
                            this.ac.g(f2);
                        }
                        this.ac.b(optString2);
                        o a4 = p.a().a(optString2);
                        if (a4 != null) {
                            a4.b(i2);
                        }
                    }
                }
            }
            if (optJSONArray3 != null) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    String optString3 = optJSONArray3.optString(i3);
                    this.ac.c(optString3);
                    o a5 = p.a().a(optString3);
                    if (a5 != null) {
                        a5.a(i3);
                    }
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    private void j() {
        try {
            this.ad = p.a();
            JSONObject a2 = a(this.ah, "providerSettings");
            Iterator<String> keys = a2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = a2.optJSONObject(next);
                if (optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("mpis", false);
                    String optString = optJSONObject.optString("spId", "0");
                    String optString2 = optJSONObject.optString("providerLoadName", next);
                    JSONObject a3 = a(optJSONObject, "adUnits");
                    JSONObject a4 = a(optJSONObject, "application");
                    JSONObject a5 = a(a3, ProductRequestItem.PublisherApp.UNIT_TYPE_REWARDED_VIDEO);
                    JSONObject a6 = a(a3, AdType.INTERSTITIAL);
                    JSONObject a7 = a(a3, "banner");
                    JSONObject a8 = g.a(a5, a4);
                    JSONObject a9 = g.a(a6, a4);
                    JSONObject a10 = g.a(a7, a4);
                    if (this.ad.b(next)) {
                        o a11 = this.ad.a(next);
                        JSONObject b2 = a11.b();
                        JSONObject d2 = a11.d();
                        JSONObject e = a11.e();
                        a11.a(g.a(b2, a8));
                        a11.b(g.a(d2, a9));
                        a11.c(g.a(e, a10));
                        a11.a(optBoolean);
                        a11.a(optString);
                    } else if (this.ad.b("Mediation") && ("SupersonicAds".toLowerCase().equals(optString2.toLowerCase()) || "RIS".toLowerCase().equals(optString2.toLowerCase()))) {
                        o a12 = this.ad.a("Mediation");
                        JSONObject b3 = a12.b();
                        JSONObject d3 = a12.d();
                        o oVar = new o(next, optString2, a4, g.a(new JSONObject(b3.toString()), a8), g.a(new JSONObject(d3.toString()), a9), a10);
                        oVar.a(optBoolean);
                        oVar.a(optString);
                        this.ad.a(oVar);
                    } else {
                        o oVar2 = new o(next, optString2, a4, a8, a9, a10);
                        oVar2.a(optBoolean);
                        oVar2.a(optString);
                        this.ad.a(oVar2);
                    }
                }
            }
            this.ad.b();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void k() {
        q qVar;
        boolean z;
        com.ironsource.b.e.g gVar;
        com.ironsource.b.e.d dVar;
        com.ironsource.b.e.i iVar;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        try {
            JSONObject a2 = a(this.ah, TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS);
            JSONObject a3 = a(a2, "adUnits");
            JSONObject a4 = a(a2, "application");
            JSONObject a5 = a(a3, ProductRequestItem.PublisherApp.UNIT_TYPE_REWARDED_VIDEO);
            JSONObject a6 = a(a3, AdType.INTERSTITIAL);
            JSONObject a7 = a(a3, "offerwall");
            JSONObject a8 = a(a3, "banner");
            JSONObject a9 = a(a4, "events");
            JSONObject a10 = a(a4, "loggers");
            JSONObject a11 = a(a4, "segment");
            if (a4 != null) {
                g.a(this.ai, "uuidEnabled", a4.optBoolean("uuidEnabled", true));
            }
            if (a9 != null) {
                String optString = a9.optString("abt");
                if (!TextUtils.isEmpty(optString)) {
                    g.a(optString);
                }
            }
            if (a5 != null) {
                JSONArray optJSONArray = a5.optJSONArray("placements");
                JSONObject a12 = a(a5, "events");
                int a13 = a(a5, a4, "maxNumOfAdaptersToLoadOnStart", 2);
                int a14 = a(a5, a4, "adapterTimeOutInSeconds", 60);
                JSONObject a15 = g.a(a12, a9);
                boolean optBoolean = a15.optBoolean("sendUltraEvents", false);
                boolean optBoolean2 = a15.optBoolean("sendEventsToggle", false);
                String optString2 = a15.optString("serverEventsURL", "");
                String optString3 = a15.optString("serverEventsType", "");
                int optInt = a15.optInt("backupThreshold", -1);
                int optInt2 = a15.optInt("maxNumberOfEvents", -1);
                int optInt3 = a15.optInt("maxEventsPerBatch", 5000);
                JSONArray optJSONArray2 = a15.optJSONArray("optOut");
                if (optJSONArray2 != null) {
                    int[] iArr4 = new int[optJSONArray2.length()];
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        iArr4[i] = optJSONArray2.optInt(i);
                    }
                    iArr3 = iArr4;
                } else {
                    iArr3 = null;
                }
                q qVar2 = new q(a13, a14, new com.ironsource.b.e.b(optBoolean, optBoolean2, optString2, optString3, optInt, optInt2, optInt3, iArr3));
                if (optJSONArray != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        com.ironsource.b.e.k a16 = a(optJSONArray.optJSONObject(i2));
                        if (a16 != null) {
                            qVar2.a(a16);
                        }
                    }
                }
                String optString4 = a5.optString("backFill");
                if (!TextUtils.isEmpty(optString4)) {
                    qVar2.b(optString4);
                }
                String optString5 = a5.optString("premium");
                if (!TextUtils.isEmpty(optString5)) {
                    qVar2.c(optString5);
                }
                qVar = qVar2;
            } else {
                qVar = null;
            }
            if (a6 != null) {
                JSONArray optJSONArray3 = a6.optJSONArray("placements");
                JSONObject a17 = a(a6, "events");
                int a18 = a(a6, a4, "maxNumOfAdaptersToLoadOnStart", 2);
                int a19 = a(a6, a4, "adapterTimeOutInSeconds", 60);
                JSONObject a20 = g.a(a17, a9);
                z = false;
                boolean optBoolean3 = a20.optBoolean("sendEventsToggle", false);
                String optString6 = a20.optString("serverEventsURL", "");
                String optString7 = a20.optString("serverEventsType", "");
                int optInt4 = a20.optInt("backupThreshold", -1);
                int optInt5 = a20.optInt("maxNumberOfEvents", -1);
                int optInt6 = a20.optInt("maxEventsPerBatch", 5000);
                JSONArray optJSONArray4 = a20.optJSONArray("optOut");
                if (optJSONArray4 != null) {
                    int[] iArr5 = new int[optJSONArray4.length()];
                    for (int i3 = 0; i3 < optJSONArray4.length(); i3++) {
                        iArr5[i3] = optJSONArray4.optInt(i3);
                    }
                    iArr2 = iArr5;
                } else {
                    iArr2 = null;
                }
                com.ironsource.b.e.g gVar2 = new com.ironsource.b.e.g(a18, a19, new com.ironsource.b.e.b(false, optBoolean3, optString6, optString7, optInt4, optInt5, optInt6, iArr2));
                if (optJSONArray3 != null) {
                    for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                        com.ironsource.b.e.h b2 = b(optJSONArray3.optJSONObject(i4));
                        if (b2 != null) {
                            gVar2.a(b2);
                        }
                    }
                }
                String optString8 = a6.optString("backFill");
                if (!TextUtils.isEmpty(optString8)) {
                    gVar2.b(optString8);
                }
                String optString9 = a6.optString("premium");
                if (!TextUtils.isEmpty(optString9)) {
                    gVar2.c(optString9);
                }
                gVar = gVar2;
            } else {
                z = false;
                gVar = null;
            }
            if (a8 != null) {
                JSONArray optJSONArray5 = a8.optJSONArray("placements");
                JSONObject a21 = a(a8, "events");
                int a22 = a(a8, a4, "maxNumOfAdaptersToLoadOnStart", 1);
                long a23 = a(a8, a4, "atim", TapjoyConstants.TIMER_INCREMENT);
                int a24 = a(a8, a4, "bannerInterval", 60);
                JSONObject a25 = g.a(a21, a9);
                boolean optBoolean4 = a25.optBoolean("sendEventsToggle", z);
                String optString10 = a25.optString("serverEventsURL", "");
                String optString11 = a25.optString("serverEventsType", "");
                int optInt7 = a25.optInt("backupThreshold", -1);
                int optInt8 = a25.optInt("maxNumberOfEvents", -1);
                int optInt9 = a25.optInt("maxEventsPerBatch", 5000);
                JSONArray optJSONArray6 = a25.optJSONArray("optOut");
                if (optJSONArray6 != null) {
                    int[] iArr6 = new int[optJSONArray6.length()];
                    for (int i5 = 0; i5 < optJSONArray6.length(); i5++) {
                        iArr6[i5] = optJSONArray6.optInt(i5);
                    }
                    iArr = iArr6;
                } else {
                    iArr = null;
                }
                com.ironsource.b.e.d dVar2 = new com.ironsource.b.e.d(a22, a23, new com.ironsource.b.e.b(false, optBoolean4, optString10, optString11, optInt7, optInt8, optInt9, iArr), a24);
                if (optJSONArray5 != null) {
                    for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                        com.ironsource.b.e.e d2 = d(optJSONArray5.optJSONObject(i6));
                        if (d2 != null) {
                            dVar2.a(d2);
                        }
                    }
                }
                dVar = dVar2;
            } else {
                dVar = null;
            }
            if (a7 != null) {
                JSONArray optJSONArray7 = a7.optJSONArray("placements");
                com.ironsource.b.e.i iVar2 = new com.ironsource.b.e.i();
                if (optJSONArray7 != null) {
                    for (int i7 = 0; i7 < optJSONArray7.length(); i7++) {
                        j c2 = c(optJSONArray7.optJSONObject(i7));
                        if (c2 != null) {
                            iVar2.a(c2);
                        }
                    }
                }
                iVar = iVar2;
            } else {
                iVar = null;
            }
            com.ironsource.b.e.a aVar = new com.ironsource.b.e.a(new com.ironsource.b.e.c(a10.optInt("server", 3), a10.optInt("publisher", 3), a10.optInt("console", 3)), a11 != null ? new r(a11.optString("name", ""), a11.optString("id", "-1"), a11.optJSONObject(AdType.CUSTOM)) : null, a4.optBoolean("integration", z));
            g.a(this.ai, "GeneralProperties.ALLOW_LOCATION_SHARED_PREFS_KEY", a4.optBoolean("allowLocation", z));
            this.ae = new com.ironsource.b.e.f(qVar, gVar, iVar, dVar, aVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
        int optInt;
        if (jSONObject.has(str)) {
            optInt = jSONObject.optInt(str, 0);
        } else {
            optInt = jSONObject2.has(str) ? jSONObject2.optInt(str, 0) : 0;
        }
        return optInt == 0 ? i : optInt;
    }

    private long a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j) {
        long optLong;
        if (jSONObject.has(str)) {
            optLong = jSONObject.optLong(str, 0L);
        } else {
            optLong = jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        }
        return optLong == 0 ? j : optLong;
    }

    private com.ironsource.b.e.k a(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt(AudienceNetworkActivity.PLACEMENT_ID, -1);
            String optString = jSONObject.optString("placementName", "");
            String optString2 = jSONObject.optString("virtualItemName", "");
            int optInt2 = jSONObject.optInt("virtualItemCount", -1);
            l e = e(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && optInt2 > 0) {
                com.ironsource.b.e.k kVar = new com.ironsource.b.e.k(optInt, optString, optString2, optInt2, e);
                if (e == null) {
                    return kVar;
                }
                a.a(this.ai, kVar);
                return kVar;
            }
        }
        return null;
    }

    private com.ironsource.b.e.h b(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt(AudienceNetworkActivity.PLACEMENT_ID, -1);
            String optString = jSONObject.optString("placementName", "");
            l e = e(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString)) {
                com.ironsource.b.e.h hVar = new com.ironsource.b.e.h(optInt, optString, e);
                if (e == null) {
                    return hVar;
                }
                a.a(this.ai, hVar);
                return hVar;
            }
        }
        return null;
    }

    private j c(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt(AudienceNetworkActivity.PLACEMENT_ID, -1);
            String optString = jSONObject.optString("placementName", "");
            if (optInt >= 0 && !TextUtils.isEmpty(optString)) {
                return new j(optInt, optString);
            }
        }
        return null;
    }

    private com.ironsource.b.e.e d(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt(AudienceNetworkActivity.PLACEMENT_ID, -1);
            String optString = jSONObject.optString("placementName", "");
            l e = e(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString)) {
                com.ironsource.b.e.e eVar = new com.ironsource.b.e.e(optInt, optString, e);
                if (e == null) {
                    return eVar;
                }
                a.a(this.ai, eVar);
                return eVar;
            }
        }
        return null;
    }

    private l e(JSONObject jSONObject) {
        m mVar = null;
        if (jSONObject == null) {
            return null;
        }
        l.a aVar = new l.a();
        aVar.a(jSONObject.optBoolean("delivery", true));
        JSONObject optJSONObject = jSONObject.optJSONObject("capping");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("unit");
            if (!TextUtils.isEmpty(optString)) {
                if (m.PER_DAY.toString().equals(optString)) {
                    mVar = m.PER_DAY;
                } else if (m.PER_HOUR.toString().equals(optString)) {
                    mVar = m.PER_HOUR;
                }
            }
            int optInt = optJSONObject.optInt("maxImpressions", 0);
            aVar.a(optJSONObject.optBoolean(TJAdUnitConstants.String.ENABLED, false) && optInt > 0, mVar, optInt);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("pacing");
        if (optJSONObject2 != null) {
            int optInt2 = optJSONObject2.optInt("numOfSeconds", 0);
            aVar.a(optJSONObject2.optBoolean(TJAdUnitConstants.String.ENABLED, false) && optInt2 > 0, optInt2);
        }
        return aVar.a();
    }

    private JSONObject a(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    public String c() {
        try {
            return this.ac.d();
        } catch (Exception e) {
            com.ironsource.b.d.d.c().a(c.a.INTERNAL, "getRVBackFillProvider", e);
            return null;
        }
    }

    public String d() {
        try {
            return this.ac.e();
        } catch (Exception e) {
            com.ironsource.b.d.d.c().a(c.a.INTERNAL, "getRVPremiumProvider", e);
            return null;
        }
    }

    public p e() {
        return this.ad;
    }

    public n f() {
        return this.ac;
    }

    public com.ironsource.b.e.f g() {
        return this.ae;
    }

    private Context l() {
        return this.ai;
    }
}
