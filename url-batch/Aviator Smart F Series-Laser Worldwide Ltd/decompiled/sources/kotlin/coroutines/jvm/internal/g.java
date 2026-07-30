package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
final class g {
    private static a cache;
    public static final g INSTANCE = new g();
    private static final a notOnJava9 = new a(null, null, null);

    private static final class a {
        public final Method getDescriptorMethod;
        public final Method getModuleMethod;
        public final Method nameMethod;

        public a(Method method, Method method2, Method method3) {
            this.getModuleMethod = method;
            this.getDescriptorMethod = method2;
            this.nameMethod = method3;
        }
    }

    private g() {
    }

    private final a buildCache(BaseContinuationImpl baseContinuationImpl) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            cache = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = notOnJava9;
            cache = aVar2;
            return aVar2;
        }
    }

    public final String getModuleName(BaseContinuationImpl continuation) {
        s.checkNotNullParameter(continuation, "continuation");
        a aVar = cache;
        if (aVar == null) {
            aVar = buildCache(continuation);
        }
        if (aVar == notOnJava9) {
            return null;
        }
        Method method = aVar.getModuleMethod;
        Object invoke = method != null ? method.invoke(continuation.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.getDescriptorMethod;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.nameMethod;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
