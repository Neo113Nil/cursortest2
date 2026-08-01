package com.onesignal.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e {
    public static final <T> List<T> expandJSONArray(JSONObject jSONObject, String str, Function1<? super JSONObject, ? extends T> function1) {
        jSONObject.getClass();
        str.getClass();
        function1.getClass();
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has(str)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                jSONObject2.getClass();
                Object invoke = function1.invoke(jSONObject2);
                if (invoke != null) {
                    arrayList.add(invoke);
                }
            }
        }
        return arrayList;
    }

    public static final void expandJSONObject(JSONObject jSONObject, String str, Function1<? super JSONObject, Unit> function1) {
        jSONObject.getClass();
        str.getClass();
        function1.getClass();
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            jSONObject2.getClass();
            function1.invoke(jSONObject2);
        }
    }

    public static final <T> JSONObject putJSONArray(JSONObject jSONObject, String str, List<? extends T> list, Function1<? super T, ? extends JSONObject> function1) {
        jSONObject.getClass();
        str.getClass();
        function1.getClass();
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) function1.invoke(it.next());
                if (jSONObject2 != null) {
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put(str, jSONArray);
        }
        return jSONObject;
    }

    public static final JSONObject putJSONObject(JSONObject jSONObject, String str, Function1<? super JSONObject, Unit> function1) {
        jSONObject.getClass();
        str.getClass();
        function1.getClass();
        JSONObject jSONObject2 = new JSONObject();
        function1.invoke(jSONObject2);
        jSONObject.put(str, jSONObject2);
        return jSONObject;
    }

    public static final JSONObject putMap(JSONObject jSONObject, Map<String, ? extends Object> map) {
        jSONObject.getClass();
        map.getClass();
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

    public static final JSONObject putSafe(JSONObject jSONObject, String str, Object obj) {
        jSONObject.getClass();
        str.getClass();
        if (obj != null) {
            jSONObject.put(str, obj);
        }
        return jSONObject;
    }

    public static final Boolean safeBool(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        str.getClass();
        if (jSONObject.has(str)) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        return null;
    }

    public static final Double safeDouble(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        str.getClass();
        if (jSONObject.has(str)) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        return null;
    }

    public static final Integer safeInt(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        str.getClass();
        if (jSONObject.has(str)) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        return null;
    }

    public static final JSONObject safeJSONObject(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        str.getClass();
        if (jSONObject.has(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    public static final Long safeLong(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        str.getClass();
        if (jSONObject.has(str)) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        return null;
    }

    public static final String safeString(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        str.getClass();
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final List<Object> toList(JSONArray jSONArray) {
        jSONArray.getClass();
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i3 = 0; i3 < length; i3++) {
            Object opt = jSONArray.opt(i3);
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
        jSONObject.getClass();
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            next.getClass();
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

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function1 {
        final /* synthetic */ Map<String, Object> $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, ? extends Object> map) {
            super(1);
            this.$map = map;
        }

        public final void invoke(JSONObject jSONObject) {
            jSONObject.getClass();
            e.putMap(jSONObject, this.$map);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.f5554a;
        }
    }

    public static final JSONObject putMap(JSONObject jSONObject, String str, Map<String, ? extends Object> map) {
        jSONObject.getClass();
        str.getClass();
        if (map != null) {
            putJSONObject(jSONObject, str, new a(map));
        }
        return jSONObject;
    }
}
