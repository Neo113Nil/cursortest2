package o2;

import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {
    public static void a(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int c(int i7, int i8, int i9) {
        if (i7 < i8 || i7 >= i9) {
            throw new IndexOutOfBoundsException();
        }
        return i7;
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static <T> T e(T t6) {
        Objects.requireNonNull(t6);
        return t6;
    }

    public static void f(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    public static void g(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static <T> T h(T t6) {
        if (t6 != null) {
            return t6;
        }
        throw new IllegalStateException();
    }

    public static <T> T i(T t6, Object obj) {
        if (t6 != null) {
            return t6;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
