package f2;

import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import e2.InterfaceC0428g;
import e2.InterfaceC0429h;
import g2.InterfaceC0439a;
import g2.InterfaceC0440b;
import g2.InterfaceC0441c;
import g2.InterfaceC0442d;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class x {
    public static Collection a(LinkedHashSet linkedHashSet) {
        if (!(linkedHashSet instanceof InterfaceC0439a) || (linkedHashSet instanceof InterfaceC0440b)) {
            return linkedHashSet;
        }
        f(linkedHashSet, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static List b(Object obj) {
        if ((obj instanceof InterfaceC0439a) && !(obj instanceof InterfaceC0441c)) {
            f(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e3) {
            j.i(e3, x.class.getName());
            throw e3;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof InterfaceC0439a) && !(obj instanceof InterfaceC0442d)) {
            f(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e3) {
            j.i(e3, x.class.getName());
            throw e3;
        }
    }

    public static void d(int i3, Object obj) {
        if (obj == null || e(i3, obj)) {
            return;
        }
        f(obj, "kotlin.jvm.functions.Function" + i3);
        throw null;
    }

    public static boolean e(int i3, Object obj) {
        int i4;
        if (!(obj instanceof R1.e)) {
            return false;
        }
        if (obj instanceof g) {
            i4 = ((g) obj).d();
        } else if (obj instanceof InterfaceC0422a) {
            i4 = 0;
        } else if (obj instanceof InterfaceC0424c) {
            i4 = 1;
        } else if (obj instanceof InterfaceC0426e) {
            i4 = 2;
        } else if (obj instanceof InterfaceC0427f) {
            i4 = 3;
        } else if (obj instanceof InterfaceC0428g) {
            i4 = 4;
        } else if (obj instanceof InterfaceC0429h) {
            i4 = 5;
        } else {
            boolean z3 = obj instanceof Q.a;
            i4 = z3 ? 6 : z3 ? 7 : z3 ? 8 : z3 ? 9 : z3 ? 10 : z3 ? 11 : z3 ? 13 : z3 ? 14 : z3 ? 15 : z3 ? 16 : z3 ? 17 : z3 ? 18 : z3 ? 19 : z3 ? 20 : z3 ? 21 : -1;
        }
        return i4 == i3;
    }

    public static void f(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        j.i(classCastException, x.class.getName());
        throw classCastException;
    }
}
