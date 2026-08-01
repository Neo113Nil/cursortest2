package com.pgl.ssdk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: ReflectionUtil.java */
/* loaded from: classes3.dex */
public final class J {
    private static Method a;
    private static Method b;
    private static Method c;

    static {
        try {
            a = Class.class.getDeclaredMethod("forName", String.class);
            b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            c = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        } catch (NoSuchMethodException | NullPointerException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[Catch: all -> 0x0024, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0001, B:10:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(Object obj, Class cls, String str, Object obj2) {
        Field field;
        try {
            if (a()) {
                try {
                    field = (Field) c.invoke(cls, str);
                    try {
                        field.setAccessible(true);
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
                if (field != null) {
                    return null;
                }
                field.setAccessible(true);
                return field.get(null);
            }
            field = null;
            if (field != null) {
            }
        } catch (Throwable unused3) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f A[Catch: all -> 0x0023, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0023, blocks: (B:3:0x0001, B:7:0x001f), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(Object obj, Class cls, String str, Class[] clsArr, Object... objArr) {
        Method method;
        try {
            if (a()) {
                try {
                    method = (Method) b.invoke(cls, str, clsArr);
                    try {
                        method.setAccessible(true);
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
                if (method == null) {
                    return method.invoke(obj, objArr);
                }
                return null;
            }
            method = null;
            if (method == null) {
            }
        } catch (Throwable unused3) {
            return null;
        }
    }

    private static boolean a() {
        return (a == null || b == null || c == null) ? false : true;
    }
}
