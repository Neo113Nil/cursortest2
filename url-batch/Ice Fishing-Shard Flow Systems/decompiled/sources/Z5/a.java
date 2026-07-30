package Z5;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3027a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Method f3028b;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        Intrinsics.b(methods);
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
        f3028b = method;
        int length2 = methods.length;
        for (int i5 = 0; i5 < length2 && !Intrinsics.a(methods[i5].getName(), "getSuppressed"); i5++) {
        }
    }
}
