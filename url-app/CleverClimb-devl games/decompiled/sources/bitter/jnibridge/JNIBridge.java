package bitter.jnibridge;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public class JNIBridge {

    private static class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private Object f2173a = new Object[0];

        /* renamed from: b, reason: collision with root package name */
        private long f2174b;

        public a(long j) {
            this.f2174b = j;
        }

        public final void a() {
            synchronized (this.f2173a) {
                this.f2174b = 0L;
            }
        }

        public final void finalize() {
            synchronized (this.f2173a) {
                if (this.f2174b == 0) {
                    return;
                }
                JNIBridge.delete(this.f2174b);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            synchronized (this.f2173a) {
                if (this.f2174b == 0) {
                    return null;
                }
                return JNIBridge.invoke(this.f2174b, method.getDeclaringClass(), method, objArr);
            }
        }
    }

    static native void delete(long j);

    static void disableInterfaceProxy(Object obj) {
        ((a) Proxy.getInvocationHandler(obj)).a();
    }

    static native Object invoke(long j, Class cls, Method method, Object[] objArr);

    static Object newInterfaceProxy(long j, Class[] clsArr) {
        return Proxy.newProxyInstance(JNIBridge.class.getClassLoader(), clsArr, new a(j));
    }
}
