package d;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import d.c;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Platform.java */
/* loaded from: classes2.dex */
class k {

    /* renamed from: a, reason: collision with root package name */
    private static final k f9599a = c();

    boolean a(Method method) {
        return false;
    }

    Executor b() {
        return null;
    }

    k() {
    }

    static k a() {
        return f9599a;
    }

    private static k c() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new b();
        } catch (ClassNotFoundException unused2) {
            return new k();
        }
    }

    c.a a(Executor executor) {
        if (executor != null) {
            return new g(executor);
        }
        return f.f9548a;
    }

    Object a(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        throw new UnsupportedOperationException();
    }

    /* compiled from: Platform.java */
    @IgnoreJRERequirement
    static class b extends k {
        b() {
        }

        @Override // d.k
        boolean a(Method method) {
            return method.isDefault();
        }

        @Override // d.k
        Object a(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }
    }

    /* compiled from: Platform.java */
    static class a extends k {
        a() {
        }

        @Override // d.k
        public Executor b() {
            return new ExecutorC0419a();
        }

        @Override // d.k
        c.a a(Executor executor) {
            return new g(executor);
        }

        /* compiled from: Platform.java */
        /* renamed from: d.k$a$a, reason: collision with other inner class name */
        static class ExecutorC0419a implements Executor {

            /* renamed from: a, reason: collision with root package name */
            private final Handler f9600a = new Handler(Looper.getMainLooper());

            ExecutorC0419a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f9600a.post(runnable);
            }
        }
    }
}
