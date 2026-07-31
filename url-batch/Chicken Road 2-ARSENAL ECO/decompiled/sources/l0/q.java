package l0;

import android.util.Log;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5281b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile q f5282c;

    /* renamed from: a, reason: collision with root package name */
    public final int f5283a;

    public q(int i7) {
        this.f5283a = i7;
    }

    public static q d() {
        q qVar;
        synchronized (f5281b) {
            try {
                if (f5282c == null) {
                    f5282c = new q(3);
                }
                qVar = f5282c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
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
        if (this.f5283a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (this.f5283a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void c(String str, String str2, Throwable th) {
        if (this.f5283a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void e(String str, String str2) {
        if (this.f5283a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void g(String str, String str2) {
        if (this.f5283a <= 5) {
            Log.w(str, str2);
        }
    }
}
