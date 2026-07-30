package kotlin.jvm.internal;

import g6.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class x {
    public static Collection asMutableCollection(Object obj) {
        if ((obj instanceof g6.a) && !(obj instanceof g6.b)) {
            throwCce(obj, "kotlin.collections.MutableCollection");
        }
        return castToCollection(obj);
    }

    public static Iterable asMutableIterable(Object obj) {
        if ((obj instanceof g6.a) && !(obj instanceof g6.c)) {
            throwCce(obj, "kotlin.collections.MutableIterable");
        }
        return castToIterable(obj);
    }

    public static Iterator asMutableIterator(Object obj) {
        if ((obj instanceof g6.a) && !(obj instanceof g6.d)) {
            throwCce(obj, "kotlin.collections.MutableIterator");
        }
        return castToIterator(obj);
    }

    public static List asMutableList(Object obj) {
        if ((obj instanceof g6.a) && !(obj instanceof g6.e)) {
            throwCce(obj, "kotlin.collections.MutableList");
        }
        return castToList(obj);
    }

    public static ListIterator asMutableListIterator(Object obj) {
        if ((obj instanceof g6.a) && !(obj instanceof g6.f)) {
            throwCce(obj, "kotlin.collections.MutableListIterator");
        }
        return castToListIterator(obj);
    }

    public static Map asMutableMap(Object obj) {
        if ((obj instanceof g6.a) && !(obj instanceof g6.g)) {
            throwCce(obj, "kotlin.collections.MutableMap");
        }
        return castToMap(obj);
    }

    public static Map.Entry asMutableMapEntry(Object obj) {
        if ((obj instanceof g6.a) && !(obj instanceof g.a)) {
            throwCce(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return castToMapEntry(obj);
    }

    public static Set asMutableSet(Object obj) {
        if ((obj instanceof g6.a) && !(obj instanceof g6.h)) {
            throwCce(obj, "kotlin.collections.MutableSet");
        }
        return castToSet(obj);
    }

    public static Object beforeCheckcastToFunctionOfArity(Object obj, int i8) {
        if (obj != null && !isFunctionOfArity(obj, i8)) {
            throwCce(obj, "kotlin.jvm.functions.Function" + i8);
        }
        return obj;
    }

    public static Collection castToCollection(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e8) {
            throw throwCce(e8);
        }
    }

    public static Iterable castToIterable(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e8) {
            throw throwCce(e8);
        }
    }

    public static Iterator castToIterator(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e8) {
            throw throwCce(e8);
        }
    }

    public static List castToList(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e8) {
            throw throwCce(e8);
        }
    }

    public static ListIterator castToListIterator(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e8) {
            throw throwCce(e8);
        }
    }

    public static Map castToMap(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e8) {
            throw throwCce(e8);
        }
    }

    public static Map.Entry castToMapEntry(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e8) {
            throw throwCce(e8);
        }
    }

    public static Set castToSet(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e8) {
            throw throwCce(e8);
        }
    }

    public static int getFunctionArity(Object obj) {
        if (obj instanceof q) {
            return ((q) obj).getArity();
        }
        if (obj instanceof f6.a) {
            return 0;
        }
        if (obj instanceof f6.l) {
            return 1;
        }
        if (obj instanceof f6.p) {
            return 2;
        }
        if (obj instanceof f6.q) {
            return 3;
        }
        if (obj instanceof f6.r) {
            return 4;
        }
        if (obj instanceof f6.s) {
            return 5;
        }
        return obj instanceof f6.v ? 8 : -1;
    }

    public static boolean isFunctionOfArity(Object obj, int i8) {
        return (obj instanceof y5.c) && getFunctionArity(obj) == i8;
    }

    public static boolean isMutableCollection(Object obj) {
        return (obj instanceof Collection) && (!(obj instanceof g6.a) || (obj instanceof g6.b));
    }

    public static boolean isMutableIterable(Object obj) {
        return (obj instanceof Iterable) && (!(obj instanceof g6.a) || (obj instanceof g6.c));
    }

    public static boolean isMutableIterator(Object obj) {
        return (obj instanceof Iterator) && (!(obj instanceof g6.a) || (obj instanceof g6.d));
    }

    public static boolean isMutableList(Object obj) {
        return (obj instanceof List) && (!(obj instanceof g6.a) || (obj instanceof g6.e));
    }

    public static boolean isMutableListIterator(Object obj) {
        return (obj instanceof ListIterator) && (!(obj instanceof g6.a) || (obj instanceof g6.f));
    }

    public static boolean isMutableMap(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof g6.a) || (obj instanceof g6.g));
    }

    public static boolean isMutableMapEntry(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof g6.a) || (obj instanceof g.a));
    }

    public static boolean isMutableSet(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof g6.a) || (obj instanceof g6.h));
    }

    private static <T extends Throwable> T sanitizeStackTrace(T t7) {
        return (T) s.sanitizeStackTrace(t7, x.class.getName());
    }

    public static void throwCce(Object obj, String str) {
        throwCce((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static Object beforeCheckcastToFunctionOfArity(Object obj, int i8, String str) {
        if (obj != null && !isFunctionOfArity(obj, i8)) {
            throwCce(str);
        }
        return obj;
    }

    public static void throwCce(String str) {
        throw throwCce(new ClassCastException(str));
    }

    public static Collection asMutableCollection(Object obj, String str) {
        if ((obj instanceof g6.a) && !(obj instanceof g6.b)) {
            throwCce(str);
        }
        return castToCollection(obj);
    }

    public static Iterable asMutableIterable(Object obj, String str) {
        if ((obj instanceof g6.a) && !(obj instanceof g6.c)) {
            throwCce(str);
        }
        return castToIterable(obj);
    }

    public static Iterator asMutableIterator(Object obj, String str) {
        if ((obj instanceof g6.a) && !(obj instanceof g6.d)) {
            throwCce(str);
        }
        return castToIterator(obj);
    }

    public static List asMutableList(Object obj, String str) {
        if ((obj instanceof g6.a) && !(obj instanceof g6.e)) {
            throwCce(str);
        }
        return castToList(obj);
    }

    public static ListIterator asMutableListIterator(Object obj, String str) {
        if ((obj instanceof g6.a) && !(obj instanceof g6.f)) {
            throwCce(str);
        }
        return castToListIterator(obj);
    }

    public static Map asMutableMap(Object obj, String str) {
        if ((obj instanceof g6.a) && !(obj instanceof g6.g)) {
            throwCce(str);
        }
        return castToMap(obj);
    }

    public static Map.Entry asMutableMapEntry(Object obj, String str) {
        if ((obj instanceof g6.a) && !(obj instanceof g.a)) {
            throwCce(str);
        }
        return castToMapEntry(obj);
    }

    public static Set asMutableSet(Object obj, String str) {
        if ((obj instanceof g6.a) && !(obj instanceof g6.h)) {
            throwCce(str);
        }
        return castToSet(obj);
    }

    public static ClassCastException throwCce(ClassCastException classCastException) {
        throw ((ClassCastException) sanitizeStackTrace(classCastException));
    }
}
