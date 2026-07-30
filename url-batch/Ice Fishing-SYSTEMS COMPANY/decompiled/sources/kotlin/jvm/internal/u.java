package kotlin.jvm.internal;

import com.google.android.gms.internal.ads.CL;
import java.util.Collection;
import q7.InterfaceC4934c;

/* loaded from: classes2.dex */
public abstract class u {
    public static Collection a(Collection collection) {
        if (!(collection instanceof F7.a) || (collection instanceof F7.b)) {
            return collection;
        }
        d(collection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static void b(int i, Object obj) {
        if (obj == null || c(i, obj)) {
            return;
        }
        d(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean c(int i, Object obj) {
        if (obj instanceof InterfaceC4934c) {
            if ((obj instanceof f ? ((f) obj).getArity() : obj instanceof E7.a ? 0 : obj instanceof E7.l ? 1 : obj instanceof E7.p ? 2 : obj instanceof E7.q ? 3 : obj instanceof E7.r ? 4 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static void d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(CL.k(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        h.i(classCastException, u.class.getName());
        throw classCastException;
    }
}
