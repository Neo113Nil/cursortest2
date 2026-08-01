package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: X2CUtils.java */
/* loaded from: classes.dex */
public class dX {
    private static Map<String, Method> icD = new HashMap();
    public static final Class<?>[] pvs;
    private static final HashMap<Class<?>, Class<?>> vG;

    static {
        HashMap<Class<?>, Class<?>> hashMap = new HashMap<>();
        vG = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Void.TYPE, Void.class);
        pvs = new Class[0];
    }

    public static int pvs(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private static String icD(Class<?> cls, String str, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString()).append("#").append(str).append("#").append(cls.getClassLoader() != null ? Integer.valueOf(cls.getClassLoader().hashCode()) : "");
        if (clsArr != null && clsArr.length > 0) {
            for (Class<?> cls2 : clsArr) {
                sb.append(cls2.toString()).append("#");
            }
        } else {
            sb.append(Void.class.toString());
        }
        return sb.toString();
    }

    public static Method pvs(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        String icD2 = icD(cls, str, clsArr);
        synchronized (icD) {
            method = icD.get(icD2);
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        while (cls != null) {
            try {
                method = cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
            if (method == null) {
                try {
                    for (Method method2 : cls.getDeclaredMethods()) {
                        if (method2 != null && TextUtils.equals(method2.getName(), str)) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            if (clsArr != null && parameterTypes != null && clsArr.length == parameterTypes.length) {
                                boolean z = true;
                                for (int i = 0; i < clsArr.length; i++) {
                                    if (!pvs(clsArr[i], parameterTypes[i])) {
                                        z = false;
                                    }
                                }
                                if (z) {
                                    method = method2;
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (method != null) {
                method.setAccessible(true);
                synchronized (icD) {
                    icD.put(icD2, method);
                }
                return method;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public static boolean pvs(Class<?> cls, Class<?> cls2) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (cls.isPrimitive() && !cls2.isPrimitive()) {
            cls = vG.get(cls);
        }
        if (cls2.isPrimitive() && !cls.isPrimitive()) {
            cls2 = vG.get(cls2);
        }
        return cls2.isAssignableFrom(cls);
    }

    public static Object pvs(Object obj, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return pvs(obj, str, objArr, pvs(objArr));
    }

    public static Object pvs(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method pvs2 = pvs(obj.getClass(), str, clsArr);
        if (pvs2 != null) {
            return pvs2.invoke(obj, objArr);
        }
        throw new NoSuchMethodException(str);
    }

    public static Class<?>[] pvs(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                clsArr[i] = obj == null ? null : obj.getClass();
            }
            return clsArr;
        }
        return pvs;
    }

    public static int pvs(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
