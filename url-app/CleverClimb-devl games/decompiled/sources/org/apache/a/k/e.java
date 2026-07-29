package org.apache.a.k;

import java.lang.reflect.Method;

/* compiled from: ExceptionUtils.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    static Class f9992a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f9993b = a();

    static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static Method a() {
        Class<?> cls;
        Class cls2;
        try {
            Class<?>[] clsArr = new Class[1];
            if (f9992a == null) {
                cls = a("java.lang.Throwable");
                f9992a = cls;
            } else {
                cls = f9992a;
            }
            clsArr[0] = cls;
            if (f9992a == null) {
                cls2 = a("java.lang.Throwable");
                f9992a = cls2;
            } else {
                cls2 = f9992a;
            }
            return cls2.getMethod("initCause", clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static void a(Throwable th, Throwable th2) {
        if (f9993b != null) {
            try {
                f9993b.invoke(th, th2);
            } catch (Exception unused) {
            }
        }
    }
}
