package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hag {
    public static final /* synthetic */ int a = 0;
    private static final Object b;

    static {
        Object obj = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (Throwable th) {
            d(th);
        }
        b = obj;
        if (obj != null) {
            c("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    public static void a(Throwable th, Class cls) {
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    public static void b(Throwable th) {
        th.getClass();
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    private static Method c(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (Throwable th) {
            d(th);
            return null;
        }
    }

    private static void d(Throwable th) {
        if (th.getClass().getName().equals("java.lang.ThreadDeath")) {
            throw ((Error) th);
        }
    }

    private static void e(Object obj) {
        try {
            Method c = c("getStackTraceDepth", Throwable.class);
            if (c == null) {
                return;
            }
            c.invoke(obj, new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
    }
}
