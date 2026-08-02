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

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, Class<?>> f6058a;

    static {
        HashMap hashMap = new HashMap();
        f6058a = hashMap;
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

    /* JADX WARN: Can't wrap try/catch for region: R(14:22|23|(2:25|(12:27|28|29|30|(1:32)(6:(1:43)(1:(1:45)(4:(2:71|(1:73)(2:74|(1:76)(2:77|(1:79)(8:80|81|82|(3:84|85|40)|36|37|39|40))))(3:51|(1:53)(2:57|(1:59)(2:60|(1:62)(2:63|(4:65|(2:68|66)|69|70))))|54)|55|56|40))|35|36|37|39|40)|33|34|35|36|37|39|40))|88|29|30|(0)(0)|33|34|35|36|37|39|40) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125 A[Catch: Exception -> 0x01a6, all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:20:0x00cd, B:22:0x00d3, B:25:0x00df, B:27:0x00f1, B:30:0x011b, B:32:0x0125, B:33:0x0155, B:34:0x0176, B:37:0x024c, B:43:0x015c, B:45:0x0171, B:47:0x017f, B:49:0x0187, B:51:0x018f, B:53:0x0197, B:54:0x01a3, B:57:0x01a9, B:59:0x01b1, B:60:0x01ba, B:62:0x01c2, B:63:0x01cb, B:65:0x01d3, B:66:0x01dd, B:68:0x01e3, B:70:0x01f1, B:71:0x01f5, B:73:0x01ff, B:74:0x020d, B:76:0x0217, B:77:0x0225, B:79:0x022f, B:80:0x0235, B:82:0x0242, B:84:0x0248), top: B:19:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015a  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> T a(Class<T> cls, JSONObject jSONObject) {
        T newInstance;
        Class<?> cls2;
        boolean z;
        boolean z4;
        Class<?> cls3;
        Class<?> cls4;
        Class<?> cls5;
        Class<?> cls6;
        Class<? extends TypeParser> cls7;
        Object a3;
        Object b4;
        Class<?> type;
        try {
            TypeClassInfo typeClassInfo = (TypeClassInfo) cls.getAnnotation(TypeClassInfo.class);
            boolean z5 = true;
            ?? r7 = 0;
            Class<?> cls8 = null;
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
                                String string = jSONObject.getString(typeClassInfo.decider());
                                return (T) a(Class.forName(typeClassInfo.packageName() + "." + string), jSONObject);
                            } catch (JSONException e4) {
                                throw new JsonException(e4);
                            }
                        } catch (ClassNotFoundException e5) {
                            throw new JsonException(e5);
                        }
                    }
                    newInstance = null;
                }
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                newInstance = declaredConstructor.newInstance(null);
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
            int i4 = 0;
            while (i4 < length3) {
                Field field = declaredFields[i4];
                int modifiers = field.getModifiers();
                if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
                    String a4 = a(field);
                    try {
                        try {
                        } finally {
                            JsonException jsonException = new JsonException(th);
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONObject.has(a4)) {
                        field.setAccessible(z5);
                        if (field.getDeclaredAnnotations().length > 0) {
                            Annotation annotation = field.getDeclaredAnnotations()[r7];
                            if (annotation.annotationType().equals(TypeInfo.class)) {
                                TypeInfo typeInfo = (TypeInfo) annotation;
                                cls5 = typeInfo.type();
                                cls6 = typeInfo.key();
                                Class<?> value = typeInfo.value();
                                z = typeInfo.complex();
                                Class<?> innerValue = typeInfo.innerValue();
                                cls7 = typeInfo.parser();
                                z4 = z5;
                                cls3 = value;
                                cls4 = innerValue;
                                if (field.getType().getAnnotation(TypeClassInfo.class) == null) {
                                    TypeClassInfo typeClassInfo2 = (TypeClassInfo) field.getType().getAnnotation(TypeClassInfo.class);
                                    String string2 = jSONObject.getJSONObject(a4).getString(typeClassInfo2.decider());
                                    type = Class.forName(typeClassInfo2.packageName() + "." + string2);
                                } else {
                                    if (cls7 != TypeParser.class) {
                                        a3 = cls7.newInstance().parse(field.getType(), jSONObject.opt(a4));
                                    } else if (z) {
                                        type = field.getType();
                                    } else {
                                        if (z4 && (Map.class.isAssignableFrom(cls5) || Collection.class.isAssignableFrom(cls5))) {
                                            if (cls5.equals(HashMap.class)) {
                                                JSONObject jSONObject2 = jSONObject.getJSONObject(a4);
                                                b4 = a(cls6, cls3, cls4, jSONObject2, jSONObject2.keys());
                                            } else if (cls5.equals(ArrayList.class)) {
                                                b4 = a(cls3, jSONObject.getJSONArray(a4));
                                            } else if (cls5.equals(HashSet.class)) {
                                                b4 = b(cls3, jSONObject.getJSONArray(a4));
                                            } else if (cls5.equals(EnumSet.class)) {
                                                JSONArray jSONArray = jSONObject.getJSONArray(a4);
                                                HashSet hashSet = new HashSet();
                                                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                                                    hashSet.add(Enum.valueOf(cls3, jSONArray.getString(i5)));
                                                }
                                                field.set(newInstance, hashSet);
                                            }
                                            field.set(newInstance, b4);
                                        } else if (field.getType().isEnum()) {
                                            field.set(newInstance, Enum.valueOf(cls5, (String) jSONObject.get(a4)));
                                        } else if (field.getType().isPrimitive()) {
                                            a3 = a(jSONObject, field, jSONObject.get(a4), field.getType());
                                        } else if (field.getType().isArray()) {
                                            a3 = a(jSONObject, cls5, field);
                                        } else {
                                            a3 = a(jSONObject.get(a4), field.getType());
                                            cls2 = null;
                                            if (a3.equals(null)) {
                                                field.set(newInstance, null);
                                                i4++;
                                                cls8 = cls2;
                                                z5 = true;
                                                r7 = 0;
                                            }
                                            field.set(newInstance, a3);
                                            i4++;
                                            cls8 = cls2;
                                            z5 = true;
                                            r7 = 0;
                                        }
                                        cls2 = null;
                                        i4++;
                                        cls8 = cls2;
                                        z5 = true;
                                        r7 = 0;
                                    }
                                    cls2 = null;
                                    field.set(newInstance, a3);
                                    i4++;
                                    cls8 = cls2;
                                    z5 = true;
                                    r7 = 0;
                                }
                                a3 = a(type, jSONObject.getJSONObject(a4));
                                cls2 = null;
                                field.set(newInstance, a3);
                                i4++;
                                cls8 = cls2;
                                z5 = true;
                                r7 = 0;
                            }
                        }
                        z = r7;
                        z4 = z;
                        cls3 = cls8;
                        cls4 = cls3;
                        cls5 = cls4;
                        cls6 = cls5;
                        cls7 = TypeParser.class;
                        if (field.getType().getAnnotation(TypeClassInfo.class) == null) {
                        }
                        a3 = a(type, jSONObject.getJSONObject(a4));
                        cls2 = null;
                        field.set(newInstance, a3);
                        i4++;
                        cls8 = cls2;
                        z5 = true;
                        r7 = 0;
                    }
                }
                cls2 = cls8;
                i4++;
                cls8 = cls2;
                z5 = true;
                r7 = 0;
            }
            return newInstance;
        } catch (Exception e6) {
            throw new JsonException(e6);
        }
    }

    public static <V> Set<V> b(Class<V> cls, JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i4);
            hashSet.add(optJSONObject == null ? jSONArray.get(i4) : a(cls, optJSONObject));
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

    public static Object a(Object obj, Class<?> cls) {
        return obj.getClass().equals(cls) ? obj : cls.equals(Integer.class) ? obj.getClass().equals(Double.class) ? Integer.valueOf(((Double) obj).intValue()) : obj.getClass().equals(Long.class) ? Integer.valueOf(((Long) obj).intValue()) : obj : (cls.equals(Long.class) && obj.getClass().equals(Integer.class)) ? Long.valueOf(((Integer) obj).longValue()) : obj;
    }

    public static Object a(JSONObject jSONObject, Field field, Object obj, Class<?> cls) {
        if (!obj.getClass().equals(cls)) {
            boolean equals = obj.getClass().equals(String.class);
            Class cls2 = Integer.TYPE;
            if (equals) {
                if (cls.equals(cls2)) {
                    return Integer.valueOf(jSONObject.getInt(a(field)));
                }
            } else {
                if (cls.equals(cls2)) {
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
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i4);
            arrayList.add(optJSONObject == null ? jSONArray.get(i4) : a(cls, optJSONObject));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Class<?>>] */
    public static <T> Object a(JSONObject jSONObject, Class<T> cls, Field field) {
        if (cls != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(a(field));
            int length = jSONArray.length();
            Object newInstance = Array.newInstance((Class<?>) cls, length);
            for (int i4 = 0; i4 < length; i4++) {
                Array.set(newInstance, i4, a(cls, jSONArray.getJSONObject(i4)));
            }
            return (Object[]) newInstance;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(a(field));
        int length2 = jSONArray2.length();
        Class cls2 = (Class) f6058a.get(field.getType().getSimpleName());
        Object newInstance2 = Array.newInstance((Class<?>) cls2.getField("TYPE").get(null), length2);
        for (int i5 = 0; i5 < length2; i5++) {
            String string = jSONArray2.getString(i5);
            Constructor<T> constructor = cls2.getConstructor(cls2.equals(Character.class) ? Character.TYPE : String.class);
            Array.set(newInstance2, i5, cls2.equals(Character.class) ? constructor.newInstance(Character.valueOf(string.charAt(0))) : constructor.newInstance(string));
        }
        return newInstance2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map a(Class cls, Class cls2, Class cls3, JSONObject jSONObject, Iterator it) {
        Object a3;
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
                if (optJSONArray == null) {
                    a3 = cls2.isEnum() ? Enum.valueOf(cls2, (String) jSONObject.get(str)) : jSONObject.get(str);
                } else {
                    a3 = a(cls3, optJSONArray);
                }
            } else {
                a3 = a((Class<Object>) cls2, optJSONObject);
            }
            hashMap.put(cast, a3);
        }
        return hashMap;
    }
}
