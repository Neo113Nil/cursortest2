package com.appsflyer.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFg1eSDK {
    private static Object AFAdRevenueData(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (obj instanceof JSONArray) {
            return obj;
        }
        if (obj instanceof JSONObject) {
            return obj;
        }
        if (obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(AFAdRevenueData(it.next()));
                }
                return jSONArray;
            }
            if (!obj.getClass().isArray()) {
                return obj instanceof Map ? getMediationNetwork((Map) obj) : ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short)) ? obj : obj instanceof String ? obj : obj.toString();
            }
            int length = Array.getLength(obj);
            JSONArray jSONArray2 = new JSONArray();
            for (int i3 = 0; i3 < length; i3++) {
                jSONArray2.put(AFAdRevenueData(Array.get(obj, i3)));
            }
            return jSONArray2;
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static JSONObject getMediationNetwork(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), AFAdRevenueData(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static Map<String, Object> getRevenue(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = getRevenue((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = getRevenue((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    private static List<Object> getRevenue(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            Object obj = jSONArray.get(i3);
            if (obj instanceof JSONArray) {
                obj = getRevenue((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = getRevenue((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static JSONObject AFAdRevenueData(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }
}
