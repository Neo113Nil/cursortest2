package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f41118a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final a f41119b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    private static a f41120c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f41121a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f41122b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f41123c;

        public a(Method method, Method method2, Method method3) {
            this.f41121a = method;
            this.f41122b = method2;
            this.f41123c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f41120c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f41119b;
            f41120c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        a aVar = f41120c;
        if (aVar == null) {
            aVar = a(continuation);
        }
        if (aVar == f41119b) {
            return null;
        }
        Method method = aVar.f41121a;
        Object invoke = method != null ? method.invoke(continuation.getClass(), null) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.f41122b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.f41123c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
