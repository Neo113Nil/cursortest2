package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes2.dex */
public final class fo {
    public static Object a(Object obj, Class cls) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(obj, Thread.currentThread(), Looper.myLooper()));
    }

    static class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final Object f8108a;

        /* renamed from: b, reason: collision with root package name */
        private final Thread f8109b;

        /* renamed from: c, reason: collision with root package name */
        private final Looper f8110c;

        public a(Object obj, Thread thread, Looper looper) {
            this.f8108a = obj;
            this.f8109b = thread;
            this.f8110c = looper;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, final Method method, final Object[] objArr) {
            if (this.f8109b == Thread.currentThread()) {
                return method.invoke(this.f8108a, objArr);
            }
            if (!method.getReturnType().equals(Void.TYPE)) {
                throw new UnsupportedOperationException("method not return void: " + method.getName());
            }
            Runnable runnable = new Runnable() { // from class: com.tapjoy.internal.fo.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        method.invoke(a.this.f8108a, objArr);
                    } catch (IllegalAccessException e) {
                        throw js.a(e);
                    } catch (IllegalArgumentException e2) {
                        throw js.a(e2);
                    } catch (InvocationTargetException e3) {
                        throw js.a(e3);
                    }
                }
            };
            if (this.f8110c != null && new Handler(this.f8110c).post(runnable)) {
                return null;
            }
            if (this.f8109b == gs.b() && gs.f8211a.a(runnable)) {
                return null;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null || !new Handler(mainLooper).post(runnable)) {
                return method.invoke(this.f8108a, objArr);
            }
            return null;
        }
    }
}
