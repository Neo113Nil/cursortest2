package Z1;

import f2.j;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f4713a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        j.c(methods);
        int length = methods.length;
        int i3 = 0;
        while (true) {
            method = null;
            if (i3 >= length) {
                break;
            }
            Method method2 = methods[i3];
            if (j.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                j.e(parameterTypes, "getParameterTypes(...)");
                if (j.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i3++;
        }
        f4713a = method;
        int length2 = methods.length;
        for (int i4 = 0; i4 < length2 && !j.a(methods[i4].getName(), "getSuppressed"); i4++) {
        }
    }
}
