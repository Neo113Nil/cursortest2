package com.onesignal.common;

import M7.q;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r7.AbstractC4981l;
import r7.t;

/* loaded from: classes2.dex */
public final class f {
    public static final String EXTERNAL_USER_ID = "external_user_id";
    public static final f INSTANCE = new f();

    private f() {
    }

    public final JSONObject bundleAsJSONObject(Bundle bundle) {
        kotlin.jvm.internal.h.e(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e6) {
                com.onesignal.debug.internal.logging.b.error("bundleAsJSONObject error for key: " + str, e6);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r4 = r4 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean compareJSONArrays(JSONArray jSONArray, JSONArray jSONArray2) {
        int i;
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        try {
            int length = jSONArray.length();
            int i4 = 0;
            while (i4 < length) {
                int length2 = jSONArray2.length();
                for (0; i < length2; i + 1) {
                    Object obj = jSONArray.get(i4);
                    kotlin.jvm.internal.h.d(obj, "get(...)");
                    Object normalizeType = normalizeType(obj);
                    Object obj2 = jSONArray2.get(i);
                    kotlin.jvm.internal.h.d(obj2, "get(...)");
                    i = kotlin.jvm.internal.h.a(normalizeType, normalizeType(obj2)) ? 0 : i + 1;
                }
                return false;
            }
            return true;
        } catch (JSONException e6) {
            e6.printStackTrace();
            return false;
        }
    }

    public final Object convertToJson(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                return obj;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(INSTANCE.convertToJson(it.next()));
            }
            return jSONArray;
        }
        Set entrySet = ((Map) obj).entrySet();
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj2 : entrySet) {
            if (((Map.Entry) obj2).getKey() instanceof String) {
                arrayList.add(obj2);
            }
        }
        int z8 = t.z(AbstractC4981l.E(arrayList, 10));
        if (z8 < 16) {
            z8 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z8);
        for (Map.Entry entry : arrayList) {
            Object key = entry.getKey();
            kotlin.jvm.internal.h.c(key, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) key, INSTANCE.convertToJson(entry.getValue()));
        }
        return mapToJson(linkedHashMap);
    }

    public final boolean isValidJsonObject(Object obj) {
        boolean z8;
        boolean z9;
        if (obj == null ? true : obj instanceof Boolean ? true : obj instanceof Number ? true : obj instanceof String ? true : obj instanceof JSONObject ? true : obj instanceof JSONArray) {
            return true;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                return false;
            }
            Iterable iterable = (Iterable) obj;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return true;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (!INSTANCE.isValidJsonObject(it.next())) {
                    return false;
                }
            }
            return true;
        }
        Map map = (Map) obj;
        Set keySet = map.keySet();
        if (keySet == null || !keySet.isEmpty()) {
            Iterator it2 = keySet.iterator();
            while (it2.hasNext()) {
                if (!(it2.next() instanceof String)) {
                    z8 = false;
                    break;
                }
            }
        }
        z8 = true;
        if (z8) {
            Collection values = map.values();
            if (values == null || !values.isEmpty()) {
                Iterator it3 = values.iterator();
                while (it3.hasNext()) {
                    if (!INSTANCE.isValidJsonObject(it3.next())) {
                        z9 = false;
                        break;
                    }
                }
            }
            z9 = true;
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public final Bundle jsonStringToBundle(String data) {
        kotlin.jvm.internal.h.e(data, "data");
        try {
            JSONObject jSONObject = new JSONObject(data);
            Bundle bundle = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            kotlin.jvm.internal.h.d(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                kotlin.jvm.internal.h.c(next, "null cannot be cast to non-null type kotlin.String");
                String str = next;
                bundle.putString(str, jSONObject.getString(str));
            }
            return bundle;
        } catch (JSONException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public final JSONObject mapToJson(Map<String, ? extends Object> map) {
        kotlin.jvm.internal.h.e(map, "map");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), convertToJson(entry.getValue()));
        }
        return jSONObject;
    }

    public final Map<String, String> newStringMapFromJSONObject(JSONObject jsonObject) {
        Object opt;
        kotlin.jvm.internal.h.e(jsonObject, "jsonObject");
        Iterator<String> keys = jsonObject.keys();
        kotlin.jvm.internal.h.d(keys, "keys(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                opt = jsonObject.opt(next);
            } catch (Throwable unused) {
            }
            if (!(opt instanceof JSONArray) && !(opt instanceof JSONObject)) {
                if (!jsonObject.isNull(next) && !"".equals(opt)) {
                    linkedHashMap.put(next, opt.toString());
                }
                linkedHashMap.put(next, "");
            }
            com.onesignal.debug.internal.logging.b.warn$default("Omitting key '" + next + "'! sendTags DO NOT supported nested values!", null, 2, null);
        }
        return linkedHashMap;
    }

    public final Set<String> newStringSetFromJSONArray(JSONArray jsonArray) {
        kotlin.jvm.internal.h.e(jsonArray, "jsonArray");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            String string = jsonArray.getString(i);
            kotlin.jvm.internal.h.d(string, "getString(...)");
            linkedHashSet.add(string);
        }
        return linkedHashSet;
    }

    public final Object normalizeType(Object object) {
        kotlin.jvm.internal.h.e(object, "object");
        Class<?> cls = object.getClass();
        return cls.equals(Integer.TYPE) ? Long.valueOf(((Integer) object).intValue()) : cls.equals(Float.TYPE) ? Double.valueOf(((Float) object).floatValue()) : object;
    }

    public final String toUnescapedEUIDString(JSONObject json) {
        String group;
        kotlin.jvm.internal.h.e(json, "json");
        String jSONObject = json.toString();
        kotlin.jvm.internal.h.d(jSONObject, "toString(...)");
        if (json.has(EXTERNAL_USER_ID)) {
            Matcher matcher = Pattern.compile("(?<=\"external_user_id\":\").*?(?=\")").matcher(jSONObject);
            if (matcher.find() && (group = matcher.group(0)) != null) {
                String replaceAll = matcher.replaceAll(Matcher.quoteReplacement(q.G(group, "\\/", "/")));
                kotlin.jvm.internal.h.d(replaceAll, "replaceAll(...)");
                return replaceAll;
            }
        }
        return jSONObject;
    }

    public final JSONArray wrapInJsonArray(JSONObject jSONObject) {
        JSONArray put = new JSONArray().put(jSONObject);
        kotlin.jvm.internal.h.d(put, "put(...)");
        return put;
    }
}
