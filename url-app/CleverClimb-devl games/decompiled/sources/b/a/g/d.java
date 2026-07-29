package b.a.g;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: OptionalMethod.java */
/* loaded from: classes.dex */
class d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f2016a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2017b;

    /* renamed from: c, reason: collision with root package name */
    private final Class[] f2018c;

    public d(Class<?> cls, String str, Class... clsArr) {
        this.f2016a = cls;
        this.f2017b = str;
        this.f2018c = clsArr;
    }

    public boolean a(T t) {
        return a(t.getClass()) != null;
    }

    public Object a(T t, Object... objArr) throws InvocationTargetException {
        Method a2 = a(t.getClass());
        if (a2 == null) {
            return null;
        }
        try {
            return a2.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public Object b(T t, Object... objArr) {
        try {
            return a(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object c(T t, Object... objArr) throws InvocationTargetException {
        Method a2 = a(t.getClass());
        if (a2 == null) {
            throw new AssertionError("Method " + this.f2017b + " not supported for object " + t);
        }
        try {
            return a2.invoke(t, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a2);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public Object d(T t, Object... objArr) {
        try {
            return c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private Method a(Class<?> cls) {
        if (this.f2017b == null) {
            return null;
        }
        Method a2 = a(cls, this.f2017b, this.f2018c);
        if (a2 == null || this.f2016a == null || this.f2016a.isAssignableFrom(a2.getReturnType())) {
            return a2;
        }
        return null;
    }

    private static Method a(Class<?> cls, String str, Class[] clsArr) {
        Method method;
        try {
            method = cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
        }
        try {
            if ((method.getModifiers() & 1) != 0) {
                return method;
            }
            return null;
        } catch (NoSuchMethodException unused2) {
            return method;
        }
    }
}
