package O0;

import android.content.Context;
import java.util.LinkedHashMap;

/* renamed from: O0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0404d {

    /* renamed from: a, reason: collision with root package name */
    private static q0 f1191a;

    private static synchronized q0 a() {
        q0 q0Var;
        synchronized (AbstractC0404d.class) {
            try {
                if (f1191a == null) {
                    f1191a = a0.d().c();
                }
                q0Var = f1191a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return q0Var;
    }

    public static void b(int i4, String str, LinkedHashMap linkedHashMap) {
        if (a() == null || !Z.b().a()) {
            return;
        }
        if (i4 == 1 || i4 == 0) {
            f1191a.b(i4, str, linkedHashMap);
            return;
        }
        j0.j("hmsSdk", "Data type no longer collects range.type: " + i4);
    }

    public static void c(Context context, String str, String str2) {
        if (a() != null) {
            f1191a.d(context, str, str2);
        }
    }

    public static void d(int i4, String str, LinkedHashMap linkedHashMap) {
        if (a() == null || !Z.b().a()) {
            return;
        }
        if (i4 == 1 || i4 == 0) {
            f1191a.f(i4, str, linkedHashMap);
            return;
        }
        j0.j("hmsSdk", "Data type no longer collects range.type: " + i4);
    }

    public static boolean e() {
        return a0.d().b();
    }

    public static void f() {
        if (a() == null || !Z.b().a()) {
            return;
        }
        f1191a.a(-1);
    }
}
