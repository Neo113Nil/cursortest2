package G0;

import android.util.Log;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f822b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile s f823c;

    /* renamed from: a, reason: collision with root package name */
    public final int f824a;

    public s(int i2) {
        this.f824a = i2;
    }

    public static s d() {
        s sVar;
        synchronized (f822b) {
            try {
                if (f823c == null) {
                    f823c = new s(3);
                }
                sVar = f823c;
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
        if (this.f824a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (this.f824a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void c(String str, String str2, Throwable th) {
        if (this.f824a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void e(String str, String str2) {
        if (this.f824a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void g(String str, String str2) {
        if (this.f824a <= 5) {
            Log.w(str, str2);
        }
    }
}
