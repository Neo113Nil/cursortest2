package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class tj1 {
    public static Map a(Object obj) {
        if ((obj instanceof yb0) && !(obj instanceof ac0)) {
            d(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            Intrinsics.d(e, tj1.class.getName());
            throw e;
        }
    }

    public static void b(int i, Object obj) {
        if (obj == null || c(i, obj)) {
            return;
        }
        d(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean c(int i, Object obj) {
        if (obj instanceof z30) {
            if ((obj instanceof a40 ? ((a40) obj).getArity() : obj instanceof Function0 ? 0 : obj instanceof Function1 ? 1 : obj instanceof Function2 ? 2 : obj instanceof s30 ? 3 : obj instanceof t30 ? 4 : obj instanceof u30 ? 5 : obj instanceof v30 ? 6 : obj instanceof w30 ? 7 : obj instanceof x30 ? 8 : obj instanceof y30 ? 9 : obj instanceof f30 ? 10 : obj instanceof g30 ? 11 : obj instanceof i30 ? 13 : obj instanceof j30 ? 14 : obj instanceof k30 ? 15 : obj instanceof l30 ? 16 : obj instanceof m30 ? 17 : obj instanceof n30 ? 18 : obj instanceof o30 ? 19 : obj instanceof p30 ? 20 : obj instanceof q30 ? 21 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static void d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        Intrinsics.d(classCastException, tj1.class.getName());
        throw classCastException;
    }
}
