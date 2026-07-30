package com.crrepa.s1;

import com.crrepa.n1.b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    final Class<Object> f13791a;

    /* renamed from: b, reason: collision with root package name */
    final Type f13792b;

    /* renamed from: c, reason: collision with root package name */
    final int f13793c;

    protected a() {
        Type b8 = b(getClass());
        this.f13792b = b8;
        this.f13791a = b.e(b8);
        this.f13793c = b8.hashCode();
    }

    public static <T> a a(Class<T> cls) {
        return new a(cls);
    }

    public static a b(Type type) {
        return new a(b.a(type));
    }

    @Deprecated
    public boolean c(Class<?> cls) {
        return c((Type) cls);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.a(this.f13792b, ((a) obj).f13792b);
    }

    public final int hashCode() {
        return this.f13793c;
    }

    public final String toString() {
        return b.h(this.f13792b);
    }

    a(Type type) {
        Type b8 = b.b((Type) com.crrepa.n1.a.a(type));
        this.f13792b = b8;
        this.f13791a = b.e(b8);
        this.f13793c = b8.hashCode();
    }

    public static a a(Type type) {
        return new a(type);
    }

    public final Type b() {
        return this.f13792b;
    }

    @Deprecated
    public boolean c(Type type) {
        if (type == null) {
            return false;
        }
        if (this.f13792b.equals(type)) {
            return true;
        }
        Type type2 = this.f13792b;
        if (type2 instanceof Class) {
            return this.f13791a.isAssignableFrom(b.e(type));
        }
        if (type2 instanceof ParameterizedType) {
            return a(type, (ParameterizedType) type2, (Map<String, Type>) new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            return this.f13791a.isAssignableFrom(b.e(type)) && a(type, (GenericArrayType) this.f13792b);
        }
        throw a(type2, (Class<?>[]) new Class[]{Class.class, ParameterizedType.class, GenericArrayType.class});
    }

    public static a a(Type type, Type... typeArr) {
        return new a(b.a((Type) null, type, typeArr));
    }

    static Type b(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
    }

    private static AssertionError a(Type type, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> cls : clsArr) {
            sb.append(cls.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type.toString());
        sb.append('.');
        return new AssertionError(sb.toString());
    }

    public final Class<Object> a() {
        return this.f13791a;
    }

    @Deprecated
    public boolean a(a aVar) {
        return c(aVar.b());
    }

    private static boolean a(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i8 = 0; i8 < actualTypeArguments.length; i8++) {
            if (!a(actualTypeArguments[i8], actualTypeArguments2[i8], map)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static boolean a(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type instanceof GenericArrayType) {
            type = ((GenericArrayType) type).getGenericComponentType();
        } else if (type instanceof Class) {
            type = (Class) type;
            while (type.isArray()) {
                type = type.getComponentType();
            }
        }
        return a((Type) type, (ParameterizedType) genericComponentType, (Map<String, Type>) new HashMap());
    }

    private static boolean a(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> e8 = b.e(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = e8.getTypeParameters();
            for (int i8 = 0; i8 < actualTypeArguments.length; i8++) {
                Type type2 = actualTypeArguments[i8];
                TypeVariable<Class<?>> typeVariable = typeParameters[i8];
                while (type2 instanceof TypeVariable) {
                    type2 = map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (a(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type3 : e8.getGenericInterfaces()) {
            if (a(type3, parameterizedType, (Map<String, Type>) new HashMap(map))) {
                return true;
            }
        }
        return a(e8.getGenericSuperclass(), parameterizedType, (Map<String, Type>) new HashMap(map));
    }

    private static boolean a(Type type, Type type2, Map<String, Type> map) {
        return type2.equals(type) || ((type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName())));
    }
}
