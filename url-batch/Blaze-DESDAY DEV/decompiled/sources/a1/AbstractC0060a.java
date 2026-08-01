package a1;

import g1.d;
import java.lang.reflect.Method;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0060a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f1255a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        d.b(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (d.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                d.d(parameterTypes, "getParameterTypes(...)");
                if (d.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f1255a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !d.a(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
