package com.startapp.json;

import com.startapp.json.internal.a;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class JsonParser {
    public static <T> T fromJson(String str, Class<T> cls) {
        try {
            return (T) fromJsonObject(new JSONObject(str), cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T> T fromJsonObject(JSONObject jSONObject, Class<T> cls) {
        try {
            return (T) a.a(cls, jSONObject);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Object getInnerValue(Object obj) {
        if (obj == null) {
            return null;
        }
        Map<String, Class<?>> map = a.f2982a;
        Class<?> cls = obj.getClass();
        return (cls.equals(Boolean.class) || cls.equals(Integer.class) || cls.equals(Character.class) || cls.equals(Byte.class) || cls.equals(Short.class) || cls.equals(Double.class) || cls.equals(Long.class) || cls.equals(Float.class) || cls.equals(String.class)) ? obj : toJsonObject(obj);
    }

    public static String toJson(Object obj) {
        return String.valueOf(toJsonObject(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v4, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v8, types: [org.json.JSONArray] */
    public static JSONObject toJsonObject(Object obj) {
        Object jSONArray;
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls = obj.getClass(); cls != null && !Object.class.equals(cls); cls = cls.getSuperclass()) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
        }
        JSONObject jSONObject = new JSONObject();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            int modifiers = field.getModifiers();
            if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
                try {
                    field.setAccessible(true);
                    if (field.get(obj) != null) {
                        String a3 = a.a(field);
                        if (a.b(field)) {
                            jSONObject.put(a3, toJsonObject(field.get(obj)));
                        } else {
                            if (List.class.isAssignableFrom(field.getType())) {
                                List list = (List) field.get(obj);
                                if (list != null) {
                                    jSONArray = new JSONArray();
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        jSONArray.put(getInnerValue(it2.next()));
                                    }
                                }
                            } else if (Set.class.isAssignableFrom(field.getType())) {
                                Set set = (Set) field.get(obj);
                                if (set != null) {
                                    jSONArray = new JSONArray();
                                    Iterator it3 = set.iterator();
                                    while (it3.hasNext()) {
                                        jSONArray.put(getInnerValue(it3.next()));
                                    }
                                }
                            } else if (Map.class.isAssignableFrom(field.getType())) {
                                Map map = (Map) field.get(obj);
                                if (map != null) {
                                    jSONArray = new JSONObject();
                                    for (Map.Entry entry : map.entrySet()) {
                                        jSONArray.put(entry.getKey().toString(), getInnerValue(entry.getValue()));
                                    }
                                }
                            } else if (field.getType().isArray()) {
                                Object obj2 = field.get(obj);
                                if (obj2 != null) {
                                    JSONArray jSONArray2 = new JSONArray();
                                    int length = Array.getLength(obj2);
                                    for (int i3 = 0; i3 < length; i3++) {
                                        jSONArray2.put(getInnerValue(Array.get(obj2, i3)));
                                    }
                                    jSONObject.put(a3, jSONArray2);
                                }
                            } else {
                                jSONObject.put(a3, field.get(obj));
                            }
                            jSONObject.put(a3, jSONArray);
                        }
                    }
                } catch (IllegalAccessException | IllegalArgumentException | JSONException unused) {
                }
            }
        }
        return jSONObject;
    }
}
