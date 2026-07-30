package O2;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2482a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2483b;

    /* renamed from: c, reason: collision with root package name */
    public static int f2484c;

    public static void a(String str, boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            AbstractC5051n.j(sb, "Must be called on ", name2, " thread, but got ", name);
            sb.append(com.anythink.core.common.d.j.f12535z);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void d(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void g(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void j(String str, boolean z8) {
        if (!z8) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void k(boolean z8) {
        if (!z8) {
            throw new IllegalStateException();
        }
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
