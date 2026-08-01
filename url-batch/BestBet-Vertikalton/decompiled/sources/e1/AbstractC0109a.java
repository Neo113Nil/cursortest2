package e1;

import java.lang.reflect.Method;
import k1.e;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0109a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f2513a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        e.b(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (e.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                e.d(parameterTypes, "getParameterTypes(...)");
                if (e.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f2513a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !e.a(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
