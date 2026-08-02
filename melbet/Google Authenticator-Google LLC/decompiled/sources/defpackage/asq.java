package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asq {
    public static final Object a = new Object();
    public static volatile asq b;
    private final int c;

    public asq(int i) {
        this.c = i;
    }

    public static asq a() {
        asq asqVar;
        synchronized (a) {
            if (b == null) {
                b = new asq(3);
            }
            asqVar = b;
        }
        return asqVar;
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (str.length() >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final void c(String str, String str2) {
        if (this.c <= 6) {
            Log.e(str, str2);
        }
    }

    public final void d(String str, String str2, Throwable th) {
        if (this.c <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void e(String str, String str2) {
        if (this.c <= 5) {
            Log.w(str, str2);
        }
    }

    public final void f(String str, String str2, Throwable th) {
        if (this.c <= 5) {
            Log.w(str, str2, th);
        }
    }
}
