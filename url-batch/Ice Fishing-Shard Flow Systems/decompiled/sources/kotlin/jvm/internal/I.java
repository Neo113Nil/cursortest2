package kotlin.jvm.internal;

import R5.InterfaceC0165e;
import f6.InterfaceC0406a;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public class I {
    public static Collection a(Collection collection) {
        if (!(collection instanceof InterfaceC0406a) || (collection instanceof f6.b)) {
            return collection;
        }
        d(collection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static void b(int i2, Object obj) {
        if (obj == null || c(i2, obj)) {
            return;
        }
        d(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static boolean c(int i2, Object obj) {
        if (obj instanceof InterfaceC0165e) {
            if ((obj instanceof l ? ((l) obj).getArity() : obj instanceof Function0 ? 0 : obj instanceof Function1 ? 1 : obj instanceof Function2 ? 2 : obj instanceof e6.n ? 3 : obj instanceof e6.o ? 4 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static void d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        Intrinsics.g(classCastException, I.class.getName());
        throw classCastException;
    }
}
