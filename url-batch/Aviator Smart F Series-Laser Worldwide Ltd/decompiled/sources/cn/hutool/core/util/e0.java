package cn.hutool.core.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class e0 {
    public static <T> T clone(T t7) {
        T t8 = (T) h.clone(t7);
        return t8 == null ? t7 instanceof Cloneable ? (T) y0.invoke(t7, "clone", new Object[0]) : (T) cloneByStream(t7) : t8;
    }

    public static <T> T cloneByStream(T t7) {
        return (T) a1.clone(t7);
    }

    public static <T> T cloneIfPossible(T t7) {
        Object obj;
        try {
            obj = clone(t7);
        } catch (Exception unused) {
            obj = null;
        }
        return obj == null ? t7 : (T) obj;
    }

    public static <T extends Comparable<? super T>> int compare(T t7, T t8) {
        return cn.hutool.core.comparator.d.compare(t7, t8);
    }

    public static boolean contains(Object obj, Object obj2) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            if (obj2 == null) {
                return false;
            }
            return ((String) obj).contains(obj2.toString());
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).contains(obj2);
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsValue(obj2);
        }
        if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                if (equal(it.next(), obj2)) {
                    return true;
                }
            }
            return false;
        }
        if (obj instanceof Enumeration) {
            Enumeration enumeration = (Enumeration) obj;
            while (enumeration.hasMoreElements()) {
                if (equal(enumeration.nextElement(), obj2)) {
                    return true;
                }
            }
            return false;
        }
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i8 = 0; i8 < length; i8++) {
                if (equal(Array.get(obj, i8), obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T extends CharSequence> T defaultIfBlank(T t7, T t8) {
        return cn.hutool.core.text.l.isBlank(t7) ? t8 : t7;
    }

    @Deprecated
    public static <T> T defaultIfEmpty(String str, Supplier<? extends T> supplier, T t7) {
        Object obj;
        if (!cn.hutool.core.text.l.isNotEmpty(str)) {
            return t7;
        }
        obj = supplier.get();
        return (T) obj;
    }

    public static <T> T defaultIfNull(T t7, T t8) {
        return isNull(t7) ? t8 : t7;
    }

    public static <T> T deserialize(byte[] bArr, Class<?>... clsArr) {
        return (T) a1.deserialize(bArr, clsArr);
    }

    public static int emptyCount(Object... objArr) {
        return h.emptyCount(objArr);
    }

    public static boolean equal(Object obj, Object obj2) {
        return ((obj instanceof Number) && (obj2 instanceof Number)) ? d0.equals((Number) obj, (Number) obj2) : Objects.equals(obj, obj2);
    }

    public static boolean equals(Object obj, Object obj2) {
        return equal(obj, obj2);
    }

    public static Class<?> getTypeArgument(Object obj) {
        return getTypeArgument(obj, 0);
    }

    public static boolean hasEmpty(Object... objArr) {
        return h.hasEmpty(objArr);
    }

    public static boolean hasNull(Object... objArr) {
        return h.hasNull(objArr);
    }

    public static boolean isAllEmpty(Object... objArr) {
        return h.isAllEmpty(objArr);
    }

    public static boolean isAllNotEmpty(Object... objArr) {
        return h.isAllNotEmpty(objArr);
    }

    public static boolean isBasicType(Object obj) {
        if (obj == null) {
            return false;
        }
        return p.isBasicType(obj.getClass());
    }

    public static boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof CharSequence) {
            return cn.hutool.core.text.l.isEmpty((CharSequence) obj);
        }
        if (obj instanceof Map) {
            return cn.hutool.core.map.h1.isEmpty((Map) obj);
        }
        if (obj instanceof Iterable) {
            return cn.hutool.core.collection.k0.isEmpty((Iterable<?>) obj);
        }
        if (obj instanceof Iterator) {
            return cn.hutool.core.collection.k0.isEmpty((Iterator<?>) obj);
        }
        if (h.isArray(obj)) {
            return h.isEmpty(obj);
        }
        return false;
    }

    public static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }

    public static boolean isNotNull(Object obj) {
        return (obj == null || obj.equals(null)) ? false : true;
    }

    public static boolean isNull(Object obj) {
        return obj == null || obj.equals(null);
    }

    public static boolean isValidIfNumber(Object obj) {
        if (obj instanceof Number) {
            return d0.isValidNumber((Number) obj);
        }
        return true;
    }

    public static int length(Object obj) {
        int i8 = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof CharSequence) {
            return ((CharSequence) obj).length();
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).size();
        }
        if (obj instanceof Map) {
            return ((Map) obj).size();
        }
        if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                i8++;
                it.next();
            }
            return i8;
        }
        if (!(obj instanceof Enumeration)) {
            if (obj.getClass().isArray()) {
                return Array.getLength(obj);
            }
            return -1;
        }
        Enumeration enumeration = (Enumeration) obj;
        while (enumeration.hasMoreElements()) {
            i8++;
            enumeration.nextElement();
        }
        return i8;
    }

    public static boolean notEqual(Object obj, Object obj2) {
        return !equal(obj, obj2);
    }

    public static <T> byte[] serialize(T t7) {
        return a1.serialize(t7);
    }

    public static String toString(Object obj) {
        return obj == null ? "null" : obj instanceof Map ? obj.toString() : cn.hutool.core.convert.d.toStr(obj);
    }

    public static <T extends Comparable<? super T>> int compare(T t7, T t8, boolean z7) {
        return cn.hutool.core.comparator.d.compare((Comparable) t7, (Comparable) t8, z7);
    }

    public static <T extends CharSequence> T defaultIfBlank(T t7, Supplier<? extends T> supplier) {
        Object obj;
        if (!cn.hutool.core.text.l.isBlank(t7)) {
            return t7;
        }
        obj = supplier.get();
        return (T) obj;
    }

    public static <T> T defaultIfNull(T t7, Supplier<? extends T> supplier) {
        Object obj;
        if (!isNull(t7)) {
            return t7;
        }
        obj = supplier.get();
        return (T) obj;
    }

    public static Class<?> getTypeArgument(Object obj, int i8) {
        return p.getTypeArgument(obj.getClass(), i8);
    }

    public static <T> T defaultIfEmpty(String str, Function<CharSequence, ? extends T> function, T t7) {
        Object apply;
        if (!cn.hutool.core.text.l.isNotEmpty(str)) {
            return t7;
        }
        apply = function.apply(str);
        return (T) apply;
    }

    public static <T extends CharSequence> T defaultIfBlank(T t7, Function<T, ? extends T> function) {
        Object apply;
        if (!cn.hutool.core.text.l.isBlank(t7)) {
            return t7;
        }
        apply = function.apply(null);
        return (T) apply;
    }

    public static <T> T defaultIfNull(T t7, Function<T, ? extends T> function) {
        Object apply;
        if (!isNull(t7)) {
            return t7;
        }
        apply = function.apply(null);
        return (T) apply;
    }

    public static <T extends CharSequence> T defaultIfEmpty(T t7, T t8) {
        return cn.hutool.core.text.l.isEmpty(t7) ? t8 : t7;
    }

    public static <T extends CharSequence> T defaultIfEmpty(T t7, Supplier<? extends T> supplier) {
        Object obj;
        if (!cn.hutool.core.text.l.isEmpty(t7)) {
            return t7;
        }
        obj = supplier.get();
        return (T) obj;
    }

    @Deprecated
    public static <T> T defaultIfNull(Object obj, Supplier<? extends T> supplier, T t7) {
        Object obj2;
        if (!isNotNull(obj)) {
            return t7;
        }
        obj2 = supplier.get();
        return (T) obj2;
    }

    public static <T extends CharSequence> T defaultIfEmpty(T t7, Function<T, ? extends T> function) {
        Object apply;
        if (!cn.hutool.core.text.l.isEmpty(t7)) {
            return t7;
        }
        apply = function.apply(null);
        return (T) apply;
    }

    public static <T, R> T defaultIfNull(R r8, Function<R, ? extends T> function, T t7) {
        Object apply;
        if (!isNotNull(r8)) {
            return t7;
        }
        apply = function.apply(r8);
        return (T) apply;
    }
}
