package j0;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3182b {

    /* renamed from: a, reason: collision with root package name */
    private static long f40845a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f40846b;

    public static void a(String str) {
        AbstractC3183c.a(str);
    }

    public static void b() {
        AbstractC3183c.b();
    }

    private static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        boolean isEnabled;
        try {
            if (f40846b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return e();
    }

    private static boolean e() {
        try {
            if (f40846b == null) {
                f40845a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f40846b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f40846b.invoke(null, Long.valueOf(f40845a))).booleanValue();
        } catch (Exception e4) {
            c("isTagEnabled", e4);
            return false;
        }
    }
}
