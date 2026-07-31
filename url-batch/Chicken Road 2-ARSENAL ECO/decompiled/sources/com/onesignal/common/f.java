package com.onesignal.common;

import F5.q;
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
import l5.AbstractC0508l;
import l5.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {
    public static final String EXTERNAL_USER_ID = "external_user_id";
    public static final f INSTANCE = new f();

    private f() {
    }

    public final JSONObject bundleAsJSONObject(Bundle bundle) {
        kotlin.jvm.internal.i.e(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e4) {
                com.onesignal.debug.internal.logging.b.error("bundleAsJSONObject error for key: " + str, e4);
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
        int i7;
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        try {
            int length = jSONArray.length();
            int i8 = 0;
            while (i8 < length) {
                int length2 = jSONArray2.length();
                for (0; i7 < length2; i7 + 1) {
                    Object obj = jSONArray.get(i8);
                    kotlin.jvm.internal.i.d(obj, "get(...)");
                    Object normalizeType = normalizeType(obj);
                    Object obj2 = jSONArray2.get(i7);
                    kotlin.jvm.internal.i.d(obj2, "get(...)");
                    i7 = kotlin.jvm.internal.i.a(normalizeType, normalizeType(obj2)) ? 0 : i7 + 1;
                }
                return false;
            }
            return true;
        } catch (JSONException e4) {
            e4.printStackTrace();
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
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : entrySet) {
            if (((Map.Entry) obj2).getKey() instanceof String) {
                arrayList.add(obj2);
            }
        }
        int p02 = t.p0(AbstractC0508l.C(arrayList, 10));
        if (p02 < 16) {
            p02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(p02);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj3 = arrayList.get(i7);
            i7++;
            Map.Entry entry = (Map.Entry) obj3;
            Object key = entry.getKey();
            kotlin.jvm.internal.i.c(key, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) key, INSTANCE.convertToJson(entry.getValue()));
        }
        return mapToJson(linkedHashMap);
    }

    public final boolean isValidJsonObject(Object obj) {
        boolean z5;
        boolean z6;
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
                    z5 = false;
                    break;
                }
            }
        }
        z5 = true;
        if (z5) {
            Collection values = map.values();
            if (values == null || !values.isEmpty()) {
                Iterator it3 = values.iterator();
                while (it3.hasNext()) {
                    if (!INSTANCE.isValidJsonObject(it3.next())) {
                        z6 = false;
                        break;
                    }
                }
            }
            z6 = true;
            if (z6) {
                return true;
            }
        }
        return false;
    }

    public final Bundle jsonStringToBundle(String data) {
        kotlin.jvm.internal.i.e(data, "data");
        try {
            JSONObject jSONObject = new JSONObject(data);
            Bundle bundle = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            kotlin.jvm.internal.i.d(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                kotlin.jvm.internal.i.c(next, "null cannot be cast to non-null type kotlin.String");
                String str = next;
                bundle.putString(str, jSONObject.getString(str));
            }
            return bundle;
        } catch (JSONException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public final JSONObject mapToJson(Map<String, ? extends Object> map) {
        kotlin.jvm.internal.i.e(map, "map");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), convertToJson(entry.getValue()));
        }
        return jSONObject;
    }

    public final Map<String, String> newStringMapFromJSONObject(JSONObject jsonObject) {
        Object opt;
        kotlin.jvm.internal.i.e(jsonObject, "jsonObject");
        Iterator<String> keys = jsonObject.keys();
        kotlin.jvm.internal.i.d(keys, "keys(...)");
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
        kotlin.jvm.internal.i.e(jsonArray, "jsonArray");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jsonArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            String string = jsonArray.getString(i7);
            kotlin.jvm.internal.i.d(string, "getString(...)");
            linkedHashSet.add(string);
        }
        return linkedHashSet;
    }

    public final Object normalizeType(Object object) {
        kotlin.jvm.internal.i.e(object, "object");
        Class<?> cls = object.getClass();
        return cls.equals(Integer.TYPE) ? Long.valueOf(((Integer) object).intValue()) : cls.equals(Float.TYPE) ? Double.valueOf(((Float) object).floatValue()) : object;
    }

    public final String toUnescapedEUIDString(JSONObject json) {
        String group;
        kotlin.jvm.internal.i.e(json, "json");
        String jSONObject = json.toString();
        kotlin.jvm.internal.i.d(jSONObject, "toString(...)");
        if (json.has(EXTERNAL_USER_ID)) {
            Matcher matcher = Pattern.compile("(?<=\"external_user_id\":\").*?(?=\")").matcher(jSONObject);
            if (matcher.find() && (group = matcher.group(0)) != null) {
                String replaceAll = matcher.replaceAll(Matcher.quoteReplacement(q.G(group, "\\/", "/")));
                kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
                return replaceAll;
            }
        }
        return jSONObject;
    }

    public final JSONArray wrapInJsonArray(JSONObject jSONObject) {
        JSONArray put = new JSONArray().put(jSONObject);
        kotlin.jvm.internal.i.d(put, "put(...)");
        return put;
    }
}
