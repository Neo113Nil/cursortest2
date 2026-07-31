package s5;

import java.lang.reflect.Method;
import kotlin.jvm.internal.i;

/* renamed from: s5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0633a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f5881a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        i.b(methods);
        int length = methods.length;
        int i7 = 0;
        while (true) {
            method = null;
            if (i7 >= length) {
                break;
            }
            Method method2 = methods[i7];
            if (i.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                i.d(parameterTypes, "getParameterTypes(...)");
                if (i.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i7++;
        }
        f5881a = method;
        int length2 = methods.length;
        for (int i8 = 0; i8 < length2 && !i.a(methods[i8].getName(), "getSuppressed"); i8++) {
        }
    }
}
