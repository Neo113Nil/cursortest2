package kotlin.jvm.internal;

import f6.o;
import f6.p;
import f6.q;
import f6.r;
import f6.s;
import f6.t;
import f6.u;
import f6.v;
import f6.w;

/* loaded from: classes.dex */
public class n {
    public static Object a(Object obj, int i7) {
        if (obj != null && !c(obj, i7)) {
            f(obj, "kotlin.jvm.functions.Function" + i7);
        }
        return obj;
    }

    public static int b(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).getArity();
        }
        if (obj instanceof f6.a) {
            return 0;
        }
        if (obj instanceof f6.l) {
            return 1;
        }
        if (obj instanceof p) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        if (obj instanceof s) {
            return 5;
        }
        if (obj instanceof t) {
            return 6;
        }
        if (obj instanceof u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof f6.b) {
            return 10;
        }
        if (obj instanceof f6.c) {
            return 11;
        }
        if (obj instanceof f6.d) {
            return 12;
        }
        if (obj instanceof f6.e) {
            return 13;
        }
        if (obj instanceof f6.f) {
            return 14;
        }
        if (obj instanceof f6.g) {
            return 15;
        }
        if (obj instanceof f6.h) {
            return 16;
        }
        if (obj instanceof f6.i) {
            return 17;
        }
        if (obj instanceof f6.j) {
            return 18;
        }
        if (obj instanceof f6.k) {
            return 19;
        }
        if (obj instanceof f6.m) {
            return 20;
        }
        if (obj instanceof f6.n) {
            return 21;
        }
        return obj instanceof o ? 22 : -1;
    }

    public static boolean c(Object obj, int i7) {
        return (obj instanceof v5.c) && b(obj) == i7;
    }

    private static <T extends Throwable> T d(T t6) {
        return (T) i.h(t6, n.class.getName());
    }

    public static ClassCastException e(ClassCastException classCastException) {
        throw ((ClassCastException) d(classCastException));
    }

    public static void f(Object obj, String str) {
        g((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void g(String str) {
        throw e(new ClassCastException(str));
    }
}
