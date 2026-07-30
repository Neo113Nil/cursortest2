package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.c;
import retrofit2.i;

/* loaded from: classes5.dex */
class r {
    private static final r PLATFORM = findPlatform();
    private final boolean hasJava8Types;

    @Nullable
    private final Constructor<MethodHandles.Lookup> lookupConstructor;

    static final class a extends r {

        /* renamed from: retrofit2.r$a$a, reason: collision with other inner class name */
        static final class ExecutorC0407a implements Executor {
            private final Handler handler = new Handler(Looper.getMainLooper());

            ExecutorC0407a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.handler.post(runnable);
            }
        }

        a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // retrofit2.r
        public Executor defaultCallbackExecutor() {
            return new ExecutorC0407a();
        }

        @Override // retrofit2.r
        @Nullable
        Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.invokeDefaultMethod(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    r(boolean z7) {
        this.hasJava8Types = z7;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z7) {
            try {
                constructor = q.d.a().getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.lookupConstructor = constructor;
    }

    private static r findPlatform() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new r(true);
    }

    static r get() {
        return PLATFORM;
    }

    List<? extends c.a> defaultCallAdapterFactories(@Nullable Executor executor) {
        j jVar = new j(executor);
        return this.hasJava8Types ? Arrays.asList(h.INSTANCE, jVar) : Collections.singletonList(jVar);
    }

    int defaultCallAdapterFactoriesSize() {
        return this.hasJava8Types ? 2 : 1;
    }

    @Nullable
    Executor defaultCallbackExecutor() {
        return null;
    }

    List<? extends i.a> defaultConverterFactories() {
        return this.hasJava8Types ? Collections.singletonList(p.INSTANCE) : Collections.emptyList();
    }

    int defaultConverterFactoriesSize() {
        return this.hasJava8Types ? 1 : 0;
    }

    @Nullable
    @IgnoreJRERequirement
    Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, Object... objArr) {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor<MethodHandles.Lookup> constructor = this.lookupConstructor;
        unreflectSpecial = (constructor != null ? q.f.a(constructor.newInstance(cls, -1)) : MethodHandles.lookup()).unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }

    @IgnoreJRERequirement
    boolean isDefaultMethod(Method method) {
        boolean isDefault;
        if (this.hasJava8Types) {
            isDefault = method.isDefault();
            if (isDefault) {
                return true;
            }
        }
        return false;
    }
}
