package kotlin.jvm.internal;

import f4.InterfaceC0426c;
import java.util.Collection;
import t4.InterfaceC1430a;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;
import t4.InterfaceC1446q;
import t4.InterfaceC1447r;
import u4.InterfaceC1481a;
import u4.InterfaceC1482b;

/* loaded from: classes.dex */
public abstract class v {
    public static Collection a(Collection collection) {
        if (!(collection instanceof InterfaceC1481a) || (collection instanceof InterfaceC1482b)) {
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
        if (obj instanceof InterfaceC0426c) {
            return (obj instanceof f ? ((f) obj).getArity() : obj instanceof InterfaceC1430a ? 0 : obj instanceof InterfaceC1441l ? 1 : obj instanceof InterfaceC1445p ? 2 : obj instanceof InterfaceC1446q ? 3 : obj instanceof InterfaceC1447r ? 4 : -1) == i2;
        }
        return false;
    }

    public static void d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        i.j(classCastException, v.class.getName());
        throw classCastException;
    }
}
