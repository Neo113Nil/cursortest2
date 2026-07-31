package com.unity3d.player;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class ReflectionHelper {
    protected static boolean LOG = false;
    protected static final boolean LOGV = false;

    /* renamed from: a, reason: collision with root package name */
    private static final C1774s[] f22072a = new C1774s[Base64Utils.IO_BUFFER_SIZE];

    /* renamed from: b, reason: collision with root package name */
    private static long f22073b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static long f22074c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f22075d = false;

    protected static synchronized boolean beginProxyCall(long j4) {
        synchronized (ReflectionHelper.class) {
            if (j4 != f22073b) {
                return false;
            }
            f22074c++;
            return true;
        }
    }

    protected static Object createInvocationError(long j4, boolean z4) {
        return new C1776t(j4, z4);
    }

    protected static synchronized void endProxyCall() {
        synchronized (ReflectionHelper.class) {
            long j4 = f22074c - 1;
            f22074c = j4;
            if (0 == j4 && f22075d) {
                ReflectionHelper.class.notifyAll();
            }
        }
    }

    protected static synchronized void endUnityLaunch() {
        synchronized (ReflectionHelper.class) {
            try {
                f22073b++;
                f22075d = true;
                while (f22074c > 0) {
                    ReflectionHelper.class.wait();
                }
            } catch (InterruptedException unused) {
                h1.T.a(6, "Interrupted while waiting for all proxies to exit.");
            }
            f22075d = false;
        }
    }

    protected static Constructor getConstructorID(Class cls, String str) {
        Constructor<?> constructor;
        C1774s c1774s = new C1774s(cls, "", str);
        if (a(c1774s)) {
            constructor = (Constructor) c1774s.f22246e;
        } else {
            Class[] a4 = a(str);
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor2 = null;
            float f4 = 0.0f;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                Constructor<?> constructor3 = constructors[i4];
                float a5 = a(Void.TYPE, constructor3.getParameterTypes(), a4);
                if (a5 > f4) {
                    if (a5 == 1.0f) {
                        constructor2 = constructor3;
                        break;
                    }
                    constructor2 = constructor3;
                    f4 = a5;
                }
                i4++;
            }
            synchronized (ReflectionHelper.class) {
                c1774s.f22246e = constructor2;
                f22072a[c1774s.f22245d & 4095] = c1774s;
            }
            constructor = constructor2;
        }
        if (constructor != null) {
            return constructor;
        }
        throw new NoSuchMethodError("<init>" + str + " in class " + cls.getName());
    }

    protected static Field getFieldID(Class cls, String str, String str2, boolean z4) {
        Field field;
        C1774s c1774s = new C1774s(cls, str, str2);
        if (a(c1774s)) {
            field = (Field) c1774s.f22246e;
        } else {
            Class[] a4 = a(str2);
            float f4 = 0.0f;
            Field field2 = null;
            while (cls != null) {
                Field[] declaredFields = cls.getDeclaredFields();
                int length = declaredFields.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    Field field3 = declaredFields[i4];
                    if (z4 == Modifier.isStatic(field3.getModifiers()) && field3.getName().compareTo(str) == 0) {
                        float a5 = a(field3.getType(), null, a4);
                        if (a5 > f4) {
                            field2 = field3;
                            if (a5 == 1.0f) {
                                f4 = a5;
                                break;
                            }
                            f4 = a5;
                        } else {
                            continue;
                        }
                    }
                    i4++;
                }
                if (f4 == 1.0f || cls.isPrimitive() || cls.isInterface() || cls.equals(Object.class) || cls.equals(Void.TYPE)) {
                    break;
                }
                cls = cls.getSuperclass();
            }
            synchronized (ReflectionHelper.class) {
                c1774s.f22246e = field2;
                f22072a[c1774s.f22245d & 4095] = c1774s;
            }
            field = field2;
        }
        if (field != null) {
            return field;
        }
        throw new NoSuchFieldError("no " + (z4 ? "static" : "non-static") + " field with name='" + str + "' signature='" + str2 + "' in class L" + cls.getName() + ";");
    }

    protected static String getFieldSignature(Field field) {
        Class<?> type = field.getType();
        if (type.isPrimitive()) {
            String name = type.getName();
            return "boolean".equals(name) ? "Z" : "byte".equals(name) ? "B" : "char".equals(name) ? "C" : "double".equals(name) ? "D" : "float".equals(name) ? "F" : "int".equals(name) ? "I" : "long".equals(name) ? "J" : "short".equals(name) ? "S" : name;
        }
        if (type.isArray()) {
            return type.getName().replace(JwtParser.SEPARATOR_CHAR, '/');
        }
        return "L" + type.getName().replace(JwtParser.SEPARATOR_CHAR, '/') + ";";
    }

    protected static Method getMethodID(Class cls, String str, String str2, boolean z4) {
        Method method;
        C1774s c1774s = new C1774s(cls, str, str2);
        if (a(c1774s)) {
            method = (Method) c1774s.f22246e;
        } else {
            Class[] a4 = a(str2);
            Method method2 = null;
            float f4 = 0.0f;
            while (cls != null) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    Method method3 = declaredMethods[i4];
                    if (z4 == Modifier.isStatic(method3.getModifiers()) && method3.getName().compareTo(str) == 0) {
                        float a5 = a(method3.getReturnType(), method3.getParameterTypes(), a4);
                        if (a5 <= f4) {
                            continue;
                        } else {
                            if (a5 == 1.0f) {
                                method2 = method3;
                                f4 = a5;
                                break;
                            }
                            method2 = method3;
                            f4 = a5;
                        }
                    }
                    i4++;
                }
                if (f4 == 1.0f || cls.isPrimitive() || cls.isInterface() || cls.equals(Object.class) || cls.equals(Void.TYPE)) {
                    break;
                }
                cls = cls.getSuperclass();
            }
            synchronized (ReflectionHelper.class) {
                c1774s.f22246e = method2;
                f22072a[c1774s.f22245d & 4095] = c1774s;
            }
            method = method2;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("no " + (z4 ? "static" : "non-static") + " method with name='" + str + "' signature='" + str2 + "' in class L" + cls.getName() + ";");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyFinalize(long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native Object nativeProxyInvoke(long j4, String str, Object[] objArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyJNIFreeGCHandle(long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyLogJNIInvokeException(long j4);

    protected static Object newProxyInstance(UnityPlayer unityPlayer, long j4, Class cls) {
        return newProxyInstance(unityPlayer, j4, new Class[]{cls});
    }

    private static synchronized boolean a(C1774s c1774s) {
        synchronized (ReflectionHelper.class) {
            C1774s c1774s2 = f22072a[c1774s.f22245d & 4095];
            if (!c1774s.equals(c1774s2)) {
                return false;
            }
            c1774s.f22246e = c1774s2.f22246e;
            return true;
        }
    }

    protected static Object newProxyInstance(UnityPlayer unityPlayer, long j4, Class[] clsArr) {
        return Proxy.newProxyInstance(ReflectionHelper.class.getClassLoader(), clsArr, new C1772r(j4, unityPlayer));
    }

    private static float a(Class cls, Class cls2) {
        if (cls.equals(cls2)) {
            return 1.0f;
        }
        if (cls.isPrimitive() || cls2.isPrimitive()) {
            return 0.0f;
        }
        try {
            if (cls.asSubclass(cls2) != null) {
                return 0.5f;
            }
        } catch (ClassCastException unused) {
        }
        try {
            return cls2.asSubclass(cls) != null ? 0.1f : 0.0f;
        } catch (ClassCastException unused2) {
            return 0.0f;
        }
    }

    private static float a(Class cls, Class[] clsArr, Class[] clsArr2) {
        if (clsArr2.length == 0) {
            return 0.1f;
        }
        int i4 = 0;
        if ((clsArr == null ? 0 : clsArr.length) + 1 != clsArr2.length) {
            return 0.0f;
        }
        float f4 = 1.0f;
        if (clsArr != null) {
            int length = clsArr.length;
            float f5 = 1.0f;
            int i5 = 0;
            while (i4 < length) {
                f5 *= a(clsArr[i4], clsArr2[i5]);
                i4++;
                i5++;
            }
            f4 = f5;
        }
        return f4 * a(cls, clsArr2[clsArr2.length - 1]);
    }

    private static Class[] a(String str) {
        Class a4;
        int i4 = 0;
        int[] iArr = {0};
        ArrayList arrayList = new ArrayList();
        while (iArr[0] < str.length() && (a4 = a(str, iArr)) != null) {
            arrayList.add(a4);
        }
        Class[] clsArr = new Class[arrayList.size()];
        int size = arrayList.size();
        int i5 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            clsArr[i5] = (Class) obj;
            i5++;
        }
        return clsArr;
    }

    private static Class a(String str, int[] iArr) {
        while (iArr[0] < str.length()) {
            int i4 = iArr[0];
            iArr[0] = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt != '(' && charAt != ')') {
                if (charAt == 'L') {
                    int indexOf = str.indexOf(59, iArr[0]);
                    if (indexOf == -1) {
                        return null;
                    }
                    String substring = str.substring(iArr[0], indexOf);
                    iArr[0] = indexOf + 1;
                    try {
                        return Class.forName(substring.replace('/', JwtParser.SEPARATOR_CHAR));
                    } catch (ClassNotFoundException unused) {
                        return null;
                    }
                }
                if (charAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (charAt == 'I') {
                    return Integer.TYPE;
                }
                if (charAt == 'F') {
                    return Float.TYPE;
                }
                if (charAt == 'V') {
                    return Void.TYPE;
                }
                if (charAt == 'B') {
                    return Byte.TYPE;
                }
                if (charAt == 'C') {
                    return Character.TYPE;
                }
                if (charAt == 'S') {
                    return Short.TYPE;
                }
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'D') {
                    return Double.TYPE;
                }
                if (charAt == '[') {
                    return Array.newInstance((Class<?>) a(str, iArr), 0).getClass();
                }
                h1.T.a(5, "! parseType; " + charAt + " is not known!");
                return null;
            }
        }
        return null;
    }
}
