package q;

import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.util.y0;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class q {
    public static MethodHandle findConstructor(Class<?> cls, Class<?>... clsArr) {
        MethodType methodType;
        methodType = MethodType.methodType((Class<?>) Void.TYPE, (Class<?>[]) clsArr);
        return findConstructor(cls, methodType);
    }

    public static MethodHandle findMethod(Class<?> cls, String str, MethodType methodType) {
        MethodHandle methodHandle;
        MethodHandle findSpecial;
        if (cn.hutool.core.text.l.isBlank(str)) {
            return findConstructor(cls, methodType);
        }
        MethodHandles.Lookup lookup = lookup(cls);
        try {
            methodHandle = lookup.findVirtual(cls, str, methodType);
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            methodHandle = null;
        }
        if (methodHandle == null) {
            try {
                methodHandle = lookup.findStatic(cls, str, methodType);
            } catch (IllegalAccessException | NoSuchMethodException unused2) {
            }
        }
        if (methodHandle != null) {
            return methodHandle;
        }
        try {
            findSpecial = lookup.findSpecial(cls, str, methodType, cls);
            return findSpecial;
        } catch (IllegalAccessException e8) {
            throw new UtilException(e8);
        } catch (NoSuchMethodException unused3) {
            return methodHandle;
        }
    }

    public static <T> T invoke(Object obj, Method method, Object... objArr) {
        return (T) invoke(false, obj, method, objArr);
    }

    public static <T> T invokeSpecial(Object obj, String str, Object... objArr) {
        cn.hutool.core.lang.q.notNull(obj, "Object to get method must be not null!", new Object[0]);
        cn.hutool.core.lang.q.notBlank(str, "Method name must be not blank!", new Object[0]);
        Method methodOfObj = y0.getMethodOfObj(obj, str, objArr);
        if (methodOfObj != null) {
            return (T) invokeSpecial(obj, methodOfObj, objArr);
        }
        throw new UtilException("No such method: [{}] from [{}]", str, obj.getClass());
    }

    public static MethodHandles.Lookup lookup(Class<?> cls) {
        return g.lookup(cls);
    }

    public static MethodHandle findConstructor(Class<?> cls, MethodType methodType) {
        MethodHandle findConstructor;
        try {
            findConstructor = lookup(cls).findConstructor(cls, methodType);
            return findConstructor;
        } catch (IllegalAccessException e8) {
            throw new UtilException(e8);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static <T> T invoke(boolean z7, Object obj, Method method, Object... objArr) {
        Object invokeWithArguments;
        cn.hutool.core.lang.q.notNull(method, "Method must be not null!", new Object[0]);
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookup = lookup(declaringClass);
        try {
            MethodHandle unreflectSpecial = z7 ? lookup.unreflectSpecial(method, declaringClass) : lookup.unreflect(method);
            if (obj != null) {
                unreflectSpecial = unreflectSpecial.bindTo(obj);
            }
            invokeWithArguments = unreflectSpecial.invokeWithArguments(objArr);
            return (T) invokeWithArguments;
        } catch (Throwable th) {
            throw new UtilException(th);
        }
    }

    public static <T> T invokeSpecial(Object obj, Method method, Object... objArr) {
        return (T) invoke(true, obj, method, objArr);
    }
}
