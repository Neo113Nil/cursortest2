package bitter.jnibridge;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
final class a implements InvocationHandler {
    private Object[] a = new Object[0];
    private long b;
    private Constructor c;

    public a(long j) {
        this.b = j;
        try {
            Constructor declaredConstructor = a$$ExternalSyntheticApiModelOutline5.m().getDeclaredConstructor(Class.class, Integer.TYPE);
            this.c = declaredConstructor;
            declaredConstructor.setAccessible(true);
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            this.c = null;
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        MethodHandles.Lookup in;
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        synchronized (this.a) {
            long j = this.b;
            if (j == 0) {
                return null;
            }
            try {
                return JNIBridge.invoke(j, method.getDeclaringClass(), method, objArr);
            } catch (NoSuchMethodError e) {
                if (this.c == null) {
                    System.err.println("JNIBridge error: Java interface default methods are only supported since Android Oreo");
                    throw e;
                }
                if ((method.getModifiers() & 1024) != 0) {
                    throw e;
                }
                if (objArr == null) {
                    objArr = new Object[0];
                }
                Class<?> declaringClass = method.getDeclaringClass();
                in = a$$ExternalSyntheticApiModelOutline0.m(this.c.newInstance(declaringClass, 2)).in(declaringClass);
                unreflectSpecial = in.unreflectSpecial(method, declaringClass);
                bindTo = unreflectSpecial.bindTo(obj);
                invokeWithArguments = bindTo.invokeWithArguments(objArr);
                return invokeWithArguments;
            }
        }
    }
}
