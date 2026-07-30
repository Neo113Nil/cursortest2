package com.baidu.ar;

import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class ab {
    public static Object a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Exception unused) {
            h.c("ReflectionUtils", "getNewInstance() className = " + str + " error!!!");
            return null;
        }
    }

    public static Object a(String str, String str2) {
        try {
            return Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            h.c("ReflectionUtils", "getSingleInstance() className = " + str + " error!!!");
            return null;
        }
    }

    public static Object a(String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            return a(a(str, clsArr), objArr);
        } catch (Exception unused) {
            h.c("ReflectionUtils", "getNewInstance(params) className = " + str + " error!!!");
            return null;
        }
    }

    public static Object a(Constructor<?> constructor, Object... objArr) {
        try {
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            h.c("ReflectionUtils", "getNewInstance() error!!!");
            return null;
        }
    }

    public static Constructor<?> a(String str, Class<?>... clsArr) {
        try {
            return Class.forName(str).getDeclaredConstructor(clsArr);
        } catch (Exception unused) {
            h.c("ReflectionUtils", "getSingleInstance() className = " + str + " error!!!");
            return null;
        }
    }

    public static boolean a(String str, ClassLoader classLoader) {
        try {
            return Class.forName(str, false, classLoader) != null;
        } catch (Exception unused) {
            h.c("ReflectionUtils", "isClassExist() class " + str + " is not exist!!!");
            return false;
        }
    }
}
