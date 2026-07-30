package l6;

import java.lang.reflect.Method;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f6097a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        k.c(methods);
        int length = methods.length;
        int i7 = 0;
        while (true) {
            method = null;
            if (i7 >= length) {
                break;
            }
            Method method2 = methods[i7];
            if (k.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                k.e(parameterTypes, "getParameterTypes(...)");
                if (k.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i7++;
        }
        f6097a = method;
        int length2 = methods.length;
        for (int i8 = 0; i8 < length2 && !k.a(methods[i8].getName(), "getSuppressed"); i8++) {
        }
    }
}
