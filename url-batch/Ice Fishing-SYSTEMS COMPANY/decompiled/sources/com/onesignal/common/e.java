package com.onesignal.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import q7.v;

/* loaded from: classes2.dex */
public abstract class e {

    public static final class a extends kotlin.jvm.internal.i implements E7.l {
        final /* synthetic */ Map<String, Object> $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, ? extends Object> map) {
            super(1);
            this.$map = map;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return v.f40183a;
        }

        public final void invoke(JSONObject it) {
            kotlin.jvm.internal.h.e(it, "it");
            e.putMap(it, this.$map);
        }
    }

    public static final <T> List<T> expandJSONArray(JSONObject jSONObject, String name, E7.l into) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(into, "into");
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has(name)) {
            JSONArray jSONArray = jSONObject.getJSONArray(name);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                kotlin.jvm.internal.h.b(jSONObject2);
                Object invoke = into.invoke(jSONObject2);
                if (invoke != null) {
                    arrayList.add(invoke);
                }
            }
        }
        return arrayList;
    }

    public static final void expandJSONObject(JSONObject jSONObject, String name, E7.l into) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(into, "into");
        if (jSONObject.has(name)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(name);
            kotlin.jvm.internal.h.d(jSONObject2, "getJSONObject(...)");
            into.invoke(jSONObject2);
        }
    }

    public static final <T> JSONObject putJSONArray(JSONObject jSONObject, String name, List<? extends T> list, E7.l create) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(create, "create");
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) create.invoke(it.next());
                if (jSONObject2 != null) {
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put(name, jSONArray);
        }
        return jSONObject;
    }

    public static final JSONObject putJSONObject(JSONObject jSONObject, String name, E7.l expand) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(expand, "expand");
        JSONObject jSONObject2 = new JSONObject();
        expand.invoke(jSONObject2);
        jSONObject.put(name, jSONObject2);
        return jSONObject;
    }

    public static final JSONObject putMap(JSONObject jSONObject, Map<String, ? extends Object> map) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(map, "map");
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = JSONObject.NULL;
            }
            jSONObject.put(key, value);
        }
        return jSONObject;
    }

    public static final JSONObject putSafe(JSONObject jSONObject, String name, Object obj) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        if (obj != null) {
            jSONObject.put(name, obj);
        }
        return jSONObject;
    }

    public static final Boolean safeBool(JSONObject jSONObject, String name) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        if (jSONObject.has(name)) {
            return Boolean.valueOf(jSONObject.getBoolean(name));
        }
        return null;
    }

    public static final Double safeDouble(JSONObject jSONObject, String name) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        if (jSONObject.has(name)) {
            return Double.valueOf(jSONObject.getDouble(name));
        }
        return null;
    }

    public static final Integer safeInt(JSONObject jSONObject, String name) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        if (jSONObject.has(name)) {
            return Integer.valueOf(jSONObject.getInt(name));
        }
        return null;
    }

    public static final JSONObject safeJSONObject(JSONObject jSONObject, String name) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        if (jSONObject.has(name)) {
            return jSONObject.getJSONObject(name);
        }
        return null;
    }

    public static final Long safeLong(JSONObject jSONObject, String name) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        if (jSONObject.has(name)) {
            return Long.valueOf(jSONObject.getLong(name));
        }
        return null;
    }

    public static final String safeString(JSONObject jSONObject, String name) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        if (jSONObject.has(name)) {
            return jSONObject.getString(name);
        }
        return null;
    }

    public static final List<Object> toList(JSONArray jSONArray) {
        kotlin.jvm.internal.h.e(jSONArray, "<this>");
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (JSONObject.NULL.equals(opt)) {
                arrayList.add(null);
            } else if (opt instanceof JSONArray) {
                arrayList.add(toList((JSONArray) opt));
            } else if (opt instanceof JSONObject) {
                arrayList.add(toMap((JSONObject) opt));
            } else {
                arrayList.add(opt);
            }
        }
        return arrayList;
    }

    public static final Map<String, Object> toMap(JSONObject jSONObject) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        kotlin.jvm.internal.h.d(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            kotlin.jvm.internal.h.b(next);
            if (JSONObject.NULL.equals(obj)) {
                obj = null;
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            } else if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public static final JSONObject putMap(JSONObject jSONObject, String name, Map<String, ? extends Object> map) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        if (map != null) {
            putJSONObject(jSONObject, name, new a(map));
        }
        return jSONObject;
    }
}
