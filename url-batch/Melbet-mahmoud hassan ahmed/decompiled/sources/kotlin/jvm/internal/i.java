package kotlin.jvm.internal;

import java.util.Arrays;
import v5.p;

/* loaded from: classes.dex */
public class i {
    private i() {
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj == null) {
            j();
        }
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) g(new NullPointerException(str + " must not be null")));
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            k(str);
        }
    }

    public static int e(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        return i7 == i8 ? 0 : 1;
    }

    private static String f(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    private static <T extends Throwable> T g(T t6) {
        return (T) h(t6, i.class.getName());
    }

    static <T extends Throwable> T h(T t6, String str) {
        StackTraceElement[] stackTrace = t6.getStackTrace();
        int length = stackTrace.length;
        int i7 = -1;
        for (int i8 = 0; i8 < length; i8++) {
            if (str.equals(stackTrace[i8].getClassName())) {
                i7 = i8;
            }
        }
        t6.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i7 + 1, length));
        return t6;
    }

    public static String i(String str, Object obj) {
        return str + obj;
    }

    public static void j() {
        throw ((NullPointerException) g(new NullPointerException()));
    }

    private static void k(String str) {
        throw ((NullPointerException) g(new NullPointerException(f(str))));
    }

    public static void l(String str) {
        throw ((p) g(new p(str)));
    }

    public static void m(String str) {
        l("lateinit property " + str + " has not been initialized");
    }
}
