package k2;

import A.AbstractC0017m;
import b2.C0518b;
import j2.AbstractC0720j;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f7427a = new ConcurrentHashMap();

    public static Double a(Object obj) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (!(obj instanceof Long)) {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            throw new C0518b("Failed to convert a value of type " + obj.getClass().getName() + " to double");
        }
        Long l4 = (Long) obj;
        Double valueOf = Double.valueOf(l4.doubleValue());
        if (valueOf.longValue() == l4.longValue()) {
            return valueOf;
        }
        throw new C0518b("Loss of precision while converting number to double: " + obj + ". Did you mean to use a 64-bit long instead?");
    }

    public static Object b(Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        if (!cls.isPrimitive() && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls) && !Character.class.isAssignableFrom(cls)) {
            if (String.class.isAssignableFrom(cls)) {
                if (obj instanceof String) {
                    return (String) obj;
                }
                throw new C0518b("Failed to convert value of type " + obj.getClass().getName() + " to String");
            }
            if (cls.isArray()) {
                throw new C0518b("Converting to Arrays is not supported, please use Listsinstead");
            }
            if (cls.getTypeParameters().length > 0) {
                throw new C0518b("Class " + cls.getName() + " has generic type parameters, please use GenericTypeIndicator instead");
            }
            if (cls.equals(Object.class)) {
                return obj;
            }
            if (!cls.isEnum()) {
                ConcurrentHashMap concurrentHashMap = f7427a;
                C0753a c0753a = (C0753a) concurrentHashMap.get(cls);
                if (c0753a == null) {
                    c0753a = new C0753a(cls);
                    concurrentHashMap.put(cls, c0753a);
                }
                if (obj instanceof Map) {
                    return c0753a.c(d(obj), Collections.emptyMap());
                }
                throw new C0518b("Can't convert object of type " + obj.getClass().getName() + " to type " + cls.getName());
            }
            if (!(obj instanceof String)) {
                throw new C0518b("Expected a String while deserializing to enum " + cls + " but got a " + obj.getClass());
            }
            String str = (String) obj;
            try {
                return Enum.valueOf(cls, str);
            } catch (IllegalArgumentException unused) {
                throw new C0518b("Could not find enum value of " + cls.getName() + " for value \"" + str + "\"");
            }
        }
        if (Integer.class.isAssignableFrom(cls) || Integer.TYPE.isAssignableFrom(cls)) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            if (!(obj instanceof Long) && !(obj instanceof Double)) {
                throw new C0518b("Failed to convert a value of type " + obj.getClass().getName() + " to int");
            }
            Number number = (Number) obj;
            double doubleValue = number.doubleValue();
            if (doubleValue >= -2.147483648E9d && doubleValue <= 2.147483647E9d) {
                return Integer.valueOf(number.intValue());
            }
            throw new C0518b("Numeric value out of 32-bit integer range: " + doubleValue + ". Did you mean to use a long or double instead of an int?");
        }
        if (Boolean.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            throw new C0518b("Failed to convert value of type " + obj.getClass().getName() + " to boolean");
        }
        if (Double.class.isAssignableFrom(cls) || Double.TYPE.isAssignableFrom(cls)) {
            return a(obj);
        }
        if (!Long.class.isAssignableFrom(cls) && !Long.TYPE.isAssignableFrom(cls)) {
            if (Float.class.isAssignableFrom(cls) || Float.TYPE.isAssignableFrom(cls)) {
                return Float.valueOf(a(obj).floatValue());
            }
            throw new C0518b(AbstractC0017m.j("Deserializing values to ", cls.getSimpleName(), " is not supported"));
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (!(obj instanceof Double)) {
            throw new C0518b("Failed to convert a value of type " + obj.getClass().getName() + " to long");
        }
        Double d4 = (Double) obj;
        if (d4.doubleValue() >= -9.223372036854776E18d && d4.doubleValue() <= 9.223372036854776E18d) {
            return Long.valueOf(d4.longValue());
        }
        throw new C0518b("Numeric value out of 64-bit long range: " + d4 + ". Did you mean to use a double instead of a long?");
    }

    public static Object c(Object obj, Type type) {
        if (obj == null) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof Class) {
                return b(obj, (Class) type);
            }
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                if (wildcardType.getLowerBounds().length > 0) {
                    throw new C0518b("Generic lower-bounded wildcard types are not supported");
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                AbstractC0720j.b("Wildcard type " + type + " is not upper bounded.", upperBounds.length > 0);
                return c(obj, upperBounds[0]);
            }
            if (!(type instanceof TypeVariable)) {
                if (type instanceof GenericArrayType) {
                    throw new C0518b("Generic Arrays are not supported, please use Lists instead");
                }
                throw new IllegalStateException("Unknown type encountered: " + type);
            }
            Type[] bounds = ((TypeVariable) type).getBounds();
            AbstractC0720j.b("Wildcard type " + type + " is not upper bounded.", bounds.length > 0);
            return c(obj, bounds[0]);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Class cls = (Class) parameterizedType.getRawType();
        if (List.class.isAssignableFrom(cls)) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (!(obj instanceof List)) {
                throw new C0518b("Expected a List while deserializing, but got a " + obj.getClass());
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c(it.next(), type2));
            }
            return arrayList;
        }
        if (Map.class.isAssignableFrom(cls)) {
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            Type type4 = parameterizedType.getActualTypeArguments()[1];
            if (!type3.equals(String.class)) {
                throw new C0518b("Only Maps with string keys are supported, but found Map with key type " + type3);
            }
            Map d4 = d(obj);
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : d4.entrySet()) {
                hashMap.put((String) entry.getKey(), c(entry.getValue(), type4));
            }
            return hashMap;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            throw new C0518b("Collections are not supported, please use Lists instead");
        }
        Map d5 = d(obj);
        ConcurrentHashMap concurrentHashMap = f7427a;
        C0753a c0753a = (C0753a) concurrentHashMap.get(cls);
        if (c0753a == null) {
            c0753a = new C0753a(cls);
            concurrentHashMap.put(cls, c0753a);
        }
        HashMap hashMap2 = new HashMap();
        TypeVariable[] typeParameters = c0753a.f7419a.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length != typeParameters.length) {
            throw new IllegalStateException("Mismatched lengths for type variables and actual types");
        }
        for (int i2 = 0; i2 < typeParameters.length; i2++) {
            hashMap2.put(typeParameters[i2], actualTypeArguments[i2]);
        }
        return c0753a.c(d5, hashMap2);
    }

    public static Map d(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new C0518b("Expected a Map while deserializing, but got a " + obj.getClass());
    }
}
