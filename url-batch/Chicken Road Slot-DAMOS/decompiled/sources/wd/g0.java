package wd;

import java.util.Collection;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class g0 {
    public static Collection a(Collection collection) {
        if ((collection instanceof xd.a) && !(collection instanceof xd.b)) {
            e(collection, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return collection;
        } catch (ClassCastException e2) {
            Intrinsics.e(e2, g0.class.getName());
            throw e2;
        }
    }

    public static Map b(Object obj) {
        if ((obj instanceof xd.a) && !(obj instanceof xd.e)) {
            e(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            Intrinsics.e(e2, g0.class.getName());
            throw e2;
        }
    }

    public static void c(int i3, Object obj) {
        if (obj == null || d(i3, obj)) {
            return;
        }
        e(obj, "kotlin.jvm.functions.Function" + i3);
        throw null;
    }

    public static boolean d(int i3, Object obj) {
        if (obj instanceof hd.c) {
            if ((obj instanceof l ? ((l) obj).getArity() : obj instanceof Function0 ? 0 : obj instanceof Function1 ? 1 : obj instanceof Function2 ? 2 : obj instanceof vd.n ? 3 : obj instanceof vd.o ? 4 : obj instanceof vd.p ? 5 : obj instanceof vd.q ? 6 : obj instanceof vd.r ? 7 : obj instanceof vd.s ? 8 : obj instanceof vd.t ? 9 : obj instanceof vd.a ? 10 : obj instanceof vd.b ? 11 : obj instanceof vd.d ? 13 : obj instanceof vd.e ? 14 : obj instanceof vd.f ? 15 : obj instanceof vd.g ? 16 : obj instanceof vd.h ? 17 : obj instanceof vd.i ? 18 : obj instanceof vd.j ? 19 : obj instanceof vd.k ? 20 : obj instanceof vd.l ? 21 : -1) == i3) {
                return true;
            }
        }
        return false;
    }

    public static void e(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        Intrinsics.e(classCastException, g0.class.getName());
        throw classCastException;
    }
}
