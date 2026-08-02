package io.appmetrica.analytics.coreutils.internal.reflection;

import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class ReflectionUtils {
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    public static final boolean detectClassExists(String str) {
        return findClass(str) != null;
    }

    public static final Class<?> findClass(String str) {
        try {
            return Class.forName(str, false, ReflectionUtils.class.getClassLoader());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean isArgumentsOfClasses(Object[] objArr, Class<?>... clsArr) {
        if (objArr.length != clsArr.length) {
            return false;
        }
        int length = objArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            Object obj = objArr[i4];
            int i6 = i5 + 1;
            if (obj == null || !clsArr[i5].isAssignableFrom(obj.getClass())) {
                return false;
            }
            i4++;
            i5 = i6;
        }
        return true;
    }

    public static final <T> T loadAndInstantiateClassWithDefaultConstructor(String str, Class<T> cls) {
        Constructor<T> constructor;
        try {
            Class loadClass = loadClass(str, cls);
            if (loadClass != null && (constructor = loadClass.getConstructor(null)) != null) {
                return constructor.newInstance(null);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static final <T> Class<T> loadClass(String str, Class<T> cls) {
        try {
            Class<T> cls2 = (Class<T>) Class.forName(str);
            if (cls.isAssignableFrom(cls2)) {
                return cls2;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> T loadAndInstantiateClassWithDefaultConstructor(String str) {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
