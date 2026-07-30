package p5;

import a0.m;
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
import o5.j;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f7209a = new ConcurrentHashMap();

    public static Double a(Object obj) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (!(obj instanceof Long)) {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            throw new g5.b("Failed to convert a value of type " + obj.getClass().getName() + " to double");
        }
        Long l8 = (Long) obj;
        Double valueOf = Double.valueOf(l8.doubleValue());
        if (valueOf.longValue() == l8.longValue()) {
            return valueOf;
        }
        throw new g5.b("Loss of precision while converting number to double: " + obj + ". Did you mean to use a 64-bit long instead?");
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
                throw new g5.b("Failed to convert value of type " + obj.getClass().getName() + " to String");
            }
            if (cls.isArray()) {
                throw new g5.b("Converting to Arrays is not supported, please use Listsinstead");
            }
            if (cls.getTypeParameters().length > 0) {
                throw new g5.b("Class " + cls.getName() + " has generic type parameters, please use GenericTypeIndicator instead");
            }
            if (cls.equals(Object.class)) {
                return obj;
            }
            if (!cls.isEnum()) {
                ConcurrentHashMap concurrentHashMap = f7209a;
                a aVar = (a) concurrentHashMap.get(cls);
                if (aVar == null) {
                    aVar = new a(cls);
                    concurrentHashMap.put(cls, aVar);
                }
                if (obj instanceof Map) {
                    return aVar.c(d(obj), Collections.EMPTY_MAP);
                }
                throw new g5.b("Can't convert object of type " + obj.getClass().getName() + " to type " + cls.getName());
            }
            if (!(obj instanceof String)) {
                throw new g5.b("Expected a String while deserializing to enum " + cls + " but got a " + obj.getClass());
            }
            String str = (String) obj;
            try {
                return Enum.valueOf(cls, str);
            } catch (IllegalArgumentException unused) {
                throw new g5.b("Could not find enum value of " + cls.getName() + " for value \"" + str + "\"");
            }
        }
        if (Integer.class.isAssignableFrom(cls) || Integer.TYPE.isAssignableFrom(cls)) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            if (!(obj instanceof Long) && !(obj instanceof Double)) {
                throw new g5.b("Failed to convert a value of type " + obj.getClass().getName() + " to int");
            }
            Number number = (Number) obj;
            double doubleValue = number.doubleValue();
            if (doubleValue >= -2.147483648E9d && doubleValue <= 2.147483647E9d) {
                return Integer.valueOf(number.intValue());
            }
            throw new g5.b("Numeric value out of 32-bit integer range: " + doubleValue + ". Did you mean to use a long or double instead of an int?");
        }
        if (Boolean.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            throw new g5.b("Failed to convert value of type " + obj.getClass().getName() + " to boolean");
        }
        if (Double.class.isAssignableFrom(cls) || Double.TYPE.isAssignableFrom(cls)) {
            return a(obj);
        }
        if (!Long.class.isAssignableFrom(cls) && !Long.TYPE.isAssignableFrom(cls)) {
            if (Float.class.isAssignableFrom(cls) || Float.TYPE.isAssignableFrom(cls)) {
                return Float.valueOf(a(obj).floatValue());
            }
            throw new g5.b(m.j("Deserializing values to ", cls.getSimpleName(), " is not supported"));
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (!(obj instanceof Double)) {
            throw new g5.b("Failed to convert a value of type " + obj.getClass().getName() + " to long");
        }
        Double d8 = (Double) obj;
        if (d8.doubleValue() >= -9.223372036854776E18d && d8.doubleValue() <= 9.223372036854776E18d) {
            return Long.valueOf(d8.longValue());
        }
        throw new g5.b("Numeric value out of 64-bit long range: " + d8 + ". Did you mean to use a double instead of a long?");
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
                    throw new g5.b("Generic lower-bounded wildcard types are not supported");
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                j.b("Wildcard type " + type + " is not upper bounded.", upperBounds.length > 0);
                return c(obj, upperBounds[0]);
            }
            if (!(type instanceof TypeVariable)) {
                if (type instanceof GenericArrayType) {
                    throw new g5.b("Generic Arrays are not supported, please use Lists instead");
                }
                throw new IllegalStateException("Unknown type encountered: " + type);
            }
            Type[] bounds = ((TypeVariable) type).getBounds();
            j.b("Wildcard type " + type + " is not upper bounded.", bounds.length > 0);
            return c(obj, bounds[0]);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Class cls = (Class) parameterizedType.getRawType();
        if (List.class.isAssignableFrom(cls)) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (!(obj instanceof List)) {
                throw new g5.b("Expected a List while deserializing, but got a " + obj.getClass());
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
                throw new g5.b("Only Maps with string keys are supported, but found Map with key type " + type3);
            }
            Map d8 = d(obj);
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : d8.entrySet()) {
                hashMap.put((String) entry.getKey(), c(entry.getValue(), type4));
            }
            return hashMap;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            throw new g5.b("Collections are not supported, please use Lists instead");
        }
        Map d9 = d(obj);
        ConcurrentHashMap concurrentHashMap = f7209a;
        a aVar = (a) concurrentHashMap.get(cls);
        if (aVar == null) {
            aVar = new a(cls);
            concurrentHashMap.put(cls, aVar);
        }
        HashMap hashMap2 = new HashMap();
        TypeVariable[] typeParameters = aVar.f7201a.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length != typeParameters.length) {
            throw new IllegalStateException("Mismatched lengths for type variables and actual types");
        }
        for (int i7 = 0; i7 < typeParameters.length; i7++) {
            hashMap2.put(typeParameters[i7], actualTypeArguments[i7]);
        }
        return aVar.c(d9, hashMap2);
    }

    public static Map d(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new g5.b("Expected a Map while deserializing, but got a " + obj.getClass());
    }
}
