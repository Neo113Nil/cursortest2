package com.startapp.json.internal;

import com.startapp.json.JsonException;
import com.startapp.json.TypeClassInfo;
import com.startapp.json.TypeInfo;
import com.startapp.json.TypeParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, Class<?>> f69a;

    static {
        HashMap hashMap = new HashMap();
        f69a = hashMap;
        hashMap.put("int[]", Integer.class);
        hashMap.put("long[]", Long.class);
        hashMap.put("double[]", Double.class);
        hashMap.put("float[]", Float.class);
        hashMap.put("bool[]", Boolean.class);
        hashMap.put("char[]", Character.class);
        hashMap.put("byte[]", Byte.class);
        hashMap.put("void[]", Void.class);
        hashMap.put("short[]", Short.class);
    }

    public static Object a(Object obj, Class<?> cls) {
        return obj.getClass().equals(cls) ? obj : cls.equals(Integer.class) ? obj.getClass().equals(Double.class) ? Integer.valueOf(((Double) obj).intValue()) : obj.getClass().equals(Long.class) ? Integer.valueOf(((Long) obj).intValue()) : obj : (cls.equals(Long.class) && obj.getClass().equals(Integer.class)) ? Long.valueOf(((Integer) obj).longValue()) : obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Class<?>>] */
    public static <T> Object a(JSONObject jSONObject, Class<T> cls, Field field) {
        if (cls != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(a(field));
            int length = jSONArray.length();
            Object newInstance = Array.newInstance((Class<?>) cls, length);
            for (int i = 0; i < length; i++) {
                Array.set(newInstance, i, a(cls, jSONArray.getJSONObject(i)));
            }
            return (Object[]) newInstance;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(a(field));
        int length2 = jSONArray2.length();
        Class cls2 = (Class) f69a.get(field.getType().getSimpleName());
        Object newInstance2 = Array.newInstance((Class<?>) cls2.getField("TYPE").get(null), length2);
        for (int i2 = 0; i2 < length2; i2++) {
            String string = jSONArray2.getString(i2);
            Constructor<T> constructor = cls2.getConstructor(cls2.equals(Character.class) ? Character.TYPE : String.class);
            Array.set(newInstance2, i2, cls2.equals(Character.class) ? constructor.newInstance(Character.valueOf(string.charAt(0))) : constructor.newInstance(string));
        }
        return newInstance2;
    }

    public static Object a(JSONObject jSONObject, Field field, Object obj, Class<?> cls) {
        if (!obj.getClass().equals(cls)) {
            if (obj.getClass().equals(String.class)) {
                if (cls.equals(Integer.TYPE)) {
                    return Integer.valueOf(jSONObject.getInt(a(field)));
                }
            } else {
                if (cls.equals(Integer.TYPE)) {
                    return Integer.valueOf(((Number) obj).intValue());
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(((Number) obj).floatValue());
                }
                if (cls.equals(Long.TYPE)) {
                    return Long.valueOf(((Number) obj).longValue());
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(((Number) obj).doubleValue());
                }
            }
        }
        return obj;
    }

    public static String a(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations != null && declaredAnnotations.length > 0) {
            Annotation annotation = field.getDeclaredAnnotations()[0];
            if (annotation.annotationType().equals(TypeInfo.class)) {
                TypeInfo typeInfo = (TypeInfo) annotation;
                if (!"".equals(typeInfo.name())) {
                    return typeInfo.name();
                }
            }
        }
        return field.getName();
    }

    public static <V> List<V> a(Class<V> cls, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            arrayList.add(optJSONObject == null ? jSONArray.get(i) : a(cls, optJSONObject));
        }
        return arrayList;
    }

    public static <V> Set<V> b(Class<V> cls, JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            hashSet.add(optJSONObject == null ? jSONArray.get(i) : a(cls, optJSONObject));
        }
        return hashSet;
    }

    public static boolean b(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations == null || declaredAnnotations.length == 0) {
            return false;
        }
        Annotation annotation = field.getDeclaredAnnotations()[0];
        if (annotation.annotationType().equals(TypeInfo.class)) {
            return ((TypeInfo) annotation).complex();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map a(Class cls, Class cls2, Class cls3, JSONObject jSONObject, Iterator it) {
        Object a2;
        HashMap hashMap = new HashMap();
        while (it.hasNext()) {
            Object next = it.next();
            Object cast = cls.equals(Integer.class) ? cls.cast(Integer.valueOf(Integer.parseInt((String) next))) : next;
            if (cls.isEnum()) {
                cast = Enum.valueOf(cls, cast.toString());
            }
            String str = (String) next;
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                JSONArray optJSONArray = jSONObject.optJSONArray(str);
                if (optJSONArray != null) {
                    a2 = a(cls3, optJSONArray);
                } else if (cls2.isEnum()) {
                    a2 = Enum.valueOf(cls2, (String) jSONObject.get(str));
                } else {
                    a2 = jSONObject.get(str);
                }
            } else {
                a2 = a((Class<Object>) cls2, optJSONObject);
            }
            hashMap.put(cast, a2);
        }
        return hashMap;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:22|(2:24|(10:26|27|(1:29)(7:39|(1:41)(1:(1:43)(1:(2:67|(1:69)(2:70|(1:72)(2:73|(1:75)(8:76|77|78|(3:80|81|37)|33|34|36|37))))(3:49|(1:51)(2:53|(1:55)(2:56|(1:58)(2:59|(4:61|(2:64|62)|65|66))))|52)))|32|33|34|36|37)|30|31|32|33|34|36|37))|82|27|(0)(0)|30|31|32|33|34|36|37) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0130 A[Catch: all -> 0x0261, Exception -> 0x0268, TryCatch #1 {all -> 0x0261, blocks: (B:20:0x00d7, B:22:0x00dd, B:24:0x00e7, B:26:0x00f9, B:27:0x0124, B:29:0x0130, B:30:0x0165, B:31:0x0188, B:34:0x025d, B:41:0x016e, B:43:0x0183, B:45:0x0191, B:47:0x0199, B:49:0x01a1, B:51:0x01a9, B:52:0x01d7, B:53:0x01b6, B:55:0x01be, B:56:0x01c7, B:58:0x01cf, B:59:0x01dc, B:61:0x01e4, B:62:0x01ee, B:64:0x01f4, B:66:0x0202, B:67:0x0206, B:69:0x0210, B:70:0x021e, B:72:0x0228, B:73:0x0236, B:75:0x0240, B:76:0x0246, B:78:0x0253, B:80:0x0259), top: B:19:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016a  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> T a(Class<T> cls, JSONObject jSONObject) {
        T newInstance;
        boolean z;
        boolean z2;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        Class<?> cls5;
        Object a2;
        Object b;
        Class<?> type;
        try {
            TypeClassInfo typeClassInfo = (TypeClassInfo) cls.getAnnotation(TypeClassInfo.class);
            boolean z3 = true;
            ?? r6 = 0;
            if (cls.equals(HttpCookie.class)) {
                Constructor<?> constructor = cls.getDeclaredConstructors()[0];
                constructor.setAccessible(true);
                newInstance = (T) constructor.newInstance("name", "value");
            } else {
                if (cls.isPrimitive()) {
                    return cls.newInstance();
                }
                if (cls.getAnnotation(TypeClassInfo.class) != null && !typeClassInfo.extendsClass()) {
                    if (!typeClassInfo.extendsClass()) {
                        try {
                            try {
                                return (T) a(Class.forName(typeClassInfo.packageName() + "." + jSONObject.getString(typeClassInfo.decider())), jSONObject);
                            } catch (JSONException e) {
                                throw new JsonException(e);
                            }
                        } catch (ClassNotFoundException e2) {
                            throw new JsonException(e2);
                        }
                    }
                    newInstance = null;
                }
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                newInstance = declaredConstructor.newInstance(new Object[0]);
            }
            Field[] declaredFields = cls.getDeclaredFields();
            if (typeClassInfo != null && typeClassInfo.extendsClass()) {
                int length = declaredFields.length;
                Field[] declaredFields2 = cls.getSuperclass().getDeclaredFields();
                int length2 = declaredFields2.length;
                Field[] fieldArr = new Field[length + length2];
                System.arraycopy(declaredFields, 0, fieldArr, 0, length);
                System.arraycopy(declaredFields2, 0, fieldArr, length, length2);
                declaredFields = fieldArr;
            }
            int length3 = declaredFields.length;
            int i = 0;
            while (i < length3) {
                Field field = declaredFields[i];
                int modifiers = field.getModifiers();
                Class cls6 = TypeParser.class;
                if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
                    String a3 = a(field);
                    try {
                        try {
                        } finally {
                            JsonException jsonException = new JsonException(th);
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONObject.has(a3)) {
                        field.setAccessible(z3);
                        if (field.getDeclaredAnnotations().length > 0) {
                            Annotation annotation = field.getDeclaredAnnotations()[r6];
                            if (annotation.annotationType().equals(TypeInfo.class)) {
                                TypeInfo typeInfo = (TypeInfo) annotation;
                                Class<?> type2 = typeInfo.type();
                                cls4 = typeInfo.key();
                                cls5 = typeInfo.value();
                                z = typeInfo.complex();
                                Class<?> innerValue = typeInfo.innerValue();
                                Class parser = typeInfo.parser();
                                cls3 = type2;
                                cls6 = parser;
                                z2 = z3;
                                cls2 = innerValue;
                                if (field.getType().getAnnotation(TypeClassInfo.class) == null) {
                                    TypeClassInfo typeClassInfo2 = (TypeClassInfo) field.getType().getAnnotation(TypeClassInfo.class);
                                    type = Class.forName(typeClassInfo2.packageName() + "." + jSONObject.getJSONObject(a3).getString(typeClassInfo2.decider()));
                                } else {
                                    if (cls6 != TypeParser.class) {
                                        a2 = cls6.newInstance().parse(field.getType(), jSONObject.opt(a3));
                                    } else if (z) {
                                        type = field.getType();
                                    } else if (z2 && (Map.class.isAssignableFrom(cls3) || Collection.class.isAssignableFrom(cls3))) {
                                        if (cls3.equals(HashMap.class)) {
                                            JSONObject jSONObject2 = jSONObject.getJSONObject(a3);
                                            b = a(cls4, cls5, cls2, jSONObject2, jSONObject2.keys());
                                        } else if (cls3.equals(ArrayList.class)) {
                                            b = a(cls5, jSONObject.getJSONArray(a3));
                                        } else if (cls3.equals(HashSet.class)) {
                                            b = b(cls5, jSONObject.getJSONArray(a3));
                                        } else if (cls3.equals(EnumSet.class)) {
                                            JSONArray jSONArray = jSONObject.getJSONArray(a3);
                                            HashSet hashSet = new HashSet();
                                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                                hashSet.add(Enum.valueOf(cls5, jSONArray.getString(i2)));
                                            }
                                            field.set(newInstance, hashSet);
                                        }
                                        field.set(newInstance, b);
                                    } else if (field.getType().isEnum()) {
                                        field.set(newInstance, Enum.valueOf(cls3, (String) jSONObject.get(a3)));
                                    } else if (field.getType().isPrimitive()) {
                                        a2 = a(jSONObject, field, jSONObject.get(a3), field.getType());
                                    } else if (field.getType().isArray()) {
                                        a2 = a(jSONObject, cls3, field);
                                    } else {
                                        a2 = a(jSONObject.get(a3), field.getType());
                                        if (a2.equals(null)) {
                                            field.set(newInstance, null);
                                            i++;
                                            z3 = true;
                                            r6 = 0;
                                        }
                                        field.set(newInstance, a2);
                                        i++;
                                        z3 = true;
                                        r6 = 0;
                                    }
                                    field.set(newInstance, a2);
                                    i++;
                                    z3 = true;
                                    r6 = 0;
                                }
                                a2 = a(type, jSONObject.getJSONObject(a3));
                                field.set(newInstance, a2);
                                i++;
                                z3 = true;
                                r6 = 0;
                            }
                        }
                        z = r6;
                        z2 = z;
                        cls2 = null;
                        cls3 = null;
                        cls4 = null;
                        cls5 = null;
                        if (field.getType().getAnnotation(TypeClassInfo.class) == null) {
                        }
                        a2 = a(type, jSONObject.getJSONObject(a3));
                        field.set(newInstance, a2);
                        i++;
                        z3 = true;
                        r6 = 0;
                    }
                }
                i++;
                z3 = true;
                r6 = 0;
            }
            return newInstance;
        } catch (Exception e3) {
            throw new JsonException(e3);
        }
    }
}
