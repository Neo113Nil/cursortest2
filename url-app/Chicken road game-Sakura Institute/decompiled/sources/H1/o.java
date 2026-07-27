package H1;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3284a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3285b;

    /* renamed from: c, reason: collision with root package name */
    public static int f3286c;

    public static void a(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void c(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
