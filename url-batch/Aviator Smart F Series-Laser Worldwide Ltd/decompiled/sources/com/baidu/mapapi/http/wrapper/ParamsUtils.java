package com.baidu.mapapi.http.wrapper;

import android.text.TextUtils;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.baidu.platform.comapi.util.JsonBuilder;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ParamsUtils {
    private static void a(Object obj, Field field, Object obj2) {
        try {
            if (b(field.getType())) {
                field.set(obj, a(obj2, field.getType()));
            } else {
                field.set(obj, a(obj2.toString(), field.getGenericType()));
            }
        } catch (Exception unused) {
        }
    }

    private static boolean b(Class<?> cls) {
        return cls == String.class || cls == Byte.class || cls == Byte.TYPE || cls == Short.class || cls == Short.TYPE || cls == Integer.class || cls == Integer.TYPE || cls == Long.class || cls == Long.TYPE || cls == Float.class || cls == Float.TYPE || cls == Double.class || cls == Double.TYPE || cls == Boolean.class || cls == Boolean.TYPE;
    }

    public static String getJsonValue(Object obj, boolean z7) {
        if (obj == null) {
            return null;
        }
        return b(obj.getClass()) ? getValue(obj, z7) : makeJsonString(new Object[]{obj}, z7);
    }

    public static Map<String, Object> getParamsMap(Object[] objArr) {
        HashMap hashMap = new HashMap();
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof BaseParams) {
                    for (Class<?> cls = obj.getClass(); cls != null && cls != Object.class; cls = cls.getSuperclass()) {
                        for (Field field : cls.getFields()) {
                            Properties properties = (Properties) field.getAnnotation(Properties.class);
                            if (properties != null) {
                                String name = properties.name();
                                if (name == null || name.isEmpty()) {
                                    hashMap.put(field.getName(), field.get(obj));
                                } else {
                                    hashMap.put(name, field.get(obj));
                                }
                            } else {
                                hashMap.put(field.getName(), field.get(obj));
                            }
                        }
                        for (Field field2 : cls.getDeclaredFields()) {
                            field2.setAccessible(true);
                            Properties properties2 = (Properties) field2.getAnnotation(Properties.class);
                            if (properties2 != null) {
                                String name2 = properties2.name();
                                if (name2 == null || name2.isEmpty()) {
                                    hashMap.put(field2.getName(), field2.get(obj));
                                } else {
                                    hashMap.put(name2, field2.get(obj));
                                }
                            } else {
                                hashMap.put(field2.getName(), field2.get(obj));
                            }
                            field2.setAccessible(false);
                        }
                    }
                } else if (obj instanceof Map) {
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        hashMap.put(String.valueOf(entry.getKey()), entry.getValue());
                    }
                }
            }
        }
        return hashMap;
    }

    public static String getValue(Object obj, boolean z7) {
        return z7 ? AppMD5.encodeUrlParamsValue(String.valueOf(obj)) : String.valueOf(obj);
    }

    public static String makeFormString(Object[] objArr) {
        return makeFormString(objArr, true);
    }

    public static String makeJsonString(Object[] objArr) {
        return makeJsonString(objArr, true);
    }

    public static String makeQueryString(Object[] objArr) {
        return makeQueryString(objArr, true);
    }

    public static String toJsonString(Object obj, boolean z7) {
        if (obj == null) {
            return "";
        }
        JsonBuilder jsonBuilder = new JsonBuilder();
        a(obj, z7, jsonBuilder);
        return jsonBuilder.getJson();
    }

    public static Object toObject(String str, Class<?> cls) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (b(cls)) {
            return a((Object) str, cls);
        }
        if (BaseParams.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = new JSONObject(str);
            Object newInstance = cls.newInstance();
            while (cls != null && cls != Object.class) {
                for (Field field : cls.getFields()) {
                    Properties properties = (Properties) field.getAnnotation(Properties.class);
                    if (properties != null && jSONObject.has(properties.name())) {
                        a(newInstance, field, jSONObject.get(properties.name()));
                    } else if (properties == null && jSONObject.has(field.getName())) {
                        a(newInstance, field, jSONObject.get(field.getName()));
                    }
                }
                for (Field field2 : cls.getDeclaredFields()) {
                    field2.setAccessible(true);
                    Properties properties2 = (Properties) field2.getAnnotation(Properties.class);
                    if (properties2 != null && jSONObject.has(properties2.name())) {
                        a(newInstance, field2, jSONObject.get(properties2.name()));
                    } else if (properties2 == null && jSONObject.has(field2.getName())) {
                        a(newInstance, field2, jSONObject.get(field2.getName()));
                    }
                    field2.setAccessible(false);
                }
                cls = cls.getSuperclass();
            }
            return newInstance;
        }
        if (Map.class.isAssignableFrom(cls)) {
            JSONObject jSONObject2 = new JSONObject(str);
            Map hashMap = new HashMap();
            if (TreeMap.class.isAssignableFrom(cls)) {
                hashMap = new TreeMap();
            }
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject2.get(next));
            }
            return hashMap;
        }
        if (!Set.class.isAssignableFrom(cls) && !List.class.isAssignableFrom(cls) && !cls.isArray()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        Object[] objArr = new Object[length];
        Class<?> componentType = cls.isArray() ? cls.getComponentType() : a(cls);
        for (int i8 = 0; i8 < length; i8++) {
            if (b(componentType)) {
                objArr[i8] = a((Object) jSONArray.get(i8).toString(), componentType);
            } else {
                objArr[i8] = toObject(jSONArray.get(i8).toString(), componentType);
            }
        }
        if (TreeSet.class.isAssignableFrom(cls)) {
            return new TreeSet(Arrays.asList(objArr));
        }
        if (LinkedList.class.isAssignableFrom(cls)) {
            return new LinkedList(Arrays.asList(objArr));
        }
        if (Set.class.isAssignableFrom(cls)) {
            return new HashSet(Arrays.asList(objArr));
        }
        if (List.class.isAssignableFrom(cls)) {
            return new ArrayList(Arrays.asList(objArr));
        }
        if (!cls.isArray()) {
            return objArr;
        }
        Object newInstance2 = Array.newInstance(cls.getComponentType(), length);
        for (int i9 = 0; i9 < length; i9++) {
            Array.set(newInstance2, i9, objArr[i9]);
        }
        return newInstance2;
    }

    public static boolean verify(BaseParams baseParams) {
        try {
            for (Class<?> cls = baseParams.getClass(); cls != null && cls != Object.class; cls = cls.getSuperclass()) {
                for (Field field : cls.getFields()) {
                    Object obj = field.get(baseParams);
                    Properties properties = (Properties) field.getAnnotation(Properties.class);
                    if (properties != null && properties.require()) {
                        if (obj == null) {
                            return false;
                        }
                        if ((obj instanceof String) && TextUtils.isEmpty(String.valueOf(obj))) {
                            return false;
                        }
                    }
                }
                for (Field field2 : cls.getDeclaredFields()) {
                    field2.setAccessible(true);
                    Object obj2 = field2.get(baseParams);
                    Properties properties2 = (Properties) field2.getAnnotation(Properties.class);
                    field2.setAccessible(false);
                    if (properties2 != null && properties2.require()) {
                        if (obj2 == null) {
                            return false;
                        }
                        if ((obj2 instanceof String) && TextUtils.isEmpty(String.valueOf(obj2))) {
                            return false;
                        }
                    }
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String makeFormString(Object[] objArr, boolean z7) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : getParamsMap(objArr).entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null && !TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(String.valueOf(entry.getValue()))) {
                sb.append("--bd_map_sdk_cc");
                sb.append("\r\n");
                sb.append(String.format(HttpClient.PARAM_TEMPLATE, entry.getKey()));
                sb.append("\r\n");
                sb.append("\r\n");
                sb.append(getValue(entry.getValue(), z7));
                sb.append("\r\n");
            }
        }
        return sb.toString();
    }

    public static String makeJsonString(Object[] objArr, boolean z7) {
        return toJsonString(getParamsMap(objArr), z7);
    }

    public static String makeQueryString(Object[] objArr, boolean z7) {
        Map<String, Object> paramsMap = getParamsMap(objArr);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : paramsMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null && !TextUtils.isEmpty(key) && !TextUtils.isEmpty(String.valueOf(entry.getValue()))) {
                sb.append(key);
                sb.append("=");
                int i8 = 0;
                if (value.getClass().isArray()) {
                    Object[] objArr2 = (Object[]) value;
                    if (objArr2.length > 0) {
                        int length = objArr2.length;
                        while (i8 < length) {
                            sb.append(getValue(objArr2[i8], z7));
                            sb.append(SystemInfoUtil.COMMA);
                            i8++;
                        }
                        sb.deleteCharAt(sb.length() - 1);
                    }
                } else if (value instanceof List) {
                    List list = (List) value;
                    if (!list.isEmpty()) {
                        while (i8 < list.size()) {
                            sb.append(getValue(list.get(i8), z7));
                            sb.append(SystemInfoUtil.COMMA);
                            i8++;
                        }
                        sb.deleteCharAt(sb.length() - 1);
                    }
                } else if (value instanceof Set) {
                    Set set = (Set) value;
                    if (!set.isEmpty()) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            sb.append(getValue(it.next(), z7));
                            sb.append(SystemInfoUtil.COMMA);
                        }
                        sb.deleteCharAt(sb.length() - 1);
                    }
                } else {
                    sb.append(getValue(value, z7));
                }
                sb.append("&");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private static void a(Object obj, boolean z7, JsonBuilder jsonBuilder) {
        if (obj == null) {
            jsonBuilder.valueDirect("null");
            return;
        }
        if (obj instanceof Map) {
            jsonBuilder.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jsonBuilder.key(String.valueOf(entry.getKey()));
                a(entry.getValue(), z7, jsonBuilder);
            }
            jsonBuilder.endObject();
            return;
        }
        boolean z8 = obj instanceof List;
        int i8 = 0;
        if (!z8 && !(obj instanceof Set) && !obj.getClass().isArray()) {
            if (b(obj.getClass())) {
                Object a8 = a(obj, obj.getClass());
                if (a8 instanceof String) {
                    jsonBuilder.valueDirect(String.format("\"%s\"", getValue(a8, z7)));
                    return;
                } else {
                    jsonBuilder.valueDirect(String.valueOf(a8));
                    return;
                }
            }
            if (obj instanceof BaseParams) {
                a(getParamsMap(new Object[]{obj}), z7, jsonBuilder);
                return;
            } else {
                jsonBuilder.value(obj.toString());
                return;
            }
        }
        jsonBuilder.arrayValue();
        if (z8) {
            List list = (List) obj;
            while (i8 < list.size()) {
                a(list.get(i8), z7, jsonBuilder);
                i8++;
            }
        } else if (obj instanceof Set) {
            Iterator it = ((Set) obj).iterator();
            while (it.hasNext()) {
                a(it.next(), z7, jsonBuilder);
            }
        } else {
            int length = Array.getLength(obj);
            while (i8 < length) {
                a(Array.get(obj, i8), z7, jsonBuilder);
                i8++;
            }
        }
        jsonBuilder.endArrayValue();
    }

    private static Object a(String str, Type type) {
        Class cls = type instanceof Class ? (Class) type : null;
        if (type instanceof ParameterizedType) {
            cls = (Class) ((ParameterizedType) type).getRawType();
        }
        if (cls == null) {
            return null;
        }
        if (!Set.class.isAssignableFrom(cls) && !List.class.isAssignableFrom(cls) && !cls.isArray()) {
            return toObject(str, cls);
        }
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        Object[] objArr = new Object[length];
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type type2 = parameterizedType.getActualTypeArguments()[0];
        for (int i8 = 0; i8 < length; i8++) {
            if (type2 instanceof Class) {
                Class cls2 = (Class) type2;
                if (b(cls2)) {
                    objArr[i8] = a((Object) jSONArray.get(i8).toString(), (Class<?>) cls2);
                }
            }
            objArr[i8] = a(jSONArray.get(i8).toString(), parameterizedType.getActualTypeArguments()[0]);
        }
        if (TreeSet.class.isAssignableFrom(cls)) {
            return new TreeSet(Arrays.asList(objArr));
        }
        if (LinkedList.class.isAssignableFrom(cls)) {
            return new LinkedList(Arrays.asList(objArr));
        }
        if (Set.class.isAssignableFrom(cls)) {
            return new HashSet(Arrays.asList(objArr));
        }
        return List.class.isAssignableFrom(cls) ? new ArrayList(Arrays.asList(objArr)) : objArr;
    }

    private static Class<?> a(Class<?> cls) {
        try {
            Type type = ((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments()[0];
            if (type instanceof Class) {
                return (Class) type;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object a(Object obj, Class<?> cls) {
        if (cls == String.class) {
            return obj.toString();
        }
        if (cls == Byte.class || cls == Byte.TYPE) {
            return Byte.valueOf(obj.toString());
        }
        if (cls == Short.class || cls == Short.TYPE) {
            return Short.valueOf(obj.toString());
        }
        if (cls == Integer.class || cls == Integer.TYPE) {
            return Integer.valueOf(obj.toString());
        }
        if (cls == Long.class || cls == Long.TYPE) {
            return Long.valueOf(obj.toString());
        }
        if (cls == Float.class || cls == Float.TYPE) {
            return Float.valueOf(obj.toString());
        }
        if (cls == Double.class || cls == Double.TYPE) {
            return Double.valueOf(obj.toString());
        }
        if (cls == Boolean.class || cls == Boolean.TYPE) {
            return Boolean.valueOf(obj.toString());
        }
        return null;
    }
}
