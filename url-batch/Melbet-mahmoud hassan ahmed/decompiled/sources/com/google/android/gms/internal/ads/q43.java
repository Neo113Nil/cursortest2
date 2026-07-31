package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class q43 {
    public static int a(int i7, int i8, String str) {
        String b7;
        if (i7 >= 0 && i7 < i8) {
            return i7;
        }
        if (i7 < 0) {
            b7 = b53.b("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        } else {
            if (i8 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i8);
                throw new IllegalArgumentException(sb.toString());
            }
            b7 = b53.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IndexOutOfBoundsException(b7);
    }

    public static int b(int i7, int i8, String str) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(h(i7, i8, "index"));
        }
        return i7;
    }

    public static <T> T c(T t6, Object obj) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException((String) obj);
    }

    public static <T> T d(T t6, String str, Object obj) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException(b53.b(str, obj));
    }

    public static void e(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void f(int i7, int i8, int i9) {
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i9) ? h(i7, i9, "start index") : (i8 < 0 || i8 > i9) ? h(i8, i9, "end index") : b53.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7)));
        }
    }

    public static void g(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String h(int i7, int i8, String str) {
        if (i7 < 0) {
            return b53.b("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return b53.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i8);
        throw new IllegalArgumentException(sb.toString());
    }
}
