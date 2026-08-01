package c7;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f1872a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f1873b;

    /* renamed from: c, reason: collision with root package name */
    public static int f1874c;

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        a1.e(str);
    }

    public static void b(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            n0.l.l(sb2, "Must be called on ", name2, " thread, but got ", name);
            sb2.append(".");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            a1.e("Given String is empty or null");
        }
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            a1.e(str2);
        }
    }

    public static void f(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        kotlin.collections.i0.l(str);
    }

    public static void g(Object obj) {
        if (obj != null) {
            return;
        }
        a2.r.j("null reference");
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        a2.r.j(str);
    }

    public static void i(String str, boolean z10) {
        if (z10) {
            return;
        }
        kotlin.collections.i0.l(str);
    }

    public static void j(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
