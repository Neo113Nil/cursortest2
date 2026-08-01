package t5;

import android.util.Log;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f9312b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile o f9313c;

    /* renamed from: a, reason: collision with root package name */
    public final int f9314a;

    public o(int i3) {
        this.f9314a = i3;
    }

    public static o d() {
        o oVar;
        synchronized (f9312b) {
            try {
                if (f9313c == null) {
                    f9313c = new o(3);
                }
                oVar = f9313c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final void a(String str, String str2) {
        if (this.f9314a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (this.f9314a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void c(String str, String str2, Throwable th) {
        if (this.f9314a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void e(String str, String str2) {
        if (this.f9314a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void g(String str, String str2) {
        if (this.f9314a <= 5) {
            Log.w(str, str2);
        }
    }
}
