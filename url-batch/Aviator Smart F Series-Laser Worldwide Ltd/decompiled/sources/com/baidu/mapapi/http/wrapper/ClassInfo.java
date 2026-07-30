package com.baidu.mapapi.http.wrapper;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ClassInfo {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5482a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f5483b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, ClassInfo> f5484c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Field, ClassInfo> f5485d = new HashMap();

    public ClassInfo(Class<?> cls, boolean z7) {
        this.f5483b = cls;
        this.f5482a = z7;
    }

    private static ClassInfo a(Type type, Map<String, ClassInfo> map) {
        if (type == null) {
            return null;
        }
        if (type instanceof Class) {
            return new ClassInfo((Class) type, true);
        }
        if (!(type instanceof ParameterizedType)) {
            if (!(type instanceof TypeVariable) || map == null) {
                return null;
            }
            return map.get(((TypeVariable) type).getName());
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        ClassInfo classInfo = new ClassInfo((Class) parameterizedType.getRawType(), false);
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable<Class<?>>[] typeParameters = classInfo.f5483b.getTypeParameters();
        for (int i8 = 0; i8 < actualTypeArguments.length; i8++) {
            classInfo.f5484c.put(typeParameters[i8].getName(), a(actualTypeArguments[i8], map));
        }
        for (Field field : classInfo.f5483b.getFields()) {
            ClassInfo a8 = a(field, classInfo.f5484c);
            if (a8 != null) {
                classInfo.f5485d.put(field, a8);
            }
        }
        for (Field field2 : classInfo.f5483b.getDeclaredFields()) {
            ClassInfo a9 = a(field2, classInfo.f5484c);
            if (a9 != null) {
                classInfo.f5485d.put(field2, a9);
            }
        }
        return classInfo;
    }

    public static ClassInfo getType(Type type) {
        return a(type, new HashMap());
    }

    public Map<Field, ClassInfo> getGenericFields() {
        return this.f5485d;
    }

    public Map<String, ClassInfo> getGenericParams() {
        return this.f5484c;
    }

    public Class<?> getRawType() {
        return this.f5483b;
    }

    public boolean isRawClass() {
        return this.f5482a;
    }

    private static ClassInfo a(Field field, Map<String, ClassInfo> map) {
        Type genericType = field.getGenericType();
        if (genericType instanceof Class) {
            return null;
        }
        if (genericType instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericType;
            ClassInfo classInfo = new ClassInfo((Class) parameterizedType.getRawType(), false);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = classInfo.f5483b.getTypeParameters();
            for (int i8 = 0; i8 < actualTypeArguments.length; i8++) {
                classInfo.f5484c.put(typeParameters[i8].getName(), a(actualTypeArguments[i8], map));
            }
            for (Field field2 : classInfo.f5483b.getFields()) {
                ClassInfo a8 = a(field2, classInfo.f5484c);
                if (a8 != null) {
                    classInfo.f5485d.put(field2, a8);
                }
            }
            for (Field field3 : classInfo.f5483b.getDeclaredFields()) {
                ClassInfo a9 = a(field3, classInfo.f5484c);
                if (a9 != null) {
                    classInfo.f5485d.put(field3, a9);
                }
            }
            return classInfo;
        }
        if (genericType instanceof TypeVariable) {
            return map.get(((TypeVariable) genericType).getName());
        }
        return null;
    }
}
