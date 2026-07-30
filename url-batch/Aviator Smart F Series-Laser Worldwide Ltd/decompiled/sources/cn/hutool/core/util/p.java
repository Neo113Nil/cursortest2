package cn.hutool.core.util;

import cn.hutool.core.convert.BasicType;
import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.lang.ClassScanner;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URL;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class p {
    public static boolean equals(Class<?> cls, String str, boolean z7) {
        if (cls == null || cn.hutool.core.text.l.isBlank(str)) {
            return false;
        }
        return z7 ? str.equalsIgnoreCase(cls.getName()) || str.equalsIgnoreCase(cls.getSimpleName()) : str.equals(cls.getName()) || str.equals(cls.getSimpleName());
    }

    public static <T> Class<T> getClass(T t7) {
        if (t7 == null) {
            return null;
        }
        return (Class<T>) t7.getClass();
    }

    public static ClassLoader getClassLoader() {
        return o.getClassLoader();
    }

    public static String getClassName(Object obj, boolean z7) {
        if (obj == null) {
            return null;
        }
        return getClassName(obj.getClass(), z7);
    }

    public static String getClassPath() {
        return getClassPath(false);
    }

    public static Set<String> getClassPathResources() {
        return getClassPathResources(false);
    }

    public static URL getClassPathURL() {
        return getResourceURL("");
    }

    public static Set<String> getClassPaths(String str) {
        return getClassPaths(str, false);
    }

    public static Class<?>[] getClasses(Object... objArr) {
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i8 = 0; i8 < objArr.length; i8++) {
            Object obj = objArr[i8];
            if (obj instanceof cn.hutool.core.bean.r) {
                clsArr[i8] = ((cn.hutool.core.bean.r) obj).getWrappedClass();
            } else if (obj == null) {
                clsArr[i8] = Object.class;
            } else {
                clsArr[i8] = obj.getClass();
            }
        }
        return clsArr;
    }

    public static ClassLoader getContextClassLoader() {
        return o.getContextClassLoader();
    }

    public static Field getDeclaredField(Class<?> cls, String str) {
        if (cls != null && !cn.hutool.core.text.l.isBlank(str)) {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
            }
        }
        return null;
    }

    public static Field[] getDeclaredFields(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.getDeclaredFields();
    }

    public static Method getDeclaredMethod(Class<?> cls, String str, Class<?>... clsArr) {
        return y0.getMethod(cls, str, clsArr);
    }

    public static Set<String> getDeclaredMethodNames(Class<?> cls) {
        return y0.getMethodNames(cls);
    }

    public static Method getDeclaredMethodOfObj(Object obj, String str, Object... objArr) {
        return getDeclaredMethod(obj.getClass(), str, getClasses(objArr));
    }

    public static Method[] getDeclaredMethods(Class<?> cls) {
        return y0.getMethods(cls);
    }

    public static Object getDefaultValue(Class<?> cls) {
        if (cls.isPrimitive()) {
            return getPrimitiveDefaultValue(cls);
        }
        return null;
    }

    public static Object[] getDefaultValues(Class<?>... clsArr) {
        Object[] objArr = new Object[clsArr.length];
        for (int i8 = 0; i8 < clsArr.length; i8++) {
            objArr[i8] = getDefaultValue(clsArr[i8]);
        }
        return objArr;
    }

    public static Class<?> getEnclosingClass(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public static String[] getJavaClassPaths() {
        return System.getProperty("java.class.path").split(System.getProperty("path.separator"));
    }

    public static URL getLocation(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.getProtectionDomain().getCodeSource().getLocation();
    }

    public static String getLocationPath(Class<?> cls) {
        URL location = getLocation(cls);
        if (location == null) {
            return null;
        }
        return location.getPath();
    }

    public static String getPackage(Class<?> cls) {
        String name;
        int lastIndexOf;
        return (cls == null || (lastIndexOf = (name = cls.getName()).lastIndexOf(".")) == -1) ? "" : name.substring(0, lastIndexOf);
    }

    public static String getPackagePath(Class<?> cls) {
        return getPackage(cls).replace('.', cn.hutool.core.io.file.c.UNIX_SEPARATOR);
    }

    public static Object getPrimitiveDefaultValue(Class<?> cls) {
        if (Long.TYPE == cls) {
            return 0L;
        }
        if (Integer.TYPE == cls) {
            return 0;
        }
        if (Short.TYPE == cls) {
            return (short) 0;
        }
        if (Character.TYPE == cls) {
            return (char) 0;
        }
        if (Byte.TYPE == cls) {
            return (byte) 0;
        }
        if (Double.TYPE == cls) {
            return Double.valueOf(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON);
        }
        if (Float.TYPE == cls) {
            return Float.valueOf(0.0f);
        }
        if (Boolean.TYPE == cls) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static Method getPublicMethod(Class<?> cls, String str, Class<?>... clsArr) {
        return y0.getPublicMethod(cls, str, clsArr);
    }

    public static Set<String> getPublicMethodNames(Class<?> cls) {
        return y0.getPublicMethodNames(cls);
    }

    public static Method[] getPublicMethods(Class<?> cls) {
        return y0.getPublicMethods(cls);
    }

    public static URL getResourceURL(String str) {
        return cn.hutool.core.io.resource.f.getResource(str);
    }

    public static URL getResourceUrl(String str, Class<?> cls) {
        return cn.hutool.core.io.resource.f.getResource(str, cls);
    }

    public static List<URL> getResources(String str) {
        return cn.hutool.core.io.resource.f.getResources(str);
    }

    public static String getShortClassName(String str) {
        List<String> split = cn.hutool.core.text.l.split((CharSequence) str, '.');
        if (split == null || split.size() < 2) {
            return str;
        }
        int size = split.size();
        StringBuilder builder = c1.builder();
        builder.append(split.get(0).charAt(0));
        int i8 = 1;
        while (true) {
            int i9 = size - 1;
            if (i8 >= i9) {
                builder.append('.');
                builder.append(split.get(i9));
                return builder.toString();
            }
            builder.append('.');
            builder.append(split.get(i8).charAt(0));
            i8++;
        }
    }

    public static Class<?> getTypeArgument(Class<?> cls) {
        return getTypeArgument(cls, 0);
    }

    public static <T> T invoke(String str, Object[] objArr) {
        return (T) invoke(str, false, objArr);
    }

    public static boolean isAbstract(Class<?> cls) {
        return Modifier.isAbstract(cls.getModifiers());
    }

    public static boolean isAbstractOrInterface(Class<?> cls) {
        return isAbstract(cls) || isInterface(cls);
    }

    public static boolean isAllAssignableFrom(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (h.isEmpty((Object[]) clsArr) && h.isEmpty((Object[]) clsArr2)) {
            return true;
        }
        if (clsArr == null || clsArr2 == null || clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i8 = 0; i8 < clsArr.length; i8++) {
            Class<?> cls = clsArr[i8];
            Class<?> cls2 = clsArr2[i8];
            if (isBasicType(cls) && isBasicType(cls2)) {
                if (BasicType.unWrap(cls) != BasicType.unWrap(cls2)) {
                    return false;
                }
            } else if (!cls.isAssignableFrom(cls2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAssignable(Class<?> cls, Class<?> cls2) {
        if (cls == null || cls2 == null) {
            return false;
        }
        if (cls.isAssignableFrom(cls2)) {
            return true;
        }
        if (cls.isPrimitive()) {
            return cls.equals(BasicType.WRAPPER_PRIMITIVE_MAP.get(cls2));
        }
        Class<?> cls3 = BasicType.PRIMITIVE_WRAPPER_MAP.get(cls2);
        return cls3 != null && cls.isAssignableFrom(cls3);
    }

    public static boolean isBasicType(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        return cls.isPrimitive() || isPrimitiveWrapper(cls);
    }

    public static boolean isEnum(Class<?> cls) {
        return cls != null && cls.isEnum();
    }

    public static boolean isInterface(Class<?> cls) {
        return cls.isInterface();
    }

    public static boolean isJdkClass(Class<?> cls) {
        Package r02 = cls.getPackage();
        if (r02 == null) {
            return false;
        }
        String name = r02.getName();
        return name.startsWith("java.") || name.startsWith("javax.") || cls.getClassLoader() == null;
    }

    public static boolean isNormalClass(Class<?> cls) {
        return (cls == null || cls.isInterface() || isAbstract(cls) || cls.isEnum() || cls.isArray() || cls.isAnnotation() || cls.isSynthetic() || cls.isPrimitive()) ? false : true;
    }

    public static boolean isNotPublic(Class<?> cls) {
        return !isPublic(cls);
    }

    public static boolean isPrimitiveWrapper(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        return BasicType.WRAPPER_PRIMITIVE_MAP.containsKey(cls);
    }

    public static boolean isPublic(Class<?> cls) {
        if (cls != null) {
            return Modifier.isPublic(cls.getModifiers());
        }
        throw new NullPointerException("Class to provided is null.");
    }

    public static boolean isSimpleTypeOrArray(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        return isSimpleValueType(cls) || (cls.isArray() && isSimpleValueType(cls.getComponentType()));
    }

    public static boolean isSimpleValueType(Class<?> cls) {
        return isBasicType(cls) || cls.isEnum() || CharSequence.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Date.class.isAssignableFrom(cls) || cls.equals(URI.class) || cls.equals(URL.class) || cls.equals(Locale.class) || cls.equals(Class.class) || cn.hutool.core.convert.l.a().isAssignableFrom(cls);
    }

    public static boolean isStatic(Method method) {
        cn.hutool.core.lang.q.notNull(method, "Method to provided is null.", new Object[0]);
        return Modifier.isStatic(method.getModifiers());
    }

    public static boolean isTopLevelClass(Class<?> cls) {
        return cls != null && getEnclosingClass(cls) == null;
    }

    public static <T> Class<T> loadClass(String str, boolean z7) {
        return (Class<T>) o.loadClass(str, z7);
    }

    public static Set<Class<?>> scanPackage() {
        return ClassScanner.scanPackage();
    }

    public static Set<Class<?>> scanPackageByAnnotation(String str, Class<? extends Annotation> cls) {
        return ClassScanner.scanPackageByAnnotation(str, cls);
    }

    public static Set<Class<?>> scanPackageBySuper(String str, Class<?> cls) {
        return ClassScanner.scanPackageBySuper(str, cls);
    }

    public static Method setAccessible(Method method) {
        if (method != null && !method.isAccessible()) {
            method.setAccessible(true);
        }
        return method;
    }

    public static String getClassPath(boolean z7) {
        URL classPathURL = getClassPathURL();
        return cn.hutool.core.io.l.normalize(z7 ? classPathURL.getPath() : g1.getDecodedPath(classPathURL));
    }

    public static Set<String> getClassPathResources(boolean z7) {
        return getClassPaths("", z7);
    }

    public static Set<String> getClassPaths(String str, boolean z7) {
        String replace = str.replace(".", "/");
        try {
            Enumeration<URL> resources = getClassLoader().getResources(replace);
            HashSet hashSet = new HashSet();
            while (resources.hasMoreElements()) {
                String path = resources.nextElement().getPath();
                if (z7) {
                    path = g1.decode(path, l.systemCharsetName());
                }
                hashSet.add(path);
            }
            return hashSet;
        } catch (IOException e8) {
            throw new UtilException(e8, "Loading classPath [{}] error!", replace);
        }
    }

    public static List<Method> getPublicMethods(Class<?> cls, cn.hutool.core.lang.a0 a0Var) {
        return y0.getPublicMethods(cls, a0Var);
    }

    public static Class<?> getTypeArgument(Class<?> cls, int i8) {
        return e1.getClass(e1.getTypeArgument(cls, i8));
    }

    public static <T> T invoke(String str, boolean z7, Object... objArr) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            throw new UtilException("Blank classNameDotMethodName!");
        }
        int lastIndexOf = str.lastIndexOf(35);
        if (lastIndexOf <= 0) {
            lastIndexOf = str.lastIndexOf(46);
        }
        if (lastIndexOf > 0) {
            return (T) invoke(str.substring(0, lastIndexOf), str.substring(lastIndexOf + 1), z7, objArr);
        }
        throw new UtilException("Invalid classNameWithMethodName [{}]!", str);
    }

    public static boolean isNotPublic(Method method) {
        return !isPublic(method);
    }

    public static <T> Class<T> loadClass(String str) {
        return loadClass(str, true);
    }

    public static Set<Class<?>> scanPackage(String str) {
        return ClassScanner.scanPackage(str);
    }

    public static String getClassName(Class<?> cls, boolean z7) {
        if (cls == null) {
            return null;
        }
        return z7 ? cls.getSimpleName() : cls.getName();
    }

    public static List<Method> getPublicMethods(Class<?> cls, Method... methodArr) {
        return y0.getPublicMethods(cls, methodArr);
    }

    public static boolean isPublic(Method method) {
        cn.hutool.core.lang.q.notNull(method, "Method to provided is null.", new Object[0]);
        return Modifier.isPublic(method.getModifiers());
    }

    public static Set<Class<?>> scanPackage(String str, cn.hutool.core.lang.a0 a0Var) {
        return ClassScanner.scanPackage(str, a0Var);
    }

    public static List<Method> getPublicMethods(Class<?> cls, String... strArr) {
        return y0.getPublicMethods(cls, strArr);
    }

    public static <T> T invoke(String str, String str2, Object[] objArr) {
        return (T) invoke(str, str2, false, objArr);
    }

    public static <T> T invoke(String str, String str2, boolean z7, Object... objArr) {
        Class loadClass = loadClass(str);
        try {
            Method declaredMethod = getDeclaredMethod(loadClass, str2, getClasses(objArr));
            if (declaredMethod != null) {
                if (isStatic(declaredMethod)) {
                    return (T) y0.invoke((Object) null, declaredMethod, objArr);
                }
                return (T) y0.invoke(z7 ? cn.hutool.core.lang.v0.get(loadClass, new Object[0]) : loadClass.newInstance(), declaredMethod, objArr);
            }
            throw new NoSuchMethodException(cn.hutool.core.text.l.format("No such method: [{}]", str2));
        } catch (Exception e8) {
            throw new UtilException(e8);
        }
    }
}
