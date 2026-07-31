package kotlin.jvm.internal;

import java.util.Collection;
import k5.InterfaceC0473c;
import x5.InterfaceC0732a;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;
import x5.InterfaceC0748q;
import x5.InterfaceC0749r;
import y5.InterfaceC0766a;
import y5.InterfaceC0767b;

/* loaded from: classes.dex */
public abstract class v {
    public static Collection a(Collection collection) {
        if (!(collection instanceof InterfaceC0766a) || (collection instanceof InterfaceC0767b)) {
            return collection;
        }
        d(collection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static void b(int i7, Object obj) {
        if (obj == null || c(i7, obj)) {
            return;
        }
        d(obj, "kotlin.jvm.functions.Function" + i7);
        throw null;
    }

    public static boolean c(int i7, Object obj) {
        if (obj instanceof InterfaceC0473c) {
            if ((obj instanceof f ? ((f) obj).getArity() : obj instanceof InterfaceC0732a ? 0 : obj instanceof InterfaceC0743l ? 1 : obj instanceof InterfaceC0747p ? 2 : obj instanceof InterfaceC0748q ? 3 : obj instanceof InterfaceC0749r ? 4 : -1) == i7) {
                return true;
            }
        }
        return false;
    }

    public static void d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        i.j(classCastException, v.class.getName());
        throw classCastException;
    }
}
