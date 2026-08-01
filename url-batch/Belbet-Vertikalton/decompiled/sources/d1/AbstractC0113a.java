package d1;

import j1.h;
import java.lang.reflect.Method;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0113a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f2651a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        h.b(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (h.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                h.d(parameterTypes, "getParameterTypes(...)");
                if (h.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f2651a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !h.a(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
