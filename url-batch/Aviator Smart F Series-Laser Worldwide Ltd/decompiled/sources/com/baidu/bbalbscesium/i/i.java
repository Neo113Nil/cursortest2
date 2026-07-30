package com.baidu.bbalbscesium.i;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class i {

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    private static Class<?> a(Class<?> cls) {
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        throw new IllegalArgumentException(String.format("Don't know the wrapper type for primitive type %s.", cls));
    }

    public static Object b(Class<?> cls, Object[] objArr) {
        return (objArr == null || objArr.length <= 0) ? cls.newInstance() : a(cls, objArr);
    }

    private static Object a(Class<?> cls, Object[] objArr) {
        Constructor<?> constructor = null;
        for (Constructor<?> constructor2 : cls.getConstructors()) {
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            if (parameterTypes.length >= objArr.length) {
                int i8 = 0;
                int i9 = 0;
                while (i8 < objArr.length) {
                    Object obj = objArr[i8];
                    while (obj != null && i9 < parameterTypes.length) {
                        Class<?> cls2 = parameterTypes[i9];
                        if (cls2.isPrimitive()) {
                            cls2 = a(cls2);
                        }
                        if (cls2.isInstance(obj)) {
                            break;
                        }
                        i9++;
                    }
                    if (i9 == parameterTypes.length) {
                        break;
                    }
                    i9++;
                    i8++;
                }
                if (i8 != objArr.length) {
                    continue;
                } else if (constructor == null || parameterTypes.length < constructor.getParameterTypes().length) {
                    constructor = constructor2;
                } else if (parameterTypes.length == constructor.getParameterTypes().length) {
                    throw new IllegalArgumentException("Multiple consturctors match parameters");
                }
            }
        }
        if (constructor != null) {
            return constructor.newInstance(objArr);
        }
        return null;
    }

    public static String a(byte[] bArr) {
        byte[] a8 = com.baidu.bbalbscesium.k.a.g.a();
        return new String(com.baidu.bbalbscesium.k.a.c.a(a8, a8, bArr));
    }

    public static Method a(Class<?> cls, String str, Class<?>[] clsArr) {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
