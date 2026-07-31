package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class d53 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f4074a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f4075b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f4076c;

    static {
        Object c7 = c();
        f4074a = c7;
        f4075b = c7 == null ? null : d("getStackTraceElement", Throwable.class, Integer.TYPE);
        f4076c = c7 != null ? e(c7) : null;
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void b(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    private static Object c() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e7) {
            throw e7;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e7) {
            throw e7;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Object obj) {
        try {
            Method d7 = d("getStackTraceDepth", Throwable.class);
            if (d7 == null) {
                return null;
            }
            d7.invoke(obj, new Throwable());
            return d7;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
