package bitter.jnibridge;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f13307a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public long f13308b;

    public a(long j4) {
        this.f13308b = j4;
    }

    public static Object a(Object obj, Method method, Object[] objArr) {
        MethodHandles.Lookup lookup;
        MethodType methodType;
        MethodHandle findSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        if (objArr == null) {
            objArr = new Object[0];
        }
        Class<?> declaringClass = method.getDeclaringClass();
        try {
            lookup = MethodHandles.lookup();
            String name = method.getName();
            methodType = MethodType.methodType((Class<?>) method.getReturnType(), (Class<?>[]) method.getParameterTypes());
            findSpecial = lookup.findSpecial(declaringClass, name, methodType, obj.getClass());
            bindTo = findSpecial.bindTo(obj);
            invokeWithArguments = bindTo.invokeWithArguments(objArr);
            return invokeWithArguments;
        } catch (Exception e4) {
            System.err.println("JNIBridge error calling default method: " + e4.getMessage());
            return null;
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        synchronized (this.f13307a) {
            long j4 = this.f13308b;
            if (j4 == 0) {
                return null;
            }
            try {
                return JNIBridge.invoke(j4, method.getDeclaringClass(), method, objArr);
            } catch (NoSuchMethodError e4) {
                if (method.isDefault()) {
                    return a(obj, method, objArr);
                }
                System.err.println("JNIBridge error: Java interface default methods are only supported since Android Oreo");
                throw e4;
            }
        }
    }
}
