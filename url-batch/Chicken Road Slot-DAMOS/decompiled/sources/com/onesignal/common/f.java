package com.onesignal.common;

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
import kotlin.collections.o0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {
    public static final String EXTERNAL_USER_ID = "external_user_id";
    public static final f INSTANCE = new f();

    private f() {
    }

    public final JSONObject bundleAsJSONObject(Bundle bundle) {
        bundle.getClass();
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e2) {
                com.onesignal.debug.internal.logging.b.error("bundleAsJSONObject error for key: " + str, e2);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean compareJSONArrays(JSONArray jSONArray, JSONArray jSONArray2) {
        int i3;
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        try {
            int length = jSONArray.length();
            int i10 = 0;
            while (i10 < length) {
                int length2 = jSONArray2.length();
                for (0; i3 < length2; i3 + 1) {
                    Object obj = jSONArray.get(i10);
                    obj.getClass();
                    Object normalizeType = normalizeType(obj);
                    Object obj2 = jSONArray2.get(i3);
                    obj2.getClass();
                    i3 = Intrinsics.a(normalizeType, normalizeType(obj2)) ? 0 : i3 + 1;
                }
                return false;
            }
            return true;
        } catch (JSONException e2) {
            e2.printStackTrace();
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
        int a9 = o0.a(z.j(arrayList, 10));
        if (a9 < 16) {
            a9 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a9);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj3 = arrayList.get(i3);
            i3++;
            Map.Entry entry = (Map.Entry) obj3;
            Object key = entry.getKey();
            key.getClass();
            linkedHashMap.put((String) key, INSTANCE.convertToJson(entry.getValue()));
        }
        return mapToJson(linkedHashMap);
    }

    public final boolean isValidJsonObject(Object obj) {
        boolean z10;
        boolean z11;
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
        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
            Iterator it2 = keySet.iterator();
            while (it2.hasNext()) {
                if (!(it2.next() instanceof String)) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            Collection values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it3 = values.iterator();
                while (it3.hasNext()) {
                    if (!INSTANCE.isValidJsonObject(it3.next())) {
                        z11 = false;
                        break;
                    }
                }
            }
            z11 = true;
            if (z11) {
                return true;
            }
        }
        return false;
    }

    public final Bundle jsonStringToBundle(String str) {
        str.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            keys.getClass();
            while (keys.hasNext()) {
                String next = keys.next();
                next.getClass();
                String str2 = next;
                bundle.putString(str2, jSONObject.getString(str2));
            }
            return bundle;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final JSONObject mapToJson(Map<String, ? extends Object> map) {
        map.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), convertToJson(entry.getValue()));
        }
        return jSONObject;
    }

    public final Map<String, String> newStringMapFromJSONObject(JSONObject jSONObject) {
        Object opt;
        jSONObject.getClass();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                opt = jSONObject.opt(next);
            } catch (Throwable unused) {
            }
            if (!(opt instanceof JSONArray) && !(opt instanceof JSONObject)) {
                if (!jSONObject.isNull(next) && !"".equals(opt)) {
                    linkedHashMap.put(next, opt.toString());
                }
                linkedHashMap.put(next, "");
            }
            com.onesignal.debug.internal.logging.b.error$default("Omitting key '" + next + "'! sendTags DO NOT supported nested values!", null, 2, null);
        }
        return linkedHashMap;
    }

    public final Set<String> newStringSetFromJSONArray(JSONArray jSONArray) {
        jSONArray.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            String string = jSONArray.getString(i3);
            string.getClass();
            linkedHashSet.add(string);
        }
        return linkedHashSet;
    }

    public final Object normalizeType(Object obj) {
        obj.getClass();
        Class<?> cls = obj.getClass();
        return cls.equals(Integer.TYPE) ? Long.valueOf(((Integer) obj).intValue()) : cls.equals(Float.TYPE) ? Double.valueOf(((Float) obj).floatValue()) : obj;
    }

    public final String toUnescapedEUIDString(JSONObject jSONObject) {
        String group;
        jSONObject.getClass();
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        if (jSONObject.has(EXTERNAL_USER_ID)) {
            Matcher matcher = Pattern.compile("(?<=\"external_user_id\":\").*?(?=\")").matcher(jSONObject2);
            if (matcher.find() && (group = matcher.group(0)) != null) {
                String replaceAll = matcher.replaceAll(Matcher.quoteReplacement(o.g(group, "\\/", "/")));
                replaceAll.getClass();
                return replaceAll;
            }
        }
        return jSONObject2;
    }

    public final JSONArray wrapInJsonArray(JSONObject jSONObject) {
        JSONArray put = new JSONArray().put(jSONObject);
        put.getClass();
        return put;
    }
}
