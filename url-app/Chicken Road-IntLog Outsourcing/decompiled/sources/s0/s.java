package s0;

import android.util.Log;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f11791b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile s f11792c;

    /* renamed from: a, reason: collision with root package name */
    public final int f11793a;

    public s(int i2) {
        this.f11793a = i2;
    }

    public static s d() {
        s sVar;
        synchronized (f11791b) {
            try {
                if (f11792c == null) {
                    f11792c = new s(3);
                }
                sVar = f11792c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final void a(String str, String str2) {
        if (this.f11793a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (this.f11793a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void c(String str, String str2, Throwable th) {
        if (this.f11793a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void e(String str, String str2) {
        if (this.f11793a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void g(String str, String str2) {
        if (this.f11793a <= 5) {
            Log.w(str, str2);
        }
    }
}
