package O0;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    private static L f1228a = new L();

    public static void a(int i4) {
        f1228a.b(i4);
    }

    public static void b(String str, String str2) {
        if (!d() || str == null || str2 == null) {
            return;
        }
        f1228a.d(3, str, str2);
    }

    public static void c(String str, String str2, Object... objArr) {
        if (!i() || str == null || str2 == null) {
            return;
        }
        f1228a.d(4, str, String.format(str2, objArr));
    }

    private static boolean d() {
        return f1228a.e(3);
    }

    public static void e(String str, String str2) {
        if (!g() || str == null || str2 == null) {
            return;
        }
        f1228a.d(6, str, str2);
    }

    public static void f(String str, String str2, Object... objArr) {
        j(str, String.format(str2, objArr));
    }

    private static boolean g() {
        return f1228a.e(6);
    }

    public static void h(String str, String str2) {
        if (!i() || str == null || str2 == null) {
            return;
        }
        f1228a.d(4, str, str2);
    }

    private static boolean i() {
        return f1228a.e(4);
    }

    public static void j(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f1228a.d(4, str, str2);
    }

    private static boolean k() {
        return f1228a.e(5);
    }

    public static void l(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f1228a.d(5, str, str2);
    }

    public static void m(String str, String str2) {
        if (!k() || str == null || str2 == null) {
            return;
        }
        f1228a.d(5, str, str2);
    }
}
