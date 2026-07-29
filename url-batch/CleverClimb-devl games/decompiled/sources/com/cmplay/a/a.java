package com.cmplay.a;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.i;
import com.cmplay.base.util.h;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppsFlyerReporter.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static List<c> f3893a = new ArrayList();

    public static void a(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        i.c().a(context, str, hashMap);
        h.a("AppsFlyerReporter", "appsFlyer eventValue=" + hashMap);
    }

    public static void a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("af_success", "success");
        i.c().a(context.getApplicationContext(), "ad_watch", hashMap);
        h.a("AppsFlyerReporter", "appsFlyer 上报reportAdWatch");
    }

    public static void a(Context context, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("af_event_type", str);
        i.c().a(context.getApplicationContext(), "af_game_playing", hashMap);
        h.a("AppsFlyerReporter", "reportGamePlaying eventType =  " + str);
    }

    public static void a(String str) {
        h.a("AppsFlyerReporter", "parsePayProductInfos  info=" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f3893a.clear();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID) ? jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID) : "";
                String string2 = jSONObject.has("price_currency_code") ? jSONObject.getString("price_currency_code") : "";
                float f = 0.0f;
                if (jSONObject.has("price_amount_micros")) {
                    float f2 = jSONObject.getLong("price_amount_micros");
                    f = 0.0f != f2 ? f2 / 1000000.0f : f2;
                }
                f3893a.add(new c(string, string2, f));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (h.a()) {
            for (c cVar : f3893a) {
                h.a("AppsFlyerReporter", "parsePayProductInfos  productId:" + cVar.f3896a + "  price_currency_code:" + cVar.f3898c + "  price_amount:" + cVar.f3897b);
            }
        }
    }
}
