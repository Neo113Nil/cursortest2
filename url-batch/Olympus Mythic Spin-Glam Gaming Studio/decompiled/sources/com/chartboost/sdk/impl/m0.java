package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.za;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class m0 {
    public final i2 a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;

    public m0(i2 base64Wrapper) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.a = base64Wrapper;
        this.b = "";
        this.d = "";
        this.e = "";
        this.f = "";
    }

    public final d0 a(JSONObject jSONObject) {
        if (jSONObject != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            JSONObject jSONObject2 = jSONObject.getJSONObject(X3.i.K);
            JSONArray jSONArray = jSONObject2.getJSONArray("elements");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            a(jSONArray, linkedHashMap, linkedHashMap2);
            String string = jSONObject2.getString("template");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String optString = jSONObject.optString("name");
            String string2 = jSONObject.getString(CreativeInfo.c);
            String str = this.e;
            String optString2 = jSONObject.optString("baseurl");
            za c = c(jSONObject.optJSONObject("infoicon"));
            String string3 = jSONObject.getString("cgn");
            String string4 = jSONObject.getString("creative");
            String optString3 = jSONObject.optString("media-type");
            String str2 = this.b;
            String a = n0.a(str2);
            String string5 = jSONObject.getString("link");
            String optString4 = jSONObject.optString("deep-link");
            String string6 = jSONObject.getString("to");
            int i = this.c;
            String str3 = this.d;
            u1 u1Var = (u1) linkedHashMap.get("body");
            if (u1Var != null) {
                eg a2 = eg.c.a(jSONObject.optString("renderingengine"));
                List a3 = a(jSONObject.optJSONArray("scripts"));
                Map b = b(jSONObject.optJSONObject("events"));
                jc a4 = n0.a(jSONObject.optInt("mtype"));
                m4 a5 = m4.c.a(jSONObject.optInt("clkp"));
                String str4 = this.f;
                Intrinsics.checkNotNull(optString);
                Intrinsics.checkNotNull(string2);
                Intrinsics.checkNotNull(optString2);
                Intrinsics.checkNotNull(string3);
                Intrinsics.checkNotNull(string4);
                Intrinsics.checkNotNull(optString3);
                Intrinsics.checkNotNull(string5);
                Intrinsics.checkNotNull(optString4);
                Intrinsics.checkNotNull(string6);
                return new d0(optString, string2, optString2, str, c, string3, string4, optString3, linkedHashMap, str2, a, string5, optString4, string6, i, str3, string, u1Var, linkedHashMap2, a2, a3, b, null, null, a4, a5, str4, 12582912, null);
            }
            throw new IllegalStateException("WebView AdUnit does not have a template html body asset");
        }
        throw new JSONException("Missing response");
    }

    public final Map b(JSONObject jSONObject) {
        Iterator<String> keys;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (keys = jSONObject.keys()) != null) {
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    arrayList.add(string);
                }
                Intrinsics.checkNotNull(next);
                hashMap.put(next, arrayList);
            }
        }
        return hashMap;
    }

    public final za c(JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("imageurl");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            String optString2 = jSONObject.optString("clickthroughUrl");
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
            return new za(optString, optString2, za.b.c.a(jSONObject.optInt(X3.i.L)), d(jSONObject.optJSONObject(VastAttributes.MARGIN)), d(jSONObject.optJSONObject(VastAttributes.PADDING)), d(jSONObject.optJSONObject("size")));
        }
        return new za(null, null, null, null, null, null, 63, null);
    }

    public final za.a d(JSONObject jSONObject) {
        if (jSONObject != null) {
            return new za.a(jSONObject.optDouble("w"), jSONObject.optDouble("h"));
        }
        return new za.a(0.0d, 0.0d, 3, null);
    }

    public final void a(JSONArray jSONArray, Map map, Map map2) {
        for (JSONObject jSONObject : q8.asList(jSONArray)) {
            String string = jSONObject.getString("name");
            String string2 = jSONObject.getString("type");
            String string3 = jSONObject.getString("value");
            String optString = jSONObject.optString("param");
            if (string2 != null) {
                int hashCode = string2.hashCode();
                if (hashCode != -1333900842) {
                    if (hashCode != 3213227) {
                        if (hashCode == 106436749 && string2.equals("param")) {
                            Intrinsics.checkNotNull(optString);
                            Intrinsics.checkNotNull(string3);
                            map2.put(optString, string3);
                            if (string != null) {
                                int hashCode2 = string.hashCode();
                                if (hashCode2 != -1422292723) {
                                    if (hashCode2 != -1389119727) {
                                        if (hashCode2 != -878282975) {
                                            if (hashCode2 == -315925656 && string.equals(CampaignEx.JSON_KEY_REWARD_AMOUNT)) {
                                                a(string3);
                                            }
                                        } else if (string.equals("reward_currency")) {
                                            this.d = string3;
                                        }
                                    } else if (string.equals("impression_id")) {
                                        this.e = string3;
                                    }
                                } else if (string.equals("adm.js")) {
                                    this.f = this.a.b(string3);
                                }
                            }
                        }
                    } else if (string2.equals("html")) {
                        Intrinsics.checkNotNull(optString);
                        if (optString.length() == 0) {
                            optString = "body";
                        }
                    }
                } else if (string2.equals("preCachedVideo")) {
                    Intrinsics.checkNotNull(string3);
                    this.b = string3;
                }
                Intrinsics.checkNotNull(optString);
                map.put(optString, new u1(string2, string, string3));
            }
            Intrinsics.checkNotNull(optString);
            if (optString.length() == 0) {
                optString = string;
            }
            Intrinsics.checkNotNull(optString);
            map.put(optString, new u1(string2, string, string3));
        }
    }

    public final void a(String str) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        this.c = i;
    }

    public final List a(JSONArray jSONArray) {
        List asList;
        return (jSONArray == null || (asList = q8.asList(jSONArray)) == null) ? CollectionsKt.emptyList() : asList;
    }
}
