package o2;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    private static int f19783b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f19784c = true;

    /* renamed from: a, reason: collision with root package name */
    private static final Object f19782a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static a f19785d = a.f19786a;

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f19786a = new C0116a();

        /* renamed from: o2.r$a$a, reason: collision with other inner class name */
        class C0116a implements a {
            C0116a() {
            }

            @Override // o2.r.a
            public void a(String str, String str2) {
                Log.w(str, str2);
            }

            @Override // o2.r.a
            public void b(String str, String str2) {
                Log.i(str, str2);
            }

            @Override // o2.r.a
            public void c(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // o2.r.a
            public void d(String str, String str2) {
                Log.d(str, str2);
            }
        }

        void a(String str, String str2);

        void b(String str, String str2);

        void c(String str, String str2);

        void d(String str, String str2);
    }

    private static String a(String str, Throwable th) {
        String e7 = e(th);
        if (TextUtils.isEmpty(e7)) {
            return str;
        }
        return str + "\n  " + e7.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f19782a) {
            if (f19783b == 0) {
                f19785d.d(str, str2);
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f19782a) {
            if (f19783b <= 3) {
                f19785d.c(str, str2);
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    public static String e(Throwable th) {
        synchronized (f19782a) {
            if (th == null) {
                return null;
            }
            if (h(th)) {
                return "UnknownHostException (no network)";
            }
            if (f19784c) {
                return Log.getStackTraceString(th).trim().replace("\t", "    ");
            }
            return th.getMessage();
        }
    }

    public static void f(String str, String str2) {
        synchronized (f19782a) {
            if (f19783b <= 1) {
                f19785d.b(str, str2);
            }
        }
    }

    public static void g(String str, String str2, Throwable th) {
        f(str, a(str2, th));
    }

    private static boolean h(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void i(String str, String str2) {
        synchronized (f19782a) {
            if (f19783b <= 2) {
                f19785d.a(str, str2);
            }
        }
    }

    public static void j(String str, String str2, Throwable th) {
        i(str, a(str2, th));
    }
}
