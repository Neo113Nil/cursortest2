package O0;

import java.util.Map;

/* renamed from: O0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0403c {
    public static void a(String str, String str2, long j4) {
        c0 i4 = i(str, str2);
        if (i4 != null) {
            i4.b(j4);
        }
    }

    public static boolean b(String str, String str2) {
        c0 i4 = i(str, str2);
        if (i4 != null) {
            return i4.f();
        }
        return true;
    }

    public static int c(String str, String str2) {
        c0 i4 = i(str, str2);
        if (i4 != null) {
            return i4.n();
        }
        return 7;
    }

    public static boolean d(String str, String str2) {
        c0 i4 = i(str, str2);
        if (i4 != null) {
            return i4.w();
        }
        return true;
    }

    public static String e(String str, String str2) {
        c0 i4 = i(str, str2);
        return i4 != null ? i4.t() : "";
    }

    public static boolean f(String str, String str2) {
        c0 i4 = i(str, str2);
        if (i4 != null) {
            return i4.y();
        }
        return false;
    }

    public static String g(String str, String str2) {
        c0 i4 = i(str, str2);
        return i4 != null ? i4.x() : "";
    }

    public static String h(String str, String str2) {
        c0 i4 = i(str, str2);
        return i4 != null ? i4.D() : "";
    }

    private static c0 i(String str, String str2) {
        J a4 = d0.e().a(str);
        if (a4 == null) {
            return null;
        }
        if (!"alltype".equals(str2)) {
            return a4.b(str2);
        }
        c0 b4 = a4.b("oper");
        return b4 == null ? a4.b("maint") : b4;
    }

    public static Map j(String str, String str2) {
        c0 i4 = i(str, str2);
        if (i4 != null) {
            return i4.A();
        }
        return null;
    }

    public static long k(String str, String str2) {
        c0 i4 = i(str, str2);
        if (i4 != null) {
            return i4.B();
        }
        return 0L;
    }

    public static int l(String str, String str2) {
        c0 i4 = i(str, str2);
        if (i4 != null) {
            return i4.g();
        }
        return 10;
    }

    public static String m(String str, String str2) {
        c0 i4 = i(str, str2);
        return i4 != null ? i4.E() : "";
    }

    public static String n(String str, String str2) {
        c0 i4 = i(str, str2);
        return i4 != null ? i4.G() : "";
    }

    public static String o(String str, String str2) {
        c0 i4 = i(str, str2);
        return i4 != null ? i4.C() : "";
    }

    public static String p(String str, String str2) {
        c0 i4 = i(str, str2);
        return i4 != null ? i4.F() : "";
    }
}
