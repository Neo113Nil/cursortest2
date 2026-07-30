package cn.hutool.core.util;

import cn.hutool.core.convert.BasicType;
import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.map.SafeConcurrentHashMap;
import java.io.File;
import java.lang.reflect.Array;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class o {
    private static final String ARRAY_SUFFIX = "[]";
    private static final char INNER_CLASS_SEPARATOR = '$';
    private static final String INTERNAL_ARRAY_PREFIX = "[";
    private static final String NON_PRIMITIVE_ARRAY_PREFIX = "[L";
    private static final char PACKAGE_SEPARATOR = '.';
    private static final Map<String, Class<?>> PRIMITIVE_TYPE_NAME_MAP = new SafeConcurrentHashMap(32);

    static {
        ArrayList<Class<?>> arrayList = new ArrayList(32);
        arrayList.addAll(BasicType.PRIMITIVE_WRAPPER_MAP.keySet());
        arrayList.add(boolean[].class);
        arrayList.add(byte[].class);
        arrayList.add(char[].class);
        arrayList.add(double[].class);
        arrayList.add(float[].class);
        arrayList.add(int[].class);
        arrayList.add(long[].class);
        arrayList.add(short[].class);
        arrayList.add(Void.TYPE);
        for (Class<?> cls : arrayList) {
            PRIMITIVE_TYPE_NAME_MAP.put(cls.getName(), cls);
        }
    }

    private static Class<?> doLoadClass(String str, ClassLoader classLoader, boolean z7) {
        if (str.endsWith("[]")) {
            return Array.newInstance(loadClass(str.substring(0, str.length() - 2), classLoader, z7), 0).getClass();
        }
        if (str.startsWith(NON_PRIMITIVE_ARRAY_PREFIX) && str.endsWith(";")) {
            return Array.newInstance(loadClass(str.substring(2, str.length() - 1), classLoader, z7), 0).getClass();
        }
        if (str.startsWith(INTERNAL_ARRAY_PREFIX)) {
            return Array.newInstance(loadClass(str.substring(1), classLoader, z7), 0).getClass();
        }
        if (classLoader == null) {
            classLoader = getClassLoader();
        }
        try {
            return Class.forName(str, z7, classLoader);
        } catch (ClassNotFoundException e8) {
            Class<?> tryLoadInnerClass = tryLoadInnerClass(str, classLoader, z7);
            if (tryLoadInnerClass != null) {
                return tryLoadInnerClass;
            }
            throw new UtilException(e8);
        }
    }

    public static ClassLoader getClassLoader() {
        ClassLoader contextClassLoader = getContextClassLoader();
        if (contextClassLoader != null) {
            return contextClassLoader;
        }
        ClassLoader classLoader = o.class.getClassLoader();
        return classLoader == null ? getSystemClassLoader() : classLoader;
    }

    public static ClassLoader getContextClassLoader() {
        return System.getSecurityManager() == null ? Thread.currentThread().getContextClassLoader() : (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: cn.hutool.core.util.n
            @Override // java.security.PrivilegedAction
            public final Object run() {
                ClassLoader lambda$getContextClassLoader$0;
                lambda$getContextClassLoader$0 = o.lambda$getContextClassLoader$0();
                return lambda$getContextClassLoader$0;
            }
        });
    }

    public static cn.hutool.core.lang.c0 getJarClassLoader(File file) {
        return cn.hutool.core.lang.c0.load(file);
    }

    public static ClassLoader getSystemClassLoader() {
        return System.getSecurityManager() == null ? ClassLoader.getSystemClassLoader() : (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: cn.hutool.core.util.m
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ClassLoader.getSystemClassLoader();
            }
        });
    }

    public static boolean isPresent(String str) {
        return isPresent(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ClassLoader lambda$getContextClassLoader$0() {
        return Thread.currentThread().getContextClassLoader();
    }

    public static Class<?> loadClass(String str) {
        return loadClass(str, true);
    }

    public static Class<?> loadPrimitiveClass(String str) {
        if (cn.hutool.core.text.l.isNotBlank(str)) {
            String trim = str.trim();
            if (trim.length() <= 8) {
                return PRIMITIVE_TYPE_NAME_MAP.get(trim);
            }
        }
        return null;
    }

    private static Class<?> tryLoadInnerClass(String str, ClassLoader classLoader, boolean z7) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf <= 0) {
            return null;
        }
        try {
            return Class.forName(str.substring(0, lastIndexOf) + INNER_CLASS_SEPARATOR + str.substring(lastIndexOf + 1), z7, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static boolean isPresent(String str, ClassLoader classLoader) {
        try {
            loadClass(str, classLoader, false);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Class<?> loadClass(String str, boolean z7) {
        return loadClass(str, null, z7);
    }

    public static Class<?> loadClass(String str, ClassLoader classLoader, boolean z7) {
        cn.hutool.core.lang.q.notNull(str, "Name must not be null", new Object[0]);
        String replace = str.replace(cn.hutool.core.io.file.c.UNIX_SEPARATOR, PACKAGE_SEPARATOR);
        if (classLoader == null) {
            classLoader = getClassLoader();
        }
        Class<?> loadPrimitiveClass = loadPrimitiveClass(replace);
        return loadPrimitiveClass == null ? doLoadClass(replace, classLoader, z7) : loadPrimitiveClass;
    }

    public static Class<?> loadClass(File file, String str) {
        try {
            return getJarClassLoader(file).loadClass(str);
        } catch (ClassNotFoundException e8) {
            throw new UtilException(e8);
        }
    }
}
