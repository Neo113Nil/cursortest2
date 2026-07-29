package com.chartboost.sdk.Model;

import com.chartboost.sdk.Libraries.e;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3614a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3615b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3616c;

    public b(String str, String str2, String str3) {
        this.f3614a = str;
        this.f3615b = str2;
        this.f3616c = str3;
    }

    private static Map<String, b> b(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next2);
                hashMap.put(next2, new b(next, jSONObject3.getString("filename"), jSONObject3.getString("url")));
            }
        }
        return hashMap;
    }

    public static Map<String, b> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("videos");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String string = jSONObject2.getString("id");
                    hashMap.put(string, new b("videos", string, jSONObject2.getString("video")));
                } catch (JSONException e) {
                    com.chartboost.sdk.Tracking.a.a(b.class, "deserializeNativeVideos (file)", e);
                }
            }
        } catch (JSONException e2) {
            com.chartboost.sdk.Tracking.a.a(b.class, "deserializeNativeVideos (videos array)", e2);
        }
        return hashMap;
    }

    private static JSONObject a(JSONArray jSONArray) throws JSONException {
        JSONObject a2 = com.chartboost.sdk.Libraries.e.a(new e.a[0]);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String optString = jSONObject.optString("name");
            String optString2 = jSONObject.optString("type");
            String optString3 = jSONObject.optString("value");
            String optString4 = jSONObject.optString("param");
            if (!optString2.equals("param") && optString4.isEmpty()) {
                JSONObject optJSONObject = a2.optJSONObject(optString2);
                if (optJSONObject == null) {
                    optJSONObject = com.chartboost.sdk.Libraries.e.a(new e.a[0]);
                    a2.put(optString2, optJSONObject);
                }
                optJSONObject.put(optString2.equals("html") ? "body" : optString, com.chartboost.sdk.Libraries.e.a(com.chartboost.sdk.Libraries.e.a("filename", optString), com.chartboost.sdk.Libraries.e.a("url", optString3)));
            }
        }
        return a2;
    }

    public static Map<String, b> a(JSONObject jSONObject, int i) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("cache_assets");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                int i2 = 0;
                if (next.equals("templates")) {
                    JSONArray optJSONArray = jSONObject2.optJSONArray("templates");
                    if (optJSONArray != null) {
                        int min = Math.min(i, optJSONArray.length());
                        while (i2 < min) {
                            Iterator<Map.Entry<String, b>> it = b(a(optJSONArray.getJSONObject(i2).getJSONArray("elements"))).entrySet().iterator();
                            while (it.hasNext()) {
                                b value = it.next().getValue();
                                hashMap.put(value.f3615b, value);
                            }
                            i2++;
                        }
                    }
                } else {
                    JSONArray jSONArray = jSONObject2.getJSONArray(next);
                    while (i2 < jSONArray.length()) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                        String string = jSONObject3.getString("name");
                        hashMap.put(string, new b(next, string, jSONObject3.getString("value")));
                        i2++;
                    }
                }
            }
        } catch (JSONException e) {
            com.chartboost.sdk.Tracking.a.a(b.class, "v2PrefetchToAssets", e);
        }
        return hashMap;
    }

    public File a(File file) {
        return new File(file, this.f3614a + "/" + this.f3615b);
    }
}
