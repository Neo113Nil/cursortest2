package O0;

/* loaded from: classes.dex */
public abstract class r0 {
    public static String a(String str, String str2) {
        D c4 = c(str, str2);
        return c4 != null ? c4.a() : "";
    }

    public static boolean b(String str, String str2) {
        D c4 = c(str, str2);
        return c4 != null && c4.h();
    }

    private static D c(String str, String str2) {
        c0 b4;
        J a4 = d0.e().a(str);
        if (a4 == null || (b4 = a4.b(str2)) == null) {
            return null;
        }
        return b4.z();
    }

    public static String d(String str, String str2) {
        D c4 = c(str, str2);
        return c4 != null ? c4.c() : "";
    }

    public static boolean e(String str, String str2) {
        D c4 = c(str, str2);
        return c4 != null && c4.i();
    }

    public static boolean f(String str, String str2) {
        c0 b4;
        J a4 = d0.e().a(str);
        if (a4 == null || (b4 = a4.b(str2)) == null) {
            return false;
        }
        return b4.m();
    }

    public static String g(String str, String str2) {
        D c4 = c(str, str2);
        return c4 != null ? c4.g() : "";
    }

    public static boolean h(String str, String str2) {
        D c4 = c(str, str2);
        return c4 != null && c4.j();
    }

    public static boolean i(String str, String str2) {
        c0 b4;
        J a4 = d0.e().a(str);
        if (a4 == null || (b4 = a4.b(str2)) == null) {
            return false;
        }
        return b4.s();
    }

    public static String j(String str, String str2) {
        D c4 = c(str, str2);
        return c4 != null ? c4.e() : "";
    }

    public static boolean k(String str, String str2) {
        D c4 = c(str, str2);
        return c4 != null && c4.k();
    }
}
