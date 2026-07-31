package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.b3;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class u1 {
    public final String a;
    public final String b;
    public final String c;

    public String toString() {
        return "Asset{directory='" + this.a + "', filename='" + this.b + "', url='" + this.c + "'}";
    }

    public u1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static Map a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            xb.a("deserializeAssets assetsJson is null", null);
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next2);
                hashMap.put(next2, new u1(next, jSONObject3.getString("filename"), jSONObject3.getString("url")));
            }
        }
        return hashMap;
    }

    public static Map b(JSONObject jSONObject, int i) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("cache_assets");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ("templates".equals(next)) {
                    hashMap.putAll(a(jSONObject2, i));
                } else {
                    hashMap.putAll(a(jSONObject2, next));
                }
            }
        } catch (JSONException e) {
            xb.b("v2PrefetchToAssets: " + e, null);
        }
        return hashMap;
    }

    public File a(File file) {
        if (this.a != null && this.b != null) {
            String str = this.a + "/" + this.b;
            try {
                return new File(file, str);
            } catch (Exception e) {
                xb.a("Cannot create file for path: " + str + ". Error: " + e, null);
                return null;
            }
        }
        xb.a("Cannot create file. Directory or filename is null.", null);
        return null;
    }

    public String a() {
        return this.c;
    }

    public static Map a(JSONObject jSONObject, String str) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null && str != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("name");
                hashMap.put(string, new u1(str, string, jSONObject2.getString("value")));
            }
        }
        return hashMap;
    }

    public static Map a(JSONObject jSONObject, int i) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("templates")) != null) {
            int min = Math.min(i, optJSONArray.length());
            for (int i2 = 0; i2 < min; i2++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                Iterator it = a(jSONObject2 != null ? a(jSONObject2.getJSONArray("elements")) : null).entrySet().iterator();
                while (it.hasNext()) {
                    u1 u1Var = (u1) ((Map.Entry) it.next()).getValue();
                    hashMap.put(u1Var.b, u1Var);
                }
            }
        }
        return hashMap;
    }

    public static JSONObject a(JSONArray jSONArray) {
        JSONObject a = b3.a(new b3.a[0]);
        if (jSONArray == null) {
            return a;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String optString = jSONObject.optString("name");
            String optString2 = jSONObject.optString("type");
            String optString3 = jSONObject.optString("value");
            String optString4 = jSONObject.optString("param");
            if (!"param".equals(optString2) && optString4.isEmpty()) {
                JSONObject optJSONObject = a.optJSONObject(optString2);
                if (optJSONObject == null) {
                    optJSONObject = b3.a(new b3.a[0]);
                    a.put(optString2, optJSONObject);
                }
                optJSONObject.put("html".equals(optString2) ? "body" : optString, b3.a(b3.a("filename", optString), b3.a("url", optString3)));
            }
        }
        return a;
    }
}
