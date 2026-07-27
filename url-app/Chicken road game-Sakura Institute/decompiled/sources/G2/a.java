package G2;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class a {

    @Metadata
    /* renamed from: G2.a$a, reason: collision with other inner class name */
    public static final class C0000a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0000a f3167a = new C0000a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f3168b;

        static {
            Method method;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.c(methods);
            int length = methods.length;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    break;
                }
                Method method2 = methods[i2];
                if (Intrinsics.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    Intrinsics.checkNotNullParameter(parameterTypes, "<this>");
                    if (Intrinsics.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        method = method2;
                        break;
                    }
                }
                i2++;
            }
            f3168b = method;
            int length2 = methods.length;
            for (int i4 = 0; i4 < length2 && !Intrinsics.a(methods[i4].getName(), "getSuppressed"); i4++) {
            }
        }
    }

    public void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = C0000a.f3168b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }
}
