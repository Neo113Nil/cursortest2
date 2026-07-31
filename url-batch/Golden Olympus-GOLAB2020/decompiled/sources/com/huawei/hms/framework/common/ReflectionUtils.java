package com.huawei.hms.framework.common;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes.dex */
public class ReflectionUtils {

    /* renamed from: a, reason: collision with root package name */
    private static int f14148a;

    private static Class a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static Object b(Object obj, Method method, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (RuntimeException e4) {
            Logger.e("ReflectionUtils", "RuntimeException in invoke:", e4);
            return null;
        } catch (Exception e5) {
            Logger.e("ReflectionUtils", "Exception in invoke:", e5);
            return null;
        }
    }

    private static void c(Class[] clsArr, Object obj, int i4) {
        if (obj instanceof Integer) {
            clsArr[i4] = Integer.TYPE;
            return;
        }
        if (obj instanceof Long) {
            clsArr[i4] = Long.TYPE;
            return;
        }
        if (obj instanceof Double) {
            clsArr[i4] = Double.TYPE;
            return;
        }
        if (obj instanceof Float) {
            clsArr[i4] = Float.TYPE;
            return;
        }
        if (obj instanceof Boolean) {
            clsArr[i4] = Boolean.TYPE;
            return;
        }
        if (obj instanceof Character) {
            clsArr[i4] = Character.TYPE;
            return;
        }
        if (obj instanceof Byte) {
            clsArr[i4] = Byte.TYPE;
            return;
        }
        if (obj instanceof Void) {
            clsArr[i4] = Void.TYPE;
        } else if (obj instanceof Short) {
            clsArr[i4] = Short.TYPE;
        } else {
            clsArr[i4] = obj.getClass();
        }
    }

    public static boolean checkCompatible(String str) {
        try {
            d(str);
            return true;
        } catch (Exception unused) {
            Logger.w("ReflectionUtils", str + "ClassNotFoundException");
            return false;
        }
    }

    private static void d(String str) {
        ClassLoader classLoader = ReflectionUtils.class.getClassLoader();
        if (classLoader == null) {
            throw new ClassNotFoundException("not found classloader");
        }
        classLoader.loadClass(str);
    }

    public static Field getField(Object obj, String str) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            try {
                final Field declaredField = obj.getClass().getDeclaredField(str);
                AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.ReflectionUtils.2
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        declaredField.setAccessible(true);
                        return null;
                    }
                });
                return declaredField;
            } catch (IllegalArgumentException e4) {
                Logger.e("ReflectionUtils", "Exception in getField :: IllegalArgumentException:", e4);
            } catch (NoSuchFieldException e5) {
                Logger.e("ReflectionUtils", "Exception in getField :: NoSuchFieldException:", e5);
            } catch (SecurityException e6) {
                Logger.e("ReflectionUtils", "not security int method getField,SecurityException:", e6);
            }
        }
        return null;
    }

    public static Object getFieldObj(Object obj, String str) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            try {
                final Field declaredField = obj.getClass().getDeclaredField(str);
                AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.ReflectionUtils.1
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        declaredField.setAccessible(true);
                        return null;
                    }
                });
                return declaredField.get(obj);
            } catch (IllegalAccessException e4) {
                Logger.e("ReflectionUtils", "Exception in getFieldObj :: IllegalAccessException:", e4);
            } catch (IllegalArgumentException e5) {
                Logger.e("ReflectionUtils", "Exception in getFieldObj :: IllegalArgumentException:", e5);
            } catch (NoSuchFieldException e6) {
                Logger.e("ReflectionUtils", "Exception in getFieldObj :: NoSuchFieldException:", e6);
            } catch (SecurityException e7) {
                Logger.e("ReflectionUtils", "not security int method getFieldObj,SecurityException:", e7);
            }
        }
        return null;
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls == null || str == null) {
            Logger.w("ReflectionUtils", "targetClass is  null pr name is null:");
            return null;
        }
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e4) {
            Logger.e("ReflectionUtils", "NoSuchMethodException:", e4);
            return null;
        } catch (SecurityException e5) {
            Logger.e("ReflectionUtils", "SecurityException:", e5);
            return null;
        }
    }

    public static Object getStaticFieldObj(String str, String str2) {
        Class a4;
        if (str != null && (a4 = a(str)) != null && !TextUtils.isEmpty(str2)) {
            try {
                final Field declaredField = a4.getDeclaredField(str2);
                AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.ReflectionUtils.3
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        declaredField.setAccessible(true);
                        return null;
                    }
                });
                return declaredField.get(a4);
            } catch (IllegalAccessException e4) {
                Logger.e("ReflectionUtils", "Exception in getFieldObj :: IllegalAccessException:", e4);
            } catch (IllegalArgumentException e5) {
                Logger.e("ReflectionUtils", "Exception in getFieldObj :: IllegalArgumentException:", e5);
            } catch (NoSuchFieldException e6) {
                Logger.e("ReflectionUtils", "Exception in getFieldObj :: NoSuchFieldException:", e6);
            } catch (SecurityException e7) {
                Logger.e("ReflectionUtils", "not security int method getStaticFieldObj,SecurityException:", e7);
            }
        }
        return null;
    }

    public static Object invokeStaticMethod(String str, String str2, Object... objArr) {
        Class[] clsArr;
        if (str == null) {
            return null;
        }
        if (objArr != null) {
            int length = objArr.length;
            clsArr = new Class[length];
            for (int i4 = 0; i4 < length; i4++) {
                c(clsArr, objArr[i4], i4);
            }
        } else {
            clsArr = null;
        }
        Method method = getMethod(a(str), str2, clsArr);
        if (method == null) {
            return null;
        }
        return b(null, method, objArr);
    }

    public static boolean isAbTestEnable() {
        int i4 = f14148a;
        if (i4 != 0) {
            return i4 == 2;
        }
        boolean checkCompatible = checkCompatible("com.huawei.hms.network.abtest.ABHelper");
        f14148a = checkCompatible ? 2 : 1;
        return checkCompatible;
    }

    public static boolean checkCompatible(String str, String str2, Class<?>... clsArr) {
        try {
            if (str == null || str2 == null) {
                Logger.w("ReflectionUtils", "targetClass is  null or name is null:");
                return false;
            }
            Class.forName(str).getDeclaredMethod(str2, clsArr);
            Logger.v("ReflectionUtils", "has method : " + str2);
            return true;
        } catch (RuntimeException unused) {
            Logger.w("ReflectionUtils", str + " RuntimeException");
            return false;
        } catch (Exception unused2) {
            Logger.w("ReflectionUtils", str2 + " NoSuchMethodException");
            return false;
        }
    }

    public static Object invokeStaticMethod(String str, String str2, Class<?>[] clsArr, Object... objArr) {
        Method method = getMethod(a(str), str2, clsArr);
        if (method == null) {
            return null;
        }
        return b(null, method, objArr);
    }
}
