package com.anythink.expressad.atsignalcommon.c;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public class b {

    public interface a {
    }

    /* renamed from: com.anythink.expressad.atsignalcommon.c.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0111b<T> implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private T f18112a;

        private T a() {
            return this.f18112a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(this.f18112a, objArr);
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
                return null;
            } catch (IllegalArgumentException e9) {
                e9.printStackTrace();
                return null;
            } catch (InvocationTargetException e10) {
                throw e10.getTargetException();
            }
        }

        public final void a(T t9) {
            this.f18112a = t9;
        }
    }

    private b() {
    }

    private static <T> T a(Object obj, Class<T> cls, AbstractC0111b<T> abstractC0111b) {
        abstractC0111b.a(obj);
        return (T) Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls, a.class}, abstractC0111b);
    }

    public static <T> T a(Object obj, AbstractC0111b<T> abstractC0111b, Class<?>... clsArr) {
        abstractC0111b.a(obj);
        return (T) Proxy.newProxyInstance(b.class.getClassLoader(), clsArr, abstractC0111b);
    }
}
