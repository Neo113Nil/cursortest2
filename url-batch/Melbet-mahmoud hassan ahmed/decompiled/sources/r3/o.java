package r3;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o {
    public static void a(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z6, @RecentlyNonNull Object obj) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z6, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (!z6) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(@RecentlyNonNull Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void e(@RecentlyNonNull String str) {
        if (!v3.p.a()) {
            throw new IllegalStateException(str);
        }
    }

    @RecentlyNonNull
    public static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    @RecentlyNonNull
    public static String g(String str, @RecentlyNonNull Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    public static void h(@RecentlyNonNull String str) {
        if (v3.p.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static <T> T i(T t6) {
        Objects.requireNonNull(t6, "null reference");
        return t6;
    }

    public static <T> T j(@RecentlyNonNull T t6, @RecentlyNonNull Object obj) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void k(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    public static void l(boolean z6, @RecentlyNonNull Object obj) {
        if (!z6) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
