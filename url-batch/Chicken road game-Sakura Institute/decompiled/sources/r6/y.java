package r6;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class y {
    public static Collection a(LinkedHashSet linkedHashSet) {
        if (!(linkedHashSet instanceof s6.a) || (linkedHashSet instanceof s6.b)) {
            return linkedHashSet;
        }
        f(linkedHashSet, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static List b(Object obj) {
        if ((obj instanceof s6.a) && !(obj instanceof s6.c)) {
            f(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e9) {
            k.i(e9, y.class.getName());
            throw e9;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof s6.a) && !(obj instanceof s6.e)) {
            f(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e9) {
            k.i(e9, y.class.getName());
            throw e9;
        }
    }

    public static void d(int i7, Object obj) {
        if (obj == null || e(i7, obj)) {
            return;
        }
        f(obj, "kotlin.jvm.functions.Function" + i7);
        throw null;
    }

    public static boolean e(int i7, Object obj) {
        int i8;
        if (obj instanceof d6.e) {
            if (obj instanceof g) {
                i8 = ((g) obj).b();
            } else if (obj instanceof q6.a) {
                i8 = 0;
            } else if (obj instanceof q6.c) {
                i8 = 1;
            } else if (obj instanceof q6.e) {
                i8 = 2;
            } else if (obj instanceof q6.f) {
                i8 = 3;
            } else if (obj instanceof q6.g) {
                i8 = 4;
            } else {
                boolean z8 = obj instanceof o0.a;
                i8 = z8 ? 5 : z8 ? 6 : z8 ? 7 : z8 ? 8 : z8 ? 9 : z8 ? 10 : z8 ? 11 : z8 ? 13 : z8 ? 14 : z8 ? 15 : z8 ? 16 : z8 ? 17 : z8 ? 18 : z8 ? 19 : z8 ? 20 : z8 ? 21 : -1;
            }
            if (i8 == i7) {
                return true;
            }
        }
        return false;
    }

    public static void f(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        k.i(classCastException, y.class.getName());
        throw classCastException;
    }
}
